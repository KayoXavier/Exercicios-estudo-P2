public class Banco {
    public static void main(String[] args) throws Exception {

        Conta conta1 = new Conta("Kayo", 100.50);
        Conta conta2 = new Conta("Kayo", 100);
        conta1.Deposita();
        conta1.Sacar();
        conta2.Deposita();
        conta2.Sacar();
        ExemploRandom.numerosaleatorios(25, 30);
        ExemploRandom.numerosaleatoriosRandom(25, 30);
    }
}

