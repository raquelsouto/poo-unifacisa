## Encapsulamento

Encapsular é esconder todos os membros de uma classe, além de esconder como funcionam as rotinas (em caso de métodos) do sistema. O encapsulamento é importando para que o sistema seja suscetível a mudanças, ou seja, para que não seja necessário mudar uma regra de negócio em vários lugares, mas em apenas um único lugar. 

**Vantagens de seu uso:**  

* Garante a transparência de utilização dos componentes, facilitando seu entendimento, reuso e manutenção;
* As mudanças na implementação interna do objeto não afetam o resto do sistema;
* Protege os objetos de terem seus atributos corrompidos por outros objetos;
* Ao “esconder” seus detalhes de implementação, uma classe evita que outras fiquem dependentes de sua estrutura interna.

*Tipos de visibilidade: Por ordem decrescente de restrição*
| Tipo         | Visibilidade           
| -------------|:-------------:| 
|  Public      | Variváveis e métodos acessíveis de qualquer ligar  | 
|  Protect     | Variváveis e métodos visíveis para todas as classes e subclasses ou dentro o pacote - herança  |  
|Default|  Variváveis e métodos acessível apenas dentro do pacote  |   
|  Private     |  Variváveis e métodos visíveis dentro da classe apenas |    

Exemplo:
~~~java
public class Conta {

    private String titular;
    private double saldo;

    
    public double getSaldo() {
        return this.saldo;
    }
    
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return this.titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public static void main(String[] args) {
        Conta conta1 = new Conta();
        conta.setTitular("Raquel Winkeler");
        conta.setSaldo(1200);
        System.out.println(conta.getTitular());
        System.out.println(conta.getSaldo());
    
    }
}
~~~
Observações sobre o exemplo:
* O controle sobre o saldo e titulaR está centralizado, ou seja, ninguém consegue acessá-lo. A única classe responsável pelos seus próprios atributos é a classe Conta;
* O modificador private faz com que ninguém consiga modificar, nem mesmo ler, os atributos. Portanto, para se ter acesso, recorre-se a utilização de métodos, que são os **getters e setters**.

    *Getteres e Setters*: Ajudam a proteger osatributos, bem como possibilita modificar algo em um só lugar. Isso é o encapsulamento pois esconde a maneira como os objetos guardam seus dados.
