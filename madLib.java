import java.util.Scanner;
public class madLib {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("It was a ");
        System.out.println("Choose an adjective.");
        String adj1 = scanner.next();
        System.out.println(", cold November day I woke up to the ");
        System.out.println("Choose another adjective.");
        String adj2 = scanner.next();
        System.out.println("smell of ");
        System.out.println("Choose a type of bird.");
        String typeOfBird = scanner.next();
        System.out.println("roasting in the  ");
        System.out.println("Choose a room in the house.");
        String room = scanner.next();
        System.out.println("downstairs I ");
        System.out.println("Choose a verb in past tense");
        String verbPastTense = scanner.next();
        System.out.println("down the stairs to see if i could help ");
        System.out.println("Choose a verb.");
        String verb = scanner.next();
        System.out.println("the dinner.");
        String fullSentence = "It was a "+adj1+ ", cold November day I woke up to the "+adj2+ " smell of "+typeOfBird+
                " roasting in the "+room+" downstair I "+verbPastTense+"down the stairs to see if i could help "+ verb+
                " the dinner";
        System.out.println(fullSentence);
    }
}