package com.example.testradio;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

        private RadioGroup radioSexGroup,radiosextree,radiosexbird,radiosexanimal;
        private RadioButton radioSexButton,radiotreebutton,radiobirdbutton,radioanimalbutton;
        private Button btnDisplay;
        TextView score;

        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            addListenerOnButton();

        }

        public void addListenerOnButton() {

            radioSexGroup = (RadioGroup) findViewById(R.id.radioSex);
            radiosextree=(RadioGroup)findViewById(R.id.radiotree);
            radiosexbird=(RadioGroup)findViewById(R.id.radiobird);
            radiosexanimal=(RadioGroup)findViewById(R.id.radioanimal);
            btnDisplay = (Button) findViewById(R.id.btnDisplay);
            score=(TextView)findViewById(R.id.score);

            btnDisplay.setOnClickListener(new OnClickListener() {

                @Override
                public void onClick(View v) {
int count = 0;
                    // get selected radio button from radioGroup
                    int selectedId = radioSexGroup.getCheckedRadioButtonId();
                    // find the radiobutton by returned id
                    radioSexButton = (RadioButton) findViewById(selectedId);
                    if(radioSexButton.getText().toString().equals("M.K.Gandhi"))
                    {
                     count++;
                    }else {}

                    int selectedId1 = radiosextree.getCheckedRadioButtonId();
                    radiotreebutton = (RadioButton) findViewById(selectedId1);
                    if(radiotreebutton.getText().toString().equals("Banyan"))
                    {
                        count++;
                    }else {}

                    int selectedId2 = radiosexbird.getCheckedRadioButtonId();
                    radiobirdbutton = (RadioButton) findViewById(selectedId2);
                    if(radiobirdbutton.getText().toString().equals("Peacock"))
                    {
                        count++;
                    }else {}

                    int selectedId3 = radiosexanimal.getCheckedRadioButtonId();
                    radioanimalbutton = (RadioButton) findViewById(selectedId3);
                    if(radioanimalbutton.getText().toString().equals("Tiger"))
                    {
                        count++;
                    }else {}
                    score.setText("your score is "+count);


                }


            });

        }
    }