package com.alipay.mobile.common.transportext.biz.shared;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.MiscUtils;
import com.alipay.mobile.common.transport.utils.NetworkAsyncTaskExecutor;
import com.alipay.mobile.common.transport.utils.TransportEnvUtil;
import com.alipay.mobile.common.transportext.biz.rpctest.RpcTestService;
import com.alipay.mobile.common.transportext.biz.shared.spdy.SpdyShortTimeoutHelper;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.TimeUnit;
import tb.d0j;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class ExtTransAppVisibleReceiver extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String FRAMEWORK_ACTIVITY_RESUME = "com.alipay.mobile.framework.BROUGHT_TO_FOREGROUND";
    public static final String FRAMEWORK_ACTIVITY_USERLEAVEHINT = "com.alipay.mobile.framework.USERLEAVEHINT";

    /* renamed from: a  reason: collision with root package name */
    public boolean f4208a = true;
    public boolean b = true;

    public static void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("715cb891", new Object[0]);
        }
    }

    public static void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a1290f1", new Object[0]);
        }
    }

    public static /* synthetic */ Object ipc$super(ExtTransAppVisibleReceiver extTransAppVisibleReceiver, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/mobile/common/transportext/biz/shared/ExtTransAppVisibleReceiver");
    }

    public final void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25ecced5", new Object[]{this, context});
        }
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        SpdyShortTimeoutHelper.adjustmentSpdyTimeout();
        g();
        f(ExtTransportEnv.getAppContext());
        d();
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        SpdyShortTimeoutHelper.setLeaveTime(System.currentTimeMillis());
        a(ExtTransportEnv.getAppContext());
        e();
        RpcTestService.getInstance().sendTestRpc();
    }

    public final void f(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f34e48e5", new Object[]{this, context});
        }
    }

    public final void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9eadb00", new Object[]{this});
        } else if (MiscUtils.isDebugger(ExtTransportEnv.getAppContext()) && MiscUtils.isInAlipayClient(ExtTransportEnv.getAppContext())) {
            NetworkAsyncTaskExecutor.scheduleAtFixedRate(new Runnable() { // from class: com.alipay.mobile.common.transportext.biz.shared.ExtTransAppVisibleReceiver.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    try {
                        LogCatUtil.info("ExtTransAppVisibleReceiver", "triggerTestCases#run  start");
                        Class<?> cls = Class.forName("com.alipay.mobile.common.transportext.test.ExtTestCaseSuit");
                        cls.getDeclaredMethod("main", new Class[0]).invoke(cls, new Object[0]);
                    } catch (Throwable th) {
                        LogCatUtil.warn("ExtTransAppVisibleReceiver", "triggerTestCases#run exception: " + th.toString());
                    }
                }
            }, 10L, 40L, TimeUnit.SECONDS);
        }
    }

    public void regiester() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2dc1b505", new Object[]{this});
            return;
        }
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction(FRAMEWORK_ACTIVITY_RESUME);
            intentFilter.addAction(FRAMEWORK_ACTIVITY_USERLEAVEHINT);
            LocalBroadcastManager.getInstance(ExtTransportEnv.getAppContext()).registerReceiver(this, intentFilter);
            if (MiscUtils.isInAlipayClient(TransportEnvUtil.getContext())) {
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.SCREEN_OFF");
                intentFilter2.addAction("android.intent.action.SCREEN_ON");
                ExtTransportEnv.getAppContext().registerReceiver(this, intentFilter2);
            }
        } catch (Exception e) {
            LogCatUtil.warn("ExtTransAppVisibleReceiver", e);
        }
    }

    public void unregister() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50cd9ac3", new Object[]{this});
            return;
        }
        try {
            LocalBroadcastManager.getInstance(ExtTransportEnv.getAppContext()).unregisterReceiver(this);
        } catch (Exception e) {
            LogCatUtil.warn("ExtTransAppVisibleReceiver", "unregister exception: " + e.toString());
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            return;
        }
        LogCatUtil.info(d0j.tlogTag, "onReceive:".concat(getClass().getSimpleName()));
        String action = intent.getAction();
        if (FRAMEWORK_ACTIVITY_RESUME.equalsIgnoreCase(action)) {
            this.f4208a = true;
            if (this.b) {
                b();
            }
        } else if (FRAMEWORK_ACTIVITY_USERLEAVEHINT.equalsIgnoreCase(action)) {
            this.f4208a = false;
            c();
        } else if ("android.intent.action.SCREEN_ON".equals(action)) {
            this.b = true;
            if (this.f4208a) {
                b();
            }
        } else if ("android.intent.action.SCREEN_OFF".equals(action)) {
            this.b = false;
            if (this.f4208a) {
                c();
            }
        }
    }
}
