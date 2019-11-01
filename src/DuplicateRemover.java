import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class DuplicateRemover{
    ArrayList<String> uniqueWords = new ArrayList<String>();

    public void remove(String dataFile) throws IOException{
        BufferedReader buff = new BufferedReader(new FileReader(dataFile));
        String line = buff.readLine();

        while(line != null){
            String temp[] = line.split(" ");

            for(String i:temp){
                if(!uniqueWords.contains(i))   uniqueWords.add(i);
            }
            line = buff.readLine();
        }
        buff.close();
    }

    public void write(String outputFile) throws FileNotFoundException{
        PrintWriter writer = new PrintWriter(outputFile);

        for(String i:uniqueWords){
            writer.print(i + " ");
        }
        writer.close();
    }

}