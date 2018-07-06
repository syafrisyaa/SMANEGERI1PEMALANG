package com.blogspot.broapplications.smanegeri1pemalang;


import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class TentangFragment extends Fragment {


    public TentangFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tentang, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState){
        super.onViewCreated(view, savedInstanceState);
        Button bt = view.findViewById(R.id.button);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Intent.ACTION_SEND);
                myIntent.setType("text/plain");
                String shareBody = "Yuk download aplikasi profil SMA Negeri 1 Pemalang. Maju Bersama Hebat Semua. https://play.google.com/store/apps/details?id=com.blogspot.broapplications.smanegeri1pemalang";
                myIntent.putExtra(Intent.EXTRA_TEXT,shareBody);
                startActivity(Intent.createChooser(myIntent,"Share Using"));
            }
        });
        Button bt2 = view.findViewById(R.id.button2);
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    startActivity(new Intent(Intent.ACTION_VIEW,
                            Uri.parse("market://details?id=com.blogspot.broapplications.smanegeri1pemalang")));
                } catch (ActivityNotFoundException e){
                    startActivity(new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://play.google.com/store/apps/details?id=com.blogspot.broapplications.smanegeri1pemalang")));
                }
            }
        });
        Button b = view.findViewById(R.id.button3);
        b.setOnClickListener(new View.OnClickListener()
        {
            public void onClick (View v)
            {
                Intent intent = new Intent(getActivity(),WebActivity.class);
                startActivity(intent);
            }
        });
    }

}
