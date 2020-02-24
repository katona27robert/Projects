<?php
class Controller
{
  public static function LoadPage($pageName)
  {
      require_once './Views/'       .   $pageName   .   '.php';
      require_once './Controllers/' .   $pageName   .   '.php';
  }
}
?>
