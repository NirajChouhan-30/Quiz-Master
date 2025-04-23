package com.example.quiz_master;



import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.ImageView;
import com.bumptech.glide.Glide;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    EditText edtUsername;
    Button btnLogin;

    private ImageView gifImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        edtUsername = findViewById(R.id.etUsername);
        btnLogin = findViewById(R.id.btnGetStarted);
        gifImageView = findViewById(R.id.gifImageView);

        Glide.with(this)
                .asGif()
                .load(R.drawable.welcome) // Replace with your GIF resource
                .into(gifImageView);

        btnLogin.setOnClickListener(view -> {
            String username = edtUsername.getText().toString().trim();

            if (TextUtils.isEmpty(username)) {
                Toast.makeText(LoginActivity.this, "Please enter your name", Toast.LENGTH_SHORT).show();
            } else {
                // Send username to HomeActivity
                Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                intent.putExtra("username", username);
                startActivity(intent);
                finish();
            }
        });
    }
}
