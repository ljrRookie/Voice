package com.ljr.voice;

class Player {
    static {
        System.loadLibrary("ljrplayer");
    }

    //    input.mp3    out.pcm
    public native void sound(String input,String output);
}
