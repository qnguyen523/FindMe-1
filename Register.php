
<?php
    $con = mysqli_connect("localhost", "id200594_p123456", "Quoc1234", "id200594_user");
    
    $name = $_POST["name"];
    $username = $_POST["userName"];
    $password = $_POST["password"];
    $email = $_POST["email"];
    $statement = mysqli_prepare($con, "INSERT INTO user (name, username, password, email) VALUES (?, ?, ?, ?)");
    mysqli_stmt_bind_param($statement, "siss", $name, $username, $password, $email);
    mysqli_stmt_execute($statement);
    
    $response = array();
    $response["success"] = true;  
    
    echo json_encode($response);
?>