package com.taobao.wangxin.app;

import android.app.Application;
import android.os.SystemClock;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.tools.ir.runtime.a;
import com.taobao.message.kit.util.BundleSplitUtil;
import com.taobao.message.launcher.init.FeatureInitHelper;
import com.taobao.message.launcher.init.InitOpenPoint;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.log.TLog;
import com.taobao.wangxin.app.LauncherMessage;
import java.util.HashMap;
import tb.d1a;
import tb.g1a;
import tb.t2o;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class LauncherMessage {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String BUNDLE_NAME = "com.taobao.wangxin";
    public static long sFirstDispatchTime;
    private final String TAG = "LauncherMessage";
    private final String MODULE = "MPMSGS";

    static {
        t2o.a(530579528);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ xhv lambda$initMsgBundle$0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("bdda96a8", new Object[0]);
        }
        return xhv.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ xhv lambda$initMsgBundle$1(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("89b808f3", new Object[]{str});
        }
        return xhv.INSTANCE;
    }

    public void init(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{this, application, hashMap});
            return;
        }
        sFirstDispatchTime = SystemClock.uptimeMillis();
        if ("1".equals(OrangeConfig.getInstance().getConfig("launch_config", "wx_mode", "1"))) {
            a.a(BUNDLE_NAME, null);
        }
        InitOpenPoint.registerProcessor(new DefaultInitProcessor(application));
        TLog.loge("MPMSGS", "LauncherMessage", "init");
        FeatureInitHelper.init("LauncherMessage", InitMessage.INIT_CLASS_NAME);
    }

    public void initMsgBundle(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("823988ae", new Object[]{this, application, hashMap});
            return;
        }
        TLog.loge("MPMSGS", "LauncherMessage", "initMsgBundle");
        BundleSplitUtil.INSTANCE.checkMsgBundleReady("LauncherMessage", 0, new d1a() { // from class: tb.ehg
            @Override // tb.d1a
            public final Object invoke() {
                xhv lambda$initMsgBundle$0;
                lambda$initMsgBundle$0 = LauncherMessage.lambda$initMsgBundle$0();
                return lambda$initMsgBundle$0;
            }
        }, new g1a() { // from class: tb.fhg
            @Override // tb.g1a
            public final Object invoke(Object obj) {
                xhv lambda$initMsgBundle$1;
                lambda$initMsgBundle$1 = LauncherMessage.lambda$initMsgBundle$1((String) obj);
                return lambda$initMsgBundle$1;
            }
        }, false, null);
    }
}
