import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Property {
    List<FileDate> fileDates;

    public Property(){}

    public Property(List<FileDate> fileDates) {
        this.fileDates = fileDates;
    }

    public void addProperty(FileDate fileDate){
        this.fileDates.add(fileDate);
    }

    public void showProperty(){
            System.out.println("Property number: " + fileDates.get(0).getPropretyNumber() +
                    "\nType of property: " + fileDates.get(0).getTypeOfProprety() +
                    "\nPrice: " + fileDates.get(0).getPrice() +
                    "\nAgent ID: " + fileDates.get(0).getAgentID());
    }

    public void sortAlphabetic(){

    }

}
