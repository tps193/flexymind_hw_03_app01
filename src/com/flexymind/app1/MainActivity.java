package com.flexymind.app1;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class MainActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Button regbutton = (Button) findViewById(R.id.regbutton);
        regbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               startForm();
            }
        });

    }

    void startForm()
    {
        Intent intent = new Intent(this, Form.class);
        startActivity(intent);
    }
}
