package memento;

public class Document {
    private String content;
    private String fontName;
    private int fontSize;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getFontName() {
        return fontName;
    }

    public void setFontName(String fontName) {
        this.fontName = fontName;
    }

    public int getFontSize() {
        return fontSize;
    }

    public void setFontSize(int fontSize) {
        this.fontSize = fontSize;
    }

    public DocumentState makeSnapshot() {
        return new DocumentState(
            content=this.getContent(),
            fontName=this.getFontName(),
            fontSize=this.getFontSize()
        );
    }

    public void restore(DocumentState snapshot) {
        this.setContent(snapshot.content());
        this.setFontName(snapshot.fontName());
        this.setFontSize(snapshot.fontSize());
    }

    @Override
    public String toString() {
        return "Document{" +
                "content='" + content + '\'' +
                ", fontName='" + fontName + '\'' +
                ", fontSize=" + fontSize +
                '}';
    }
}
