package com.abdiasgg.punch.ui.fourHeads;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.abdiasgg.punch.data.CalculateStation;
import com.abdiasgg.punch.ui.utils.FormatStation;

public class FourHeadsViewModel extends ViewModel {

    private CalculateStation calculateStation;
    private FormatStation formatStation;
    private MutableLiveData<String> mText;

    public FourHeadsViewModel(CalculateStation calculateStation, FormatStation formatStation, MutableLiveData<String> mText) {
        this.calculateStation = calculateStation;
        this.formatStation = formatStation;
        this.mText = mText;
    }

    public void calculateStations(String pitch) {

        if (!pitch.trim().isEmpty()) {
            double[] stations = calculateStation.getStationsFourByPitch(Double.parseDouble(pitch));
            mText.setValue(formatStation.format(stations));
        }
    }

    public LiveData<String> getResult() {
        return mText;
    }
}