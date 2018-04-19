package com.example.richard.intent_intro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

public class usernameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.username_final);


        final EditText userInput = findViewById(R.id.eTuserInput);
        String theUserInput = userInput.getText().toString();

        /**Display a toast when the button is pressed
         Toast to be display should not be the same
         if the user did not write her name*/

        if (theUserInput.isEmpty()) {
            Toast.makeText(getBaseContext(), "The user did not input anything", Toast.LENGTH_LONG).show();
        } else {
            //if the user wrote her name.
            Toast.makeText(getBaseContext(), "The user`s name is : \n   " + theUserInput, Toast.LENGTH_LONG).show();
        }
    }
}
