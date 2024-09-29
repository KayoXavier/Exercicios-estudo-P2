
public class App {
    public static void main(String[] args) throws Exception {

        Celular celular1 = new Celular();
        celular1.setCapacidade(128);
        celular1.setMemoria( 12);
        celular1.setOperatingSystem("IOS"); 
        celular1.setTamanhoTela(6.1f);
        celular1.setNome("iPhone 13") ;

        System.out.format("\nCelular %s com tela de tamanho %.1f, armazenamento de %d, memoria de %d GB e sistema operacional %s\n", celular1.getNome(),celular1.getTamanhoTela(),celular1.getCapacidade(),celular1.getMemoria(),celular1.getOperatingSystem());
        
        Celular celular2 = new Celular();
        
        celular2.setCapacidade(512);
        celular2.setMemoria( 14);
        celular2.setOperatingSystem("Android"); 
        celular2.setTamanhoTela(6.9f);
        celular2.setNome("S24 Ultra") ;
       
        
        System.out.format("\nCelular %s com tela de tamanho %.1f, armazenamento de %d, memoria de %d GB e sistema operacional %s\n", celular2.getNome(),celular2.getTamanhoTela(),celular2.getCapacidade(),celular2.getMemoria(),celular2.getOperatingSystem());
        
        
        Personagem personagem2 = new Personagem();

        personagem2.criapersonagem();
        personagem2.mostrapersonagem();

    }
    
}
