public class StringUtils {

    public static void main(String[] args) {
        String camelCase = formataAtributo("quantidade de Questoes");
        System.out.println(camelCase);

        String methodCamelCase = formataMetodo("get quantidade de questoes");
        System.out.println(methodCamelCase);

        String classeCamelCase = formataClasse("formatador de identificadores");
        System.out.println(classeCamelCase);

        String palavraTestePalindromo = "Hannah";
        boolean ehPalindromo = ehPalindromo(palavraTestePalindromo);
        System.out.println("A palavra \"" + palavraTestePalindromo + (ehPalindromo? "\"" : "\" NÃO") + " é um palíndromo");

        String fraseCaixaAlta = transformaParaCaixaAlta("PhUlaNo dEtHal");
        System.out.println(fraseCaixaAlta);

        String fraseTesteContVogais = "In God We Trust";
        int contadorVogais = contaVogais(fraseTesteContVogais);
        System.out.println("O número de vogais na frase \"" + fraseTesteContVogais + "\" ?: " + contadorVogais);

        String fraseSemEspacosSuperfluos = removeEspacosSuperfluos(" Hay que endurecerse,    pero sin perder la ternura jamás ");
        System.out.println(fraseSemEspacosSuperfluos);

        String fraseSemEspacos = removeTodosOsEspacos("Requel Souto de Oliveira Winkeler");
        System.out.println(fraseSemEspacos);
    }

    public static String formataAtributo(String atributo) {
        String output = new String();
        atributo.toLowerCase();
        String [] listPalavras = atributo.split(" ");

        output += listPalavras[0];

        for (int i = 1; i < listPalavras.length; i++) {
            String primeiroChar = listPalavras[i].substring(0,1).toUpperCase();
            listPalavras[i] = primeiroChar + listPalavras[i].substring(1);

            output += listPalavras[i];
        }

        return output;
    }

    public static String formataMetodo(String metodo) {
        return formataAtributo(metodo);
    }

    public static String formataClasse(String classe) {
        String output = new String();
        classe.toLowerCase();
        String [] listPalavras = classe.split(" ");

        for (int i = 0; i < listPalavras.length; i++) {
            String primeiroChar = listPalavras[i].substring(0,1).toUpperCase();
            listPalavras[i] = primeiroChar + listPalavras[i].substring(1);

            output += listPalavras[i];
        }

        return output;
    }


    // Atentar que nesse caso, não deve ser inserido como parâmetro uma frase, mas apenas uma palavra.
    public static boolean ehPalindromo(String palavra) {
        boolean palindromo = true;

        palavra = palavra.toLowerCase();
        for (int i = 0; i < palavra.length(); i++) {
            char c1 = palavra.charAt(i);
            char c2 = palavra.charAt(palavra.length()-i-1);

            if (c1 != c2) {
                palindromo = false;
            }
        }

        return palindromo;
    }

    public static String transformaParaCaixaAlta(String frase) {
        return frase.toUpperCase();
    }

    public static int contaVogais(String frase) {
        int contVogais = 0;
        frase = frase.toLowerCase();

        char [] vogais = {'a','e','i','o','u'};

        for (int i = 0; i < vogais.length; i++) {
            char vogal = vogais[i];
            for (int j = 0; j < frase.length(); j++) {
                char caractere = frase.charAt(j);
                if(vogal == caractere) {
                    contVogais++;
                }
            }
        }

        return contVogais;
    }

    //Remove os espaços extras do inicio, meio e fim
    public static String removeEspacosSuperfluos(String frase) {
        return frase.trim().replaceAll("\\s+", " ");
    }

    //Remove todos os espaços
    public static String removeTodosOsEspacos(String frase) {
        return frase.replace(" ", "");
    }
}
