import chalk from 'chalk';

const nota = 6;

if (nota >= 7) {
    console.log(chalk.green(`Parabéns! Você passou com a nota ${nota}!`));
} else {
    console.log(chalk.bgRed(`Reprovado! Você tirou a nota ${nota}!`));
}
