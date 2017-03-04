package com.james.example.tictactoe;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class TicTacToe extends AppCompatActivity {
Button b1,b2,b3,b4,b5,b6,b7,b8,b9;
    int count;
    public int clicks =0;
    boolean end = false;
    Handler myHandler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tic_tac_toe);

        b1 = (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);
        b3 = (Button) findViewById(R.id.b3);
        b4 = (Button) findViewById(R.id.b4);
        b5 = (Button) findViewById(R.id.b5);
        b6 = (Button) findViewById(R.id.b6);
        b7 = (Button) findViewById(R.id.b7);
        b8 = (Button) findViewById(R.id.b8);
        b9 = (Button) findViewById(R.id.b9);

        myHandler = new Handler();
        count =1;

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(count == 1){
                    b1.setText("X");
                    count=2;
                }else{
                    b1.setText("O");
                    count = 1;
                }
                clicks = clicks+1;
                b1.setClickable(false);
                endGame();
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(count == 1){
                    b2.setText("X");
                    count=2;
                }else{
                    b2.setText("O");
                    count = 1;
                }
                clicks = clicks+1;
                b2.setClickable(false);
                endGame();
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(count == 1){
                    b3.setText("X");
                    count=2;
                }else{
                    b3.setText("O");
                    count = 1;
                }
                clicks = clicks+1;
                b3.setClickable(false);
                endGame();
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(count == 1){
                    b4.setText("X");
                    count=2;
                }else{
                    b4.setText("O");
                    count = 1;
                }
                clicks = clicks+1;
                b4.setClickable(false);
                endGame();
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(count == 1){
                    b5.setText("X");
                    count=2;
                }else{
                    b5.setText("O");
                    count = 1;
                }
                clicks = clicks+1;
                b5.setClickable(false);
                endGame();
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(count == 1){
                    b6.setText("X");
                    count=2;
                }else{
                    b6.setText("O");
                    count = 1;
                }
                clicks = clicks+1;
                b6.setClickable(false);
                endGame();
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(count == 1){
                    b7.setText("X");
                    count=2;
                }else{
                    b7.setText("O");
                    count = 1;
                }
                clicks = clicks+1;
                b7.setClickable(false);
                endGame();
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(count == 1){
                    b8.setText("X");
                    count=2;
                }else{
                    b8.setText("O");
                    count = 1;
                }
                clicks = clicks+1;
                b8.setClickable(false);
                endGame();
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(count == 1){
                    b9.setText("X");
                    count=2;
                }else{
                    b9.setText("O");
                    count = 1;
                }
                clicks = clicks+1;
                b9.setClickable(false);
                endGame();
            }
        });

    }

    public void endGame(){
        String a,b,c,d,e,f,g,h,i;

        a= b1.getText().toString();
        b= b2.getText().toString();
        c= b3.getText().toString();
        d= b4.getText().toString();
        e= b5.getText().toString();
        f= b6.getText().toString();
        g= b7.getText().toString();
        h= b8.getText().toString();
        i= b9.getText().toString();

        if(!a.equals("") && a.equals(b) && a.equals(c)){
            Toast.makeText(this,a+" won!!",Toast.LENGTH_LONG).show();
            end = true;
        }
        if(!a.equals("") && a.equals(d) && a.equals(g)){
            Toast.makeText(this,a+" won!!",Toast.LENGTH_LONG).show();
            end = true;
        }
        if(!a.equals("") && a.equals(e) && a.equals(i)){
            Toast.makeText(this,a+" won!!",Toast.LENGTH_LONG).show();
            end = true;
        }
        if(!c.equals("") && c.equals(f) && c.equals(i)){
            Toast.makeText(this,c+" won!!",Toast.LENGTH_LONG).show();
            end = true;
        }
        if(!i.equals("") && i.equals(g) && i.equals(h)){
            Toast.makeText(this,i+" won!!",Toast.LENGTH_LONG).show();
            end = true;
        }
        if(!c.equals("") && c.equals(e) && c.equals(g)){
            Toast.makeText(this,c+" won!!",Toast.LENGTH_LONG).show();
            end = true;
        }
        if(!b.equals("") && b.equals(e) && b.equals(h)){
            Toast.makeText(this,b+" won!!",Toast.LENGTH_LONG).show();
            end = true;
        }
        if(!d.equals("") && d.equals(e) && d.equals(f)){
            Toast.makeText(this,d+" won!!",Toast.LENGTH_LONG).show();
            end = true;
        }

        if(end){
            clicks = 0;
            finalEndGame();
        }

        if(clicks==9){
            clicks = 0;
            Toast.makeText(this,"Match drawed..",Toast.LENGTH_LONG).show();
            finalEndGame();
        }
    }

        public void finalEndGame(){
            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);
            b6.setEnabled(false);
            b7.setEnabled(false);
            b8.setEnabled(false);
            b9.setEnabled(false);

            Toast.makeText(getApplicationContext(),"Starting a new game..",Toast.LENGTH_SHORT).show();

            myHandler.postDelayed(new Runnable() {
                @Override
                public void run() {

                    b1.setText("");
                    b2.setText("");
                    b3.setText("");
                    b4.setText("");
                    b5.setText("");
                    b6.setText("");
                    b7.setText("");
                    b8.setText("");
                    b9.setText("");

                    b1.setEnabled(true);
                    b2.setEnabled(true);
                    b3.setEnabled(true);
                    b4.setEnabled(true);
                    b5.setEnabled(true);
                    b6.setEnabled(true);
                    b7.setEnabled(true);
                    b8.setEnabled(true);
                    b9.setEnabled(true);

                    b1.setClickable(true);
                    b2.setClickable(true);
                    b3.setClickable(true);
                    b4.setClickable(true);
                    b5.setClickable(true);
                    b6.setClickable(true);
                    b7.setClickable(true);
                    b8.setClickable(true);
                    b9.setClickable(true);

                    end=false;
                }
            }, 5000);
        }


}
