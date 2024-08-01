import memento.Document;
import memento.DocumentHistory;

public class Main {
    public static void main(String[] args) {
        Document doc = new Document();
        DocumentHistory history = new DocumentHistory();

        doc.setContent("this is a new content");
        history.push(doc.makeSnapshot());
        doc.setFontSize(22);
        history.push(doc.makeSnapshot());
        doc.setFontSize(32);
        history.push(doc.makeSnapshot());
        doc.setFontName("q");
        history.push(doc.makeSnapshot());

        doc.setFontName("qwe");
        history.push(doc.makeSnapshot());

        doc.setFontSize(69);
        history.push(doc.makeSnapshot());

        history.pop();
        doc.restore(history.pop());
        System.out.println(doc);
    }
}
