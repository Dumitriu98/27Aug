public class FileDate {
    private String propretyNumber;
    private String typeOfProprety;
    private String price;
    private String agentID;

    public void FileDate(){}

    public String getPropretyNumber() {
        return propretyNumber;
    }

    public void setPropretyNumber(String propretyNumber) {
        this.propretyNumber = propretyNumber;
    }

    public String getTypeOfProprety() {
        return typeOfProprety;
    }

    public void setTypeOfProprety(String typeOfProprety) {
        this.typeOfProprety = typeOfProprety;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getAgentID() {
        return agentID;
    }

    public void setAgentID(String agentID) {
        this.agentID = agentID;
    }

    public void updateTypeOfProperty(){
        setTypeOfProprety(getTypeOfProprety().replace(getTypeOfProprety().charAt(0),getTypeOfProprety().toUpperCase().charAt(0)));
    }


}
