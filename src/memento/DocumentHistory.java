package memento;

import java.util.ArrayList;
import java.util.List;

public class DocumentHistory {
    final List<DocumentState> states = new ArrayList<>();

    public void push(DocumentState documentState) {
        states.add(documentState);
    }

    public DocumentState pop() {
        int lastIndex = states.size() - 1;
        DocumentState lastItem = states.get(lastIndex);
        states.remove(lastItem);
        return lastItem;
    }
}
