import java.io.IOException;

public class Application{

    public static void main(String[] args) throws IOException{
        DuplicateRemover remove = new DuplicateRemover();
        remove.duplicateRemover("problem1.txt");
        remove.write("unique_words.txt");
        System.out.println("DuplicateRemover complete");

        DuplicateCounter count = new DuplicateCounter();
        count.duplicateCounter("problem2.txt");
        count.write("unique_word_counts.txt");
        System.out.println("DuplicateCounter complete");
    }

}