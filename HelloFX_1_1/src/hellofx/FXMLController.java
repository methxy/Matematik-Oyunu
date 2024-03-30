package hellofx;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javax.swing.JOptionPane;

public class FXMLController {

    IslemOlustur islemOlustur;
    int gercekSonuc;
    int dogrusayisi = 0;
    int yanlissayisi = 0;
   
    
    ActionEvent a;
    
    

    @FXML
    private AnchorPane baslaEkrani;

    @FXML
    private Button carpmaSecim;

    @FXML
    private TextField cevapGirisi;

    @FXML
    private Label enYuksek;

    @FXML
    private Button cikarmSecim;

    @FXML
    private Label dogruSayisi;

    @FXML
    private Button onayla;

    @FXML
    private AnchorPane oyunEkrani;

    @FXML
    private AnchorPane panel;

    @FXML
    private Label sorular;

    @FXML
    private Button toplamaSecim;

    @FXML
    private Label yanlisSayisi;

    @FXML
    void carpmaSecme(ActionEvent event) {

        
        baslaEkrani.setVisible(false);
        oyunEkrani.setVisible(true);

        while (true) {
            int sayi1 = (int) (Math.random() * 10);
            int sayi2 = (int) (Math.random() * 10);
            islemOlustur = new Carpma(sayi1, sayi2);
            sorular.setText(islemOlustur.getIslemYazi());
            gercekSonuc = islemOlustur.getSonuc();
            break;

        }
    }

    @FXML
    void cikarmaSecme(ActionEvent event) {

    
        baslaEkrani.setVisible(false);
        oyunEkrani.setVisible(true);
        while (true) {
            int sayi1 = (int) (Math.random() * 100);
            int sayi2 = (int) (Math.random() * 100);
            islemOlustur = new Cikarma(sayi1, sayi2);
            sorular.setText(islemOlustur.getIslemYazi());
            gercekSonuc = islemOlustur.getSonuc();
            break;

        }

    }

    @FXML
    void entertikla(KeyEvent e) {
        if (e.getCode().equals(KeyCode.ENTER)) {
            onayla(a);

        }
    }

   

    @FXML
    void onayla(ActionEvent event) {
        int kullaniciCevap = 0;

        try {
            kullaniciCevap = Integer.parseInt(cevapGirisi.getText());
        } catch (Exception e) {
            JOptionPane uyari = new JOptionPane();
            JOptionPane.showMessageDialog(uyari, "Sayı Gir!");
        }

        while (true) {
            if (kullaniciCevap == gercekSonuc) {
                cevapGirisi.setText("");
                dogrusayisi++;
                dogruSayisi.setText("Doğru Sayısı: " + dogrusayisi);
                
                
                
                if (islemOlustur.islemSecimi == 2) {
                    carpmaSecme(event);
                    break;
                } else if (islemOlustur.islemSecimi == 1) {
                    toplamaSecme(event);
                    break;
                } else if (islemOlustur.islemSecimi == 3) {
                    cikarmaSecme(event);
                    break;
                }
            } else {
                cevapGirisi.setText("");
                yanlissayisi++;
                yanlisSayisi.setText("Yanlış Sayısı: " + yanlissayisi);
                if (islemOlustur.islemSecimi == 2) {
                    carpmaSecme(event);
                    break;
                } else if (islemOlustur.islemSecimi == 1) {
                    toplamaSecme(event);
                    break;
                } else if (islemOlustur.islemSecimi == 3) {
                    cikarmaSecme(event);
                    break;
                }

            }

        }

    }

    @FXML
    void toplamaSecme(ActionEvent event) {
        
        baslaEkrani.setVisible(false);
        oyunEkrani.setVisible(true);
        while (true) {
            int sayi1 = (int) (Math.random() * 100);
            int sayi2 = (int) (Math.random() * 100);
            islemOlustur = new Toplama(sayi1, sayi2);
            sorular.setText(islemOlustur.getIslemYazi());
            gercekSonuc = islemOlustur.getSonuc();
            break;

        }
    }

   

}
