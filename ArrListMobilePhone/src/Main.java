import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        boolean exit = false;
        int choice = 0;
//        mobilePhone.printInstructions();
//        switch (!exit){
//            System.out.println("Select an option: ");
//            choice = scanner.nextInt();
//            scanner.nextLine();
//            case 0:
//                printInstructions();
//                break;
//            case 1:
//                mobilePhone.printContactList();
//                break;
//            case 2:
//                mobilePhone.store();
//                break;
//            case 3:
//                mobilePhone.updateContactList();
//                break;
//            case 4:
//                mobilePhone.removeContact();
//                break;
//            case 5:
//                mobilePhone.searchContact();
//                break;
//            case 6:
//                exit = true;
//                break;
//        }
    }
    public static void printInstructions(){
        System.out.println("Select option here\n===========================");
        System.out.println("0. Print instructions");
        System.out.println("1. Print Contacts list");
        System.out.println("2. Add new contact");
        System.out.println("3. Update contact list");
        System.out.println("4. Remove contact");
        System.out.println("5. Search contact");
        System.out.println("6. Quit program");
    }
}