package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class jh7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static boolean g = false;

    /* renamed from: a  reason: collision with root package name */
    public long f21993a;
    public long b;
    public long c;
    public long d;
    public boolean e = true;
    public boolean f = false;

    static {
        t2o.a(481297451);
    }

    public static void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[0]);
        } else if (!g) {
            g = true;
            ArrayList arrayList = new ArrayList();
            arrayList.add("startDetect");
            arrayList.add("detect");
            arrayList.add(ybu.INTERCEPT_CONFIG_POINT_TRACKER_TYPE_JUMP);
            arrayList.add(iiz.PERF_STAG_TOTAL);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add("model_config");
            arrayList2.add("query_correct");
            arrayList2.add("intelli_optimize");
            arrayList2.add("retry");
            jzu.m(tmf.MODULE_CHAIN, "camera_model_cost", arrayList, arrayList2);
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9423f0e5", new Object[]{this});
        } else if (!this.f) {
            this.f = true;
            this.c = System.currentTimeMillis();
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ccc95f5f", new Object[]{this});
        } else {
            this.f21993a = System.currentTimeMillis();
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0b5b1b5", new Object[]{this});
            return;
        }
        this.d = System.currentTimeMillis();
        a();
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd39afac", new Object[]{this});
        } else if (!this.f) {
            this.b = System.currentTimeMillis();
        }
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c9f3a3e", new Object[]{this});
        } else if (this.e) {
            this.e = false;
            d();
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            hashMap.put("startDetect", Double.valueOf(this.b - this.f21993a));
            hashMap.put("detect", Double.valueOf(this.c - this.b));
            hashMap.put(ybu.INTERCEPT_CONFIG_POINT_TRACKER_TYPE_JUMP, Double.valueOf(this.d - this.c));
            hashMap.put(iiz.PERF_STAG_TOTAL, Double.valueOf(this.d - this.f21993a));
            hashMap2.put("model_config", lg4.N1(false));
            hashMap2.put("query_correct", String.valueOf(false));
            hashMap2.put("intelli_optimize", "true");
            hashMap2.put("retry", String.valueOf(lg4.b4()));
            jzu.d(tmf.MODULE_CHAIN, "camera_model_cost", hashMap, hashMap2);
        }
    }
}
