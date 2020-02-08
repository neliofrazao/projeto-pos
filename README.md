## Exércicio 1

1. Implemente uma classe chamada Valores sendo esta capaz de armazenar
até 10 valores INTEIROS POSITIVOS (v > 0) EM UM ARRAY.
2. A classe Valores deve implementar a interface ValoresITF.
3. Defina uma classe de teste para a classe Valores chamada testValores.
4. Verifique a cobertura dos testes incrementando-os para garantir
cobertura de condição quando for o caso.
5. Execute os testes e verifique os resultados.
```
interface ValoresITF{
boolean ins(int v); // insere um valor
int del(int i); // remove o valor armazenado no índice i e retorna o valor removido
int size(); // retorna quantidade de valores armazenados
}
```
**Obs**:
- O método ins retorna true se o valor consegue ser inserido!
- O método del retorna -1 se a lista está vazia

## Exércicio 2

1. Implemente um script ant denominado build01.xml que consiga executar as
seguintes tarefas de maneira automatizada:
- Compilar códigos .java a partir do diretório /src de seu projeto e gerar os .class
resultantes da compilação em um diretório /bin
Dica: `<javac srcdir="${source.dir}" destdir="${build.dir}" includeantruntime="false">`
- Gerar os Javadocs relativos ao código fonte de seu projeto em um diretório /docs
Dica: `<javadoc sourcepath="${source.dir}" destdir="${doc.dir}">`

## Exercício 3
1. Implemente um novo script ant denominado build02.xml que consiga
executar as mesmas tarefas do Exercício 2 e ainda consiga:
- Empacotar sua aplicação em um arquivo chamado aplicacao.jar e distribuí-la
em um diretório /jar
Dica: `<jar basedir="bin" destfile="jar/aplicacao.jar" />`

## Exercício 4 (DESAFIO!)
1. Implemente um novo script ant denominado build03.xml que consiga
executar as mesmas tarefas do Exercício 3 e ainda consiga:
- Executar testes JUnit 4 sobre o código fonte de seu projeto
- Gerar um relatório do resultado da execução destes testes em um arquivo .xml
na pasta /testreport