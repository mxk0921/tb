package com.alipay.security.mobile.auth;

import android.app.Application;
import android.content.Context;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class MyApplication extends Application {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static MyApplication mcontext;

    public static Context getAppContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("7e19c4c3", new Object[0]);
        }
        return mcontext;
    }

    public static /* synthetic */ Object ipc$super(MyApplication myApplication, String str, Object... objArr) {
        if (str.hashCode() == 413640386) {
            super.onCreate();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/security/mobile/auth/MyApplication");
    }

    @Override // android.app.Application
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
            return;
        }
        super.onCreate();
        mcontext = this;
    }
}
