public class ContaCorrente {
    
    private String nome;
    private String cpf;
    private int senha;
    private double saldo;
    
    public ContaCorrente(int senha, double saldo, String cpf) {
        this.senha = 4561;
        this.saldo = 500;
        this.cpf = cpf;
    }
        
    public boolean autenticaSenha () {
        if(this.senha == senha) {
            return true;
        }
        return false;
    }
    
    public double realizarTransferencia (int senha, double valor) {
        if(saldo >= valor && autenticaSenha() == true) {
            saldo -= valor;
            System.out.println("Transferencia realizada com sucesso!");
        } else {
            System.out.println("Transferencia não realizada!");
        }
        return saldo;
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
    
    public int getSenha() {
        return senha;
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

    