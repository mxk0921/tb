package com.taobao.wangxin.app;

import android.app.Application;
import android.os.Looper;
import android.util.Log;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ab.api.ABGlobal;
import com.taobao.android.dinamicx.monitor.DXTraceUtil;
import com.taobao.android.lifecycle.PanguApplication;
import com.taobao.message.kit.util.BundleSplitUtil;
import com.taobao.message.kit.util.TraceUtil;
import com.taobao.message.lab.comfrm.inner.Schedules;
import com.taobao.message.launcher.init.FeatureInitHelper;
import com.taobao.message.launcher.init.InitOpenPoint;
import com.taobao.tao.Globals;
import com.taobao.tao.log.TLog;
import com.taobao.wangxin.app.WxApplication;
import tb.d1a;
import tb.g1a;
import tb.t2o;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class WxApplication extends PanguApplication {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_ASYNC_SDK = "uiASyncSdkV2";
    private final String TAG = "WxApplication";
    private final String MODULE = "MPMSGS";

    static {
        t2o.a(530579538);
    }

    public static /* synthetic */ Object ipc$super(WxApplication wxApplication, String str, Object... objArr) {
        if (str.hashCode() == 413640386) {
            super.onCreate();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/wangxin/app/WxApplication");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ xhv lambda$onCreate$0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("d946e00a", new Object[]{this});
        }
        TLog.loge("WxApplication", "end LauncherMessage");
        globalInit();
        Schedules.getLowBackground().execute(new Runnable() { // from class: com.taobao.wangxin.app.WxApplication.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                FeatureInitHelper.init("WxApplication", InitMessage.INIT_CLASS_NAME);
                TraceUtil.asyncTraceEnd("checkMsgBundleReady", 1110011);
            }
        });
        return xhv.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ xhv lambda$onCreate$1(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("733d7dd5", new Object[]{str});
        }
        TraceUtil.asyncTraceEnd("checkMsgBundleReady", 1110011);
        return xhv.INSTANCE;
    }

    @Override // com.taobao.android.lifecycle.PanguApplication, android.app.Application
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
            return;
        }
        super.onCreate();
        TLog.loge("MPMSGS", "WxApplication", " WxApplication  onCreate ");
        if (!ABGlobal.isFeatureOpened(this, "closeMessageLaunchInit")) {
            enableTrace(Globals.getApplication());
            TraceUtil.beginSection("WxApplication");
            InitOpenPoint.registerProcessor(new DefaultInitProcessor(this));
            if (Looper.getMainLooper() != Looper.myLooper() || !ABGlobal.isFeatureOpened(this, KEY_ASYNC_SDK)) {
                FeatureInitHelper.init("WxApplication", InitMessage.INIT_CLASS_NAME);
            } else {
                TLog.loge("WxApplication", "LauncherMessage v2");
                TraceUtil.asyncTraceBegin("checkMsgBundleReady", 1110011);
                BundleSplitUtil.INSTANCE.checkMsgBundleReady("LauncherMessage", 0, new d1a() { // from class: tb.tjx
                    @Override // tb.d1a
                    public final Object invoke() {
                        xhv lambda$onCreate$0;
                        lambda$onCreate$0 = WxApplication.this.lambda$onCreate$0();
                        return lambda$onCreate$0;
                    }
                }, new g1a() { // from class: tb.ujx
                    @Override // tb.g1a
                    public final Object invoke(Object obj) {
                        xhv lambda$onCreate$1;
                        lambda$onCreate$1 = WxApplication.lambda$onCreate$1((String) obj);
                        return lambda$onCreate$1;
                    }
                }, false, null);
            }
            TraceUtil.endTrace();
            TLog.loge("MPMSGS", "WxApplication", " WxApplication  end ");
        }
    }

    private static void enableTrace(Application application) {
        if (ABGlobal.isFeatureOpened(application, "msgEnableTrace")) {
            try {
                Class.forName("android.os.Trace").getDeclaredMethod("setAppTracingAllowed", Boolean.TYPE).invoke(null, Boolean.TRUE);
                DXTraceUtil.j(true);
                TraceUtil.setEnableTrace(true);
                com.taobao.message.lab.comfrm.util.TraceUtil.setEnableTrace(true);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    private void globalInit() {
        try {
            Class<?> cls = Class.forName("com.taobao.wangxin.app.MsgInitializer");
            cls.getMethod("init", Application.class).invoke(null, Globals.getApplication());
            cls.getMethod("registerIAccount", new Class[0]).invoke(null, new Object[0]);
            TLog.loge("MPMSGS", "WxApplication", " globalInit  end ");
        } catch (Throwable th) {
            TLog.loge("WxApplication", Log.getStackTraceString(th));
        }
    }
}
