package com.example.may_7insert_update_select;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Add_Student extends AppCompatActivity {

    EditText etName, etPhone, etEmail, etImage;
    Button btInsert;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btInsert= findViewById(R.id.btnAdd);

        etName= findViewById(R.id.et_name);
        etPhone= findViewById(R.id.et_phone);
        etEmail= findViewById(R.id.et_email);
        etImage= findViewById(R.id.et_image);
    }

    public void onClick(View view) {
        DbHelper dh = new DbHelper(Add_Student.this);
        long id = dh.Add_Student(new Student(0,etName.getText().toString(), etPhone.getText().toString(),
                                                etEmail.getText().toString(),etImage.getText().toString()));
        Toast.makeText(Add_Student.this, "ADDED"+ String.valueOf(id),Toast.LENGTH_LONG).show();

    }
}
