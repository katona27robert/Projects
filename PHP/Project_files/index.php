<!DOCTYPE html>
<html>

<head>
  <style>
    h1            { width: 50%; background-color: black; color: white; text-align: center; margin: 0px; padding-top: 25px; padding-bottom: 25px; }
    h3            { width: 50%; text-align: center; margin: 0px; padding-top: 10px; padding-bottom: 10px; }
    a             { font-size: 20px; text-decoration: none; text-transform: uppercase; letter-spacing: 1px; }
    table#t01     { border: 1px solid black; width: 50%; margin: 0px; padding: 10px; }
    table#t02     { color: black; width: 50%; margin: 0px; padding: 10px; }
    td            { width: 33%; text-align: center; padding: 20px;}
    tr:nth-child(even) { background-color: #dddddd; }
  </style>
</head>

<body>

  <h1>PHP Test</h1>

  <table id='t01'>
    <tr>
       <?php
         //creates clickable menu points and assigns them to their corresponding hyperlink
         $links = array("Home", "Users", "Advertisements");
         foreach($links as $link)
            echo '<td> <a href="' . strtolower($link) . '">' . $link . '</a></td>';
       ?>
     </tr>
  </table>

  <?php require_once 'Routes.php';?>

</body>

</html>
