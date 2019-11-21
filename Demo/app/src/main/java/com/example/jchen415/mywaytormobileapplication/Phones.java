package com.example.jchen415.mywaytormobileapplication;


import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.content.Intent;
import android.widget.ImageButton;

/**
 * A simple {@link Fragment} subclass.
 */
public class Phones extends Fragment {


    public Phones() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_tab1, container, false);

        //ImageButton eggroll = (ImageButton) v.findViewById(R.id.eggroll);
        ImageButton padthai = (ImageButton) v.findViewById(R.id.padthai);
        ImageButton springroll = (ImageButton) v.findViewById(R.id.springroll);
        ImageButton padseeew = (ImageButton) v.findViewById(R.id.padseeew);


        padseeew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().startActivity(new Intent(getActivity(), iPhone.class));
            }
        });

        springroll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().startActivity(new Intent(getActivity(), gPixel.class));
            }
        });

        padthai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().startActivity(new Intent(getActivity(), sGalaxy.class));
            }
        });

        return v;
        }

}
