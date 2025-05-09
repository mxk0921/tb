package com.taobao.android.launcher.common;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.SystemClock;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.bootstrap.tao.ability.BootstrapMode;
import com.taobao.android.nav.Nav;
import com.taobao.linkmanager.afc.utils.TFCCommonUtils;
import com.taobao.orange.OConstant;
import com.taobao.tao.Globals;
import com.taobao.tao.TaoPackageInfo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.b8l;
import tb.bjh;
import tb.cw6;
import tb.iqk;
import tb.jqk;
import tb.muo;
import tb.ppo;
import tb.vct;
import tb.vh4;
import tb.xhq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class LauncherRuntime {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int LAUNCH_TYPE_LINK = 1;
    public static final int LAUNCH_TYPE_LINK_H5 = 2;
    public static final int LAUNCH_TYPE_NORMAL = 0;
    public static final int LAUNCH_TYPE_NOT_ACTIVITY = 4;
    public static final int LAUNCH_TYPE_OTHER = 3;
    public static final String PROCESS_CHANNEL = "com.taobao.taobao:channel";
    public static final String PROCESS_DEX2OAT = "com.taobao.taobao:dex2oat";
    public static final String PROCESS_DEXMERGE = "com.taobao.taobao:dexmerge";
    public static final String PROCESS_MAIN = "com.taobao.taobao";
    public static final String PROCESS_SAFEMODE = "com.taobao.taobao:safemode";
    public static final String PROCESS_SUPPORT = "com.taobao.taobao:support";
    public static final String PROCESS_TOOL = "com.taobao.taobao:tool";
    public static final String PROCESS_UC_SUFFIX = ":sandboxed_privilege_process";
    public static final String PROCESS_UNKNOWN = "unknown";
    public static final String PROCESS_WIDGET = ":widget";

    /* renamed from: a  reason: collision with root package name */
    public static long f8166a;
    public static String b;
    public static String c;
    public static String d;
    public static String e;
    public static String f;
    public static Context g;
    public static Application h;
    public static jqk i;
    public static vh4 j;
    public static int k;
    public static boolean l;
    public static boolean m;
    public static boolean n;
    public static boolean o;
    public static Handler p;
    public static final AtomicBoolean q = new AtomicBoolean(false);
    public static final bjh sLoginState = new bjh();
    public static final AtomicBoolean r = new AtomicBoolean(false);

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public @interface LaunchType {
    }

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public @interface LauncherProcess {
    }

    public static boolean b(vct<String, Void> vctVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("800ad0a8", new Object[]{vctVar})).booleanValue();
        }
        vh4 vh4Var = j;
        if (vh4Var == null) {
            return false;
        }
        return ((muo) vh4Var.d).d(vctVar);
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dd57285c", new Object[0])).booleanValue();
        }
        AtomicBoolean atomicBoolean = q;
        if (atomicBoolean.get() || !(i instanceof iqk) || !atomicBoolean.compareAndSet(false, true)) {
            return true;
        }
        ((iqk) i).q();
        return false;
    }

    public static xhq d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhq) ipChange.ipc$dispatch("ee884526", new Object[0]);
        }
        return ppo.b().c();
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fc8ab329", new Object[0])).booleanValue();
        }
        return q.get();
    }

    public static void f() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c92f9bc", new Object[0]);
            return;
        }
        int b2 = BootstrapMode.b();
        if (BootstrapMode.e(b2, 1024) || !BootstrapMode.e(b2, 8) || BootstrapMode.e(b2, 4)) {
            z = true;
        }
        m = z;
        Nav.useWelcome(z);
    }

    public static boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a9e3a40", new Object[0])).booleanValue();
        }
        if ((i instanceof iqk) && q.compareAndSet(false, true)) {
            ((iqk) i).q();
        }
        return true;
    }

    public static void k(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b517155e", new Object[]{runnable});
        } else {
            p.post(runnable);
        }
    }

    public static int a(Context context) {
        Intent intent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d2b1061f", new Object[]{context})).intValue();
        }
        xhq c2 = ppo.b().c();
        if (c2 == null) {
            return 0;
        }
        if (!c2.f31405a) {
            return 4;
        }
        if (i(c2.e) || (intent = c2.e) == null) {
            return 0;
        }
        return TFCCommonUtils.r(context, intent.getDataString()) ? 2 : 1;
    }

    public static void g(Application application, b8l b8lVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5606cdf8", new Object[]{application, b8lVar});
            return;
        }
        h = application;
        g = application;
        b = b8lVar.f16248a;
        c = b8lVar.b;
        f8166a = b8lVar.c;
        e = b8lVar.d;
        p = new Handler();
        Globals.init(application, LauncherRuntime.class.getClassLoader());
        if (r.compareAndSet(false, true)) {
            TaoPackageInfo.init();
        }
        f = TaoPackageInfo.getPackageTag();
        d = TaoPackageInfo.getTTID();
        cw6.a(application);
        l = cw6.b();
        k = a(application);
        f();
        System.setProperty(OConstant.DIMEN_PROCESS_START_TIME, String.valueOf(SystemClock.uptimeMillis()));
    }

    public static boolean i(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b5130357", new Object[]{intent})).booleanValue();
        }
        if (intent == null) {
            return false;
        }
        if (!"android.intent.action.MAIN".equals(intent.getAction())) {
            return j(intent);
        }
        if (intent.hasCategory("android.intent.category.LAUNCHER")) {
            return true;
        }
        ComponentName component = intent.getComponent();
        if (component == null) {
            return false;
        }
        return "com.taobao.tao.welcome.Welcome".equals(component.getClassName());
    }

    public static boolean j(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("64980170", new Object[]{intent})).booleanValue();
        }
        ComponentName component = intent.getComponent();
        return component != null && "com.taobao.tao.welcome.Welcome".equals(component.getClassName()) && intent.getScheme() == null;
    }
}
