public class Main {

    public static void main(String[] args)
    {
        ManCalculator manCalculator = new ManCalculator();
        manCalculator.hesapla();
        manCalculator.gameOver();

/*        GameCalculator gameCalculator = new GameCalculator() {
            @Override      // HATALI KULLANIM,ABSTRACT CLASS'LAR NEW'LENEMEZ
            public void hesapla() {
            }*/

        GameCalculator gameCalculator = new KidsCalculator();
    }
}

