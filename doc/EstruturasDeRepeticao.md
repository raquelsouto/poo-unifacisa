# Estruturas de Repetição

* **Do-While**: Executa o escopo do comando independente da condição booleana for verdadeira. Portanto, mesmo que a condição seja falsa, suas instruções serão executadas pelo menos uma vez, pois a condição é testada no fim da primeira repetição.  
Exemplo: 
~~~java
    public static void main(String[] args) {
        int idade = 15;
        do {
            System.out.println("Sem permissão para entrar. Você tem apenas " + idade + " anos.");
            idade ++;
        } while (idade <= 18);
        
    }
}
Resultado: Não é permitido a entrada, você tem apenas 15 anos
Não é permitido a entrada, você tem apenas 16 anos
Não é permitido a entrada, você tem apenas 17 anos
~~~


* **While**: Executa um comando enquanto a condição boolean for verdadeira. Então, antes de se iniciar o comando de repetição a condição é testada.  
Exemplo:
~~~java
    public static void main(String[] args) {
        int contador = 0;
        while (contador <= 10) {
                System.out.println("Contador " + contador);
                ++contador;
            }
        }
    }
~~~


* **For**: Seus elementos de inicialização, condição e iteração são reunidos como se fosseum cabeçalho e o corpo é disposto em seguida. Recomenda-se seu uso quando a repetição é conhecida.  
    * ***Sintaxe***: *for (valor de inicialização ; condição ; incremento)* 

~~~java 
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int soma = 0;
        for(int i = 1; i <= 3; i++) { 
            System.out.println("Digite um numero inteiro: ");
            int valor = entrada.nextInt();
            soma += valor;
        }
        double media = soma/3;
        System.out.println("A média dos números digitados é: " + media);
    }
~~~