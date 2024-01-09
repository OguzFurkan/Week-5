import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Dizi tanımlama
        String[] dreamTeam = {"Buffon", "Cafu", "Cannavaro", "Maldini", "Carlos", "Scholes", "Xavi", "Iniesta", "Messi", "Ozil", "Henry"};

        // Kullanıcıdan indeks isteme
        Scanner scanner = new Scanner(System.in);
        System.out.print("Oyuncunun indeksi girin: ");
        int indeks = scanner.nextInt();

        // Metodu çağırma ve sonucu yazdırma
        try {
            String futbolcu = getirDiziElemani(dreamTeam, indeks);
            System.out.println("Belirtilen indeksteki futbolcu: " + futbolcu);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Hata: Belirtilen indekste Rüya Takımdan oyuncu bulunmuyor!");
        }
    }

    // Diziyi döndüren metot
    public static String getirDiziElemani(String[] dizi, int indeks) throws ArrayIndexOutOfBoundsException {
        // Belirtilen indeks dizi boyutunun dışındaysa hatayı fırlat
        if (indeks < 0 || indeks >= dizi.length) {
            throw new ArrayIndexOutOfBoundsException();
        }

        // Belirtilen indeksteki futbolcuyu döndür
        return dizi[indeks];
    }
}
