package tb;

import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.LruCache;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.analysis.v3.FalcoGlobalTracer;
import com.taobao.android.weex.WeexInstanceImpl;
import com.taobao.android.weex.config.WeexInstanceConfig;
import com.taobao.android.weex_framework.performance.WMInstanceApm;
import com.taobao.falco.m;
import com.taobao.falco.u;
import com.taobao.monitor.procedure.IPage;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.rce;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class j3x implements tae {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_INSTANCE_ID = "wxInstanceId";
    public static final String KEY_REMOTE_QKING = "wxRemoteQking";
    public static final String KEY_UNI_FIRST_PAINT = "wxUniFirstPaint";
    public static final String KEY_USER_ACTION_T = "wxUserActionT";
    public static final int v = 5000;
    public static boolean w = false;

    /* renamed from: a  reason: collision with root package name */
    public String f21746a;
    public abe b;
    public boolean c;
    public m e;
    public uy8 f;
    public m g;
    public rce j;
    public mdd k;
    public u l;
    public boolean m;
    public u.a n;
    public View p;
    public WeexInstanceImpl u;
    public LruCache<Integer, l3x> d = new LruCache<>(50);
    public volatile boolean h = false;
    public final CopyOnWriteArrayList<yio> i = new CopyOnWriteArrayList<>();
    public WeexInstanceConfig.WeexEmbedPresentMode o = WeexInstanceConfig.WeexEmbedPresentMode.WeexEmbedPresentModeCard;
    public boolean q = false;
    public boolean r = false;
    public boolean s = false;
    public boolean t = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements IPage.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f21747a;
        public final /* synthetic */ ice b;

        public a(int i, ice iceVar) {
            this.f21747a = i;
            this.b = iceVar;
        }

        @Override // com.taobao.monitor.procedure.IPage.a
        public jn1 a(IPage iPage) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (jn1) ipChange.ipc$dispatch("b3fd0df7", new Object[]{this, iPage});
            }
            try {
                return j3x.r(j3x.this, this.f21747a, this.b, iPage);
            } catch (Throwable th) {
                dwh.h("WeexAPMAdapter report error", th);
                return null;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements rce.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        public void a(Object obj, Object obj2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d4d4c530", new Object[]{this, obj, obj2});
            } else if ((obj instanceof m) && (obj2 instanceof uy8)) {
                j3x.k(j3x.this, (m) obj);
                j3x.n(j3x.this, (uy8) obj2);
                j3x.s(j3x.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class c implements m.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ long f21749a;
        public final /* synthetic */ tz8 b;

        public c(long j, tz8 tz8Var) {
            this.f21749a = j;
            this.b = tz8Var;
        }

        @Override // com.taobao.falco.m.a
        public void a(m mVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fd090d9d", new Object[]{this, mVar});
                return;
            }
            j3x.k(j3x.this, mVar);
            j3x.j(j3x.this).c0(Long.valueOf(this.f21749a));
            j3x.j(j3x.this).K(Long.valueOf(this.f21749a));
            j3x j3xVar = j3x.this;
            j3x.t(j3xVar, j3x.j(j3xVar));
            j3x.n(j3x.this, this.b.d("themis_load", "").f(j3x.j(j3x.this)).g(j3x.j(j3x.this).z()).d());
            j3x.s(j3x.this);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                j3x.v(j3x.this).b(j3x.u(j3x.this));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class e implements m.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ tz8 f21751a;

        public e(tz8 tz8Var) {
            this.f21751a = tz8Var;
        }

        @Override // com.taobao.falco.m.a
        public void a(m mVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fd090d9d", new Object[]{this, mVar});
                return;
            }
            j3x.w(j3x.this, mVar);
            if (j3x.x(j3x.this) == WeexInstanceConfig.WeexEmbedPresentMode.WeexEmbedPresentModePage) {
                j3x.k(j3x.this, mVar);
            } else {
                j3x.k(j3x.this, this.f21751a.d(m.MODULE, "tap").f(mVar).e());
                if (mVar != null) {
                    j3x.j(j3x.this).r0(mVar);
                }
            }
            j3x.n(j3x.this, this.f21751a.d("themis_load", "").f(j3x.j(j3x.this)).g(j3x.j(j3x.this).z()).d());
            if (mVar != null) {
                j3x.l(j3x.this).f(j3x.KEY_USER_ACTION_T, Long.valueOf(mVar.z()));
            }
            j3x.s(j3x.this);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class f extends yio {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        public static /* synthetic */ Object ipc$super(f fVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_ability/apm/WeexAPMAdapter$5");
        }

        @Override // tb.yio
        public void e() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
                return;
            }
            if (j3x.y(j3x.this) != null) {
                j3x.y(j3x.this).onEnd();
            }
            if (!(j3x.j(j3x.this) == null || j3x.x(j3x.this) == WeexInstanceConfig.WeexEmbedPresentMode.WeexEmbedPresentModePopup || j3x.x(j3x.this) == WeexInstanceConfig.WeexEmbedPresentMode.WeexEmbedPresentModePage || j3x.y(j3x.this) != null)) {
                j3x.j(j3x.this).finish();
            }
            if (j3x.l(j3x.this) != null) {
                j3x.l(j3x.this).finish();
            }
            if (j3x.z(j3x.this) && j3x.u(j3x.this) != null) {
                j3x.u(j3x.this).d = "back";
                if (j3x.v(j3x.this) != null) {
                    j3x.v(j3x.this).e(j3x.u(j3x.this));
                    j3x.v(j3x.this).b(j3x.u(j3x.this));
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class g extends yio {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public g() {
        }

        public static /* synthetic */ Object ipc$super(g gVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_ability/apm/WeexAPMAdapter$6");
        }

        @Override // tb.yio
        public void e() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
                return;
            }
            if (!(j3x.j(j3x.this) == null || j3x.x(j3x.this) == WeexInstanceConfig.WeexEmbedPresentMode.WeexEmbedPresentModePopup || j3x.x(j3x.this) == WeexInstanceConfig.WeexEmbedPresentMode.WeexEmbedPresentModePage || j3x.y(j3x.this) != null)) {
                j3x.j(j3x.this).finish();
            }
            if (j3x.m(j3x.this) && j3x.o(j3x.this) && j3x.j(j3x.this) != null) {
                j3x.j(j3x.this).m();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class h extends yio {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ String d;
        public final /* synthetic */ long e;

        public h(String str, long j) {
            this.d = str;
            this.e = j;
        }

        public static /* synthetic */ Object ipc$super(h hVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_ability/apm/WeexAPMAdapter$7");
        }

        @Override // tb.yio
        public void e() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
            } else {
                j3x.p(j3x.this, this.d, this.e);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class i extends yio {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ String d;
        public final /* synthetic */ Object e;

        public i(String str, Object obj) {
            this.d = str;
            this.e = obj;
        }

        public static /* synthetic */ Object ipc$super(i iVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_ability/apm/WeexAPMAdapter$8");
        }

        @Override // tb.yio
        public void e() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
            } else {
                j3x.q(j3x.this, this.d, this.e.toString());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class j implements IPage.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f21752a;
        public final /* synthetic */ ice b;

        public j(int i, ice iceVar) {
            this.f21752a = i;
            this.b = iceVar;
        }

        @Override // com.taobao.monitor.procedure.IPage.a
        public jn1 a(IPage iPage) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (jn1) ipChange.ipc$dispatch("b3fd0df7", new Object[]{this, iPage});
            }
            try {
                return j3x.r(j3x.this, this.f21752a, this.b, iPage);
            } catch (Throwable th) {
                dwh.h("WeexAPMAdapter report error", th);
                return null;
            }
        }
    }

    static {
        t2o.a(980418608);
        t2o.a(982516196);
    }

    public static /* synthetic */ m j(j3x j3xVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (m) ipChange.ipc$dispatch("a2588494", new Object[]{j3xVar});
        }
        return j3xVar.e;
    }

    public static /* synthetic */ m k(j3x j3xVar, m mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (m) ipChange.ipc$dispatch("79afc181", new Object[]{j3xVar, mVar});
        }
        j3xVar.e = mVar;
        return mVar;
    }

    public static /* synthetic */ uy8 l(j3x j3xVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (uy8) ipChange.ipc$dispatch("fc61f07c", new Object[]{j3xVar});
        }
        return j3xVar.f;
    }

    public static /* synthetic */ boolean m(j3x j3xVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("115fdcc6", new Object[]{j3xVar})).booleanValue();
        }
        return j3xVar.s;
    }

    public static /* synthetic */ uy8 n(j3x j3xVar, uy8 uy8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (uy8) ipChange.ipc$dispatch("4ce22b80", new Object[]{j3xVar, uy8Var});
        }
        j3xVar.f = uy8Var;
        return uy8Var;
    }

    public static /* synthetic */ boolean o(j3x j3xVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2215a987", new Object[]{j3xVar})).booleanValue();
        }
        return j3xVar.q;
    }

    public static /* synthetic */ void p(j3x j3xVar, String str, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81024176", new Object[]{j3xVar, str, new Long(j2)});
        } else {
            j3xVar.I(str, j2);
        }
    }

    public static /* synthetic */ void q(j3x j3xVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6061999", new Object[]{j3xVar, str, str2});
        } else {
            j3xVar.H(str, str2);
        }
    }

    public static /* synthetic */ jn1 r(j3x j3xVar, int i2, ice iceVar, IPage iPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jn1) ipChange.ipc$dispatch("eda33899", new Object[]{j3xVar, new Integer(i2), iceVar, iPage});
        }
        return j3xVar.D(i2, iceVar, iPage);
    }

    public static /* synthetic */ void s(j3x j3xVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79c7295", new Object[]{j3xVar});
        } else {
            j3xVar.F();
        }
    }

    public static /* synthetic */ void t(j3x j3xVar, m mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea022387", new Object[]{j3xVar, mVar});
        } else {
            j3xVar.L(mVar);
        }
    }

    public static /* synthetic */ u.a u(j3x j3xVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (u.a) ipChange.ipc$dispatch("d1939d62", new Object[]{j3xVar});
        }
        return j3xVar.n;
    }

    public static /* synthetic */ u v(j3x j3xVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (u) ipChange.ipc$dispatch("682522ef", new Object[]{j3xVar});
        }
        return j3xVar.l;
    }

    public static /* synthetic */ m w(j3x j3xVar, m mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (m) ipChange.ipc$dispatch("5877353b", new Object[]{j3xVar, mVar});
        }
        j3xVar.g = mVar;
        return mVar;
    }

    public static /* synthetic */ WeexInstanceConfig.WeexEmbedPresentMode x(j3x j3xVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexInstanceConfig.WeexEmbedPresentMode) ipChange.ipc$dispatch("ca96ca8b", new Object[]{j3xVar});
        }
        return j3xVar.o;
    }

    public static /* synthetic */ rce y(j3x j3xVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rce) ipChange.ipc$dispatch("6ea41465", new Object[]{j3xVar});
        }
        return j3xVar.j;
    }

    public static /* synthetic */ boolean z(j3x j3xVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7c950be0", new Object[]{j3xVar})).booleanValue();
        }
        return j3xVar.m;
    }

    public final void A(yio yioVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19d2f869", new Object[]{this, yioVar});
        } else if (this.h) {
            yioVar.run();
        } else {
            this.i.add(yioVar);
        }
    }

    public long B(long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e82938de", new Object[]{this, new Long(j2)})).longValue();
        }
        if (j2 > 0) {
            return (System.currentTimeMillis() - SystemClock.uptimeMillis()) + j2;
        }
        return 0L;
    }

    public final long C(long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("93a91012", new Object[]{this, new Long(j2)})).longValue();
        }
        if (j2 > 0) {
            return (SystemClock.uptimeMillis() - System.currentTimeMillis()) + j2;
        }
        return 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00af A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final tb.jn1 D(int r13, tb.ice r14, com.taobao.monitor.procedure.IPage r15) {
        /*
            Method dump skipped, instructions count: 583
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.j3x.D(int, tb.ice, com.taobao.monitor.procedure.IPage):tb.jn1");
    }

    public final void G(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36768998", new Object[]{this, str, obj});
        } else if (this.f != null) {
            H(str, obj.toString());
        } else {
            this.i.add(new i(str, obj));
        }
    }

    public final void H(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd8665ad", new Object[]{this, str, str2});
            return;
        }
        if ("wxBundleUrl".equals(str)) {
            this.e.l0(str2);
        }
        if (WMInstanceApm.KEY_PAGE_PROPERTIES_RUM_PAGE_TYPE.equals(str)) {
            this.e.F(str2);
        }
        if (WMInstanceApm.KEY_PAGE_PROPERTIES_IS_FIRST_LOAD.equals(str)) {
            this.e.M("true".equals(str2));
        }
        this.f.X(str, str2);
    }

    public final void I(String str, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cea53360", new Object[]{this, str, new Long(j2)});
        } else if (this.f != null) {
            long B = B(j2);
            if (this.e != null) {
                if (WMInstanceApm.KEY_PAGE_STAGES_CUSTOM_START_TIME.equals(str)) {
                    this.e.a0(Long.valueOf(j2));
                    this.f.f(KEY_USER_ACTION_T, Long.valueOf(j2));
                } else if (WMInstanceApm.KEY_PAGE_STAGES_STANDARD_CONTAINER_START.equals(str)) {
                    this.e.D(Long.valueOf(j2));
                } else if ("wxStartDownLoadBundle".equals(str)) {
                    this.e.e0(Long.valueOf(B));
                } else if ("wxEndDownLoadBundle".equals(str)) {
                    this.e.E(Long.valueOf(B));
                } else if (KEY_UNI_FIRST_PAINT.equals(str)) {
                    this.e.q0(Long.valueOf(B));
                } else if (WMInstanceApm.KEY_PAGE_STAGES_RASTER_INTERACTION_OPT.equals(str)) {
                    this.e.u(Long.valueOf(B));
                } else if (WMInstanceApm.KEY_PAGE_STAGES_RASTER_INTERACTION_SCREEN_RATIO.equals(str)) {
                    this.e.G(Long.valueOf(B));
                } else if (WMInstanceApm.KEY_PAGE_STAGES_FFSP.equals(str) && this.r) {
                    this.p.setTag(dgw.APM_VIEW_TOKEN, dgw.APM_VIEW_VALID);
                }
            }
            if (WMInstanceApm.KEY_PAGE_STAGES_CUSTOM_START_TIME.equals(str) || WMInstanceApm.KEY_PAGE_STAGES_STANDARD_CONTAINER_START.equals(str) || WMInstanceApm.KEY_PAGE_STAGES_FPS.equals(str)) {
                this.f.f(str, Long.valueOf(j2));
            } else {
                this.f.f(str, Long.valueOf(B));
            }
        }
    }

    public final void J(String str, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b7191b1", new Object[]{this, str, new Long(j2)});
        } else if (this.f == null) {
            this.i.add(new h(str, j2));
        } else {
            I(str, j2);
        }
    }

    public final void K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8d87fc4", new Object[]{this});
        } else {
            a("wxDeviceLevel", Integer.valueOf(o3x.c()));
        }
    }

    public final void L(m mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a09c8dd9", new Object[]{this, mVar});
            return;
        }
        this.q = true;
        mVar.T(v);
    }

    @Override // tb.tae
    public void a(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("539dc3c3", new Object[]{this, str, obj});
            return;
        }
        G(str, obj);
        mdd mddVar = this.k;
        if (mddVar != null) {
            mddVar.a(str, obj);
        }
        abe abeVar = this.b;
        if (abeVar != null) {
            abeVar.a(str, obj);
        }
    }

    @Override // tb.tae
    public void b(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("385ab762", new Object[]{this, str, map});
            return;
        }
        abe abeVar = this.b;
        if (abeVar != null) {
            abeVar.b(str, map);
        }
    }

    @Override // tb.tae
    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e5ed0dd0", new Object[]{this});
        }
        abe abeVar = this.b;
        if (abeVar == null) {
            return "";
        }
        return abeVar.c();
    }

    @Override // tb.tae
    public void d(int i2, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b05f92b", new Object[]{this, new Integer(i2), str, jSONObject});
            return;
        }
        if (this.d == null) {
            this.d = new LruCache<>(50);
        }
        l3x l3xVar = this.d.get(Integer.valueOf(i2));
        if (l3xVar == null) {
            l3xVar = new l3x();
            this.d.put(Integer.valueOf(i2), l3xVar);
        }
        if (l3xVar.a().get(str) != null) {
            l3xVar.a().get(str).putAll(jSONObject);
        } else {
            l3xVar.a().put(str, jSONObject);
        }
    }

    @Override // tb.tae
    public void f(int i2, View view, JSONObject jSONObject, rce rceVar, ice iceVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40896dc3", new Object[]{this, new Integer(i2), view, jSONObject, rceVar, iceVar});
            return;
        }
        boolean z = this.t;
        snl snlVar = snl.f28161a;
        if (z) {
            snlVar.k(view).a(view, new j(i2, iceVar));
        } else {
            snlVar.d(view).a(view, new a(i2, iceVar));
        }
        i(i2, "wxAttachWindowIntervalOpt", SystemClock.uptimeMillis());
        E(String.valueOf(i2), rceVar, view, jSONObject);
    }

    @Override // tb.tae
    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91525537", new Object[]{this});
        } else {
            A(new g());
        }
    }

    @Override // tb.tae
    public void h(int i2, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55d3e949", new Object[]{this, new Integer(i2), str, str2});
            return;
        }
        if (this.d == null) {
            this.d = new LruCache<>(50);
        }
        l3x l3xVar = this.d.get(Integer.valueOf(i2));
        if (l3xVar == null) {
            l3xVar = new l3x();
            this.d.put(Integer.valueOf(i2), l3xVar);
        }
        l3xVar.d().put(str, str2);
    }

    @Override // tb.tae
    public void i(int i2, String str, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b57111ae", new Object[]{this, new Integer(i2), str, new Long(j2)});
            return;
        }
        if (this.d == null) {
            this.d = new LruCache<>(50);
        }
        l3x l3xVar = this.d.get(Integer.valueOf(i2));
        if (l3xVar == null) {
            l3xVar = new l3x();
            this.d.put(Integer.valueOf(i2), l3xVar);
        }
        l3xVar.c().put(str, Long.valueOf(j2));
    }

    @Override // tb.tae
    public void onEnd() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efc72903", new Object[]{this});
            return;
        }
        K();
        A(new f());
        abe abeVar = this.b;
        if (abeVar != null) {
            abeVar.onEnd();
        }
    }

    @Override // tb.tae
    public void onStage(String str, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ba4fb14", new Object[]{this, str, new Long(j2)});
            return;
        }
        J(str, j2);
        abe abeVar = this.b;
        if (abeVar != null) {
            abeVar.onStage(str, j2);
        }
        mdd mddVar = this.k;
        if (mddVar != null) {
            mddVar.j(str, j2);
        }
    }

    public final void F() {
        m mVar;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1fadce1", new Object[]{this});
            return;
        }
        this.h = true;
        if (this.f != null && (mVar = this.e) != null) {
            m mVar2 = this.g;
            if (mVar2 == null) {
                L(mVar);
            } else if (this.o != WeexInstanceConfig.WeexEmbedPresentMode.WeexEmbedPresentModeCard) {
                L(mVar2);
            }
            this.e.Z("weex");
            WeexInstanceImpl weexInstanceImpl = this.u;
            if (weexInstanceImpl != null) {
                weexInstanceImpl.updateApmTime(WMInstanceApm.Stages.NAV_START, C(this.e.z()));
            }
            this.f.X(KEY_INSTANCE_ID, this.f21746a);
            if (Build.VERSION.SDK_INT >= 30) {
                if (w) {
                    str = "true";
                } else {
                    str = "false";
                }
                a(KEY_REMOTE_QKING, str);
            } else {
                a(KEY_REMOTE_QKING, "other");
            }
            if (!this.i.isEmpty()) {
                Iterator<yio> it = this.i.iterator();
                while (it.hasNext()) {
                    it.next().run();
                }
            }
        }
    }

    @Override // tb.tae
    public void e(String str, WeexInstanceImpl weexInstanceImpl) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("769ec4f2", new Object[]{this, str, weexInstanceImpl});
        } else if (!TextUtils.isEmpty(str) && !this.c) {
            this.r = w4x.s("enable-rum-add-view-valid", true, true);
            this.s = w4x.s("rum-enable-cancel-delay", true, true);
            this.t = w4x.s("weex-fix-apm-page-leak", true, true);
            this.f21746a = str;
            this.u = weexInstanceImpl;
            abe a2 = gc.b().a();
            this.b = a2;
            if (a2 != null) {
                if (w4x.s("enable-launch-pro-apm", true, true)) {
                    this.k = vxm.b.e();
                }
                this.b.onStart(str);
                if (Build.VERSION.SDK_INT >= 30) {
                    if (w) {
                        str2 = "true";
                    } else {
                        str2 = "false";
                    }
                    a(KEY_REMOTE_QKING, str2);
                } else {
                    a(KEY_REMOTE_QKING, "other");
                }
                this.c = true;
            }
        }
    }

    public final void E(String str, rce rceVar, View view, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e68e5383", new Object[]{this, str, rceVar, view, jSONObject});
            return;
        }
        this.p = view;
        if (rceVar != null) {
            this.j = rceVar;
            rceVar.a(new b());
            return;
        }
        tz8 tz8Var = FalcoGlobalTracer.get();
        if (tz8Var != null) {
            if (jSONObject.get("embedMode") instanceof WeexInstanceConfig.WeexEmbedPresentMode) {
                this.o = (WeexInstanceConfig.WeexEmbedPresentMode) jSONObject.get("embedMode");
            }
            if (this.o == WeexInstanceConfig.WeexEmbedPresentMode.WeexEmbedPresentModePopup) {
                this.m = true;
                long currentTimeMillis = System.currentTimeMillis();
                String string = jSONObject.getString("bundleUrl");
                u.a aVar = new u.a();
                this.n = aVar;
                aVar.f10480a = view.hashCode();
                u.a aVar2 = this.n;
                aVar2.e = false;
                aVar2.b = "";
                aVar2.c = string;
                aVar2.d = "popOver";
                u h2 = tz8Var.h();
                this.l = h2;
                if (h2 != null) {
                    h2.e(this.n);
                    this.l.c(this.n, new c(currentTimeMillis, tz8Var));
                    view.post(new d());
                    return;
                }
                return;
            }
            tz8Var.j(new e(tz8Var));
        }
    }
}
