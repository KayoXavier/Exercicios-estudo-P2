import java.util.Random;

public class ExemploRandom {

    public static void numerosaleatorios(int inicio, int fina){

        int total = (fina - inicio)+ 1;
        int n;
        int hist[] = new int[total];
        int soma = 0;
        for (int i=0; i<10000; i++){
            n =(int)(Math.random()*(fina - inicio + 1)+inicio);
            hist[n-inicio]++;
        }
        for (int k : hist ){
            
            soma = soma + k;
            System.out.printf("%d\n", k);
           
        }
        System.out.printf("%d\n", soma);

    }
    public static void numerosaleatoriosRandom(int inicio, int fina){

        int total = (fina - inicio)+ 1;
        int n;
        int hist[] = new int[total];
        int soma = 0;
        Random random = new Random();

        for (int i=0; i<10000; i++){
            n =random.nextInt(total);
            hist[n]++;
        }
        for (int k : hist ){
            
            soma = soma + k;
            System.out.printf("%d\n", k);
           
        }
        System.out.println("Soma: "+ soma);
    }
}
