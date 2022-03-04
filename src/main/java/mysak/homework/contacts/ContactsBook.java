package mysak.homework.contacts;

import mysak.homework.exception.ContactNotFoundException;

import java.util.*;
import java.util.function.Predicate;

public class ContactsBook {
    Map<String, Contact> fastContacts = new HashMap<>();

    public void add(Contact contact) {
        fastContacts.put(contact.getPhone(), contact);
    }

    public Contact getByPhone(String phone) {
        return fastContacts.get(phone);
    }

    public void removeByPhone(String phone) throws ContactNotFoundException {
        if (fastContacts.containsKey(phone)) {
            fastContacts.remove(phone);
        }
        else {
            throw new ContactNotFoundException(phone);
        }
    }

    public void searchBy(Predicate<Contact> criteria) {
        List<Contact> contactList = new ArrayList<>();

        for(Contact contact : fastContacts.values()) {
            if(criteria.test(contact)) {
                contactList.add(contact);
            }
        }
        contactList.sort(new ContactNameComparator());
        System.out.println(contactList);
    }

    public void searchBy(String partOfName) {
        if (partOfName.contains("*")) {
            String[] splitStr = partOfName.split("\\*");
            searchBy(contact -> contact.getName().startsWith(splitStr[0]) && contact.getName().endsWith(splitStr[1]));
        } else {
            searchBy(contact -> contact.getName().contains(partOfName));
        }
    }

    public List<Contact> sortByName() {
        List<Contact> sortedList = new LinkedList<>(fastContacts.values());
        sortedList.sort(new ContactNameComparator());

        return sortedList;
    }

    @Override
    public String toString() {
        return fastContacts.toString();
    }
}