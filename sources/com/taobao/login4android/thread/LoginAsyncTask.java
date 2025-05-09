package com.taobao.login4android.thread;

import android.os.AsyncTask;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.log.LoginTLogAdapter;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public abstract class LoginAsyncTask<Params, Progress, Result> extends AsyncTask<Params, Progress, Result> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "login.LoginAsyncTask";

    static {
        t2o.a(516948000);
    }

    public static /* synthetic */ Object ipc$super(LoginAsyncTask loginAsyncTask, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/login4android/thread/LoginAsyncTask");
    }

    public void doFinally() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bc23aff", new Object[]{this});
        }
    }

    /* JADX WARN: Finally extract failed */
    @Override // android.os.AsyncTask
    public Result doInBackground(Params... paramsArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Result) ipChange.ipc$dispatch("e83e4786", new Object[]{this, paramsArr});
        }
        try {
            Result excuteTask = excuteTask(paramsArr);
            doFinally();
            return excuteTask;
        } catch (Throwable th) {
            try {
                handleException(th);
                doFinally();
                return null;
            } catch (Throwable th2) {
                doFinally();
                throw th2;
            }
        }
    }

    public abstract Result excuteTask(Params... paramsArr) throws Exception;

    public void handleException(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c33990a7", new Object[]{this, th});
            return;
        }
        th.printStackTrace();
        LoginTLogAdapter.w(TAG, "LoginAsyncTask excute failed", th);
    }
}
