package abstractClasses;

public abstract class GameCalculator {
    public abstract void hesapla();
    public abstract void durum();
    public final void gameOver(){
        System.out.println("Oyun Bitti");
    }}
