<?php
require_once "./Models/Router.php";
require_once "./Controllers/Controller.php";



//declares all accessible links



Router::set('users', function()
  {
    if(file_exists("./Controllers/users.php"))
    {
      require_once "./Models/Database.php";
      Controller::LoadPage('users');
    }
  });

Router::set('advertisements', function()
  {
    if(file_exists("./Controllers/advertisements.php"))
    {
      require_once "./Models/Database.php";
      Controller::LoadPage('advertisements');
    }
  });


 ?>
