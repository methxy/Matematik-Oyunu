package hellofx;

public class Toplama extends IslemOlustur {

    public Toplama(int sayi1, int sayi2) {
        super(sayi1, sayi2);
        this.setSonuc(sayi1 + sayi2);
        this.setIslemYazi(String.valueOf(sayi1) + " + " + String.valueOf(sayi2) + ":");
        islemSecimi = 1;
    }

}
