package com.example.mymedicine;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;



public class MedFragment extends Fragment {

    public static MedFragment newInstance() {
        return new MedFragment();
    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        RecyclerView Recycler = (RecyclerView)inflater.inflate(R.layout.fragment_med, container, false);

        String[] Names = new String[MedType.Type.length];
        for (int i = 0; i < Names.length; i++) {
            Names[i] = MedType.Type[i].getName();
        }

        int[] Images = new int[MedType.Type.length];
        for (int i = 0; i < Images.length; i++) {
            Images[i] = MedType.Type[i].getImageResourceId();
        }

        MainRecyclerAdapter adapter = new MainRecyclerAdapter(Names, Images);
        Recycler.setAdapter(adapter);

        StaggeredGridLayoutManager layoutManager = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
        Recycler.setLayoutManager(layoutManager);


        adapter.setListener(new MainRecyclerAdapter.Listener() {
            public void onClick(int position) {

                Intent intent = new Intent(getActivity(), ShowActivity.class);
                intent.putExtra(ShowActivity.ID, position);
                getActivity().startActivity(intent);

//                Bundle bundle = new Bundle();
//                bundle.putString("type", String.valueOf(position));
//                Fragment fragment = new InfoFragment();
//
//                fragment.setArguments(bundle);
//
//                FragmentTransaction transaction = getFragmentManager().beginTransaction();
//                transaction.replace(R.id.fragmentContainer, fragment);
//                transaction.addToBackStack(null);
//                transaction.commit();
            }
        });

        return Recycler;
    }
}