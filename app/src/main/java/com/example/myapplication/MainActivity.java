package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.EditText;

import com.google.android.material.snackbar.Snackbar;
//import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Button btnn = findViewById(R.id.btn);
        btnn.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View v){


                Snackbar.make(findViewById(R.id.main),"no network",Snackbar.LENGTH_INDEFINITE).setAction("retry", (View vV)->{
                    Toast.makeText(MainActivity.this,"donelllllllllllllllllllllllllllllllllll",Toast.LENGTH_SHORT).show();
                }).setTextColor(R.color.purple_200).show();

                System.out.println(getResources().getText(R.string.app_name));

                System.out.println((R.string.app_name));
                Toast.makeText(btnn.getContext(), "hello world", Toast.LENGTH_SHORT).show();
                EditText txt = findViewById(R.id.edittext);
                btnn.setText(txt.getText().toString());




            }
        });

        RecyclerView review = findViewById(R.id.review);
        RadioGroup radioGroup = findViewById(R.id.radioGroup);
        radioGroup.setOnCheckedChangeListener((RadioGroup group,int checkedId)->{
            System.out.println(checkedId);
            System.out.println(R.id.radio1);
            switch(checkedId){
                case R.id.radio1:{
                    Toast.makeText(radioGroup.getContext() , "first radio clicked", Toast.LENGTH_SHORT).show();

                    break;

                }
                case R.id.radio2:{


                    Toast.makeText(radioGroup.getContext(), "second radio clicked", Toast.LENGTH_SHORT).show();
                    break;

                }

            }
        });
        btnn.setOnLongClickListener((View v)->{ Toast.makeText(btnn.getContext(), "long press", Toast.LENGTH_SHORT).show();
            return false;
        });

        Spinner spinner = findViewById(R.id.spinner);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(spinner.getContext(), spinner.getSelectedItem().toString() +"selected", Toast.LENGTH_SHORT).show();


            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                Toast.makeText(spinner.getContext(), "no spinner selected", Toast.LENGTH_SHORT).show();

            }
        });


    }

//    public  void buttonClicked(View view){
////        print(view);
//        TextView text = findViewById(R.id.txtWelcome);
//        text.setText("Hello again");
//
//
//
//
//    }
//


}