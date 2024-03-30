package hellofx;

public class IslemOlustur {

    private int sayi1;
    private int sayi2;
    private String islemYazi;
    private int sonuc;
    static int dogruCevap = 0;
    int islemSecimi;

    
    
    public IslemOlustur(int sayi1, int sayi2) {
        this.sayi1 = sayi1;
        this.sayi2 = sayi2;
    }

    public int getSayi1() {
        return sayi1;
    }
    public void setSayi1(int sayi1) {
        this.sayi1 = sayi1;
    }
    public int getSayi2() {
        return sayi2;
    }
    public void setSayi2(int sayi2) {
        this.sayi2 = sayi2;
    }
    public String getIslemYazi() {
        return islemYazi;
    }
    public void setIslemYazi(String islemYazi) {
        this.islemYazi = islemYazi;
    }
    public int getSonuc() {
        return sonuc;
    }
    public void setSonuc(int sonuc) {
        this.sonuc = sonuc;
    }
    public int getDogruCevap() {
        return dogruCevap;
    }
    public void setDogruCevap(int dogruCevap) {
        this.dogruCevap = dogruCevap;
    }

    

}
