<?php 
    session_start();
    unset($_SESSION['mail']);
    unset($_SESSION['senha']);
    print "<script> if (confirm('Tem certeza que deseja deslogar?') == true) {
        alert('Deslogado com sucesso');
        location.href='index.php';
      } else {
        location.href='logado.php';
      } </script>";
    

?>