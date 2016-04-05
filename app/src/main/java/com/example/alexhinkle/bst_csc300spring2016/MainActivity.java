package com.example.alexhinkle.bst_csc300spring2016;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Random;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BST tree = new BST();
        String vals = "fbggg";
        for(int i = 0; i < vals.length(); i++)
        {
            tree.add(vals.charAt(i));
        }

        System.out.println("Out of balance: " + tree.isOutOfBalance());
        tree.howAreWeOutOfBalance('g');

        //tree.visitPreOrder();
        //tree.visitPostOrder();
        //tree.visitInOrder();
        //tree.visitLevelOrder();
    }
}