package com.example.testing_covid.Maps.Interface;

import com.example.testing_covid.Maps.Interface.IOLoadLocationListener;
import com.example.testing_covid.Maps.MyLatLng;

import java.util.List;

public interface IOLoadLocationListener {
    void onLoadLocationSucess(List<MyLatLng> latLngs);
    void onLoadLocationFailed(String message);

}
