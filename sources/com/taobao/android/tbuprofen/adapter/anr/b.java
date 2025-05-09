package com.taobao.android.tbuprofen.adapter.anr;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tbuprofen.adapter.TBProfConfig;
import com.taobao.android.tbuprofen.adapter.a;
import java.util.Map;
import tb.e6r;
import tb.h0i;
import tb.p5s;
import tb.t2o;
import tb.urr;
import tb.y74;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(824180781);
    }

    public static synchronized void b(Context context, a aVar) {
        synchronized (b.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("34cae868", new Object[]{context, aVar});
            }
        }
    }

    public static boolean c(Context context, TBAnrConfig tBAnrConfig) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ff94db4e", new Object[]{context, tBAnrConfig})).booleanValue();
        }
        if (tBAnrConfig.isDebug) {
            return true;
        }
        tBAnrConfig.runningInfoCollectConfig.getClass();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 29 || i2 > 34) {
            return false;
        }
        int b = y74.b(context);
        if (b != 1 && (b == 2 || b == 3 || b == 4)) {
            i = 10000;
        }
        return y74.d(i);
    }

    public static boolean d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("34261c81", new Object[]{str})).booleanValue();
        }
        return TextUtils.equals(str, "com.taobao.taobao");
    }

    public static boolean e(Context context, TBAnrConfig tBAnrConfig) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b7eba07e", new Object[]{context, tBAnrConfig})).booleanValue();
        }
        if (tBAnrConfig.isDebug) {
            return true;
        }
        if (!tBAnrConfig.isEnable) {
            urr.b("TBAnrProfiler", "Anr monitor is disabled.", new Object[0]);
            return false;
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < tBAnrConfig.minSDK || i2 > tBAnrConfig.maxSDK || "VanillaIceCream".equals(Build.VERSION.CODENAME)) {
            urr.b("TBAnrProfiler", "Unsupported sdk ver: %d", Integer.valueOf(i2));
            return false;
        }
        int b = y74.b(context);
        if (b == 1) {
            i = tBAnrConfig.releaseSample;
        } else if (b == 2 || b == 3 || b == 4) {
            i = tBAnrConfig.graySample;
        } else {
            i = 0;
        }
        if (y74.d(i)) {
            return true;
        }
        urr.b("TBAnrProfiler", "Can't start anr monitor. sample: %d, PackageType:%d", Integer.valueOf(i), Integer.valueOf(b));
        return false;
    }

    public static synchronized void a(Context context, Map<String, Object> map) {
        synchronized (b.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f5f8eed7", new Object[]{context, map});
                return;
            }
            Log.e("TBAnrProfiler", "ANR Early Init " + map.get("processName"));
            urr.e(new p5s(TBProfConfig.f(0)));
            TBAnrConfig l = TBProfConfig.l(context);
            e6r.b(l);
            boolean e = e(context, l);
            boolean d = y74.d(l.spOptSample);
            boolean c = c(context, l);
            if (d) {
                AsyncSharedPreferences.e();
            }
            String c2 = y74.c(context, "1.0.0");
            a aVar = new a();
            aVar.f = l;
            aVar.f9613a = c2;
            if (map.containsKey("processName")) {
                aVar.b = (String) map.get("processName");
            }
            if (map.containsKey("startTime")) {
                h0i.s = ((Long) map.get("startTime")).longValue();
            }
            if (!l.earlyInit && !l.isDebug) {
                urr.b("TBAnrProfiler", "Do not support early init!", new Object[0]);
            } else if (d(aVar.b) || l.initChildProcess || l.isDebug) {
                if (c) {
                    new a(context, aVar).p();
                    e6r.h(2);
                }
                if (e) {
                    new h0i(context, l).t();
                    e6r.h(3);
                }
                e6r.h(1);
                urr.d("TBAnrProfiler", "ANR Early Init done.", new Object[0]);
            } else {
                urr.b("TBAnrProfiler", "Not init child process!", new Object[0]);
            }
        }
    }
}
