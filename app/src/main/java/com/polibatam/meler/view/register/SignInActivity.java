package com.polibatam.meler.view.register;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.Patterns;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.polibatam.meler.MainActivity;
import com.polibatam.meler.R;
import com.polibatam.meler.controller.CheckNetwork;
import com.polibatam.meler.view.MotionLibraryActivity;
import com.polibatam.meler.view.intro.SplashIntroActivity;

public class SignInActivity extends AppCompatActivity implements View.OnClickListener{

    // Declare Variable
    // Preferences Key and Request Code
    // FirebaseAuth Library
    // Loading Bar
    public static final String PREF_KEY_FIRST_START = "PREF_KEY_FIRST_START";
    public static final int REQUEST_CODE_INTRO = 1;
    FirebaseAuth mAuth;
    private EditText edtTextEmail, edtTextPassword;
    ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        boolean firstStart = PreferenceManager.getDefaultSharedPreferences(this)
                .getBoolean(PREF_KEY_FIRST_START, true);

        if (firstStart) {
            Intent intent = new Intent(this, SplashIntroActivity.class);
            startActivityForResult(intent, REQUEST_CODE_INTRO);
        }

        edtTextEmail = findViewById(R.id.edtTextEmail);
        edtTextPassword = findViewById(R.id.edtTextPassword);
        progressBar = findViewById(R.id.progressBar);

        findViewById(R.id.txtSignUp).setOnClickListener(this);
        findViewById(R.id.buttonLogin).setOnClickListener(this);

        mAuth = FirebaseAuth.getInstance();

        if(CheckNetwork.isInternetAvailable(SignInActivity.this))
        {
//            Toast.makeText(MotionLibraryActivity.this, "Make Sure Your Internet Connection Is Stable", Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(SignInActivity.this, "No Internet Connection", Toast.LENGTH_LONG).show();
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQUEST_CODE_INTRO) {
            if (resultCode == RESULT_OK) {
                PreferenceManager.getDefaultSharedPreferences(this).edit()
                        .putBoolean(PREF_KEY_FIRST_START, false)
                        .apply();
            } else {
                PreferenceManager.getDefaultSharedPreferences(this).edit()
                        .putBoolean(PREF_KEY_FIRST_START, true)
                        .apply();
                //User cancelled the intro so we'll finish this activity too.
                finish();
            }
        }
    }

    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.txtSignUp:
                finish();
                Intent intent = new Intent(this, SignUpActivity.class);
                startActivity(intent);
                break;
            case R.id.buttonLogin:
                userLogin();
                break;
        }
    }

    @Override
    protected void onStart() {
        super.onStart();

        if (mAuth.getCurrentUser() != null) {
            finish();
            startActivity(new Intent(this, MainActivity.class));
        }
    }

    private void userLogin() {

        String email = edtTextEmail.getText().toString().trim();
        String password = edtTextPassword.getText().toString().trim();

        if (email.isEmpty()) {
            edtTextEmail.setError("Email is required");
            edtTextEmail.requestFocus();
            return;
        }

        if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            edtTextEmail.setError("Please enter a valid email");
            edtTextEmail.requestFocus();
            return;
        }

        if (password.isEmpty()) {
            edtTextPassword.setError("Password is required");
            edtTextPassword.requestFocus();
            return;
        }

        if (password.length() < 6) {
            edtTextPassword.setError("Minimum lenght of password should be 6");
            edtTextPassword.requestFocus();
            return;
        }

        progressBar.setVisibility(View.VISIBLE);

        mAuth.signInWithEmailAndPassword(email, password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                progressBar.setVisibility(View.GONE);
                if (task.isSuccessful()) {
                    finish();
                    Intent intent = new Intent(SignInActivity.this, MainActivity.class);
                    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    startActivity(intent);
                } else {
                    Toast.makeText(getApplicationContext(), task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                }
            }
        });
    }


}