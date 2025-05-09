package com.taobao.taobao.weex2;

import android.app.Application;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_plugin.WeexInitSwitch;
import com.taobao.android.weex_plugin.WeexPlugin;
import java.io.File;
import java.io.Serializable;
import tb.i5x;
import tb.o3x;
import tb.p7x;
import tb.u8x;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class AppWeexEngineAutoInit implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static long getProcessStartTime() {
        long startUptimeMillis;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("95784991", new Object[0])).longValue();
        }
        if (Build.VERSION.SDK_INT < 24) {
            return getProcessStartTimeFallback();
        }
        long currentTimeMillis = System.currentTimeMillis();
        long uptimeMillis = SystemClock.uptimeMillis();
        startUptimeMillis = Process.getStartUptimeMillis();
        return currentTimeMillis - (uptimeMillis - startUptimeMillis);
    }

    private static long getProcessStartTimeFallback() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1a1d8d93", new Object[0])).longValue();
        }
        try {
            File file = new File("/proc/" + Process.myPid() + "/comm");
            if (file.exists()) {
                return file.lastModified();
            }
        } catch (Throwable unused) {
        }
        return -1L;
    }

    public static void initFramework(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee87e42a", new Object[]{application});
            return;
        }
        if (WeexInitSwitch.isIsSoPreloadBatch()) {
            WeexPlugin.doPreloadSo();
        }
        u8x.i("WeexInitRemoteQking");
        WeexInitSwitch.loadRemoteQking(application);
        u8x.j();
        o3x.k(application);
        p7x.h(application);
        i5x.c(application);
        o3x.f(application);
        p7x.d(application);
    }

    public static void initUIKit(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf67e0e6", new Object[]{application});
            return;
        }
        o3x.i(application);
        p7x.f(application);
        i5x.a(application);
        o3x.d(application);
        p7x.b(application);
    }

    public static void initUnicorn(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e5463d0", new Object[]{application});
            return;
        }
        o3x.j(application);
        p7x.g(application);
        i5x.b(application);
        o3x.e(application);
        p7x.c(application);
    }
}
