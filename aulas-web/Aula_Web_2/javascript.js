function validacampos() {
    let elemento1 = document.getElementById("nome")
    let elemento2 = document.getElementById("sobrenome")
    let elemento3 = document.getElementById("email")

    if (elemento1.value.length < 3) {
        elemento1.focus();
        elemento1.style.border = "2px solid red"
        elemento1.style.outline = "0";
    } else {
        elemento1.style.border = "2px solid green"

    } if (elemento2.value.length < 3) {
        elemento2.focus();
        elemento2.style.border = "2px solid red"
        elemento2.style.outline = "0";

    } else {
        elemento2.style.border = "2px solid green"

    } if ((elemento3.value.length < 3) || (elemento3.value.indexOf("@") == -1) || 
        (elemento3.value.indexOf(".com") == -1 )) {
            // esse "== -1" é para dizer que o comando ou valor é falso
        elemento3.focus();
        elemento3.style.border = "2px solid red"
        elemento3.style.outline = "0";
    } else {
        elemento3.style.border = "2px solid green"
    }
}

function mascara(teclado, mascara) {
    var posicao = teclado.value.length;
    var saida = mascara.substring(1,0)
    var texto = mascara.substring(posicao);
    if (texto.substring(0, 1) !== saida) {
        texto.value += texto.substring(0, 1)
    }
}