public class EmpregadoAssalariado extends EmpregadoComissionado {
    double salariobase;

    public EmpregadoAssalariado( String primeiroNome, String sobrenome, String CPFString, double Vendastotais, double porcentagemdecomicao, double salariobase){
        
        super(primeiroNome, sobrenome, CPFString, Vendastotais, porcentagemdecomicao);
        setSalariobase(salariobase);

    }

    public double getSalariobase() {
        return salariobase;
    }

    public void setSalariobase(double salariobase) {
        if (salariobase > 0){
        this.salariobase = salariobase;
        }else {
            this.salariobase=0; 
            System.out.println("Salario Base Invalido");
        }
    }

    public double salariofinal(){
        return getSalariobase() + super.salario();
    }

    

    public String toString(){
        return String.format(super.toString() + "\n Salario Final :" + salariofinal());
    }
}
