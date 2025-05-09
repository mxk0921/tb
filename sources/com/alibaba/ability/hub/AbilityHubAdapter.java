package com.alibaba.ability.hub;

import com.alibaba.ability.MegaUtils;
import com.alibaba.ability.env.PerfTracer;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.ability.result.FinishResult;
import com.alibaba.ability.result.InternalResult;
import com.alibaba.ability.utils.MegaTrace;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.monitor.MUSMonitor;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.jvm.internal.Ref$ObjectRef;
import tb.a07;
import tb.aui;
import tb.c2f;
import tb.ckf;
import tb.cu;
import tb.er;
import tb.hdb;
import tb.idb;
import tb.iih;
import tb.kdb;
import tb.ldb;
import tb.ndb;
import tb.njg;
import tb.s2d;
import tb.slo;
import tb.sm8;
import tb.t2o;
import tb.yti;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class AbilityHubAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    public static final ReentrantReadWriteLock i = new ReentrantReadWriteLock();
    public static final Map<String, Map<String, hdb>> j = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    public final String f1878a;
    public final boolean b;
    public final Map<String, hdb> c;
    public final ConcurrentHashMap<String, PerfTracer> d;
    public boolean e;
    public final AtomicBoolean f;
    public final njg g;
    public final ldb h;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class a {
        static {
            t2o.a(144703536);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ kdb d;
        public final /* synthetic */ Map e;
        public final /* synthetic */ s2d f;
        public final /* synthetic */ idb g;
        public final /* synthetic */ int h;

        public c(String str, String str2, kdb kdbVar, Map map, s2d s2dVar, idb idbVar, int i) {
            this.b = str;
            this.c = str2;
            this.d = kdbVar;
            this.e = map;
            this.f = s2dVar;
            this.g = idbVar;
            this.h = i;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                this.f.onCallback(AbilityHubAdapter.i(AbilityHubAdapter.this, this.b, this.c, this.d, this.e, this.f, this.g, this.h));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ kdb d;
        public final /* synthetic */ Map e;
        public final /* synthetic */ s2d f;
        public final /* synthetic */ idb g;
        public final /* synthetic */ int h;

        public d(String str, String str2, kdb kdbVar, Map map, s2d s2dVar, idb idbVar, int i) {
            this.b = str;
            this.c = str2;
            this.d = kdbVar;
            this.e = map;
            this.f = s2dVar;
            this.g = idbVar;
            this.h = i;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                this.f.onCallback(AbilityHubAdapter.i(AbilityHubAdapter.this, this.b, this.c, this.d, this.e, this.f, this.g, this.h));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ kdb d;
        public final /* synthetic */ Map e;
        public final /* synthetic */ s2d f;
        public final /* synthetic */ idb g;
        public final /* synthetic */ int h;

        public e(String str, String str2, kdb kdbVar, Map map, s2d s2dVar, idb idbVar, int i) {
            this.b = str;
            this.c = str2;
            this.d = kdbVar;
            this.e = map;
            this.f = s2dVar;
            this.g = idbVar;
            this.h = i;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                this.f.onCallback(AbilityHubAdapter.i(AbilityHubAdapter.this, this.b, this.c, this.d, this.e, this.f, this.g, this.h));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class f implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ kdb d;
        public final /* synthetic */ Map e;
        public final /* synthetic */ s2d f;
        public final /* synthetic */ idb g;
        public final /* synthetic */ int h;

        public f(String str, String str2, kdb kdbVar, Map map, s2d s2dVar, idb idbVar, int i) {
            this.b = str;
            this.c = str2;
            this.d = kdbVar;
            this.e = map;
            this.f = s2dVar;
            this.g = idbVar;
            this.h = i;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                this.f.onCallback(AbilityHubAdapter.i(AbilityHubAdapter.this, this.b, this.c, this.d, this.e, this.f, this.g, this.h));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class g implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ Map b;

        public g(Map map) {
            this.b = map;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            for (hdb hdbVar : this.b.values()) {
                if (hdbVar instanceof cu) {
                    ((cu) hdbVar).onDestroy();
                }
            }
            iih.INSTANCE.b(AbilityHubAdapter.f(AbilityHubAdapter.this), "AbilityHubAdapter 销毁，释放能力缓存资源");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class h implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ Ref$ObjectRef b;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;
        public final /* synthetic */ kdb e;
        public final /* synthetic */ Map f;
        public final /* synthetic */ s2d g;
        public final /* synthetic */ idb h;
        public final /* synthetic */ int i;
        public final /* synthetic */ CountDownLatch j;

        public h(Ref$ObjectRef ref$ObjectRef, String str, String str2, kdb kdbVar, Map map, s2d s2dVar, idb idbVar, int i, CountDownLatch countDownLatch) {
            this.b = ref$ObjectRef;
            this.c = str;
            this.d = str2;
            this.e = kdbVar;
            this.f = map;
            this.g = s2dVar;
            this.h = idbVar;
            this.i = i;
            this.j = countDownLatch;
        }

        /* JADX WARN: Type inference failed for: r1v2, types: [com.alibaba.ability.result.ExecuteResult, T] */
        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            this.b.element = AbilityHubAdapter.i(AbilityHubAdapter.this, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
            this.j.countDown();
        }
    }

    static {
        t2o.a(144703535);
    }

    public AbilityHubAdapter(ldb ldbVar) {
        ckf.g(ldbVar, "env");
        this.h = ldbVar;
        this.f1878a = "AbilityHubAdapter";
        this.b = true;
        this.c = new LinkedHashMap();
        this.d = new ConcurrentHashMap<>();
        this.f = new AtomicBoolean(false);
        this.g = kotlin.a.b(AbilityHubAdapter$customCache$2.INSTANCE);
        c2f.a();
    }

    public static final /* synthetic */ FinishResult a(AbilityHubAdapter abilityHubAdapter, String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FinishResult) ipChange.ipc$dispatch("80e46d9b", new Object[]{abilityHubAdapter, str, str2, new Boolean(z)});
        }
        return abilityHubAdapter.m(str, str2, z);
    }

    public static final /* synthetic */ AtomicBoolean b(AbilityHubAdapter abilityHubAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicBoolean) ipChange.ipc$dispatch("733a9f07", new Object[]{abilityHubAdapter});
        }
        return abilityHubAdapter.f;
    }

    public static final /* synthetic */ hdb c(AbilityHubAdapter abilityHubAdapter, String str, kdb kdbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hdb) ipChange.ipc$dispatch("ab5fdd78", new Object[]{abilityHubAdapter, str, kdbVar});
        }
        return abilityHubAdapter.r(str, kdbVar);
    }

    public static final /* synthetic */ boolean d(AbilityHubAdapter abilityHubAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9f3d570a", new Object[]{abilityHubAdapter})).booleanValue();
        }
        return abilityHubAdapter.b;
    }

    public static final /* synthetic */ hdb e(AbilityHubAdapter abilityHubAdapter, String str, idb idbVar, kdb kdbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hdb) ipChange.ipc$dispatch("3db73339", new Object[]{abilityHubAdapter, str, idbVar, kdbVar});
        }
        return abilityHubAdapter.t(str, idbVar, kdbVar);
    }

    public static final /* synthetic */ String f(AbilityHubAdapter abilityHubAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c15a41ba", new Object[]{abilityHubAdapter});
        }
        return abilityHubAdapter.f1878a;
    }

    public static final /* synthetic */ ConcurrentHashMap g(AbilityHubAdapter abilityHubAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConcurrentHashMap) ipChange.ipc$dispatch("1b33ecf", new Object[]{abilityHubAdapter});
        }
        return abilityHubAdapter.d;
    }

    public static final /* synthetic */ boolean h(AbilityHubAdapter abilityHubAdapter, String str, kdb kdbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("27874258", new Object[]{abilityHubAdapter, str, kdbVar})).booleanValue();
        }
        return abilityHubAdapter.w(str, kdbVar);
    }

    public static final /* synthetic */ ExecuteResult i(AbilityHubAdapter abilityHubAdapter, String str, String str2, kdb kdbVar, Map map, s2d s2dVar, idb idbVar, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("f0fe4d10", new Object[]{abilityHubAdapter, str, str2, kdbVar, map, s2dVar, idbVar, new Integer(i2)});
        }
        return abilityHubAdapter.A(str, str2, kdbVar, map, s2dVar, idbVar, i2);
    }

    public static /* synthetic */ hdb u(AbilityHubAdapter abilityHubAdapter, String str, idb idbVar, kdb kdbVar, int i2, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hdb) ipChange.ipc$dispatch("55f728e7", new Object[]{abilityHubAdapter, str, idbVar, kdbVar, new Integer(i2), obj});
        }
        if ((i2 & 4) != 0) {
            kdbVar = null;
        }
        return abilityHubAdapter.t(str, idbVar, kdbVar);
    }

    public void finalize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a35321a5", new Object[]{this});
            return;
        }
        n();
        super.finalize();
    }

    public final void j(String str, String str2, kdb kdbVar, Map<String, ? extends Object> map, s2d s2dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f13e8f1", new Object[]{this, str, str2, kdbVar, map, s2dVar});
            return;
        }
        ckf.g(str, "name");
        ckf.g(str2, "api");
        ckf.g(kdbVar, "context");
        ckf.g(s2dVar, "callback");
        k(str, str2, kdbVar, map, s2dVar, false);
    }

    public final void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else if (this.f.compareAndSet(false, true)) {
            MegaUtils.z(new g(kotlin.collections.a.r(this.c)), -1L);
        }
    }

    public final int o(idb idbVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e36246d0", new Object[]{this, idbVar, str, str2})).intValue();
        }
        if (idbVar == null) {
            iih iihVar = iih.INSTANCE;
            String str3 = this.f1878a;
            iihVar.b(str3, "builder 为 null，" + str2 + '.' + str + " 线程模式为 any");
            return 2;
        } else if (v(str2, str)) {
            iih iihVar2 = iih.INSTANCE;
            String str4 = this.f1878a;
            iihVar2.b(str4, str2 + '.' + str + " 为主线程白名单能力");
            return 1;
        } else {
            int a2 = idbVar.a(str);
            iih iihVar3 = iih.INSTANCE;
            String str5 = this.f1878a;
            iihVar3.b(str5, str2 + '.' + str + " 线程模式为 " + a2);
            return a2;
        }
    }

    public final idb p(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (idb) ipChange.ipc$dispatch("43703501", new Object[]{this, str});
        }
        ckf.g(str, "name");
        if (!this.e) {
            return er.a().get(str, this.h.getNamespace(), this.h.getBusinessID());
        }
        idb idbVar = er.b().get(str, this.h.getNamespace(), this.h.getBusinessID());
        return idbVar != null ? idbVar : er.a().get(str, this.h.getNamespace(), this.h.getBusinessID());
    }

    public final ConcurrentHashMap<String, Object> q() {
        Object value;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            value = ipChange.ipc$dispatch("aebdcd44", new Object[]{this});
        } else {
            value = this.g.getValue();
        }
        return (ConcurrentHashMap) value;
    }

    public final hdb r(String str, kdb kdbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hdb) ipChange.ipc$dispatch("50398e9f", new Object[]{this, str, kdbVar});
        }
        ReentrantReadWriteLock.ReadLock readLock = i.readLock();
        readLock.lock();
        try {
            return (hdb) ((LinkedHashMap) this.c).get(s(str, kdbVar));
        } finally {
            readLock.unlock();
        }
    }

    public final String s(String str, kdb kdbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5047c57e", new Object[]{this, str, kdbVar});
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("||");
        sb.append(kdbVar != null ? kdbVar.n() : null);
        return sb.toString();
    }

    public final hdb t(String str, idb idbVar, kdb kdbVar) {
        String str2;
        int i2;
        Map map;
        Map map2;
        hdb hdbVar;
        int i3 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hdb) ipChange.ipc$dispatch("b85418de", new Object[]{this, str, idbVar, kdbVar});
        }
        if (this.f.get()) {
            return null;
        }
        String s = s(str, kdbVar);
        ReentrantReadWriteLock reentrantReadWriteLock = i;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        readLock.lock();
        try {
            hdb hdbVar2 = (hdb) ((LinkedHashMap) this.c).get(s);
            if (hdbVar2 != null) {
                return hdbVar2;
            }
            if (idbVar == null) {
                idbVar = p(str);
            }
            if (idbVar == null) {
                return null;
            }
            if (idbVar.c() == 4) {
                return idbVar.build();
            }
            int c2 = idbVar.c();
            if (c2 == 1) {
                str2 = "";
            } else if (c2 != 2) {
                str2 = null;
            } else {
                str2 = this.h.getNamespace();
            }
            if (!(str2 == null || (map2 = (Map) ((HashMap) j).get(str2)) == null || (hdbVar = (hdb) map2.get(str)) == null)) {
                return hdbVar;
            }
            ReentrantReadWriteLock.ReadLock readLock2 = reentrantReadWriteLock.readLock();
            if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
                i2 = reentrantReadWriteLock.getReadHoldCount();
            } else {
                i2 = 0;
            }
            for (int i4 = 0; i4 < i2; i4++) {
                readLock2.unlock();
            }
            ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
            writeLock.lock();
            hdb hdbVar3 = (hdb) ((LinkedHashMap) this.c).get(s);
            if (hdbVar3 == null) {
                if (str2 == null || (map = (Map) ((HashMap) j).get(str2)) == null) {
                    hdbVar3 = null;
                } else {
                    hdbVar3 = (hdb) map.get(str);
                }
            }
            if (hdbVar3 != null) {
                while (i3 < i2) {
                    readLock2.lock();
                    i3++;
                }
                writeLock.unlock();
                return hdbVar3;
            }
            hdb build = idbVar.build();
            if (build != null) {
                if (str2 != null) {
                    Map<String, Map<String, hdb>> map3 = j;
                    if (((Map) ((HashMap) map3).get(str2)) == null) {
                        Map map4 = (Map) ((HashMap) map3).put(str2, new LinkedHashMap());
                    }
                    Map map5 = (Map) ((HashMap) map3).get(str2);
                    if (map5 != null) {
                        map5.put(str, build);
                    }
                }
                this.c.put(s, build);
                while (i3 < i2) {
                    readLock2.lock();
                    i3++;
                }
                writeLock.unlock();
                return build;
            }
            while (i3 < i2) {
                readLock2.lock();
                i3++;
            }
            writeLock.unlock();
            return null;
        } finally {
            readLock.unlock();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0053, code lost:
        if (r3.contains(r6 + '.' + r7) != false) goto L_0x0057;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean v(java.lang.String r6, java.lang.String r7) {
        /*
            r5 = this;
            r0 = 1
            r1 = 0
            com.android.alibaba.ip.runtime.IpChange r2 = com.alibaba.ability.hub.AbilityHubAdapter.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x001f
            java.lang.String r3 = "8ba130ef"
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r1] = r5
            r4[r0] = r6
            r6 = 2
            r4[r6] = r7
            java.lang.Object r6 = r2.ipc$dispatch(r3, r4)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            return r6
        L_0x001f:
            tb.cjf r2 = tb.cjf.INSTANCE
            tb.dud r2 = r2.j()
            if (r2 == 0) goto L_0x0058
            java.util.Set r3 = r2.d()
            java.util.Set r2 = r2.c()
            boolean r2 = r2.contains(r6)
            if (r2 != 0) goto L_0x0057
            boolean r2 = r3.isEmpty()
            if (r2 != 0) goto L_0x0056
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r6)
            r6 = 46
            r2.append(r6)
            r2.append(r7)
            java.lang.String r6 = r2.toString()
            boolean r6 = r3.contains(r6)
            if (r6 == 0) goto L_0x0056
            goto L_0x0057
        L_0x0056:
            r0 = 0
        L_0x0057:
            r1 = r0
        L_0x0058:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ability.hub.AbilityHubAdapter.v(java.lang.String, java.lang.String):boolean");
    }

    public final boolean w(String str, kdb kdbVar) {
        int i2;
        boolean z;
        int i3 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("365d8eb5", new Object[]{this, str, kdbVar})).booleanValue();
        }
        if (this.f.get()) {
            return true;
        }
        ReentrantReadWriteLock reentrantReadWriteLock = i;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
            i2 = reentrantReadWriteLock.getReadHoldCount();
        } else {
            i2 = 0;
        }
        for (int i4 = 0; i4 < i2; i4++) {
            readLock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            hdb remove = this.c.remove(s(str, kdbVar));
            if (remove == null) {
                remove = null;
            } else if (remove instanceof cu) {
                ((cu) remove).onDestroy();
            }
            if (remove != null) {
                z = true;
            } else {
                z = false;
            }
            return z;
        } finally {
            while (i3 < i2) {
                readLock.lock();
                i3++;
            }
            writeLock.unlock();
        }
    }

    public final void x(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ff53314", new Object[]{this, new Boolean(z)});
        } else {
            this.e = z;
        }
    }

    public final void y(kdb kdbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d34b6a2", new Object[]{this, kdbVar});
            return;
        }
        if (kdbVar.a() == null) {
            kdbVar.j(this.h);
        }
        kdbVar.l().c(this);
    }

    public final boolean l(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("37eff06d", new Object[]{this, str, str2})).booleanValue();
        }
        ckf.g(str, "name");
        ckf.g(str2, "api");
        if (ckf.b(str, MUSMonitor.MODULE_DIM_ABILITY) && (ckf.b(str2, "finishTrace") || ckf.b(str2, "batchFinishTrace"))) {
            return true;
        }
        idb p = p(str);
        if (str2.length() == 0) {
            return u(this, str, p, null, 4, null) != null;
        }
        if (p != null) {
            return p.b(str2);
        }
        return false;
    }

    public final FinishResult m(String str, String str2, boolean z) {
        String str3;
        boolean z2 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FinishResult) ipChange.ipc$dispatch("97275a12", new Object[]{this, str, str2, new Boolean(z)});
        }
        if (z) {
            if (p(str) != null) {
                z2 = true;
            }
            iih iihVar = iih.INSTANCE;
            String str4 = this.f1878a;
            iihVar.b(str4, "多实例 canIUseAbility 判断结果：" + z2);
        } else {
            z2 = l(str, str2);
            iih iihVar2 = iih.INSTANCE;
            String str5 = this.f1878a;
            iihVar2.b(str5, "canIUseAbility 判断结果：" + z2);
        }
        if (z2) {
            str3 = slo.VALUE_YES;
        } else {
            str3 = "NO";
        }
        return new FinishResult(null, str3, 1, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AbilityHubAdapter(ldb ldbVar, boolean z) {
        this(ldbVar);
        ckf.g(ldbVar, "env");
        this.b = z;
    }

    public final ExecuteResult A(String str, String str2, kdb kdbVar, Map<String, ? extends Object> map, s2d s2dVar, idb idbVar, int i2) {
        ExecuteResult executeResult;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("949a046d", new Object[]{this, str, str2, kdbVar, map, s2dVar, idbVar, new Integer(i2)});
        }
        MegaTrace megaTrace = MegaTrace.INSTANCE;
        megaTrace.c("AbilityHubAdapter#PrivateSyncCall", str, str2);
        String str3 = (String) kdbVar.m("callType");
        if (str3 == null || str3.length() == 0) {
            kdbVar.d("callType", "sync");
        }
        if (!ckf.b(str, MUSMonitor.MODULE_DIM_ABILITY) || (!ckf.b(str2, "finishTrace") && !ckf.b(str2, "batchFinishTrace"))) {
            kdbVar.i().A();
            executeResult = yti.Companion.a(aui.a().get(str, this.h.getNamespace()), new b(idbVar, this, i2)).a(str, str2, kdbVar, map != null ? map : kotlin.collections.a.h(), s2dVar);
            kdbVar.i().z();
        } else {
            kdbVar.i().C(true);
            executeResult = new b(idbVar, this, i2).a(str, str2, kdbVar, map != null ? map : kotlin.collections.a.h(), s2dVar);
        }
        megaTrace.e();
        return executeResult != null ? executeResult : new InternalResult(2, null, null, 6, null);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class b implements ndb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final idb f1879a;
        public final AbilityHubAdapter b;
        public final int c;

        static {
            t2o.a(144703537);
            t2o.a(144703572);
        }

        public b(idb idbVar, AbilityHubAdapter abilityHubAdapter, int i) {
            ckf.g(abilityHubAdapter, "hubAdapter");
            this.f1879a = idbVar;
            this.b = abilityHubAdapter;
            this.c = i;
        }

        /* JADX WARN: Removed duplicated region for block: B:28:0x00cd A[Catch: all -> 0x0092, TRY_ENTER, TryCatch #2 {all -> 0x0092, blocks: (B:7:0x0058, B:9:0x006b, B:13:0x0095, B:16:0x00a3, B:18:0x00a9, B:21:0x00b5, B:25:0x00c3, B:28:0x00cd, B:29:0x00df, B:31:0x00e4, B:33:0x00ec, B:34:0x00f9, B:36:0x0102, B:38:0x010c, B:39:0x0118, B:42:0x012b, B:44:0x0139, B:45:0x0140, B:46:0x0149, B:48:0x0151, B:49:0x0161, B:51:0x0169, B:53:0x0173, B:54:0x017f, B:57:0x018b, B:59:0x018f, B:60:0x019a, B:61:0x01a3, B:63:0x01ab, B:65:0x01b1, B:68:0x01c7, B:70:0x01cf, B:73:0x01e5, B:77:0x0206, B:78:0x0218, B:80:0x0221, B:81:0x0229, B:82:0x0240, B:85:0x024b, B:88:0x0251, B:90:0x0257, B:93:0x026e, B:98:0x0279, B:100:0x028e, B:103:0x02a4, B:105:0x02b5, B:131:0x035d, B:109:0x02cd, B:112:0x02d6, B:115:0x02ea, B:117:0x02f2, B:119:0x0306, B:120:0x030c, B:121:0x0311, B:124:0x0318, B:125:0x0323, B:126:0x032e), top: B:136:0x0058 }] */
        /* JADX WARN: Removed duplicated region for block: B:85:0x024b A[Catch: all -> 0x0092, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0092, blocks: (B:7:0x0058, B:9:0x006b, B:13:0x0095, B:16:0x00a3, B:18:0x00a9, B:21:0x00b5, B:25:0x00c3, B:28:0x00cd, B:29:0x00df, B:31:0x00e4, B:33:0x00ec, B:34:0x00f9, B:36:0x0102, B:38:0x010c, B:39:0x0118, B:42:0x012b, B:44:0x0139, B:45:0x0140, B:46:0x0149, B:48:0x0151, B:49:0x0161, B:51:0x0169, B:53:0x0173, B:54:0x017f, B:57:0x018b, B:59:0x018f, B:60:0x019a, B:61:0x01a3, B:63:0x01ab, B:65:0x01b1, B:68:0x01c7, B:70:0x01cf, B:73:0x01e5, B:77:0x0206, B:78:0x0218, B:80:0x0221, B:81:0x0229, B:82:0x0240, B:85:0x024b, B:88:0x0251, B:90:0x0257, B:93:0x026e, B:98:0x0279, B:100:0x028e, B:103:0x02a4, B:105:0x02b5, B:131:0x035d, B:109:0x02cd, B:112:0x02d6, B:115:0x02ea, B:117:0x02f2, B:119:0x0306, B:120:0x030c, B:121:0x0311, B:124:0x0318, B:125:0x0323, B:126:0x032e), top: B:136:0x0058 }] */
        @Override // tb.ndb
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public com.alibaba.ability.result.ExecuteResult a(java.lang.String r28, java.lang.String r29, tb.kdb r30, java.util.Map<java.lang.String, ? extends java.lang.Object> r31, tb.s2d r32) {
            /*
                Method dump skipped, instructions count: 912
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ability.hub.AbilityHubAdapter.b.a(java.lang.String, java.lang.String, tb.kdb, java.util.Map, tb.s2d):com.alibaba.ability.result.ExecuteResult");
        }
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [T, com.alibaba.ability.result.ErrorResult] */
    /* JADX WARN: Type inference failed for: r0v9, types: [com.alibaba.ability.result.ExecuteResult, T] */
    /* JADX WARN: Type inference failed for: r1v9, types: [com.alibaba.ability.result.InternalResult, T] */
    public final ExecuteResult z(String str, String str2, kdb kdbVar, Map<String, ? extends Object> map, s2d s2dVar) {
        Ref$ObjectRef ref$ObjectRef;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("9e82ad2f", new Object[]{this, str, str2, kdbVar, map, s2dVar});
        }
        ckf.g(str, "name");
        ckf.g(str2, "api");
        ckf.g(kdbVar, "context");
        ckf.g(s2dVar, "callback");
        MegaTrace megaTrace = MegaTrace.INSTANCE;
        megaTrace.c("AbilityHubAdapter#syncCall", str, str2);
        megaTrace.b("AbilityHubAdapter#syncCall#performStart");
        kdbVar.i().F(str, str2, map, this.h.getNamespace(), "sync", this.d);
        y(kdbVar);
        megaTrace.e();
        idb p = p(str);
        megaTrace.b("AbilityHubAdapter#syncCall#getApiThreadMode");
        int o = o(p, str2, str);
        megaTrace.e();
        Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
        ref$ObjectRef2.element = new InternalResult(2, null, null, 6, null);
        if (o != 1) {
            if (o == 2 || o == 3) {
                ref$ObjectRef2.element = A(str, str2, kdbVar, map, s2dVar, p, o);
            }
            ref$ObjectRef = ref$ObjectRef2;
        } else {
            kdbVar.d("syncCallForceMain", Boolean.TRUE);
            CountDownLatch countDownLatch = new CountDownLatch(1);
            MegaUtils.A(new h(ref$ObjectRef2, str, str2, kdbVar, map, s2dVar, p, o, countDownLatch), 0L, 2, null);
            try {
                countDownLatch.await();
                ref$ObjectRef = ref$ObjectRef2;
            } catch (InterruptedException e2) {
                iih iihVar = iih.INSTANCE;
                String str3 = this.f1878a;
                iihVar.a(str3, str + '.' + str2 + " 能力执行同步等待异常:" + sm8.b(e2));
                StringBuilder sb = new StringBuilder("能力执行同步等待异常。ability=");
                sb.append(str);
                sb.append(", api=");
                sb.append(str2);
                ref$ObjectRef = ref$ObjectRef2;
                ref$ObjectRef.element = new ErrorResult(199, sb.toString(), (Map) null, 4, (a07) null);
            }
        }
        kdbVar.i().i();
        MegaTrace.INSTANCE.e();
        return (ExecuteResult) ref$ObjectRef.element;
    }

    public final void k(String str, String str2, kdb kdbVar, Map<String, ? extends Object> map, s2d s2dVar, boolean z) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b369e803", new Object[]{this, str, str2, kdbVar, map, s2dVar, new Boolean(z)});
            return;
        }
        ckf.g(str, "name");
        ckf.g(str2, "api");
        ckf.g(kdbVar, "context");
        ckf.g(s2dVar, "callback");
        MegaTrace megaTrace = MegaTrace.INSTANCE;
        megaTrace.c("AbilityHubAdapter#asyncCall", str, str2);
        kdbVar.i().F(str, str2, map, this.h.getNamespace(), "async", this.d);
        y(kdbVar);
        idb p = p(str);
        String str4 = (String) kdbVar.m("callType");
        if (str4 == null || str4.length() == 0) {
            kdbVar.d("callType", "async");
        }
        int o = o(p, str2, str);
        iih iihVar = iih.INSTANCE;
        String str5 = this.f1878a;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append('.');
        sb.append(str2);
        sb.append(" 异步调用，");
        if (z) {
            str3 = "不阻塞";
        } else {
            str3 = "阻塞";
        }
        sb.append(str3);
        sb.append("当前线程");
        iihVar.b(str5, sb.toString());
        if (z) {
            if (o == 1) {
                MegaUtils.z(new c(str, str2, kdbVar, map, s2dVar, p, o), -1L);
            } else if (o == 2 || o == 3) {
                MegaUtils.B(new d(str, str2, kdbVar, map, s2dVar, p, o));
            }
            kdbVar.i().i();
        } else {
            if (o == 1) {
                MegaUtils.A(new e(str, str2, kdbVar, map, s2dVar, p, o), 0L, 2, null);
            } else if (o == 2) {
                s2dVar.onCallback(A(str, str2, kdbVar, map, s2dVar, p, o));
            } else if (o == 3) {
                MegaUtils.D(new f(str, str2, kdbVar, map, s2dVar, p, o));
            }
            kdbVar.i().i();
        }
        megaTrace.e();
    }
}
