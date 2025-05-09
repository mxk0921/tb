package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.executor.ExecutorType;
import com.taobao.themis.kernel.executor.IExecutorService;
import com.taobao.themis.kernel.launcher.launcher_ng.TMSLaunchTaskType;
import com.taobao.themis.kernel.utils.CommonExtKt;
import com.taobao.themis.kernel.utils.TMSAssertUtils;
import com.taobao.themis.kernel.utils.TMSInstanceExtKt;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import tb.jbs;
import tb.mwd;
import tb.pwd;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class kbs {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final jbs f22549a;
    public final pwd.a b;
    public final bbs c;
    public final ConcurrentHashMap<Class<? extends mwd>, mwd> d = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<Class<? extends mwd>, CopyOnWriteArraySet<Class<? extends mwd>>> e = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<Class<? extends mwd>, AtomicInteger> f = new ConcurrentHashMap<>();
    public final b<Class<? extends mwd>> g = new b<>();
    public final AtomicReference<jbs.a> h = new AtomicReference<>(jbs.a.e(jbs.a.Companion.d()));

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        static {
            t2o.a(839909734);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class b<E> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final ConcurrentHashMap<E, Boolean> f22550a = new ConcurrentHashMap<>();

        static {
            t2o.a(839909735);
        }

        public final boolean a(E e) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("ba2da88", new Object[]{this, e})).booleanValue();
            }
            ckf.g(e, "element");
            if (this.f22550a.putIfAbsent(e, Boolean.TRUE) == null) {
                return true;
            }
            return false;
        }

        public final boolean b(E e) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("b06c8586", new Object[]{this, e})).booleanValue();
            }
            ckf.g(e, "element");
            return this.f22550a.containsKey(e);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ mwd f22551a;
        public final /* synthetic */ kbs b;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
        public static final class a implements mwd.a {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ kbs f22552a;
            public final /* synthetic */ mwd b;

            public a(kbs kbsVar, mwd mwdVar) {
                this.f22552a = kbsVar;
                this.b = mwdVar;
            }

            @Override // tb.mwd.a
            public void a(int i, eas easVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("b9f6bd85", new Object[]{this, new Integer(i), easVar});
                    return;
                }
                ckf.g(easVar, "error");
                kbs.c(this.f22552a, this.b, i, easVar);
            }

            @Override // tb.mwd.a
            public void onSuccess() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("d0e393ab", new Object[]{this});
                } else {
                    kbs.d(this.f22552a, this.b);
                }
            }
        }

        public c(mwd mwdVar, kbs kbsVar) {
            this.f22551a = mwdVar;
            this.b = kbsVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            mcs.e(nwd.a(this.f22551a), mcs.EVENT_ON_EXECUTE, ncs.d(kbs.b(this.b)), kbs.a(this.b).m(), new JSONObject());
            this.f22551a.c(kbs.a(this.b), new a(this.b, this.f22551a));
        }
    }

    static {
        t2o.a(839909733);
    }

    public kbs(jbs jbsVar, Set<? extends mwd> set, pwd.a aVar) {
        CopyOnWriteArraySet<Class<? extends mwd>> putIfAbsent;
        ckf.g(jbsVar, "launchRuntime");
        ckf.g(set, "initTasks");
        ckf.g(aVar, "launcherListener");
        this.f22549a = jbsVar;
        this.b = aVar;
        this.c = jbsVar.getInstance();
        for (mwd mwdVar : set) {
            this.d.put(e(mwdVar), mwdVar);
            for (Class<? extends mwd> cls : mwdVar.b()) {
                ConcurrentHashMap<Class<? extends mwd>, CopyOnWriteArraySet<Class<? extends mwd>>> concurrentHashMap = this.e;
                CopyOnWriteArraySet<Class<? extends mwd>> copyOnWriteArraySet = concurrentHashMap.get(cls);
                if (copyOnWriteArraySet == null && (putIfAbsent = concurrentHashMap.putIfAbsent(cls, (copyOnWriteArraySet = new CopyOnWriteArraySet<>()))) != null) {
                    copyOnWriteArraySet = putIfAbsent;
                }
                copyOnWriteArraySet.add(e(mwdVar));
                this.f.put(e(mwdVar), new AtomicInteger(mwdVar.b().size()));
            }
        }
        String d = ncs.d(this.c);
        String m = this.f22549a.m();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "url", this.c.e0());
        jSONObject.put((JSONObject) "instanceId", this.c.Q());
        jSONObject.put((JSONObject) "class", JSONObject.class.getSimpleName());
        xhv xhvVar = xhv.INSTANCE;
        mcs.e(mcs.MODULE_LAUNCH, mcs.EVENT_ON_INIT, d, m, jSONObject);
    }

    public static final /* synthetic */ jbs a(kbs kbsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jbs) ipChange.ipc$dispatch("e0527cf7", new Object[]{kbsVar});
        }
        return kbsVar.f22549a;
    }

    public static final /* synthetic */ bbs b(kbs kbsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bbs) ipChange.ipc$dispatch("7864be3c", new Object[]{kbsVar});
        }
        return kbsVar.c;
    }

    public static final /* synthetic */ void c(kbs kbsVar, mwd mwdVar, int i, eas easVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("189b3742", new Object[]{kbsVar, mwdVar, new Integer(i), easVar});
        } else {
            kbsVar.f(mwdVar, i, easVar);
        }
    }

    public static final /* synthetic */ void d(kbs kbsVar, mwd mwdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fad3275", new Object[]{kbsVar, mwdVar});
        } else {
            kbsVar.g(mwdVar);
        }
    }

    public final Class<? extends mwd> e(mwd mwdVar) {
        Class<? extends mwd> cls;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("4c4c96a6", new Object[]{this, mwdVar});
        }
        TMSLaunchTaskType tMSLaunchTaskType = (TMSLaunchTaskType) mwdVar.getClass().getAnnotation(TMSLaunchTaskType.class);
        if (tMSLaunchTaskType == null) {
            cls = null;
        } else {
            cls = tMSLaunchTaskType.superTask();
        }
        if (cls == null) {
            return mwdVar.getClass();
        }
        return cls;
    }

    public final void f(mwd mwdVar, int i, eas easVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c545e8cb", new Object[]{this, mwdVar, new Integer(i), easVar});
            return;
        }
        jjc a2 = ibs.a(this.b.b(mwdVar, this.f22549a, i));
        if (a2 != null) {
            if (a2.b()) {
                k(jbs.a.Companion.b());
                String d = ncs.d(this.c);
                String m = this.f22549a.m();
                String str = easVar.f18428a;
                ckf.f(str, "error.errorCode");
                String str2 = easVar.b;
                ckf.f(str2, "error.errorMsg");
                mcs.a(mcs.MODULE_LAUNCH, mcs.EVENT_ON_ERROR, d, m, str, str2, null);
            }
            a2.a(this.f22549a);
            String a3 = nwd.a(mwdVar);
            String d2 = ncs.d(this.c);
            String m2 = this.f22549a.m();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put((JSONObject) "errorCode", easVar.f18428a);
            jSONObject.put((JSONObject) "errorMsg", easVar.b);
            xhv xhvVar = xhv.INSTANCE;
            mcs.c(a3, mcs.EVENT_ON_ERROR, d2, m2, jSONObject);
        }
    }

    public final void g(mwd mwdVar) {
        boolean z;
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb01ea3e", new Object[]{this, mwdVar});
            return;
        }
        IpChange ipChange2 = TMSAssertUtils.$ipChange;
        mcs.e(nwd.a(mwdVar), mcs.EVENT_ON_SUCCESS, ncs.d(this.c), this.f22549a.m(), new JSONObject());
        jbs.a aVar = this.h.get();
        jbs.a.C0954a aVar2 = jbs.a.Companion;
        int d = aVar2.d();
        if (aVar == null) {
            z = false;
        } else {
            z = jbs.a.h(aVar.k(), d);
        }
        if (z && this.f22549a.getInstance().K() != null) {
            k(aVar2.a());
        }
        this.g.a(e(mwdVar));
        this.b.a(mwdVar, this.f22549a);
        CopyOnWriteArraySet<Class<? extends mwd>> copyOnWriteArraySet = this.e.get(e(mwdVar));
        if (copyOnWriteArraySet != null) {
            Iterator<T> it = copyOnWriteArraySet.iterator();
            while (it.hasNext()) {
                Class cls = (Class) it.next();
                IpChange ipChange3 = TMSAssertUtils.$ipChange;
                AtomicInteger atomicInteger = this.f.get(cls);
                if (atomicInteger == null) {
                    i = 0;
                } else {
                    i = atomicInteger.decrementAndGet();
                }
                mwd mwdVar2 = this.d.get(cls);
                if (mwdVar2 != null && i == 0 && mwdVar2.a().contains(this.h.get())) {
                    j(mwdVar2);
                }
            }
        }
    }

    public final boolean h(Class<? extends mwd> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("392566d7", new Object[]{this, cls})).booleanValue();
        }
        AtomicInteger atomicInteger = this.f.get(cls);
        if (atomicInteger == null || atomicInteger.get() == 0) {
            return true;
        }
        return false;
    }

    public final void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
            return;
        }
        mcs.e(mcs.MODULE_LAUNCH, mcs.EVENT_ON_START, ncs.d(this.c), this.f22549a.m(), new JSONObject());
        for (Map.Entry<Class<? extends mwd>, mwd> entry : this.d.entrySet()) {
            Class<? extends mwd> key = entry.getKey();
            mwd value = entry.getValue();
            if (value.a().contains(this.h.get()) && h(key)) {
                j(value);
            }
        }
    }

    public final void j(mwd mwdVar) {
        Executor executor;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa7812c0", new Object[]{this, mwdVar});
            return;
        }
        c cVar = new c(mwdVar, this);
        if (mwdVar.d() == ExecutorType.UI) {
            CommonExtKt.k(cVar);
            return;
        }
        IExecutorService iExecutorService = (IExecutorService) p8s.b(IExecutorService.class);
        if (iExecutorService != null && (executor = iExecutorService.getExecutor(mwdVar.d())) != null) {
            executor.execute(cVar);
        }
    }

    public final void k(int i) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17d4b6ac", new Object[]{this, new Integer(i)});
            return;
        }
        this.h.set(jbs.a.e(i));
        for (Map.Entry<Class<? extends mwd>, mwd> entry : this.d.entrySet()) {
            Class<? extends mwd> key = entry.getKey();
            mwd value = entry.getValue();
            if (!this.g.b(key) && value.a().contains(jbs.a.e(i)) && h(key)) {
                j(value);
            }
        }
        jbs.a.C0954a aVar = jbs.a.Companion;
        if (jbs.a.h(i, aVar.c())) {
            String d = ncs.d(this.c);
            String m = this.f22549a.m();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put((JSONObject) "solution", this.c.a0().name());
            jSONObject.put((JSONObject) "appName", r8s.f(this.c));
            if (TMSInstanceExtKt.r(this.c)) {
                str = this.c.L();
            } else {
                str = this.c.d0();
            }
            jSONObject.put((JSONObject) "appId", str);
            xhv xhvVar = xhv.INSTANCE;
            mcs.e(mcs.MODULE_LAUNCH, mcs.EVENT_ON_FINISH, d, m, jSONObject);
            return;
        }
        jbs.a.h(i, aVar.b());
    }
}
