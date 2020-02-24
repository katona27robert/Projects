<?php
class Database
{
  //using phpMyAdmin with the default login information
  private $host = "localhost";
  private $username = "root";
  private $pwd = "";
  private $dbName = "php";

  protected function connect()
  {
    $dsn = 'mysql:host='.$this->host.';dbname='.$this->dbName;
    $pdo = new PDO($dsn, $this->username, $this->pwd);
    $pdo->setAttribute(PDO::ATTR_DEFAULT_FETCH_MODE, PDO::FETCH_ASSOC);
    return $pdo;
  }
}
