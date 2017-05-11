package com.solo.ver02;


import android.app.Fragment;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TabHost;
import android.widget.TextView;
import android.widget.Toast;

/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment_search extends Fragment {

    public Fragment_search() {
        // Required empty public constructor


    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View mRoot = inflater.inflate(R.layout.fragment_search, container, false);

        TabHost tabhost = (TabHost) mRoot.findViewById(R.id.tabhost);

        tabhost.setup();

        TabHost.TabSpec tabSpec = tabhost.newTabSpec("tag1");
        tabSpec.setContent(R.id.tab1);
        tabSpec.setIndicator("Все");
        tabhost.addTab(tabSpec);

        tabSpec = tabhost.newTabSpec("tag2");
        tabSpec.setContent(R.id.tab2);
        tabSpec.setIndicator("Рядом");
        tabhost.addTab(tabSpec);

        tabSpec = tabhost.newTabSpec("tag3");
        tabSpec.setContent(R.id.tab3);
        tabSpec.setIndicator("Новые");
        tabhost.addTab(tabSpec);

        for(int i=0;i<tabhost.getTabWidget().getChildCount();i++)
        {
            TextView tv = (TextView) tabhost.getTabWidget().getChildAt(i).findViewById(android.R.id.title);
            tv.setTextColor(Color.parseColor("#FFFFFF"));
        }
        return mRoot;


    }
}


