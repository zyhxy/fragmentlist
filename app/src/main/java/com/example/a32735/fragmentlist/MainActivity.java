package com.example.a32735.fragmentlist;

import android.content.Intent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;



public class MainActivity extends AppCompatActivity implements Communicator{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void communicate(int position) {
        DetailFragment detailFragment = (DetailFragment) getSupportFragmentManager().findFragmentById(R.id.fragment2);
      //  detailFragment.receivePosition(position);
        if(detailFragment!=null && detailFragment.isVisible()){
            //landscape mode
            detailFragment.receivePosition(position);
        }else{
            Intent intent=new Intent(MainActivity.this,DetailActivity.class);
            intent.putExtra("ourposition",position);
            startActivity(intent);
        }



    }
}
