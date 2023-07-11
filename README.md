Trabalho 4 – Fábrica de Veículos
Este trabalho equivale ao peso de P2 (ou seja, 3 décimos). Ao longo do componente
curricular tivemos o contato com diferentes estruturas de dados (arranjos, listas, filas, pilhas,
mapas e árvores) e suas aplicações distintas para cada caso. Portanto, este trabalho tem por
objetivo realizar uma série de experiências de medição para determinar o desempenho de
armazenamento de dados e de operações sobre essas estruturas.
1. Objetivo
Desenvolver uma aplicação para manipular veículos armazenados em um Mapa, em
que o número do chassi é usado como chave. O TAD mapa é representado pela interface Map
disponível em https://docs.oracle.com/javase/7/docs/api/java/util/Map.html. Essa interface
deve ser implementada pelo time utilizando três estruturas de dados: Vetor (ordenado), Lista
duplamente encadeada (ordenada) e Árvore Binária. Estas estruturas de dados devem ser
implementadas pela equipe, isto é, não é permitido o uso de classes de estruturasjá existentes
na linguagem Java.
Para cada estrutura de dados deve ser medido o tempo total gasto para cada uma das
seguintes operações (usar o método System.nanoTime() para ser mais preciso):
 Inserir 100.000 (cem mil) veículos;
 Apresentar todos os veículos em ordem crescente de número de chassi;
 Verificar quantos veículos são da marca Ford;
 Remover todos os veículos com número de chassi igual ou inferior à 202050000.
Os veículos devem ser gerados por meio da classe Veiculo.java que está disponível no
Moodle e não pode ser modificada. Essa classe funciona como uma fábrica que gera veículos
aleatórios de diferentes marcas.
2. Apresentação
O time deve elaborar uma apresentação para defender o trabalho contendo,
obrigatoriamente, os seguintes itens:
 Mapas: motivação de empregar mapas e dicionário de dados como uma TAD.
 Lógica e decisões adotadas pelo grupo para o desenvolvimento do trabalho.
 Explicação breve dos algoritmos desenvolvidos.
 Análise dos resultados contendo, pelo menos, quatro gráficos:
o Tempos de inserção nas diferentes estruturas de dados;
o Tempos de impressão de todos os veículos em ordem crescente de número de
chassi;
o Tempo para mostrar o número de veículos da marca Ford;
o Tempos para remover todos os veículos com chassi igual ou inferior à
202050000.
Universidade Federal do Pampa – campus Alegrete
Engenharia de Software
Estruturas de dados
Professores: Fábio Basso e Raquel Pillat
 O grupo terá 15 minutos para apresentação.
3. Organização e entrega
O trabalho deve ser desenvolvido em grupos de 3 integrantes. A indicação dos
integrantes deverá ser realizada via google chat da disciplina até às 22h 30min do dia 28/06.
Entregar os códigos-fonte e a apresentação até às 20h30 do dia 12/07. A entrega deve
ser feita na forma de um arquivo compactado nomeado da seguinte maneira
T4_<nome1>_<nome2>_<nome3>.zip, onde <nome> se refere ao nome de cada um dos
integrantes que desenvolveu o trabalho. Apenas um membro do grupo envia os arquivos.
4. Avaliação
Os critérios de avaliação que serão considerados para a determinação da nota do
trabalho estão na tabela a seguir. Lembrando que somente serão avaliados os trabalhos que
forem apresentados em aula. A ocorrência de plágio implicará na atribuição de nota zero a
todos os membros do grupo envolvido.
Critérios Peso
Estrutura de dados
Vetor ordenado 2
Lista duplamente encadeada ordenada 2
Árvore Binária 2
Aplicação
Inserção dos 100.000 veículos 0,5
Exibição dos veículos em ordem crescente de número de chassi 0,5
Pesquisa pelos veículos da marca Ford 0,5
Remoção dos veículos com chassi igual ou inferior ao número 202050000 0,5
Apresentação 2