public class Diario {
    
    private String nome;
    private String codigo;

    public Diario(){}

    public Diario(String Nome, String Codigo  ){
        setNome(Nome);
        setCodigo(Codigo);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

   public void mostramensagem(){

    System.out.print("Bem vindo ao diário de " + getNome());

   }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String Codigo) {
        codigo = Codigo;
    }

    public void mostraDiario(){
        System.out.println("Nome da disciplina: "+ nome +"\n" +" Codido da disciplina: "+ codigo);
    }

}
