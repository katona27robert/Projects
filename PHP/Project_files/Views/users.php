<!DOCTYPE html>

<body>

  <h3>Registered users:</h3>

  <table id='t02'>
    <?php
      require_once "./Controllers/users.php";

      $users = new Users;
      $users->getUsers();
    ?>
  </table>

<body>
