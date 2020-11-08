## Interfaces

    A interface é um recurso muito utilizado para “obrigar” um determinado grupo de classes a ter métodos ou propriedades em comum para existir em um determinado contexto, contudo os métodos podem ser implementados em cada classe de uma maneira diferente. Ou seja, uma interface é um contrato que ao ser assumido por uma classe, deve ser implementado.
    
* Interface é a maneira pela qual conversa-se com um autenticável; a maneira através da qual conversa-se com um objeto;
* Uma interface é uma série de métodos, mas nunca pode conter  a implementação deles. Ela só expõe **o que o objeto deve fazer**, e não como ele faz, nem o que ele tem. Como ele faz vai ser definido em uma implementação dessa interface;
* Dentro das interfaces existem somente *assinaturas de métodos e propriedades*, cabendo à classe que a utilizará realizar a implementação das assinaturas, dando comportamentos práticos aos métodos.  
Exemplo:
~~~java
public interface FiguraGeometrica {
    
    public String getNomeFigura();
    public int getArea();
    public int getPerimetro();
}
~~~

* Para realizar a chamada/referência a uma interface por uma determinada classe, é necessário adicionar a palavra-chave **implements** ao final da assinatura da classe que irá implementar a interface escolhida.
    * Sintaxe: *public class nomeDaClasse* **implements** *nomeDaInterface*  

Exemplo:
~~~java
public interface Veiculo {

    public String getNome();
    public String getId();
}

public interface Motor {

    public String getModelo();
    public String getFabricante();
}

public class Carro implements Veiculo,Motor{

    @Override
    public String getId() {

   }

    @Override
    public String getNome() {

    }

    @Override
    public String getFabricante() {

    }

    @Override
    public String getModelo() {

    }

  }
}
~~~

Observações:

* Ao contrário da herança que limita uma classe a herdar **somente uma** classe pai por vez, é possível que uma classe implemente varias interfaces ao mesmo tempo;

* Anterface é uma espécie de contrato de regras que uma classes deve seguir em um determinado contexto. Por java não ter herança múltipla, a interface passa a ser uma alternativa.

## Interface de marcação

    São interfaces que servem apenas para marcar classes, de forma que ao realizar os “instanceof” podemos testar um conjunto de classe.

* *Sintaxe: variável **instanceof** Classe*
* Da mesma forma que <, <=, >=, >, == e !=, o instanceof é um “operador” de comparação de variaveis de referencia de objeto Verifica se um objeto é de um tipo especifico.

Exemplo: 
~~~java
public interface Funcionario {

}

public class Gerente implements Funcionario {
	private int id;
	private String nome;
}

public class Coordenador implements Funcionario {
	private int id;
	private String nome;
}

public class Operador implements Funcionario {
	private int id;
	private String nome;
}

public class MeuApp {

	public void calculaSalarioDeFuncionario(Funcionario funcionario){

		if (funcionario instanceof Gerente){
			//calculo para gerente
		}else if (funcionario instanceof Coordenador){
			//calculo para coordenador
		}else if (funcionario instanceof Operador){
			//calculo para operador
		}

	}



}
~~~