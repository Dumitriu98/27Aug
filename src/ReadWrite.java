import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadWrite {
    String buf = "";
    public void read(String fisier) {
        int c;
        FileReader f = null;
        try {
            f = new FileReader(fisier);

            while ((c = f.read()) != -1) {
                buf = buf + (char) c;
            }
            f.close();
        }
        catch(FileNotFoundException e){
            System.out.println("The file not found!");
        }
        catch(IOException e){
            System.out.println("Error at read!");
        }
    }

    public void write(String file){
        FileWriter f = null; try {
            f = new FileWriter(file);
            f.write(buf);
            f.close();
        }
        catch (IOException e) {
            System.out.println("Error at write!");
        }
    }
}


