import javax.swing.JOptionPane;

public class Main {
    public static void main (String[] args){

        Relogio anguloPonteiros = new Relogio();
           
        int resultadoAngulo = anguloPonteiros.retornaAnguloRelogio(Integer.parseInt(JOptionPane.showInputDialog(
        "Insira a(s) hora(s) do relógio entre 0 e 12: ")), Integer.parseInt(JOptionPane.showInputDialog(
        "Insira o(s) minuto(s) do relógio entre 0 e 59: ")));

        JOptionPane.showMessageDialog(null,"O ângulo entre os ponteiros é de: " + resultadoAngulo + "°");
    }
}
