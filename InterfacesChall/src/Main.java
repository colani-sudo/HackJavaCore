import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Player tim = new Player("Tim", 10, 15);
        System.out.println(tim.toString());
        savedObject(tim);

        tim.setHitPoints(8);
        System.out.println(tim);
        tim.setWeapon("Sword");
        savedObject(tim);
        //loadObject(tim);
        System.out.println(tim);

        ISaveable werewolf = new Monster("Werewolf", 20, 40);
        //calling a get method or set method using an interface object
        //this is called casting
        System.out.println("Strength = " + ((Monster) werewolf).getStrength());
        //System.out.println(werewolf);
        savedObject(werewolf);

        //You can also call a getter or setter method using the normal method
        Monster werewolf2 = new Monster("Werewolf", 20, 40);
        System.out.println("Strength = " + werewolf2.getStrength());
    }
    public static ArrayList<String> readValues(){
        ArrayList<String> values = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" +
                "1 to enter a string\n" +
                "0 to quit");

        while(!quit){
            System.out.println("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.println("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }

    public static void savedObject(ISaveable objectToSave){
        for(int i=0; i<objectToSave.write().size(); i++){
            System.out.println("Saving " + objectToSave.write().get(i) + " to storage device");
        }
    }

    public static void loadObject(ISaveable objectToLoad){
        ArrayList<String> values =  readValues();
        objectToLoad.read(values);
    }
}