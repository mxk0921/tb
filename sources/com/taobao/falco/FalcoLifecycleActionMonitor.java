package com.taobao.falco;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import anet.channel.util.ALog;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.analysis.scene.SceneIdentifier;
import com.taobao.analysis.v3.FalcoGlobalTracer;
import com.taobao.falco.FalcoLoadActionMonitor;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import tb.ah0;
import tb.az8;
import tb.bz8;
import tb.ckh;
import tb.crt;
import tb.cz8;
import tb.dad;
import tb.dz8;
import tb.ez8;
import tb.obq;
import tb.pz8;
import tb.qg0;
import tb.sg0;
import tb.tz8;
import tb.uqq;
import tb.vz8;
import tb.wg0;
import tb.xg0;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class FalcoLifecycleActionMonitor extends FalcoLoadActionMonitor.e implements sg0.c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static volatile String A = "COLD";
    public static volatile long B = 0;
    public static volatile boolean C = false;
    public static volatile boolean D = false;
    public static final String LAUNCH_TYPE_COLD = "COLD";
    public static final String LAUNCH_TYPE_HOT = "HOT";
    public static final String LAUNCH_TYPE_WARM = "WARM";
    public volatile j E;

    /* renamed from: a  reason: collision with root package name */
    public final ez8 f10429a;
    public ez8 b;
    public ez8 c;
    public ez8 d;
    public n e;
    public String r;
    public String s;
    public String v;
    public final TouchToLoadRecordQueue w;
    public final Map<String, n> y;
    public final Set<String> z;
    public boolean f = true;
    public int g = 0;
    public int h = 0;
    public boolean i = false;
    public long j = -1;
    public long k = -1;
    public boolean l = true;
    public boolean m = false;
    public boolean n = false;
    public long o = -1;
    public boolean p = false;
    public boolean q = false;
    public long t = -1;
    public long u = -1;
    public final Set<Long> x = new HashSet();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class TouchToLoadRecord extends LinkedList<n> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final String category;
        public final t touchActionSpan;

        public TouchToLoadRecord(String str, t tVar) {
            this.category = str;
            this.touchActionSpan = tVar;
        }

        public static /* synthetic */ Object ipc$super(TouchToLoadRecord touchToLoadRecord, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/falco/FalcoLifecycleActionMonitor$TouchToLoadRecord");
        }

        public void addLoadRecord(n nVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d24a410", new Object[]{this, nVar});
                return;
            }
            this.touchActionSpan.H1(nVar.getFalcoId());
            nVar.f2(this.category);
            addLast(nVar);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class TouchToLoadRecordQueue extends LinkedList<TouchToLoadRecord> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private TouchToLoadRecordQueue() {
        }

        public static /* synthetic */ Object ipc$super(TouchToLoadRecordQueue touchToLoadRecordQueue, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/falco/FalcoLifecycleActionMonitor$TouchToLoadRecordQueue");
        }

        public void addRecord(TouchToLoadRecord touchToLoadRecord) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d59c909", new Object[]{this, touchToLoadRecord});
                return;
            }
            if (!isEmpty()) {
                TouchToLoadRecord removeFirst = removeFirst();
                touchToLoadRecord.touchActionSpan.E1(removeFirst.touchActionSpan.getFalcoId());
                if ("tap".equals(removeFirst.category) || t.CATEGORY_FLICK.equals(removeFirst.category)) {
                    removeFirst.touchActionSpan.finish();
                }
            }
            addLast(touchToLoadRecord);
        }

        public /* synthetic */ TouchToLoadRecordQueue(c cVar) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ n f10430a;
        public final /* synthetic */ long b;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;
        public final /* synthetic */ String e;
        public final /* synthetic */ long f;
        public final /* synthetic */ Set g;

        public a(n nVar, long j, String str, String str2, String str3, long j2, Set set) {
            this.f10430a = nVar;
            this.b = j;
            this.c = str;
            this.d = str2;
            this.e = str3;
            this.f = j2;
            this.g = set;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                FalcoLifecycleActionMonitor.H(FalcoLifecycleActionMonitor.this, this.f10430a, this.b, this.c, this.d, this.e, this.f, this.g);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Map f10431a;

        public b(Map map) {
            this.f10431a = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                FalcoLifecycleActionMonitor.I(FalcoLifecycleActionMonitor.this, this.f10431a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ long f10433a;
        public final /* synthetic */ long b;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;

        public d(long j, long j2, String str, String str2) {
            this.f10433a = j;
            this.b = j2;
            this.c = str;
            this.d = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            FalcoLifecycleActionMonitor.Q(FalcoLifecycleActionMonitor.this);
            if (FalcoLifecycleActionMonitor.O(FalcoLifecycleActionMonitor.this) == 1 && !FalcoLifecycleActionMonitor.W(FalcoLifecycleActionMonitor.this) && !FalcoLifecycleActionMonitor.T(FalcoLifecycleActionMonitor.this)) {
                FalcoLifecycleActionMonitor.A = "HOT";
                FalcoLifecycleActionMonitor.B = this.f10433a;
                FalcoLifecycleActionMonitor.C = false;
                FalcoLifecycleActionMonitor.s(FalcoLifecycleActionMonitor.this, this.b, this.c, this.d, this.f10433a);
                FalcoLifecycleActionMonitor.n(FalcoLifecycleActionMonitor.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ long f10434a;
        public final /* synthetic */ long b;

        public e(long j, long j2) {
            this.f10434a = j;
            this.b = j2;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z = false;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            FalcoLifecycleActionMonitor.R(FalcoLifecycleActionMonitor.this);
            if (FalcoLifecycleActionMonitor.O(FalcoLifecycleActionMonitor.this) < 0) {
                FalcoLifecycleActionMonitor.P(FalcoLifecycleActionMonitor.this, 0);
            }
            FalcoLifecycleActionMonitor falcoLifecycleActionMonitor = FalcoLifecycleActionMonitor.this;
            if (FalcoLifecycleActionMonitor.O(falcoLifecycleActionMonitor) == 0 && FalcoLifecycleActionMonitor.v(FalcoLifecycleActionMonitor.this) == 0) {
                z = true;
            }
            FalcoLifecycleActionMonitor.u(falcoLifecycleActionMonitor, z);
            if (FalcoLifecycleActionMonitor.t(FalcoLifecycleActionMonitor.this)) {
                FalcoLifecycleActionMonitor.z(FalcoLifecycleActionMonitor.this, this.f10434a);
            }
            FalcoLifecycleActionMonitor.A(FalcoLifecycleActionMonitor.this, this.f10434a, this.b);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class f implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ long f10435a;

        public f(long j) {
            this.f10435a = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                FalcoLifecycleActionMonitor.B(FalcoLifecycleActionMonitor.this).remove(Long.valueOf(this.f10435a));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class g implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ t f10436a;
        public final /* synthetic */ n b;

        public g(t tVar, n nVar) {
            this.f10436a = tVar;
            this.b = nVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                FalcoLifecycleActionMonitor.G(FalcoLifecycleActionMonitor.this, this.f10436a, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public final class h implements wg0 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ String f10438a;

            public a(String str) {
                this.f10438a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else if (FalcoLifecycleActionMonitor.J(FalcoLifecycleActionMonitor.this) == -1) {
                    FalcoLifecycleActionMonitor.K(FalcoLifecycleActionMonitor.this, System.currentTimeMillis());
                    FalcoLifecycleActionMonitor.N(FalcoLifecycleActionMonitor.this, this.f10438a);
                }
            }
        }

        public h() {
        }

        @Override // tb.wg0
        public void a(qg0 qg0Var, String str, dad dadVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ec5725b9", new Object[]{this, qg0Var, str, dadVar});
            } else {
                crt.f(new a(str));
            }
        }

        @Override // tb.wg0
        public int b(qg0 qg0Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("4d241b11", new Object[]{this, qg0Var})).intValue();
            }
            return 0;
        }

        @Override // tb.wg0
        public int c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("8e1aa3fd", new Object[]{this})).intValue();
            }
            return 1;
        }

        public /* synthetic */ h(FalcoLifecycleActionMonitor falcoLifecycleActionMonitor, c cVar) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public final class i implements wg0 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else if (FalcoLifecycleActionMonitor.L(FalcoLifecycleActionMonitor.this) == -1) {
                    FalcoLifecycleActionMonitor.M(FalcoLifecycleActionMonitor.this, System.currentTimeMillis());
                }
            }
        }

        public i() {
        }

        @Override // tb.wg0
        public void a(qg0 qg0Var, String str, dad dadVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ec5725b9", new Object[]{this, qg0Var, str, dadVar});
            } else {
                crt.f(new a());
            }
        }

        @Override // tb.wg0
        public int b(qg0 qg0Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("4d241b11", new Object[]{this, qg0Var})).intValue();
            }
            return 0;
        }

        @Override // tb.wg0
        public int c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("8e1aa3fd", new Object[]{this})).intValue();
            }
            return 0;
        }

        public /* synthetic */ i(FalcoLifecycleActionMonitor falcoLifecycleActionMonitor, c cVar) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface j {
    }

    public FalcoLifecycleActionMonitor() {
        TouchToLoadRecordQueue touchToLoadRecordQueue = new TouchToLoadRecordQueue(null);
        this.w = touchToLoadRecordQueue;
        HashMap hashMap = new HashMap(2);
        this.y = hashMap;
        HashSet hashSet = new HashSet(1);
        this.z = hashSet;
        A = "COLD";
        B = SceneIdentifier.getProcessStartTime();
        tz8 tz8Var = FalcoGlobalTracer.get();
        if (tz8Var == null) {
            ALog.e("falco.LifeCycleActionMonitor", "[constructor] error: tracer is null", null, new Object[0]);
            this.f10429a = null;
        } else {
            ez8 ez8Var = (ez8) tz8Var.d(s.MODULE, s.SCENE).g(SceneIdentifier.getProcessStartTime()).j();
            this.f10429a = ez8Var;
            ez8Var.y1("launch");
            touchToLoadRecordQueue.addRecord(new TouchToLoadRecord("launch", ez8Var));
        }
        this.b = null;
        this.d = null;
        this.c = this.f10429a;
        hashMap.put("com.taobao.tao.welcome.Welcome", null);
        hashMap.put(obq.BIZ_NAME, null);
        hashMap.put("com.taobao.tao.welcome.Alias1Welcome88VIP", null);
        hashSet.add("com.taobao.tao.homepage.HomepageFragment");
    }

    public static /* synthetic */ void A(FalcoLifecycleActionMonitor falcoLifecycleActionMonitor, long j2, long j3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("587d8a88", new Object[]{falcoLifecycleActionMonitor, new Long(j2), new Long(j3)});
        } else {
            falcoLifecycleActionMonitor.b0(j2, j3);
        }
    }

    public static /* synthetic */ Set B(FalcoLifecycleActionMonitor falcoLifecycleActionMonitor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("3823db8", new Object[]{falcoLifecycleActionMonitor});
        }
        return falcoLifecycleActionMonitor.x;
    }

    public static /* synthetic */ long C(FalcoLifecycleActionMonitor falcoLifecycleActionMonitor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2578f6fe", new Object[]{falcoLifecycleActionMonitor})).longValue();
        }
        return falcoLifecycleActionMonitor.o;
    }

    public static /* synthetic */ boolean D(FalcoLifecycleActionMonitor falcoLifecycleActionMonitor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b2b3a88f", new Object[]{falcoLifecycleActionMonitor})).booleanValue();
        }
        return falcoLifecycleActionMonitor.p;
    }

    public static /* synthetic */ boolean E(FalcoLifecycleActionMonitor falcoLifecycleActionMonitor, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ff73506b", new Object[]{falcoLifecycleActionMonitor, new Boolean(z)})).booleanValue();
        }
        falcoLifecycleActionMonitor.p = z;
        return z;
    }

    public static /* synthetic */ String F(pz8 pz8Var, uqq uqqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b3759cfd", new Object[]{pz8Var, uqqVar});
        }
        return k0(pz8Var, uqqVar);
    }

    public static /* synthetic */ void G(FalcoLifecycleActionMonitor falcoLifecycleActionMonitor, t tVar, n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eae53d89", new Object[]{falcoLifecycleActionMonitor, tVar, nVar});
        } else {
            falcoLifecycleActionMonitor.f0(tVar, nVar);
        }
    }

    public static /* synthetic */ void H(FalcoLifecycleActionMonitor falcoLifecycleActionMonitor, n nVar, long j2, String str, String str2, String str3, long j3, Set set) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af007fc9", new Object[]{falcoLifecycleActionMonitor, nVar, new Long(j2), str, str2, str3, new Long(j3), set});
        } else {
            falcoLifecycleActionMonitor.g0(nVar, j2, str, str2, str3, j3, set);
        }
    }

    public static /* synthetic */ void I(FalcoLifecycleActionMonitor falcoLifecycleActionMonitor, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3ca50e1", new Object[]{falcoLifecycleActionMonitor, map});
        } else {
            falcoLifecycleActionMonitor.c0(map);
        }
    }

    public static /* synthetic */ long J(FalcoLifecycleActionMonitor falcoLifecycleActionMonitor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("97e4611a", new Object[]{falcoLifecycleActionMonitor})).longValue();
        }
        return falcoLifecycleActionMonitor.u;
    }

    public static /* synthetic */ long K(FalcoLifecycleActionMonitor falcoLifecycleActionMonitor, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c0596f10", new Object[]{falcoLifecycleActionMonitor, new Long(j2)})).longValue();
        }
        falcoLifecycleActionMonitor.u = j2;
        return j2;
    }

    public static /* synthetic */ long L(FalcoLifecycleActionMonitor falcoLifecycleActionMonitor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("aa9af99", new Object[]{falcoLifecycleActionMonitor})).longValue();
        }
        return falcoLifecycleActionMonitor.t;
    }

    public static /* synthetic */ long M(FalcoLifecycleActionMonitor falcoLifecycleActionMonitor, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a63df071", new Object[]{falcoLifecycleActionMonitor, new Long(j2)})).longValue();
        }
        falcoLifecycleActionMonitor.t = j2;
        return j2;
    }

    public static /* synthetic */ String N(FalcoLifecycleActionMonitor falcoLifecycleActionMonitor, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e260514d", new Object[]{falcoLifecycleActionMonitor, str});
        }
        falcoLifecycleActionMonitor.v = str;
        return str;
    }

    public static /* synthetic */ int O(FalcoLifecycleActionMonitor falcoLifecycleActionMonitor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("83a2fe0a", new Object[]{falcoLifecycleActionMonitor})).intValue();
        }
        return falcoLifecycleActionMonitor.g;
    }

    public static /* synthetic */ int P(FalcoLifecycleActionMonitor falcoLifecycleActionMonitor, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4c6e6c7d", new Object[]{falcoLifecycleActionMonitor, new Integer(i2)})).intValue();
        }
        falcoLifecycleActionMonitor.g = i2;
        return i2;
    }

    public static /* synthetic */ int Q(FalcoLifecycleActionMonitor falcoLifecycleActionMonitor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("91cf750e", new Object[]{falcoLifecycleActionMonitor})).intValue();
        }
        int i2 = falcoLifecycleActionMonitor.g + 1;
        falcoLifecycleActionMonitor.g = i2;
        return i2;
    }

    public static /* synthetic */ int R(FalcoLifecycleActionMonitor falcoLifecycleActionMonitor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("18e5b090", new Object[]{falcoLifecycleActionMonitor})).intValue();
        }
        int i2 = falcoLifecycleActionMonitor.g - 1;
        falcoLifecycleActionMonitor.g = i2;
        return i2;
    }

    public static /* synthetic */ long S(FalcoLifecycleActionMonitor falcoLifecycleActionMonitor, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6689eede", new Object[]{falcoLifecycleActionMonitor, new Long(j2)})).longValue();
        }
        falcoLifecycleActionMonitor.k = j2;
        return j2;
    }

    public static /* synthetic */ boolean T(FalcoLifecycleActionMonitor falcoLifecycleActionMonitor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e18611d", new Object[]{falcoLifecycleActionMonitor})).booleanValue();
        }
        return falcoLifecycleActionMonitor.l;
    }

    public static /* synthetic */ boolean U(FalcoLifecycleActionMonitor falcoLifecycleActionMonitor, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("80a5a99d", new Object[]{falcoLifecycleActionMonitor, new Boolean(z)})).booleanValue();
        }
        falcoLifecycleActionMonitor.l = z;
        return z;
    }

    public static /* synthetic */ boolean V(FalcoLifecycleActionMonitor falcoLifecycleActionMonitor, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9ac1283c", new Object[]{falcoLifecycleActionMonitor, new Boolean(z)})).booleanValue();
        }
        falcoLifecycleActionMonitor.m = z;
        return z;
    }

    public static /* synthetic */ boolean W(FalcoLifecycleActionMonitor falcoLifecycleActionMonitor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b88dc41f", new Object[]{falcoLifecycleActionMonitor})).booleanValue();
        }
        return falcoLifecycleActionMonitor.f;
    }

    public static /* synthetic */ ez8 X(FalcoLifecycleActionMonitor falcoLifecycleActionMonitor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ez8) ipChange.ipc$dispatch("e487ca7b", new Object[]{falcoLifecycleActionMonitor});
        }
        return falcoLifecycleActionMonitor.c;
    }

    public static /* synthetic */ ez8 Y(FalcoLifecycleActionMonitor falcoLifecycleActionMonitor, ez8 ez8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ez8) ipChange.ipc$dispatch("e06667f0", new Object[]{falcoLifecycleActionMonitor, ez8Var});
        }
        falcoLifecycleActionMonitor.c = ez8Var;
        return ez8Var;
    }

    public static /* synthetic */ TouchToLoadRecordQueue Z(FalcoLifecycleActionMonitor falcoLifecycleActionMonitor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TouchToLoadRecordQueue) ipChange.ipc$dispatch("d0a7e4dc", new Object[]{falcoLifecycleActionMonitor});
        }
        return falcoLifecycleActionMonitor.w;
    }

    public static String i0(Activity activity) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9655f43d", new Object[]{activity});
        }
        Intent intent = activity.getIntent();
        if (intent != null) {
            str = intent.getDataString();
        } else {
            str = null;
        }
        if (str == null) {
            return "";
        }
        return str;
    }

    public static /* synthetic */ Object ipc$super(FalcoLifecycleActionMonitor falcoLifecycleActionMonitor, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/falco/FalcoLifecycleActionMonitor");
    }

    public static Long j0(pz8 pz8Var, ckh ckhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Long) ipChange.ipc$dispatch("a02ab853", new Object[]{pz8Var, ckhVar});
        }
        Object A0 = pz8Var.A0(ckhVar.getKey());
        if (A0 instanceof Long) {
            return (Long) A0;
        }
        return -1L;
    }

    public static String k0(pz8 pz8Var, uqq uqqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5afdd8b4", new Object[]{pz8Var, uqqVar});
        }
        Object A0 = pz8Var.A0(uqqVar.getKey());
        if (A0 instanceof String) {
            return (String) A0;
        }
        return "";
    }

    public static Long m0(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Long) ipChange.ipc$dispatch("2af74182", new Object[]{obj});
        }
        if (obj instanceof Long) {
            return (Long) obj;
        }
        return -1L;
    }

    public static /* synthetic */ void n(FalcoLifecycleActionMonitor falcoLifecycleActionMonitor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48de1c83", new Object[]{falcoLifecycleActionMonitor});
        } else {
            falcoLifecycleActionMonitor.o0();
        }
    }

    public static String n0(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7d90a398", new Object[]{obj});
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        return "";
    }

    public static /* synthetic */ void s(FalcoLifecycleActionMonitor falcoLifecycleActionMonitor, long j2, String str, String str2, long j3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c28742f0", new Object[]{falcoLifecycleActionMonitor, new Long(j2), str, str2, new Long(j3)});
        } else {
            falcoLifecycleActionMonitor.d0(j2, str, str2, j3);
        }
    }

    public static /* synthetic */ boolean t(FalcoLifecycleActionMonitor falcoLifecycleActionMonitor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("63537f89", new Object[]{falcoLifecycleActionMonitor})).booleanValue();
        }
        return falcoLifecycleActionMonitor.i;
    }

    public static /* synthetic */ boolean u(FalcoLifecycleActionMonitor falcoLifecycleActionMonitor, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("62ce58b1", new Object[]{falcoLifecycleActionMonitor, new Boolean(z)})).booleanValue();
        }
        falcoLifecycleActionMonitor.i = z;
        return z;
    }

    public static /* synthetic */ int v(FalcoLifecycleActionMonitor falcoLifecycleActionMonitor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f08e30f9", new Object[]{falcoLifecycleActionMonitor})).intValue();
        }
        return falcoLifecycleActionMonitor.h;
    }

    public static /* synthetic */ int w(FalcoLifecycleActionMonitor falcoLifecycleActionMonitor, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7ce9976e", new Object[]{falcoLifecycleActionMonitor, new Integer(i2)})).intValue();
        }
        falcoLifecycleActionMonitor.h = i2;
        return i2;
    }

    public static /* synthetic */ int x(FalcoLifecycleActionMonitor falcoLifecycleActionMonitor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("febaa7fd", new Object[]{falcoLifecycleActionMonitor})).intValue();
        }
        int i2 = falcoLifecycleActionMonitor.h + 1;
        falcoLifecycleActionMonitor.h = i2;
        return i2;
    }

    public static /* synthetic */ int y(FalcoLifecycleActionMonitor falcoLifecycleActionMonitor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("85d0e37f", new Object[]{falcoLifecycleActionMonitor})).intValue();
        }
        int i2 = falcoLifecycleActionMonitor.h - 1;
        falcoLifecycleActionMonitor.h = i2;
        return i2;
    }

    public static /* synthetic */ long z(FalcoLifecycleActionMonitor falcoLifecycleActionMonitor, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("970519cf", new Object[]{falcoLifecycleActionMonitor, new Long(j2)})).longValue();
        }
        falcoLifecycleActionMonitor.j = j2;
        return j2;
    }

    @Override // tb.sg0.c
    public void a(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("283ab0d4", new Object[]{this, map});
        }
    }

    public final void a0(ez8 ez8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ee1142c", new Object[]{this, ez8Var});
            return;
        }
        ez8Var.O1(this.r);
        ez8Var.b2(this.s);
        ez8Var.g2(SceneIdentifier.getProcessStartTime());
        ez8Var.Q1(this.t - ez8Var.z());
        ez8Var.P1(this.u - ez8Var.z());
        ez8Var.R1(this.v);
        ez8Var.X1(SceneIdentifier.getInstallType());
        FalcoEnvironmentImpl m = FalcoEnvironmentImpl.m();
        if (m != null) {
            ez8Var.W1(m.c());
            com.taobao.falco.c d2 = m.d();
            ez8Var.e2(d2.c);
            ez8Var.l2(d2.d);
        }
        ez8 ez8Var2 = this.b;
        if (ez8Var2 != null) {
            ez8Var.f2(k0(ez8Var2, ez8.AFC_ID));
        }
    }

    @Override // tb.sg0.c
    public void b(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8ea9b13", new Object[]{this, map});
        } else if (map == null) {
            ALog.e("falco.LifeCycleActionMonitor", "[onFlowEnter] error: params is null", null, new Object[0]);
        } else {
            crt.f(new b(map));
        }
    }

    public final void b0(long j2, long j3) {
        ez8 ez8Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2803a0ba", new Object[]{this, new Long(j2), new Long(j3)});
        } else if (j2 == this.o && (ez8Var = this.c) != null) {
            this.o = -1L;
            ez8Var.c2(j3 - ez8Var.z());
            a0(this.c);
            this.c.finish();
        }
    }

    @Override // com.taobao.falco.FalcoLoadActionMonitor.e
    public void c(Activity activity, Bundle bundle, long j2, long j3) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ca47521", new Object[]{this, activity, bundle, new Long(j2), new Long(j3)});
            return;
        }
        if (bundle == null) {
            z = false;
        }
        crt.f(new c(j3, z));
    }

    public final void f0(t tVar, n nVar) {
        String E1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bdcf2a9", new Object[]{this, tVar, nVar});
            return;
        }
        if (!this.n && nVar != null && (E1 = nVar.E1()) != null && ((HashMap) this.y).containsKey(E1)) {
            ((HashMap) this.y).put(E1, nVar);
        }
        if (tVar != null) {
            if (!this.w.isEmpty()) {
                TouchToLoadRecord last = this.w.getLast();
                if (last.touchActionSpan == tVar) {
                    last.addLoadRecord(nVar);
                    return;
                }
            }
            String B1 = tVar.B1();
            if (TextUtils.isEmpty(B1)) {
                B1 = "tap";
            }
            TouchToLoadRecord touchToLoadRecord = new TouchToLoadRecord(B1, tVar);
            this.w.addRecord(touchToLoadRecord);
            touchToLoadRecord.addLoadRecord(nVar);
        } else if (!this.w.isEmpty()) {
            TouchToLoadRecord last2 = this.w.getLast();
            nVar.C1(last2.touchActionSpan.getFalcoId());
            last2.addLoadRecord(nVar);
        }
    }

    public final void g0(n nVar, long j2, String str, String str2, String str3, long j3, Set<String> set) {
        String str4;
        String str5;
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a83adbc", new Object[]{this, nVar, new Long(j2), str, str2, str3, new Long(j3), set});
            return;
        }
        String str6 = "";
        if (str == null) {
            str4 = str6;
        } else {
            str4 = str;
        }
        if (str2 == null) {
            str5 = str6;
        } else {
            str5 = str2;
        }
        if (str3 != null) {
            str6 = str3;
        }
        if (!this.n && nVar != null && !set.contains(str5)) {
            this.e = nVar;
            if (nVar.I1() && this.e.D1()) {
                this.n = true;
                h0();
            }
        }
        if (!this.i || this.j != j2) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            if (!this.n) {
                this.n = true;
                h0();
            }
            this.i = false;
            this.j = -1L;
        }
        if (nVar != null) {
            nVar.H(j3);
        }
        if (z) {
            e0(j2, str4, str6, j3);
        }
    }

    @Override // com.taobao.falco.FalcoLoadActionMonitor.e
    public void h(Activity activity, long j2, long j3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e33d8eec", new Object[]{this, activity, new Long(j2), new Long(j3)});
        } else {
            crt.f(new d(j3, j2, activity.getLocalClassName(), i0(activity)));
        }
    }

    public final void h0() {
        String str;
        n nVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c169d2a8", new Object[]{this});
            return;
        }
        n nVar2 = this.e;
        if (!(nVar2 == null || this.c == null)) {
            String E1 = nVar2.E1();
            if (!TextUtils.isEmpty(E1) && ((HashSet) this.z).contains(E1)) {
                String pageName = this.e.getPageName();
                if (!TextUtils.isEmpty(pageName) && pageName.length() > E1.length() + 1 && (nVar = (n) ((HashMap) this.y).get(pageName.substring(0, (pageName.length() - E1.length()) - 1))) != null) {
                    this.e.R1(Long.valueOf(nVar.G1()));
                    this.e.S1(Long.valueOf(nVar.H1()));
                }
            }
            if (this.f) {
                this.c.a2("COLD");
                this.c.Y1(SceneIdentifier.getProcessStartTime());
            } else {
                this.c.a2("WARM");
                this.c.Y1(this.k);
            }
            ez8 ez8Var = this.c;
            if (this.m) {
                str = "1";
            } else {
                str = "0";
            }
            ez8Var.k2(str);
            this.c.Z1(0);
            this.c.H1(this.e.getFalcoId());
            this.c.T1(this.e);
            a0(this.c);
            this.c.finish();
            for (String str2 : ((HashMap) this.y).keySet()) {
                ((HashMap) this.y).put(str2, null);
            }
        }
    }

    @Override // com.taobao.falco.FalcoLoadActionMonitor.e
    public void i(Activity activity, long j2, long j3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61063638", new Object[]{this, activity, new Long(j2), new Long(j3)});
        } else {
            crt.f(new e(j2, j3));
        }
    }

    @Override // com.taobao.falco.FalcoLoadActionMonitor.e
    public void j(Fragment fragment, Bundle bundle, long j2) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60c67808", new Object[]{this, fragment, bundle, new Long(j2)});
            return;
        }
        if (bundle == null) {
            z = false;
        }
        crt.f(new az8(this, z, j2));
    }

    @Override // com.taobao.falco.FalcoLoadActionMonitor.e
    public void k(Fragment fragment, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99a625db", new Object[]{this, fragment, new Long(j2)});
        } else {
            crt.f(new f(j2));
        }
    }

    public void l0(FalcoLoadActionMonitor falcoLoadActionMonitor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2318c524", new Object[]{this, falcoLoadActionMonitor});
        } else if (falcoLoadActionMonitor == null) {
            ALog.e("falco.LifeCycleActionMonitor", "[init] error: loadActionMonitor is null", null, new Object[0]);
        } else {
            try {
                falcoLoadActionMonitor.E0(this);
                sg0.d(this);
                xg0 a2 = xg0.a();
                if (a2 != null) {
                    a2.b(new i(this, null));
                    a2.b(new h(this, null));
                } else {
                    ALog.e("falco.LifeCycleActionMonitor", "[init] error: afcPluginManager is null", null, new Object[0]);
                }
            } catch (Exception e2) {
                ALog.e("falco.LifeCycleActionMonitor", "[init] error: some exception happened", null, e2, new Object[0]);
            }
        }
    }

    @Override // com.taobao.falco.FalcoLoadActionMonitor.e
    public void m(Fragment fragment, long j2) {
        long j3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("161f1c9d", new Object[]{this, fragment, new Long(j2)});
            return;
        }
        FragmentActivity activity = fragment.getActivity();
        if (activity != null) {
            j3 = FalcoLoadActionMonitor.f.b(activity.hashCode(), 1);
        } else {
            j3 = -1;
        }
        crt.f(new cz8(this, j3, j2, fragment.getClass().getName()));
    }

    @Override // com.taobao.falco.FalcoLoadActionMonitor.e
    public void o(Fragment fragment, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7eb45c33", new Object[]{this, fragment, new Long(j2)});
        } else {
            crt.f(new bz8(this));
        }
    }

    public final void o0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e79cf5f9", new Object[]{this});
            return;
        }
        j jVar = this.E;
        if (jVar != null) {
            ((vz8) jVar).R(A, B, C, this.c);
        }
    }

    @Override // com.taobao.falco.FalcoLoadActionMonitor.e
    public void p(Fragment fragment, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70852a67", new Object[]{this, fragment, new Long(j2)});
        } else {
            crt.f(new dz8(this, j2));
        }
    }

    public void p0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1f96e32", new Object[]{this});
        } else {
            this.E = null;
        }
    }

    @Override // com.taobao.falco.FalcoLoadActionMonitor.e
    public void q(t tVar, n nVar, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fa449ae", new Object[]{this, tVar, nVar, new Long(j2)});
        } else {
            crt.f(new g(tVar, nVar));
        }
    }

    public void q0(j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bc9b9a3", new Object[]{this, jVar});
            return;
        }
        this.E = jVar;
        o0();
    }

    @Override // com.taobao.falco.FalcoLoadActionMonitor.e
    public void r(n nVar, long j2, String str, String str2, String str3, long j3, Set<String> set) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aa4a46f", new Object[]{this, nVar, new Long(j2), str, str2, str3, new Long(j3), set});
        } else {
            crt.f(new a(nVar, j2, str, str2, str3, j3, set));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ long f10432a;
        public final /* synthetic */ boolean b;

        public c(long j, boolean z) {
            this.f10432a = j;
            this.b = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (FalcoLifecycleActionMonitor.O(FalcoLifecycleActionMonitor.this) == 0) {
                FalcoLifecycleActionMonitor.S(FalcoLifecycleActionMonitor.this, this.f10432a);
                FalcoLifecycleActionMonitor.U(FalcoLifecycleActionMonitor.this, true);
                FalcoLifecycleActionMonitor.V(FalcoLifecycleActionMonitor.this, this.b);
                FalcoLifecycleActionMonitor.C = this.b;
                if (!FalcoLifecycleActionMonitor.W(FalcoLifecycleActionMonitor.this)) {
                    FalcoLifecycleActionMonitor.A = "WARM";
                    FalcoLifecycleActionMonitor.B = this.f10432a;
                    tz8 tz8Var = FalcoGlobalTracer.get();
                    if (tz8Var == null) {
                        ALog.e("falco.LifeCycleActionMonitor", "[onActivityCreated] error: tracer is null", null, new Object[0]);
                        FalcoLifecycleActionMonitor.Y(FalcoLifecycleActionMonitor.this, null);
                    } else {
                        FalcoLifecycleActionMonitor.Y(FalcoLifecycleActionMonitor.this, (ez8) tz8Var.d(s.MODULE, s.SCENE).g(this.f10432a).j());
                        FalcoLifecycleActionMonitor.X(FalcoLifecycleActionMonitor.this).y1("launch");
                        FalcoLifecycleActionMonitor.Z(FalcoLifecycleActionMonitor.this).addRecord(new TouchToLoadRecord("launch", FalcoLifecycleActionMonitor.X(FalcoLifecycleActionMonitor.this)));
                    }
                } else {
                    FalcoLifecycleActionMonitor.D = this.b;
                }
                FalcoLifecycleActionMonitor.n(FalcoLifecycleActionMonitor.this);
            }
        }
    }

    public final void d0(long j2, String str, String str2, long j3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cd50b08", new Object[]{this, new Long(j2), str, str2, new Long(j3)});
            return;
        }
        this.n = true;
        tz8 tz8Var = FalcoGlobalTracer.get();
        if (tz8Var == null) {
            ALog.e("falco.LifeCycleActionMonitor", "[doHotLaunch] error: tracer is null", null, new Object[0]);
            this.c = null;
        } else {
            ez8 ez8Var = (ez8) tz8Var.d(s.MODULE, s.SCENE).g(j3).j();
            this.c = ez8Var;
            ez8Var.y1(t.CATEGORY_B2F);
            this.c.y(str);
            this.c.l0(str2);
            this.c.Y1(j3);
            this.c.a2("HOT");
            this.c.Z1(0);
            this.c.S1("B2F");
            this.w.addRecord(new TouchToLoadRecord(t.CATEGORY_B2F, this.c));
        }
        this.o = j2;
    }

    public final void e0(long j2, String str, String str2, long j3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43af6611", new Object[]{this, new Long(j2), str, str2, new Long(j3)});
            return;
        }
        this.f = false;
        this.k = -1L;
        this.l = false;
        this.m = false;
        this.n = false;
        this.o = -1L;
        this.p = false;
        ((HashSet) this.x).clear();
        this.b = this.c;
        this.c = null;
        this.e = null;
        tz8 tz8Var = FalcoGlobalTracer.get();
        if (tz8Var == null) {
            ALog.e("falco.LifeCycleActionMonitor", "[doInBackground] error: tracer is null", null, new Object[0]);
            this.d = null;
        } else {
            ez8 ez8Var = (ez8) tz8Var.d(s.MODULE, s.SCENE).g(j3).j();
            this.d = ez8Var;
            ez8Var.y1(t.CATEGORY_F2B);
            this.d.y(str);
            this.d.l0(str2);
            ez8 ez8Var2 = this.b;
            if (ez8Var2 != null) {
                this.d.Y1(j0(ez8Var2, ez8.LAUNCH_START).longValue());
                this.d.a2(k0(this.b, ez8.LAUNCH_TYPE));
            }
            this.d.d2(n.LEAVE_TYPE_F2B);
            this.d.Z1(1);
            this.d.Q(str);
            this.d.B(str2);
            this.d.S1(n.LEAVE_TYPE_F2B);
            a0(this.d);
            this.w.addRecord(new TouchToLoadRecord(t.CATEGORY_F2B, this.d));
            this.d.finish();
        }
        this.q = false;
        this.t = -1L;
        this.u = -1L;
        this.v = null;
        for (String str3 : ((HashMap) this.y).keySet()) {
            ((HashMap) this.y).put(str3, null);
        }
    }

    public final void c0(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eacf1fbf", new Object[]{this, map});
            return;
        }
        try {
            String n0 = n0(map.get(ah0.AFC_ID));
            Long m0 = m0(map.get("flow_start"));
            String n02 = n0(map.get("source_url"));
            if (!this.q) {
                this.r = n0;
                this.s = n02;
                this.q = true;
            }
            ALog.e("falco.LifeCycleActionMonitor", "[onFlowEnter]", null, "timestamp", m0);
        } catch (Exception e2) {
            ALog.e("falco.LifeCycleActionMonitor", "[onFlowEnter] error: some exception happened", null, e2, new Object[0]);
        }
    }
}
