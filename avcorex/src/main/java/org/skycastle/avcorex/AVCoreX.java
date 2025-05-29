package org.skycastle.avcorex;

import android.view.Surface;

public class AVCoreX {

    static {
        System.loadLibrary("bootdemo");

    }

    public native String getString();

    public native int showVideo(Surface surface);

    public native int initializeCodec(Surface surface, int width, int height);

    public native int decodeH264(byte[] data);
}
