import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        ReadWrite readWrite = new ReadWrite();

    //Prompt the user for the name of the input file (listings.txt) and validate.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write the name of file: ");
        String file = scanner.next();
        boolean ok = true;

        List<FileDate> fileDates = new ArrayList<>();
        Property proprety = new Property(fileDates);

        FileDate fileDate = new FileDate();
        String line;


        while(ok) {
            if (file.equals("listings.txt")) {
                //Open listings.txt file and read the property listings.
                FileInputStream f = new FileInputStream("listings.txt");
                InputStreamReader fchar = new InputStreamReader(f);
                BufferedReader buf = new BufferedReader(fchar);

                System.out.println("\nThe data in the file is:");
                while((line = buf.readLine()) != null) {
                    System.out.println("\n" + line);
                    String[] elements = line.split(" ");

                    fileDate.setPropretyNumber(elements[0]);
                    fileDate.setTypeOfProprety(elements[1]);
                    fileDate.setPrice(elements[2]);
                    fileDate.setAgentID(elements[3]);

                    fileDate.updateTypeOfProperty();
                    proprety.addProperty(fileDate);
                    proprety.showProperty();

                }
                ok = false;

            } else {
                System.out.println("\nThe name of file is incorrect! \nWrite another: ");
                file = scanner.next();
            }
        }
        

        readWrite.write("agentreport.txt");
    }
}
