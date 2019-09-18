package edu.temple.signupform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class FormActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void validateInputs(View view) {
        EditText name = this.findViewById(R.id.editTextName);
        EditText email = this.findViewById(R.id.editTextEmail);
        EditText password1 = this.findViewById(R.id.editTextPassword1);
        EditText password2 = this.findViewById(R.id.editTextPassword2);
        if (name.getText().toString().matches("")
            || email.getText().toString().matches("")
            || password1.getText().toString().matches("")
            || password2.toString().matches("")
           ) {
            Toast.makeText(this.getApplicationContext(), "All fields must be entered", Toast.LENGTH_SHORT).show();
        } else if (!password1.getText().toString().equals(password2.getText().toString())) {
            Toast.makeText(this.getApplicationContext(), "Passwords do not match", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this.getApplicationContext(), "Welcome " + name.getText().toString(), Toast.LENGTH_SHORT).show();
        }
    }
}
