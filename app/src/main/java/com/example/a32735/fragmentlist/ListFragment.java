package com.example.a32735.fragmentlist;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.support.v4.app.Fragment;
import android.widget.ListView;

/**
 * Created by 32735 on 11/12/2017.
 */

public class ListFragment extends Fragment implements AdapterView.OnItemClickListener {
    ListView listView;
    Communicator communicator;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        communicator= (Communicator) context;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        return inflater.inflate(R.layout.list_fragment,container,false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        listView = getActivity().findViewById(R.id.ListView);
        ArrayAdapter arrayAdapter = ArrayAdapter.createFromResource(getActivity(),R.array.topics,android.R.layout.simple_list_item_1);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        communicator.communicate(position);
    }
}
