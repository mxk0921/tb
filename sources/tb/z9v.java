package tb;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.performence.model.UltronPerformanceStageModel;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class z9v extends lz {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "UltronPerformance";
    public static final ConcurrentHashMap<WeakReference<Context>, z9v> e = new ConcurrentHashMap<>();
    public String b;
    public String c;

    /* renamed from: a  reason: collision with root package name */
    public final mz f32637a = new ncv();
    public int d = 0;

    static {
        t2o.a(83886264);
    }

    public static /* synthetic */ Object ipc$super(z9v z9vVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/ultron/performence/UltronPerformance");
    }

    public static z9v u(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (z9v) ipChange.ipc$dispatch("cd32a68b", new Object[]{context});
        }
        z9v v = v(context);
        if (v != null) {
            return v;
        }
        z9v z9vVar = new z9v();
        e.put(new WeakReference<>(context), z9vVar);
        return z9vVar;
    }

    public static z9v v(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (z9v) ipChange.ipc$dispatch("45af5ce3", new Object[]{context});
        }
        try {
            for (WeakReference<Context> weakReference : e.keySet()) {
                if (weakReference != null && context == weakReference.get()) {
                    return e.get(weakReference);
                }
            }
            return null;
        } catch (Exception e2) {
            hav.a("UltronPerformance#exception", e2.getMessage());
            return null;
        }
    }

    public final boolean A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c675c8f1", new Object[]{this})).booleanValue();
        }
        if (!w() || !z() || this.d > 0) {
            return true;
        }
        return false;
    }

    public void B(String str, boolean z, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e8c7dff", new Object[]{this, str, new Boolean(z), map});
        } else {
            l(str, System.currentTimeMillis(), z, map);
        }
    }

    public void C(String str, long j, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f12f7dd9", new Object[]{this, str, new Long(j), str2});
        } else {
            m(str, j, str2, false);
        }
    }

    public void D(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96dd2e1f", new Object[]{this, str, str2});
        } else {
            C(str, System.currentTimeMillis(), str2);
        }
    }

    @Override // tb.lz
    @Deprecated
    public void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90f8c4aa", new Object[]{this, str, str2, str3});
            return;
        }
        try {
            this.f32637a.a(str, str2, str3);
        } catch (Exception e2) {
            hav.a(TAG, "addDimension exception:" + e2.getMessage());
        }
    }

    @Override // tb.lz
    public void b(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5f17bfe", new Object[]{this, str, str2, str3});
            return;
        }
        try {
            this.f32637a.b(str, str2, str3);
        } catch (Exception e2) {
            hav.a(TAG, "addDimension exception:" + e2.getMessage());
        }
    }

    @Override // tb.lz
    public boolean c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a7f34d55", new Object[]{this, str})).booleanValue();
        }
        if (!w()) {
            return false;
        }
        return this.f32637a.c(str);
    }

    @Override // tb.lz
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb4ee56c", new Object[]{this});
            return;
        }
        try {
            this.f32637a.d();
        } catch (Exception e2) {
            hav.a(TAG, "resetAllFlowData exception:" + e2.getMessage());
        }
    }

    @Override // tb.lz
    public void e(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d53b83", new Object[]{this, str, str2});
        } else if (!A()) {
            try {
                this.f32637a.e(str, str2);
            } catch (Exception e2) {
                hav.a(TAG, "commonArgs exception:" + e2.getMessage());
            }
        }
    }

    @Override // tb.lz
    public void f(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a283cdb6", new Object[]{this, map});
        } else if (!A()) {
            try {
                this.f32637a.f(map);
            } catch (Exception e2) {
                hav.a(TAG, "commonArgs exception:" + e2.getMessage());
            }
        }
    }

    @Override // tb.lz
    @Deprecated
    public void g(cav cavVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4dd0631d", new Object[]{this, cavVar});
        } else if (!A()) {
            try {
                this.f32637a.g(cavVar);
            } catch (Exception e2) {
                hav.a(TAG, "jsTracker exception:" + e2.getMessage());
            }
        }
    }

    @Override // tb.lz
    public void h(UltronPerformanceStageModel ultronPerformanceStageModel, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92315d3", new Object[]{this, ultronPerformanceStageModel, str, new Boolean(z)});
        } else if (!A()) {
            try {
                this.f32637a.h(ultronPerformanceStageModel, str, z);
            } catch (Exception e2) {
                hav.a(TAG, "customStage model exception:" + e2.getMessage());
            }
        }
    }

    @Override // tb.lz
    public void i(String str, boolean z, boolean z2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c28e8ea1", new Object[]{this, str, new Boolean(z), new Boolean(z2), map});
        } else if (!A()) {
            try {
                this.f32637a.i(str, z, z2, map);
            } catch (Exception e2) {
                hav.a(TAG, "finish exception:" + e2.getMessage());
            }
        }
    }

    @Override // tb.lz
    public boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("72c980a9", new Object[]{this})).booleanValue();
        }
        try {
            return this.f32637a.j();
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // tb.lz
    public void k(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8fc75e6", new Object[]{this, context});
        } else if (context != null) {
            try {
                this.f32637a.k(context);
                r(context);
            } catch (Exception e2) {
                hav.a(TAG, "onDestroy exception:" + e2.getMessage());
            }
        }
    }

    @Override // tb.lz
    public void l(String str, long j, boolean z, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7d636e7", new Object[]{this, str, new Long(j), new Boolean(z), map});
        } else if (!A()) {
            try {
                this.f32637a.l(str, j, z, map);
            } catch (Exception e2) {
                hav.a(TAG, "stageEnd exception:" + e2.getMessage());
            }
        }
    }

    @Override // tb.lz
    public void m(String str, long j, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34c0f01b", new Object[]{this, str, new Long(j), str2, new Boolean(z)});
        } else if (!A()) {
            try {
                this.f32637a.m(str, j, str2, z);
            } catch (Exception e2) {
                hav.a(TAG, "stageStart exception:" + e2.getMessage());
            }
        }
    }

    @Override // tb.lz
    public void n(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a37a973", new Object[]{this, str});
        } else if (A()) {
            s();
        } else {
            s();
            try {
                this.f32637a.n(str);
            } catch (Exception e2) {
                hav.a(TAG, "start exception:" + e2.getMessage());
            }
        }
    }

    @Override // tb.lz
    public void o(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecbdfbb1", new Object[]{this, str, new Long(j)});
        } else if (A()) {
            s();
        } else {
            s();
            try {
                this.f32637a.o(str, j);
            } catch (Exception e2) {
                hav.a(TAG, "start exception:" + e2.getMessage());
            }
        }
    }

    @Deprecated
    public void p(int i, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("264dfe4b", new Object[]{this, new Integer(i), str, str2});
            return;
        }
        a("d" + (i + 1), str, str2);
    }

    public void q(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db5d58f2", new Object[]{this, str, obj});
        } else {
            a(str, "", String.valueOf(obj));
        }
    }

    public final void r(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be8e045e", new Object[]{this, context});
            return;
        }
        for (WeakReference<Context> weakReference : e.keySet()) {
            if (weakReference != null) {
                Context context2 = weakReference.get();
                if (context2 == null || context == context2) {
                    e.remove(weakReference);
                } else if ((context2 instanceof Activity) && ((Activity) context2).isFinishing()) {
                    e.remove(weakReference);
                }
            }
        }
    }

    public final void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1af0b967", new Object[]{this});
            return;
        }
        int i = this.d - 1;
        this.d = i;
        if (i < 0) {
            this.d = 0;
        }
    }

    public void t(String str, boolean z, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6cf2515", new Object[]{this, str, new Boolean(z), map});
        } else {
            i(str, z, false, map);
        }
    }

    public final boolean w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bb429e55", new Object[]{this})).booleanValue();
        }
        if (TextUtils.isEmpty(this.b) || TextUtils.isEmpty(this.c)) {
            return false;
        }
        return true;
    }

    @Deprecated
    public void x(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72712a5", new Object[]{this, context, str, str2});
        } else if (!w()) {
            y(context, new bav(str, str2));
        }
    }

    public void y(Context context, bav bavVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e340f3fd", new Object[]{this, context, bavVar});
        } else if (!w()) {
            try {
                u(context).f32637a.p(context, bavVar);
                this.b = bavVar.a();
                this.c = bavVar.b();
            } catch (Exception e2) {
                hav.a(TAG, "init exception:" + e2.getMessage());
            }
        }
    }

    public final boolean z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("da76fe42", new Object[]{this})).booleanValue();
        }
        String str = this.b;
        if (str == null) {
            return false;
        }
        if (c9x.CART_BIZ_NAME.equals(str) || vav.a(this.b, "enableUltronPerformance", false)) {
            return true;
        }
        return false;
    }
}
