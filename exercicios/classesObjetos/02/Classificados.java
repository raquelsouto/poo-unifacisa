public class Classificados {

    public static void main(String[] args) {
        Imovel casa1 = new Imovel("Falcão", 3, 1, 2, 120, true, false);
        System.out.println(casa1.toString());

        Imovel apto1 = new Imovel("Falcão", 15, 8, 3, 2, 3, 82, true, false, false);
        System.out.println(apto1.toString());

        Imovel casa2 = new Imovel("Altaman", 4, 2, 3, 240, true, true);
        System.out.println(casa2.toString());

        Imovel casa3 = new Imovel("Leblon", 6, 3, 5, 540, true, true);
        System.out.println(casa3.toString());

        Imovel apto2 = new Imovel("Alto Branca", 3, 2, 2, 1, 2, 60, false, true, true);
        System.out.println(apto2.toString());


    }

}
