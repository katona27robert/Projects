<?php
class Router
{
    public static $validRoutes = array();

    //function used to verify the text from the url bar
    public static function set($route, $function)
    {
      self::$validRoutes[] = $route;

      if($_GET['url'] == $route)
        $function->__invoke();
    }
}
 ?>
