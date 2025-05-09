package com.taobao.themis.taobao.initializer;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.basic.TMSLogger;
import java.io.Serializable;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicLong;
import tb.b3x;
import tb.bxt;
import tb.gex;
import tb.h8s;
import tb.mhu;
import tb.o9s;
import tb.opx;
import tb.q9s;
import tb.t2o;
import tb.tcs;
import tb.vxm;
import tb.xas;
import tb.y2x;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class TMSIDLEInitializer implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String NAME = "TMSIDLEInitializer";
    private static final String TAG = "TMSInitializer:TMSIDLEInitializer";
    private static xas scheduler;

    static {
        t2o.a(847249506);
    }

    public static void init(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{application, hashMap});
            return;
        }
        AtomicLong atomicLong = h8s.sTMSIDLEInitTime;
        atomicLong.compareAndSet(-1L, System.currentTimeMillis());
        vxm.b.e().a("tmsIDLInitTime", Long.valueOf(o9s.c(atomicLong.get())));
        if (!h8s.a(application.getApplicationContext())) {
            TMSLogger.b(TAG, "skip TMSEarlyInitializer");
            return;
        }
        xas xasVar = new xas(TAG);
        scheduler = xasVar;
        xasVar.a(new gex(NAME));
        if (!q9s.P3()) {
            scheduler.a(new b3x(NAME));
        }
        scheduler.a(new y2x(NAME));
        scheduler.a(new tcs(NAME));
        scheduler.a(new opx(NAME));
        scheduler.a(new mhu(NAME));
        scheduler.a(new bxt(NAME));
        scheduler.b(application, hashMap);
    }
}
