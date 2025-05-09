package com.taobao.android.searchbaseframe.net;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ResultException extends Exception {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private ResultError mError;

    static {
        t2o.a(993001897);
    }

    public ResultException(ResultError resultError) {
        this.mError = resultError;
    }

    public static /* synthetic */ Object ipc$super(ResultException resultException, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/searchbaseframe/net/ResultException");
    }

    public ResultError getError() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ResultError) ipChange.ipc$dispatch("9fbe2fc1", new Object[]{this});
        }
        return this.mError;
    }
}
