package com.example.login_eivani;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // Declare variables for the views
    private EditText etUsername;
    private EditText etPassword;
    private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);  // use our XML layout

        // Connect Java variables with XML views by ID
        etUsername = findViewById(R.id.etUsername);
        etPassword = findViewById(R.id.etPassword);
        btnLogin = findViewById(R.id.btnLogin);

        // Set click listener for the Login button
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Get text from the input fields
                String username = etUsername.getText().toString().trim();
                String password = etPassword.getText().toString().trim();

                // Check the homework condition:
                // username must be "admin" and password must be "1234"
                if (username.equals("admin") && password.equals("1234")) {
                    // Show welcome message
                    Toast.makeText(
                            MainActivity.this,
                            "Welcome " + username,
                            Toast.LENGTH_SHORT
                    ).show();
                } else {
                    // Show error message
                    Toast.makeText(
                            MainActivity.this,
                            "Username or password is incorrect",
                            Toast.LENGTH_SHORT
                    ).show();
                }
            }
        });
    }
}
