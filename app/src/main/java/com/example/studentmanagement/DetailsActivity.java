package com.example.studentmanagement;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    private ImageView profilePic;

    private TextView name, details;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        profilePic = findViewById(R.id.profilePic);
        name = findViewById(R.id.nameid);
        details = findViewById(R.id.detailsid);

        Bundle bundle = getIntent().getExtras();

        if (bundle !=null){
            String myValue = bundle.getString("name");

            showResult(myValue);
        }


    }

    public void showResult(String myValue){
        if (myValue.equals("mostofa")){

            profilePic.setImageResource(R.drawable.mostofa);
            name.setText(R.string.mostofa_name);
            details.setText(R.string.mostofa_details);

        }

        if (myValue.equals("masud")){

            profilePic.setImageResource(R.drawable.masud);
            name.setText(R.string.masud_name);
            details.setText(R.string.masud_details);

        }
        if (myValue.equals("ripon")){

            profilePic.setImageResource(R.drawable.ripon);
            name.setText(R.string.ripon_name);
            details.setText(R.string.ripon_details);

        }
        if (myValue.equals("kousik")){

            profilePic.setImageResource(R.drawable.kousik);
            name.setText(R.string.kousik_name);
            details.setText(R.string.kousik_details);

        }

    }
}
