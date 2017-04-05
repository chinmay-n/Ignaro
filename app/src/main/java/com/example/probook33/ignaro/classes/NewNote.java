package com.example.probook33.ignaro.classes;

/**
 * Created by probook@33 on 04-04-2017.
 */

public class NewNote {
    String owner;
    String text;
    String g_id;
    String ownerid;
    String lat;
    String lon;

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLon() {
        return lon;
    }

    public void setLon(String lon) {
        this.lon = lon;
    }

    public String getOwnerid() {
        return ownerid;
    }

    public void setOwnerid(String ownerid) {
        this.ownerid = ownerid;
    }

    public NewNote(String owner, String text, String g_id, String ownerid,String lat,String lon) {
        this.owner = owner;
        this.text = text;
        this.g_id = g_id;
        this.ownerid=ownerid;
        this.lat=lat;
        this.lon=lon;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getG_id() {
        return g_id;
    }

    public void setG_id(String g_id) {
        this.g_id = g_id;
    }
}
