# Tipos de Operadores

* **Operadores de atribuição**: Utilizados para definir o valor inicial ou sobrescrebver o valor de uma variável.   
    ~~~java   
    int lado = 2;
    int idade = 27;  
    String nome = "Raquel";  
    double pi = 3.14;
    lado = 3;  
    ~~~

* **Operadores aritméticos**: Realizam operações matemáticas entre duas variáveis e retornam o resultado. Alguns exemplos de operadores aritméticos: +, *, -, %, /  
    * Podemos utilizar também estes operadores junto do operador de atribuição, realizando, em uma mesma instrução, as ações de calcular o valor e atribuí-lo à variável.
    ~~~java
    int area = 2;
    int area = 2*2;

    int ladoQuadrado = 2; 
    ladoQuadrado *= 2; 
    ~~~

* **Operadores de incremento e decremento**: Podem ser declarados antes ou depois da variável e incrementam ou decrementam em 1 o valor da variável (++ ou --).  
    * Esses incrementos podem vir antes ou após a variável, o qual quando declarado antes: O valor da variável é lido antes do processamento. Porém quando declarado após, lê-se o valor da variável para processamento e só então o valor da variável é incrementado.
    ~~~java
    int primeiroDesafio = 5;
    System.out.println(primeiroDesafio += ++primeiroDesafio);
    Resposta = 11

    int segundoDesafio = 5;
    System.out.println(segundoDesafio += segundoDesafio++);
    Resposta = 10
    


* **Operadores de igualdade**: Verificam se o valor ou o resultado da expressão lógica. Como por exemplo: '==' (igual) ou '!=' (diferente).  
    ~~~java
    int valorA = 8;
    int valorB = 16;

    (if valorB == 2*valorA) { 
        System.out.println("Os valores são iguais")
    }  else { 
        System.out.println("Os valores são diferentes")
    }
    ~~~

* **Operadores relacionais**: Avaliam dois operandos. Alguns exemplos de operadores: < (menor), > (maior), >= (maior ou igual), <= (menor ou igual).  
    ~~~java
    int idade = 22;
    int maiorIdade = 18;

    (if idade >= maiorIdade) { 
        System.out.println("É maior de idade")
    } else { 
        System.out.println("É menor de idade")
    }
    ~~~

* **Operadores lógicos**: É um recurso que nos permite criar expressões lógicas maiores a partir da junção de duas ou mais expressões. Por exemplo: '&&' (and) e '||' (ou).

    ~~~java
    (if (1 == (2-1)) && (2 == (1+1))) { 
         System.out.println("Verdadeiro")
    }
    ~~~

* **Observações**
    * &, | e ^: Força a executar o comando completo.
    * xor: É um or exclusivo. Retorna 'false' quando os operadores forem iguais.