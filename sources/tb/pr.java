package tb;

import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.ability.result.ExecutingResult;
import com.alibaba.ability.result.FinishResult;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.SoftReference;
import java.util.Map;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class pr {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final pr INSTANCE = new pr();

    /* renamed from: a  reason: collision with root package name */
    public static SoftReference<y7> f26247a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class a implements u8 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ vq f26248a;

        public a(vq vqVar) {
            this.f26248a = vqVar;
        }

        @Override // tb.u8
        public final void callback(String str, c8<Object> c8Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dc026703", new Object[]{this, str, c8Var});
                return;
            }
            ExecuteResult g = pr.g(c8Var, str);
            if (g instanceof ErrorResult) {
                this.f26248a.b((ErrorResult) g);
            } else if (g instanceof FinishResult) {
                this.f26248a.c((FinishResult) g);
            }
        }
    }

    static {
        t2o.a(336593076);
    }

    @JvmStatic
    public static final u8 b(vq vqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (u8) ipChange.ipc$dispatch("bcdc9c3b", new Object[]{vqVar});
        }
        ckf.g(vqVar, "callback");
        return new a(vqVar);
    }

    @JvmStatic
    public static final y7 c() {
        y7 y7Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (y7) ipChange.ipc$dispatch("a05bd4b3", new Object[0]);
        }
        SoftReference<y7> softReference = f26247a;
        if (softReference != null && (y7Var = softReference.get()) != null) {
            return y7Var;
        }
        y7 y7Var2 = new y7(new zq("AbilityKit", "AbilityKit"), null);
        f26247a = new SoftReference<>(y7Var2);
        return y7Var2;
    }

    @JvmStatic
    public static final String d(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b084d465", new Object[]{th});
        }
        if (th != null) {
            return sm8.b(th);
        }
        return "";
    }

    @JvmStatic
    public static final k8 e(kdb kdbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (k8) ipChange.ipc$dispatch("82c8115c", new Object[]{kdbVar});
        }
        ckf.g(kdbVar, "megaCtx");
        Object userContext = kdbVar.getUserContext();
        if (!(userContext instanceof k8)) {
            userContext = null;
        }
        k8 k8Var = (k8) userContext;
        if (k8Var != null) {
            return k8Var;
        }
        n9 n9Var = new n9();
        n9Var.i(kdbVar.l().getContext());
        n9Var.m(kdbVar.k());
        q9 q9Var = new q9();
        q9Var.b(kdbVar.getUserContext());
        xhv xhvVar = xhv.INSTANCE;
        n9Var.j(q9Var);
        return n9Var;
    }

    @JvmStatic
    public static final ExecuteResult f(c8<?> c8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("41f86581", new Object[]{c8Var});
        }
        return h(c8Var, null, 2, null);
    }

    @JvmStatic
    public static final ExecuteResult g(c8<?> c8Var, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("6db26a77", new Object[]{c8Var, str});
        }
        if (c8Var instanceof b8) {
            ckf.f(c8Var, "akRet");
            b8 b8Var = (b8) c8Var;
            a8 a2 = b8Var.a();
            ckf.f(a2, "akRet.result");
            String valueOf = String.valueOf(a2.a());
            a8 a3 = b8Var.a();
            ckf.f(a3, "akRet.result");
            String b = a3.b();
            ckf.f(b, "akRet.result.errorMsg");
            return new ErrorResult(valueOf, b, (Map) null, 4, (a07) null);
        } else if (c8Var instanceof d8) {
            ckf.f(c8Var, "akRet");
            return new ExecutingResult(((d8) c8Var).a(), null, 2, null);
        } else if (!(c8Var instanceof f8)) {
            return new ExecutingResult(null, null, 3, null);
        } else {
            if (str == null) {
                ckf.f(c8Var, "akRet");
                return new FinishResult(((f8) c8Var).a(), null, 2, null);
            }
            ckf.f(c8Var, "akRet");
            return new FinishResult(((f8) c8Var).a(), str);
        }
    }

    public static /* synthetic */ ExecuteResult h(c8 c8Var, String str, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("c5119de5", new Object[]{c8Var, str, new Integer(i), obj});
        }
        if ((i & 2) != 0) {
            str = null;
        }
        return g(c8Var, str);
    }

    @JvmStatic
    public static final c8<?> a(String str, JSONObject jSONObject, k8 k8Var, u8 u8Var, boolean z) {
        y7 y7Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c8) ipChange.ipc$dispatch("b1b5eb31", new Object[]{str, jSONObject, k8Var, u8Var, new Boolean(z)});
        }
        ckf.g(str, "type");
        ckf.g(jSONObject, "params");
        if (k8Var == null || (y7Var = k8Var.a()) == null) {
            y7Var = c();
        }
        return y7Var.a(new JSONObject(kotlin.collections.a.k(jpu.a("type", str), jpu.a("params", jSONObject), jpu.a("isMainThread", Boolean.valueOf(z)))), k8Var, u8Var);
    }
}
