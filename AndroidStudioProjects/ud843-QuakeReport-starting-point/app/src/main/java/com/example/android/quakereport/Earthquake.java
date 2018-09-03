package com.example.android.quakereport;

public class Earthquake {
    private String magnitude;
    private String city;
    private long millisecondsTime;   // Milliseconds since 1970 time epoch

    public Earthquake(String mag, String city, long timeInMilliseconds)
    {
        this.magnitude = mag;
        this.city = city;
        this.millisecondsTime = timeInMilliseconds;
    }

    public String getMagnitude()
    {
        return magnitude;
    }

    public String getCity()
    {
        return city;
    }

    public long getTimeInMilliseconds()
    {
        return millisecondsTime;
    }
}
