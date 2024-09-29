public class Empresa {
    public static void main(String[] args) throws Exception {
        EmpregadoComissionado jose = new EmpregadoComissionado("José", "Carlos", "047.090.425-94", 100000, 0.25);

        EmpregadoAssalariado kayo = new EmpregadoAssalariado("José", "Carlos", "047.090.425-94", 100000, 0.25, 20000);

        System.out.println(jose);
        
        System.out.println(kayo);
    }
}
