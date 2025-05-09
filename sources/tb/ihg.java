package tb;

import android.os.SystemClock;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.core.l;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ihg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public long f21311a;
    public long b;
    public long c;
    public long d;
    public long e;
    public long f;
    public long g;
    public long h;
    public long i;
    public long j;
    public long k;
    public boolean l;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b {
        public static final ihg INSTANCE = new ihg();

        static {
            t2o.a(511705623);
        }
    }

    static {
        t2o.a(511705621);
    }

    public static ihg d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ihg) ipChange.ipc$dispatch("dfc3c462", new Object[0]);
        }
        return b.INSTANCE;
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
            return;
        }
        this.c = 0L;
        this.g = 0L;
        this.h = 0L;
        this.i = 0L;
        this.j = 0L;
        this.d = 0L;
        this.e = 0L;
    }

    public long b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("692f961e", new Object[]{this})).longValue();
        }
        return this.d;
    }

    public long c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1f82fa59", new Object[]{this})).longValue();
        }
        return this.e;
    }

    public long e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4a07dd2c", new Object[]{this})).longValue();
        }
        return this.k;
    }

    public long f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("63483977", new Object[]{this})).longValue();
        }
        return this.j;
    }

    public long g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bca3ad8a", new Object[]{this})).longValue();
        }
        return this.f;
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("144be5cb", new Object[]{this});
        } else {
            odg.c(l.TAG, i());
        }
    }

    public final String i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1cb024cc", new Object[]{this});
        }
        return "PerformanceTracker{sMiddlePageOnCreate=" + this.f21311a + ", sRecordPageOnCreate=" + this.b + ", sViewLoadCost=" + this.c + ", sAlbumLoadedCost=" + this.d + ", sTPInitCost=" + this.g + ", sTPReadyCost=" + this.h + ", sTPOpenCost=" + this.i + ", sTPFirstFrameCost=" + this.j + ", sRaceFirstFrameCost=" + this.k + ", sInspirationFirstFrameCost=" + this.e + '}';
    }

    public JSONObject j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("705c882a", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("taopai_first_frame", (Object) Long.valueOf(this.j));
        jSONObject.put("taopai_ready", (Object) Long.valueOf(this.h));
        jSONObject.put("taopai_setup", (Object) Long.valueOf(this.g));
        jSONObject.put("taopai_open", (Object) Long.valueOf(this.i));
        jSONObject.put("view_loaded", (Object) Long.valueOf(this.c));
        jSONObject.put("middle_page_cost", (Object) Long.valueOf(this.b - this.f21311a));
        return jSONObject;
    }

    public Map<String, String> k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("2dd9d11d", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("taopai_first_frame", String.valueOf(this.j));
        hashMap.put("taopai_ready", String.valueOf(this.h));
        hashMap.put("taopai_setup", String.valueOf(this.g));
        hashMap.put("taopai_open", String.valueOf(this.i));
        hashMap.put("view_loaded", String.valueOf(this.c));
        hashMap.put("middle_page_cost", String.valueOf(this.b - this.f21311a));
        return hashMap;
    }

    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1063f9d6", new Object[]{this});
        } else {
            this.d = SystemClock.uptimeMillis() - this.f21311a;
        }
    }

    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81f064ff", new Object[]{this});
            return;
        }
        this.f21311a = SystemClock.uptimeMillis();
        this.l = true;
    }

    public void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1000a051", new Object[]{this});
        } else {
            this.e = SystemClock.uptimeMillis() - this.f21311a;
        }
    }

    public void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("693b1dfa", new Object[]{this});
        } else {
            this.k = SystemClock.uptimeMillis() - this.f21311a;
        }
    }

    public void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4292bc88", new Object[]{this});
            return;
        }
        a();
        long uptimeMillis = SystemClock.uptimeMillis();
        this.b = uptimeMillis;
        if (!this.l || uptimeMillis - this.f21311a > 1000) {
            this.f21311a = uptimeMillis;
        }
        this.l = false;
    }

    public void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e82c9785", new Object[]{this});
        } else {
            this.j = SystemClock.uptimeMillis() - this.f21311a;
        }
    }

    public void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f506f338", new Object[]{this});
        } else {
            this.g = SystemClock.uptimeMillis() - this.f21311a;
        }
    }

    public void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6f28772", new Object[]{this});
        } else {
            this.i = SystemClock.uptimeMillis() - this.f21311a;
        }
    }

    public void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cf8f729", new Object[]{this});
        } else {
            this.h = SystemClock.uptimeMillis() - this.f21311a;
        }
    }

    public void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96de1dd8", new Object[]{this});
        } else {
            this.f = SystemClock.uptimeMillis() - this.f21311a;
        }
    }

    public void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74d19736", new Object[]{this});
        } else {
            this.c = SystemClock.uptimeMillis() - this.f21311a;
        }
    }

    public ihg() {
        this.f21311a = 0L;
        this.b = 0L;
        this.c = 0L;
        this.d = 0L;
        this.e = 0L;
        this.f = 0L;
        this.g = 0L;
        this.h = 0L;
        this.i = 0L;
        this.j = 0L;
        this.k = 0L;
        this.l = false;
    }
}
