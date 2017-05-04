package com.example.nickng.demoimplicitintent;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

//    Button btnEmail;
//    EditText editTextMessage;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        editTextMessage = (EditText)findViewById(R.id.editTextMessage);
//        btnEmail = (Button)findViewById(R.id.buttonEmail);
//
//        btnEmail.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent email = new Intent(Intent.ACTION_SEND);
//                email.putExtra(Intent.EXTRA_EMAIL, new String[]{"jason_lim@rp.edu.sg"});
//                email.putExtra(Intent.EXTRA_SUBJECT, "Test Email from C347");
//                email.putExtra(Intent.EXTRA_TEXT, editTextMessage.getText());
//                email.setType("message/rfc822");
//                startActivity(Intent.createChooser(email, "Choose an Email client"));
//            }
//        });
//    }

    Button btnRP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnRP = (Button) findViewById(R.id.buttonRP);
        btnRP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                // Intent to display data
                Intent rpIntent = new Intent(Intent.ACTION_VIEW);
                // Set the URL to be used.
                rpIntent.setData(Uri.parse("http://www.rp.edu.sg"));
                startActivity(rpIntent);
            }
        });
    }

}
