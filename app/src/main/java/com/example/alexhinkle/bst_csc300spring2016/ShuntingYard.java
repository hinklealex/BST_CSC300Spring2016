package com.example.alexhinkle.bst_csc300spring2016;

import java.util.Stack;

/**
 * Created by AlexHinkle on 4/14/16.
 */
public class ShuntingYard {



    static String shuntingYardFix(String equation)
    {

        String ops = "-+*^";
        StringBuilder finalOutput = new StringBuilder();
        Stack<Integer> s = new Stack<>();

        for (String token : equation.split("\\s"))
        {
            if (token.isEmpty())
                continue;
            char currentChar = token.charAt(0);
            int index = ops.indexOf(currentChar);

            if (index != -1)
            {
                if (s.isEmpty())
                {
                    s.push(index);
                }
                else
                {
                    while(!s.isEmpty())
                    {
                        int prec2 = s.peek() / 2;
                        int prec1 = index / 2;
                        if(prec2 > prec1 || (prec2 == prec1 && currentChar != '^'))
                        {
                            finalOutput.append(ops.charAt(s.pop())).append(' ');


                        }
                        else break;
                    }
                    s.push(index);
                }
            }
            else if(currentChar == '(')
            {
                s.push(-2);
            }
            else if(currentChar ==')')
            {
                while ((s.peek() != -2))
                {
                    finalOutput.append(ops.charAt(s.pop())).append(' ');
                }
                s.pop();
            }
            else
            {
                finalOutput.append(token).append(' ');
            }
        }
        while(!s.isEmpty())
        {
            finalOutput.append(ops.charAt(s.pop())).append(' ');

        }
        System.out.println(finalOutput);
        return finalOutput.toString();
    }
}

