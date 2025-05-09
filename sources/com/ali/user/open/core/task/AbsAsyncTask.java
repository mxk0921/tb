package com.ali.user.open.core.task;

import android.os.AsyncTask;
import com.ali.user.open.core.trace.SDKLogger;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public abstract class AbsAsyncTask<Params, Progress, Result> extends AsyncTask<Params, Progress, Result> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "kernel";

    static {
        t2o.a(71303227);
    }

    public static /* synthetic */ Object ipc$super(AbsAsyncTask absAsyncTask, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/ali/user/open/core/task/AbsAsyncTask");
    }

    public abstract Result asyncExecute(Params... paramsArr);

    public abstract void doFinally();

    @Override // android.os.AsyncTask
    public Result doInBackground(Params... paramsArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Result) ipChange.ipc$dispatch("e83e4786", new Object[]{this, paramsArr});
        }
        try {
            return asyncExecute(paramsArr);
        } catch (Throwable th) {
            try {
                SDKLogger.e("kernel", th.getMessage(), th);
                doWhenException(th);
                doFinally();
                return null;
            } finally {
                doFinally();
            }
        }
    }

    public abstract void doWhenException(Throwable th);
}
