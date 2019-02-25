package dk.itu.helge.textreader;

public class WordCounter {

    private final String text;
    private String[] words;

    public WordCounter(String text) {
        this.text = text;
    }

    public int count() {
        if (this.words == null) {
            this.words = this.text.split("\\s+");
        }

        return this.words.length;
    }
}
