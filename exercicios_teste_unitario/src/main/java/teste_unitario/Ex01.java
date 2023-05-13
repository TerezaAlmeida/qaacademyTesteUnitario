package teste_unitario;

import javax.swing.JOptionPane;

public class Ex01 {
    public static String retornaPalavra(){
        String palavra = "bom dia";
        return palavra;
    }

    public static boolean inserirCPF(){
        String cpf = JOptionPane.showInputDialog("Digite seu cpf"); 
        if (cpf.length() != 11){
            return false;
        }
        return true;   
    }
}
