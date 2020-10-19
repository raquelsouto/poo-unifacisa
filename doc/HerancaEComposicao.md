    Composição e herança são dois mecanismos para reutilizar funcionalidade. A herança era considerada a ferramenta básica de extensão e reuso de funcionalidade; a composição estende uma classe pela delegação de trabalho para outro objeto, enquanto que a herança estende atributos e métodos de uma classe. Entretanto, atualmente considera-se que a composição é muito superior à herança na maioria dos casos. A herança deve ser utilizada em alguns contextos


## Herança

*Sintaxe: Para as classes derivadas utiliza a palavra extends, seguida do nome da superclasse* 

A herança é um princípio da Programação Orientada a Objetos que permite a criação de novas classes a partir de outras previamente criadas. Essas novas classes são chamadas de subclasses; e as classes já existentes, que deram origem às subclasses, são chamadas de superclasses. Deste modo é possível criar uma hierarquia dessas classes, tornando, assim, classes mais amplas e classes mais específicas. Uma subclasse herda métodos e atributos de sua superclasse; apesar disso, pode escrevê-los novamente para uma forma mais específica de representar o comportamento do método herdado.

**O que a herança faz:**   
* Estende atributos e métodos de uma classe;
* Classe Pai, classe Base ou Superclasse é a classe que foi herdada;
* Classe Filha ou Sub-Classe é a classe que herda da classe Pai;
* Generalização - Obtém similaridades entre classes e define novas classes. As classes mais genéricas são as classes Pai;
* Especialização - Identifica atributos e métodos não correspondentes entre * classes distintas colocando-os na classe filha;
* *É um*;


<a href="https://imgbb.com/"><img src="https://i.ibb.co/GV6T5pk/heranca.png" alt="heranca" border="0"></a>


Observações:
* Pessoa é a classe Pai(ou super classe);
* PessoaFisica e PessoaJuridica - são as classes Filhas (ou sub-classe);
* A classe Pessoa é a classe genérica;
* As classes PessoaJuridica e PessoaFisica são especializações;
* PessoaFisica e PessoaJuridica *É uma* pessoa;

**Vantagem:**  

* Captura o que é comum e o isola daquilo que é diferente;
* É vista diretamente no código até mesmo devido a sua natureza estática.

**Desvantagem:** 

* Possui um encapsulamento fraco entre classes e subclasses e forte acoplamento entre elas, ou seja ao mudar uma superclasse pode afetar todas as subclasses além de violar o princípio básico de projeto orientação a objetos(ter um baixo acoplamento entre as classes);
* Algumas vezes um objeto precisa ser de uma classe diferente em momentos diferentes, o que não é possível com a herança, pois o código não pode sofrer alterações facilmente em tempo de execução. Portanto a herança é um relacionamento estático.

Exemplo:

~~~java
public class Pessoa {
	public String nome;
	public String cpf;
	public Date data_nascimento;

	public Pessoa(String _nome, String _cpf, Date _data) {
		this.nome = _nome;
		this.cpf = _cpf;
		this.data_nascimento = _data;
	}
}

public class Aluno extends Pessoa {
	public Aluno(String _nome, String _cpf, Date _data) {
		super(_nome, _cpf, _data);
	}
	public String matricula;
}
public class Professor extends Pessoa {
	public Professor(String _nome, String _cpf, Date _data) {
		super(_nome, _cpf, _data);
	}
	public double salario;
	public String disciplina;
}
public class Funcionario extends Pessoa {
	public Funcionario(String _nome, String _cpf, Date _data) {
		super(_nome, _cpf, _data);
	}
	public double salario;
	public Date data_admissao;
	public String cargo;
}
~~~

Observações: 
* A classe pessoa possui nome, CPF, e data de nascimento como atributos; além de um construtor, que recebe estes três dados como parâmetro, e assim preenche os atributos do objeto. Na criação de um objeto Pessoa, o programa deve fornecer seus dados.
* Analisando professores, alunos e funcionários, percebe-se que todos podem (devem) ter cpf, nome e data de nascimento; portanto, cria-se subclasses de Pessoa para representa-los;
* As novas classes criadas possuem suas características (atributos e métodos) próprias, mas possuem também propriedades comuns: os atributos nome, data de nascimento e CPF. Cada construtor das novas classes possui uma chamada super(_nome, _cpf, _data), ou seja, a palavra super representa uma chamada de método ou acesso a um atributo da superclasse, por isso tem esse nome. Nesse caso, utiliza-se o super para invocar construtor da superclasse Pessoa, que recebe os três parâmetros e preenche os atributos do objeto. Então, quando ao criar um objeto do tipo Aluno, por exemplo, utilizando “new Aluno(“nome”,”cpf”,new Date())”, a classe Aluno invocará o construtor Pessoa(String,String,Date), e então seus atributos serão preenchidos com os dados enviados por parâmetro;

Exemplo 2:
~~~java
public class Pessoa {
	public String nome;
	public String cpf;
	public Date data_nascimento;
	public Pessoa(String _nome, String _cpf, Date _data) {
		this.nome = _nome;
		this.cpf = _cpf;
		this.data_nascimento = _data;
	}
	public double tirarCopias(int qtd) { //Retorna o preço para tirar copias
		return 0.10 * (double) qtd;
	}
}

public class Aluno extends Pessoa {
	public Aluno(String _nome, String _cpf, Date _data) {
		super(_nome, _cpf, _data);
	}
	public String matricula;
	public double tirarCopias(int qtd) { //Preço para tirar copias para alunos
		return 0.07 * (double) qtd;
	}
}
~~~ 

Observações:  
* Trata-se da palavra especial final, utilizada na declaração de métodos e atributos, que só permite uma declaração da variável ou comportamento em questão. Isso significa que se na listagem 3 o método tirarCopias(int); da classe pessoa fosse definido como final, seria proibido reescrevê-lo na subclasse. A declaração do método final seria como mostrado na listagem 5, a seguir.


### **Sobrescrita**

	Sobrescrever métodos em Java é como herdar habilidades dos seus pais, mas dá a sua personalidade para essas habilidades.

* A sobrescrita (ou override) está diretamente relacionada à orientação a objetos, mais especificamente com a herança. Com a sobrescrita, conseguimos especializar os métodos herdados das superclasses, alterando o seu comportamento nas subclasses por um mais específico;
* A sobrescrita de métodos consiste basicamente em criar um novo método na classe filha contendo a mesma assinatura e mesmo tipo de retorno do método sobrescrito;
* O método deve possuir a mesma assinatura, significa dizer que o método deve possuir o mesmo nome, a mesma quantidade e o mesmo tipo de parâmetros utilizado no método sobrescrito. Em relação ao tipo de retorno, este pode ser um subtipo do tipo de retorno do método sobrescrito, por exemplo, se o método da superclasse retornar um List, é permitido que o novo método retorne um ArrayList ou qualquer outro List. Entretanto o contrário não é permitido, e gera um erro de compilação.  

Exemplo:  
~~~java
public class Filme {
    public void alugarFilme(int dias) {
          if((dias > 0) && (dias <= 5)) {
              System.out.println("Aluguel feito.");
          } else {
              System.out.println("Não é possível alugar um filme por menos de 0 dias ou mais de 5 dias.");
          }
    }
}

public class Filme24Horas extends Filme {
 
    @Override
    public void alugarFilme(int dias) {
        if((dias > 0) && (dias <=1)) {
            System.out.println("Aluguel feito.");
        } else {
            System.out.println("Filme 24 horas deve ser alugado por no máximo 1 dia.");
        }
    }
}
~~~

Observações:
* A classe fez uso de uma anotação opcional, *@Override*, que serve para avisar o compilador que o método logo após faz a sobrescrita de um método da classe pai. Caso o método faça a sobrescrita incorretamente, o compilador lança um erro com uma descrição assim: **Método não sobrescreve ou implementa um método de um super-tipo.**
* O método não sobrescreve ou implementa um método de um super-tipo Então, apesar de ser opcional, a anotação @Override ajuda bastante. Ela avisa caso o método não possa ser sobrescrito ou se está fazendo uma sobrecarga ao invés da sobrescrita;

* Uma classe só pode sobrescrever os métodos da classe mãe aos quais ela tem acesso;
* Só é possível sobrescrever métodos que não são estáticos, ou seja, não é possível sobrescrever métodos de classe.
## Composição

**O que uma composição faz:** 
* Estende uma classe e delega o trabalho para o objeto desta classe;
* Uma instância da classe existente é usada como componente da outra classe;
* *Tem um*;

<a href="https://imgbb.com/"><img src="https://i.ibb.co/vB3hMp6/heranca.png" alt="heranca" border="0"></a>

Observações:
* 	Pedido é a classe que contém uma instância da classe Itens;  
* Pedido *tem um* item.

**Vantagem:**  
 
 * O seu comportamento pode ser escolhido em tempo de execução, em vez de estar amarrado em tempo de compilação;
 * Os objetos que foram instanciados e estão contidos na classe que os instanciou são acessados somente através de sua interface seguindo assim o princípio de programar para uma interface e não para uma implementação;
 * Apresenta uma menor dependência de implementações;
 * Seguindo um dos princípio da responsabilidade única, cada classe se concentra  em apenas uma tarefa;
 * Tem um bom encapsulamento onde os detalhes internos dos objetos instanciados não são visíveis.

**Desvantagem:**  
 
* Um software muito dinâmico e parametrizado é mais difícil de entender do que software mais estático.

Exemplo:

~~~java
public class Produto {

	private int codigo;
	private	String descricao;
	private	Data validade;

	public Produto(int cod, String descr, Data val)
	{
		codigo = cod;
		descricao = descr;
		validade = val;
	}
	
	public int getCodigo() { return codigo; }
	public String getDescricao() { return descricao; }
	public Data getData() { return validade; }

	public String toString()
	{
		return codigo +" - " + descricao + "(" +
			validade.toString() +  ")";
	}
}

public static void main(String args[])
{
	// Cria um objeto Data e já ajusta os seus atributos
	Data d1 = new Data(5,5,2007);

	Produto p1 = new Produto(56,"Bolo de chocolate", d1);

	// Alternativa: cria-se um objeto "anônimo" na própria chamada
	// ao construtor de Produto

	Produto p2 = new Produto(57,"Bolo de laranja", new Data(12,7,2007));
	
	// Escreve os dados de p1 e p2
	System.out.println("Dados de p1: "+p1.toString());
	System.out.println("Dados de p2: "+p2.toString());
}
~~~
