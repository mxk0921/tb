package tb;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class xcq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Set<String> f31300a;
    public final boolean b;
    public final o5c c;
    public final trd d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ xdp f31301a;

        public a(xdp xdpVar) {
            this.f31301a = xdpVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                new mdp(this.f31301a).a();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ix9 f31302a;

        public b(ix9 ix9Var) {
            this.f31302a = ix9Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                new sw9(this.f31302a).a();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ sfw f31303a;

        public c(sfw sfwVar) {
            this.f31303a = sfwVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                new vew(this.f31303a).a();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ v8f f31304a;

        public d(v8f v8fVar) {
            this.f31304a = v8fVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                new u8f(this.f31304a).a();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final List f31305a;
        public final List<xdp> b;
        public final List<ix9> c;
        public final List<sfw> d;
        public final List<v8f> e;
        public boolean f;
        public boolean g;
        public vfc h;

        static {
            t2o.a(676331588);
        }

        public /* synthetic */ e(a aVar) {
            this();
        }

        public static /* synthetic */ boolean a(e eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("322997c", new Object[]{eVar})).booleanValue();
            }
            return eVar.f;
        }

        public static /* synthetic */ List b(e eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("67645a10", new Object[]{eVar});
            }
            return eVar.f31305a;
        }

        public static /* synthetic */ List c(e eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("8faa9a51", new Object[]{eVar});
            }
            return eVar.b;
        }

        public static /* synthetic */ List d(e eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("b7f0da92", new Object[]{eVar});
            }
            return eVar.c;
        }

        public static /* synthetic */ List e(e eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("e0371ad3", new Object[]{eVar});
            }
            return eVar.d;
        }

        public static /* synthetic */ List f(e eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("87d5b14", new Object[]{eVar});
            }
            return eVar.e;
        }

        public static /* synthetic */ boolean g(e eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("36d6fcb6", new Object[]{eVar})).booleanValue();
            }
            return eVar.g;
        }

        public static /* synthetic */ vfc h(e eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (vfc) ipChange.ipc$dispatch("199510e9", new Object[]{eVar});
            }
            return eVar.h;
        }

        public e i(vfc vfcVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (e) ipChange.ipc$dispatch("d2aa5667", new Object[]{this, vfcVar});
            }
            this.h = vfcVar;
            return this;
        }

        public e j(ix9 ix9Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (e) ipChange.ipc$dispatch("d5aca8f3", new Object[]{this, ix9Var});
            }
            ((ArrayList) this.c).add(ix9Var);
            return this;
        }

        public e k(v8f v8fVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (e) ipChange.ipc$dispatch("a20af701", new Object[]{this, v8fVar});
            }
            ((ArrayList) this.e).add(v8fVar);
            return this;
        }

        public e l(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (e) ipChange.ipc$dispatch("c918879e", new Object[]{this, str});
            }
            ((ArrayList) this.f31305a).add(str);
            return this;
        }

        public e m(xdp xdpVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (e) ipChange.ipc$dispatch("76bf6361", new Object[]{this, xdpVar});
            }
            ((ArrayList) this.b).add(xdpVar);
            return this;
        }

        public xcq n() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (xcq) ipChange.ipc$dispatch("f2f604c", new Object[]{this});
            }
            return new xcq(this, null);
        }

        public e o(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (e) ipChange.ipc$dispatch("c31d630e", new Object[]{this, new Boolean(z)});
            }
            this.f = z;
            return this;
        }

        public e p(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (e) ipChange.ipc$dispatch("a572b008", new Object[]{this, new Boolean(z)});
            }
            this.g = z;
            return this;
        }

        public e() {
            this.f31305a = new ArrayList();
            this.b = new ArrayList();
            this.c = new ArrayList();
            this.d = new ArrayList();
            this.e = new ArrayList();
        }
    }

    static {
        t2o.a(676331583);
    }

    public /* synthetic */ xcq(e eVar, a aVar) {
        this(eVar);
    }

    public static e c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("81112342", new Object[0]);
        }
        return new e(null);
    }

    public List<String> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("f6ba4a1a", new Object[]{this});
        }
        return new ArrayList(this.f31300a);
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b307dd22", new Object[]{this})).booleanValue();
        }
        return this.b;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return String.format("SplitInstallRequest{modulesNames=%s}", this.f31300a);
    }

    public xcq(e eVar) {
        ucq ucqVar;
        this.c = new y07();
        trd trdVar = (trd) d62.a(trd.class, new Object[0]);
        this.d = trdVar;
        this.b = e.a(eVar);
        try {
            ucqVar = trdVar.create(bcq.a().e().j());
        } catch (Exception e2) {
            e2.printStackTrace();
            ucqVar = this.d.create(fx4.m().k());
        }
        this.f31300a = new HashSet(e.b(eVar));
        if (e.c(eVar).size() > 0) {
            for (xdp xdpVar : e.c(eVar)) {
                if (((y07) this.c).h(xdpVar.b()) != null) {
                    xdpVar.m(((y07) this.c).h(xdpVar.b()));
                    ucqVar.b(xdpVar);
                    String e3 = ((y07) this.c).e(xdpVar.b());
                    HashSet hashSet = new HashSet();
                    if (!TextUtils.isEmpty(e3)) {
                        xdpVar.g(e3);
                        hashSet.add(e3);
                        hashSet.addAll(((y07) this.c).b(e3));
                    }
                    if (TextUtils.isEmpty(e3)) {
                        new Handler(Looper.getMainLooper()).post(new a(xdpVar));
                    } else {
                        xdpVar.g(e3);
                        ((HashSet) this.f31300a).add(e3);
                    }
                }
            }
        }
        if (e.d(eVar).size() > 0) {
            for (ix9 ix9Var : e.d(eVar)) {
                String c2 = ((y07) this.c).c(ix9Var.b());
                ucqVar.b(ix9Var);
                HashSet hashSet2 = new HashSet();
                if (!TextUtils.isEmpty(c2)) {
                    ix9Var.g(c2);
                    hashSet2.add(c2);
                    hashSet2.addAll(((y07) this.c).b(c2));
                }
                if (TextUtils.isEmpty(c2)) {
                    new Handler(Looper.getMainLooper()).post(new b(ix9Var));
                } else if (!TextUtils.isEmpty(c2)) {
                    ix9Var.g(c2);
                    ((HashSet) this.f31300a).add(ix9Var.d());
                }
            }
        }
        if (e.e(eVar).size() > 0) {
            for (sfw sfwVar : e.e(eVar)) {
                if (TextUtils.isEmpty(sfwVar.d())) {
                    ucqVar.b(sfwVar);
                    String f = ((y07) this.c).f(sfwVar.b());
                    HashSet hashSet3 = new HashSet();
                    if (!TextUtils.isEmpty(f)) {
                        sfwVar.g(f);
                        hashSet3.add(f);
                        hashSet3.addAll(((y07) this.c).b(f));
                    }
                    if (TextUtils.isEmpty(f)) {
                        new Handler(Looper.getMainLooper()).post(new c(sfwVar));
                    } else if (!TextUtils.isEmpty(f)) {
                        ((HashSet) this.f31300a).add(f);
                        sfwVar.g(((y07) this.c).c(sfwVar.b()));
                    }
                }
            }
        }
        if (e.f(eVar).size() > 0) {
            for (v8f v8fVar : e.f(eVar)) {
                ucqVar.b(v8fVar);
                if (TextUtils.isEmpty(v8fVar.d())) {
                    String d2 = ((y07) this.c).d(v8fVar.b());
                    HashSet hashSet4 = new HashSet();
                    if (!TextUtils.isEmpty(d2)) {
                        v8fVar.g(d2);
                        hashSet4.add(d2);
                        hashSet4.addAll(((y07) this.c).b(d2));
                    }
                    if (TextUtils.isEmpty(d2)) {
                        new Handler(Looper.getMainLooper()).post(new d(v8fVar));
                    } else if (!TextUtils.isEmpty(d2)) {
                        ((HashSet) this.f31300a).add(d2);
                        v8fVar.g(d2);
                    }
                }
            }
        }
        if (e.g(eVar) && e.h(eVar) != null) {
            Iterator it = ((HashSet) this.f31300a).iterator();
            while (it.hasNext()) {
                ucqVar.a((String) it.next(), e.h(eVar));
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator it2 = ((HashSet) this.f31300a).iterator();
        while (it2.hasNext()) {
            String str = (String) it2.next();
            if (((y07) this.c).b(str) != null && ((y07) this.c).b(str).size() > 0) {
                arrayList.addAll(((y07) this.c).b(str));
            }
        }
        this.f31300a.addAll(arrayList);
        Iterator it3 = ((HashSet) this.f31300a).iterator();
        while (it3.hasNext()) {
            if (((qcq) d62.a(qcq.class, new Object[0])).a((String) it3.next()) == null) {
                it3.remove();
            }
        }
    }
}
