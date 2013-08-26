package org.scforandroid.TestContainerApp;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.Button;
import android.view.View;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button button = (Button) findViewById(R.id.btnLaunchContactsManager);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                launchContactsManager();
            }
        });

        // Start our intent service
        Intent intent = new Intent(this, ContactsManagerIntentService.class);
        startService(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    private void launchContactsManager() {
        Intent intent = new Intent(this, ContactManagerActivity.class);
        startActivity(intent);
    }
}
