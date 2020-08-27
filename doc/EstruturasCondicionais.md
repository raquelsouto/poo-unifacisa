# Estruturas Condicionais

* **if** : É uma estrutura de decisão utilizada para impor uma ou mais condições para serem executadas. A condição só será executada quando a expressão booleana seja true, caso seja a expressão seja false, pula a ação.
~~~java
Exemplo1: 

    public static void main(String[] args) {
        int idade = 27;
        int maiorIdade = 18;
        if(idade >= maiorIdade) {
            System.out.print("Ok. É de maior");
        } 
    }

Exemplo2:

    public static void main(String[] args) {
        int numero = 3;
        if(numero % 2 != 0) {
            System.out.print("O número é ímpar");
        } 
    }

~~~

* **if-else**: É uma variação do if, a diferença é que se a expressão booleana for false, o programa executa outra ação.
~~~java
Exemplo1: 

    public static void main(String[] args) {
        double mediaAluno1 = 9.5;
        double mediaAluno2 = 6.5;
        if(mediaAluno1 >= 7 && mediaAluno2 >= 7) {
            System.out.print("Alunos aprovados");
        } else { 
            System.out.println("Alguém ainda não foi aprovado");
    }

Exemplo2:

    public static void main(String[] args) {
        double salario = 5500;
        if (salario < 1000) { 
            System.out.println("Isento de pagar imposto de renda");
        } else if (salario > 1000 && salario < 2500) { 
            System.out.println("Paga imposto de 5%");
        } else if (salario > 2500 && salario < 4000) { 
            System.out.println("Paga imposto de 10%");
        } else if (salario > 4000) { 
            System.out.println("Paga imposto de 20%");
        }
    }
~~~

* **Operador Ternário**: É semelhante ao if-else, porém a diferença é que precisa-se devolver um valor após o teste em apenas uma linha.
    * *Sintaxe: (condição) ? se for verdade : se for falso*  
    Ou seja, para qualquer teste ele devolve uma expressão booleana, por isso define-se os dois parâmetros (para quando a expressão seja verdadeira ou falsa).
    Exemplo:
~~~java
    public static void main(String[] args) {
        double salario = 1000;
        double bonus = salario * (salario > 1000 ? 0.10 : 0.15);
        System.out.println(bonus);
    }
} 

Resultado: 150.0
~~~

* **Switch-case ou Switch**: É uma maneira de definir vários desvios no código, a partir de uma *única variável ou expressão*. Caso a variável tenha vários valores possível, precisa-se fazer um tratamento específicio para cada um deles. 
~~~java
    public static void main(String[] args) {
        int valor = 1;
        switch (valor) {
        case 1:
            System.out.println("valor = 1");
            break;
        case 2:
            System.out.println("valor = 2");
            break;
        case 3:
            System.out.println("valor = 3");
            break;
        default:
         System.out.println("Nenhum dos 3 valores");
        }
    }
~~~
