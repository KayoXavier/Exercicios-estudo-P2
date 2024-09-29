import java.util.*;

public class Conta {
    private String nome;
    private double  saldo;
    Scanner entrada = new Scanner(System.in);
    

    public  Conta(){

    }
    
    public Conta(String nome, int saldo){
        setNome(nome);
        setSaldo(saldo);

    }
    public Conta(String nome, double saldo){
        setNome(nome);
        setSaldo(saldo);

    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        System.out.printf("Metodo int\n");
        if (saldo > 0)
            this.saldo = saldo;
        else 
            this.saldo = 0;
    }

    public void setSaldo(double saldo) {
        System.out.printf("Metodo double\n");
        if (saldo > 80)
            this.saldo = saldo;
        else 
            this.saldo = 0;
    }

    
    public void Deposita(){
        double Valor;
        System.out.printf("Qual valor deseja depositar?");
        Valor = entrada.nextDouble();
        double temporaria = getSaldo();
        if (Valor >0){
        setSaldo( temporaria + Valor);
        System.out.printf("Seu novo saldo é : " + getSaldo()+ "\n");
        }
        else{
            System.out.printf("Não foi possível efetivar seu deposito\n");
        }
    }

    public void Sacar(){
        double Valor, temporaria;
        temporaria = getSaldo();
        System.out.print("Qual valor deseja sacar?");
        Valor = entrada.nextDouble();

        if (Valor > 0){
            setSaldo(temporaria - Valor);
            System.out.printf("Seu novo saldo é : %f\n", getSaldo());
        }
        else{
            System.out.printf("Não foi possível efetivar seu Saque\n");
        }
    }
}
