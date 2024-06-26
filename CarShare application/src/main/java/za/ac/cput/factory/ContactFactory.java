package za.ac.cput.factory;

import za.ac.cput.domain.Contact;
import za.ac.cput.util.Helper;

public class ContactFactory {

    public static Contact createContact(String contactId, String email, int mobileNo) {
        if (!Helper.isValidContactId(contactId)||!Helper.isValidEmail(email)||!Helper.isValidMobileNo(mobileNo)) {
          //  throw new IllegalArgumentException("Invalid contact ID");
            return null;
        }
        return new Contact.Builder()
                .setContactId(contactId)
                .setEmail(email)
                .setMobileNo(mobileNo)
                .build();
    }
}

