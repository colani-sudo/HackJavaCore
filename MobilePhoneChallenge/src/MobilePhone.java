import java.util.ArrayList;

public class MobilePhone {
    String myNumber;
    ArrayList<Contact> myContact;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContact = new ArrayList<Contact>();
    }
    public boolean addNewContact(Contact contact){

        if(findContact(contact.getName()) >= 0){
            System.out.println(contact.getName() + " " + contact.getPhoneNumber() + " has already added.");
            return false;
        }
        this.myContact.add(Contact.createContact(contact.getName(), contact.phoneNumber));
        return true;
    }
    private int findContact(Contact contact){
        for(int i=0; i < this.myContact.size(); i++){
            Contact contact1 = this.myContact.get(i);
            if(contact.getName().equals(contact.getName())){
                return i;
            }
        }
        return -1;
    }
    private int findContact(String name){
        for(int i=0; i < this.myContact.size(); i++){
            Contact contact = this.myContact.get(i);
            if(contact.getName().equals(name)){
                return i;
            }
        }
        return -1;
    }
    public boolean updateContact(Contact oldContact, Contact newContact){
        int foundPosition = findContact(oldContact);
        if(findContact(oldContact) < 0){
            System.out.println(oldContact.getName() + " " + oldContact.getPhoneNumber() +
                    " cannot be found in contact list");
            return false;
        }else if(findContact(newContact.getName()) != -1){
            System.out.println("Contact with name " + newContact.getName() +
                    " already exists. Update was not successful.");
            return false;
        }
        myContact.set(foundPosition, newContact);
        System.out.println(oldContact.getName() + ", was replaced with ," + newContact.getName());
        return true;
    }
    public boolean removeContact(Contact contact){
        int foundPosition = findContact(contact);
        if(foundPosition >= 0){
            this.myContact.remove(foundPosition);
            System.out.println(contact.getName() + ", was deleted.");
            return true;
        }
        System.out.println(contact.getName() + " " + contact.getPhoneNumber() +
                " does not exist in contact list");
        return false;
    }
    public Contact queryContact(String name){
        int foundPosition = findContact(name);
        if(foundPosition < 0){
            System.out.println(name +
                    " cannot be found in contact list");
            return null;
        }
        return this.myContact.get(foundPosition);
    }
    public void printContact(){
        System.out.println("Contact List:");
        for(int i=0; i < this.myContact.size(); i++){
            System.out.println((i+1) + " " + this.myContact.get(i).getName() + " -> " +
                    this.myContact.get(i).getPhoneNumber());
        }
    }
}
