package hellofx;

public class Carpma extends IslemOlustur {

    public Carpma(int sayi1, int sayi2) {
        super(sayi1, sayi2);
        this.setSonuc(sayi1 * sayi2);
        this.setIslemYazi(String.valueOf(sayi1) + " x " + String.valueOf(sayi2) + ":");
        islemSecimi = 2;
    }

}
