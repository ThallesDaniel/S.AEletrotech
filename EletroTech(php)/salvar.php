<?php 
    include_once("conexao.php");
    switch ($_REQUEST["acao"]) {
        case 'cadastrar':
            $nome = $_POST["nome"];
            $telefone = $_POST["telefone"];
            $email = $_POST["mail"];
            $cpf = $_POST["cpf"];
            $senha = $_POST["senha"];
            $cep = $_POST["cep"];
            $rua = $_POST["rua"];
            $bairro = $_POST["bairro"];
            $cidade = $_POST["cidade"];
            $estado = $_POST["estado"];

            $sql = "INSERT INTO usuario(nome, telefone, email, cpf, senha, cep, rua, bairro, cidade, estado) VALUES ('{$nome}','{$telefone}','{$email}','{$cpf}','{$senha}','{$cep}','{$rua}','{$bairro}','{$cidade}','{$estado}')";

            $res = $conn->query($sql);

            if($res==true) {
                print "<script> alert('Cadastro efetuado com sucesso'); </script>";
                print "<script> location.href='login.php'; </script>";
            } else {
                print "<script> alert('Não foi possível cadastrar'); </script>";
                print "<script> location.href='index.php'; </script>";
            }

            break;

        case 'cadastrar2':
            $tipo = $_POST["tipo_visita"];
            $data = $_POST["data"];
            $hora = $_POST["hora"]; 
            $plano = $_POST["plano"];
            $valor = $_POST["valor"];
            $pagar = $_POST["pagar"];

            $sql = "INSERT INTO cliente( planos, valor, tipo_visita, data_agen, horario, pago) VALUES ('{$plano}','{$valor}','{$tipo}','{$data}','{$hora}','{$pagar}')";

            $res = $conn->query($sql);

            if($res==true) {
                print "<script> alert('O agendamento foi realizado com sucesso , se necessário entraremos em contato '); </script>";
                print "<script> location.href='logado.php'; </script>";
            } else {
                print "<script> alert('Não foi possível agendar está sem horário disponivel '); </script>";
                print "<script> location.href='agendamento.php'; </script>";
            }
            
        break;
            
    }

?>