package com.taobao.taobaocompat.lifecycle;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.timestamp.TimeStampManager;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class TimestampSynchronizer {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(775946455);
    }

    public static long getServerTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7cda1621", new Object[0])).longValue();
        }
        return TimeStampManager.instance().getCurrentTimeStamp();
    }

    public static String getServerTimeString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ffc0f02", new Object[0]);
        }
        return String.valueOf(getServerTime() / 1000);
    }
}
