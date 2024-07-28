package exception;

public class CustomExceptionMain {
    public static void main(String[] args) throws PersonNotEligible{
        doVoting(13);
    }

    public static void doVoting(int age) throws PersonNotEligible{
        if (age<18){
            throw new PersonNotEligible("Age is smaller than 18");
        }
        System.out.println("Voting Done");
    }
}
// creating the custom exception class
class PersonNotEligible extends Exception {

    PersonNotEligible(String msg){
        super(msg);
    }
}


