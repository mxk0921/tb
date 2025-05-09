package com.taobao.android.tschedule;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ab.api.ABGlobal;
import com.taobao.orange.OrangeConfig;
import java.util.Map;
import tb.bns;
import tb.cns;
import tb.ils;
import tb.nms;
import tb.o78;
import tb.obk;
import tb.rms;
import tb.sls;
import tb.t2o;
import tb.ums;
import tb.wms;
import tb.xks;
import tb.xp8;
import tb.zdh;
import tb.zms;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class TScheduleInitialize {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static Context f9704a;
    public static sls b;
    public static ils c;
    public static xks d;
    public static String e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements obk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.obk
        public void onConfigUpdate(String str, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
            } else {
                TScheduleInitialize.a(OrangeConfig.getInstance().getConfigs(str));
            }
        }
    }

    static {
        t2o.a(329252872);
    }

    public static /* synthetic */ void a(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c9b172e", new Object[]{map});
        } else {
            q(map);
        }
    }

    public static Context b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[0]);
        }
        Context context = f9704a;
        if (context == null || context.getApplicationContext() == null) {
            return f9704a;
        }
        return f9704a.getApplicationContext();
    }

    public static String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("79a7d1d2", new Object[0]);
        }
        xks xksVar = d;
        if (xksVar == null) {
            return null;
        }
        return ((rms.a) xksVar).a();
    }

    public static xp8 d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xp8) ipChange.ipc$dispatch("947b329b", new Object[0]);
        }
        xks xksVar = d;
        if (xksVar == null) {
            return null;
        }
        return ((rms.a) xksVar).d();
    }

    public static synchronized ils e() {
        synchronized (TScheduleInitialize.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ils) ipChange.ipc$dispatch("23ed18ee", new Object[0]);
            }
            if (c == null) {
                c = new ils();
            }
            return c;
        }
    }

    public static String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ea7dbb5a", new Object[0]);
        }
        xks xksVar = d;
        if (xksVar == null) {
            return null;
        }
        return ((rms.a) xksVar).b();
    }

    public static synchronized sls g() {
        synchronized (TScheduleInitialize.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (sls) ipChange.ipc$dispatch("abf3cd95", new Object[0]);
            }
            if (b == null) {
                b = new sls();
            }
            return b;
        }
    }

    public static String h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c37e8ec2", new Object[0]);
        }
        xks xksVar = d;
        if (xksVar == null) {
            return null;
        }
        return ((rms.a) xksVar).c();
    }

    public static String i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("99fd2f88", new Object[0]);
        }
        xks xksVar = d;
        if (xksVar == null) {
            return null;
        }
        return ((rms.a) xksVar).e();
    }

    public static String j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3fdfad6f", new Object[0]);
        }
        xks xksVar = d;
        if (xksVar == null) {
            return null;
        }
        return ((rms.a) xksVar).f();
    }

    public static boolean k(Context context, xks xksVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("25a31503", new Object[]{context, xksVar})).booleanValue();
        }
        if (context == null || xksVar == null) {
            return false;
        }
        f9704a = context;
        d = xksVar;
        n();
        if (!zms.l(f9704a)) {
            return false;
        }
        if (zms.j()) {
            o(f9704a);
        }
        l();
        return true;
    }

    public static void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6811c3f9", new Object[0]);
            return;
        }
        e = zms.e(wms.CONFIG_KEY_CONFIG, "");
        String e2 = zms.e(wms.CONFIG_KEY_RENDER_PROTOCOL_H5, "");
        String e3 = zms.e(wms.CONFIG_KEY_RENDER_PROTOCOL_MINIAPP, "");
        String e4 = zms.e(wms.CONFIG_KEY_RENDER_PROTOCOL_PHA, "");
        String e5 = zms.e(wms.CONFIG_KEY_MULTI_PROCESS_PROTOCOL_H5, "");
        String e6 = zms.e(wms.CONFIG_KEY_MULTI_PROCESS_PROTOCOL_MINIAPP, "");
        try {
            p(zms.e(wms.CONFIG_KEY_DELAY_PRERENDER, ""));
        } catch (Exception unused) {
        }
        boolean isFeatureOpened = ABGlobal.isFeatureOpened(f9704a, wms.DEFER_INIT_PREFETCH_CONFIG);
        ums.c("TScheduleConfig init");
        if (!isFeatureOpened) {
            nms.h(e);
        }
        ums.b("TScheduleConfig init", new String[0]);
        cns.j(e2, e3, e4, e5, e6);
    }

    public static boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8a58738f", new Object[0])).booleanValue();
        }
        if (!zms.l(f9704a)) {
            return false;
        }
        if (!ABGlobal.isFeatureOpened(f9704a, wms.DEFER_INIT_PREFETCH_CONFIG)) {
            return true;
        }
        nms.h(e);
        zdh.a("TS.Initialize", "initIdle: config init in idle...");
        return true;
    }

    public static void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f58d10e5", new Object[0]);
            return;
        }
        Context context = f9704a;
        if (context != null && cns.g(context)) {
            String h = h();
            if (!TextUtils.isEmpty(h)) {
                OrangeConfig.getInstance().registerListener(new String[]{h}, new a(), true);
                q(OrangeConfig.getInstance().getConfigs(h));
            }
        }
    }

    public static void o(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d8f2b52", new Object[]{context});
        } else {
            context.registerReceiver(new BroadcastReceiver() { // from class: com.taobao.android.tschedule.TScheduleInitialize.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/tschedule/TScheduleInitialize$1");
                }

                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context2, Intent intent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context2, intent});
                        return;
                    }
                    String str = o78.i(context2).editionCode;
                    zdh.a("TS.Initialize", "position changed after user select from UI");
                    com.taobao.android.tschedule.a.b(str, str);
                }
            }, new IntentFilter("EDITON_SWITCHER_EDITTION_CODE_CHANGED"), null, bns.a().b());
        }
    }

    public static void p(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("724dd7ec", new Object[]{str});
            return;
        }
        try {
            nms.f = Boolean.parseBoolean(str);
        } catch (Exception unused) {
        }
    }

    public static void q(Map<String, String> map) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91986eb6", new Object[]{map});
        } else if (map != null) {
            String e2 = zms.e(wms.CONFIG_KEY_RENDER_VERSION, "");
            String str = map.get(wms.CONFIG_KEY_RENDER_VERSION);
            if (!TextUtils.isEmpty(e2) && !e2.equals(str)) {
                z = true;
            }
            zdh.a("TS.Initialize", "Orange config update: " + map.toString());
            zms.m(map);
            if (zms.l(b())) {
                cns.j(map.get(wms.CONFIG_KEY_RENDER_PROTOCOL_H5), map.get(wms.CONFIG_KEY_RENDER_PROTOCOL_MINIAPP), map.get(wms.CONFIG_KEY_RENDER_PROTOCOL_PHA), map.get(wms.CONFIG_KEY_MULTI_PROCESS_PROTOCOL_H5), map.get(wms.CONFIG_KEY_MULTI_PROCESS_PROTOCOL_MINIAPP));
                try {
                    p(map.get(wms.CONFIG_KEY_DELAY_PRERENDER));
                } catch (Exception unused) {
                }
                nms.h(map.get(wms.CONFIG_KEY_CONFIG));
            } else {
                nms.h(null);
            }
            if (z) {
                com.taobao.android.tschedule.a.b(e2, str);
            }
        }
    }
}
