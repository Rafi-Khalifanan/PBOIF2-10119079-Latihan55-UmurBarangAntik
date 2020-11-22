package pboif2.pkg10119079.latihan56.umurbarangantik;

/**
 *
 * @author Khaz
 * NAMA     :   Rafi Khalifanan A
 * KELAS    :   IF2
 * NIM      :   10119079
 * DESKRIPSI:
 *
 */
public class PBOIF210119079Latihan56UmurBarangANtik {
    public static void main(String[] args) {
        Radio radio = new Radio(234);
        radio.setName("Radio AM");
        System.out.println("Nama barang antik : " + radio.getName());
        radio.tampilUmur();
    }
    
}

