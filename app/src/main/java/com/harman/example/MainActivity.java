package com.harman.example;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.Toast;

/**
 * this is the activity that would be run the main app
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Employee ansari = new Employee("abdul",123,true);
        ansari.seteName("abdul");
        Student abdul = new Student("ansari",123,true);
    }
    public void handleClick(View view) {
        Toast.makeText(this, "button clicked", Toast.LENGTH_SHORT).show();
    }
}