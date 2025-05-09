package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.api.Login;
import com.taobao.mytaobao.base.MtbGlobalEnv;
import com.taobao.tao.log.TLog;
import java.util.UUID;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class z6t implements qyd {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final qyd t = new dd8();
    public static final ScheduledThreadPoolExecutor u;
    public volatile int b;
    public volatile long c;
    public volatile long e;
    public volatile long f;
    public volatile long g;
    public volatile long h;
    public volatile long i;
    public volatile long j;
    public volatile long k;
    public volatile long l;
    public volatile long m;
    public volatile long n;
    public volatile long o;
    public volatile boolean p;
    public volatile boolean q;
    public volatile boolean r;
    public volatile String s;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a implements ThreadFactory {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
            }
            return new Thread(runnable, "mtbBasementMonitor");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f32576a;

        public b(int i) {
            this.f32576a = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            z6t z6tVar = z6t.this;
            int i = this.f32576a;
            boolean checkSessionValid = Login.checkSessionValid();
            z6t.A(z6tVar, "structProcessorWithType:" + i + " isLoggedIn:" + checkSessionValid);
            if (Login.checkSessionValid()) {
                if (z6t.D(z6t.this) != 0) {
                    z6t z6tVar2 = z6t.this;
                    int D = z6t.D(z6tVar2);
                    int i2 = this.f32576a;
                    z6t.A(z6tVar2, "TaoLiveStartLinkMonitor exception oldType:" + D + " newType:" + i2);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("oldType", (Object) Integer.valueOf(z6t.D(z6t.this)));
                    jSONObject.put("newType", (Object) Integer.valueOf(this.f32576a));
                    if (com.taobao.mytaobao.basement.a.d()) {
                        jSONObject.put("isWeex", (Object) Boolean.TRUE);
                    }
                    s32.c().g("StructProcessorException", jSONObject, 1.0d, false);
                }
                z6t.E(z6t.this, this.f32576a);
                z6t.w(z6t.this, System.currentTimeMillis());
                z6t.y(z6t.this, -1L);
                z6t.B(z6t.this, -1L);
                z6t.I(z6t.this, -1L);
                z6t.K(z6t.this, -1L);
                z6t.M(z6t.this, -1L);
                z6t.i(z6t.this, -1L);
                z6t.k(z6t.this, -1L);
                z6t.m(z6t.this, -1L);
                z6t.o(z6t.this, -1L);
                z6t.q(z6t.this, -1L);
                z6t.s(z6t.this, UUID.randomUUID().toString());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f32577a;

        public c(int i) {
            this.f32577a = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                z6t.t(z6t.this, this.f32577a, null);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f32578a;

        public d(String str) {
            this.f32578a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (z6t.D(z6t.this) != 0) {
                long currentTimeMillis = System.currentTimeMillis();
                if (TextUtils.equals(this.f32578a, "PageInit")) {
                    if (z6t.x(z6t.this) < 0) {
                        z6t.y(z6t.this, currentTimeMillis);
                    } else {
                        return;
                    }
                } else if (TextUtils.equals(this.f32578a, "MainInterface")) {
                    if (z6t.z(z6t.this) < 0) {
                        z6t.B(z6t.this, currentTimeMillis);
                    } else {
                        return;
                    }
                } else if (TextUtils.equals(this.f32578a, "NaitveRender")) {
                    if (z6t.C(z6t.this) < 0) {
                        z6t.I(z6t.this, currentTimeMillis);
                    } else {
                        return;
                    }
                } else if (TextUtils.equals(this.f32578a, "PreloadInterface")) {
                    if (z6t.J(z6t.this) < 0) {
                        z6t.K(z6t.this, currentTimeMillis);
                    } else {
                        return;
                    }
                } else if (TextUtils.equals(this.f32578a, "WebCreat")) {
                    if (z6t.L(z6t.this) < 0) {
                        z6t.M(z6t.this, currentTimeMillis);
                    } else {
                        return;
                    }
                } else if (TextUtils.equals(this.f32578a, "WebLoad")) {
                    if (z6t.h(z6t.this) < 0) {
                        z6t.i(z6t.this, currentTimeMillis);
                    } else {
                        return;
                    }
                } else if (TextUtils.equals(this.f32578a, "firstPreload")) {
                    z6t.k(z6t.this, currentTimeMillis);
                } else if (TextUtils.equals(this.f32578a, "secondPreload")) {
                    z6t.m(z6t.this, currentTimeMillis);
                } else if (TextUtils.equals(this.f32578a, "renderList")) {
                    z6t.o(z6t.this, currentTimeMillis);
                } else if (TextUtils.equals(this.f32578a, "renderFirstCard")) {
                    z6t.q(z6t.this, currentTimeMillis);
                }
                z6t z6tVar = z6t.this;
                String str = this.f32578a;
                String valueOf = String.valueOf(currentTimeMillis);
                z6t.A(z6tVar, "startPoint step:" + str + " startTime:" + valueOf);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class f {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final z6t f32580a = new z6t(null);

        static {
            t2o.a(745537624);
        }

        public static /* synthetic */ z6t a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (z6t) ipChange.ipc$dispatch("cc99ab5d", new Object[0]);
            }
            return f32580a;
        }
    }

    static {
        t2o.a(745537618);
        t2o.a(745537614);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new a());
        u = scheduledThreadPoolExecutor;
        scheduledThreadPoolExecutor.setKeepAliveTime(10000L, TimeUnit.MILLISECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    public /* synthetic */ z6t(a aVar) {
        this();
    }

    public static /* synthetic */ void A(z6t z6tVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f08af02", new Object[]{z6tVar, str});
        } else {
            z6tVar.P(str);
        }
    }

    public static /* synthetic */ long B(z6t z6tVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("61e2fc3a", new Object[]{z6tVar, new Long(j)})).longValue();
        }
        z6tVar.g = j;
        return j;
    }

    public static /* synthetic */ long C(z6t z6tVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f9184df1", new Object[]{z6tVar})).longValue();
        }
        return z6tVar.h;
    }

    public static /* synthetic */ int D(z6t z6tVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8a125eec", new Object[]{z6tVar})).intValue();
        }
        return z6tVar.b;
    }

    public static /* synthetic */ int E(z6t z6tVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8c99035b", new Object[]{z6tVar, new Integer(i)})).intValue();
        }
        z6tVar.b = i;
        return i;
    }

    public static /* synthetic */ long I(z6t z6tVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fe50f899", new Object[]{z6tVar, new Long(j)})).longValue();
        }
        z6tVar.h = j;
        return j;
    }

    public static /* synthetic */ long J(z6t z6tVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d4d9c9b2", new Object[]{z6tVar})).longValue();
        }
        return z6tVar.i;
    }

    public static /* synthetic */ long K(z6t z6tVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9abef4f8", new Object[]{z6tVar, new Long(j)})).longValue();
        }
        z6tVar.i = j;
        return j;
    }

    public static /* synthetic */ long L(z6t z6tVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b09b4573", new Object[]{z6tVar})).longValue();
        }
        return z6tVar.j;
    }

    public static /* synthetic */ long M(z6t z6tVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("372cf157", new Object[]{z6tVar, new Long(j)})).longValue();
        }
        z6tVar.j = j;
        return j;
    }

    public static JSONObject Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("fe8239d4", new Object[0]);
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("nodeLoadSuccess", (Object) "false");
        return jSONObject;
    }

    public static qyd S() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qyd) ipChange.ipc$dispatch("b5af9ea4", new Object[0]);
        }
        return T(false);
    }

    public static qyd T(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qyd) ipChange.ipc$dispatch("d4023994", new Object[]{new Boolean(z)});
        }
        if (MtbGlobalEnv.p()) {
            return t;
        }
        if (z) {
            return t;
        }
        return f.a();
    }

    public static void W(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9dd52d5", new Object[]{str});
        } else {
            TLog.loge("basementLaunch", "basementLaunch", str);
        }
    }

    public static /* synthetic */ long h(z6t z6tVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ab11d059", new Object[]{z6tVar})).longValue();
        }
        return z6tVar.k;
    }

    public static /* synthetic */ long i(z6t z6tVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8b87c331", new Object[]{z6tVar, new Long(j)})).longValue();
        }
        z6tVar.k = j;
        return j;
    }

    public static /* synthetic */ long j(z6t z6tVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("86d34c1a", new Object[]{z6tVar})).longValue();
        }
        return z6tVar.l;
    }

    public static /* synthetic */ long k(z6t z6tVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("27f5bf90", new Object[]{z6tVar, new Long(j)})).longValue();
        }
        z6tVar.l = j;
        return j;
    }

    public static /* synthetic */ long l(z6t z6tVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6294c7db", new Object[]{z6tVar})).longValue();
        }
        return z6tVar.m;
    }

    public static /* synthetic */ long m(z6t z6tVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c463bbef", new Object[]{z6tVar, new Long(j)})).longValue();
        }
        z6tVar.m = j;
        return j;
    }

    public static /* synthetic */ long n(z6t z6tVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3e56439c", new Object[]{z6tVar})).longValue();
        }
        return z6tVar.n;
    }

    public static /* synthetic */ long o(z6t z6tVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("60d1b84e", new Object[]{z6tVar, new Long(j)})).longValue();
        }
        z6tVar.n = j;
        return j;
    }

    public static /* synthetic */ long p(z6t z6tVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1a17bf5d", new Object[]{z6tVar})).longValue();
        }
        return z6tVar.o;
    }

    public static /* synthetic */ long q(z6t z6tVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fd3fb4ad", new Object[]{z6tVar, new Long(j)})).longValue();
        }
        z6tVar.o = j;
        return j;
    }

    public static /* synthetic */ String r(z6t z6tVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7f8d32b6", new Object[]{z6tVar});
        }
        return z6tVar.s;
    }

    public static /* synthetic */ String s(z6t z6tVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4a65fd6a", new Object[]{z6tVar, str});
        }
        z6tVar.s = str;
        return str;
    }

    public static /* synthetic */ void t(z6t z6tVar, int i, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d78cb078", new Object[]{z6tVar, new Integer(i), jSONObject});
        } else {
            z6tVar.N(i, jSONObject);
        }
    }

    public static /* synthetic */ boolean u(z6t z6tVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d289e5ea", new Object[]{z6tVar, new Boolean(z)})).booleanValue();
        }
        z6tVar.q = z;
        return z;
    }

    public static /* synthetic */ void v(z6t z6tVar, String str, long j, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79e925e3", new Object[]{z6tVar, str, new Long(j), jSONObject});
        } else {
            z6tVar.Y(str, j, jSONObject);
        }
    }

    public static /* synthetic */ long w(z6t z6tVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2907037c", new Object[]{z6tVar, new Long(j)})).longValue();
        }
        z6tVar.e = j;
        return j;
    }

    public static /* synthetic */ long x(z6t z6tVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4195566f", new Object[]{z6tVar})).longValue();
        }
        return z6tVar.f;
    }

    public static /* synthetic */ long y(z6t z6tVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c574ffdb", new Object[]{z6tVar, new Long(j)})).longValue();
        }
        z6tVar.f = j;
        return j;
    }

    public static /* synthetic */ long z(z6t z6tVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1d56d230", new Object[]{z6tVar})).longValue();
        }
        return z6tVar.g;
    }

    public final long O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f9ddb63e", new Object[]{this})).longValue();
        }
        long j = c21.g().getLong("startProcessSystemTime", 0L);
        if (j <= 0) {
            return 0L;
        }
        return System.currentTimeMillis() - j;
    }

    public final void P(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21017bac", new Object[]{this, str});
            return;
        }
        TLog.loge("basementLaunch", "MyTaobao_TaoFriend", str + ",traceId=" + this.s);
    }

    public final void Y(String str, long j, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1f1db53", new Object[]{this, str, new Long(j), jSONObject});
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        if (jSONObject != null) {
            jSONObject2.putAll(jSONObject);
        }
        if (!jSONObject2.containsKey("nodeLoadSuccess")) {
            jSONObject2.put("nodeLoadSuccess", (Object) "true");
        }
        jSONObject2.put("timeFromAppLaunch", (Object) Long.valueOf(this.c));
        jSONObject2.put("deviceLeavel", (Object) Integer.valueOf(MtbGlobalEnv.f()));
        jSONObject2.put("startLinkType", (Object) Integer.valueOf(this.b));
        jSONObject2.put(pg1.ATOM_EXT_nodeType, (Object) str);
        jSONObject2.put("bizType", (Object) MtbGlobalEnv.a());
        jSONObject2.put("time", (Object) Long.valueOf(j));
        if (com.taobao.mytaobao.basement.a.d()) {
            jSONObject2.put("isWeex", (Object) Boolean.TRUE);
        }
        jSONObject2.put("traceId", (Object) this.s);
        String jSONString = jSONObject2.toJSONString();
        r4v.a(s32.MODULE_NAME, 19997, "TBLoadPerformance", null, null, jSONObject2);
        s32.c().g("TBLoadPerformance", jSONObject2, 1.0d, false);
        P("TaoLiveStartLinkMonitor monitorFineNode:" + jSONString);
    }

    @Override // tb.qyd
    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8ff64a", new Object[]{this, new Boolean(z)});
            return;
        }
        P("TaoLiveStartLinkMonitor setMytaobaoLocalDataValid:" + z);
        this.p = z;
    }

    @Override // tb.qyd
    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d044c341", new Object[]{this, str});
        } else {
            u.execute(new d(str));
        }
    }

    @Override // tb.qyd
    public void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87c7db8e", new Object[]{this, new Boolean(z)});
        } else {
            this.r = z;
        }
    }

    @Override // tb.qyd
    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("49c09c8a", new Object[]{this})).booleanValue();
        }
        if (this.b == 0) {
            return true;
        }
        return false;
    }

    @Override // tb.qyd
    public void e(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13519748", new Object[]{this, str, jSONObject});
        } else {
            u.execute(new e(str, jSONObject));
        }
    }

    @Override // tb.qyd
    public void f(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd365e00", new Object[]{this, new Integer(i)});
        } else {
            u.execute(new c(i));
        }
    }

    @Override // tb.qyd
    public void g(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d3e2cff", new Object[]{this, new Integer(i)});
        } else {
            u.execute(new b(i));
        }
    }

    public z6t() {
        this.b = 0;
        this.c = O();
    }

    public final void X(int i, JSONObject jSONObject) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ed59af7", new Object[]{this, new Integer(i), jSONObject});
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        if (jSONObject != null) {
            jSONObject2.putAll(jSONObject);
        }
        if (i == 4) {
            str = "true";
        } else {
            str = "false";
        }
        jSONObject2.put("nodeLoadSuccess", (Object) str);
        jSONObject2.put("timeFromAppLaunch", (Object) Long.valueOf(this.c));
        jSONObject2.put("deviceLeavel", (Object) Integer.valueOf(MtbGlobalEnv.f()));
        jSONObject2.put("startLinkType", (Object) Integer.valueOf(this.b));
        jSONObject2.put(pg1.ATOM_EXT_nodeType, (Object) "CompleteFlow");
        jSONObject2.put("bizType", (Object) MtbGlobalEnv.a());
        jSONObject2.put("time", (Object) Long.valueOf(System.currentTimeMillis() - this.e));
        jSONObject2.put("destructType", (Object) Integer.valueOf(i));
        jSONObject2.put("mytaobaoLocalDataValid", (Object) Integer.valueOf(this.p ? 1 : 0));
        jSONObject2.put("taoLiveLocalDataValid", (Object) Integer.valueOf(this.q ? 1 : 0));
        jSONObject2.put("taoLiveVisibleWhenInit", (Object) Integer.valueOf(this.r ? 1 : 0));
        jSONObject2.put("isUCCoreInit", (Object) 0);
        if (com.taobao.mytaobao.basement.a.d()) {
            jSONObject2.put("isWeex", (Object) Boolean.TRUE);
        }
        jSONObject2.put("traceId", (Object) this.s);
        String jSONString = jSONObject2.toJSONString();
        r4v.a(s32.MODULE_NAME, 19997, "TBLoadPerformance", null, null, jSONObject2);
        s32.c().g("TBLoadPerformance", jSONObject2, 1.0d, false);
        P("TaoLiveStartLinkMonitor monitorCompleteFlowNode:" + jSONString);
    }

    public final void N(int i, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a3b9cf0", new Object[]{this, new Integer(i), jSONObject});
            return;
        }
        boolean checkSessionValid = Login.checkSessionValid();
        int i2 = this.b;
        P("destructProcessorWithType:" + i + " isLoggedIn:" + checkSessionValid + " startLinkType:" + i2);
        if (this.b != 0) {
            X(i, jSONObject);
        } else if (i == 3 || i == 4) {
            int i3 = this.b;
            P("TaoLiveStartLinkMonitor exception startLinkType:" + i3 + " destructType:" + i);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("startLinkType", (Object) Integer.valueOf(this.b));
            jSONObject2.put("destructType", (Object) Integer.valueOf(i));
            if (com.taobao.mytaobao.basement.a.d()) {
                jSONObject2.put("isWeex", (Object) Boolean.TRUE);
            }
            jSONObject2.put("traceId", (Object) this.s);
            s32.c().g("DestructProcessorException", jSONObject2, 1.0d, false);
        }
        this.b = 0;
        this.f = 0L;
        this.g = 0L;
        this.h = 0L;
        this.i = 0L;
        this.j = 0L;
        this.k = 0L;
        this.l = 0L;
        this.m = 0L;
        this.n = 0L;
        this.o = 0L;
        this.p = false;
        this.q = false;
        this.r = false;
        this.s = null;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f32579a;
        public final /* synthetic */ JSONObject b;

        public e(String str, JSONObject jSONObject) {
            this.f32579a = str;
            this.b = jSONObject;
        }

        /* JADX WARN: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:99:0x0253  */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void run() {
            /*
                Method dump skipped, instructions count: 601
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: tb.z6t.e.run():void");
        }
    }
}
