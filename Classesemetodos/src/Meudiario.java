public class Meudiario {
    public static void main(String[] args) throws Exception {

        Diario ED1 = new Diario("Estutura de dados I","BCC221");
        Diario ED2 = new Diario();
        ED2.setNome("Estrutura de dados II");
        ED2.setCodigo("BCC222");
        ED1.mostraDiario();
        ED2.mostraDiario();
    }
}
