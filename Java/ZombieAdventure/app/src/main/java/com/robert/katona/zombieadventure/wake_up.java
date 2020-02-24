package com.robert.katona.zombieadventure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import android.widget.ImageView;

import static com.robert.katona.zombieadventure.Intro.first_aid;
import static com.robert.katona.zombieadventure.Intro.hammer;

public class wake_up extends AppCompatActivity {

    TextView text_1;
    Button choice_1;
    Button choice_2;

    ImageView bloody_ind, hammer_ind, soldiers_ind;

    int level_1, level_2, level_3, level_4, level_5, level_6;
    boolean isLoaded, atdob;
    boolean hammer = false;
    boolean bloody = false;
    boolean soldiers = false;

    public void Choice(boolean isUpperButton)
    {
        //gomblenyomas ellenorzese
        if (level_1 == 0)
        {
            if (isUpperButton) level_1 = 1;
            else level_1 = 2;
        }
        switch (level_1)
        {
            case 1:
                if (!isLoaded)
                {
                    isLoaded = true;

                    hammer = true;

                    text_1.setText(R.string.text_2);
                    choice_1.setText(R.string.choice_1_1);
                    choice_2.setText(R.string.choice_1_2);
                }
                else
                {
                    if (level_2 == 0)
                    {
                        isLoaded = false;
                        if (isUpperButton) level_2 = 11;
                        else level_2 = 12;
                    }
                    switch (level_2)
                    {
                        case 11:
                            if (!isLoaded)
                            {
                                isLoaded = true;

                                text_1.setText(R.string.text_3);
                                choice_1.setText(R.string.choice_1_1_1);
                                choice_2.setText(R.string.choice_1_1_2);
                            }
                            else
                            {
                                if (level_3 == 0)
                                {
                                    isLoaded = false;
                                    if (isUpperButton) level_3 = 111;
                                    else level_3 = 112;
                                }
                                switch (level_3)
                                {
                                    case 111:
                                        if (!isLoaded)
                                        {
                                            isLoaded = true;

                                            bloody = true;
                                            hammer = false;

                                            text_1.setText(R.string.text_4);
                                            String elso = text_1.getText().toString();

                                            text_1.setText(R.string.text_5);
                                            String masodik = text_1.getText().toString();

                                            text_1.setText(new StringBuilder().append(elso).append("\n\n").append(masodik).toString());

                                            choice_1.setText(R.string.choice_2_1);
                                            choice_2.setText(R.string.choice_2_2);


                                            level_1 = 2;
                                            level_2 = 0;
                                            level_3 = 0;
                                        }
                                        break;

                                    case 112:
                                        if (!isLoaded)
                                        {
                                            isLoaded = true;

                                            text_1.setText(R.string.ending_0);
                                            choice_1.setVisibility(View.GONE);
                                            choice_2.setVisibility(View.GONE);
                                        }
                                        break;
                                }
                            }
                            break;

                        case 12:
                            if (!isLoaded)
                            {
                                level_1 = 2;
                                level_2 = 0;
                                level_3 = 0;
                                Choice(true);
                            }
                            break;
                    }
                }
                break;

            case 2:
                if (!isLoaded)
                {
                    isLoaded = true;

                    text_1.setText(R.string.text_5);
                    choice_1.setText(R.string.choice_2_1);
                    choice_2.setText(R.string.choice_2_2);
                }
                else
                {
                    if (level_2 == 0)
                    {
                        isLoaded = false; //szovegatiras engedelyezese
                        if (isUpperButton) level_2 = 21;
                        else level_2 = 22;
                    }
                    switch (level_2)
                    {
                        case 21:
                            if (!isLoaded)
                            {
                                isLoaded = true;

                                text_1.setText(R.string.text_11);
                                String elso = text_1.getText().toString();

                                if (!soldiers) {text_1.setText(R.string.text_11_b);}
                                String masodik = text_1.getText().toString();

                                text_1.setText(new StringBuilder().append(elso).append("\n\n").append(masodik).toString());

                                choice_1.setText(R.string.choice_2_1_1);
                                choice_2.setText(R.string.choice_2_1_2);
                            }
                            else
                            {
                                if (level_3 == 0)
                                {
                                    isLoaded = false;
                                    if (isUpperButton) level_3 = 211;
                                    else level_3 = 212;
                                }
                            }
                            switch (level_3)
                            {
                                case 211: // HIDE AND CHECK FOR SOLDIERS
                                    if (soldiers) // SOLDIERS ACCOMPANY THE PLAYER
                                    {
                                        if (!isLoaded)
                                        {
                                            isLoaded = true;

                                            text_1.setText(R.string.ending_3); // DEAD
                                            choice_1.setVisibility(View.GONE);
                                            choice_2.setVisibility(View.GONE);
                                        }
                                        break;
                                    }
                                    if (!soldiers) //NO SOLDIERS ACCOMPANY THE PLAYER
                                    {
                                        if (!isLoaded)
                                        {
                                            isLoaded = true;

                                            text_1.setText(R.string.text_12);
                                            choice_1.setText(R.string.choice_2_1_1_1);
                                            choice_2.setText(R.string.choice_2_1_1_2);
                                        }
                                        else
                                            {
                                                if (level_4 == 0)
                                                {
                                                    isLoaded = false;
                                                    if (isUpperButton) level_4 = 2111;
                                                    else level_4 = 2112;
                                                }
                                                switch (level_4)
                                                {
                                                    case 2111:
                                                        if (hammer)
                                                        {
                                                            if (!isLoaded)
                                                            {
                                                                isLoaded = true;

                                                                hammer = false;
                                                                bloody = true;
                                                                atdob = true;

                                                                text_1.setText(R.string.text_12_a);
                                                                String elso = text_1.getText().toString();

                                                                text_1.setText(R.string.text_13);
                                                                String masodik = text_1.getText().toString();

                                                                text_1.setText(new StringBuilder().append(elso).append("\n\n").append(masodik).toString());

                                                                choice_1.setText(R.string.choice_2_1_2_1);
                                                                choice_2.setText(R.string.choice_2_1_2_2);

                                                                level_1 = 2;
                                                                level_2 = 21;
                                                                level_3 = 212;
                                                                level_4 = 0;

                                                                //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
                                                            }break;
                                                        }
                                                        if (!hammer)
                                                        {
                                                            if (!isLoaded)
                                                            {
                                                                isLoaded = true;

                                                                text_1.setText(R.string.ending_5_1); // DEAD
                                                                choice_1.setVisibility(View.GONE);
                                                                choice_2.setVisibility(View.GONE);
                                                            }
                                                        }break;

                                                    case 2112:
                                                        if (!isLoaded)
                                                        {
                                                            isLoaded = true;

                                                            text_1.setText(R.string.ending_5_2); // DEAD
                                                            choice_1.setVisibility(View.GONE);
                                                            choice_2.setVisibility(View.GONE);
                                                        }break;
                                                }
                                            }
                                    }

                                case 212: // RUN AND CHECK FOR SOLDIERS
                                    if (soldiers)
                                    {
                                        if (!isLoaded)
                                        {
                                            isLoaded = true;

                                            soldiers = false;
                                            text_1.setText(R.string.text_12_b);
                                            String elso = text_1.getText().toString();

                                            text_1.setText(R.string.text_13);
                                            String masodik = text_1.getText().toString();

                                            text_1.setText(new StringBuilder().append(elso).append("\n\n").append(masodik).toString());

                                            choice_1.setText(R.string.choice_2_1_2_1);
                                            choice_2.setText(R.string.choice_2_1_2_2);

                                            atdob = true;

                                        }
                                    }

                                    else if (!soldiers)
                                    {
                                        if (!isLoaded)
                                        {
                                            isLoaded = true;

                                            text_1.setText(R.string.ending_4);
                                            choice_1.setVisibility(View.GONE);
                                            choice_2.setVisibility(View.GONE);
                                        }

                                        else if (atdob)
                                        {
                                            if (!isLoaded)
                                            {
                                                if (level_4 == 0)
                                                {
                                                    isLoaded = false;
                                                    if (isUpperButton) level_4 = 2121;
                                                    else level_4 = 2122;
                                                }
                                                switch (level_4) //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
                                                {
                                                    case 2121:
                                                        text_1.setText("helicopter_text");
                                                        break;
                                                    case 2122:
                                                        text_1.setText("cabin_text");
                                                        break;
                                                }
                                            }
                                        }
                                        break;
                                    }

                                    break;
                            }break;
                        case 22:
                            //szovegbetoltes ellenorzese
                            if (!isLoaded)
                            {
                                isLoaded = true;

                                text_1.setText(R.string.text_6);
                                choice_1.setText(R.string.choice_2_2_1);
                                choice_2.setText(R.string.choice_2_2_2);
                            }
                            //ha be van toltve a szoveg, akkor folytatodik az else aggal
                            else
                             {
                                 if (level_3 == 0)
                                 {
                                     isLoaded = false;
                                     if (isUpperButton) level_3 = 221;
                                     else level_3 = 222;
                                 }
                             }
                             switch (level_3)
                             {
                                 case 221:
                                     if (bloody)
                                     {
                                         text_1.setText(R.string.ending_1);

                                         choice_1.setVisibility(View.GONE);
                                         choice_2.setVisibility(View.GONE);
                                     }
                                     if (!bloody)
                                     {
                                         if (!isLoaded)
                                         {
                                             isLoaded = true;

                                             text_1.setText(R.string.text_7);

                                             choice_1.setText(R.string.choice_2_2_1_1);
                                             choice_2.setText(R.string.choice_2_2_1_2);
                                         }
                                         else
                                          {
                                              if (level_4 == 0)
                                              {
                                                  isLoaded = false;
                                                  if (isUpperButton) level_4 = 2211;
                                                  else level_4 = 2212;
                                              }
                                              switch (level_4)
                                              {
                                                  case 2211:
                                                      if (!isLoaded)
                                                      {
                                                          isLoaded = true;

                                                          text_1.setText(R.string.ending_2);
                                                          choice_1.setVisibility(View.GONE);
                                                          choice_2.setVisibility(View.GONE);
                                                      }
                                                      break;

                                                  case 2212:
                                                      if (!isLoaded)
                                                      {
                                                          isLoaded = true;

                                                          soldiers = true;

                                                          text_1.setText(R.string.text_10);
                                                          String elso = text_1.getText().toString();

                                                          text_1.setText(R.string.text_11);
                                                          String masodik = text_1.getText().toString();

                                                          text_1.setText(R.string.text_11_a);
                                                          String harmadik = text_1.getText().toString();

                                                          text_1.setText(new StringBuilder().append(elso).append("\n\n").append(masodik).append("\n\n").append(harmadik).toString());

                                                          choice_1.setText(R.string.choice_2_1_1);
                                                          choice_2.setText(R.string.choice_2_1_2);


                                                          level_1 = 2;
                                                          level_2 = 21;
                                                          level_3 = 0;
                                                          level_4 = 0;
                                                      }
                                                   break;
                                              }
                                          }
                                     }
                                     break;
                                 case 222:
                                     if (!isLoaded)
                                     {
                                         isLoaded = true;

                                         text_1.setText(R.string.text_8);
                                         choice_1.setText(R.string.choice_2_2_2_1);
                                         choice_2.setText(R.string.choice_2_2_2_2);
                                     }
                                     else
                                      {
                                          if (level_4 == 0)
                                          {
                                              isLoaded = false;
                                              if (isUpperButton) level_4 = 2221;
                                              else level_4 = 2222;
                                          }
                                          switch (level_4)
                                          {
                                              case 2221:
                                                  if (!isLoaded)
                                                  {
                                                      isLoaded = true;

                                                      text_1.setText(R.string.text_11);
                                                      String elso = text_1.getText().toString();

                                                      text_1.setText(R.string.text_11_b);
                                                      String masodik = text_1.getText().toString();

                                                      text_1.setText(new StringBuilder().append(elso).append("\n\n").append(masodik).toString());

                                                      choice_1.setText(R.string.choice_2_1_1);
                                                      choice_2.setText(R.string.choice_2_1_2);


                                                      level_1 = 2;
                                                      level_2 = 21;
                                                      level_3 = 0;
                                                      level_4 = 0;
                                                  }
                                                  break;

                                              case 2222:
                                                if (bloody)
                                                {
                                                    isLoaded = true;

                                                    text_1.setText(R.string.text_9);
                                                    String elso = text_1.getText().toString();

                                                    text_1.setText(R.string.text_9_a);
                                                    String masodik = text_1.getText().toString();

                                                    text_1.setText(new StringBuilder().append(elso).append("\n\n").append(masodik).toString());

                                                        choice_1.setVisibility(View.GONE);
                                                        choice_2.setVisibility(View.GONE);
                                                }

                                                if (!bloody)
                                                {
                                                    if (!isLoaded)
                                                    {
                                                        isLoaded = true;

                                                        text_1.setText(R.string.text_9);
                                                        String elso = text_1.getText().toString();

                                                        text_1.setText(R.string.text_9_b);
                                                        String masodik = text_1.getText().toString();

                                                        text_1.setText(new StringBuilder().append(elso).append("\n\n").append(masodik).toString());

                                                        choice_1.setText(R.string.choice_2_2_1_1);
                                                        choice_2.setText(R.string.choice_2_2_1_2);
                                                    }
                                                    else
                                                    {
                                                      if (level_5 == 0)
                                                       {
                                                         isLoaded = false;
                                                         if (isUpperButton) level_5 = 22221;
                                                         else level_5 = 22222;
                                                       }
                                                       switch (level_5)
                                                       {
                                                           case 22221:
                                                               if (!isLoaded)
                                                               {
                                                                   isLoaded = true;

                                                                   text_1.setText(R.string.ending_2);
                                                                   choice_1.setVisibility(View.GONE);
                                                                   choice_2.setVisibility(View.GONE);
                                                               }
                                                               break;

                                                           case 22222:
                                                               if (!isLoaded)
                                                               {
                                                                   isLoaded = true;

                                                                   soldiers = true;

                                                                   text_1.setText(R.string.text_10);
                                                                   String elso = text_1.getText().toString();

                                                                   text_1.setText(R.string.text_11);
                                                                   String masodik = text_1.getText().toString();

                                                                   text_1.setText(R.string.text_11_a);
                                                                   String harmadik = text_1.getText().toString();

                                                                   text_1.setText(new StringBuilder().append(elso).append("\n\n").append(masodik).append("\n\n").append(harmadik).toString());

                                                                   choice_1.setText(R.string.choice_2_1_1);
                                                                   choice_2.setText(R.string.choice_2_1_2);


                                                                   level_1 = 2;
                                                                   level_2 = 21;
                                                                   level_3 = 0;
                                                                   level_4 = 0;
                                                                   level_5 = 0;
                                                               }
                                                               break;
                                                       }
                                                    }
                                                }
                                               break;
                                          }
                                      }
                                     break;
                             }
                            break;
                    }
                }

                break;
        }
        if (bloody) bloody_ind.setVisibility(View.VISIBLE);
        else if (!bloody) bloody_ind.setVisibility(View.INVISIBLE);
        if (hammer) hammer_ind.setVisibility(View.VISIBLE);
        else if (!hammer) hammer_ind.setVisibility(View.INVISIBLE);
        if (soldiers) soldiers_ind.setVisibility(View.VISIBLE);
        else if (!soldiers) soldiers_ind.setVisibility(View.INVISIBLE);
    }

    private void hideSystemUI() {
        // Enables regular immersive mode.
        // For "lean back" mode, remove SYSTEM_UI_FLAG_IMMERSIVE.
        // Or for "sticky immersive," replace it with SYSTEM_UI_FLAG_IMMERSIVE_STICKY
        View decorView = getWindow().getDecorView();
        decorView.setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_IMMERSIVE
                        // Set the content to appear under the system bars so that the
                        // content doesn't resize when the system bars hide and show.
                        | View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        // Hide the nav bar and status bar
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_FULLSCREEN);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        // hideSystemUI();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wake_up);

        isLoaded = false;

        //text_1 = findViewById(R.id.text_1);
        text_1 = findViewById(R.id.text_1);
        text_1.setMovementMethod(new ScrollingMovementMethod());


        bloody_ind = (ImageView) findViewById(R.id.bloody_ind);
        hammer_ind = (ImageView) findViewById(R.id.hammer_ind);
        soldiers_ind = (ImageView) findViewById(R.id.soldiers_ind);

        bloody_ind.setVisibility(View.INVISIBLE);
        hammer_ind.setVisibility(View.INVISIBLE);
        soldiers_ind.setVisibility(View.INVISIBLE);

        atdob = false;

        level_1 = 0;
        level_2 = 0;
        level_3 = 0;
        level_4 = 0;
        level_5 = 0;
        level_6 = 0;

        choice_1 =findViewById(R.id.choice_1);
        choice_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Choice(true);
            }
        });

        choice_2 = findViewById(R.id.choice_2);
        choice_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Choice(false);
            }
        });




    }
}
