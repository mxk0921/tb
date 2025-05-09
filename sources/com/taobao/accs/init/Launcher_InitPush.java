package com.taobao.accs.init;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import anet.channel.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.accs.common.Constants;
import com.taobao.accs.ut.monitor.ManuMonitor;
import com.taobao.accs.utl.ALog;
import com.taobao.agoo.notification.AgooWVPlugin;
import java.io.Serializable;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import org.android.agoo.honor.HonorRegister;
import org.android.agoo.mezu.MeizuRegister;
import org.android.agoo.oppo.OppoRegister;
import org.android.agoo.vivo.VivoRegister;
import org.android.agoo.xiaomi.MiPushRegistar;
import tb.brt;
import tb.fsw;
import tb.t2o;
import tb.xd0;
import tb.y2w;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class Launcher_InitPush implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "Launcher_InitPush";
    public static volatile Boolean isSupportPush = null;
    public static final ManuMonitor manuMonitor = new ManuMonitor();
    private static boolean reported = false;
    public static volatile boolean initialized = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f6063a;

        public a(Context context) {
            this.f6063a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                Launcher_InitPush.monitorNow(this.f6063a);
            }
        }
    }

    static {
        t2o.a(343933123);
    }

    public static boolean isSupportPush() {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("72422d0a", new Object[0])).booleanValue();
        }
        if (isSupportPush == null) {
            synchronized (Launcher_InitPush.class) {
                try {
                    if (isSupportPush == null) {
                        Context context = GlobalClientInfo.getContext();
                        if (!xd0.l(context) && !MiPushRegistar.checkDevice() && !OppoRegister.checkDevice(context) && !VivoRegister.checkDevice(context) && !MeizuRegister.checkDevice(context)) {
                            z = false;
                            isSupportPush = Boolean.valueOf(z);
                        }
                        z = true;
                        isSupportPush = Boolean.valueOf(z);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return isSupportPush.booleanValue();
    }

    public static boolean isHonorChannelEnabled(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9c6f63a7", new Object[]{context})).booleanValue();
        }
        try {
            return HonorRegister.isSupport(context);
        } catch (Throwable th) {
            ALog.e(TAG, "isHonorChannelEnabled err", th, new Object[0]);
            return false;
        }
    }

    public static void init(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{application, hashMap});
        } else if (initialized) {
            ALog.e(TAG, "already init", new Object[0]);
        } else {
            initialized = true;
            ALog.e(TAG, "init", new Object[0]);
            try {
                fsw.h(AgooWVPlugin.WV_NAME, AgooWVPlugin.class);
                initPushChannel(application);
                y2w.a(application);
            } catch (Throwable th) {
                ALog.e(TAG, "init push err", th, new Object[0]);
            }
        }
    }

    public static void initPushChannel(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbb29a68", new Object[]{context});
            return;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences(Constants.SP_FILE_NAME, 0);
        if (sharedPreferences.getInt(Constants.KEY_TOKEN_REPORT_STATUS, 0) > 0) {
            AppMonitor.getInstance().commitStat(new ManuMonitor(true));
        }
        sharedPreferences.edit().putInt(Constants.KEY_TOKEN_REPORT_STATUS, 1).apply();
        brt.j().schedule(new a(context), 30L, TimeUnit.SECONDS);
    }

    public static void monitorNow(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49eb4385", new Object[]{context});
        } else if (!reported || manuMonitor.isAgooControlCmd) {
            reported = true;
            try {
                AppMonitor.getInstance().commitStat(manuMonitor);
                context.getSharedPreferences(Constants.SP_FILE_NAME, 0).edit().putInt(Constants.KEY_TOKEN_REPORT_STATUS, 0).apply();
            } catch (Exception e) {
                ALog.e(TAG, "monitorNow err", e, new Object[0]);
            }
        }
    }
}
