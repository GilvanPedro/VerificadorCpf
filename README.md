Validação de CPF em Java

## Descrição do Projeto

Este projeto em Java tem como objetivo principal a validação de números de CPF (Cadastro de Pessoa Física).

O sistema implementa o algoritmo oficial para garantir a autenticidade do documento, realizando as seguintes verificações essenciais:

* Verificação de Formato: Garante que o CPF possui a quantidade correta de 11 dígitos.
* Filtro Básico: Descarta CPFs compostos por números repetidos (e.g., 111.111.111-11), que são inválidos por regra.
* Cálculo dos Dígitos Verificadores: Calcula e verifica os dois dígitos finais para confirmar a validade do CPF informado.

---

## Funcionamento

O programa é executado via console e interage com o usuário da seguinte forma:

1. Entrada de Dados: Solicita ao usuário que digite um número de CPF.
2. Limpeza: Remove automaticamente quaisquer caracteres que não sejam números.
3. Validação Inicial: Verifica se o CPF limpo tem 11 dígitos e se não é uma sequência de números repetidos.
4. Cálculo: Realiza o cálculo do 1º e 2º dígitos verificadores.
5. Resultado: Exibe na tela se o CPF é Válido ou Inválido, mostrando também os dígitos verificadores calculados.

### Exemplo de Execução

Digite o CPF: 12345678909

CPF válido!

1º dígito verificador: 0
2º dígito verificador: 9

---

## Lógica de Validação

O algoritmo segue rigorosamente o padrão de cálculo de dígitos verificadores do CPF:

1. Cálculo do 1º Dígito:
    * Os primeiros 9 números do CPF são multiplicados por pesos decrescentes, de 10 a 2.
    * O resultado da soma dessas multiplicações é dividido por 11.
    * O resto dessa divisão é subtraído de 11 para determinar o primeiro dígito verificador.
2. Cálculo do 2º Dígito:
    * O processo se repete, mas desta vez, os primeiros 10 números (incluindo o 1º dígito verificador) são multiplicados por pesos decrescentes, de 11 a 2.
    * O resultado da soma é dividido por 11, e o resto é subtraído de 11 para determinar o segundo dígito.

## Como Executar

### Pré-requisitos

* Java Development Kit (JDK): Versão 17 ou superior.
* Maven: (Opcional) Para gerenciamento de dependências e build.

### Execução via Terminal/CLI

1. Compile os arquivos:
    javac src/main/java/br/com/*.java

2. Execute o programa:
    java -cp src/main/java br.com.Main

### Execução em IDEs (IntelliJ ou NetBeans)

1. Importe o projeto como um projeto Maven (utilizando o arquivo pom.xml).
2. Execute diretamente a classe Main.java.

---

## Autor

| Nome | Função | Contato |
| :--- | :--- | :--- |
| Gilvan Pedro | Estudante de Engenharia de Software – SENAI Goiás | GitHub: https://github.com/GilvanPedro |

---

## Licença

Este projeto é de uso livre para fins de aprendizado, estudo e demonstração.
