## Strings

Uma String armazena uma sequência de caracteres. um objeto String é imutável, ou seja, o texto que ele carrega nunca é alterado. Sempre que um texto precisa ser modificado é utilizado mais espaço em memória para que uma nova String seja criada contendo a nova versão dele. 

Para o compilador, qualquer texto entre aspas duplas é uma String. Por isso para criar um objeto desse tipo não requer a utilização do operador **new**. Portanto, uma String é criada igual a um tipo primitivo, porém é um tipo de referência (um nome para um objeto em memória). 
* *Para o Java qualquer texto entre aspas duplas é uma instância da classe String* 

**Criando uma String**

*Exemplo 1: criando uma instância da classe String*
~~~java
String java = "Raquel Souto de Oliveira Winkeler";
~~~

Exemplo 2: criando uma String com o new
~~~java
String java = new String ("Raquel Souto de Oliveira Winkeler");
~~~

**Observações:**  
* No exemplo 2, ao utilizar-se o operador new, ele faz com que mais recursos sejam utilizados do que o necessário;
* A diferença entre esses dois códigos é que: ao **NÃO** declarar o operador new, se o nome da variável for a mesma, o objeto criado será reutilizado(String pool), economizando espaço na memória, enquanto que ao se utilizar o operador new, a cada declaração um novo objeto será criado na memória, . Por exemplo, ao se colocar o *primeiro código* num loop por 20 vezes, apenas um objeto será criado nas demais, será reutilizado. Porém, ao se colocar o *segundo código* no mesmo loop, serão criados 20 objetos.  

* *Devido à imutabilidade das Strings, a JVM otimiza a quantidade de memória alocada, armazenando apenas uma cópia de cada String literal no pool*  
    * Quando criamos uma variável String e atribuímos um valor a ela, a JVM procura no pool por uma String de igual valor. Se for encontrado, o compilador retornará uma referência do endereço de memória, sem alocar memória adicional. Senão ele será adicionado ao pool (interno) e sua referência será retornada;
    * Ambos são os objetos String, entretanto, sua principal diferença é que o operador new() - sempre cria um novo objeto - e quando criamos uma String usando literal - ele é internado.

<a href="https://ibb.co/VBYFWk8"><img src="https://i.ibb.co/bd54gGn/string.png" alt="string" border="0"></a><br /><a target='_blank' href='https://pt-br.imgbb.com/'>imagens png gratis</a><br />

* Já Quando criamos uma String por meio do operador new, o compilador Java cria um novo objeto e o armazena no espaço de heap reservado para a JVM.

Exemplo 3: Invocando um método qualquer da classe String
~~~java
"Raquel Souto de Oliveira Winkeler".length();
~~~
* Apesar de não ter-se atribuido nenhuma variável, o objeto é funcional para o compilador, a partir do qual pode-se invocar qualquer método da classe String.

**Null**  
É possível declarar uma variável como sendo do tipo String sem inicializá-la com um valor, e se a variável texto for declarada dentro de uma classe, como membro, o valor padrão null.   
Exemplo:
~~~java
class Conta {
    String titular;
    double saldo

    public static void main(String[] args) {
        Conta cc = new Conta();
        System.out.println(cc.titular);
    }
} 
~~~
 * Quando a instância da classe Conta é criada, o valor *padrão null* é atribuído a variável titular e saldo, por isso a saída exibida será exibirá o **texto null**  ao ser invocado. Caso a variável seja declarada dentro de um método, como variável local, um erro de compilação acontecerá se desejar-se utilizá-la, pois nenhuma variável local pode ser utilizada sem ter sido iniciada. 
   

 **Igualdade entre Strings**  
 A comparação entre Strings utilizando o operador de igualdade (==) retornará true se *as duas referências apontarem para o mesmo objeto na memória.*  

Exemplo 1: 
~~~java
String nome = "Bruno";
String apelido = nome;

if(nome == apelido) {
    System.out.println("Nome e apelido são iguais");
}

Exemplo 2: 

String nome = "Bruno";
String apelido = "Bruno";

if (nome == apelido) {
    System.out.println("Nome e apelido são iguais");
}
~~~

* Nos dois exemplos acima, a JVM tratará como sendo o mesmo objeto. Uma vez que nome e apelido apontam para o mesmo objeto, a expressão lógica nome == apelido será avaliada como true.

Exemplo 3:
~~~java
String nome = new String("Bruno");
String apelido = "Bruno";

if (nome == apelido) {
    System.out.println("Nome e apelido são iguais");
}
~~~

* Já no exemplo 3 a saída "Nome e apelido são iguais" não será impressa, visto que nome e apelido apontam para objetos diferentes, sendo o primeiro criado com o comando new String("Bruno") e o segundo com o literal "Bruno". **O operador new força a criação de um novo objeto.**

**Equals**

É um método da classe Object *utilizado para testar o conteúdo entre dois objetos.* Esse método está presente em todas as classes, porque todas elas derivam de Object.   
Exemplo:
~~~java
String nome1 = "Eduardo";
String nome2 = "Eduarda";

if (nome1.equals(nome2)) {
    System.out.println("Os nomes são iguais!");
} else {
    System.out.println("Os nomes são diferentes!");
}
~~~
* A saída será "Os nomes são diferentes!", pois nome1 contém uma sequência de caracteres(conteúdo) diferente de nome2.

**equalsIgnoreCase**  
Esse método ignora a distinção entre letras maiúsculas e minúsculas nas duas strings comparadas.
Exemplo:
~~~java
String nome1 = "Eduardo";
String nome2 = "eduardo";

if(nome1.equalsIgnoreCase(nome2)) {
    System.out.println("Os nomes são iguais!");
}
~~~

* Para esse exemplo, os nomes são iguais, então o método equalsIgnoreCase retornará true.

