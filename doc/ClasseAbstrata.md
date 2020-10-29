## Classes Abstratas

As classes abstratas são as que não permitem realizar qualquer tipo de instância. São classes feitas especialmente para serem modelos para suas classes derivadas. As suas classes filhas, via de regra, deverão sobrescrever os métodos para realizar a implementação dos mesmos. As classes derivadas das classes abstratas são conhecidas como classes concretas.

Como medida de segurança, as classes abstratas somente podem ser estendidas, sendo que a criação de um objeto a partir da mesma é um procedimento evitado. Além disso, caso um ou mais métodos abstratos estejam presentes nessa classe abstrata, a classe filha será, então, forçada a definir tais métodos, pois, caso contrário, a classe filha também se tornará abstrata.


### Métodos Abstratos 

    Indica que todas as classes filhas (concretas, isto é, que não forem abstratas) devem reescrever esse método ou não compilarão. É como se herdasse a responsabilidade de ter aquele método.

A funcionalidade dos métodos abstratos que são herdados pelas classes filha normalmente é atribuída de acordo com o objetivo ou o propósito dessas classes. É possível, porém, não atribuirmos uma funcionalidade a esses métodos abstratos. Neste caso, faz-se necessário, pelo menos, declarar tais métodos.

Métodos Abstratos – Os métodos abstratos estão presentes somente em classes abstratas, e são aqueles que não possuem implementação.  
*Sintaxe: abstract();*

Exemplo: 
~~~java

public abstract class Funcionario {
        protected string nome;
        protected double salario;

        public abstract double reajustar();

      public double getSalario() {
        return getSalario;
    }
}

public class Programador extends Funcionario {
        
        @Override
        public double reajustar() {
            return super.getSalario += 1000;
        }
     }
        
public class Designer extends Funcionario {
        
        @Override
        public double Reajustar() {
            return super.getSalario += 500;
        }
}
~~~

Observações:  
* O método reajustar() não pode declarar um corpo porque está marcado como abstrato;

* Entende-se em que na classe abstrata “Pessoa” o método que é abstrato têm um comportamento diferente, por isso não possuem corpo. **Ou seja, as subclasses que estão herdando precisam desse método mas não de forma genérica, aonde permite inserir as particularidades de cada subclasse**;

* A sobrescrita de métodos é muito utilizada na implementação de polimorfismo para que uma classe filha possa definir seu próprio comportamento, baseada na estrutura da classe mãe.  


## *FINAL*

1. Classe *final*: Não pode ser herdado por outra classe, ou seja, não possui filhos. 
    
    * Usada quando não quiser que uma classe tenha filhos.

Exemplo: 
~~~java

public enum CorDoCarro {
    
    BRANCA("Branca"), 
    AZUL("Azul"), 
    VERMELHA("Vermelha"), 
    PRETA("Preta"), 
    PRATEADO("Prateado"), 
    DOURADO("Dourado"), 
    CINZA_GRAFITE("Cinza Grafite");

    public final String corEscolhida;
    CorDoCarro(String cor) {
        this.corEscolhida = cor;
        
    }
    
}
~~~


2. Método *final*: Não pode ser sobrescrito pelas suas próprias subclasses.
    
    * Usando quando não quiser que o método seja sobrescrito.