package com.example.mymedicine;


import androidx.fragment.app.Fragment;


public class MainActivity  extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return MedFragment.newInstance();
    }
}