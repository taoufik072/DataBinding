package com.example.databinding.ui;

import android.databinding.DataBindingUtil;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.databinding.model.City;
import com.example.databinding.myapplication.R;
import com.example.databinding.ui.databinding.MainActivityDatabinding;

public class MainActivity extends AppCompatActivity {

    private TextView mTextName;
    private TextView mTextCountry;
    private TextView mTextDescription;
    private ImageView mImageView;

    private City city;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mTextName = (TextView) findViewById(R.id.name_city);
        mTextCountry = (TextView) findViewById(R.id.country_city);
        mTextDescription = (TextView) findViewById(R.id.description_city_city);
        mImageView = (ImageView) findViewById(R.id.imageView);

        findViewById(R.id.exit).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exit();
            }
        });
        initData();
        loadData();
    }

    private void initData() {
        city = new City("Paris","France",R.drawable.paris,getString(R.string.description));
    }
    private void exit() {
        finish();
    }

    private void loadData() {

        mTextName.setText(getString(R.string.name_city, city.getName()));
        mTextCountry.setText(getString(R.string.country_city, city.getCountry()));
        mTextDescription.setText(getString(R.string.description_city, city.getDescription()));
        mImageView.setImageDrawable(ContextCompat.getDrawable(this,city.getImage()));
    }
}
