package tb;

import android.text.TextUtils;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class iv5 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public WeakReference<View> f21596a;
    public WeakReference<DXRuntimeContext> b;
    public WeakReference<k8> c;
    public WeakReference<qv5> d;
    public ov5 e;
    public uy8 h;
    public vy8 i;
    public qz8 j;
    public xj8 m;
    public vj8 n;
    public tv5 o;
    public boolean p;
    public boolean q;
    public boolean f = false;
    public int g = 0;
    public String k = "";
    public final AtomicInteger l = new AtomicInteger(0);

    static {
        t2o.a(444596674);
    }

    public void A(qv5 qv5Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf648269", new Object[]{this, qv5Var});
        } else {
            this.d = new WeakReference<>(qv5Var);
        }
    }

    public void B(DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7df5765", new Object[]{this, dXRuntimeContext});
        } else {
            this.b = new WeakReference<>(dXRuntimeContext);
        }
    }

    public void C(vj8 vj8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a3acf6a", new Object[]{this, vj8Var});
        } else {
            this.n = vj8Var;
        }
    }

    public void D(tv5 tv5Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aefef29a", new Object[]{this, tv5Var});
        } else {
            this.o = tv5Var;
        }
    }

    public void E(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a15805", new Object[]{this, str});
        } else {
            this.k = str;
        }
    }

    public void F(ov5 ov5Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f6d2d84", new Object[]{this, ov5Var});
        } else {
            this.e = ov5Var;
        }
    }

    public void G(qz8 qz8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5eb94e4", new Object[]{this, qz8Var});
        } else {
            this.j = qz8Var;
        }
    }

    public void H(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4d54b5f", new Object[]{this, new Boolean(z)});
        } else {
            this.p = z;
        }
    }

    public void I(xj8 xj8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec91bc08", new Object[]{this, xj8Var});
        } else {
            this.m = xj8Var;
        }
    }

    public void J(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a57bf5cd", new Object[]{this, view});
        } else {
            this.f21596a = new WeakReference<>(view);
        }
    }

    public void K(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("510b9dc3", new Object[]{this, new Boolean(z)});
        } else {
            this.q = z;
        }
    }

    public void M() {
        DXRuntimeContext dXRuntimeContext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ead0067", new Object[]{this});
            return;
        }
        WeakReference<DXRuntimeContext> weakReference = this.b;
        if (weakReference == null) {
            dXRuntimeContext = null;
        } else {
            dXRuntimeContext = weakReference.get();
        }
        if (dXRuntimeContext == null) {
            dXRuntimeContext = k();
        }
        if (dXRuntimeContext != null) {
            dXRuntimeContext.k0(this.e);
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f50498c", new Object[]{this});
            return;
        }
        int i = this.g + 1;
        this.g = i;
        h36.f("DXFullTrace", "addReferenceCount ", Integer.valueOf(i));
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707fe601", new Object[]{this});
            return;
        }
        this.f = true;
        ov5 ov5Var = this.e;
        if (ov5Var != null) {
            ov5Var.h(true);
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bb8f438", new Object[]{this});
            return;
        }
        this.g = 0;
        h36.f("DXFullTrace", "clearReferenceCount ", 0);
    }

    public y7 d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (y7) ipChange.ipc$dispatch("d543e49c", new Object[]{this});
        }
        WeakReference<qv5> weakReference = this.d;
        if (weakReference != null && weakReference.get() != null) {
            return this.d.get().p();
        }
        h36.g("DXEventChainContext", "getAbilityEngine : dxEventChainManager is null");
        return null;
    }

    public k8 e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (k8) ipChange.ipc$dispatch("bcef1ffc", new Object[]{this});
        }
        WeakReference<k8> weakReference = this.c;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public int f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("447c0056", new Object[]{this})).intValue();
        }
        return this.l.getAndIncrement();
    }

    public uy8 g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (uy8) ipChange.ipc$dispatch("f4ebbd89", new Object[]{this});
        }
        return this.h;
    }

    public vy8 h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vy8) ipChange.ipc$dispatch("df59334d", new Object[]{this});
        }
        return this.i;
    }

    public wc5 i(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wc5) ipChange.ipc$dispatch("6b928adb", new Object[]{this, str, str2});
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            h36.g("DXEventChainContext", "getAtomicNode : eventchain name  or atomic name is null");
        }
        gv5 j = j(str);
        if (j == null) {
            return null;
        }
        return j.b(str2);
    }

    public gv5 j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gv5) ipChange.ipc$dispatch("4c3a4ce3", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            h36.g("DXEventChainContext", "getEventChain : eventchain name is null");
            return null;
        }
        tv5 n = n();
        if (n == null) {
            return null;
        }
        return n.b(str);
    }

    public final DXRuntimeContext k() {
        DXWidgetNode b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRuntimeContext) ipChange.ipc$dispatch("67b543f3", new Object[]{this});
        }
        WeakReference<View> weakReference = this.f21596a;
        if (weakReference == null || weakReference.get() == null || (b = kl6.b(this.f21596a.get())) == null || b.getReferenceNode() == null) {
            return null;
        }
        return b.getReferenceNode().getDXRuntimeContext();
    }

    public DXRuntimeContext l() {
        DXRuntimeContext dXRuntimeContext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRuntimeContext) ipChange.ipc$dispatch("75816a9f", new Object[]{this});
        }
        WeakReference<DXRuntimeContext> weakReference = this.b;
        if (weakReference == null) {
            dXRuntimeContext = null;
        } else {
            dXRuntimeContext = weakReference.get();
        }
        if (dXRuntimeContext == null) {
            dXRuntimeContext = k();
        }
        if (dXRuntimeContext != null && dXRuntimeContext.u() == null) {
            dXRuntimeContext.k0(this.e);
        }
        return dXRuntimeContext;
    }

    public vj8 m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vj8) ipChange.ipc$dispatch("bc749c8a", new Object[]{this});
        }
        return this.n;
    }

    public tv5 n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tv5) ipChange.ipc$dispatch("e2a51f20", new Object[]{this});
        }
        if (this.o != null && zg5.u5() && this.p) {
            return this.o;
        }
        DXRuntimeContext l = l();
        if (l == null || l.W() == null || l.W().queryRootWidgetNode() == null) {
            return null;
        }
        return l.W().queryRootWidgetNode().getDxEventChains();
    }

    public String o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c6723b91", new Object[]{this});
        }
        if (TextUtils.isEmpty(this.k)) {
            return "";
        }
        return this.k;
    }

    public ov5 p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ov5) ipChange.ipc$dispatch("193fcb6c", new Object[]{this});
        }
        return this.e;
    }

    public qz8 q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qz8) ipChange.ipc$dispatch("38f7739c", new Object[]{this});
        }
        return this.j;
    }

    public xj8 r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xj8) ipChange.ipc$dispatch("219aa06a", new Object[]{this});
        }
        return this.m;
    }

    public int s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e67999de", new Object[]{this})).intValue();
        }
        return this.l.get();
    }

    public int t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7d2dfcf4", new Object[]{this})).intValue();
        }
        h36.f("DXFullTrace", "getReferenceCount ", Integer.valueOf(this.g));
        return this.g;
    }

    public boolean u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f1eae2cf", new Object[]{this})).booleanValue();
        }
        return this.f;
    }

    public boolean v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dfa3c96d", new Object[]{this})).booleanValue();
        }
        return this.q;
    }

    public void w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("896d15e4", new Object[]{this});
        } else {
            this.l.set(0);
        }
    }

    public void x(k8 k8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95cfbb4", new Object[]{this, k8Var});
        } else {
            this.c = new WeakReference<>(k8Var);
        }
    }

    public void y(uy8 uy8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be5b116d", new Object[]{this, uy8Var});
        } else {
            this.h = uy8Var;
        }
    }

    public void z(vy8 vy8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e220a831", new Object[]{this, vy8Var});
        } else {
            this.i = vy8Var;
        }
    }

    public void L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("187c056b", new Object[]{this});
            return;
        }
        int i = this.g;
        if (i > 0) {
            this.g = i - 1;
        }
        h36.f("DXFullTrace", "subReferenceCount ", Integer.valueOf(this.g));
    }
}
