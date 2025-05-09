package com.taobao.adaemon;

import android.app.Application;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.adaemon.Launcher_InitProcessMonitor;
import java.io.Serializable;
import java.util.HashMap;
import tb.cp;
import tb.mf;
import tb.o41;
import tb.oxn;
import tb.s55;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class Launcher_InitProcessMonitor implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "adaemon";

    static {
        t2o.a(349175836);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$init$0(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c9be1bf", new Object[]{application});
            return;
        }
        Log.e(TAG, "LocalProcessMonitor start");
        LocalProcessMonitor.h0().Q0(application);
    }

    public static void init(final Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{application, hashMap});
            return;
        }
        o41.c(application);
        Log.e(TAG, " Launcher_InitProcessMonitor process:" + cp.b(application));
        s55.i(TAG, "Launcher_InitProcessMonitor", "process", cp.b(application));
        oxn.s().B(application);
        LocalProcessMonitor.h0().N0(application);
        mf.l(new Runnable() { // from class: tb.yhg
            @Override // java.lang.Runnable
            public final void run() {
                Launcher_InitProcessMonitor.lambda$init$0(application);
            }
        });
    }
}
