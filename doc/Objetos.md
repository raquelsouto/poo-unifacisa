## Objetos

    Os objetos são caracterizados por atributos e métodos. Os atributos são as propriedades de um objeto, enquanto métodos são as ações que um objeto pode realizar. Os objetos são características definidas pelas classes. Neles é permitido instanciar objetos da classe para inicializar os atributos e invocar os métodos.

Quando declaramos uma variável para associar a um objeto, na verdade, essa variável não guarda o objeto, e sim uma maneira de acessá-lo, chamada de referência.

***Características de um objeto***  

*Identidade*
   * Identificador único para cada objeto;
   * Distinção por existência (Mesmo que haja mais de um objeto com todos os atributos iguais, os objetos são distintos).

*Persistência*  

* Tempo de vida (permanente ou temporário);
   * Permanente: Ele fica armazenado em um meio físico;
   * Temporário: Ele existe durante a execução de um programa.
 

**Um objeto sozinho não tem muita utilidade. Para se conseguir alguma funcionalidade dos objetos, é necessário que haja uma interação com outros objetos. Só assim, pode-se construir modelos de comportamento mais complexo.*   Essa interação se dá por mensagens, que é implementada como
ativação de um método definido no objeto.* 


### Alocação dos dados na memória

<a href="https://imgbb.com/"><img src="https://i.ibb.co/02K3rnz/objeto-memoria-RAM.png" alt="objeto-memoria-RAM" border="0"></a>

Exemplo:
~~~java
public class Pessoa {
    double peso;
    String nome;
    String cpf;
    int idade;

    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "Raquel";
        pessoa1.idade = 27;
                
        Pessoa pessoa3 = new Pessoa();
        pessoa3.nome = "Ana";
        pessoa.idade = 20;

        Pessoa pessoa2 = new Pessoa();
        pessoa2.nome = "Eduardo";
        pessoa2.idade = 31;
~~~

Observações importantes:

* Os objetos são acessados por referência, ou seja, quando declara-se uma variável para associar a um objeto, na verdade, essa variável não guarda o objeto, e sim uma maneira de acessá-lo; 
* No exemplo anterior, ao se criar as variáveis de referência: pessoa1, pessoa2 e pessoa3, do objeto Pessoa. Internamente, essas referências vão armazenar o endereço de posição da memória. Por isso, utiliza-se o "." para navegar, pois o Java acessará Pessoa que se encontra naquela posição de memória, e não uma outra.  