package tb;

import android.os.SystemClock;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.sf.util.tlog.TLogTracker;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public abstract class yy1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public volatile Map<String, String> f32411a;
    public volatile long b = -1;
    public yy1 c;

    static {
        t2o.a(481297336);
    }

    public static /* synthetic */ gy8 e(yy1 yy1Var, Integer num, String str, boolean z, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gy8) ipChange.ipc$dispatch("aabdb51b", new Object[]{yy1Var, num, str, new Boolean(z), new Integer(i), obj});
        }
        if (obj == null) {
            if ((i & 4) != 0) {
                z = false;
            }
            return yy1Var.c(num, str, z);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: assembleFailureEvent");
    }

    public final void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f63b1702", new Object[]{this, str, str2});
        } else if (!TextUtils.isEmpty(str)) {
            if (this.f32411a == null) {
                this.f32411a = new LinkedHashMap();
            }
            Map<String, String> map = this.f32411a;
            ckf.d(map);
            ckf.d(str);
            map.put(str, str2);
        }
    }

    public final void b(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5d4e0d7", new Object[]{this, map});
        } else if (map != null && !map.isEmpty()) {
            if (this.f32411a == null) {
                this.f32411a = new LinkedHashMap();
            }
            Map<String, String> map2 = this.f32411a;
            ckf.d(map2);
            map2.putAll(map);
        }
    }

    public final gy8 c(Integer num, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gy8) ipChange.ipc$dispatch("568793f5", new Object[]{this, num, str, new Boolean(z)});
        }
        gy8 gy8Var = new gy8(j(), num, str);
        gy8Var.f(z);
        return gy8Var;
    }

    public final gy8 d(Integer num, String str, boolean z, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gy8) ipChange.ipc$dispatch("9dbff5d1", new Object[]{this, num, str, new Boolean(z), obj});
        }
        gy8 gy8Var = new gy8(j(), num, str);
        gy8Var.f(z);
        gy8Var.e(obj);
        return gy8Var;
    }

    public final lwq f(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lwq) ipChange.ipc$dispatch("bdf1ed7e", new Object[]{this, obj});
        }
        lwq lwqVar = new lwq(j());
        lwqVar.e(obj);
        return lwqVar;
    }

    public final yy1 g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yy1) ipChange.ipc$dispatch("e1eb9fd2", new Object[]{this});
        }
        return this.c;
    }

    public final long h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("13eb8389", new Object[]{this})).longValue();
        }
        return this.b;
    }

    public final x7m i(w7m w7mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (x7m) ipChange.ipc$dispatch("6e7e0a5a", new Object[]{this, w7mVar});
        }
        ckf.g(w7mVar, "pipLineDS");
        this.b = SystemClock.elapsedRealtime();
        return k(w7mVar);
    }

    public abstract String j();

    public abstract x7m k(w7m w7mVar);

    public final void l(yy1 yy1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3005a8b2", new Object[]{this, yy1Var});
        } else {
            this.c = yy1Var;
        }
    }

    public final void m(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5200fdfd", new Object[]{this, new Integer(i), str});
            return;
        }
        ckf.g(str, "errMsg");
        a("errCode", String.valueOf(i));
        a("errMsg", str);
        a("status", "success");
        a("processTime", String.valueOf(SystemClock.elapsedRealtime() - this.b));
        TLogTracker.k(ckf.p("IrpPipLine_", j()), this.f32411a);
    }

    public final void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4c353b7", new Object[]{this});
            return;
        }
        a("status", "success");
        a("processTime", String.valueOf(SystemClock.elapsedRealtime() - this.b));
        TLogTracker.r("IrpPipLine", j(), this.f32411a);
    }
}
