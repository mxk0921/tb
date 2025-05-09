package com.taobao.alivfssdk.cache;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class AVFSException extends IllegalStateException {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int ERROR = -1;
    public static final int ERROR_INDEXING = -4;
    public static final int ERROR_IO = -2;
    public static final int ERROR_SERIALIZATION = -3;
    private final int mErrorCode;

    static {
        t2o.a(374341663);
    }

    public AVFSException(String str, Throwable th, int i) {
        super(str, th);
        this.mErrorCode = i;
    }

    public static /* synthetic */ Object ipc$super(AVFSException aVFSException, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/alivfssdk/cache/AVFSException");
    }

    public int getErrorCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5461de59", new Object[]{this})).intValue();
        }
        return this.mErrorCode;
    }
}
