package com.example.mymedicine;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class ShowDetailActivity extends AppCompatActivity {
    private TextView tvSecName, tvName;
    private ImageView tvEmail;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.show_layout);
        init();
        getIntentMain();
    }
    private void init()
    {
        tvSecName = findViewById(R.id.tvSecName);
        tvName = findViewById(R.id.tvName);
        tvEmail = findViewById(R.id.tvEmail);
    }
    private void getIntentMain()
    {
        Intent i = getIntent();
        if(i != null)
        {
            tvName.setText(i.getStringExtra(Constant.USER_NAME));
            tvSecName.setText(i.getStringExtra(Constant.USER_SEC_NAME));

            String url = (i.getStringExtra(Constant.USER_IMAGE));
            Picasso.get()
                    .load(url)
                    .placeholder(R.drawable.kisa)
                    .error(R.drawable.ic_launcher_background)
                    .into(tvEmail);
        }
    }
}