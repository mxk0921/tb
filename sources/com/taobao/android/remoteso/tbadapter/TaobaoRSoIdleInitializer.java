package com.taobao.android.remoteso.tbadapter;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.log.RSoLog;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import tb.fbn;
import tb.qbn;
import tb.rbn;
import tb.van;

/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class TaobaoRSoIdleInitializer {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final long DELAY_RSOLITE = TimeUnit.SECONDS.toMillis(40);
    @Deprecated
    public static final String TAG_TAOBAO_REMOTE_SO = "TaobaoRemoteSo";

    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Application f9286a;

        public a(Application application) {
            this.f9286a = application;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                fbn.c(this.f9286a);
            }
        }
    }

    public static void init(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{application, hashMap});
            return;
        }
        try {
            RSoLog.d("TaobaoRSoIdleInitializer, init(), start");
            van.f().j();
            qbn.e(new a(application), DELAY_RSOLITE);
            RSoLog.d("TaobaoRSoIdleInitializer, init(), done");
        } catch (Throwable th) {
            rbn.g("TaobaoRSoIdleInitializer, init()  error", th);
        }
    }
}
