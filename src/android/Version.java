package com.vaenow.appupdate.android;

/**
 * Created by LuoWen on 2015/12/14.
 */
public class Version {
    private int local;
    private int remote;
    private String whatsnewMsg;

    public Version(int local, int remote, String whatsnewMsg) {
        this.local = local;
        this.remote = remote;
        this.whatsnewMsg = whatsnewMsg;
    }

    public int getLocal() {
        return local;
    }

    public int getRemote() {
        return remote;
    }

    public String getWhatsnewMsg() { return whatsnewMsg; }
}