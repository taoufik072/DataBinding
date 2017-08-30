package com.example.databinding.ui.butterKnife;

import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.databinding.model.City;
import com.example.databinding.myapplication.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivitywithButterKnife extends AppCompatActivity {

    @BindView(R.id.name_city) TextView mTextName;
    @BindView(R.id.country_city) TextView mTextCountry;
    @BindView(R.id.description_city_city) TextView mTextDescription;
    @BindView(R.id.imageView) ImageView mImageView;

    private City city;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        initData();
        loadData();
    }

    private void initData() {
        city = new City("Paris","France",R.drawable.paris,getString(R.string.description));
    }
    @OnClick(R.id.exit)
    public void exit() {
        finish();
    }

    private void loadData() {
        mTextName.setText(getString(R.string.name_city, city.getName()));
        mTextCountry.setText(getString(R.string.country_city, city.getCountry()));
        mTextDescription.setText(getString(R.string.description_city, city.getDescription()));
        mImageView.setImageDrawable(ContextCompat.getDrawable(this,city.getImage()));
    }
}
