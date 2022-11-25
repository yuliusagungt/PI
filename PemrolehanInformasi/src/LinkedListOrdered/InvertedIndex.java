package LinkedListOrdered;

public class InvertedIndex {
    LinkedLIstOrderedUnique<Term> dictionary;
    
    public InvertedIndex() {
        dictionary = new LinkedLIstOrderedUnique();
    }
    
    public void search(String data){
        this.dictionary.search(data);
    }
    
    public void add(String term,String dokumen){
        Term temp = new Term(term);
        temp.setWord(term);
        temp.addDokumen(dokumen);
        if (this.dictionary.getInputString(temp.getWord()) == null) {
            this.dictionary.addTerm(temp);
        }else{
            Term data = this.dictionary.getInputString(temp.getWord());
            data.addDokumen(dokumen);
        }
    }
}