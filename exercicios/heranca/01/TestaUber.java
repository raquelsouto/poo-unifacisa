import java.util.ArrayList;
import java.util.Arrays;

public class TestaUber {
    
    public static void main(String[] args) {
        Uber uber1 = new Uber();
        
        System.out.println("Criando os motoristas...");
        
        Motorista motorista1 = new Motorista("João", "12345", new ContaCorrente());
        Motorista motorista2 = new Motorista("Pedro", "23456", new ContaCorrente());
        Motorista motorista3 = new Motorista("Tiago", "34567", new ContaCorrente());
        Motorista motorista4 = new Motorista("André", "45678", new ContaCorrente());
        Motorista motorista5 = new Motorista("Barquinho", "56789", new ContaCorrente());

        System.out.println("Cadastrando os motoristas...");
        
        uber1.cadastraMotorista(motorista1);
        uber1.cadastraMotorista(motorista2);
        uber1.cadastraMotorista(motorista3);
        uber1.cadastraMotorista(motorista4);
        uber1.cadastraMotorista(motorista5);
        
        System.out.println("Criando os passageiros...");
        
        Passageiro p1 = new Passageiro("Antonio", "789564", new ContaCorrente(44543, 550, "58935"), new Data(20, 10, 2020, 16, 35, 5));
        Passageiro p2 = new Passageiro("Andrea", "666978", new ContaCorrente(44543, 400, "58935"), new Data(20, 10, 2020, 17, 35, 5));
        Passageiro p3 = new Passageiro("Susy", "458723", new ContaCorrente(44543, 450, "58935"), new Data(20, 10, 2020, 15, 40, 5));
        Passageiro p4 = new Passageiro("Bruno", "123112", new ContaCorrente(44543, 500, "58935"), new Data(20, 10, 2020, 20, 35, 5));
        
        System.out.println("Cadastrando corrida sem categoria...");
        
        Corrida c1 = new Corrida(new Data(22, 10, 2020, 21, 9, 0), new Data(22, 10, 2020, 21, 15, 0), 5, 
                new ArrayList<Passageiro>(Arrays.asList(p1,p2)));
        
        System.out.println("Solicitando corrida sem categoria...");
        
        uber1.solicitarCorrida(c1);
        
        System.out.println("Criando Corrida Vip...");
        
        CorridaVIP cvip = new CorridaVIP(new Data(30, 10, 2020, 20, 45, 10), new Data(30, 10, 2020, 20, 55, 2), 12, 
                new ArrayList<Passageiro>(Arrays.asList(p2, p3, p4)));
        
        System.out.println("Solicitando corrida vip...");
        uber1.solicitarCorrida(cvip);
        
        System.out.println("Mapeando para motorista...");
        uber1.mapeiaCorridaParaMotorista();
        uber1.mapeiaCorridaParaMotorista();
        uber1.mapeiaCorridaParaMotorista();
        uber1.mapeiaCorridaParaMotorista();
        uber1.mapeiaCorridaParaMotorista();
        System.out.println("Corrida VIP finalizada.");
        

        
    }
}
