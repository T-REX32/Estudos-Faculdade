const fs = require ("fs")

console.log("Início")

fs.writeFileSync("arquivo.txt", "oi") //eu quero que a próxima linha espere a execução dessa aqui. Isso que o
// writeFileSync faz

console.log("Fim")

console.log("Início")

fs.writeFile("arquivo.txt", "oi",function(err) {
	setTimeout(function() {
		console.log("arquivo criado!")
	}, 1000);
});

console.log("Fim")