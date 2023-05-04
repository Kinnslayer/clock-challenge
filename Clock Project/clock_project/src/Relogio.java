public class Relogio {

    public int retornaAnguloRelogio (int hora, int minuto) {
       
        double horaAnguloPonteiro = (hora * 30) + (minuto * 0.5);

        double minutoAnguloPonteiro = minuto * 6;

        int angulo = (int) (horaAnguloPonteiro - minutoAnguloPonteiro) * -1;

        return Math.min(angulo, 360 - angulo);
    }
}
