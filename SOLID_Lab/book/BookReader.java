import java.util.List;
import java.util.ListIterator;

public class BookReader extends Book implements Reader{  
    public BookReader(String title, List<String> pages){
        super(title,pages);
    }
    
    @Override
    public void printToScreen(){
        Book book = this;
        do {
            System.out.println(book.getCurrentPage());
        } while (book.turnToNextPage());
    }


    //test
    public static void main(String[] args) {
        BookReader bookreader = new BookReader("Tyland", List.of("I", "moved", "here", "recently", "too"));
        bookreader.printToScreen();
    }
}
