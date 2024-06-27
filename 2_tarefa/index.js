import chalk from "chalk";
import inquirer from "inquirer";

inquirer.prompt([
    { name: "p1", message: "Qual o seu nome?" },
    { name: "p2", message: "Qual a sua idade?" }
])
.then((answers) => {
    console.log(answers);
    const dados = answers;
    console.log(chalk.bgYellow.black(`O nome dele é: ${dados.p1} e a idade dele é: ${dados.p2}`));
})
.catch((err) => console.log(chalk.red(err)));
