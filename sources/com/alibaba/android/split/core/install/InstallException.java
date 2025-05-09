package com.alibaba.android.split.core.install;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.nj4;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class InstallException extends RuntimeException {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final int errorCode;

    static {
        t2o.a(677380098);
    }

    public InstallException(int i) {
        super(String.format("Install Error(%d): %s", Integer.valueOf(i), nj4.a(i)));
        this.errorCode = i;
    }

    public static /* synthetic */ Object ipc$super(InstallException installException, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/split/core/install/InstallException");
    }

    public int getErrorCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5461de59", new Object[]{this})).intValue();
        }
        return this.errorCode;
    }
}
