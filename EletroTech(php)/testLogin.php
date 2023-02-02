<?php
    
/** */
    session_start();
    if(isset($_POST['submit']) && !empty($_POST['email']) && !empty($_POST['senha'])) {

        include_once('conexao.php');
        $email = $_POST['email'];
        $senha = $_POST['senha'];

        // print_r('Email:' .$email);
        // print_r('Senha:' .$senha);

        //$hash = password_hash($senha, PASSWORD_DEFAULT);

        $sql = "SELECT idUsuario, nome, email, senha FROM usuario WHERE email = '$email' and senha = '$senha'";
        
        $result = $conn->query($sql);
       


        // print_r($sql);
        // print_r($result);

        if(mysqli_num_rows($result) < 1) {

            unset($_SESSION['email']);
            unset($_SESSION['senha']);

            $_SESSION['msg'] = "<font color=red> Email e senha incorreto! </font>";
            header('Location: login.php');

            
        }
        else {
            $_SESSION['email'] = $email;
            $_SESSION['senha'] = $senha;
            header('Location: logado.php');
        }


    } else {
        $_SESSION['msg'] = "<font color=red> Email e senha incorreto! </font>";
        header('Location: login.php');
    }



   
?>