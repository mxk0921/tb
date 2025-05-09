package com.taobao.mrt.task;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class MRTRuntimeException extends Exception {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int errorCode;

    static {
        t2o.a(577765428);
    }

    public MRTRuntimeException(int i, String str) {
        super(str);
        this.errorCode = i;
    }

    public static /* synthetic */ Object ipc$super(MRTRuntimeException mRTRuntimeException, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mrt/task/MRTRuntimeException");
    }

    @Override // java.lang.Throwable
    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "MRTRuntimeException{errorCode:" + this.errorCode + ",msg:" + getMessage() + '}';
    }
}
