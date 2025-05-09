package com.taobao.tbdeviceevaluator;

import android.app.Application;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Log;
import com.ali.alihadeviceevaluator.old.HardWareInfo;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.tbdeviceevaluator.jsbridge.AliHADeviceEvaluationBridge;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import tb.ai7;
import tb.fsw;
import tb.lp0;
import tb.np0;
import tb.obk;
import tb.qp0;
import tb.rp0;
import tb.z9a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class TBHardwareLauncher implements Serializable, obk, Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ORANGE_NAMESPACE = "DeviceEval";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements rp0.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(TBHardwareLauncher tBHardwareLauncher) {
        }

        @Override // tb.rp0.a
        public void a(int i, float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("25a84069", new Object[]{this, new Integer(i), new Float(f)});
                return;
            }
            ai7 ai7Var = new ai7();
            ai7Var.h(i);
            ai7Var.w(f);
        }
    }

    private void configOrange() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8cb89897", new Object[]{this});
            return;
        }
        OrangeConfig.getInstance().getConfigs(ORANGE_NAMESPACE);
        OrangeConfig.getInstance().registerListener(new String[]{ORANGE_NAMESPACE}, this, true);
    }

    @Override // tb.obk
    public void onConfigUpdate(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
            return;
        }
        Map<String, String> configs = OrangeConfig.getInstance().getConfigs(ORANGE_NAMESPACE);
        if (configs != null && configs.size() > 0) {
            try {
                qp0.a((HashMap) configs);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    private void initHardware(Application application, Handler handler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("deec5f50", new Object[]{this, application, handler});
            return;
        }
        new rp0().b(application).c(handler).d(new a(this)).e();
        fsw.i("AliHADeviceEvaluationBridge", AliHADeviceEvaluationBridge.class, true);
    }

    public void init(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{this, application, hashMap});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        new StringBuilder("TBHardwareLauncher start ").append(currentTimeMillis);
        if (!application.getSharedPreferences("deviceevaluator", 0).getBoolean("switch", true)) {
            Log.e(z9a.TAG, "switch is off!");
            z9a.f32627a = application;
            configOrange();
            return;
        }
        HandlerThread handlerThread = new HandlerThread("DeviceJudge");
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        initHardware(application, handler);
        handler.postDelayed(this, 2000L);
        StringBuilder sb = new StringBuilder("TBHardwareLauncher end");
        sb.append(System.currentTimeMillis());
        sb.append(",duration:");
        sb.append(System.currentTimeMillis() - currentTimeMillis);
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        System.currentTimeMillis();
        configOrange();
        HardWareInfo a2 = rp0.a();
        ai7 ai7Var = new ai7();
        if (a2 == null) {
            Log.e(z9a.TAG, "hardWareInfo is null");
            return;
        }
        int n = a2.n();
        if (n > 0) {
            ai7Var.x(n);
            ai7Var.h(qp0.b());
        }
        ai7Var.v(Build.MODEL);
        ai7Var.i(a2.m);
        ai7Var.k(a2.k);
        ai7Var.j(a2.l);
        if (a2.d() > 0) {
            ai7Var.g(a2.d());
        }
        ai7Var.b(a2.f1869a);
        ai7Var.f(a2.b);
        ai7Var.a(a2.j);
        ai7Var.d(a2.d);
        ai7Var.e(a2.e);
        ai7Var.c(a2.c);
        if (a2.j() > 0) {
            ai7Var.q(a2.j());
        }
        ai7Var.n(a2.h);
        ai7Var.p(a2.g);
        ai7Var.o((float) a2.i);
        ai7Var.r(lp0.d().e().f23478a);
        int[] d = new np0().d(z9a.f32627a);
        ai7Var.s(d[0]);
        ai7Var.t(d[1]);
        if (a2.m() > 0) {
            ai7Var.u(a2.m());
        }
        ai7Var.m(lp0.d().c().d);
        ai7Var.l(a2.g());
        System.currentTimeMillis();
        System.currentTimeMillis();
    }
}
