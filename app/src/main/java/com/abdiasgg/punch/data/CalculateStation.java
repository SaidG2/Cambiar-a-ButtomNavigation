package com.abdiasgg.punch.data;

public class CalculateStation {

    private final double[] values = {179.625, 160.375,
            136.875, 107.125,
            83.625, 64.375,
            40.875, 23.5};

    public double[] getStationsFourByPitch(double pitch) {

        double[] stations = new double[values.length];

        for (int i = 0; i < stations.length; i++) {
            stations[i] = values[i] / pitch;
        }

        return stations;
    }

    public double[] getStationsSixEightByPitch(double pitch) {

        double[] stations = new double[values.length];

        for (int i = 0; i < stations.length; i++) {
            stations[i] = values[i] / pitch / 2;
        }

        return stations;
    }
}
