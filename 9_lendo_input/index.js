const readline = require("readline").createInterface({
    input: process.stdin,
    output: process.stdout,
})

readline.question("Qual a sua linguagem preferida?", (language) => {
    if(language == "Python") {
        console.log("Boa linguagem!")
        readline.close()
    } else{
        console.log(`A minha linguagem preferida é: ${language}`)
        readline.close()
    }
})