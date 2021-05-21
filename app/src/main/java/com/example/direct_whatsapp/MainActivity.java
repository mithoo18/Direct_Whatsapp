package com.example.direct_whatsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.dialog.MaterialAlertDialogBuilder;

public class MainActivity extends AppCompatActivity {


    private static final String FILE_NAME="WhatsApp_file";
    private static String NAME_KEY = "UserName_key";
    private static final String FIRST_TIME_SHOW_KEY = "FirstTimeShow_Key";
    String yourName;
    final Context context = this;
    //CountryCodePicker ccp;
    EditText userPhoneNumber;
    EditText message;
    Button fastReplyOne;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cpp = findViewById(R.id.editText1);
        userPhoneNumber = findViewById(R.id.phone_number_edit);
        message = findViewById(R.id.message);
        fastReplyOne = findViewById(R.id.fast_replay_1);
        checkAlertBox();
    }

    public void checkAlertBox() {
        SharedPreferences sharedPreferences =getSharedPreferences(FILE_NAME,MODE_PRIVATE);
        int check = sharedPreferences.getInt(FIRST_TIME_SHOW_KEY,0);
        if (check ==0){
            makeAlertBox();
        }else
        {
            setTextInButton();
        }
    }

    private void setTextInButton() {
    }

    public void makeAlertBox() {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View promptUserView = layoutInflater.inflate(R.layout.dialog_prompt_user,null);
        MaterialAlertDialogBuilder alertDialogBuilder = new MaterialAlertDialogBuilder(context);
        alertDialogBuilder.setIcon()
    }


}