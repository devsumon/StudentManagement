package com.example.studentmanagement;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Timer;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mostofa, masud, ripon, koushik;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mostofa = findViewById(R.id.mostofaid);
        masud = findViewById(R.id.masudid);
        ripon = findViewById(R.id.riponid);
        koushik = findViewById(R.id.kousikid);

        //set onclicklisterner with four button
        mostofa.setOnClickListener(MainActivity.this);
        masud.setOnClickListener(MainActivity.this);
        ripon.setOnClickListener(MainActivity.this);
        koushik.setOnClickListener(MainActivity.this);


    }

    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.mostofaid){
            Intent intent = new Intent(MainActivity.this, DetailsActivity.class);
            intent.putExtra("name", "mostofa");
            startActivity(intent);
        }

        if (v.getId() == R.id.masudid){
            Intent intent = new Intent(MainActivity.this, DetailsActivity.class);
            intent.putExtra("name", "masud");
            startActivity(intent);
        }

        if (v.getId() == R.id.riponid){
            Intent intent = new Intent(MainActivity.this, DetailsActivity.class);
            intent.putExtra("name", "ripon");
            startActivity(intent);
        }

        if (v.getId() == R.id.kousikid){
            Intent intent = new Intent(MainActivity.this, DetailsActivity.class);
            intent.putExtra("name", "kousik");
            startActivity(intent);
        }



    }

    public  void onBackPressed(){
        AlertDialog.Builder alertDialogbuilder = new AlertDialog.Builder(MainActivity.this);
        alertDialogbuilder.setTitle("Do you want to exit?");
        alertDialogbuilder.setMessage("Do you want to exit this application");
        alertDialogbuilder.setIcon(R.drawable.ic_launcher_background);
        alertDialogbuilder.setCancelable(false);
        alertDialogbuilder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                finish();

            }
        });

        alertDialogbuilder.setNeutralButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {


                dialog.cancel();
            }
        });

        AlertDialog alertDialog = alertDialogbuilder.create();
        alertDialog.show();

    }

}
