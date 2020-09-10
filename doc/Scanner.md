## Entrada de dados: Classe Scanner 

Uma variável é uma posição na memória do computador na qual um valor pode ser armazenado e utilizá-lo depois. Todas as variáveis Java devem ser declaradas com um nome e um tipo antes. O nome de uma variável permite que o programa acesse o valor dela na memória e por fim, *a instrução de declaração termina com um ponto e vírgula ( ; ).*

    A classe Scanner faz parte do pacote java.util. Um Scanner permite a um programa ler os dados (por exemplo, números e strings) para utilização nele. Os dados podem ser provenientes de várias origens, como: digitados pelo usuário ou um arquivo do disco. Antes de utilizar um Scanner, deve-se criá-lo e especificar a origem dos dados

**Passo a passo para se obter a entrada de dados:**

*Passo 1: Importar o Scanner*  

A classe Scanner não está disponível por padrão, por isso deve ser adicionada por meio de uma declaração import, que faz referência ao pacote que contém a classe Scanner.  
  
~~~java
import java.util.Scanner;
~~~

*Passo 2: Criar um objeto Scanner*   

~~~java
Scanner entrada = new Scanner(System.in);
~~~

* A instrução de declaração de variável especifica o nome (input) e o tipo (Scanner) de uma variável que será utilizada nesse programa;  
* O sinal de igual (=) indica que variável deve ser inicializada na sua declaração com o resultado da expressão à direita desse sinal;
* A palavra new é para criar um objeto Scanner que lê caracteres digitados pelo usuário no teclado;
* O objeto de entrada padrão, System.in, permite que aplicativos leiam bytes de informações digitadas pelo usuário, e o Scanner traduz esses bytes informações que podem ser utilizados num programa.

*Passo 3: Solicitar a entrada do usuário*  
~~~java
System.out.println(“Digite seu nome: “);  
String nome = entrada.nextString();
~~~

**O tipo de uma variável especifica o tipo de informação armazenada nessa posição na memória:**

| Tipo         | Descrição           
| ------------- |:-------------:| 
| next()       | Ler String, porém lê apenas um palavra separada por um espaço e o cursor continua na mesma linha | 
| nextLine()   |  Ler String também, a diferença é que lê de duas palavras e posiciona o cursor na próxima linha |  
| nextInt()    | A entrada é do tipo inteiro |   
| nextDouble() | A entrada do tipo double    |  
| nextFloat()  | A entrada do tipo  Float    |  

* *Ao terminar de efetuar a leitura dos dados do teclado, é importante fechar o objeto Scanner usando o método close().*

Exemplo:
~~~java
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner nome = new Scanner(System.in);
        String nome = entrada.next();
        entrada.close();
        System.out.println(“O nome dele é:  “  + nome)
~~~