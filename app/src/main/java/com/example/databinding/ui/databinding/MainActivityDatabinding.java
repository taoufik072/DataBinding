package com.example.databinding.ui.databinding;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

import com.example.databinding.model.City;
import com.example.databinding.myapplication.R;
import com.example.databinding.myapplication.databinding.MainBindingBinding;

import butterknife.BindView;
import butterknife.ButterKnife;


public class MainActivityDatabinding extends AppCompatActivity {

    private City city;
    MainBindingBinding binding;

    @BindView(R.id.country_edit)
    EditText country_edit;
    @BindView(R.id.description_edit)
    EditText description_edit;
    @BindView(R.id.name_edit)
    EditText name_edit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.main_binding);
        binding.setController(this);
        ButterKnife.bind(this);

        initData();
        loadData();
    }

    private void initData() {
        city = new City("Paris", "France", R.drawable.paris, getString(R.string.description));
    }

    private void loadData() {
        binding.setCity(city);
    }

    public void exit() {
        finish();
    }

    public void update() {

        city.setName(name_edit.getText().toString());
        city.setCountry(country_edit.getText().toString());
        city.setDescription(description_edit.getText().toString());
    }

}
