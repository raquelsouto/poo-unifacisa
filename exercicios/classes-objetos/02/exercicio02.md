## Questão 2: criar uma classe para representar um Imóvel, e instanciar vários Imóveis

**Para representar imóveis do mundo real, crie a classe Imóvel. Imóvel deve ter os seguintes atributos:**

* String tipo (apto ou casa), imobiliaria;
* int pavimentos (em caso de prédio), pavimento (em caso de prédio), quartos, suítes, banheiros, metrosQuadrados;
* boolean elevador (em caso de prédio), piscina, quadra;

**Construtores da classe Imóvel:**

* Um construtor que servirá para instanciarmos casa que tem como argumentos: imobiliária, número de quartos, número de suítes, número de banheiros, área em metros quadrados, a existência de piscina, e a existência de quadra. Nesse construtor, a variável tipo sempre receberá a String “casa”;
* Um construtor que servirá para instanciarmos apartamentos que tem como argumentos: imobiliária, número de pavimentos, pavimento, número de quartos, número de suítes, número de banheiros, área em metros quadrados, a existência de elevador, a existência de piscina, e a existência de quadra.

A classe imóvel deve ter uma função chamada calculaPreco. Cada metro quadrado custa R$ 5000. Se for apartamento, quanto mais alto for o pavimento, mais caro será: a partir do quinto andar, R$2000 é adicionado por pavimento. Seja em casa ou apartamento, a existência de elevador, piscina e quadra adiciona R$ 2500, cada uma, ao preço final.

* Crie uma função toString, que nos dê todos os detalhes do imóvel, inclusive o preço total, através da função calculaPreco. 

**Crie uma classe chamada Classificados. Instancie os seguintes imóveis:**

* Casa, Imobiliária Falcão, 3 quartos, 1 suíte, 2 banheiros, 120 m², com piscina.
* Apartamento, Imobiliária Falcão, 15 andares, apartamento no pavimento 8, 3 quartos, 2 suítes, 3 banheiros, 82 m², com elevador.
* Casa, Imobiliária Altaman, 4 quartos, 2 suítes, 3 banheiros, 240 m², com piscina, quadra e elevador.
* Casa, Imobiliária Leblon, 6 quartos, 3 suítes, 5 banheiros, 540 m², com piscina, quadra e elevador.
* Apartamento, Imobiliária Alto Branco, 3 andares, apartamento no pavimento 2, 2 quartos, 1 suítes, 2 banheiros, 60 m², sem elevador.

Por fim, use a função toString para mostrar atributos e preços dos diferentes imóveis instanciados.