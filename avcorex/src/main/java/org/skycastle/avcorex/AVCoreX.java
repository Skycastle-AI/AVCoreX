package org.skycastle.avcorex;

import android.view.Surface;

public class AVCoreX {

    static {
        System.loadLibrary("bootdemo");
    }

    private native int initializeCodec(Surface surface, int width, int height);

    private native int decodeH264(byte[] data);
}
