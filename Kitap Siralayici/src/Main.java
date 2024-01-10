import java.util.*;

public class Main {
    public static void main(String[] args) {

        Set<book> books= new HashSet<>();

        book b1 = new book("Rahibe", 208, "Denis Diderot", 1796);
        book b2 = new book("Sessizlik Üzerine", 302, "David Le Breton", 2021);
        book b3 = new book("Cathay", 61, "Ezra Pound", 1963);
        book b4 = new book("Eristik Diyalektik", 88, "Arthur Schopenhauer", 1831);
        book b5 = new book("Kuzeye Giden İnce Yol", 176, "Matsuo Basho", 1702);

        Set<book> sortedByName = new TreeSet<>(books);

        sortedByName.add(b1);
        sortedByName.add(b2);
        sortedByName.add(b3);
        sortedByName.add(b4);
        sortedByName.add(b5);

        System.out.println("Alfabetik Şekilde Sıralı: \n");
        for (book n : sortedByName) {
            System.out.println(n.getName());
        }

        Set<book> sortedByPageCount = new TreeSet<>(new orderPageNumber());
        sortedByPageCount.add(b1);
        sortedByPageCount.add(b2);
        sortedByPageCount.add(b3);
        sortedByPageCount.add(b4);
        sortedByPageCount.add(b5);

        System.out.println("\nSayfa sayısına göre sıralı: \n");
        for (book p : sortedByPageCount) {
            System.out.println(p.getName() + " - " + " sayfa sayısı: "+p.getPageNum());
        }


    }
}