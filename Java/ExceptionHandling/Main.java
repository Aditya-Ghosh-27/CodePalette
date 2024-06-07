import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class FileReaderExample{
    public void readFile(String filePath) throws IOException{
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line;
        while((line = reader.readLine()) != null){
            System.out.println(line);
        }
        reader.close();
    }
}

public class Main{
    public static void main(String[] args) {
        FileReaderExample example = new FileReaderExample();
        try{
            example.readFile("example.txt");
        }
        catch(IOException e){
            System.out.println("Caught an IO Exception: " + e.getMessage());
        }
    }
}