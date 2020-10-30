public class ContaCorrente {
    
    private String nome;
    private String cpf = "000.000.000-00";
    private int senha = 4561;
    private double saldo = 500.0;
    
    public ContaCorrente() {
        
    }
    
    public ContaCorrente(int senha, double saldo, String cpf) {
        this.senha = senha;
        this.saldo = saldo;
        this.cpf = cpf;
    }
        
    public boolean autenticaSenha (int senha) {
        if(this.senha == senha) {
            return true;
        }
        return false;
    }
    
    public boolean realizarTransferencia (double valor) {
        boolean output = true;
        
        if(saldo >= valor) {
            saldo -= valor;
            System.out.println("\t\tTransferencia realizada com sucesso!");
        } else {
            System.out.println("\t\tTransferencia não realizada!");
            output = false;
        }
        
        return output;
    }
    
    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
        }
    }
    
    public String getNome() {
        return nome;
    }
    
    public double getSaldo() {
        return saldo;
    }
    
    public String getCpf() {
        return cpf;
    }
    
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void setSenha(int senha) {
        this.senha = senha;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
}

    