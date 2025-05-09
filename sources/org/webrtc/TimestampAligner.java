package org.webrtc;

import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class TimestampAligner {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(395313838);
    }

    public static long getRtcTimeNanos() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("64204f82", new Object[0])).longValue();
        }
        return nativeRtcTimeNanos();
    }

    private static native long nativeRtcTimeNanos();
}
