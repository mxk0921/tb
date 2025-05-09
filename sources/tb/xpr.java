package tb;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.text.TextUtils;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.virtual_thread.face.VExecutors;
import com.taobao.login4android.api.Login;
import com.taobao.privacyguard.config.LoginStateManager;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class xpr {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int AGE_LEVEL_NONE = 0;
    public static final int AGE_LEVEL_SYSTEM_ERROR = -1;
    public static final int AGE_LEVEL_V1 = 1;
    public static final int AGE_LEVEL_V2 = 2;
    public static final int AGE_LEVEL_V3 = 3;
    public static final int AGE_LEVEL_V4 = 4;
    public static final int AGE_LEVEL_V5 = 5;
    public static final int REMIND_POP_RESULT_SUCCESS = 0;
    public static final int REMIND_POP_RESULT_SYSTEM_MINORS = -1;
    public static volatile xpr k;
    public static volatile Context l;
    public volatile Boolean c;
    public final ScheduledThreadPoolExecutor d;
    public Map<Integer, Runnable> f;
    public String g;
    public Boolean h;
    public boolean i;
    public long j = 1;

    /* renamed from: a  reason: collision with root package name */
    public final SharedPreferences f31521a = l.getSharedPreferences("minors_protect_config", 0);
    public final boolean b = C();
    public volatile boolean e = !c21.g().getBoolean("isInBackground", false);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements qqt {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final AtomicInteger f31522a = new AtomicInteger(0);

        public a(xpr xprVar) {
        }

        @Override // tb.qqt
        public String newThreadName() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("57dab4a4", new Object[]{this});
            }
            return "TBMinorsProtect" + this.f31522a.incrementAndGet();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements u11 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    xpr.b(xpr.this);
                }
            }
        }

        public b() {
        }

        @Override // tb.u11, com.taobao.application.common.IApmEventListener
        public void onEvent(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fef3fc41", new Object[]{this, new Integer(i)});
            } else if (i == 2) {
                xpr.a(xpr.this, true);
                xpr.e(xpr.this).submit(new a());
            } else if (i == 1) {
                xpr.a(xpr.this, false);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            AppMonitor.Counter.commit("TBMinorsProtect", "minorsProtectEnabled", 1.0d);
            if (xpr.f()) {
                AppMonitor.Counter.commit("TBMinorsProtect", "minorsProtectSysSupport", 1.0d);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                xpr.g(xpr.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class e implements u11 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    xpr.g(xpr.this);
                }
            }
        }

        public e() {
        }

        @Override // tb.u11, com.taobao.application.common.IApmEventListener
        public void onEvent(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fef3fc41", new Object[]{this, new Integer(i)});
            } else if (i == 2) {
                xpr.e(xpr.this).submit(new a());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class f implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ WeakReference f31528a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Activity f31529a;

            public a(Activity activity) {
                this.f31529a = activity;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                Activity activity = this.f31529a;
                f fVar = f.this;
                qxr.f(activity, fVar.b, fVar.c);
            }
        }

        public f(WeakReference weakReference, String str, String str2) {
            this.f31528a = weakReference;
            this.b = str;
            this.c = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            Activity activity = (Activity) this.f31528a.get();
            if (activity != null) {
                activity.runOnUiThread(new a(activity));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class g implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Integer f31530a;
        public final /* synthetic */ Runnable b;

        public g(Integer num, Runnable runnable) {
            this.f31530a = num;
            this.b = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            if (xpr.h(xpr.this) == null) {
                xpr.i(xpr.this, new HashMap(2));
            }
            xpr.h(xpr.this).put(this.f31530a, this.b);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class h implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Integer f31531a;
        public final /* synthetic */ Activity b;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    qxr.d(h.this.b);
                }
            }
        }

        public h(Integer num, Activity activity) {
            this.f31531a = num;
            this.b = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (xpr.h(xpr.this) == null || ((Runnable) xpr.h(xpr.this).remove(this.f31531a)) == null) {
                this.b.runOnUiThread(new a());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class i implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("source", "tb_minor");
            Login.login(true, bundle);
            vhl.b("TBMinorsProtect", "[minorForceLogin] done");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class j implements s1c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ a3w f31534a;

            public a(a3w a3wVar) {
                this.f31534a = a3wVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    j.this.c(this.f31534a);
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class b implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ long f31535a;

            public b(long j) {
                this.f31535a = j;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                vhl.b("TBMinorsProtect", "[doFail] retry: " + this.f31535a);
                xpr.g(xpr.j());
            }
        }

        static {
            t2o.a(757071907);
            t2o.a(456130607);
        }

        public j() {
        }

        public void a(boolean z, String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4009cf5d", new Object[]{this, new Boolean(z), str, str2});
            } else if (!TextUtils.isEmpty(xpr.c(xpr.j()))) {
                if (z) {
                    AppMonitor.Alarm.commitSuccess("TBMinorsProtect", "versionSwitchResult", xpr.c(xpr.j()));
                } else {
                    if (TextUtils.isEmpty(str)) {
                        str = "";
                    }
                    if (TextUtils.isEmpty(str2)) {
                        str2 = "";
                    }
                    AppMonitor.Alarm.commitFail("TBMinorsProtect", "versionSwitchResult", xpr.c(xpr.j()), str, str2);
                }
                xpr.d(xpr.j(), null);
            }
        }

        public void b(int i, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1a2c6dbd", new Object[]{this, new Integer(i), str});
                return;
            }
            vhl.b("TBMinorsProtect", "[OnEditionSwitchListener] fail: code is " + i + ", msg is " + str);
            a(false, String.valueOf(i), str);
            long l = xpr.l(xpr.j());
            xpr.m(xpr.j(), l << 1);
            xpr.e(xpr.j()).schedule(new b(l), l, TimeUnit.SECONDS);
        }

        public void c(a3w a3wVar) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6b970c8e", new Object[]{this, a3wVar});
                return;
            }
            if (a3wVar == null || TextUtils.isEmpty(a3wVar.c)) {
                str = "";
            } else {
                str = a3wVar.c;
            }
            vhl.b("TBMinorsProtect", "[OnEditionSwitchListener] success: current version is " + str);
            if (!"children_version".equals(str)) {
                xpr.k(xpr.j()).edit().putString("local_version_info", "").apply();
            }
            a(true, null, null);
            xpr.m(xpr.j(), 1L);
        }

        @Override // tb.s1c
        public void onSuccess(a3w a3wVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("68a126ba", new Object[]{this, a3wVar});
            } else {
                xpr.e(xpr.j()).submit(new a(a3wVar));
            }
        }

        public /* synthetic */ j(a aVar) {
            this();
        }
    }

    static {
        t2o.a(757071893);
    }

    public xpr(Context context) {
        l = context.getApplicationContext();
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) VExecutors.getThreadPoolFactory().createScheduledExecutorService(1, new a(this), new ThreadPoolExecutor.AbortPolicy());
        this.d = scheduledThreadPoolExecutor;
        scheduledThreadPoolExecutor.setKeepAliveTime(30L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        c21.c(new b());
    }

    public static boolean A(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("df23cbce", new Object[]{context})).booleanValue();
        }
        if (!r(context).z()) {
            vhl.b("TBMinorsProtect", "[isSystemMinors] minors function not enabled");
            return false;
        } else if (!F()) {
            vhl.b("TBMinorsProtect", "[isSystemMinors] system not support minors mode");
            return false;
        } else if (Settings.Secure.getInt(l.getContentResolver(), "minors_mode_enabled", 0) == 1) {
            return true;
        } else {
            return false;
        }
    }

    public static int E(Activity activity, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7b0b3465", new Object[]{activity, str, str2})).intValue();
        }
        xpr r = r(activity);
        if (!r.z()) {
            vhl.b("TBMinorsProtect", "[openRemindPopWithBizType] minors function not enabled");
            r.D(activity, str, str2);
            return 0;
        } else if (A(activity)) {
            vhl.b("TBMinorsProtect", "[openRemindPopWithBizType] system minors intercept");
            return -1;
        } else {
            r.D(activity, str, str2);
            return 0;
        }
    }

    public static boolean F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("874edfdb", new Object[0])).booleanValue();
        }
        if (Settings.Secure.getInt(l.getContentResolver(), "minors_mode", 0) == 1) {
            return true;
        }
        return false;
    }

    public static int G(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d225d466", new Object[]{new Integer(i2)})).intValue();
        }
        if (i2 == 0) {
            return 0;
        }
        if (i2 == 1) {
            return 1;
        }
        int i3 = 2;
        if (i2 != 2) {
            i3 = 3;
            if (i2 != 3) {
                i3 = 4;
                if (i2 != 4) {
                    i3 = 5;
                    if (i2 != 5) {
                        return -1;
                    }
                }
            }
        }
        return i3;
    }

    public static void H(a3w a3wVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17b089b8", new Object[]{a3wVar});
        } else {
            ((t1c) n78.a(t1c.class)).doChangeVersion(s78.d().a("TBMinorsProtect").b(a3wVar), new t7l(r78.TRIGGER_REQUEST));
        }
    }

    public static void J(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e45dc1ed", new Object[]{map});
        } else if (map != null) {
            String str = map.get("minors_protect_enable_list");
            if (!TextUtils.isEmpty(str) && k != null && k.f31521a != null) {
                k.f31521a.edit().putString("minors_protect_enable_list", str).apply();
            }
        }
    }

    public static /* synthetic */ boolean a(xpr xprVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("820ad661", new Object[]{xprVar, new Boolean(z)})).booleanValue();
        }
        xprVar.e = z;
        return z;
    }

    public static /* synthetic */ void b(xpr xprVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86adb996", new Object[]{xprVar});
        } else {
            xprVar.q();
        }
    }

    public static /* synthetic */ String c(xpr xprVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("22efd59c", new Object[]{xprVar});
        }
        return xprVar.g;
    }

    public static /* synthetic */ String d(xpr xprVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("85d49fd0", new Object[]{xprVar, str});
        }
        xprVar.g = str;
        return str;
    }

    public static /* synthetic */ ScheduledThreadPoolExecutor e(xpr xprVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScheduledThreadPoolExecutor) ipChange.ipc$dispatch("60b8f540", new Object[]{xprVar});
        }
        return xprVar.d;
    }

    public static /* synthetic */ boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b88b93e", new Object[0])).booleanValue();
        }
        return F();
    }

    public static /* synthetic */ void g(xpr xprVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2bff0e9a", new Object[]{xprVar});
        } else {
            xprVar.I();
        }
    }

    public static /* synthetic */ Map h(xpr xprVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("36901ad0", new Object[]{xprVar});
        }
        return xprVar.f;
    }

    public static /* synthetic */ Map i(xpr xprVar, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("d62c033d", new Object[]{xprVar, map});
        }
        xprVar.f = map;
        return map;
    }

    public static /* synthetic */ xpr j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xpr) ipChange.ipc$dispatch("8cbf2576", new Object[0]);
        }
        return k;
    }

    public static /* synthetic */ SharedPreferences k(xpr xprVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences) ipChange.ipc$dispatch("3be7e7f1", new Object[]{xprVar});
        }
        return xprVar.f31521a;
    }

    public static /* synthetic */ long l(xpr xprVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d1506392", new Object[]{xprVar})).longValue();
        }
        return xprVar.j;
    }

    public static /* synthetic */ long m(xpr xprVar, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8cf38418", new Object[]{xprVar, new Long(j2)})).longValue();
        }
        xprVar.j = j2;
        return j2;
    }

    public static void n(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d61b7b8d", new Object[]{activity});
            return;
        }
        xpr r = r(activity);
        if (!r.z()) {
            vhl.b("TBMinorsProtect", "[closeRemindPop] minors function not enabled");
        }
        r.o(activity);
    }

    public static a3w p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a3w) ipChange.ipc$dispatch("9cd7aaae", new Object[0]);
        }
        return ((t1c) n78.a(t1c.class)).queryCurrentVersionInfo();
    }

    public static xpr r(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xpr) ipChange.ipc$dispatch("78c879be", new Object[]{context});
        }
        if (k == null) {
            synchronized (xpr.class) {
                try {
                    if (k == null) {
                        k = new xpr(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return k;
    }

    public static int s(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2be8977b", new Object[]{context})).intValue();
        }
        if (!r(context).z()) {
            vhl.b("TBMinorsProtect", "[getMinorsAgeLevel] minors function not enabled");
            return -1;
        } else if (F()) {
            return G(Settings.Secure.getInt(l.getContentResolver(), "minors_mode_age_range", 0));
        } else {
            vhl.b("TBMinorsProtect", "[getMinorsAgeLevel] system not support minors mode");
            return -1;
        }
    }

    public static a3w t() {
        a3w p;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a3w) ipChange.ipc$dispatch("82c40095", new Object[0]);
        }
        if (TextUtils.isEmpty(Login.getUserId()) || (p = p()) == null || TextUtils.isEmpty(p.c)) {
            return null;
        }
        if ("standard_version".equals(p.c) || "new_user_standard_version".equals(p.c)) {
            return p;
        }
        return null;
    }

    public static void u(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{context});
            return;
        }
        xpr r = r(context);
        if (!r.z()) {
            vhl.b("TBMinorsProtect", "[init] minors function not enabled");
            return;
        }
        LoginStateManager.a(context);
        vhl.b("TBMinorsProtect", "[init] start");
        r.d.submit(new c());
        ((t1c) n78.a(t1c.class)).addChangeVersionListener(new j(null));
        r.d.submit(new d());
        c21.c(new e());
    }

    public static boolean v() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("85b6ce0", new Object[0])).booleanValue();
        }
        a3w p = p();
        if (p == null) {
            str = "";
        } else {
            str = p.c;
        }
        return "children_version".equals(str);
    }

    public static boolean y(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("62fe4cfd", new Object[]{context})).booleanValue();
        }
        if (v() || A(context)) {
            return true;
        }
        return false;
    }

    public void B() {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d3457da", new Object[]{this});
            return;
        }
        try {
            if (rhl.d().a(l).booleanValue() && A(l) && TextUtils.isEmpty(Login.getUserId()) && (scheduledThreadPoolExecutor = this.d) != null) {
                scheduledThreadPoolExecutor.submit(new i());
            }
        } catch (Throwable th) {
            vhl.b("TBMinorsProtect", "[minorForceLogin] error: " + th);
        }
    }

    public final boolean C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e994529a", new Object[]{this})).booleanValue();
        }
        String string = this.f31521a.getString("minors_protect_enable_list", "");
        if (TextUtils.isEmpty(string)) {
            return false;
        }
        try {
            JSONArray jSONArray = new JSONArray(string);
            int length = jSONArray.length();
            for (int i2 = 0; i2 < length; i2++) {
                String string2 = jSONArray.getString(i2);
                if (!TextUtils.isEmpty(string2) && string2.equalsIgnoreCase(Build.BRAND)) {
                    return true;
                }
            }
        } catch (Exception e2) {
            vhl.b("TBMinorsProtect", "[obtainMinorsProtectEnable] error: " + e2);
        }
        return false;
    }

    public final void D(Activity activity, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a203a9ac", new Object[]{this, activity, str, str2});
        } else if (this.e) {
            qxr.f(activity, str, str2);
        } else {
            this.d.submit(new g(Integer.valueOf(activity.hashCode()), new f(new WeakReference(activity), str, str2)));
            vhl.b("TBMinorsProtect", "[openRemindPopInternal] in process background");
        }
    }

    public final void o(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3dc682a", new Object[]{this, activity});
        } else {
            this.d.submit(new h(Integer.valueOf(activity.hashCode()), activity));
        }
    }

    public final void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f900ce35", new Object[]{this});
            return;
        }
        Map<Integer, Runnable> map = this.f;
        if (!(map == null || map.isEmpty())) {
            Map<Integer, Runnable> map2 = this.f;
            this.f = null;
            for (Runnable runnable : map2.values()) {
                runnable.run();
            }
            vhl.b("TBMinorsProtect", "[execRemindPopIfNeed] run remind pop task: " + map2.size());
        }
    }

    public final boolean w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2f1dcb4d", new Object[]{this})).booleanValue();
        }
        Boolean bool = this.h;
        if (bool != null) {
            return bool.booleanValue();
        }
        Boolean valueOf = Boolean.valueOf(new File("/data/local/tmp/.force_rollback_standard").exists());
        this.h = valueOf;
        return valueOf.booleanValue();
    }

    public final boolean x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("218ad4a0", new Object[]{this})).booleanValue();
        }
        if (this.c != null) {
            return this.c.booleanValue();
        }
        this.c = Boolean.valueOf(new File("/data/local/tmp/.minors_protect_debug_enable").exists());
        return this.c.booleanValue();
    }

    public final boolean z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fdf2075", new Object[]{this})).booleanValue();
        }
        if (this.b || x()) {
            return true;
        }
        return false;
    }

    public final void I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0b8271c", new Object[]{this});
            return;
        }
        try {
            boolean A = A(l);
            boolean v = v();
            B();
            if (A && !v) {
                vhl.b("TBMinorsProtect", "[updateAndReportIfNeed] sys: enable, app: disable");
                a3w t = t();
                if (t != null) {
                    vhl.b("TBMinorsProtect", "[updateAndReportIfNeed] try to change to child version");
                    this.f31521a.edit().putString("local_version_info", t.c).apply();
                    H(a3w.h().f("children_version").c("switcherVersion", "children_version"));
                    this.g = "toChildren";
                }
            } else if (!A && v) {
                vhl.b("TBMinorsProtect", "[updateAndReportIfNeed] sys: disable, app: enable");
                String string = this.f31521a.getString("local_version_info", null);
                if (!TextUtils.isEmpty(string)) {
                    vhl.b("TBMinorsProtect", "[updateAndReportIfNeed] try to restore version: " + string);
                    H(a3w.h().f(string).c("switcherVersion", string));
                    this.g = "toNonChildren";
                } else if (w()) {
                    vhl.b("TBMinorsProtect", "[updateAndReportIfNeed] try force to standard version");
                    H(a3w.h().f("standard_version").c("switcherVersion", "standard_version"));
                    this.g = "foreToNonChildren";
                }
            } else if (A || v) {
                vhl.b("TBMinorsProtect", "[updateAndReportIfNeed] sys: enable, app: enable");
            } else {
                vhl.b("TBMinorsProtect", "[updateAndReportIfNeed] sys: disable, app: disable");
                this.f31521a.edit().putString("local_version_info", "").apply();
            }
            if (A && !this.i) {
                this.i = true;
                AppMonitor.Counter.commit("TBMinorsProtect", "sysMinorsEnter", String.valueOf(s(l)), 1.0d);
            } else if (!A && this.i) {
                this.i = false;
                AppMonitor.Counter.commit("TBMinorsProtect", "sysMinorsLeave", String.valueOf(s(l)), 1.0d);
            }
        } catch (Exception e2) {
            vhl.b("TBMinorsProtect", "[updateAndReportIfNeed] error: " + e2);
        }
    }
}
