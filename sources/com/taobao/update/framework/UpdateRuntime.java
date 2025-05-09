package com.taobao.update.framework;

import android.app.Application;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import tb.bqt;
import tb.c62;
import tb.df4;
import tb.fdh;
import tb.lvu;
import tb.npv;
import tb.qb0;
import tb.ruu;
import tb.suu;
import tb.t2o;
import tb.veh;
import tb.vvu;
import tb.wvu;
import tb.x1i;
import tb.xvu;
import tb.zpt;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class UpdateRuntime {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static boolean forceInstallAfaterDownload;
    public static boolean installBundleAfterDownload;
    public static boolean popDialogBeforeInstall;
    public static String processName;
    public static String sAppName;
    public static boolean sBundleUpdateSuccess;
    private static Application sContext;
    public static String sGroup;
    public static int sLogoResourceId;
    public static String sTTid;
    public boolean commited;
    public static boolean sSevenDaysUpdate = false;
    public static int bundleUpdateMinDisk = 200;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ npv val$action;
        public final /* synthetic */ String val$msg;

        public a(String str, npv npvVar) {
            this.val$msg = str;
            this.val$action = npvVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            ruu ruuVar = (ruu) c62.getInstance(ruu.class);
            if (ruuVar != null) {
                ruuVar.alertForConfirm(this.val$msg, this.val$action);
            } else {
                Log.e("Updater", "UIConfirm is null");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ String val$data;

        public b(String str) {
            this.val$data = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            wvu wvuVar = (wvu) c62.getInstance(wvu.class);
            if (wvuVar != null) {
                wvuVar.toast(this.val$data);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ Runnable val$runnable;

        public c(Runnable runnable) {
            this.val$runnable = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            Process.setThreadPriority(10);
            this.val$runnable.run();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ int val$delayMillis;
        public final /* synthetic */ Runnable val$runnable;

        public d(int i, Runnable runnable) {
            this.val$delayMillis = i;
            this.val$runnable = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            Process.setThreadPriority(10);
            try {
                Thread.sleep(this.val$delayMillis);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.val$runnable.run();
        }
    }

    static {
        t2o.a(947912757);
    }

    public static void doUIAlertForConfirm(String str, npv npvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33350da0", new Object[]{str, npvVar});
        } else {
            x1i.execute(new a(str, npvVar));
        }
    }

    public static void execute(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1afb0dfa", new Object[]{runnable});
            return;
        }
        zpt zptVar = (zpt) c62.getInstance(zpt.class);
        if (zptVar != null) {
            zptVar.execute(runnable);
        } else {
            new Thread(new c(runnable)).start();
        }
    }

    public static Application getContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Application) ipChange.ipc$dispatch("6500554f", new Object[0]);
        }
        return sContext;
    }

    public static void init(Application application, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17c23106", new Object[]{application, str, str2, str3});
            return;
        }
        sContext = application;
        sGroup = str3;
        sTTid = str;
        if (!TextUtils.isEmpty(str2)) {
            sAppName = str2;
        } else {
            sAppName = application.getApplicationInfo().loadLabel(application.getPackageManager()).toString();
        }
        sContext.registerActivityLifecycleCallbacks(new qb0());
        suu.sClickbg2Exit = false;
        c62.registerClass(xvu.class);
        c62.registerClass("sysnotify", vvu.class);
        c62.registerClass("notify", lvu.class);
        c62.registerClass(suu.class);
        c62.registerInstance(new veh());
        c62.registerInstance(new bqt());
        popDialogBeforeInstall = true;
        forceInstallAfaterDownload = false;
        bundleUpdateMinDisk = 200;
        sLogoResourceId = sContext.getApplicationInfo().icon;
    }

    public static void log(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9dd52d5", new Object[]{str});
            return;
        }
        fdh fdhVar = (fdh) c62.getInstance(fdh.class);
        if (fdhVar != null) {
            fdhVar.debug("update.sdk", str);
        }
    }

    public static void tips(boolean z, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afb24d89", new Object[]{new Boolean(z), str, str2});
        } else if (z) {
            toast(str2);
        }
    }

    public static void toast(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("864ba978", new Object[]{str});
        } else {
            x1i.execute(new b(str));
        }
    }

    public static void log(String str, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c62840", new Object[]{str, th});
            return;
        }
        fdh fdhVar = (fdh) c62.getInstance(fdh.class);
        if (fdhVar != null) {
            fdhVar.error("update.sdk", str, th);
        } else {
            Log.e("update.sdk", str, th);
        }
    }

    public static void execute(Runnable runnable, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44672449", new Object[]{runnable, new Integer(i)});
            return;
        }
        zpt zptVar = (zpt) c62.getInstance(zpt.class);
        if (zptVar != null) {
            zptVar.delayExecute(runnable, i);
        } else {
            new Thread(new d(i, runnable)).start();
        }
    }

    public static void init(Application application, df4 df4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7f9ee2", new Object[]{application, df4Var});
            return;
        }
        sContext = application;
        sGroup = df4Var.group;
        sTTid = df4Var.ttid;
        if (!TextUtils.isEmpty(df4Var.appName)) {
            sAppName = df4Var.appName;
        } else {
            sAppName = application.getApplicationInfo().loadLabel(application.getPackageManager()).toString();
        }
        sContext.registerActivityLifecycleCallbacks(new qb0());
        suu.sClickbg2Exit = false;
        Class<xvu> cls = df4Var.uiToastClass;
        if (cls == null) {
            cls = xvu.class;
        }
        c62.registerClass(cls);
        Class<vvu> cls2 = df4Var.uiSysNotifyClass;
        if (cls2 == null) {
            cls2 = vvu.class;
        }
        c62.registerClass("sysnotify", cls2);
        Class<lvu> cls3 = df4Var.uiNotifyClass;
        if (cls3 == null) {
            cls3 = lvu.class;
        }
        c62.registerClass("notify", cls3);
        Class<suu> cls4 = df4Var.uiConfirmClass;
        if (cls4 == null) {
            cls4 = suu.class;
        }
        c62.registerClass(cls4);
        Object obj = df4Var.logImpl;
        if (obj == null) {
            obj = new veh();
        }
        c62.registerInstance(obj);
        Object obj2 = df4Var.threadExecutorImpl;
        if (obj2 == null) {
            obj2 = new bqt();
        }
        c62.registerInstance(obj2);
        popDialogBeforeInstall = df4Var.popDialogBeforeInstall;
        forceInstallAfaterDownload = df4Var.forceInstallAfaterDownload;
        installBundleAfterDownload = df4Var.installBundleAfterDownload;
        bundleUpdateMinDisk = df4Var.bundleUpdateMinDisk;
        sLogoResourceId = sContext.getApplicationInfo().icon;
    }
}
