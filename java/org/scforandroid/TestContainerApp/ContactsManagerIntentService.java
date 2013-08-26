package org.scforandroid.TestContainerApp;

import android.app.IntentService;
import android.content.Intent;

public class ContactsManagerIntentService extends IntentService {
    private static final String TAG = "org.scforandroid.TestContainerApp.ContactsManagerIntentService";

    public ContactsManagerIntentService() {
        super("ContactsManagerIntentService");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        if (intent == null)
            return;

        if (intent.getAction() != null &&
            intent.getAction().equals("org.scforandroid.TestContainerApp.TestAction1")) {
            Intent contactsManagerIntent = new Intent(this, ContactManagerActivity.class);
            contactsManagerIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(contactsManagerIntent);
        }
    }
}
