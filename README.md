# trabalho-3-poo
O programa é simples e direto pois não contempla todas as funções propostas na descrição do trabalho. Ao rodar o programa, 
um menu é apresentado com as opções disponíveis. Basta digitar o número referente à opção.
O opensamato por trás do código é que os dados seriam salvos, conforme o padrão requerido, tendo seus campos separados por vígulas. 
Os campos, universais para livros e usuários, seriam os seguintes [0]DISPONIBILIDADE, [1]TIPO, [2]REGISTRO, [3...]NOME; Onde:

[0]DISPONIBILIDADE - Informa se é possível a retirada. Nos usuários é a quantidade de livros que ainda podem ser retirdos
(cujo limite varia de acordo com o tipo de usuário). Já nos livros informa se o livro está disponível ou se foi retirado (0 se estiver retirado e 1 se disponível).

[1]TIPO – Informa o subtipo de usuário ou livro. Para os usuários são: 0 se for um aluno, 1 se for um professor ou 3 se for um membro da comunidade. 
Para os livros são 0 se for um livro texto ou 1 se for um livro geral. Esse campo seria usado, por exemplo, pra determinar se um empréstimo era válido ou não.

[2]REGISTRO – Informa um cádigo único de cada item para ser utilizado nas buscas.

[3...]NOME – Informa o nome do livro ou usuário. Se o nome for composto por mais de uma palavra existirão campos seguintes com a continuação do nome.

A intenção foi de, ao abrir o arquivo, trasformas as suas linhas (cada uma com os campos de um livro ou usuário) em Strings
onde os dados necessários seriam trabalhados e reescritos no arquivo no fim das tarefas. Para ler e alterar os 
campos individualmente seria utilizado o comando: 

String[] vetor = linha.split(“,”);

Onde “vetor” é um novo array de strings onde cada espaço é uma string com os caracteres separados por uma vígula de uma outra string “linha”.
Dessa forma, seria possível editar campos específicos de linhas especícicas do arquivo e depois regravar todas as linhas do arquivo com as atualizações realizadas.
A partir de então seria implementadas as funções de salvar datas e cálcular atrasos através das classes fornecidas pelo Java para lidar com datas.
Porém, pelo curto período de tempo e por causa de outras atividades, a lógica não foi devidamente implementada por completo.
