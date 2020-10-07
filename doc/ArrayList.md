## ArrayList 

É uma classe para coleções. Uma classe genérica (generic classes) Coleções mesmo, de qualquer tipo de 'coisa' ou dado, não somente de tipos primitivos. Pode-se criar objetos, através de uma classe, e agrupá-los com o ArrayList e realizar, várias operações, como: adicionar e retirar elementos, ordenr, procurar por um elemento específico, apagar um elemento específico, etc.

Algumas vantagens do ArrayList: 

*  Melhora o funcionamento de uma matriz;
* Se torna útil no gerenciamento de consumo de memória de programa, já que elementos desnecessários são descartados. Por isso, é ótimo para aplicações em tempo real;
* Facilidade de manutenção (ou atualização) de código e testes.

Observação: Deve-se notar que ArrayList nunca deve ser usado para informações que você não deseja alterar. Por exemplo, se estiver armazenando o número de meses, ou seja, de 1 a 12, aconselha-se usar uma matriz que forneça comportamento estático.

**Sintaxe**: *List< Qualquer_Tipo > nomeDoArrayList = new ArrayList<Qualquer_Tipo >();*   

Exemplos:  
~~~java
ArrayList <String> produtos;

ArrayList<Integer> numeros;
~~~

Observações: 
* Somente tipos não-primitivos podem ser usados para declarar variáveis e criar objetos em classes genéricas – e o ArrayList, sendo ele uma classe genérica. Ainda assim, é possível usar tipos primitivos, desde que empacotados como se fossem objetos, em um processo denominado **autoboxing** (exemplo 1);
* O processo de conversão de objetos em tipos primitivos de dados correspondentes é chamado de **unboxing** (exemplo 2).


### *Quando é usado o autoboxing:*
* Quando um valor primitivo é passado como um parâmetro para um método que espera um objeto da classe Wrapper correspondente;
* Quando um valor primitivo é atribuído a uma variável da classe Wrapper correspondente.

Exemplo: 
~~~ java
public int somaDosNumeros(List <Integer> intList ) {
    int soma = 0;
    for (Integer i: intList )
        if ( i % 2 == 0 )
            soma += i;
        return soma;
~~~ 

### *Quando é usado o unboxing:*
* Quando um objeto é passado como um parâmetro para um método que espera um valor primitivo correspondente;
* Quando um objeto é atribuído a uma variável do tipo primitivo correspondente;


## Métodos principais do ArrayList

Exemplo:
~~~java
import java.util.ArrayList;
import java.util.List;

List<String> nomesAlunos = new ArrayList<String> (); 
~~~

1. add: Adicionar um elemento na lista;
~~~java
nomesAluno.add("Raquel");
nomesAluno.add("Joana");
nomesAluno.add("Paulo");
~~~

2. get: Pegar algum elemento;  
~~~java
nomesAluno.get(0);

for (int i; i < nomesAlunos.size(); i++){
    system.out.println(nomesAlunos.get(i))
}
~~~

3. remove: Remover um elemento da lista;
~~~java
nomesAlunos.remove("Joana")
~~~

4. size: Verifica o seu tamanho da lista;
~~~java
nomesAlunos.size();

for (int i; i < nomesAlunos.size(); i++){
    system.out.println(nomesAlunos.get(i))
}
~~~

5. clear: Remove tudo.
~~~java
nomesAlunos.clear();
~~~

## LinkedList

Essa classe modela uma lista duplamente encadeada, e pode ser usada como implementação para pilhas, filas, e deques com grande eficiência. Diferentemente das listas sequenciais, os dados de uma lista encadeada ficam espalhados na memória, ou seja, os elementos não estão juntos em grandes blocos de memória, mas em lugares diferentes dela. Fazendo com que as operações de inserção e remoção sejam feitas com mais facilidade, tanto no início como no fim da lista. 

LinkedList do Java, implementa uma lista circular duplamente encadeada: ou seja, cada elemento guarda a posição do próximo e do anterior, formando um círculo, onde o elemento depois do último é o primeiro, e o anterior a este, é aquele.

<a href="https://imgbb.com/"><img src="https://i.ibb.co/1qrVk5g/linkedl.jpg" alt="linkedl" border="0"></a>


    O linkedList possui melhor performance nos métodos add e remove, do que os métodos add e remove do ArrayList, entretanto,seus métodos get e set possuem uma performance pior do que os do ArrayList.