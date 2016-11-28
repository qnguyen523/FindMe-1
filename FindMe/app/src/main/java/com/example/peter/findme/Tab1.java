package com.example.peter.findme;

/**
 * Created by Peter on 11/27/16.
 */
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Tab1 extends Fragment
{
    private String name;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tab1, container, false);



        TextView welcomeMessage = (TextView) rootView.findViewById(R.id.section_label);
        String message = "Hello "+name + "\nWelcome to FindMe\nYou are at tab 1";
        welcomeMessage.setText(message);
        return rootView;
    }
    // set name
    public void setName(String name)
    {
        this.name = name;
    }
}
