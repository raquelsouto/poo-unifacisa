## Principais Métodos da Classe String

1. concat: Existem duas formas de unir duas ou mais sequências de caracteres. A mais utilizada é o sinal de adição (+).

Exemplos:
~~~java
String nomeCompleto = nome + sobrenome;

String nomeCompleto = nome.concat(sobrenome);
~~~

* A diferença entre eles é que o resultado do código acima será NomeSobrenome, pois não há espaço entre os dois textos.

2. String.valueOf: É um método estático da classe String, que não precisa de uma instância para ser invocado. Ele converte um tipo primitivo em um objeto do tipo String. 
Exemplos:
~~~java
public class Testa_Metodo_valueOf {
public static void main(String[] args) {
double numero = 102939939.939;
boolean booleano = true;

System.out.println("Retorna Valor : " + String.valueOf(numero));
System.out.println("Retorna Valor: " + String.valueOf(booleano));
~~~

3. charAt: Retorna o caractere em uma localização específica numa String. Esse método possui um parâmetro do tipo inteiro que é usado como índice, retornando a partir dessa posição inserida nesse parâmetro. 
Exemplo:
~~~java
String nomeCurso = "SI";

if(nomeCurso.charAt(1) == ‘I’) {
    System.out.println(“O caractere I está na posição 1”);
~~~

4. indexOf: Localiza a primeira ocorrência de um caractere em uma string. Se o método localizar o caractere, é retornado o índice do caractere na String, caso contrário retorna -1. Existem dois tipos de indexOf que procuram caracteres em uma String: 
* 1º – aceita um inteiro que é conhecido como o número do índice na String;
* 2º – aceita dois argumentos inteiros – o caractere e o índice inicial em que a pesquisa da String deve iniciar.
Exemplo:
~~~java
String nome = "Raquel Souto de Oliveira Winkeler"; 
System.out.println(nome.indexOf("Olieveira"));
System.out.println(nome.indexOf("e"));
~~~

5. LastIndexOf: Localiza a última ocorrência de um caractere em uma string. O método procura do fim da string em direção ao começo, se encontrar o caractere é retornado o seu índice na string, caso contrário retorna -1. Existem duas versões do lastIndexOf que pesquisam por caracteres em uma string: 
* 1º – utiliza um inteiro do caractere;
* 2º – aceita 2 argumentos – um inteiro de caractere e o índice a partir do qual iniciar a pesquisa de trás para frente.
Exemplo:
~~~java
String nome = "Raquel Souto de Oliveira Winkeler"; 
System.out.println(nome.lastIndexOf("Olieveira"));
System.out.println(nome.lastIndexOf("e"));
~~~

6. IsEmpty: Metodo que chega se a string está vazia ou não, retorna true se estiver e false se não estiver vazia.
Exemplo:
~~~java 
String nome1 = "";  
String nome2= "si"; 
    
System.out.println(nome1.isEmpty());  
System.out.println(nome2.isEmpty());  
~~~
 
7. Contains: Retorna um boolean (true or false), caso uma string esteja contida.
Exemplo:
~~~java
String nome = "Raquel Souto"; 
System.out.println(nome.contains("Raquel"));
System.out.println(nome.contains(" "));
System.out.println(nome.contains("de"));
~~~

8. Substring(): Permite extrair substrings de strings e fornece 2 métodos substring para permitir que um novo objeto seja criado copiando parte de um objeto string existente. Cada método retorna um novo objeto desse tipo. Existem dois tipos desse método, que são:
* 1º – recebe um argumento do tipo inteiro, que especifica a partir de que caractere a cópia deve começar. A substring retornada contém uma cópia dos caracteres desde esse índice até o último caractere na string.
* 2º – recebe dois argumentos do tipo inteiro. Sendo o primeiro a posição do primeiro caractere a ser copiado e o segundo a posição do último caractere a ser copiado.
Exemplo:
~~~java
String nome = "Raquel"; 
System.out.println(nome.substring(0,5));
~~~

9. replace(): Retorna um novo objeto contendo a string original com um trecho especificado substituído por outra expressão indicada. Esse método deixa a string original inalterada. A versão sobrecarregada do método replace permite substituir substrings em vez de caracteres individuais. *replace(charoldChar,charnewChar)*  
Exemplo:
~~~java
String nome = "Souto"; 
System.out.println(nome.replace(o, x);
~~~

10. toUpperCase(): Retorna uma nova string com o conteúdo da original convertido para letras maiúsculas, mantendo a original inalterada.
Exemplo:
~~~java
String nome = "Souto"; 
System.out.println(nome.toUpperCase());
~~~

11. toLowerCase(): Retorna uma cópia de uma string com todas as letras convertidas para minúsculo, mantendo a original inalterada. 
Exemplo:
~~~java
String nome = "SOUTO"; 
System.out.println(nome.tolowerCase());
~~~

12. length: Retorna o tamanho da string, ou seja, a quantidade de caracteres da string.
Exemplo:
~~~java
String curso = "Sistema de Informação"; 
System.out.println(curso.length());
~~~

13. trim: Retorna a string com os espaços em branco do início e do final da cadeia removidos.


## StringBuilder 

Essa classe permite criar e manipular dados de Strings dinamicamente, ou seja, podem criar variáveis de String modificáveis.   
   
    O significado da classe StringBuilder não tem o mesmo sentido que classe String. Existe uma diferença entre essas classes, veja algumas características.

**Características StringBuilder**
* Armazena caracteres especificados pela sua capacidade, caso ela seja excedida, é aumentada para acomodar os caracteres adicionais;
* Não precisa alocar novos objetos quando realiza uma concatenação;
* Não são sincronizadas;
* Não são seguras para threads;
* **Uma vantagem sobre a classe String é a concatenação de strings. Pois quando concatena strings com StringBuilder é invocado o método append. Esse método aloca novas strings concatenadas para o mesmo objeto, ou seja, cada vez que concatena strings não são criadas cópias dos objetos como é realizado pelo método concat da classe String, contribuindo para um melhor desempenho do sistema.**

Exemplo:
~~~java
public class TestaStringBuilder {
         public static void main(String[] args) {

  StringBuilder nomes = new StringBuilder();
    nomes.append("Raquel>").append("Anna>").append("José>").append("Maria");

  System.out.println(nomes.toString());

        }
}
~~~

<a href="https://imgbb.com/"><img src="https://i.ibb.co/LQvbTGr/objstring.png" alt="objstring" border="0"></a>