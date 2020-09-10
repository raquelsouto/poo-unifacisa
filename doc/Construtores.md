## Construtores 

Os construtores são os responsáveis por criar o objeto em memória, ou seja, instanciar a classe que foi definida. Eles são obrigatórios e declarados.   


**O construtor sempre tem a seguinte assinatura:**   
* *modificadores de acesso (public, privado, protect) + nome da classe + parâmetros (com ou sem).*

***Observações:***  
* O construtor não tem nome da função, apenas tipo de retorno;
* Por padrão, o Java já cria esse construtor sem parâmetros para todas as classes, então você não precisa fazer isso se utilizará apenas construtores sem parâmetros. Por outro lado, se você quiser, poderá criar mais de um construtor para uma mesma classe. Ou seja, posso criar um construtor sem parâmetros, com dois parâmetros e outro com três parâmetros;
* Em Java apenas as Interfaces não possuem construtores;

## Tipos de Construtores

1. ***Construtor sem argumento:*** Quando não declara nenhum construtor na classe, o Java cria um para você. E esse construtor é o construtor default, que não recebe nenhum argumento e o corpo dele é vazio. Porém, assim que declara um construtor, o construtor default não é mais fornecido.  
Exemplo: 
~~~java
public class Conta {
    String titular;
    int numero;
    double saldo;
    
    Conta() {
        this.titular = titular;
        this.numero = numero;
        this.saldo = saldo;
    
        public static void main(String[] args) {
            Conta conta = new Conta();
            conta.titular = "Raquel Souto";
            conta.numero = 78945-6;
            conta.saldo = 1200.50;
            System.out.println("Construindo uma conta.");
        }
    }
~~~

2. ***Construtores com argumentos:*** Um construtor só pode rodar durante a construção do objeto. Porém, durante a construção de um objeto, pode-se fazer com que um construtor chame outro, para fazer uso da reutilização de código.  
Exemplo:
~~~java
public class Animal {
    public double peso;
    public String grupo;

    public Animal(double peso, String grupo) {
        this.peso = peso;
        this.grupo = grupo;
    }

    public static void main(String[] args) {
        Animal animal1 = new Animal(6.0, "Aves");
        Animal animal2 = new Animal(15, "Mamífero")
~~~

3. ***Sobrecarga:*** A sobrecarga consiste em permitir, dentro da mesma classe, mais de um método com o mesmo nome. Entretanto, eles necessariamente devem possuir argumentos diferentes para funcionar. O qual a escolha de qual método será chamado pelo programa principal, dependerá de acordo com o seu tipo de objeto, que será tomada apenas no tempo de execução por meio de ligação tardia.

Observações: 
* Sobrecarga é conceito poderoso do polimorfismo, e a mesma permite ao programador mais facilidade na criação de variações de códigos já criados, poupando-o assim de inventar nomes para cada operação que compõem um mesmo escopo;
* É necessário que os métodos tenham a mesma assinatura (tipo de retorno, nome do método, tipos e quantidades de parâmetros), mas com implementações diferentes;

Exemplo: 
~~~java
public class calculadora {

    public String modelo;
    public String marca;
    public String uso;

    public Calculadora() {
      this.modelo = modelo;
      this.marca = marca;
      this.uso = uso;
    }
    public Calculadora (String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public Calculadora (String marca, String modelo, String uso) {
        this.marca = marca;
        this.modelo = modelo;
        this.uso = uso;
    }
    public int calcula (int num1, int num2) {
       return num1 + num2;
    }
    public double calcula (double num1,double num2) {
        return num1 + num2;
    }
    public String calcula (String num1, String num2) {
         return num1 + num2;
    }

    public static void main(String args[]) {
        Calculadora calculadora1 = new Calculadora("optpex","N110","Empresarial");
        Calculadora calculadora2 = new Calculadora("Zion","Neo1");
        System.out.println(calculadora1.calcula(900,1000));
        System.out.println(calculadora1.calcula(99.0,100.1));
        System.out.println(calculadora1.calcula("Sobrecarga de "," construtores"));
        System.out.println("calculadora 1 Marca: " + calculadora1.marca + " Modelo: " + calculadora1.modelo + " Uso: " + calculadora1.uso);
        System.out.println("calculadora 2 Marca: "+ calculadora2.marca + " Modelo: " + calculadora2.modelo);
    }
}
~~~