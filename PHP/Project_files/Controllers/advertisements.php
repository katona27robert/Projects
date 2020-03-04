<?php
class Advertisements extends Database{
  public function getAdvertisements()
  {
    //passing the query to the database
    $sql = "SELECT * FROM advertisements JOIN users ON advertisements.userid = users.id ORDER BY name";
    $database = new Database();
    $stmt = $database->connect()->query($sql);

    //displaying the records acquired from the database while avoiding duplicate names
    $name = "";
    while($row = $stmt->fetch())
      {
        $newName = $row['name'];

        echo '<tr>';
        if($name == $newName) echo '<td> </td>';
        else { echo '<td>'.$row['name'].'</td>'; $name = $newName; }
        echo '<td>'.$row['title'].'</td>';
        echo'</tr>';
      }
  }
}
?>
