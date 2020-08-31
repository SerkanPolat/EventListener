package com.sp.events.api;


public class HotelBookRequest{
    private String userId;
    private String OtelId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getOtelId() {
        return OtelId;
    }

    public void setOtelId(String otelId) {
        OtelId = otelId;
    }

    @Override
    public String toString() {
        return "HotelBookRequest{" +
                "userId='" + userId + '\'' +
                ", OtelId='" + OtelId + '\'' +
                '}';
    }
}