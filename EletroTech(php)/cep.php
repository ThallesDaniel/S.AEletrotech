<?php 
// API Via CEP preencher os campos automaticamente
function getAddress () {

    if ( isset ($_POST['cep'])) {

    $cep = $_POST['cep'];
    

    $cep = filterCep ($cep);

    if (isCep ($cep)) {

       $address = getAddressViaCep($cep);
       // Procurar no banco de dados se o cep existe
       if (property_exists($address, 'erro')) {
            $address = addressEmpty();
            $_SESSION['msg'] = '<font color=red> </br> CEP Não econtrado! </font>';
            
       }

    } else {
        $address = addressEmpty();
        $_SESSION['msg'] = '<font color=red> </br> CEP inválido! </font>';

    }
    
    } else {
        $address = addressEmpty();

    }

        return $address;

    }



// Função para retornar o campo vazio para não ocorrer erro
function addressEmpty () {
    return $address = (object) [
        'cep' => '',
        'logradouro' => '',
        'bairro' => '',
        'localidade' => '',
        'uf' => ''

    ];

}

// Função para filtrar o cep
function filterCep (String $cep):String {
    return preg_replace('/[^0-9]/','',$cep);

}
// Função para verificar se é um cep
function isCep (String $cep):bool {
    return preg_match('/^[0-9]{5}-?[0-9]{3}$/', $cep);

}

// função ir no site e trazer de volta os dados do endereço desse cep

function getAddressViaCep (String $cep) {

    $url = "https://viacep.com.br/ws/{$cep}/json/";

    return $address = json_decode(file_get_contents($url));

}

?>