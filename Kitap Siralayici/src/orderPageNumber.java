import java.util.Comparator;

public class orderPageNumber implements Comparator<book> {

    @Override
    public int compare(book b1, book b2) {
        return b1.getPageNum()-b2.getPageNum();
    }
}