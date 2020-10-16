//package com.example.mymedicine;
//
//
//import android.content.Intent;
//import android.os.Bundle;
//
//import androidx.fragment.app.Fragment;
//import androidx.fragment.app.FragmentTransaction;
//
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.ArrayAdapter;
//import android.widget.ImageView;
//import android.widget.ListView;
//
//import com.bumptech.glide.Glide;
//import com.google.firebase.database.DatabaseReference;
//import com.squareup.picasso.Picasso;
//
//import java.util.List;
//
//
//public class InfoFragment extends Fragment {
//
//
//
//    // private ImageView imageView;
//
//
//    @Override
//    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//
//    }
//
//
//
//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container,
//                             Bundle savedInstanceState) {
//        // Inflate the layout for this fragment
//        View inflatedView = inflater.inflate(R.layout.fragment_info, container, false);
//
//        Bundle bundle = this.getArguments();
//        String myValue = (bundle.getString("type"));
//
//        //imageView = inflatedView.findViewById(R.id.image);
//
//
//
//
//
//        switch (myValue) {
//            case "0":
//
////                String url="https://firebasestorage.googleapis.com/v0/b/instuments-4a45e.appspot.com/o/kot1.jpg?alt=media&token=3aa3993f-e1fb-4049-868e-509a3e099c56";
////
////                Picasso.get()
////                    .load(url)
////                    .placeholder(R.drawable.kisa)
////                    .error(R.drawable.ic_launcher_background)
////                    .into(imageView);
//
//                //Glide.with(this).load(url).into(imageView);
//            break;
//            case "1":
//
//                ShowFragment fragment = new ShowFragment(); // Фрагмент, которым собираетесь заменить первый фрагмент
//                FragmentTransaction transaction = getFragmentManager().beginTransaction();
//                transaction.replace(R.id.fragmentContainer, fragment);
//                //transaction.addToBackStack(null);
//                transaction.commit();
//            break;
//        }
//        return inflatedView;
//    }
//
//}