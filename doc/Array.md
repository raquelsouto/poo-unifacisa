## Arrays

São estruturas de dados que consistem em itens de dados do mesmo tipo relacionados, e são imutáveis, ou seja, permanecem com o mesmo tamanho depois de criados.

* Fornecem métodos eficientes que organizam, armazenam e recuperam seus dados sem que seja necessário conhecer como os dados são armazenados;
* Reduz o tempo de desenvolvimento de aplicativos. 

*Sintaxe do array:*  
* *tipo[] nome_do_array = new tipo[numeroDeElementos]; ou*
* *tipo[] nome_do_array = {valor1, valor2, ...,valorn};*
Exemplo:
~~~java
float[] nota = new int[10];
float[] nota = {2, 8, 8.5, 10, 7, 6, 9.3, 7.8, 9.1, 9.7}

String[] nome = new String[10];
~~~

**Percorrendo Arrays**
Exemplo:
~~~java
public static void main(String[] args) {
    int[] idades = new int[10];
    for (int i = 0; i < 10; i++) {
        System.out.println(idades[i]);       
    }
}
~~~

Observações:
* Quando declara-se variáveis numéricas utilizando array e não inicializamos com valores, eles  automaticamente serão *nulos*. Porém, 
se forem Strings, serão *null* e *vazias* caso sejam caracteres (char);
* O tamanho de um array é constante. Uma vez que seu valor for declarado, não poderá ser mudado;
* Arrays tem variáveis e métodos (como é comum em objetos);
* Para saber o tamanho de um array, utiliza-se o método 'length', ele retornará um inteiro com o número de elementos em cada cada array, por exemplo *nome.length, nota.length.* 

Os arrays podem ter mais de uma dimensão. Isto é, em vez de termos uma array de 10 contas, podemos ter uma array de 10 por 10 e para acessa-los, utiliza-se a posição da coluna x e linha y. 

Exemplo:
~~~java
String[] alunos = new String[] {"Ana", "Raquel", "João"};
int[][] notas = new int [][] {{10, 5, 6}, {9, 8, 10}, {7, 8, 6}};

for(int i = 0; i < 3; i++){
	System.out.println("Aluno: "+alunos[i]+"; média: "+
   	(notas[0][i] + notas[1][i] + notas[2][i])/3);
}
~~~

<a href="https://imgbb.com/"><img src="https://i.ibb.co/F56CMkH/array.png" alt="array" border="0"></a>



**Classe Array**

* Arrays.equals(): Compara os conteúdos dos arrays;
* Arrays.sort(): Ordena o array;
* Arrays.toString(): Retorna uma representação textual do endereço de memória do array.

    *Há diferença entre fazer comparação utilizando o equals() e '=='.Assim como em Strings, equals compara o **conteúdo** de um array, enquanto que o '==' compara o *endereço de memória.**

* O clone() permite criar uma cópia do array com conteúdo idêntico.


**Execeções**

* *ArrayIndexOutOfBoundsException:* Ao tentar acessar um elemento do array em um índice inexistente (seja um índice negativo, ou fora do limite do array);
* *NullPointerException:* Ao tentar fazer qualquer operação em um objeto e este objeto não foi instanciado.