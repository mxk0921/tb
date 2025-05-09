package org.android.spdy;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public enum SpdyVersion {
    SPDY2(2),
    SPDY3(3),
    SPDY3DOT1(4);
    
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int version;

    SpdyVersion(int i) {
        this.version = i;
    }

    public static /* synthetic */ Object ipc$super(SpdyVersion spdyVersion, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in org/android/spdy/SpdyVersion");
    }

    public static SpdyVersion valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SpdyVersion) ipChange.ipc$dispatch("eb2be338", new Object[]{str});
        }
        return (SpdyVersion) Enum.valueOf(SpdyVersion.class, str);
    }
}
