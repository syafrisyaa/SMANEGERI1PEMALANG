package com.blogspot.broapplications.smanegeri1pemalang;


import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;


/**
 * A simple {@link Fragment} subclass.
 */
public class EkstraFragment extends Fragment {


    public EkstraFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_ekstra, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState){
        super.onViewCreated(view, savedInstanceState);
        LinearLayout pmdh = view.findViewById(R.id.pmdh);
        pmdh.setOnClickListener(new View.OnClickListener()
        {
            public void onClick (View v)
            {
                Intent intent = new Intent(getActivity(),EpmdhActivity.class);
                startActivity(intent);
            }
        });
        LinearLayout reb = view.findViewById(R.id.rebana);
        reb.setOnClickListener(new View.OnClickListener()
        {
            public void onClick (View v)
            {
                Intent intent = new Intent(getActivity(),ErebanaActivity.class);
                startActivity(intent);
            }
        });
        LinearLayout rab = view.findViewById(R.id.bahasaarab);
        rab.setOnClickListener(new View.OnClickListener()
        {
            public void onClick (View v)
            {
                Intent intent = new Intent(getActivity(),EbarabActivity.class);
                startActivity(intent);
            }
        });
        LinearLayout hyc = view.findViewById(R.id.hyc);
        hyc.setOnClickListener(new View.OnClickListener()
        {
            public void onClick (View v)
            {
                Intent intent = new Intent(getActivity(),EhycActivity.class);
                startActivity(intent);
            }
        });
        LinearLayout kc = view.findViewById(R.id.kc);
        kc.setOnClickListener(new View.OnClickListener()
        {
            public void onClick (View v)
            {
                Intent intent = new Intent(getActivity(),EkcActivity.class);
                startActivity(intent);
            }
        });
        LinearLayout pmr = view.findViewById(R.id.pmr);
        pmr.setOnClickListener(new View.OnClickListener()
        {
            public void onClick (View v)
            {
                Intent intent = new Intent(getActivity(),EpmrActivity.class);
                startActivity(intent);
            }
        });
        LinearLayout ton = view.findViewById(R.id.tonpasus);
        ton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick (View v)
            {
                Intent intent = new Intent(getActivity(),EtonpasusActivity.class);
                startActivity(intent);
            }
        });
        LinearLayout pks = view.findViewById(R.id.pks);
        pks.setOnClickListener(new View.OnClickListener()
        {
            public void onClick (View v)
            {
                Intent intent = new Intent(getActivity(),EpksActivity.class);
                startActivity(intent);
            }
        });
        LinearLayout pir = view.findViewById(R.id.pir);
        pir.setOnClickListener(new View.OnClickListener()
        {
            public void onClick (View v)
            {
                Intent intent = new Intent(getActivity(),EpirActivity.class);
                startActivity(intent);
            }
        });
        LinearLayout pra = view.findViewById(R.id.pramuka);
        pra.setOnClickListener(new View.OnClickListener()
        {
            public void onClick (View v)
            {
                Intent intent = new Intent(getActivity(),EpramukaActivity.class);
                startActivity(intent);
            }
        });
        LinearLayout lh = view.findViewById(R.id.lhidup);
        lh.setOnClickListener(new View.OnClickListener()
        {
            public void onClick (View v)
            {
                Intent intent = new Intent(getActivity(),ElhActivity.class);
                startActivity(intent);
            }
        });
        LinearLayout kwh = view.findViewById(R.id.kwh);
        kwh.setOnClickListener(new View.OnClickListener()
        {
            public void onClick (View v)
            {
                Intent intent = new Intent(getActivity(),EkwhActivity.class);
                startActivity(intent);
            }
        });
        LinearLayout bas = view.findViewById(R.id.bolabasket);
        bas.setOnClickListener(new View.OnClickListener()
        {
            public void onClick (View v)
            {
                Intent intent = new Intent(getActivity(),EbbasketActivity.class);
                startActivity(intent);
            }
        });
        LinearLayout vol = view.findViewById(R.id.bolavoli);
        vol.setOnClickListener(new View.OnClickListener()
        {
            public void onClick (View v)
            {
                Intent intent = new Intent(getActivity(),EbvoliActivity.class);
                startActivity(intent);
            }
        });
        LinearLayout bol = view.findViewById(R.id.sepakbola);
        bol.setOnClickListener(new View.OnClickListener()
        {
            public void onClick (View v)
            {
                Intent intent = new Intent(getActivity(),EbolaActivity.class);
                startActivity(intent);
            }
        });
        LinearLayout pck = view.findViewById(R.id.pencaksilat);
        pck.setOnClickListener(new View.OnClickListener()
        {
            public void onClick (View v)
            {
                Intent intent = new Intent(getActivity(),EpencakActivity.class);
                startActivity(intent);
            }
        });
        LinearLayout tae = view.findViewById(R.id.taekwondo);
        tae.setOnClickListener(new View.OnClickListener()
        {
            public void onClick (View v)
            {
                Intent intent = new Intent(getActivity(),EtaekActivity.class);
                startActivity(intent);
            }
        });
        LinearLayout kar = view.findViewById(R.id.karate);
        kar.setOnClickListener(new View.OnClickListener()
        {
            public void onClick (View v)
            {
                Intent intent = new Intent(getActivity(),EkarateActivity.class);
                startActivity(intent);
            }
        });
        LinearLayout krw = view.findViewById(R.id.karawitan);
        krw.setOnClickListener(new View.OnClickListener()
        {
            public void onClick (View v)
            {
                Intent intent = new Intent(getActivity(),EkarawitanActivity.class);
                startActivity(intent);
            }
        });
        LinearLayout pad = view.findViewById(R.id.paduansuara);
        pad.setOnClickListener(new View.OnClickListener()
        {
            public void onClick (View v)
            {
                Intent intent = new Intent(getActivity(),EpadusActivity.class);
                startActivity(intent);
            }
        });
        LinearLayout ser = view.findViewById(R.id.senirupa);
        ser.setOnClickListener(new View.OnClickListener()
        {
            public void onClick (View v)
            {
                Intent intent = new Intent(getActivity(),EseruActivity.class);
                startActivity(intent);
            }
        });
        LinearLayout sen = view.findViewById(R.id.senitari);
        sen.setOnClickListener(new View.OnClickListener()
        {
            public void onClick (View v)
            {
                Intent intent = new Intent(getActivity(),EsentarActivity.class);
                startActivity(intent);
            }
        });
        LinearLayout tea = view.findViewById(R.id.teater);
        tea.setOnClickListener(new View.OnClickListener()
        {
            public void onClick (View v)
            {
                Intent intent = new Intent(getActivity(),EteaterActivity.class);
                startActivity(intent);
            }
        });
        LinearLayout jur = view.findViewById(R.id.jurnalistik);
        jur.setOnClickListener(new View.OnClickListener()
        {
            public void onClick (View v)
            {
                Intent intent = new Intent(getActivity(),EjurnalActivity.class);
                startActivity(intent);
            }
        });
        LinearLayout ict = view.findViewById(R.id.ict);
        ict.setOnClickListener(new View.OnClickListener()
        {
            public void onClick (View v)
            {
                Intent intent = new Intent(getActivity(),EictActivity.class);
                startActivity(intent);
            }
        });
        LinearLayout esc = view.findViewById(R.id.esc);
        esc.setOnClickListener(new View.OnClickListener()
        {
            public void onClick (View v)
            {
                Intent intent = new Intent(getActivity(),EEscActivity.class);
                startActivity(intent);
            }
        });
        LinearLayout dc = view.findViewById(R.id.dc);
        dc.setOnClickListener(new View.OnClickListener()
        {
            public void onClick (View v)
            {
                Intent intent = new Intent(getActivity(),EdcActivity.class);
                startActivity(intent);
            }
        });
    }
}
