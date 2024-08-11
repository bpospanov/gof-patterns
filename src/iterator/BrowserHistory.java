package iterator;

public class BrowserHistory {
    private final String[] urls = new String[10];
    private int size = 0;

    public void push(String url) {
        urls[size++] = url;
    }

    public String pop() {
        return urls[--size];
    }

    public Iterator<String> createIterator() {
        return new ArrayIterator(this);
    }

    public static class ArrayIterator implements Iterator<String> {
        private final BrowserHistory history;
        private int index = 0;

        public ArrayIterator(BrowserHistory history) {
            this.history = history;
        }

        @Override
        public boolean hasNext() {
            return (index < history.size);
        }

        @Override
        public void next() {
            index++;
        }

        @Override
        public String current() {
            return history.urls[index];
        }
    }
}
