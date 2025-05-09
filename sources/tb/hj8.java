package tb;

import android.os.Looper;
import android.util.Log;
import de.greenrobot.event.EventBusException;
import de.greenrobot.event.ThreadMode;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class hj8 {
    public static volatile hj8 p;
    public static final ij8 q = new ij8();
    public static final Map<Class<?>, List<Class<?>>> r = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    public final Map<Class<?>, CopyOnWriteArrayList<gwq>> f20678a;
    public final Map<Object, List<Class<?>>> b;
    public final Map<Class<?>, Object> c;
    public final ThreadLocal<c> d;
    public final psa e;
    public final fo1 f;
    public final ne1 g;
    public final fwq h;
    public final ExecutorService i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final boolean o;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public class a extends ThreadLocal<c> {
        public a(hj8 hj8Var) {
        }

        /* renamed from: a */
        public c initialValue() {
            return new c();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f20679a;

        static {
            int[] iArr = new int[ThreadMode.values().length];
            f20679a = iArr;
            try {
                iArr[ThreadMode.PostThread.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20679a[ThreadMode.MainThread.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20679a[ThreadMode.BackgroundThread.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f20679a[ThreadMode.Async.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final List<Object> f20680a = new ArrayList();
        public boolean b;
        public boolean c;
        public Object d;
    }

    public hj8() {
        this(q);
    }

    public static void a(List<Class<?>> list, Class<?>[] clsArr) {
        for (Class<?> cls : clsArr) {
            if (!list.contains(cls)) {
                list.add(cls);
                a(list, cls.getInterfaces());
            }
        }
    }

    public static ij8 b() {
        return new ij8();
    }

    public static hj8 d() {
        if (p == null) {
            synchronized (hj8.class) {
                try {
                    if (p == null) {
                        p = new hj8();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return p;
    }

    public final void c(gwq gwqVar, Object obj) {
        boolean z;
        if (obj != null) {
            if (Looper.getMainLooper() == Looper.myLooper()) {
                z = true;
            } else {
                z = false;
            }
            n(gwqVar, obj, z);
        }
    }

    public ExecutorService e() {
        return this.i;
    }

    public final void f(gwq gwqVar, Object obj, Throwable th) {
        boolean z = obj instanceof dwq;
        boolean z2 = this.k;
        if (z) {
            if (z2) {
                Log.e(pg1.ATOM_EXT_Event, "SubscriberExceptionEvent subscriber " + gwqVar.f20273a.getClass() + " threw an exception", th);
                dwq dwqVar = (dwq) obj;
                Log.e(pg1.ATOM_EXT_Event, "Initial event " + dwqVar.b + " caused exception in " + dwqVar.c, dwqVar.f18115a);
            }
        } else if (!this.j) {
            if (z2) {
                Log.e(pg1.ATOM_EXT_Event, "Could not dispatch event: " + obj.getClass() + " to subscribing class " + gwqVar.f20273a.getClass(), th);
            }
            if (this.m) {
                k(new dwq(this, th, obj, gwqVar.f20273a));
            }
        } else {
            throw new EventBusException("Invoking subscriber failed", th);
        }
    }

    public void g(fwl fwlVar) {
        Object obj = fwlVar.f19580a;
        gwq gwqVar = fwlVar.b;
        fwl.b(fwlVar);
        if (gwqVar.d) {
            h(gwqVar, obj);
        }
    }

    public void h(gwq gwqVar, Object obj) {
        try {
            gwqVar.b.f18854a.invoke(gwqVar.f20273a, obj);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException("Unexpected exception", e);
        } catch (InvocationTargetException e2) {
            f(gwqVar, obj, e2.getCause());
        }
    }

    public synchronized boolean i(Object obj) {
        return ((HashMap) this.b).containsKey(obj);
    }

    public final List<Class<?>> j(Class<?> cls) {
        ArrayList arrayList;
        Map<Class<?>, List<Class<?>>> map = r;
        synchronized (map) {
            try {
                List<Class<?>> list = (List) ((HashMap) map).get(cls);
                arrayList = list;
                if (list == null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (Class<?> cls2 = cls; cls2 != null; cls2 = cls2.getSuperclass()) {
                        arrayList2.add(cls2);
                        a(arrayList2, cls2.getInterfaces());
                    }
                    ((HashMap) r).put(cls, arrayList2);
                    arrayList = arrayList2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return arrayList;
    }

    public void k(Object obj) {
        boolean z;
        c cVar = this.d.get();
        ArrayList arrayList = (ArrayList) cVar.f20680a;
        arrayList.add(obj);
        if (!cVar.b) {
            if (Looper.getMainLooper() == Looper.myLooper()) {
                z = true;
            } else {
                z = false;
            }
            cVar.c = z;
            cVar.b = true;
            while (!arrayList.isEmpty()) {
                try {
                    l(arrayList.remove(0), cVar);
                } finally {
                    cVar.b = false;
                    cVar.c = false;
                }
            }
        }
    }

    public final void l(Object obj, c cVar) throws Error {
        boolean z;
        Class<?> cls = obj.getClass();
        if (this.o) {
            List<Class<?>> j = j(cls);
            int size = j.size();
            z = false;
            for (int i = 0; i < size; i++) {
                z |= m(obj, cVar, j.get(i));
            }
        } else {
            z = m(obj, cVar, cls);
        }
        if (!z) {
            if (this.l) {
                cls.toString();
            }
            if (!(!this.n || cls == m4k.class || cls == dwq.class)) {
                k(new m4k(this, obj));
            }
        }
    }

    public final boolean m(Object obj, c cVar, Class<?> cls) {
        CopyOnWriteArrayList copyOnWriteArrayList;
        synchronized (this) {
            copyOnWriteArrayList = (CopyOnWriteArrayList) ((HashMap) this.f20678a).get(cls);
        }
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            cVar.d = obj;
            n((gwq) it.next(), obj, cVar.c);
        }
        return true;
    }

    public final void n(gwq gwqVar, Object obj, boolean z) {
        int i = b.f20679a[gwqVar.b.b.ordinal()];
        if (i == 1) {
            h(gwqVar, obj);
        } else if (i != 2) {
            if (i != 3) {
                if (i == 4) {
                    this.g.a(gwqVar, obj);
                    return;
                }
                throw new IllegalStateException("Unknown thread mode: " + gwqVar.b.b);
            } else if (z) {
                this.f.a(gwqVar, obj);
            } else {
                h(gwqVar, obj);
            }
        } else if (z) {
            h(gwqVar, obj);
        } else {
            this.e.a(gwqVar, obj);
        }
    }

    public void o(Object obj) {
        q(obj, false, 0);
    }

    public void p(Object obj, int i) {
        q(obj, false, i);
    }

    public final synchronized void q(Object obj, boolean z, int i) {
        for (ewq ewqVar : this.h.b(obj.getClass())) {
            r(obj, ewqVar, z, i);
        }
    }

    public final void r(Object obj, ewq ewqVar, boolean z, int i) {
        Class<?> cls = ewqVar.c;
        HashMap hashMap = (HashMap) this.f20678a;
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) hashMap.get(cls);
        gwq gwqVar = new gwq(obj, ewqVar, i);
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList();
            hashMap.put(cls, copyOnWriteArrayList);
        } else if (copyOnWriteArrayList.contains(gwqVar)) {
            throw new EventBusException("Subscriber " + obj.getClass() + " already registered to event " + cls);
        }
        int size = copyOnWriteArrayList.size();
        for (int i2 = 0; i2 <= size; i2++) {
            if (i2 != size) {
                if (gwqVar.c <= ((gwq) copyOnWriteArrayList.get(i2)).c) {
                }
            }
            copyOnWriteArrayList.add(i2, gwqVar);
            break;
        }
        HashMap hashMap2 = (HashMap) this.b;
        List list = (List) hashMap2.get(obj);
        if (list == null) {
            list = new ArrayList();
            hashMap2.put(obj, list);
        }
        list.add(cls);
        if (z) {
            Map<Class<?>, Object> map = this.c;
            if (this.o) {
                for (Map.Entry entry : ((ConcurrentHashMap) map).entrySet()) {
                    if (cls.isAssignableFrom((Class) entry.getKey())) {
                        c(gwqVar, entry.getValue());
                    }
                }
                return;
            }
            c(gwqVar, ((ConcurrentHashMap) map).get(cls));
        }
    }

    public synchronized void s(Object obj) {
        try {
            List<Class<?>> list = (List) ((HashMap) this.b).get(obj);
            if (list != null) {
                for (Class<?> cls : list) {
                    t(obj, cls);
                }
                ((HashMap) this.b).remove(obj);
            } else {
                obj.getClass().toString();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void t(Object obj, Class<?> cls) {
        List list = (List) ((HashMap) this.f20678a).get(cls);
        if (list != null) {
            int size = list.size();
            int i = 0;
            while (i < size) {
                gwq gwqVar = (gwq) list.get(i);
                if (gwqVar.f20273a == obj) {
                    gwqVar.d = false;
                    list.remove(i);
                    i--;
                    size--;
                }
                i++;
            }
        }
    }

    public hj8(ij8 ij8Var) {
        this.d = new a(this);
        this.f20678a = new HashMap();
        this.b = new HashMap();
        this.c = new ConcurrentHashMap();
        this.e = new psa(this, Looper.getMainLooper(), 10);
        this.f = new fo1(this);
        this.g = new ne1(this);
        ij8Var.getClass();
        this.h = new fwq(null);
        this.k = ij8Var.f21342a;
        this.l = ij8Var.b;
        this.m = true;
        this.n = true;
        this.j = ij8Var.c;
        this.o = true;
        this.i = ij8Var.d;
    }
}
