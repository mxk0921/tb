package com.ali.user.mobile.security;

import android.os.AsyncTask;
import com.ali.user.mobile.callback.DataCallback;
import com.ali.user.mobile.rpc.login.model.WUAData;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.log.LoginTLogAdapter;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class WUATask extends AsyncTask<Object, Void, WUAData> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private DataCallback<WUAData> dataCallback;

    static {
        t2o.a(68157603);
    }

    public WUATask(DataCallback<WUAData> dataCallback) {
        this.dataCallback = dataCallback;
    }

    public static /* synthetic */ Object ipc$super(WUATask wUATask, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/ali/user/mobile/security/WUATask");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.AsyncTask
    public WUAData doInBackground(Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WUAData) ipChange.ipc$dispatch("ae00fb2e", new Object[]{this, objArr});
        }
        LoginTLogAdapter.e(SSOSecurityService.TAG, "inWUATask");
        return SecurityGuardManagerWraper.getWUA();
    }

    public void onPostExecute(WUAData wUAData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea904115", new Object[]{this, wUAData});
            return;
        }
        DataCallback<WUAData> dataCallback = this.dataCallback;
        if (dataCallback != null) {
            dataCallback.result(wUAData);
        }
    }
}
