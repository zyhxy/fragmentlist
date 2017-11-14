package com.example.a32735.fragmentlist;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.support.v4.app.Fragment;


/**
 * Created by 32735 on 11/12/2017.
 */

public class DetailFragment extends Fragment {
    TextView textview;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.detail_fragment,container,false);
    }
    public void receivePosition(int position){
        textview = (TextView) getActivity().findViewById(R.id.textView);
        String[] descriptions = getResources().getStringArray(R.array.descriptions);
        textview.setText(descriptions[position]);

    }
}
