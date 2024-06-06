// meche no email
let inputEmail = document.getElementById("email");
console.log(inputEmail);

inputEmail.style.border = "3px solid blue";

// meche na senha
let inputPass = document.getElementById("senha")
inputPass.style.border = "3px solid blue";


// label pra mecher com o email e com a senha juntos
let label = document.getElementsByTagName("label")

for(let index = 0; index < label.length; index++) {
    label[index].style.fontWeight = "bold";

    label[index].style.fontFamily = "Tahoma";

    label[index].ondblclick = function () {
        alert("Você clicou no rótulo.")
    }
}

// Título H1

let titulosH1 = document.getElementsByTagName("h1");
console.log(titulosH1);
titulosH1[0].innerText = "Bem vindo!";


// inserindo um texto escrito "Esqueci minha senha"

let lembrarSenha = document.createElement("a");
lembrarSenha.innerHTML = "Esqueci minha senha";
lembrarSenha.href = "https://ava.sesisenai.org.br/course/view.php?id=20743";