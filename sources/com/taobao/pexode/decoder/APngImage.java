package com.taobao.pexode.decoder;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.pexode.entity.RewindableStream;
import java.io.FileDescriptor;
import tb.by0;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class APngImage implements by0 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int LOOP_COUNT_MISSING = -1;
    private long mNativePtr;

    public APngImage(long j) {
        this.mNativePtr = j;
    }

    public static native APngImage nativeCreateFromBytes(byte[] bArr, int i, int i2);

    public static native APngImage nativeCreateFromFd(FileDescriptor fileDescriptor);

    public static native APngImage nativeCreateFromRewindableStream(RewindableStream rewindableStream, byte[] bArr);

    private native void nativeDispose();

    private native void nativeFinalize();

    private native int nativeGetDuration();

    private native APngFrame nativeGetFrame(int i);

    private native int nativeGetFrameCount();

    private native int[] nativeGetFrameDurations();

    private native int nativeGetHeight();

    private native int nativeGetLoopCount();

    private native int nativeGetSizeInBytes();

    private native int nativeGetWidth();

    public static native int nativeLoadedVersionTest();

    @Override // tb.by0
    public void dispose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("226c8326", new Object[]{this});
        } else {
            nativeDispose();
        }
    }

    public boolean doesRenderSupportScaling() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("265c9512", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public void finalize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a35321a5", new Object[]{this});
        } else {
            nativeFinalize();
        }
    }

    public int getDuration() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ed837a84", new Object[]{this})).intValue();
        }
        return nativeGetDuration();
    }

    @Override // tb.by0
    public int getFrameCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9bea4412", new Object[]{this})).intValue();
        }
        return nativeGetFrameCount();
    }

    @Override // tb.by0
    public int[] getFrameDurations() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("c862fad5", new Object[]{this});
        }
        return nativeGetFrameDurations();
    }

    @Override // tb.by0
    public int getHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4703e217", new Object[]{this})).intValue();
        }
        return nativeGetHeight();
    }

    @Override // tb.by0
    public int getSizeInBytes() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("46062c9", new Object[]{this})).intValue();
        }
        return nativeGetSizeInBytes();
    }

    @Override // tb.by0
    public int getWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fc48d08a", new Object[]{this})).intValue();
        }
        return nativeGetWidth();
    }

    @Override // tb.by0
    public APngFrame getFrame(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (APngFrame) ipChange.ipc$dispatch("60950d2b", new Object[]{this, new Integer(i)}) : nativeGetFrame(i);
    }

    @Override // tb.by0
    public int getLoopCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e9ea040f", new Object[]{this})).intValue();
        }
        int nativeGetLoopCount = nativeGetLoopCount();
        if (nativeGetLoopCount == -1) {
            return 1;
        }
        return nativeGetLoopCount;
    }
}
