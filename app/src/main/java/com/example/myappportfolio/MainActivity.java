package com.example.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int textAlignment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showToast(View view) {
        StringBuilder sb = new StringBuilder("This button will launch my ")
                .append(((Button) view).getText()).append(" app");
        Toast toast = Toast.makeText(getApplicationContext(), sb, Toast.LENGTH_SHORT);
        toast.show();
    }

    /**
     public void showToastPopularMovie(View view){
     Toast toast = Toast.makeText(getApplicationContext(), "Popular Movie Message", Toast.LENGTH_SHORT);
     toast.show();
     }

     public void showToastStockHawk(View view){
     Toast toast = Toast.makeText(getApplicationContext(), "You stock are rising", Toast.LENGTH_SHORT);
     toast.show();
     }

     public void showBuildItBigger(View view) {
     Toast toast = Toast.makeText(getApplicationContext(), "Bigger then Bigger", Toast.LENGTH_SHORT);
     toast.show();
     }

     public void showMakeYouAppMaterial(View view) {
     Toast toast = Toast.makeText(getApplicationContext(), "Make You App Material", Toast.LENGTH_SHORT);
     toast.show();
     }

     public void showGoUbiquitous(View view) {
     Toast toast = Toast.makeText(getApplicationContext(), "What is Go Ubiquitous", Toast.LENGTH_SHORT);
     toast.show();
     }

     public void showToastCapston(View view){
     Toast toast = Toast.makeText(getApplicationContext(), "This button will launch my capston app", Toast.LENGTH_SHORT);
     toast.show();
     }
     **/
}
