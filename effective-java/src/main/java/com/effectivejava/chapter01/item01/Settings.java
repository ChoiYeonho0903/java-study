package com.effectivejava.chapter01.item01;

public class Settings {
    private boolean useAutoSteering;

    private boolean userABs;

    private Settings() {}

    private static final Settings SETTINGS = new Settings();

    public static Settings newInstance() {
        return SETTINGS;
    }

}
