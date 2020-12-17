package com.example.mad2a;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity
{
    private TextView t;
    private Spinner s;
    private HashMap m;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t = (TextView)findViewById(R.id.textView);
        s = (Spinner)findViewById(R.id.spinner);
        m = new HashMap();
        m.put("Hello","Bonjour");
        m.put("Goodbye","Au Revoir");
        m.put("Good Evening","Bonsoir");
        m.put("Good Night","Bonne Nuit");
        m.put("Please","S\'il vous plaat");
        m.put("Thank You","Merci");
        m.put("Sorry","Pardon");
        m.put("It's Okay","Ata va");
        m.put("It's Good","C\'est bien");
        m.put("We","Nous");
        m.put("You","Vous");
        m.put("Mr.","Monsieur");
        m.put("Miss","Mademoiselle");
        m.put("Red","Rogue");
        m.put("Black","Noir");
        m.put("Blue","Bleu");
        m.put("Yellow","Jaune");
        m.put("Bread","Pain");
        m.put("Wine","Du vin");
        m.put("Chicken","Poulet");
        m.put("Rice","Riz");


    }

    public void translateToFrench(View view)
    {
        String st = s.getSelectedItem().toString();
        if(m.containsKey(st))
            t.setText(m.get(st).toString());
    }
}