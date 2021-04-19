package com.abdiasgg.punch.ui.utils;

public class FormatStation {

    public String format(double[] stations) {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < stations.length; i++) {
            builder.append("Estación ");
            builder.append(i);
            builder.append(": ");
            builder.append(stations[i]);
            builder.append("\n");
        }
        return builder.toString();
    }
}
