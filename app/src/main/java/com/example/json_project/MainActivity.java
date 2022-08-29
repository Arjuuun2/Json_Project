package com.example.json_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    public static final String JSON_STRING="{\"employee\":{\"name\":\"Sachin\",\"salary\":56000}}";

    //called whrn the activity is first created.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView t1=(TextView)findViewById(R.id.t1);
        try {
            JSONObject emp=(new JSONObject(JSON_STRING)).getJSONObject("employee");
            String empname=emp.getString("name");
            int empsalary =emp.getInt("salary");
            String str="Employee Name:"+empname+"\n"+"Employee Salary:"+empsalary;
            t1.setText(str);
        }
        catch (Exception e){
        }
    }
}