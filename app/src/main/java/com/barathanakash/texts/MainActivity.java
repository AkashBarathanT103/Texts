package com.barathanakash.texts;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.content.res.Resources;
public class MainActivity extends AppCompatActivity {
    Button submitButton;
    EditText responseText;
    TextView displayText;
    TextView displayText1;
    int i=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        submitButton=findViewById(R.id.clickButton);
        responseText=findViewById(R.id.responseEditText);
        displayText=findViewById(R.id.textBox);
        displayText1=findViewById(R.id.textBox2);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("Hello mom");
                Log.i("testButton","Hi dad! "+responseText.getText().toString());
                displayText.setText(displayText.getText().toString()+" "+responseText.getText().toString());
            }
        });
        responseText.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if(!hasFocus){
                    if(responseText.getText().toString().equals("TJ")){
                        displayText.setText("TJ Rocks!");
                        responseText.setText("");
                        responseText.setHint("That's a good name.");
                    }
                }
            }
        });
    }
    public void submit(View view) {//process button onClick event
        System.out.println("Hello mom");
        Log.i("testButton","Hi dad! "+responseText.getText().toString());
        displayText.setText(displayText.getText().toString()+" "+responseText.getText().toString());
    }
    public void cycle(View view) {//process button onClick event
        System.out.println("Hello mom");
        Resources res = getResources();
        String[] planets = res.getStringArray(R.array.planets_array);
        displayText1.setText(planets[i]);

        i++;
        if(i==(planets.length)){
            i=0;
        }


    }
}
