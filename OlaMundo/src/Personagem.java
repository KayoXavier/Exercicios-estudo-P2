
import javax.swing.JOptionPane;

public class Personagem {
    private String nome;
    private int nivel,poder, hp;

    public void criapersonagem(){
        
        nome = JOptionPane.showInputDialog("Qual o nome do personagem?");
        poder = Integer.parseInt(JOptionPane.showInputDialog("Qual o poder do personagem?"));
        nivel = Integer.parseInt(JOptionPane.showInputDialog( "Qual o nível do personagem?"));
        hp = Integer.parseInt(JOptionPane.showInputDialog("Qual o hp do personagem?"));

    }

    
    public void mostrapersonagem(){
     JOptionPane.showMessageDialog(null,"Nome:" +nome +"\nPoder:"+poder + "\nNível:"+ nivel +"\nHP:"+ hp);
    }
}
