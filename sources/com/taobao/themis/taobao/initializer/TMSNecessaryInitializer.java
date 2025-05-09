package com.taobao.themis.taobao.initializer;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_plugin.WeexPlugin;
import com.taobao.themis.kernel.basic.TMSLogger;
import java.io.Serializable;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import tb.b3x;
import tb.h8s;
import tb.ics;
import tb.iex;
import tb.no8;
import tb.o9s;
import tb.q9s;
import tb.t2o;
import tb.t41;
import tb.tbs;
import tb.u7x;
import tb.vxm;
import tb.xas;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class TMSNecessaryInitializer implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String NAME = "TMSNecessaryInitializer";
    private static final String TAG = "TMSInitializer:TMSNecessaryInitializer";
    public static AtomicBoolean isInitialized = new AtomicBoolean(false);
    private static xas scheduler;

    static {
        t2o.a(847249508);
    }

    public static void init(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{application, hashMap});
            return;
        }
        AtomicLong atomicLong = h8s.sTMSNecessaryInitTime;
        atomicLong.compareAndSet(-1L, System.currentTimeMillis());
        TMSLogger.b(TAG, "TMSNecessaryInitializer start");
        if (!isInitialized.get()) {
            vxm vxmVar = vxm.b;
            vxmVar.e().a("DelayPreCreateWebViewToHomeSecondRefreshEnd", h8s.d(application).b());
            vxmVar.e().a("tmsNecessaryInitTime", Long.valueOf(o9s.c(atomicLong.get())));
            try {
                WeexPlugin.setProcessStartUpTimestamp(Double.valueOf(atomicLong.get()));
            } catch (Throwable th) {
                TMSLogger.d(TAG, th);
            }
            if (!h8s.a(application.getApplicationContext())) {
                TMSLogger.b(TAG, "skip TMSEarlyInitializer");
                return;
            }
            scheduler = new xas(TAG);
            if (!h8s.n(application).d()) {
                TMSLogger.b(TAG, "TMSNecessaryInitializer WindVaneInitPreCreateTask register start");
                scheduler.a(new iex(NAME));
            }
            if (q9s.P3()) {
                scheduler.a(new b3x(NAME));
            }
            scheduler.a(new t41(NAME));
            scheduler.a(new ics(NAME));
            scheduler.a(new tbs(NAME));
            no8 o = h8s.o(application.getApplicationContext());
            if (!o.d() || (o.d() && o.c() == 1)) {
                TMSLogger.b(TAG, "WeexPreloadSoTask Exec when TMSNecessaryInitializer");
                scheduler.a(new u7x(NAME));
            }
            scheduler.b(application, hashMap);
            isInitialized.set(true);
        }
    }
}
