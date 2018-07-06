package com.blogspot.broapplications.smanegeri1pemalang;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;


/**
 * A simple {@link Fragment} subclass.
 */
public class KemdikbudFragment extends Fragment {
    WebView mWebView;



    public KemdikbudFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_kemdikbud,container,false);
        mWebView = (WebView)v.findViewById(R.id.wv);
        mWebView.loadUrl("http://sekolah.data.kemdikbud.go.id/index.php/chome/profil/EECFEF7F-C139-4FDC-87DB-A2665EFCBFFD");

        WebSettings webSettings = mWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        mWebView.setWebViewClient(new WebViewClient());
        return v;
    }

}
