package com.example.marie.myapplication;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends ActionBarActivity {
    public final static String EXTRA_MESSAGE = "com.example.marie.myapplication.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    public void sendTexts(View view){
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText edit_message1 = (EditText) findViewById(R.id.edit_message1);
        EditText edit_message2 = (EditText) findViewById(R.id.edit_message2);
        EditText edit_message3 = (EditText) findViewById(R.id.edit_message3);

        String message = "Hi ";
        message = message.concat(edit_message1.getText().toString());
        message=message.concat("!");
        message=message.concat("I like ");
        message = message.concat(edit_message2.getText().toString());
        message=message.concat(" too! We can become good friends! Although unlike you I don't mind ");
        message = message.concat(edit_message3.getText().toString());
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);

    }
}
