package com.example.mhmsbmrapp.Login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.mindrot.jbcrypt.BCrypt;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.volley.toolbox.HttpResponse;
import com.android.volley.toolbox.JsonObjectRequest;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;

import okhttp3.FormBody;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

import com.example.mhmsbmrapp.R;

public class LoginBmr extends AppCompatActivity {

    TextView testView;
    private EditText Name;
    private EditText Password;
    private TextView Info;
    private Button Login;
    private int counter = 5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_bmr);

        Name = (EditText) findViewById(R.id.etName);
        Password = (EditText) findViewById(R.id.etPassword);
        Info = (TextView) findViewById(R.id.tvInfo);
        Login = (Button) findViewById(R.id.btnLogin);

        Info.setText("No of attempts remaining: 5");

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate(Name.getText().toString(), Password.getText().toString());
                Log.d("login credientals pass", "login credientals pass");
            }
        });
    }

    private void validate(String userName, String userPassword) {
        if ((userName.equals("p")) && (userPassword.equals("1"))) {
            Intent intent = new Intent(LoginBmr.this, SelectMhe.class);
            startActivity(intent);
            Log.d("login pass", "login  pass");
        } else {
            counter--;

            Info.setText("No of attempts remaining: " + String.valueOf(counter));
            Log.d("login not pass", "login  not pass");

            if (counter == 0) {
                Login.setEnabled(false);
                Log.d("login false pass", "login false  pass");
            }
        }
    }



}

