package com.example.databinding.model;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.example.databinding.myapplication.BR;

/**
 * Created by taoufikbg on 29/08/2017.
 */

public class City extends BaseObservable{

    private int image ;
    private String name;
    private String country ;
    private String description ;

    //Constructor

    public City(String name, String country, int image, String description) {
        this.name = name;
        this.country = country;
        this.image = image;
        this.description = description;
    }

    //Getter and Setter
    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(BR.name);
    }

    @Bindable
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
        notifyPropertyChanged(BR.country);
    }

    @Bindable
    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
        notifyPropertyChanged(BR.image);
    }

    @Bindable
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
        notifyPropertyChanged(BR.description);
    }
}
