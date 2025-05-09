package com.taobao.themis.taobao.initializer;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.basic.TMSLogger;
import java.io.Serializable;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import tb.fex;
import tb.h8s;
import tb.iex;
import tb.npx;
import tb.o9s;
import tb.t2o;
import tb.ucs;
import tb.vxm;
import tb.xas;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class TMSResumedInitializer implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String NAME = "TMSResumedInitializer";
    private static final String TAG = "TMSInitializer:TMSResumedInitializer";
    public static AtomicBoolean isInitialized = new AtomicBoolean(false);
    private static xas scheduler;

    static {
        t2o.a(847249509);
    }

    public static void init(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{application, hashMap});
            return;
        }
        TMSLogger.b(TAG, "TMSResumedInitializer start");
        if (!isInitialized.get()) {
            AtomicLong atomicLong = h8s.sTMSRESUMEDTime;
            atomicLong.compareAndSet(-1L, System.currentTimeMillis());
            vxm vxmVar = vxm.b;
            vxmVar.e().a("tmsResumedTime", Long.valueOf(o9s.c(atomicLong.get())));
            vxmVar.e().a("enablePreCreateWebview", h8s.n(application).b());
            xas xasVar = new xas(TAG);
            scheduler = xasVar;
            xasVar.a(new ucs(NAME));
            if (h8s.n(application).d()) {
                scheduler.a(new iex(NAME));
            }
            scheduler.a(new fex(NAME));
            scheduler.a(new npx(NAME));
            scheduler.b(application, hashMap);
            isInitialized.set(true);
        }
    }
}
