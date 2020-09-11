## Questão 1: criar uma classe para representar um Carro, e instanciar vários Carros
Para representar carros do mundo real, crie a classe Carro. **Carro deve ter os seguintes atributos:**

* String nome, marca, cor;
* int portas;
* boolean vidroEletrico, arCondicionado, cambioAutomatico, direcaoEletrica;
* double precoBase;

**Construtores da classe Carro:**

* Um construtor que tem como argumento nome, marca, e precoBase. Esse construtor nos dará uma instância básica de carro: 2 portas, cor branca, sem vidros elétricos, sem ar-condicionado, sem câmbio automático, e sem direção elétrica.
* Um construtor que tem todos os atributos da classe como argumento.
* Um construtor vazio, sem argumentos (como é o default).

A classe carro deve ter uma função chamada calculaPreco. Cores básicas como “branco”, “azul”, “vermelho”, “preto”, não adicionam custo (use a estrutura condicional switch-case para esta implementação). Qualquer outra cor adiciona R$ 1000 ao preço total do carro. Além disto, cada opcional (vidro elétrico, ar-condicionado, câmbio automático e direção elétrica) adiciona R$ 1250 ao custo total do carro.

Crie uma função toString, que nos dê todos os detalhes do carro, inclusive o preço total, através da função calculaPreco.

**Crie uma classe chamada Loja de Carros. Instancie os seguintes carros:**

* Fiat Pálio básico, de preço básico R$ 35000;
* Fiat Pálio básico com cor prateada, de preço básico R$ 35000;
* Honda Civic completo, de preço básico R$110000;
* Toyota Corolla com vidro, direção e ar, de preço básico R$110000;
* Volkswagen Gol completo, de preço básico R$ 55000 (use o construtor vazio);

Por fim, use a função toString para mostrar atributos e preços dos diferentes carros instanciados.