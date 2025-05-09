package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.widget.DXRecyclerLayout;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class qv5 extends ad5 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final y7 c;
    public final WeakHashMap<iv5, Integer> d;
    public final List<WeakReference<iv5>> e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements rpm<iv5> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ DXWidgetNode f26948a;

        public a(qv5 qv5Var, DXWidgetNode dXWidgetNode) {
            this.f26948a = dXWidgetNode;
        }

        /* renamed from: b */
        public boolean a(iv5 iv5Var) {
            DXRuntimeContext l;
            boolean z = true;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d583a3c4", new Object[]{this, iv5Var})).booleanValue();
            }
            if (iv5Var == null || (l = iv5Var.l()) == null) {
                return false;
            }
            DXWidgetNode W = l.W();
            if (!(W instanceof DXRecyclerLayout)) {
                return false;
            }
            if (W != this.f26948a) {
                z = false;
            }
            if (z && DinamicXEngine.j0()) {
                h36.g("EventChainCancel", "cancel eventChain $(" + iv5Var.o() + ") by " + this.f26948a.getClass().getSimpleName());
            }
            return z;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements hv5 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ iv5 f26949a;
        public final /* synthetic */ int b;
        public final /* synthetic */ String c;

        public b(iv5 iv5Var, int i, String str) {
            this.f26949a = iv5Var;
            this.b = i;
            this.c = str;
        }

        public void a(n2k n2kVar, rv5 rv5Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ea3915d9", new Object[]{this, n2kVar, rv5Var});
            } else if (rv5Var.h() == 2) {
                la6.b("event chain interrupt");
            } else if (this.f26949a.l() == null) {
                la6.b("callback dxRuntimeContext recycled");
            } else {
                ov5 p = this.f26949a.p();
                if (p != null) {
                    p.l(rv5Var.g());
                    if (this.f26949a.p() != null) {
                        p.j(this.f26949a.p().c());
                        p.k(this.f26949a.p().d());
                    }
                }
                if (DinamicXEngine.j0()) {
                    iv5 iv5Var = this.f26949a;
                    int i = this.b;
                    iv5Var.I(new xj8(i, "callback_" + n2kVar.a(), rv5Var));
                }
                if (n2kVar != null) {
                    qv5.this.l(n2kVar.b(), this.c, this.f26949a);
                }
            }
        }
    }

    static {
        t2o.a(444596681);
    }

    public qv5(av5 av5Var) {
        super(av5Var);
        y7 c = av5Var.c().c();
        if (c == null) {
            zq zqVar = new zq(c(), "dx");
            y7 y7Var = new y7();
            this.c = y7Var;
            y7Var.m(zqVar);
        } else {
            this.c = c;
            c.m(new zq(c(), "dx"));
        }
        this.d = new WeakHashMap<>();
        this.e = new ArrayList();
    }

    public static /* synthetic */ Object ipc$super(qv5 qv5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/eventchain/DXEventChainManager");
    }

    public static void j(int i, rv5 rv5Var, iv5 iv5Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8aabfa76", new Object[]{new Integer(i), rv5Var, iv5Var});
        } else {
            k(o(i, null, iv5Var), null, rv5Var, iv5Var);
        }
    }

    public static void k(wj8 wj8Var, wc5 wc5Var, rv5 rv5Var, iv5 iv5Var) {
        vj8 vj8Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98490a18", new Object[]{wj8Var, wc5Var, rv5Var, iv5Var});
            return;
        }
        if (wj8Var != null) {
            wj8Var.i(rv5Var);
            if (wc5Var != null) {
                wj8Var.h(wc5Var.q());
                wj8Var.g(wc5Var.p());
                wj8Var.a(wc5Var.n());
            }
        }
        if (iv5Var != null) {
            vj8Var = iv5Var.m();
        } else {
            vj8Var = null;
        }
        hjo.c().d(vj8Var, wj8Var);
    }

    public static wj8 o(int i, wc5 wc5Var, iv5 iv5Var) {
        wj8 wj8Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wj8) ipChange.ipc$dispatch("f192c235", new Object[]{new Integer(i), wc5Var, iv5Var});
        }
        if (wc5Var == null) {
            wj8Var = new wj8(i, "unknown", -1L, null);
        } else {
            wj8Var = new wj8(i, wc5Var.o(), wc5Var.r().longValue(), null);
        }
        if (iv5Var != null) {
            wj8Var.f(iv5Var.r());
            k8 e = iv5Var.e();
            if (e != null) {
                wj8Var.b(e.b());
                y7 a2 = e.a();
                if (a2 != null) {
                    wj8Var.c(a2.e());
                }
            }
            ov5 p = iv5Var.p();
            if (p != null) {
                wj8Var.e(p.e());
                wj8Var.d(p.c());
            }
            DXRuntimeContext l = iv5Var.l();
            if (l != null) {
                wj8Var.j(l.i());
                wj8Var.k(l.O());
            }
        }
        return wj8Var;
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c612a68", new Object[]{this});
        } else {
            i(null);
        }
    }

    public void h(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57e5c52a", new Object[]{this, dXWidgetNode});
        } else if (dXWidgetNode != null) {
            i(new a(this, dXWidgetNode));
        }
    }

    public void i(rpm<iv5> rpmVar) {
        iv5 iv5Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68830a17", new Object[]{this, rpmVar});
            return;
        }
        try {
            if (zg5.t5()) {
                List<WeakReference<iv5>> list = this.e;
                if (list != null) {
                    ((ArrayList) list).size();
                    Iterator it = ((ArrayList) this.e).iterator();
                    if (it != null) {
                        while (it.hasNext()) {
                            WeakReference weakReference = (WeakReference) it.next();
                            if (!(weakReference == null || (iv5Var = (iv5) weakReference.get()) == null || !(rpmVar == null || ((a) rpmVar).a(iv5Var)))) {
                                iv5Var.b();
                            }
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            WeakHashMap<iv5, Integer> weakHashMap = this.d;
            if (weakHashMap != null) {
                weakHashMap.size();
                for (Map.Entry<iv5, Integer> entry : this.d.entrySet()) {
                    if (!(entry == null || entry.getKey() == null || !(rpmVar == null || ((a) rpmVar).a(entry.getKey())))) {
                        entry.getKey().b();
                    }
                }
            }
        } catch (Throwable th) {
            la6.d("DXEventChainException", "", "cancel event chain error : " + th.getMessage());
        }
    }

    public final rv5 n(String str, iv5 iv5Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rv5) ipChange.ipc$dispatch("22e5d7c1", new Object[]{this, str, iv5Var});
        }
        if (TextUtils.isEmpty(str) || iv5Var == null) {
            return rv5.b(kv5.EVENT_CHAIN_ERROR_EXECUTE_EVENTCHIAN_CONTEXT_IS_NULL);
        }
        iv5Var.E(str);
        return m(str, "main", iv5Var);
    }

    public y7 p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (y7) ipChange.ipc$dispatch("d543e49c", new Object[]{this});
        }
        return this.c;
    }

    public void q(iv5 iv5Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("971dab5c", new Object[]{this, iv5Var});
        } else if (zg5.t5()) {
            ((ArrayList) this.e).add(new WeakReference(iv5Var));
            ln6.a(this.e);
        } else {
            this.d.put(iv5Var, Integer.valueOf(iv5Var.hashCode()));
        }
    }

    public void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
        } else {
            this.c.k();
        }
    }

    public final rv5 m(String str, String str2, iv5 iv5Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rv5) ipChange.ipc$dispatch("86d74729", new Object[]{this, str, str2, iv5Var});
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || iv5Var == null) {
            if (DinamicXEngine.j0()) {
                j(iv5Var != null ? iv5Var.s() + 1 : -1, rv5.b(kv5.EVENT_CHAIN_ERROR_EXECUTE_ATOMIC_EVENT_CONTEXT_IS_NULL), iv5Var);
            }
            return rv5.b(kv5.EVENT_CHAIN_ERROR_EXECUTE_ATOMIC_EVENT_CONTEXT_IS_NULL);
        }
        int f = iv5Var.f();
        wc5 i = iv5Var.i(str, str2);
        if (i == null) {
            if (DinamicXEngine.j0()) {
                j(f, rv5.b(kv5.EVENT_CHAIN_ERROR_EXECUTE_ATOMIC_EVENT_NODE_IS_NULL), iv5Var);
            }
            return rv5.b(kv5.EVENT_CHAIN_ERROR_EXECUTE_ATOMIC_EVENT_NODE_IS_NULL);
        }
        wj8 o = DinamicXEngine.j0() ? o(f, i, iv5Var) : null;
        rv5 i2 = i.i(iv5Var, new b(iv5Var, f, str));
        if (DinamicXEngine.j0()) {
            k(o, i, i2, iv5Var);
        }
        if (i2 == null || i2.h() == 2) {
            la6.b("event chain interrupt");
            return i2;
        }
        DXRuntimeContext l = iv5Var.l();
        if (l == null) {
            la6.b("callback dxRuntimeContext recycled");
            return i2;
        }
        ov5 u = l.u();
        if (u != null) {
            u.l(i2.g());
            if (iv5Var.p() != null) {
                u.j(iv5Var.p().c());
                u.k(iv5Var.p().d());
            }
        }
        if (DinamicXEngine.j0()) {
            iv5Var.I(new xj8(f, "next", i2));
        }
        return !TextUtils.isEmpty(i.p()) ? l(i.p(), str, iv5Var) : i2;
    }

    public rv5 l(String str, String str2, iv5 iv5Var) {
        Object b2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rv5) ipChange.ipc$dispatch("eb08b0e4", new Object[]{this, str, str2, iv5Var});
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || iv5Var == null) {
            return rv5.b(kv5.EVENT_CHAIN_ERROR_EXECUTE_CONTEXT_IS_NULL);
        }
        iv5Var.M();
        if (str.startsWith("$(") && str.endsWith(f7l.BRACKET_END_STR)) {
            return m(str2, str.substring(2, str.length() - 1), iv5Var);
        }
        if (str.startsWith("$$(") && str.endsWith(f7l.BRACKET_END_STR)) {
            return n(str.substring(3, str.length() - 1), iv5Var);
        }
        if (!str.startsWith("@") || !str.endsWith("}") || (b2 = iv5Var.n().a(str).b(null, iv5Var.l())) == null) {
            return null;
        }
        return l(b2.toString(), str2, iv5Var);
    }
}
