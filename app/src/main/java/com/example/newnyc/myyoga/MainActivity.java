package com.example.newnyc.myyoga;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    private Button mFindStudioButton;
    private EditText mlocationEditText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mlocationEditText = (EditText) findViewById(R.id.locationEditText);
        mFindStudioButton = (Button) findViewById(R.id.FindStudioButton);
        mFindStudioButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String location = mlocationEditText.getText().toString();
                Toast.makeText(MainActivity.this, "Find a studio here", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(MainActivity.this, StudioActivity.class);
                intent.putExtra("location", location);
                startActivity(intent);

            }
        });
    }
}
