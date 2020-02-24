<?php
class Users extends Database{

  public function getUsers()
  {
    //passing the query to the database
     $sql = "SELECT * FROM users ORDER BY id";
     $database = new Database();
     $stmt = $database->connect()->query($sql);

    //displaying the records acquired from the database
    while($row = $stmt->fetch())
      echo
      '<tr>
          <td>'.$row['id'].".</td>
          <td>".$row['name'].'</td>
      </tr>';
  }
}
?>
