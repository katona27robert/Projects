import turtle
import time
import random

#jateksebesseg
delay = 0.15

#ablak
wn = turtle.Screen()
wn.title("Python")
wn.bgcolor("white")
wn.setup(width=600, height=600)
wn.tracer(0) #animaciokat torol

#fej
head = turtle.Turtle()
head.speed(0) #animacio sebessege, nem a mozgasi sebesseg
head.shape("square")
head.color("green")
head.penup()
head.goto(0,0)
head.direction = "stop"

#test
segments = []

#pontszamok
score = 0
high_score = 0

#pontszamok kiirasa
pen = turtle.Turtle()
pen.speed(0)
pen.shape("square")
pen.color("black")
pen.penup()
pen.hideturtle()
pen.goto(0, 270)
pen.write("Pontszam: {}  Legmagasabb pontszam: {}".format(score, high_score), align="center", font=("Courier", 15, "bold"))

#metodusok
def move():
    if head.direction == "up":
        y = head.ycor()
        head.sety(y + 23)

    if head.direction == "down":
        y = head.ycor()
        head.sety(y - 23)

    if head.direction == "left":
        x = head.xcor()
        head.setx(x - 23)

    if head.direction == "right":
        x = head.xcor()
        head.setx(x + 23)

def go_up():
    if head.direction != "down":
        head.direction = "up"
def go_down():
    if head.direction != "up":
        head.direction = "down"
def go_left():
    if head.direction != "right":
        head.direction = "left"
def go_right():
    if head.direction != "left":
        head.direction = "right"

#billentyuzet input
wn.listen()
wn.onkeypress(go_up, "w")
wn.onkeypress(go_down, "s")
wn.onkeypress(go_left, "a")
wn.onkeypress(go_right, "d")
wn.onkeypress(go_up, "Up")
wn.onkeypress(go_down, "Down")
wn.onkeypress(go_left, "Left")
wn.onkeypress(go_right, "Right")

#kaja
food = turtle.Turtle()
food.speed(0) #animacio sebessege, nem a mozgasi sebesseg
food.shape("circle")
food.color("red")
food.penup()
food.goto(0,100)

#jatekot mozgato ciklus
while True:
    wn.update()

    #hatarvonalak erintesenek vizsgalata
    if head.xcor() > 290 or head.xcor() < -290 or head.ycor() > 290 or head.ycor() < -290:
        time.sleep(0.5)
        head.goto(0,0)
        head.direction = "stop"
        #testelemek elrejtese
        for segment in segments:
            segment.goto(10000,10000)
        #testelemek eltorlese
        segments.clear()
        score = 0
        pen.clear()
        pen.write("Pontszam: {}  Legmagasabb pontszam: {}".format(score, high_score), align="center", font=("Courier", 15, "bold"))
        #jateksebesseg visszaallitasa
        delay = 0.15

    #fej es kaja erintesenek vizsgalata
    if head.distance(food) < 20:
        #kaja mozgatasa erinteskor
        x = random.randrange(-280, 280, 20)
        y = random.randrange(-280, 280, 20)
        food.goto(x,y)
        #test novelese
        new_segment = turtle.Turtle()
        new_segment.speed(0)
        new_segment.shape("square")
        new_segment.color("green")
        new_segment.penup()
        segments.append(new_segment)
        #pontszam novelese
        score += 10
        if score > high_score:
            high_score = score
        pen.clear()
        pen.write("Pontszam: {}  Legmagasabb pontszam: {}".format(score, high_score), align="center", font=("Courier", 15, "bold"))
        #jatek felgyorsitasa
        delay *= 0.98

    #test vegenek mozgatasa eloszor
    for index in range(len(segments)-1, 0, -1):
        x = segments[index-1].xcor()
        y = segments[index-1].ycor()
        segments[index].goto(x, y)

    #elso test elem mozgatasa a fej helyere
    if len(segments) > 0:
        x = head.xcor()
        y = head.ycor()
        segments[0].goto(x, y)

    #fej mozgatasa
    move()

    #fej es testelemek utkozesenek vizsgalata
    for segment in segments:
        if segment.distance(head) < 20:
            time.sleep(0.5)
            head.goto(0,0)
            head.direction= "stop"
            for segment in segments:
                segment.goto(10000,10000)
            #testelemek eltorlese
            segments.clear()
            #pontszam nullazasa
            score = 0
            pen.clear()
            pen.write("Pontszam: {}  Legmagasabb pontszam: {}".format(score, high_score), align="center", font=("Courier", 15, "bold"))
            #jateksebesseg visszaallitasa
            delay = 0.15

    time.sleep(delay)

wn.mainloop()
