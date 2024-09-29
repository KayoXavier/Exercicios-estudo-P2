public class EmpregadoComissionado {
    private String primeiroNome;
    private String sobrenome;
    private String CPFString;
    private double Vendastotais;
    private double porcentagemdecomicao;

    public EmpregadoComissionado(){};

    public EmpregadoComissionado( String primeiroNome, String sobrenome, String CPFString, double Vendastotais, double porcentagemdecomicao){
        setPrimeiroNome(primeiroNome);
        setSobrenome(sobrenome);
        setCPFString(CPFString);
        setVendastotais(Vendastotais);
        setPorcentagemdecomicao(porcentagemdecomicao);
    }

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCPFString() {
        return CPFString;
    }

    public void setCPFString(String CPFString) {
        this.CPFString = CPFString;
    }

    public double getVendastotais() {
        return Vendastotais;
    }

    public void setVendastotais(double Vendastotais) {
        if (Vendastotais > 0){
            this.Vendastotais = Vendastotais;
        }
        else {
            this.Vendastotais = 0;
            System.out.println("Erro em registrar vendas");
        }
    }

    public double getPorcentagemdecomicao() {
        return porcentagemdecomicao;
    }

    public void setPorcentagemdecomicao(double porcentagemdecomicao) {
        if (porcentagemdecomicao>0.0 && porcentagemdecomicao<1.0){
            this.porcentagemdecomicao = porcentagemdecomicao;
        }else{
            System.out.println("Porcentagem de comissão inválida");
        }
   }

    public double salario(){
        return getPorcentagemdecomicao() * getVendastotais();
    }
    public String toString(){
        return String.format("Empregado Comissionado:" + getPrimeiroNome() +" " + getSobrenome() +"\nVendas totais:" + getVendastotais()+ "\nComissão: "+getPorcentagemdecomicao() +"\nSalario Final:" + salario());
    }
}
