function mostrar_senha() {
    var input = document.getElementById('senhalogin');

    if(input.type == 'text') {
        input.type = 'password';
    } else {
        input.type = 'text';
    }
}