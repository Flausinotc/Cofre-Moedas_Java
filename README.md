<h1>Cofrinho de Moedas</h1>

Este projeto consiste em um sistema que emula um "Cofrinho de Moedas" em Java. O objetivo é permitir que o usuário adicione moedas de diferentes valores e países em um cofrinho virtual, remova moedas específicas, liste todas as moedas presentes no cofrinho e calcule o valor total das moedas em Real.

O projeto faz uso dos conceitos de herança e polimorfismo por meio da implementação de classes abstratas e classes filhas específicas para diferentes tipos de moedas.

<h2>Funcionalidades</h2>  
O sistema oferece as seguintes funcionalidades ao usuário:

Adicionar moedas: Permite ao usuário adicionar moedas de diferentes valores e países ao cofrinho.

Remover moedas: Permite ao usuário remover moedas específicas do cofrinho informando o valor da moeda a ser removida.

Listar moedas: Exibe a lista de todas as moedas presentes no cofrinho, mostrando o valor e o país de origem de cada moeda.

Calcular total em Real: Calcula o valor total das moedas presentes no cofrinho, convertendo-as para Real.

Sair: Encerra o programa.

<h2>Como executar</h2>
Certifique-se de ter o Java Development Kit (JDK) instalado em sua máquina.

Baixe o código-fonte do projeto e abra-o em sua IDE de preferência.

Compile e execute o arquivo Principal.java.

Siga as instruções exibidas no console para interagir com o programa e utilizar as funcionalidades do cofrinho de moedas.

<h2>Estrutura do projeto</h2>
O projeto é composto pelas seguintes classes:

Principal.java: Contém o método main e é responsável pela interação com o usuário e pelo menu do programa.

Cofrinho.java: Representa o cofrinho de moedas e implementa as operações de adicionar moeda, remover moeda, listar moedas e calcular o total em Real.

Moeda.java: Classe abstrata que serve como base para as classes específicas de moedas. Possui atributos e métodos comuns a todas as moedas.

Dolar.java, Euro.java, Real.java: Classes que representam moedas específicas, herdando da classe Moeda e implementando métodos específicos de cada moeda, como a conversão para Real.

<h2>Contribuição</h2>
Contribuições são bem-vindas! Caso queira colaborar com melhorias, correções de bugs ou adicionar novas funcionalidades, sinta-se à vontade para abrir uma issue ou enviar um pull request.

<h3>Licença</h3>
Este projeto está licenciado sob a MIT License.


