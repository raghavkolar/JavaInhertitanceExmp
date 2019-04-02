package love.programing;

public class Customer {

   private int id;
    private String customerFristName;
    private String CustomerSurname;
    private boolean islicensed;
   private String gender;

    public Customer(int iD,String cFN, String cSN,boolean dL,String gen) {
        this.customerFristName=cFN;
        this.CustomerSurname=cSN;
        this.id=iD;
        this.islicensed=dL;
        this.gender=gen;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCustomerFristName() {
        return customerFristName;
    }

    public void setCustomerFristName(String customerFristName) {
        this.customerFristName = customerFristName;
    }

    public String getCustomerSurname() {
        return CustomerSurname;
    }

    public void setCustomerSurname(String customerSurname) {
        CustomerSurname = customerSurname;
    }

    public boolean isIslicensed() {
        return islicensed;
    }

    public void setIslicensed(boolean islicensed) {
        this.islicensed = islicensed;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
