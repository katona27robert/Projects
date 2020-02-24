<!DOCTYPE html>

<body>

  <h3>User advertisements:</h3>

  <table id='t02'>
    <?php
      require_once "./Controllers/advertisements.php";

      $users = new Advertisements;
      $users->getAdvertisements();
    ?>
  </table>

<body>
