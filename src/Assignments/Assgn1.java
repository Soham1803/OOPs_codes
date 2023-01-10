package Assignments;

class Participant{
    static int counter;
    static{
         counter = 1001;
    }
    String registrationId = "D"+counter;
    String name = new String();
    long contactNumber;
    String branch = new String();
    public Participant(String name, long contactNumber, String branch){
        this.name = name;
        this.contactNumber = contactNumber;
        this.branch = branch;
        counter++;
    }

    public String getName(){
        return this.name;
    }

    public String getRegistrationId(){
        return this.registrationId;
    }
}

public class Assgn1 {
    public static void main(String[] args) {

        Participant participant1 = new Participant("Rohit", 1234567889L, "Computer");

        Participant participant2 = new Participant("Sayli", 1988612300L, "Mechanical");

//Create two more instances of Participant Class

        Participant[] participants = { participant1, participant2 };

        for (Participant participant : participants) {

            System.out.println("Hi "+participant.getName()+"! Your registration id is "+participant.getRegistrationId()+".");

        }
    }
}
