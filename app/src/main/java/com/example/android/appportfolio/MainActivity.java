package com.example.android.appportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String BUTTON_TOAST_TEXT = "This button will launch my capstone project";

    private Toast buttonToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.buttonToast = Toast.makeText(getApplicationContext(), BUTTON_TOAST_TEXT,
                Toast.LENGTH_SHORT);
    }

    /*
     * Shows default defined toast
     */
    public void displayToast(final View view) {
        this.buttonToast.show();
    }
}
