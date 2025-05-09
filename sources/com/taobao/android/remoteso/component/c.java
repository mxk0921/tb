package com.taobao.android.remoteso.component;

import android.content.Context;
import android.view.View;
import androidx.core.util.Pair;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.log.RSoLog;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import tb.adw;
import tb.bxn;
import tb.cxn;
import tb.exn;
import tb.gcf;
import tb.gk4;
import tb.j0n;
import tb.mi8;
import tb.mlk;
import tb.qts;
import tb.rbn;
import tb.trq;
import tb.twp;
import tb.uos;
import tb.y6h;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final com.taobao.android.remoteso.component.d f9251a;
    public final String b;
    public final Set<gcf> e;
    public final gk4<cxn, Void> f;
    public final mlk<cxn> c = new mlk<>();
    public final mlk<Integer> d = new mlk<>();
    public volatile boolean g = false;
    public volatile int h = 0;
    public final long i = uos.b();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements gcf {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.gcf
        public void a(cxn cxnVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e5ef5050", new Object[]{this, cxnVar});
            } else {
                c.a(c.this, true);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ cxn f9253a;

        public b(cxn cxnVar) {
            this.f9253a = cxnVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                c.b(c.this).a(this.f9253a);
            }
        }
    }

    /* compiled from: Taobao */
    /* renamed from: com.taobao.android.remoteso.component.c$c  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class RunnableC0478c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ cxn f9254a;

        public RunnableC0478c(cxn cxnVar) {
            this.f9254a = cxnVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            if (!c.c(c.this).f9256a.d) {
                c.b(c.this).a(this.f9254a);
            }
            c.d(c.this).b(this.f9254a);
            c.c(c.this).f9256a.getClass();
            RSoLog.d("remo, updateResult, done, result=" + this.f9254a);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f9255a;

        public d(int i) {
            this.f9255a = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            c.e(c.this).onProgressChanged(this.f9255a);
            c.f(c.this).b(Integer.valueOf(this.f9255a));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class e implements j0n {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e(c cVar) {
        }

        @Override // tb.j0n
        public void onProgressChanged(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5158474", new Object[]{this, new Integer(i)});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class f implements mi8 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.mi8
        public View a(adw adwVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (View) ipChange.ipc$dispatch("78853d51", new Object[]{this, adwVar});
            }
            return new RemoErrorView(adwVar.getContext());
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class g implements y6h {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public RemoLoadingView create(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (RemoLoadingView) ipChange.ipc$dispatch("29d2e5b6", new Object[]{this, context});
            }
            return new RemoLoadingView(context);
        }
    }

    public c(com.taobao.android.remoteso.component.d dVar, String str) {
        gk4<cxn, Void> gk4Var;
        CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
        this.e = copyOnWriteArraySet;
        this.f9251a = dVar;
        this.b = str;
        h();
        if (!w() || v()) {
            gk4Var = new twp(copyOnWriteArraySet);
        } else {
            gk4Var = new exn(copyOnWriteArraySet);
        }
        this.f = gk4Var;
    }

    public static /* synthetic */ boolean a(c cVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5fcf2afa", new Object[]{cVar, new Boolean(z)})).booleanValue();
        }
        cVar.g = z;
        return z;
    }

    public static /* synthetic */ gk4 b(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gk4) ipChange.ipc$dispatch("fbe7ed3d", new Object[]{cVar});
        }
        return cVar.f;
    }

    public static /* synthetic */ com.taobao.android.remoteso.component.d c(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.remoteso.component.d) ipChange.ipc$dispatch("c18f2b21", new Object[]{cVar});
        }
        return cVar.f9251a;
    }

    public static /* synthetic */ mlk d(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mlk) ipChange.ipc$dispatch("7f00206", new Object[]{cVar});
        }
        return cVar.c;
    }

    public static /* synthetic */ j0n e(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j0n) ipChange.ipc$dispatch("486d797c", new Object[]{cVar});
        }
        return cVar.n();
    }

    public static /* synthetic */ mlk f(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mlk) ipChange.ipc$dispatch("8ebce088", new Object[]{cVar});
        }
        return cVar.d;
    }

    public void g(gcf gcfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cc84120", new Object[]{this, gcfVar});
        } else {
            ((CopyOnWriteArraySet) this.e).add(gcfVar);
        }
    }

    public final void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4874c921", new Object[]{this});
        } else if (!trq.d(this.b, "check")) {
            gcf gcfVar = this.f9251a.f9256a.f;
            if (gcfVar == null) {
                rbn.e("RemoReqBO,addCallback", toString());
                return;
            }
            ((CopyOnWriteArraySet) this.e).add(gcfVar);
            ((CopyOnWriteArraySet) this.e).add(new a());
        }
    }

    public Context j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this});
        }
        Context context = this.f9251a.f9256a.b;
        if (context != null) {
            return context;
        }
        RSoLog.d("remo,context not set, request = " + this.f9251a);
        return qts.b();
    }

    public mi8 k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mi8) ipChange.ipc$dispatch("3eb9ce5e", new Object[]{this});
        }
        this.f9251a.f9256a.getClass();
        return new f();
    }

    public y6h l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (y6h) ipChange.ipc$dispatch("aefd0fc6", new Object[]{this});
        }
        this.f9251a.f9256a.getClass();
        return new g();
    }

    public String m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("24310680", new Object[]{this});
        }
        return this.b;
    }

    public final j0n n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j0n) ipChange.ipc$dispatch("c90bee9a", new Object[]{this});
        }
        j0n j0nVar = this.f9251a.f9256a.e;
        if (j0nVar == null) {
            return new e(this);
        }
        return j0nVar;
    }

    public mlk<Integer> o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mlk) ipChange.ipc$dispatch("59ae1703", new Object[]{this});
        }
        return this.d;
    }

    public com.taobao.android.remoteso.component.d p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.remoteso.component.d) ipChange.ipc$dispatch("4f7490e3", new Object[]{this});
        }
        return this.f9251a;
    }

    public mlk<cxn> q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mlk) ipChange.ipc$dispatch("84b24593", new Object[]{this});
        }
        return this.c;
    }

    public boolean r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ffe97316", new Object[]{this})).booleanValue();
        }
        return this.g;
    }

    public long s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("15248d54", new Object[]{this})).longValue();
        }
        return uos.b() - this.i;
    }

    public List<String> t(String str) {
        List list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("10f725b4", new Object[]{this, str});
        }
        HashSet hashSet = new HashSet();
        Iterator it = ((ArrayList) this.f9251a.f9256a.f9257a).iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            if (trq.d(str, (CharSequence) pair.first) && (list = (List) pair.second) != null) {
                hashSet.addAll(list);
            }
        }
        return new ArrayList(hashSet);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "RemoReqBO@" + Integer.toHexString(hashCode()) + "{, request=" + this.f9251a + '}';
    }

    public boolean u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b0c2dfc0", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public boolean v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d7bb3ade", new Object[]{this})).booleanValue();
        }
        this.f9251a.f9256a.getClass();
        return false;
    }

    public boolean w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("21e667e4", new Object[]{this})).booleanValue();
        }
        return this.f9251a.f9256a.c;
    }

    public void x(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28975706", new Object[]{this, new Integer(i)});
        } else if (i <= 0 || i - this.h > 1) {
            this.h = i;
            bxn.b(new d(i));
        }
    }

    public void y(cxn cxnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f81797de", new Object[]{this, cxnVar});
            return;
        }
        RSoLog.d("remo, updateResult, enter, " + this + ", result" + cxnVar);
        if (this.f9251a.f9256a.d) {
            bxn.c(new b(cxnVar));
        }
        bxn.b(new RunnableC0478c(cxnVar));
    }

    public String i() {
        S s;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ca559413", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = ((ArrayList) this.f9251a.f9256a.f9257a).iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            if (!(pair == null || (s = pair.second) == 0)) {
                for (String str : (List) s) {
                    sb.append(str);
                    sb.append(",");
                }
            }
        }
        String sb2 = sb.toString();
        if (sb2.endsWith(",") && sb2.length() > 1) {
            return sb2.substring(0, sb2.length() - 1);
        }
        RSoLog.g("remo, reqBO allModules weired = ".concat(sb2));
        return sb2;
    }
}
