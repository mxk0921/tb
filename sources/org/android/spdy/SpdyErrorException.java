package org.android.spdy;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class SpdyErrorException extends RuntimeException {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int error;

    public SpdyErrorException(int i) {
        this.error = i;
    }

    public static /* synthetic */ Object ipc$super(SpdyErrorException spdyErrorException, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in org/android/spdy/SpdyErrorException");
    }

    public int SpdyErrorGetCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e5743e27", new Object[]{this})).intValue();
        }
        return this.error;
    }

    public SpdyErrorException(String str, int i) {
        super(str);
        this.error = i;
    }

    public SpdyErrorException(String str, Throwable th, int i) {
        super(str, th);
        this.error = i;
    }

    public SpdyErrorException(Throwable th, int i) {
        super(th);
        this.error = i;
    }
}
