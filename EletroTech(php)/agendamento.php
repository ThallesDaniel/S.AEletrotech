<?php 

        $plano = $_POST["plano"];
        $valor = $_POST["valor"];
        $pagar = $_POST["pagar"];
        
        If($plano == "" && $valor == "") {
            print "<script> alert('Antes de fazer o seu agendamento você deve realizar o pagamento!'); </script>";
            print "<script> location.href='pagamento.php'; </script>";

        }

        print "<script> resultado = confirm('Deseja confirmar o pagamento? ');
                if(resultado == true) {

                } else {
                    location.href='pagamento.php';
                }

        
            </script>";



?>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Agendamento </title>
    <link rel="stylesheet" href="estilo2.css">
</head>
<body>
    <div>
        

        <form method="POST" action="salvar.php">
        <input type="hidden" name="acao" value="cadastrar2">
        <input type="hidden" name="plano" value="<?php print $plano ?>">
        <input type="hidden" name="valor" value="<?php print $valor ?>">
        <input type="hidden" name="pagar" value="<?php print $pagar ?>">

        <div class="input-group mb-3, mamaques">
            <ul>
                <li> <h1> AGENDANDO..!</h1> </li>
                <li><br/></li>
                <li><br/></li>
                <li><br/></li>
                <li><br/></li>
                <li><br/></li>
                <li><br/></li>
            <li>
                <select name="tipo_visita" class="tipoVisita">
                <option value="avaliacao"> Avaliação </option>
                <option value="manutencao"> Manutenção </option>
                <option value="conserto"> Conserto </option>
            </select> </li>
            <li><br/></li>
            <li><br/></li>
            <li>
                 <input type="date" class="form-control" name="data" id="data" aria-label="Username"
              aria-describedby="basic-addon1" class="data" required> </li>

              <li><br/></li>
              <li><br/></li>    
              
              <li><input type="time" class="form-control" name="hora" id="hora" aria-label="Username"
              aria-describedby="basic-addon1" required>

              <button type="submit" class="btn btn-success">AGENDAR</button> </li>
            
            </ul>
             
          </div>

        </form>
    </div>
</body>
</html>