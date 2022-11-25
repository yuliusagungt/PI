package LinkedListOrdered;
public class Term {
    String word;
    LinkedLIstOrderedUnique dokumen;

    public Term(String word) {
        this.word = word;
        dokumen = new LinkedLIstOrderedUnique();
    }
    public Term() {
        this.word = null;
        dokumen = new LinkedLIstOrderedUnique();
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }
    
    public void addDokumen(String dokumen){
        this.dokumen.addSort(dokumen);
    }

    public LinkedLIstOrderedUnique getDokumen() {
        return dokumen;
    }
    
    
}