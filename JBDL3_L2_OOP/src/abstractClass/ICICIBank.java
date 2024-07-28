package abstractClass;

public class ICICIBank extends Bank{
    @Override
    public void calculateInterest() {
        System.out.println("inside the ICICI Bank Method");
    }
}
