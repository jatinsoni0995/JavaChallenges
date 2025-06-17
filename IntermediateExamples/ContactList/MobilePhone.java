package ContactList;

import java.util.ArrayList;

public class MobilePhone {

    private String myNumber;

    private ArrayList<Contact> myContacts;

    public MobilePhone(String phoneNumber){
        this.myNumber = phoneNumber;
        this.myContacts = new ArrayList<>();
    }

    public int findContact(String name){

        for(int i = 0; i < myContacts.size(); i++){
            Contact contact = myContacts.get(i);
            if (contact.getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    private int findContact(Contact contact){
        return myContacts.indexOf((contact));
    }

    public boolean addContact(Contact contact){
        if(findContact(contact.getName()) >= 0){
            System.out.println("Contact is already in the list");
            return false;
        }
        myContacts.add(contact);
        return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContact){
        if(findContact(oldContact) == -1){
            System.out.println(oldContact.getName() + " is not found in the list");
            return false;
        }
        myContacts.set(myContacts.indexOf(oldContact),newContact);
        return true;
    }

    public boolean removeContact(Contact contact){
        if(findContact(contact) >= 0){
            myContacts.remove(contact);
            return true;
        }
        return false;
    }

    public Contact queryContact(String name){

        int position = findContact(name);
        if(position >= 0) {
            return this.myContacts.get(position);
        }
        return null;
    }

    public void printContact(){
        System.out.println("Contact List: ");
        for(int i = 0; i < myContacts.size(); i++){
            System.out.println((i+1) + ". " + myContacts.get(i).getName() + " -> " + myContacts.get(i).getPhoneNumber());
        }
    }
}
