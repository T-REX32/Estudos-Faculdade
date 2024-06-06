function exibirImagem(src) {
    var imagemPrincipal = document.querySelector('.imagem-chinelo img');
    imagemPrincipal.src = src;
}

var imagensPequenas = document.querySelectorAll('.opcoes img');
imagensPequenas.forEach(function(imagemPequena) {
    imagemPequena.addEventListener('click', function() {
        var src = this.src;
        exibirImagem(src);
    });
});