package com.example.threadexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startThread(View view) {
        /*for (int i = 0; i <10; i++){
            Log.d(TAG, "startThread: "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }*/

       /* ExampleThread exampleThread = new ExampleThread(10);
       /* ExampleThread exampleThread = new ExampleThread(10);
       /* ExampleThread exampleThread = new ExampleThread(10);
       /* ExampleThread exampleThread = new ExampleThread(10);
        exampleThread.start();*/

       ExampleRunnable runnable = new ExampleRunnable(10);
       new Thread(runnable).start();

    }

    public void stopThread(View view) {
    }

    class ExampleThread extends Thread{
        int seconds;

        ExampleThread(int seconds){
            this.seconds = seconds;
        }

        @Override
        public void run() {
            for (int i = 0; i< seconds; i++){
                Log.d(TAG, "run: i: "+ i);

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    class ExampleRunnable implements Runnable{

        int seconds;

        ExampleRunnable(int seconds){
            this.seconds = seconds;
        }

        @Override
        public void run() {

            for (int i = 0; i< seconds; i++){
                Log.d(TAG, "run: i: "+ i);

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}
