package com.polibatam.meler.view.register;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthUserCollisionException;
import com.polibatam.meler.R;

public class SignUpActivity extends AppCompatActivity implements View.OnClickListener{

    // Declare Variable
    // Loading Bar, Edit Text and FirebaesAuth Library
    ProgressBar progressBar;
    private EditText edtTextEmail, edtTextPassword;
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        edtTextEmail = findViewById(R.id.edtTextEmail);
        edtTextPassword = findViewById(R.id.edtTextPassword);
        progressBar = findViewById(R.id.progressBar);

        mAuth = FirebaseAuth.getInstance();

        findViewById(R.id.buttonSignUp).setOnClickListener(this);
        findViewById(R.id.txtLogin).setOnClickListener(this);


    }

    @Override
    public void onClick(View v){
        switch (v.getId()) {
            case R.id.buttonSignUp:
                registerUser();
                break;
            case R.id.txtLogin:
                finish();
                Intent intent = new Intent(this, SignInActivity.class);
                startActivity(intent);
                break;
        }
    }

    // Register User
    // Get value of edtTextEmail and edtTextPassword
    // Execute the value with createUserWithEmailAndPassword Method
    private void registerUser() {
        String email = edtTextEmail.getText().toString().trim();
        String password = edtTextPassword.getText().toString().trim();

        if (email.isEmpty()){
            edtTextEmail.setError("Student is required");
            edtTextEmail.requestFocus();
            return;
        }
        if (password.isEmpty()){
            edtTextPassword.setError("Password is required");
            edtTextPassword.requestFocus();
            return;
        }

        if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            edtTextEmail.setError("Please enter a valid email");
            edtTextEmail.requestFocus();
            return;
        }

        if (password.length()<6) {
            edtTextPassword.setError("Minimum length of password should be 6");
            edtTextPassword.requestFocus();
            return;
        }

        progressBar.setVisibility(View.VISIBLE);

        mAuth.createUserWithEmailAndPassword(email, password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                progressBar.setVisibility(View.GONE);
                if (task.isSuccessful()) {
                    finish();
                    Toast.makeText(getApplicationContext(), "User Registered Successfull", Toast.LENGTH_SHORT).show();
                    mAuth.getInstance().signOut();
                    startActivity(new Intent(SignUpActivity.this, SignInActivity.class));

                } else {

                    if (task.getException() instanceof FirebaseAuthUserCollisionException) {
                        Toast.makeText(getApplicationContext(), "You are already registered", Toast.LENGTH_SHORT).show();

                    } else {
                        Toast.makeText(getApplicationContext(), task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                    }

                }
            }
        });
    }

}
