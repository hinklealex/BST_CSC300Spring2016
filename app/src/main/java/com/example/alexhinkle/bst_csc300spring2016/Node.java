package com.example.alexhinkle.bst_csc300spring2016;

/**
 * Created by AlexHinkle on 3/3/16.
 */
public class Node
{
    private int payload;
    private Node leftChild;
    private Node rightChild;

    public Node(int payload)
    {
        this.payload = payload;
        this.leftChild = null;
        this.rightChild = null;


    }
    public String display()
    {

        String s = "(" + this.payload + " ";
        if(this.leftChild != null)
        {
            s = s + this.leftChild.display();
        }
        else
        {
            s = s + "NULL";
        }
        if(this.rightChild != null)
        {
            s = s + this.rightChild.display();
        }
        else
        {
            s = s + "NULL";
        }
        return s + ")";

    }

    public String toString()
    {
       return null;
    }
    public void add(Node n)
    {
        if(n.payload <= this.payload)
        {
            if(this.leftChild == null)
            {
                this.leftChild = n;
            }
            else
            {
                this.leftChild.add(n);
            }
        }
        else
        {
            if (this.rightChild == null) {
                this.rightChild = n;

            } else
            {
                this.rightChild.add(n);
            }
        }
    }
}
