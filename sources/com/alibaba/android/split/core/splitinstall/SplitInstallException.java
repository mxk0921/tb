package com.alibaba.android.split.core.splitinstall;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.ccy;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class SplitInstallException extends RuntimeException {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final int errorCode;

    static {
        t2o.a(677380248);
    }

    public SplitInstallException(int i) {
        super(String.format("Split Install Error(%d): %s", Integer.valueOf(i), ccy.a(i)));
        this.errorCode = i;
    }

    public static /* synthetic */ Object ipc$super(SplitInstallException splitInstallException, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/split/core/splitinstall/SplitInstallException");
    }

    public int getErrorCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5461de59", new Object[]{this})).intValue();
        }
        return this.errorCode;
    }

    public SplitInstallException(String str, Throwable th) {
        super(str, th);
        this.errorCode = 0;
    }
}
