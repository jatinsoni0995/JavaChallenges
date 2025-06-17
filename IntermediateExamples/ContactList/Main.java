package ContactList;

public class Main {

    public static void main(String[] args) {

        Contact contact = new Contact("Jatin", "823457631334");

        MobilePhone mobile = new MobilePhone("827937724235547");
        mobile.addContact(contact);
        mobile.printContact();
        mobile.addContact(contact);// To check if-condition of addContact()

        Contact newContact = new Contact("Jatin","639552256505");
        mobile.updateContact(contact,newContact);
        mobile.printContact();

        Contact newContact1 = new Contact("Amit", "965422321548");
        mobile.updateContact(newContact1, newContact);// If oldContact is not in the list
        mobile.addContact(newContact1);
        mobile.printContact();

        mobile.queryContact("Jatin");
        mobile.removeContact(newContact1);
        //mobile.printContact();

    }
}
