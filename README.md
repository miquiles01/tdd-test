# Lista de Exercícios
<img src="assets/images/Unicap_Icam_Tech-01.png" alt="drawing" width="200"/>

## Identificação
**Professor**: Daniel Bezerra

**Disciplina**: Teste de Software

**Atividade**: TDD

## Descrição da Atividade

Utilize TDD para criar o programa de Saudaçoes a ser implementado. A classe saudação pode conter quantos métodos necessários mas o método de teste tem que sempre ser o método **saudacao()**. Os requisitos a seguir são incrementais.

### Modo de envio

- Utilizando o Github do projeto, para cada implementação de teste ou de código principal que for terminada, deve ser dado um commit.

    - EX.: 

        - 1º passo: Conclusão do primeiro método de teste (primeiro commit)
        - 2º passo: Incremento do código principal para passar o teste implementado (segundo commit)
        - 3º passo: Criação do segundo método de teste (terceiro commit)
        - 4º passo: Incremento do código principal para passar o teste implementado (quarto commit)
 
 - Os nomes dos testes devem ser relacionados com o número do requisito
    
    - Ex: 
        ```
        @Test
        public void req01(){
            //TESTE DO REQUISITO 1
        }
        ```

### Requisito 1
Escreva um método saudacao(name) que interpola o nome em uma saudação simples. Por exemplo, quando o nome é "Joao", o método deve retornar uma string "Olá, Joao!".

### Requisito 2
Lide com nulos introduzindo um substituto. Por exemplo, quando name é null, o método deve retornar a string “Olá, meu amigo!”.

### Requisito 3
Lidar com gritos. Quando o nome estiver todo em letras maiúsculas, o método deverá responder ao usuário. Por exemplo, quando o nome é "JOSE", o método deve retornar a string "OLÁ, JOSE!"

### Requisito 4
Lidar com dois nomes de entrada. Quando name é uma array de dois nomes, ambos os nomes devem ser impressos. Por exemplo, quando o nome é ["Maria", "Laura"], o método deve retornar a string "Olá, Maria e Laura!".

### Requisito 5
Lide com um número arbitrário de nomes como entrada. Quando o nome representar mais de dois nomes, separe-os com vírgulas e feche com vírgula e “e”. Por exemplo, quando o nome é ["Ana", "Bruno", "Carlos"], o método deve retornar a string "Olá, Ana, Bruno, e Carlos!".

### Requisito 6
Permita a mistura de nomes normais e gritados, separando a resposta em duas saudações. Por exemplo, quando o nome é ["Ana", "BRUNO", "Carlos"], então o método deve retornar a string "Olá, Ana e Carlos! E OLÁ BRUNO!"

### Requisito 7
Se alguma entrada em name for uma string contendo uma vírgula, divida-a como sua própria entrada. Por exemplo, quando o nome é ["Joao", "Marcos, Daiane"], então o método deve retornar a string "Olá, Joao, Marcos, e Daiane!".

### Requisito 8
Permitir que a entrada escape das vírgulas intencionais introduzidas pelo Requisito 7. Elas podem ser escapadas da mesma maneira que o CSV, com aspas duplas ao redor da entrada. Por exemplo, quando o nome é ["Joao", "\\"Marcos, Daiane\\""], então o método deve retornar a string "Olá, Joao e Marcos, Daiane!".
