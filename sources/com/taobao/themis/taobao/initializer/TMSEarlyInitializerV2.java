package com.taobao.themis.taobao.initializer;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.basic.TMSLogger;
import java.io.Serializable;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicLong;
import tb.h8s;
import tb.hex;
import tb.no8;
import tb.o9s;
import tb.t2o;
import tb.u7x;
import tb.vxm;
import tb.xas;
import tb.yaa;
import tb.z2x;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class TMSEarlyInitializerV2 implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String NAME = "TMSEarlyInitializer";
    private static final String TAG = "TMSInitializer:TMSEarlyInitializer";
    private static xas scheduler;

    static {
        t2o.a(847249504);
    }

    public static void init(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{application, hashMap});
            return;
        }
        yaa.n = application;
        AtomicLong atomicLong = h8s.sTMSEarlyInitTime;
        atomicLong.compareAndSet(-1L, System.currentTimeMillis());
        TMSLogger.b(TAG, "TMSEarlyInitializerV2 start");
        if (!h8s.a(application.getApplicationContext())) {
            TMSLogger.b(TAG, "skip TMSEarlyInitializerV2");
            return;
        }
        vxm vxmVar = vxm.b;
        vxmVar.e().a("tmsEarlyInitTime", Long.valueOf(o9s.c(atomicLong.get())));
        vxmVar.e().a("preloadWeexSoFeature", h8s.o(application.getApplicationContext()).b());
        vxmVar.e().a("isWeexCart", Boolean.valueOf(h8s.v()));
        xas xasVar = new xas(TAG);
        scheduler = xasVar;
        xasVar.a(new z2x(NAME));
        scheduler.a(new hex(NAME));
        no8 o = h8s.o(application.getApplicationContext());
        if ((o.d() && o.c() == 0) || h8s.v()) {
            TMSLogger.b(TAG, "WeexPreloadSoTask Exec when TMSEarlyInitializer");
            scheduler.a(new u7x(NAME));
        }
        scheduler.b(application, hashMap);
    }
}
