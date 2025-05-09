package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class tpv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicBoolean f28862a = new AtomicBoolean(false);
    public static final List<Runnable> b = new CopyOnWriteArrayList();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f28863a;
        public final /* synthetic */ String b;
        public final /* synthetic */ Object c;
        public final /* synthetic */ String[] d;

        public a(String str, String str2, Object obj, String[] strArr) {
            this.f28863a = str;
            this.b = str2;
            this.c = obj;
            this.d = strArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                cqv.l(this.f28863a, this.b, this.c, this.d);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f28864a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ Object d;
        public final /* synthetic */ String[] e;

        public b(String str, String str2, String str3, Object obj, String[] strArr) {
            this.f28864a = str;
            this.b = str2;
            this.c = str3;
            this.d = obj;
            this.e = strArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                cqv.o(this.f28864a, this.b, this.c, this.d, this.e);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f28865a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ String[] d;

        public c(String str, String str2, String str3, String[] strArr) {
            this.f28865a = str;
            this.b = str2;
            this.c = str3;
            this.d = strArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                cqv.q(this.f28865a, this.b, this.c, this.d);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f28866a;
        public final /* synthetic */ String b;
        public final /* synthetic */ float c;
        public final /* synthetic */ float d;
        public final /* synthetic */ List e;
        public final /* synthetic */ Map f;

        public d(String str, String str2, float f, float f2, List list, Map map) {
            this.f28866a = str;
            this.b = str2;
            this.c = f;
            this.d = f2;
            this.e = list;
            this.f = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                cqv.H(this.f28866a, this.b, this.c, this.d, this.e, this.f);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f28867a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ Map d;
        public final /* synthetic */ String[] e;

        public e(String str, String str2, String str3, Map map, String[] strArr) {
            this.f28867a = str;
            this.b = str2;
            this.c = str3;
            this.d = map;
            this.e = strArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                cqv.p(this.f28867a, this.b, this.c, this.d, this.e);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class f implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f28868a;
        public final /* synthetic */ String b;
        public final /* synthetic */ float c;
        public final /* synthetic */ float d;
        public final /* synthetic */ List e;
        public final /* synthetic */ Map f;

        public f(String str, String str2, float f, float f2, List list, Map map) {
            this.f28868a = str;
            this.b = str2;
            this.c = f;
            this.d = f2;
            this.e = list;
            this.f = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                cqv.L(this.f28868a, this.b, this.c, this.d, this.e, this.f);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class g implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f28869a;
        public final /* synthetic */ String b;
        public final /* synthetic */ float c;
        public final /* synthetic */ float d;
        public final /* synthetic */ List e;
        public final /* synthetic */ Map f;

        public g(String str, String str2, float f, float f2, List list, Map map) {
            this.f28869a = str;
            this.b = str2;
            this.c = f;
            this.d = f2;
            this.e = list;
            this.f = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                cqv.D(this.f28869a, this.b, this.c, this.d, this.e, this.f);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class h implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f28870a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ View d;
        public final /* synthetic */ String[] e;

        public h(String str, String str2, String str3, View view, String[] strArr) {
            this.f28870a = str;
            this.b = str2;
            this.c = str3;
            this.d = view;
            this.e = strArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                cqv.C(this.f28870a, this.b, this.c, this.d, this.e);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class i implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f28871a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ View d;
        public final /* synthetic */ Map e;
        public final /* synthetic */ String[] f;

        public i(String str, String str2, String str3, View view, Map map, String[] strArr) {
            this.f28871a = str;
            this.b = str2;
            this.c = str3;
            this.d = view;
            this.e = map;
            this.f = strArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                cqv.B(this.f28871a, this.b, this.c, this.d, this.e, this.f);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class j implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f28872a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ View d;
        public final /* synthetic */ Map e;
        public final /* synthetic */ String[] f;

        public j(String str, String str2, String str3, View view, Map map, String[] strArr) {
            this.f28872a = str;
            this.b = str2;
            this.c = str3;
            this.d = view;
            this.e = map;
            this.f = strArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                cqv.z(this.f28872a, this.b, this.c, this.d, this.e, this.f);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class k implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f28873a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ View d;
        public final /* synthetic */ String[] e;

        public k(String str, String str2, String str3, View view, String[] strArr) {
            this.f28873a = str;
            this.b = str2;
            this.c = str3;
            this.d = view;
            this.e = strArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                cqv.A(this.f28873a, this.b, this.c, this.d, this.e);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class l implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f28874a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ String[] d;

        public l(String str, String str2, String str3, String[] strArr) {
            this.f28874a = str;
            this.b = str2;
            this.c = str3;
            this.d = strArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                cqv.s(this.f28874a, this.b, this.c, this.d);
            }
        }
    }

    static {
        t2o.a(729809294);
    }

    public static void a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b23899bc", new Object[]{runnable});
        } else if (!vxl.b().n()) {
            runnable.run();
        } else if (!f28862a.get()) {
            ((CopyOnWriteArrayList) b).add(runnable);
        } else {
            runnable.run();
        }
    }

    public static void b(String str, String str2, Object obj, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c564b847", new Object[]{str, str2, obj, strArr});
        } else {
            a(n(str, str2, obj, strArr));
        }
    }

    public static void c(String str, String str2, String str3, Object obj, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ceb1ffe", new Object[]{str, str2, str3, obj, strArr});
        } else {
            a(o(str, str2, str3, obj, strArr));
        }
    }

    public static void d(String str, String str2, String str3, Map<String, String> map, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd7fba59", new Object[]{str, str2, str3, map, strArr});
        } else {
            a(p(str, str2, str3, map, strArr));
        }
    }

    public static void e(String str, String str2, String str3, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5efb220", new Object[]{str, str2, str3, strArr});
        } else {
            a(q(str, str2, str3, strArr));
        }
    }

    public static void f(String str, String str2, String str3, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce026f82", new Object[]{str, str2, str3, strArr});
        } else {
            a(r(str, str2, str3, strArr));
        }
    }

    public static void g(String str, String str2, float f2, float f3, List<rm1> list, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("664eee42", new Object[]{str, str2, new Float(f2), new Float(f3), list, map});
        } else {
            a(new g(str, str2, f2, f3, list, map));
        }
    }

    public static void h(String str, String str2, float f2, float f3, List<rm1> list, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8ba419b", new Object[]{str, str2, new Float(f2), new Float(f3), list, map});
        } else {
            a(new d(str, str2, f2, f3, list, map));
        }
    }

    public static void i(String str, String str2, float f2, float f3, List<rm1> list, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e43afb", new Object[]{str, str2, new Float(f2), new Float(f3), list, map});
        } else {
            a(new f(str, str2, f2, f3, list, map));
        }
    }

    public static Runnable j(String str, String str2, String str3, View view, Map<String, String> map, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Runnable) ipChange.ipc$dispatch("bafb33f4", new Object[]{str, str2, str3, view, map, strArr});
        }
        return new j(str, str2, str3, view, map, strArr);
    }

    public static Runnable k(String str, String str2, String str3, View view, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Runnable) ipChange.ipc$dispatch("524c173b", new Object[]{str, str2, str3, view, strArr});
        }
        return new k(str, str2, str3, view, strArr);
    }

    public static Runnable l(String str, String str2, String str3, View view, Map<String, String> map, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Runnable) ipChange.ipc$dispatch("e80466a", new Object[]{str, str2, str3, view, map, strArr});
        }
        return new i(str, str2, str3, view, map, strArr);
    }

    public static Runnable m(String str, String str2, String str3, View view, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Runnable) ipChange.ipc$dispatch("266f2785", new Object[]{str, str2, str3, view, strArr});
        }
        return new h(str, str2, str3, view, strArr);
    }

    public static Runnable n(String str, String str2, Object obj, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Runnable) ipChange.ipc$dispatch("9a6efe9e", new Object[]{str, str2, obj, strArr});
        }
        return new a(str, str2, obj, strArr);
    }

    public static Runnable o(String str, String str2, String str3, Object obj, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Runnable) ipChange.ipc$dispatch("e1f5b807", new Object[]{str, str2, str3, obj, strArr});
        }
        return new b(str, str2, str3, obj, strArr);
    }

    public static Runnable p(String str, String str2, String str3, Map<String, String> map, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Runnable) ipChange.ipc$dispatch("a6073e20", new Object[]{str, str2, str3, map, strArr});
        }
        return new e(str, str2, str3, map, strArr);
    }

    public static Runnable q(String str, String str2, String str3, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Runnable) ipChange.ipc$dispatch("1c2a7a8f", new Object[]{str, str2, str3, strArr});
        }
        return new c(str, str2, str3, strArr);
    }

    public static Runnable r(String str, String str2, String str3, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Runnable) ipChange.ipc$dispatch("7285bf83", new Object[]{str, str2, str3, strArr});
        }
        return new l(str, str2, str3, strArr);
    }

    public static boolean s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("69c916a5", new Object[0])).booleanValue();
        }
        if (!vxl.b().n() || !f28862a.compareAndSet(false, true)) {
            return false;
        }
        Iterator it = ((CopyOnWriteArrayList) b).iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        ((CopyOnWriteArrayList) b).clear();
        return true;
    }

    public static void t(String str, String str2, String str3, View view, Map<String, String> map, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e7a4107", new Object[]{str, str2, str3, view, map, strArr});
        } else {
            a(j(str, str2, str3, view, map, strArr));
        }
    }

    public static void u(String str, String str2, String str3, View view, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("761a6532", new Object[]{str, str2, str3, view, strArr});
        } else {
            a(k(str, str2, str3, view, strArr));
        }
    }

    public static void v(String str, String str2, String str3, View view, Map<String, String> map, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d71aa0f", new Object[]{str, str2, str3, view, map, strArr});
        } else {
            a(l(str, str2, str3, view, map, strArr));
        }
    }

    public static void w(String str, String str2, String str3, View view, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9af0d2a", new Object[]{str, str2, str3, view, strArr});
        } else {
            a(m(str, str2, str3, view, strArr));
        }
    }
}
