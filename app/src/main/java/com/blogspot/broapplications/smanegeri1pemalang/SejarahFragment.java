package com.blogspot.broapplications.smanegeri1pemalang;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.github.barteksc.pdfviewer.PDFView;


/**
 * A simple {@link Fragment} subclass.
 */
public class SejarahFragment extends Fragment {


    public SejarahFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_sejarah, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState){
        super.onViewCreated(view, savedInstanceState);

        PDFView pdfView= view.findViewById(R.id.pdfSjrh);
        pdfView.fromAsset("sjrh.pdf").load();
    }

}
