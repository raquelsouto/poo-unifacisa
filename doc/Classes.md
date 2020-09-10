## Classes 

As classes têm características e comportamentos. Ela permite armazenar propriedades e métodos dentro dela. Para construir uma classe é preciso utilizar a abstração. Uma classe geralmente representa um substantivo. Por exemplo: uma pessoa, um lugar, algo que seja “abstrato”. 

**Toda classe possui:** 
* Um nome;
* Visibilidade (public, private ou protect);
* Características (atributos) e ações (métodos);   

**Para criar uma classe** terá que:  *Declarar a visibilidade + palavra reservada class + NomeClasse + { } .*

Exemplo:
~~~ java
public class Conta {

    double saldo;
    String titular;
    int numero;
    int agencia;

    public static void main(String[] args) {
        Teste conta = new Teste();
        conta.titular = "Raquel Souto";
        conta.saldo = 1200.20;
        
        System.out.println("Nome do titular " + conta.titular + ". Seu saldo é R$ " + conta.saldo);

    }

}
Resultado: Nome do titular Raquel Souto. Seu saldo é R$ 1200.2
~~~