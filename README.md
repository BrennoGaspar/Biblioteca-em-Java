# Sistema de Gerenciamento de Biblioteca em Java

Este é um projeto de nível intermediário em Java, focado na prática dos princípios de **Orientação a Objetos (POO)**, como encapsulamento, herança, polimorfismo e associação de classes. O objetivo é simular as operações básicas de uma biblioteca.

## Funcionalidades

O sistema permite:

-   **Gerenciar Livros**: Adicionar, emprestar e devolver livros ao acervo.
-   **Gerenciar Membros**: Cadastrar novos membros na biblioteca.
-   **Controle de Empréstimos**: Registrar quais livros estão emprestados para cada membro.

## Tecnologias Utilizadas

-   **Linguagem de Programação**: Java
-   **Conceitos de POO**: Encapsulamento, Associação.
-   **Estruturas de Dados**: `ArrayList` (para gerenciar coleções de livros e membros).

## Estrutura do Projeto

O projeto é organizado em classes bem definidas, cada uma com uma responsabilidade clara:

-   `Livro.java`: Representa um livro com atributos como título, autor e status de empréstimo.
-   `Membro.java`: Representa um membro da biblioteca, com uma lista de livros emprestados.
-   `Main.java`: Contém o método `main` para rodar o sistema, interagir com o usuário e demonstrar as funcionalidades. Além de simular todo a funcionalidade da biblioteca.

## Como Executar o Projeto

1.  **Clone este repositório** para a sua máquina local.
    ```bash
    git clone https://github.com/BrennoGaspar/Biblioteca-em-Java.git
    ```
2.  **Abra o projeto** em sua IDE de preferência (IntelliJ IDEA, VS Code, Eclipse, etc.).
3.  **Compile e execute** a classe `Main.java`.

## Exemplo de Uso

Você pode interagir com o sistema através do terminal. O código de exemplo em `Main.java` demonstra como criar um novo livro, um membro e realizar um empréstimo.