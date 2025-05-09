package com.taobao.vpm;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class VPMSession {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private long mNativePtr;

    public VPMSession(long j) {
        this.mNativePtr = j;
    }

    private native void _setHeartInterval(int i);

    private native void _start();

    private native void _stop();

    public native void _setUserStatDict(String str);

    public void feedAudioFrameToFrame(int i, byte[] bArr, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("930af4dd", new Object[]{this, new Integer(i), bArr, new Integer(i2), new Integer(i3), new Integer(i4)});
        }
    }

    public void feedVideoFrameToFrame(int i, byte[] bArr, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1adaab61", new Object[]{this, new Integer(i), bArr, new Integer(i2), new Integer(i3)});
        }
    }

    public void setUserStatMap(HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2000f111", new Object[]{this, hashMap});
            return;
        }
        StringBuilder sb = new StringBuilder("");
        for (String str : hashMap.keySet()) {
            sb.append(str + "=" + hashMap.get(str) + ", ");
        }
        sb.delete(sb.length() - 2, sb.length());
        _setUserStatDict(sb.toString());
    }

    public void start() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
        } else if (this.mNativePtr != 0) {
            _start();
        }
    }

    public void stop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6623bb89", new Object[]{this});
        } else if (this.mNativePtr != 0) {
            _stop();
            this.mNativePtr = 0L;
        }
    }
}
