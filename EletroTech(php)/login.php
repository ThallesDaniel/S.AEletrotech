<?php
    session_start();
?>
<!DOCTYPE html>
<html>

<head>
  <meta charset='utf-8'>
  <meta http-equiv='X-UA-Compatible' content='IE=edge'>
  <title>Page Title</title>
  <meta name='viewport' content='width=device-width, initial-scale=1'>
  <link rel='stylesheet' type='text/css' media='screen' href='./estilo.css'>

  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
    integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

</head>

<body class="shit">


    <section class="dois">

      <img src="./img/final do final.gif" alt="" class="mamaco">


<form action="testLogin.php" method="POST">



      <div class="input-group mb-3, mamaques">
        <input type="text" name="email" id="email" class="form-control" placeholder="Digite seu E-mail" aria-label="Recipient's username"
          aria-describedby="basic-addon2">
        <div class="input-group-append">
          <span class="input-group-text" id="basic-addon2">@gmail.com</span>
        </div>
      </div>


      <div class="input-group mb-3, mamaques">
        <input type="password" class="form-control" placeholder="Digite a sua senha" name="senha" id="senha" aria-label="Username"
          aria-describedby="basic-addon1">
        <div class="input-group-prepend" id="imgolho">
          <span class="input-group-text" id="basic-addon1"><svg xmlns="http://www.w3.org/2000/svg" width="16"
              height="16" fill="currentColor" class="bi bi-eye" viewBox="0 0 16 16">
              <path
                d="M16 8s-3-5.5-8-5.5S0 8 0 8s3 5.5 8 5.5S16 8 16 8zM1.173 8a13.133 13.133 0 0 1 1.66-2.043C4.12 4.668 5.88 3.5 8 3.5c2.12 0 3.879 1.168 5.168 2.457A13.133 13.133 0 0 1 14.828 8c-.058.087-.122.183-.195.288-.335.48-.83 1.12-1.465 1.755C11.879 11.332 10.119 12.5 8 12.5c-2.12 0-3.879-1.168-5.168-2.457A13.134 13.134 0 0 1 1.172 8z" />
              <path d="M8 5.5a2.5 2.5 0 1 0 0 5 2.5 2.5 0 0 0 0-5zM4.5 8a3.5 3.5 0 1 1 7 0 3.5 3.5 0 0 1-7 0z" />
            </svg></span>
        </div>
      </div>

      <!-- <input type="text" name="email" placeholder="Nome">
      <input type="password" name="senha" placeholder="Senha">  -->

      

      <div class="form-notch"><div class="form-notch-leading" style="width: 9px;"></div><div class="form-notch-middle" style="width: 64px;"></div><div class="form-notch-trailing"></div></div></div>
                <?php 
                if(isset($_SESSION['msg'])){
				        echo $_SESSION['msg'];
				        unset($_SESSION['msg']);
			            }
                  ?> 
                <div>

      <div>
        <br>
        <p class="mb-0"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;" color="white" size="3.5pt">Não tem uma conta? </font>
        </font><a href="registro.php" class="text-white-50 fw-bold"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;" size="3.5pt">Registrar-se</font></font></a></p>
    </div>

      <input type="submit" name="submit" id="submit" class="btn btn-success treis" value="ENTRAR">

  </form>
  </section>

</body>


</html>