package com.example.navigationdrawer;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class home extends Fragment {

    public home() {
        // Required empty public constructor
    }

    public static home newInstance() {
        return new home();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        Button myButton = view.findViewById(R.id.myButton);
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Define the website URL you want to open
                String websiteUrl = "https://github.com/Rohaan-Arshad/NavigationDrawer_Quiz";

                // Create an intent to open a web browser with the URL
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(websiteUrl));
                      startActivity(intent);
            }
        });
        return view;
    }
}
