package tb;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Pair;
import kotlin.collections.a;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class z71 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final z71 INSTANCE = new z71();
    public static final String TYPE_COUNTER = "appMonitorCounter";
    public static final String TYPE_FAIL = "appMonitorFail";
    public static final String TYPE_SUCCESS = "appMonitorSuccess";

    /* renamed from: a  reason: collision with root package name */
    public static boolean f32581a;
    public static boolean b;

    static {
        t2o.a(336593080);
    }

    @JvmStatic
    public static final void a(k8 k8Var, n8 n8Var, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56b7d94d", new Object[]{k8Var, n8Var, new Long(j)});
            return;
        }
        ckf.g(k8Var, "akCtx");
        z71 z71Var = INSTANCE;
        if (z71Var.f() && abl.k()) {
            AppMonitor.Counter.commit("AbilityKit", "ExecuteCount", z71Var.b(k8Var, n8Var).toJSONString(), 1.0d);
        }
    }

    @JvmStatic
    public static final void c(k8 k8Var, n8 n8Var, a8 a8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3382fd0b", new Object[]{k8Var, n8Var, a8Var});
            return;
        }
        ckf.g(k8Var, "akCtx");
        z71 z71Var = INSTANCE;
        if (z71Var.f()) {
            JSONObject b2 = z71Var.b(k8Var, n8Var);
            String str = null;
            b2.put("params", (Object) (n8Var != null ? n8Var.h() : null));
            String jSONString = b2.toJSONString();
            String valueOf = String.valueOf(a8Var != null ? Integer.valueOf(a8Var.a()) : null);
            if (a8Var != null) {
                str = a8Var.b();
            }
            AppMonitor.Alarm.commitFail("AbilityKit", "ExecuteException", jSONString, valueOf, str);
            g8.d().loge("AbilityKitErr", jSONString);
        }
    }

    @JvmStatic
    public static final void d(k8 k8Var, n8 n8Var, b8 b8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f45856e", new Object[]{k8Var, n8Var, b8Var});
            return;
        }
        ckf.g(k8Var, "akCtx");
        ckf.g(b8Var, "akErrorRet");
        c(k8Var, n8Var, b8Var.a());
    }

    public final JSONObject b(k8 k8Var, n8 n8Var) {
        String str;
        zq g;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b3950def", new Object[]{this, k8Var, n8Var});
        }
        Pair a2 = jpu.a("bizId", g8.e().a(k8Var.a()));
        y7 a3 = k8Var.a();
        String str2 = null;
        if (a3 == null || (g = a3.g()) == null) {
            str = null;
        } else {
            str = g.getNamespace();
        }
        Pair a4 = jpu.a("namespace", str);
        if (n8Var != null) {
            str2 = n8Var.b();
        }
        return new JSONObject(a.k(a2, a4, jpu.a("abilityType", str2)));
    }

    public final boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a369dca2", new Object[]{this})).booleanValue();
        }
        if (b) {
            return f32581a;
        }
        f32581a = true;
        b = true;
        return true;
    }

    @JvmStatic
    public static final void e(n8 n8Var, a8 a8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27667c4b", new Object[]{n8Var, a8Var});
        } else if (INSTANCE.f()) {
            JSONObject jSONObject = new JSONObject(2);
            String str = null;
            jSONObject.put("params", (Object) (n8Var != null ? n8Var.h() : null));
            jSONObject.put("api", (Object) (n8Var != null ? n8Var.b() : null));
            String jSONString = jSONObject.toJSONString();
            String valueOf = String.valueOf(a8Var != null ? Integer.valueOf(a8Var.a()) : null);
            if (a8Var != null) {
                str = a8Var.b();
            }
            AppMonitor.Alarm.commitFail("StdPop", "apiCallFail", jSONString, valueOf, str);
            g8.d().loge("AbilityKitErr", jSONString);
        }
    }
}
