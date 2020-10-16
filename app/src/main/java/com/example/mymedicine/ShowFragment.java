//package com.example.mymedicine;
//
//import android.os.Bundle;
//
//import androidx.fragment.app.Fragment;
//import androidx.recyclerview.widget.RecyclerView;
//import androidx.recyclerview.widget.StaggeredGridLayoutManager;
//
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//
//
//public class ShowFragment extends Fragment {
//
//
//    @Override
//    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//    }
//
//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container,
//                             Bundle savedInstanceState) {
//        // Inflate the layout for this fragment
//        RecyclerView Recycler = (RecyclerView)inflater.inflate(R.layout.read_layout, container, false);
//
//        String[] Names = new String[Mazafaka.Type.length];
//        for (int i = 0; i < Names.length; i++) {
//            Names[i] = Mazafaka.Type[i].getName();
//        }
//
//        int[] Images = new int[Mazafaka.Type.length];
//        for (int i = 0; i < Images.length; i++) {
//            Images[i] = Mazafaka.Type[i].getImageResourceId();
//        }
//
//        MainRecyclerAdapter adapter = new MainRecyclerAdapter(Names, Images);
//        Recycler.setAdapter(adapter);
//
//        StaggeredGridLayoutManager layoutManager = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
//        Recycler.setLayoutManager(layoutManager);
//
//        return Recycler;
//    }
//}
