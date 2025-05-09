package tb;

import android.os.Bundle;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class pin {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final JSONObject f26115a = new JSONObject();
    public long b;
    public long c;
    public long d;
    public long e;
    public long f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    public static /* synthetic */ void b(pin pinVar, String str, String str2, JSONObject jSONObject, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cdf80d9a", new Object[]{pinVar, str, str2, jSONObject, new Integer(i), obj});
            return;
        }
        if ((i & 4) != 0) {
            jSONObject = null;
        }
        pinVar.a(str, str2, jSONObject);
    }

    public final void a(String str, String str2, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19b9d259", new Object[]{this, str, str2, jSONObject});
            return;
        }
        HashMap hashMap = new HashMap();
        for (String str3 : this.f26115a.keySet()) {
            ckf.f(str3, "key");
            String string = this.f26115a.getString(str3);
            ckf.f(string, "commonArgs.getString(key)");
            hashMap.put(str3, string);
        }
        if (jSONObject != null) {
            for (String str4 : jSONObject.keySet()) {
                ckf.f(str4, "key");
                String string2 = jSONObject.getString(str4);
                ckf.f(string2, "custom.getString(key)");
                hashMap.put(str4, string2);
            }
        }
        UTOriginalCustomHitBuilder uTOriginalCustomHitBuilder = new UTOriginalCustomHitBuilder("rate_performance", 2201, "rate_cost", str, str2, hashMap);
        UTAnalytics instance = UTAnalytics.getInstance();
        ckf.f(instance, "UTAnalytics.getInstance()");
        instance.getDefaultTracker().send(uTOriginalCustomHitBuilder.build());
    }

    public final long c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("87205898", new Object[]{this})).longValue();
        }
        return this.b;
    }

    public final void d(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84f555dd", new Object[]{this, bundle});
            return;
        }
        long k = krq.k(bundle != null ? bundle.getString("tagId") : null, 0L);
        if (k <= 0) {
            k = System.currentTimeMillis();
        }
        this.b = k;
    }

    public final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efcffc59", new Object[]{this});
        } else if (this.f <= 0) {
            this.f = System.currentTimeMillis() - c();
            odg.d("RateViewPerformanceTracker", "firstFrameTimeMs: " + this.f);
            if (this.f <= n9l.INSTANCE.F()) {
                b(this, "first_frame_rate_preview_v2", String.valueOf(this.f), null, 4, null);
            }
        }
    }

    public final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdf26762", new Object[]{this});
        } else if (this.c <= 0) {
            this.c = System.currentTimeMillis() - c();
            odg.d("RateViewPerformanceTracker", "fragmentCreateTimeMs: " + this.c);
            b(this, "process_rate_preview_v2_FragmentCreate", String.valueOf(this.c), null, 4, null);
        }
    }

    public final void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cdccd93", new Object[]{this});
        } else if (this.d <= 0) {
            this.d = System.currentTimeMillis() - c();
            odg.d("RateViewPerformanceTracker", "fragmentResumeTimeMs: " + this.d);
            b(this, "process_rate_preview_v2_FragmentResume", String.valueOf(this.d), null, 4, null);
        }
    }

    public final void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47ef4c96", new Object[]{this});
        } else if (this.e <= 0) {
            this.e = System.currentTimeMillis() - c();
            odg.d("RateViewPerformanceTracker", "viewItemGetTimeMs: " + this.e);
            b(this, "process_rate_preview_v2_ViewGet", String.valueOf(this.e), null, 4, null);
        }
    }
}
