import chalk from "chalk";
import inquirer from "inquirer";

inquirer.prompt([
    {name: "p1", message: "Informe seu nome:"},
    {name: "p2", message: "informe sua idade:"}
])

.then((answers) => {
    const dados = answers

    console.log(chalk.bgYellow.black(`Seu nome é: ${dados.p1} e você tem ${dados.p2} anos de idade!`))
})
.catch((err) => console.log(err))