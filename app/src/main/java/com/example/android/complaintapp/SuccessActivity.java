package com.example.android.complaintapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by ritika on 4/3/18.
 */

public class SuccessActivity extends FormcomplaintActivity  {

    public void onCreate(Bundle savedInstanceState) {



        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_success);
        TextView keyview=(TextView) findViewById(R.id.key);
        //String key=getIntent().getStringExtra("fkey");
        keyview.setText("Your Complaint Has Been Registered Successfully"+"\n"+"Further Details Shall Be Mailed To You");
        Thread thread=new Thread()
        {
            @Override
            public void run()
            {
                try{
                    sleep(14*100);
                    Intent i=new Intent(getApplicationContext(),UserActivity.class);
                    startActivity(i);

                }
                catch(Exception ex)
                {

                }
            }
        };
        thread.start();

    }

}
