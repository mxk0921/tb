package com.taobao.android.favsdk.favtaobaouse;

import android.app.Application;
import android.os.Bundle;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.favsdk.remoteplugin.RemoteBusinessService;
import com.taobao.login4android.api.Login;
import com.taobao.tao.log.TLog;
import tb.k39;
import tb.ond;
import tb.p5c;
import tb.qp;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class FavSdkManager implements p5c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "FAVSDK_FavSdkManager";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements ond {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(FavSdkManager favSdkManager) {
        }

        @Override // tb.ond
        public String getUserId() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("58ad3b3d", new Object[]{this});
            }
            return Login.getUserId();
        }

        @Override // tb.ond
        public boolean isSessionValid() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("f14699db", new Object[]{this})).booleanValue();
            }
            return Login.checkSessionValid();
        }
    }

    @Override // tb.p5c
    public void init(Application application, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3d5e6ac", new Object[]{this, application, bundle});
            return;
        }
        if (k39.b() == null) {
            k39.e(new qp());
            TLog.logd(TAG, "setGlobalCache");
        }
        if (k39.d() == null) {
            k39.g(new RemoteBusinessService());
            TLog.logd(TAG, "setGlobalNetwork");
        }
        if (k39.c() == null) {
            k39.f(new a(this));
            TLog.logd(TAG, "setGlobalLogin");
        }
    }
}
