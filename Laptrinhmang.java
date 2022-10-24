
import java.io.*;

public class Laptrinhmang {
    public static void main(String[] args) throws IOException {
        File inputFile = new File("dung.txt");
        File outputFile = new File("tuand.txt");
        FileReader in = new FileReader(inputFile);
        try (FileWriter Out = new FileWriter(outputFile)) {
            int c;
            while ((c = in.read()) != -1)
                Out.write(c);
        }
        in.close();

    }
}