package com.taobao.android.rtqpixelstreamingandroid;

import android.view.Surface;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class PixelStreamingNativeLib {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static native void destroyStreaming(String str);

    public static native String genGameUUID();

    public static native String getStats(String str);

    public static native void onViewPaused(String str);

    public static native void onViewResumed(String str);

    public static native void registerSurface(String str, Surface surface);

    public static native void requestVideoKeyframe(String str);

    public static native boolean sendTransportData(String str, byte[] bArr);

    public static native boolean startMetrics(String str, double d);

    public static native boolean startTransport(String str, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4);

    public static native int supportHardwardDecode();

    public static native boolean toggleReuseConnMode();

    public static native boolean toggleReuseSendParamsMode();

    static {
        t2o.a(316669957);
        if (RTQPixelStreaming.isLibraryLocal) {
            System.loadLibrary("rtqpixelstreamingandroid");
        }
    }
}
