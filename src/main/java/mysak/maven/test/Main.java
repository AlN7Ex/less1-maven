package mysak.maven.test;

import mysak.homework.contacts.*;

public class Main {
    public static void delim() {
        System.out.println("//////////////////////////////////");
    }

    public static void main(String[] args) {
        Contact[] contactArr = new Contact[] {
                new Contact("Павел", "89093335566"),
                new Contact("Тимофей", "89032227766"),
                new Contact("Алексей", "89251236699"),
                new Contact("Василий", "89163216655"),
                new Contact("Андрей", "89090001234")
        };

        ContactsBook contactsBook = new ContactsBook();
        for(Contact c : contactArr) {
            contactsBook.add(c);
        }

        System.out.println(contactsBook);
        delim();
    }
}
