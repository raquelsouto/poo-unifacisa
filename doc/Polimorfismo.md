## Polimorfismo

Polimorfismo é a capacidade de um objeto poder ser referenciado de várias formas. *(Porém não significa que o objeto fica se transformando, pelo contrário, um objeto nasce de um tipo e morre daquele tipo, o que pode mudar é a maneira como nos referimos a ele).*

No Polimorfismo, há dois tipos:
 
* **Polimorfismo Estático ou Sobrecarga;**  
    Este polimorfismo se dá quando temos a mesma operação implementada várias vezes na mesma classe. A escolha de qual operação será chamada depende da assinatura dos métodos sobrecarregados.

* **Polimorfismo Dinâmico ou Sobreposição**  
    Este tipo acontece na herança, quando a subclasse sobrepõe o método original. Agora o método escolhido se dá em tempo de execução e não mais em tempo de compilação. A escolha de qual método será chamado depende do tipo do objeto que recebe a mensagem.


### Sobrescrita de Métodos e Sobrecarga

A Sobrescrita de Métodos pode ser classificada como polimorfismo de inclusão. Quando um método sobrescreve um método herdado de uma classe, temos uma sobrescrita de método. Este método de sobrescrita tem que ser idêntico ao método da classe herdada, ou seja, eles precisam ter o mesmo nome, valor de retorno e argumentos. Portanto, temos que uma classe filha fornece apenas uma nova implementação para o método herdado e não um novo método. Por exemplo, uma superclasse Forma e as suas subclasses: Triangulo e Circulo. Digamos que a superclasse Forma tem um método chamado calculaArea(). Cada uma das subclasses Triangulo e Circulo definirá o seu próprio método calculaArea(). Dependendo do tipo de objeto que for criado teremos a execução do método dessa subclasse.

Se a classe filha fornecer um método de cabeçalho ou assinatura parecida com a do método herdado (difere ou no número ou no tipo dos argumentos) então não se trata mais de redefinição, trata-se de uma sobrecarga, pois criou-se um novo método. Uma chamada ao método herdado não mais será interceptada por esse novo método de mesmo nome. O método tem o mesmo nome, mas é ligeiramente diferente na sua assinatura (o corpo ou bloco de código não importa), o que já implica que não proporciona o mesmo comportamento do método da superclasse. Por exemplo, um método soma(int x) e um outro método soma(int v1, int v2). O método que será chamado depende dos argumentos sendo passados na chamada deste método. Portanto, se chamarmos soma(1,3) o segundo método será chamado.

    O tipo de polimorfismo de Sobrecarga permite a existência de vários métodos de mesmo nome, porém com assinaturas levemente diferentes, ou seja, variando no número e tipo de argumentos. Ficaria a cargo do compilador escolher de acordo com as listas de argumentos os procedimentos ou métodos a serem executados.


<a href="https://ibb.co/RY3rNmw"><img src="https://i.ibb.co/fqk695w/polimorfismo.png" alt="polimorfismo" border="0"></a>


Exemplo:
~~~java

public class Peca {
    public void mover();
}

public class Peao extends Peca {
    @Override
    public void mover();
    System.out.println("Andar pra frente");
}

public class Cavalo extends Peca {
    @Override
    public void mover();
    System.out.println("Andar em 'L'");
}

public class Bispo extends Peca {
    @Override
    public void mover();
    System.out.println("Andar na diagonal");
}

public class TesteXadrez {
    
    public static void main(String[] args) {
        Peca peao = new Peca();
        peao.mover;

        Peca cavalo = new Peca();
        cavalo.mover;

        Peca bispo = new Peca();
        bispo.mover;
    }
}

//Resultado: Andar pra frente
//Andar em 'L'
//Andar na diagonal
~~~
