package com.example.alexhinkle.bst_csc300spring2016;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Random;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button syButton = (Button) findViewById(R.id.sybutton);


        syButton.setOnClickListener(
                new Button.OnClickListener()
                {

                    @Override
                    public void onClick(View v)
                    {
                        String syEquation = ((EditText) findViewById(R.id.equationTB)).getText().toString();
                        System.out.println(syEquation);
                        ShuntingYard.shuntingYardFix(syEquation);
                        System.out.println("here");
                    }


                }
        );



        BST tree = new BST();
        String vals = "cba";
        for(int i = 0; i < vals.length(); i++)
        {
            tree.add(vals.charAt(i));
            tree.rebalance();



        }

        


        //tree.visitPreOrder();
        //tree.visitPostOrder();
        //tree.visitInOrder();
        //tree.visitLevelOrder();
    }
}