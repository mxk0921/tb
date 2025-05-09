package org.android.spdy;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public enum SpdySessionKind {
    NONE_SESSION(0),
    WIFI_SESSION(1),
    THREE_G_SESSION(2),
    TWO_G_SESSION(3);
    
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int code;

    SpdySessionKind(int i) {
        this.code = i;
    }

    public static /* synthetic */ Object ipc$super(SpdySessionKind spdySessionKind, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in org/android/spdy/SpdySessionKind");
    }

    public static SpdySessionKind valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SpdySessionKind) ipChange.ipc$dispatch("bddee486", new Object[]{str});
        }
        return (SpdySessionKind) Enum.valueOf(SpdySessionKind.class, str);
    }

    public int getint() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4f3030d3", new Object[]{this})).intValue();
        }
        return this.code;
    }
}
