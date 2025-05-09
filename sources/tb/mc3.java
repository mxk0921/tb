package tb;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.android.icart.core.data.DataBizContext;
import com.alibaba.android.icart.core.view.ViewManager;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.stdpop.api.PopGravity;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Stack;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class mc3 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final mc3 INSTANCE = new mc3();

    /* renamed from: a  reason: collision with root package name */
    public static final String f23934a = "CartPop";
    public static final HashMap<String, Stack<oc3>> b = new HashMap<>();
    public static final Stack<oc3> c = new Stack<>();
    public static long d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class a implements View.OnLayoutChangeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ kmb f23935a;
        public final /* synthetic */ nc3 b;
        public final /* synthetic */ g1a c;
        public final /* synthetic */ g1a d;

        public a(kmb kmbVar, nc3 nc3Var, g1a g1aVar, g1a g1aVar2) {
            this.f23935a = kmbVar;
            this.b = nc3Var;
            this.c = g1aVar;
            this.d = g1aVar2;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            ViewGroup p;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("899df952", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8)});
                return;
            }
            ViewManager Z = this.f23935a.e();
            if (!(Z == null || (p = Z.p()) == null)) {
                p.removeOnLayoutChangeListener(this);
            }
            mc3 mc3Var = mc3.INSTANCE;
            mc3.a(mc3Var, this.f23935a, this.b, this.c, this.d, true);
            hav.d(mc3.b(mc3Var), "recursion call show");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class b extends mlq {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ oc3 f23936a;
        public final /* synthetic */ nc3 b;
        public final /* synthetic */ g1a c;

        public b(oc3 oc3Var, nc3 nc3Var, g1a g1aVar) {
            this.f23936a = oc3Var;
            this.b = nc3Var;
            this.c = g1aVar;
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -967711883) {
                super.c((JSONObject) objArr[0]);
                return null;
            } else if (hashCode == -490060912) {
                super.b((JSONObject) objArr[0]);
                return null;
            } else {
                int hashCode2 = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/alibaba/android/icart/core/widget/pop/CartPop$doShow$callback$1");
            }
        }

        @Override // tb.mlq, tb.uv2
        public void b(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e2ca4390", new Object[]{this, jSONObject});
                return;
            }
            super.b(jSONObject);
            mc3 mc3Var = mc3.INSTANCE;
            String b = mc3.b(mc3Var);
            try {
                mc3.c(mc3Var, this.f23936a, this.b);
                g1a g1aVar = this.c;
                if (g1aVar != null) {
                    xhv xhvVar = (xhv) g1aVar.invoke(jSONObject);
                }
                qbv j = qbv.j();
                ckf.f(j, "UltronTradeHybridManager.getInstance()");
                j.p().b(this.b.i());
            } catch (Throwable th) {
                xh8 c = xh8.a("Ultron").c(b);
                String message = th.getMessage();
                if (message == null) {
                    message = "出错了";
                }
                f9v.q(c.message(message));
            }
        }

        @Override // tb.mlq
        public void c(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c651e375", new Object[]{this, jSONObject});
                return;
            }
            super.c(jSONObject);
            mc3.d(mc3.INSTANCE, this.f23936a);
        }
    }

    static {
        t2o.a(479199631);
    }

    public static final /* synthetic */ void a(mc3 mc3Var, kmb kmbVar, nc3 nc3Var, g1a g1aVar, g1a g1aVar2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b68c1992", new Object[]{mc3Var, kmbVar, nc3Var, g1aVar, g1aVar2, new Boolean(z)});
        } else {
            mc3Var.g(kmbVar, nc3Var, g1aVar, g1aVar2, z);
        }
    }

    public static final /* synthetic */ String b(mc3 mc3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("eb7de267", new Object[]{mc3Var});
        }
        return f23934a;
    }

    public static final /* synthetic */ void c(mc3 mc3Var, oc3 oc3Var, nc3 nc3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9669ef95", new Object[]{mc3Var, oc3Var, nc3Var});
        } else {
            mc3Var.n(oc3Var, nc3Var);
        }
    }

    public static final /* synthetic */ void d(mc3 mc3Var, oc3 oc3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a1702db", new Object[]{mc3Var, oc3Var});
        } else {
            mc3Var.o(oc3Var);
        }
    }

    @JvmStatic
    public static final void f(String str) {
        Stack<oc3> remove;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("769f891e", new Object[]{str});
        } else if (str != null && (remove = b.remove(str)) != null) {
            Iterator<oc3> it = remove.iterator();
            while (it.hasNext()) {
                c.remove(it.next());
            }
        }
    }

    @JvmStatic
    public static final oc3 i(String str) {
        oc3 oc3Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (oc3) ipChange.ipc$dispatch("1b7df0eb", new Object[]{str});
        }
        if (str == null || (oc3Var = (oc3) eb3.b(b.get(str))) == null) {
            return (oc3) eb3.b(c);
        }
        return oc3Var;
    }

    @JvmStatic
    public static final void k(Context context, String str, boolean z) {
        Stack<oc3> stack;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aacb5288", new Object[]{context, str, new Boolean(z)});
        } else if (context != null) {
            if (str == null || str.length() == 0) {
                stack = c;
            } else {
                stack = b.remove(str);
                if (stack == null) {
                    return;
                }
            }
            Iterator<oc3> it = stack.iterator();
            while (it.hasNext()) {
                j(context, it.next(), z);
            }
        }
    }

    @JvmStatic
    public static final boolean m(String str) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a6c79d13", new Object[]{str})).booleanValue();
        }
        if (str != null && str.length() != 0) {
            Stack<oc3> stack = b.get(str);
            if (stack == null || stack.isEmpty()) {
                z = true;
            }
            return !z;
        } else if (i(str) != null) {
            return true;
        } else {
            return false;
        }
    }

    @JvmStatic
    public static final void q(kmb kmbVar, nc3 nc3Var, g1a<? super oc3, xhv> g1aVar, g1a<? super Map<String, ? extends Object>, xhv> g1aVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65556125", new Object[]{kmbVar, nc3Var, g1aVar, g1aVar2});
            return;
        }
        ckf.g(kmbVar, "presenter");
        ckf.g(nc3Var, "config");
        INSTANCE.g(kmbVar, nc3Var, g1aVar, g1aVar2, false);
    }

    public final View h(Activity activity, Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("b46492d3", new Object[]{this, activity, num});
        }
        if (num == null || -1 == num.intValue()) {
            return null;
        }
        return activity.findViewById(num.intValue());
    }

    public final void l(kmb kmbVar, nc3 nc3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c3f18b2", new Object[]{this, kmbVar, nc3Var});
            return;
        }
        Activity context = kmbVar.getContext();
        ckf.f(context, "presenter.context");
        View h = h(context, nc3Var.m());
        if (h != null) {
            Float o = nc3Var.o();
            if (o != null) {
                h.setZ(o.floatValue());
            } else {
                h.setZ(0.0f);
            }
        }
    }

    public final boolean r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fc1db10", new Object[]{this})).booleanValue();
        }
        long j = d;
        d = System.currentTimeMillis();
        if (System.currentTimeMillis() - j <= 200) {
            return true;
        }
        return false;
    }

    public final void t(Activity activity, String str, nc3 nc3Var, plq plqVar, mlq mlqVar) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("138814e8", new Object[]{this, activity, str, nc3Var, plqVar, mlqVar});
            return;
        }
        Map<String, Object> f = nc3Var.f();
        String str2 = f23934a;
        try {
            lbv.l();
            if (f != null) {
                jSONObject = new JSONObject();
                jSONObject.putAll(f);
            } else {
                jSONObject = null;
            }
            String a2 = oe3.INSTANCE.a(str, nc3Var);
            hav.d(str2, "finalUrl=" + a2);
            nc3Var.x(a2);
            plqVar.x(activity, a2, mlqVar, jSONObject);
        } catch (Throwable th) {
            xh8 c2 = xh8.a("Ultron").c(str2);
            String message = th.getMessage();
            if (message == null) {
                message = "出错了";
            }
            f9v.q(c2.message(message));
        }
    }

    public final void u(Activity activity, Integer num, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8970d78", new Object[]{this, activity, num, new Integer(i)});
            return;
        }
        try {
            View h = INSTANCE.h(activity, num);
            if (h != null) {
                h.setVisibility(i);
                xhv xhvVar = xhv.INSTANCE;
            }
        } catch (Throwable th) {
            hav.a("UltronCatchException", th.getMessage());
        }
    }

    @JvmStatic
    public static final void j(Context context, oc3 oc3Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c881684", new Object[]{context, oc3Var, new Boolean(z)});
        } else if (context != null) {
            if (oc3Var == null) {
                oc3Var = (oc3) eb3.b(c);
            }
            if (oc3Var != null) {
                String str = f23934a;
                try {
                    if (oc3Var.f()) {
                        oc3Var.g(true);
                        oc3Var.e().g(context, z);
                    }
                } catch (Throwable th) {
                    xh8 c2 = xh8.a("Ultron").c(str);
                    String message = th.getMessage();
                    if (message == null) {
                        message = "出错了";
                    }
                    f9v.q(c2.message(message));
                }
            }
        }
    }

    @JvmStatic
    public static final void v(kmb kmbVar, nc3 nc3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9df919d", new Object[]{kmbVar, nc3Var});
            return;
        }
        ckf.g(kmbVar, "presenter");
        ckf.g(nc3Var, "config");
        View e = nc3Var.e();
        if (e != null && !DataBizContext.ShareContext.needShowCushionView()) {
            if (nc3Var.p()) {
                e.setPadding(0, 0, 0, cb4.G(kmbVar));
            } else {
                e.setPadding(0, 0, 0, 0);
            }
        }
    }

    public final int e(kmb kmbVar, nc3 nc3Var, boolean z, g1a<? super oc3, xhv> g1aVar, g1a<? super Map<String, ? extends Object>, xhv> g1aVar2) {
        ViewGroup p;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b23225f2", new Object[]{this, kmbVar, nc3Var, new Boolean(z), g1aVar, g1aVar2})).intValue();
        }
        if (nc3Var.q()) {
            i = cb4.H(kmbVar);
            String str = f23934a;
            hav.d(str, "submitHeight=" + i);
            if (i <= 0) {
                if (z) {
                    i = pb6.c(kmbVar.getContext(), 64.0f);
                } else {
                    ViewManager Z = kmbVar.e();
                    if (!(Z == null || (p = Z.p()) == null)) {
                        p.addOnLayoutChangeListener(new a(kmbVar, nc3Var, g1aVar, g1aVar2));
                    }
                    hav.d(str, "addOnLayoutChangeListener to footer");
                    return -1;
                }
            }
            hav.d(str, "final submitHeight=" + i);
        }
        return i;
    }

    public final void g(kmb kmbVar, nc3 nc3Var, g1a<? super oc3, xhv> g1aVar, g1a<? super Map<String, ? extends Object>, xhv> g1aVar2, boolean z) {
        imb h0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68aa8d04", new Object[]{this, kmbVar, nc3Var, g1aVar, g1aVar2, new Boolean(z)});
        } else if (z || !r()) {
            Activity context = kmbVar.getContext();
            ckf.f(context, "presenter.context");
            g8e T = kmbVar.T();
            ckf.f(T, "presenter.ivOperate");
            String instanceId = T.getInstanceId();
            if (instanceId == null) {
                instanceId = "";
            }
            if (nc3Var.g()) {
                ViewManager Z = kmbVar.e();
                if (!(Z == null || (h0 = Z.h0()) == null)) {
                    h0.f(false);
                }
                k(context, instanceId, false);
            }
            int e = e(kmbVar, nc3Var, z, g1aVar, g1aVar2);
            if (e >= 0) {
                if (nc3Var.p()) {
                    if (nc3Var.e() != null) {
                        v(kmbVar, nc3Var);
                    } else {
                        e += cb4.G(kmbVar);
                    }
                }
                plq plqVar = new plq();
                plqVar.q(nc3Var.j());
                plqVar.i(nc3Var.b());
                plqVar.k(nc3Var.d());
                plqVar.o(PopGravity.BOTTOM);
                zfm zfmVar = new zfm();
                zfmVar.e(nc3Var.c() + (pb6.C(context, e) - 1.0f));
                xhv xhvVar = xhv.INSTANCE;
                plqVar.p(zfmVar);
                plqVar.r(nc3Var.l());
                if (nc3Var.q()) {
                    plqVar.s(nc3Var.m());
                }
                oc3 oc3Var = new oc3();
                oc3Var.h(context);
                String f = plqVar.f();
                ckf.f(f, "stdPopPanel.popId");
                oc3Var.k(f);
                oc3Var.m(plqVar);
                oc3Var.i(instanceId);
                oc3Var.j(nc3Var.k());
                p(oc3Var, g1aVar);
                b bVar = new b(oc3Var, nc3Var, g1aVar2);
                u(context, nc3Var.m(), 0);
                l(kmbVar, nc3Var);
                String n = nc3Var.n();
                if (n != null) {
                    Uri.Builder buildUpon = Uri.parse(n).buildUpon();
                    buildUpon.appendQueryParameter("cartInstanceId", kmbVar.O());
                    buildUpon.appendQueryParameter("popId", plqVar.f());
                    mc3 mc3Var = INSTANCE;
                    String builder = buildUpon.toString();
                    ckf.f(builder, "uri.toString()");
                    mc3Var.t(context, builder, nc3Var, plqVar, bVar);
                    return;
                }
                View e2 = nc3Var.e();
                if (e2 != null) {
                    s(context, e2, plqVar, bVar);
                }
            }
        } else {
            hav.d(f23934a, "调用太频繁了");
        }
    }

    public final void n(oc3 oc3Var, nc3 nc3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ef8a875", new Object[]{this, oc3Var, nc3Var});
            return;
        }
        oc3Var.l(false);
        oc3Var.g(false);
        c.remove(oc3Var);
        Stack<oc3> stack = b.get(oc3Var.b());
        if (stack != null) {
            stack.remove(oc3Var);
            if (nc3Var.a()) {
                u(oc3Var.a(), oc3Var.e().e(), 8);
            }
            hav.g(f23934a, "onHide:", oc3Var.d(), ":", oc3Var.b());
        }
    }

    public final void s(Activity activity, View view, plq plqVar, mlq mlqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94850507", new Object[]{this, activity, view, plqVar, mlqVar});
            return;
        }
        String str = f23934a + "#showWithCustomView";
        try {
            view.setClickable(true);
            plqVar.v(activity, view, mlqVar);
        } catch (Throwable th) {
            xh8 c2 = xh8.a("Ultron").c(str);
            String message = th.getMessage();
            if (message == null) {
                message = "出错了";
            }
            f9v.q(c2.message(message));
        }
    }

    public final void o(oc3 oc3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2bb4df37", new Object[]{this, oc3Var});
            return;
        }
        oc3Var.l(true);
        oc3Var.g(false);
        hav.g(f23934a, "onShowEnd:", oc3Var.d(), ":", oc3Var.b());
    }

    public final void p(oc3 oc3Var, g1a<? super oc3, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5390544", new Object[]{this, oc3Var, g1aVar});
            return;
        }
        oc3Var.l(false);
        oc3Var.g(true);
        c.push(oc3Var);
        HashMap<String, Stack<oc3>> hashMap = b;
        Stack<oc3> stack = hashMap.get(oc3Var.b());
        if (stack == null) {
            stack = new Stack<>();
        }
        hashMap.put(oc3Var.b(), stack);
        stack.push(oc3Var);
        if (g1aVar != null) {
            g1aVar.invoke(oc3Var);
        }
        hav.g(f23934a, "onShowStart:", oc3Var.d(), ":", oc3Var.b());
    }
}
