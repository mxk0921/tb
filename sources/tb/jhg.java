package tb;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.TBDeviceUtils;
import com.taobao.application.common.IAppLaunchListener;
import com.taobao.falco.n;
import com.taobao.monitor.ProcedureGlobal;
import com.taobao.monitor.impl.common.ProcessStart;
import com.taobao.monitor.impl.trace.ApplicationBackgroundChangedDispatcher;
import com.taobao.monitor.impl.trace.PageLeaveDispatcher;
import com.taobao.monitor.impl.trace.b;
import com.taobao.monitor.impl.trace.g;
import com.taobao.monitor.impl.trace.h;
import com.taobao.monitor.impl.trace.i;
import com.taobao.monitor.impl.trace.j;
import com.taobao.monitor.impl.trace.l;
import com.taobao.monitor.procedure.NotifyApm;
import com.taobao.monitor.procedure.c;
import com.taobao.orange.OConstant;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.cw8;
import tb.lb0;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class jhg extends px implements lb0.a, b.AbstractC0625b, j.h, cw8.a, ApplicationBackgroundChangedDispatcher.b, l.c, g.b, i.b, PageLeaveDispatcher.b, h.b, NotifyApm.a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String COLD = "COLD";
    public static final String HOT = "HOT";
    public static final String RECOVERY_FROM_SAVED_INSTANCE = "recoveryFromSavedInstance";
    public static volatile String W = "COLD";
    public static final String WARM = "WARM";
    public static String X = "onlyPullProcess";
    public String A;
    public volatile boolean B;
    public final IAppLaunchListener C;
    public boolean D;
    public boolean E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public zaq N;
    public zaq O;
    public zaq P;
    public boolean Q;
    public final Map<String, Long> R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public String c;
    public String d;
    public String e;
    public mdd f;
    public zzb g;
    public zzb h;
    public zzb i;
    public zzb j;
    public zzb k;
    public zzb l;
    public zzb m;
    public zzb n;
    public int n0;
    public zzb o;
    public zzb p;
    public final List<String> q;
    public final List<String> r;
    public final List<Integer> s;
    public int u;
    public int v;
    public int w;
    public long x;
    public boolean y;
    public long[] z;

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
                return;
            }
            jhg.this.f.a("utSession", y2v.b().a());
            jhg.S(jhg.this, false);
        }
    }

    public jhg(long j) {
        this.q = new ArrayList(4);
        this.r = new ArrayList(4);
        this.s = new ArrayList();
        this.n0 = 0;
        this.u = 0;
        this.v = 0;
        this.w = 0;
        this.y = false;
        this.A = W;
        this.B = false;
        this.C = b21.s().n();
        this.D = true;
        this.E = true;
        zaq zaqVar = zaq.DEFAULT;
        this.N = zaqVar;
        this.O = zaqVar;
        this.P = zaqVar;
        this.Q = true;
        this.R = new HashMap();
        this.S = true;
        this.T = true;
        this.U = true;
        this.V = false;
        Q(j);
    }

    public static /* synthetic */ boolean S(jhg jhgVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("13f66917", new Object[]{jhgVar, new Boolean(z)})).booleanValue();
        }
        jhgVar.D = z;
        return z;
    }

    public static /* synthetic */ boolean T(jhg jhgVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4cd6c9b6", new Object[]{jhgVar, new Boolean(z)})).booleanValue();
        }
        jhgVar.U = z;
        return z;
    }

    public static /* synthetic */ boolean U(jhg jhgVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("85b72a55", new Object[]{jhgVar, new Boolean(z)})).booleanValue();
        }
        jhgVar.S = z;
        return z;
    }

    public static /* synthetic */ Object ipc$super(jhg jhgVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -410389705) {
            super.R();
            return null;
        } else if (hashCode == 1096318669) {
            super.Q(((Number) objArr[0]).longValue());
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/monitor/impl/processor/launcher/LauncherProcessor");
        }
    }

    @Override // com.taobao.monitor.impl.trace.j.h
    public void C(cll cllVar, float f, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("454264d4", new Object[]{this, cllVar, new Float(f), new Long(j)});
            return;
        }
        Activity f2 = cllVar.f();
        if (f2 != null && W(f2)) {
            this.f.a("onRenderPercent", Float.valueOf(f));
            this.f.a("drawPercentTime", Long.valueOf(j));
        }
    }

    @Override // com.taobao.monitor.impl.trace.j.h
    public void E(cll cllVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42a73191", new Object[]{this, cllVar, new Long(j)});
            return;
        }
        Activity f = cllVar.f();
        String o = cllVar.o();
        if (!TextUtils.isEmpty(o) && f != null && !this.R.containsKey(o)) {
            this.R.put(cllVar.o(), Long.valueOf(j));
            if (W(f)) {
                this.f.a("appInitDuration", Long.valueOf(j - this.x));
                this.f.j("renderStartTime", j);
            }
        }
    }

    @Override // com.taobao.monitor.impl.trace.j.h
    public void G(cll cllVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11148397", new Object[]{this, cllVar, new Long(j)});
            return;
        }
        Activity f = cllVar.f();
        if (f != null && this.S) {
            if (!nnl.i(this.d) && TextUtils.isEmpty(this.c)) {
                this.c = this.d;
            }
            if (W(f)) {
                this.f.a("displayDuration", Long.valueOf(j - this.x));
                this.f.j("displayedTime", j);
                this.f.j("firstScreenPaint", j);
                this.C.d(Y(), 1);
                this.S = false;
                yxm.c(this.f, "firstFrameTime", cllVar.i());
            }
        }
    }

    @Override // com.taobao.monitor.impl.trace.j.h
    public void L(cll cllVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3af607a6", new Object[]{this, cllVar, new Integer(i)});
            return;
        }
        Activity f = cllVar.f();
        if (this.U && f != null && W(f)) {
            this.f.a("errorCode", Integer.valueOf(i));
            this.U = false;
        }
    }

    public boolean W(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e92b43a7", new Object[]{this, activity})).booleanValue();
        }
        return xol.a(activity).equals(this.c);
    }

    public final void X() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ce6bfb7", new Object[]{this});
        } else if (!this.B) {
            this.C.d(!this.A.equals("COLD"), 4);
            this.B = true;
        }
    }

    public final int Y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6bb4037b", new Object[]{this})).intValue();
        }
        return 1 ^ this.A.equals("COLD");
    }

    @Override // com.taobao.monitor.impl.trace.h.b
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b39840", new Object[]{this});
        } else {
            this.n0++;
        }
    }

    @Override // com.taobao.monitor.impl.trace.i.b
    public void e(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b59f8bcd", new Object[]{this, new Integer(i)});
        } else if (i == 0) {
            this.J++;
        } else if (i == 1) {
            this.K++;
        } else if (i == 2) {
            this.L++;
        } else if (i == 3) {
            this.M++;
        }
    }

    @Override // com.taobao.monitor.impl.trace.j.h
    public void f(cll cllVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("587b791e", new Object[]{this, cllVar, new Long(j)});
        } else if (this.E) {
            Activity f = cllVar.f();
            if (f != null && W(f)) {
                this.f.j("customDisplayedTime", j);
            }
            this.E = false;
        }
    }

    @Override // tb.cw8.a
    public void g(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55b93e51", new Object[]{this, new Integer(i)});
        }
    }

    @Override // tb.cw8.a
    public void l(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e069e7c0", new Object[]{this, new Integer(i)});
        }
    }

    @Override // tb.cw8.a
    public void m(String str, int i, int i2, int i3, int i4, int i5, int i6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d825ceeb", new Object[]{this, str, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6)});
        } else if (this.s.size() < 200) {
            this.s.add(Integer.valueOf(i));
            this.u += i2;
            this.v += i3;
            this.w += i4;
        }
    }

    @Override // com.taobao.monitor.impl.trace.j.h
    public void n(cll cllVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68feefe6", new Object[]{this, cllVar, new Long(j)});
        } else if (cllVar.f() != null && W(cllVar.f())) {
            this.f.j("customFirstScreenPaint", j);
        }
    }

    @Override // com.taobao.monitor.impl.trace.g.b
    public void q(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e690afa", new Object[]{this, new Integer(i)});
        } else if (i == 0) {
            this.F++;
        } else if (i == 1) {
            this.G++;
        } else if (i == 2) {
            this.H++;
        } else if (i == 3) {
            this.I++;
        }
    }

    @Override // com.taobao.monitor.procedure.NotifyApm.a
    public void w(Map<String, Object> map) {
        Activity activity;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("129f5d16", new Object[]{this, map});
        } else if (map.containsKey(NotifyApm.KEY_NOTIFY_FINISH_LAUNCH)) {
            X();
        } else {
            Object obj = map.get("activity");
            if (obj instanceof Activity) {
                activity = (Activity) obj;
            } else {
                activity = null;
            }
            w9a.g().f().post(new b(activity));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Activity f21996a;

        public b(Activity activity) {
            this.f21996a = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            Activity activity;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (!TextUtils.isEmpty(jhg.this.c) && (activity = this.f21996a) != null && xol.a(activity).equals(jhg.this.c)) {
                jhg jhgVar = jhg.this;
                jhgVar.c = null;
                jhg.T(jhgVar, true);
                jhg.this.f.a("errorCode", 1);
                jhg.this.f.j("firstInteractiveTime", -1L);
                jhg.this.f.a("firstInteractiveDuration", -1);
                jhg.this.f.a("appInitDuration", -1);
                jhg.this.f.j("renderStartTime", -1L);
                jhg.this.f.a("onRenderPercent", -1);
                jhg.this.f.a("drawPercentTime", -1);
                jhg.this.f.a("displayDuration", -1);
                jhg.this.f.j("displayedTime", -1L);
                jhg.this.f.j("firstScreenPaint", -1L);
                jhg.U(jhg.this, false);
                jhg.this.f.a("interactiveDuration", -1);
                jhg.this.f.a("launchDuration", -1);
                jhg.this.f.j("interactiveTime", -1L);
            }
        }
    }

    @Override // tb.lb0.a
    public void D(Activity activity, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92cd9fc2", new Object[]{this, activity, new Long(j)});
            return;
        }
        HashMap hashMap = new HashMap(2);
        hashMap.put("timestamp", Long.valueOf(j));
        hashMap.put("pageName", xol.c(activity));
        this.f.d("onActivityResumed", hashMap);
        if (this.D && !TextUtils.isEmpty(y2v.b().a())) {
            w9a.g().f().post(new a());
        }
        if (W(activity)) {
            this.f.j("pageStructureTime", j);
        }
    }

    public final void V() {
        long j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bef292a", new Object[]{this});
            return;
        }
        if ("COLD".equals(W)) {
            j = nca.l;
        } else {
            j = out.a();
        }
        this.x = j;
        this.f.a("errorCode", 1);
        this.f.a("launchType", W);
        this.f.a("isFirstInstall", Boolean.valueOf(nca.b));
        this.f.a("isFirstLaunch", Boolean.valueOf(nca.d));
        this.f.a("installType", nca.g);
        this.f.a("oppoCPUResource", nca.n);
        this.f.a("leaveType", "other");
        this.f.a("lastProcessStartTime", Long.valueOf(nca.m));
        this.f.a("systemInitDuration", Long.valueOf(nca.l - nca.i));
        this.f.a("timestampInterval", Long.valueOf(System.currentTimeMillis() - SystemClock.uptimeMillis()));
        this.f.j(OConstant.DIMEN_PROCESS_START_TIME, nca.i);
        this.f.j("appLauncherStartTime", nca.j);
        this.f.j("launchStartTime", nca.l);
        yxm.b(this.f, "lastAppVersion", nca.e);
        yxm.b(this.f, k7m.KEY_DEVICE_TYPE, nca.a());
        if (TBDeviceUtils.p(w9a.g().a())) {
            this.f.a("foldStatus", Integer.valueOf(TBDeviceUtils.a(w9a.g().a())));
        }
        if ("COLD".equals(W) || "WARM".equals(W)) {
            this.f.a("channelExistWhenLaunch", Boolean.valueOf(xym.b()));
        }
        if ("WARM".equals(W)) {
            this.f.a("warnType", X);
        }
        if ("COLD".equals(W)) {
            this.N = zaq.e("apm_startup_root", out.c(nca.i));
        }
    }

    @Override // tb.lb0.a
    public void d(Activity activity, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7d13ac0", new Object[]{this, activity, new Long(j)});
            return;
        }
        HashMap hashMap = new HashMap(2);
        hashMap.put("timestamp", Long.valueOf(j));
        hashMap.put("pageName", xol.c(activity));
        this.f.d("onActivityDestroyed", hashMap);
    }

    @Override // tb.lb0.a
    public void h(Activity activity, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a84a820c", new Object[]{this, activity, new Long(j)});
            return;
        }
        HashMap hashMap = new HashMap(2);
        hashMap.put("timestamp", Long.valueOf(j));
        hashMap.put("pageName", xol.c(activity));
        this.f.d("onActivityStopped", hashMap);
    }

    @Override // tb.lb0.a
    public void j(Activity activity, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e84c3aef", new Object[]{this, activity, new Long(j)});
            return;
        }
        HashMap hashMap = new HashMap(2);
        hashMap.put("timestamp", Long.valueOf(j));
        hashMap.put("pageName", xol.c(activity));
        this.f.d("onActivityPaused", hashMap);
    }

    @Override // com.taobao.monitor.impl.trace.l.c
    public void o(Activity activity, int i, float f, float f2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("747a3d9a", new Object[]{this, activity, new Integer(i), new Float(f), new Float(f2), new Long(j)});
        } else if (this.Q && !nnl.i(xol.a(activity))) {
            if (TextUtils.isEmpty(this.c)) {
                String a2 = xol.a(activity);
                this.c = a2;
                try {
                    if (!TextUtils.isEmpty(a2) && this.R.containsKey(this.c)) {
                        long longValue = this.R.get(this.c).longValue();
                        this.f.a("appInitDuration", Long.valueOf(longValue - this.x));
                        this.f.j("renderStartTime", longValue);
                    }
                } catch (Exception unused) {
                }
            }
            if (W(activity)) {
                this.f.j("firstInteractiveTime", j);
                this.f.a("firstInteractiveDuration", Long.valueOf(j - this.x));
                this.Q = false;
            }
        }
    }

    @Override // com.taobao.monitor.impl.trace.b.AbstractC0625b
    public void onLowMemory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bbd23dd", new Object[]{this});
            return;
        }
        HashMap hashMap = new HashMap(1);
        hashMap.put("timestamp", Long.valueOf(out.a()));
        this.f.d("onLowMemory", hashMap);
    }

    @Override // com.taobao.monitor.impl.trace.ApplicationBackgroundChangedDispatcher.b
    public void r(int i, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("903f52fd", new Object[]{this, new Integer(i), new Long(j)});
        } else if (i == 1) {
            HashMap hashMap = new HashMap(1);
            hashMap.put("timestamp", Long.valueOf(j));
            this.f.d("foreground2Background", hashMap);
        }
    }

    @Override // tb.lb0.a
    public void B(Activity activity, Map<String, Object> map, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b7c62f2", new Object[]{this, activity, map, new Long(j)});
            return;
        }
        String c = xol.c(activity);
        this.d = xol.a(activity);
        String a2 = rrl.a(map.get("schemaUrl"), "");
        String a3 = rrl.a(map.get("groupRelatedId"), "");
        if (!this.y) {
            boolean equals = Boolean.TRUE.equals(map.get(RECOVERY_FROM_SAVED_INSTANCE));
            this.f.a("systemRecovery", Boolean.valueOf(equals));
            if ("COLD".equals(W) && equals) {
                this.c = this.d;
                this.e = a3;
                this.P = this.N.c("apm_startup_target_page");
                ((ArrayList) this.q).add(c);
            }
            Object obj = map.get("outLink");
            if (obj != null) {
                this.f.a("outLink", obj);
            }
            Object obj2 = map.get("blackPage");
            if (obj2 != null) {
                this.f.a("blackPage", obj2);
            }
            if (!TextUtils.isEmpty(a2)) {
                this.f.a("schemaUrl", a2);
            }
            this.f.a("firstPageName", c);
            this.f.j("firstPageCreateTime", j);
            this.N.d("apm_system_startup", out.c(nca.i)).a(out.c(j));
            this.O = this.N.c("apm_startup_intermediate_page");
            this.A = W;
            W = "HOT";
            this.y = true;
        }
        if (((ArrayList) this.q).size() < 10) {
            if (TextUtils.isEmpty(this.c)) {
                ((ArrayList) this.q).add(c);
            }
            if (!TextUtils.isEmpty(a2)) {
                ((ArrayList) this.r).add(a2);
            }
        }
        if (TextUtils.isEmpty(this.c) && !nnl.i(this.d) && (nnl.m() || nnl.l(this.d))) {
            this.c = this.d;
            this.e = a3;
            this.P = this.N.d("apm_startup_target_page", out.c(j));
        }
        HashMap hashMap = new HashMap(2);
        hashMap.put("timestamp", Long.valueOf(j));
        hashMap.put("pageName", c);
        this.f.d("onActivityCreated", hashMap);
    }

    @Override // tb.px
    public void Q(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41587ecd", new Object[]{this, new Long(j)});
            return;
        }
        super.Q(j);
        this.z = ldu.a();
        mdd e = vxm.b.e();
        this.f = e;
        if (!e.isAlive()) {
            mdd a2 = sxm.b.a(z4u.a("/startup"), new c.b().j(false).o(true).n(o48.n).m(true).l(null).h());
            this.f = a2;
            a2.c();
            ProcedureGlobal.PROCEDURE_MANAGER.F(this.f);
            SharedPreferences.Editor edit = w9a.g().k().edit();
            edit.putString(ikv.KEY_LAST_LAUNCH_SESSION, this.f.r());
            edit.apply();
        }
        this.f.j("procedureStartTime", j);
        this.g = M(ic.WINDOW_EVENT_DISPATCHER);
        this.h = M(ic.APPLICATION_LOW_MEMORY_DISPATCHER);
        this.i = M(ic.PAGE_RENDER_DISPATCHER);
        this.j = M(ic.ACTIVITY_FPS_DISPATCHER);
        this.k = M(ic.APPLICATION_BACKGROUND_CHANGED_DISPATCHER);
        this.l = M(ic.NETWORK_STAGE_DISPATCHER);
        this.m = M(ic.IMAGE_STAGE_DISPATCHER);
        this.n = M(ic.PAGE_RENDER_DISPATCHER);
        this.o = M(ic.PAGE_LEAVE_DISPATCHER);
        this.p = M(ic.LOOPER_HEAVY_MSG_DISPATCHER);
        this.h.addListener(this);
        this.j.addListener(this);
        this.g.addListener(this);
        this.i.addListener(this);
        this.k.addListener(this);
        this.l.addListener(this);
        this.m.addListener(this);
        this.n.addListener(this);
        this.o.addListener(this);
        this.p.addListener(this);
        NotifyApm.b().a(1, this);
        V();
    }

    @Override // tb.px
    public void R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e789f337", new Object[]{this});
        } else if (!this.V) {
            this.V = true;
            X();
            if (this.D) {
                this.f.a("utSession", y2v.b().a());
            }
            if (!TextUtils.isEmpty(this.c)) {
                this.f.a("currentPageName", this.c.substring(this.c.lastIndexOf(".") + 1));
                this.f.a("fullPageName", this.c);
                try {
                    if (!TextUtils.isEmpty(this.c) && ((HashMap) this.R).containsKey(this.c)) {
                        long longValue = ((Long) ((HashMap) this.R).get(this.c)).longValue();
                        this.f.a("appInitDuration", Long.valueOf(longValue - this.x));
                        this.f.j("renderStartTime", longValue);
                    }
                } catch (Exception unused) {
                }
                if ("COLD".equals(this.A)) {
                    yxm.b(this.f, "currentPageGroupId", this.e);
                }
            }
            ((HashMap) this.R).clear();
            this.f.a("processStartType", Integer.valueOf(ProcessStart.a()));
            this.f.a("linkPageName", this.q.toString());
            this.f.a("linkPageUrl", this.r.toString());
            ((ArrayList) this.q).clear();
            ((ArrayList) this.r).clear();
            chb g = c21.g();
            this.f.a("deviceLevel", Integer.valueOf(g.getInt("deviceLevel", -1)));
            this.f.a("runtimeLevel", Integer.valueOf(lp0.d().f().c));
            this.f.a("cpuUsageOfDevcie", Float.valueOf(lp0.d().b().d));
            this.f.a("memoryRuntimeLevel", Integer.valueOf(lp0.d().e().k));
            this.f.a("hasSplash", Boolean.valueOf(nca.c));
            this.f.a("saveMode", Boolean.valueOf(g.getBoolean("saveMode", false)));
            this.f.u("fps", this.s.toString());
            this.f.u("jankCount", Integer.valueOf(this.u));
            this.f.u("movieJankCount", Integer.valueOf(this.v));
            this.f.u("movieBigJankCount", Integer.valueOf(this.w));
            this.f.u("imageOnRequest", Integer.valueOf(this.F));
            this.f.u("imageSuccessCount", Integer.valueOf(this.G));
            this.f.u("imageFailedCount", Integer.valueOf(this.H));
            this.f.u("imageCanceledCount", Integer.valueOf(this.I));
            this.f.u("networkOnRequest", Integer.valueOf(this.J));
            this.f.u("networkSuccessCount", Integer.valueOf(this.K));
            this.f.u("networkFailedCount", Integer.valueOf(this.L));
            this.f.u("networkCanceledCount", Integer.valueOf(this.M));
            this.f.u("mainThreadBlock", Integer.valueOf(this.n0));
            long[] a2 = ldu.a();
            this.f.u("totalRx", Long.valueOf(a2[0] - this.z[0]));
            this.f.u("totalTx", Long.valueOf(a2[1] - this.z[1]));
            this.f.j("procedureEndTime", out.a());
            nca.c = false;
            this.k.removeListener(this);
            this.h.removeListener(this);
            this.j.removeListener(this);
            this.g.removeListener(this);
            this.i.removeListener(this);
            this.m.removeListener(this);
            this.l.removeListener(this);
            this.n.removeListener(this);
            this.o.removeListener(this);
            this.p.removeListener(this);
            NotifyApm.b().d(1, this);
            this.f.end();
            super.R();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a0, code lost:
        r8 = android.os.Debug.getRuntimeStats();
     */
    @Override // com.taobao.monitor.impl.trace.j.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void t(tb.cll r8, long r9) {
        /*
            r7 = this;
            r0 = 2
            r1 = 0
            com.android.alibaba.ip.runtime.IpChange r2 = tb.jhg.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x001d
            java.lang.Long r3 = new java.lang.Long
            r3.<init>(r9)
            r9 = 3
            java.lang.Object[] r9 = new java.lang.Object[r9]
            r9[r1] = r7
            r10 = 1
            r9[r10] = r8
            r9[r0] = r3
            java.lang.String r8 = "90f0b107"
            r2.ipc$dispatch(r8, r9)
            return
        L_0x001d:
            boolean r2 = r7.T
            if (r2 != 0) goto L_0x0022
            return
        L_0x0022:
            android.app.Activity r2 = r8.f()
            if (r2 == 0) goto L_0x00c0
            boolean r2 = r7.W(r2)
            if (r2 == 0) goto L_0x00c0
            tb.mdd r2 = r7.f
            long r3 = r7.x
            long r3 = r9 - r3
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.String r4 = "interactiveDuration"
            r2.a(r4, r3)
            tb.mdd r2 = r7.f
            long r3 = r7.x
            long r3 = r9 - r3
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.String r4 = "launchDuration"
            r2.a(r4, r3)
            tb.mdd r2 = r7.f
            java.lang.String r3 = "interactiveTime"
            r2.j(r3, r9)
            long r2 = tb.out.c(r9)
            tb.zaq r4 = r7.N
            r4.a(r2)
            tb.zaq r4 = r7.O
            tb.zaq r5 = r7.P
            long r5 = r5.b()
            r4.a(r5)
            tb.zaq r4 = r7.P
            r4.a(r2)
            com.taobao.application.common.IAppLaunchListener r2 = r7.C
            int r3 = r7.Y()
            r2.d(r3, r0)
            tb.e81 r0 = tb.e81.b()
            java.lang.String r2 = "launchInteractiveTime"
            r0.f(r2, r9)
            r7.X()
            r7.T = r1
            java.lang.ref.WeakReference r9 = r8.u()
            if (r9 != 0) goto L_0x008c
            goto L_0x009a
        L_0x008c:
            r7.L(r8, r1)
            tb.mdd r8 = r7.f
            java.lang.Integer r9 = java.lang.Integer.valueOf(r1)
            java.lang.String r10 = "errorCode"
            r8.a(r10, r9)
        L_0x009a:
            int r8 = android.os.Build.VERSION.SDK_INT
            r9 = 23
            if (r8 < r9) goto L_0x00c0
            java.util.Map r8 = tb.cjo.a()
            if (r8 == 0) goto L_0x00c0
            tb.mdd r9 = r7.f
            java.lang.String r10 = "art.gc.blocking-gc-count"
            java.lang.Object r10 = r8.get(r10)
            java.lang.String r0 = "blocking-gc-count"
            r9.u(r0, r10)
            tb.mdd r9 = r7.f
            java.lang.String r10 = "art.gc.blocking-gc-time"
            java.lang.Object r8 = r8.get(r10)
            java.lang.String r10 = "blocking-gc-time"
            r9.u(r10, r8)
        L_0x00c0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.jhg.t(tb.cll, long):void");
    }

    @Override // com.taobao.monitor.impl.trace.PageLeaveDispatcher.b
    public void z(cll cllVar, int i, long j) {
        boolean z = true;
        z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18f3019a", new Object[]{this, cllVar, new Integer(i), new Long(j)});
            return;
        }
        if (cllVar != null && cllVar.J() && W(cllVar.f())) {
            this.f.j("leaveTime", j);
            if (i == -5) {
                this.f.a("leaveType", n.LEAVE_TYPE_JUMP_NEXT_PAGE);
            } else if (i == -4) {
                this.f.a("leaveType", "back");
            }
            z = true;
        }
        if (i == -3) {
            this.f.j("leaveTime", j);
            this.f.a("leaveType", n.LEAVE_TYPE_F2B);
        }
        if (z) {
            N();
        }
    }

    @Override // com.taobao.monitor.impl.trace.l.c
    public void A(Activity activity, KeyEvent keyEvent, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b5c8321", new Object[]{this, activity, keyEvent, new Long(j)});
            return;
        }
        int action = keyEvent.getAction();
        int keyCode = keyEvent.getKeyCode();
        if (action != 0) {
            return;
        }
        if (keyCode == 4 || keyCode == 3) {
            if (TextUtils.isEmpty(this.c)) {
                this.c = xol.a(activity);
                if (activity != null) {
                    try {
                        if (this.R.containsKey(xol.a(activity))) {
                            long longValue = this.R.get(activity.getClass().getName()).longValue();
                            this.f.a("appInitDuration", Long.valueOf(longValue - this.x));
                            this.f.j("renderStartTime", longValue);
                        }
                    } catch (Exception unused) {
                    }
                }
            }
            HashMap hashMap = new HashMap(2);
            hashMap.put("timestamp", Long.valueOf(j));
            hashMap.put("key", Integer.valueOf(keyEvent.getKeyCode()));
            this.f.d("keyEvent", hashMap);
        }
    }

    @Override // tb.lb0.a
    public void k(Activity activity, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("622b42d8", new Object[]{this, activity, new Long(j)});
            return;
        }
        if ("HOT".equals(W) && !this.y) {
            this.y = true;
            String a2 = xol.a(activity);
            this.d = a2;
            this.c = a2;
            if (activity.getIntent() != null && !TextUtils.isEmpty(activity.getIntent().getDataString())) {
                this.f.a("schemaUrl", activity.getIntent().getDataString());
            }
            this.f.a("firstPageName", xol.a(activity));
            this.f.j("firstPageCreateTime", j);
        }
        HashMap hashMap = new HashMap(2);
        hashMap.put("timestamp", Long.valueOf(j));
        hashMap.put("pageName", xol.c(activity));
        this.f.d("onActivityStarted", hashMap);
        zq6.a("LauncherProcessor", "launchType", this.A);
    }

    public jhg(String str, long j) {
        this.q = new ArrayList(4);
        this.r = new ArrayList(4);
        this.s = new ArrayList();
        this.n0 = 0;
        this.u = 0;
        this.v = 0;
        this.w = 0;
        this.y = false;
        this.A = W;
        this.B = false;
        this.C = b21.s().n();
        this.D = true;
        this.E = true;
        zaq zaqVar = zaq.DEFAULT;
        this.N = zaqVar;
        this.O = zaqVar;
        this.P = zaqVar;
        this.Q = true;
        this.R = new HashMap();
        this.S = true;
        this.T = true;
        this.U = true;
        this.V = false;
        W = str;
        this.A = str;
        Q(j);
    }
}
