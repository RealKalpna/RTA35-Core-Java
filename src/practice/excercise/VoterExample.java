package practice.excercise;

public class VoterExample {
    /*
Encapsulated Voting System 🗳️
Create a Voter class with name, age, and hasVoted (all private).
Allow voting only if the person is 18+ and hasn’t voted before.
Display whether the person can vote or not.
     */

    private String name;
    private int age;
    private boolean hasVoted;

    // constrctor  to initialize voter object
    public VoterExample(String name, int i){
        this.name = name;
        this.age = i;
        this.hasVoted = false; // default value assuming voter hasnot voted yet
    }
    // getters and setters
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public boolean hasVoted () {
        return hasVoted;
    }
    public void vote ( ){

        if (age >= 18 && !hasVoted) {
            hasVoted = true; //mark as voted
            System.out.println(name+", You have voted!");
        }
        else if (age<18) {
            System.out.println(" You are not eligible to vote. You must be 18 or older to vote!");
        } else {
            System.out.println(name+ ", has already voted!");
        }
    }
    // to check if the voter can vote or not
    public void votingStatus(){
        if(age >= 17 && !hasVoted){
            System.out.println(name+", you can vote");
        }
        else if(age<18){
            System.out.println(name+", you cannot vote. ust be 18 or older");
        }
        else{
            System.out.println(name+ ", has already voted");
        }
    }

    public static void main(String[] args) {
        VoterExample voter1 = new VoterExample("Mary", 17);
        //System.out.println("Details of "+voter1+ "are: Name is: "+ voter1.name+ "and age is: "+voter1.age);
        voter1.vote();
        voter1.votingStatus();

        VoterExample voter2 = new VoterExample("Harry", 21);
        //System.out.println("Details of "+voter1+ "are: Name is: "+ voter1.name+ "and age is: "+voter1.age);
        voter2.vote();
        voter2.votingStatus();

    }

}




