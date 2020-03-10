package com.vaenow.appupdate.android;

public class RemoteUpdateInfo {
    public int versionCodeRemote;
    public String whatsnewMsg;

    public RemoteUpdateInfo(int versionCodeRemote, String whatsnewMsg) {
        this.versionCodeRemote = versionCodeRemote;
        this.whatsnewMsg = whatsnewMsg;
    }
}
