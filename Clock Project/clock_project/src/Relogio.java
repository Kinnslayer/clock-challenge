import javax.swing.JOptionPane;

public class Relogio {

    public int retornaAnguloRelogio (int hora, int minuto) {

        while (hora > 12 || hora < 0 || minuto > 59 || minuto < 0) {
            JOptionPane.showMessageDialog(null, "Por favor insira um número válido");
            hora = Integer.parseInt(JOptionPane.showInputDialog(
                "Insira a(s) hora(s) do relógio entre 0 e 12: "));
            minuto = Integer.parseInt(JOptionPane.showInputDialog(
                "Insira o(s) minuto(s) do relógio entre 0 e 59: "));
        } 
            
        double horaAnguloPonteiro = (hora * 30) + (minuto * 0.5);

        double minutoAnguloPonteiro = minuto * 6;

        int angulo = (int) (horaAnguloPonteiro - minutoAnguloPonteiro) * -1;

        return Math.min(angulo, 360 - angulo);
    }
}
