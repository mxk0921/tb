package com.alibaba.analytics;

import android.app.Application;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.text.TextUtils;
import com.alibaba.analytics.IAnalytics;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.a5e;
import tb.b3v;
import tb.d8e;
import tb.g0v;
import tb.hsq;
import tb.m2v;
import tb.nhh;
import tb.o2w;
import tb.pg1;
import tb.t2o;
import tb.u51;
import tb.vep;
import tb.vyp;
import tb.wu3;
import tb.x2v;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class AnalyticsMgr {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static IAnalytics b;
    public static d8e c;
    public static d8e d;

    /* renamed from: a  reason: collision with root package name */
    public static Application f2097a = null;
    public static final Object e = new Object();
    public static final Object f = new Object();
    public static volatile boolean g = false;
    public static RunMode h = RunMode.Service;
    public static boolean i = false;
    public static String j = null;
    public static String k = null;
    public static String l = null;
    public static boolean m = false;
    public static String n = null;
    public static String o = null;
    public static String p = null;
    public static String q = null;
    public static boolean r = false;
    public static boolean s = false;
    public static Map<String, String> t = null;
    public static Map<String, String> u = null;
    public static final List<s> mRegisterList = Collections.synchronizedList(new ArrayList());
    public static final Map<String, String> v = new ConcurrentHashMap();
    public static boolean w = false;
    public static boolean x = false;
    public static String y = null;
    public static final int z = 5;
    public static int A = 5;
    public static final ServiceConnection B = new h();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public enum RunMode {
        Local,
        Service;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(RunMode runMode, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/analytics/AnalyticsMgr$RunMode");
        }

        public static RunMode valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (RunMode) ipChange.ipc$dispatch("2674c8c6", new Object[]{str});
            }
            return (RunMode) Enum.valueOf(RunMode.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Map f2098a;

        public a(Map map) {
            this.f2098a = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                AnalyticsMgr.b.updateSessionProperties(this.f2098a);
            } catch (Throwable unused) {
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                AnalyticsMgr.b.saveCacheDataToLocal();
            } catch (RemoteException e) {
                nhh.u("AnalyticsMgr", e, new Object[0]);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Map f2099a;

        public c(Map map) {
            this.f2099a = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                AnalyticsMgr.b.setSessionProperties(this.f2099a);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class f implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f2100a;
        public final /* synthetic */ String b;

        public f(String str, String str2) {
            this.f2100a = str;
            this.b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                AnalyticsMgr.b.setGlobalProperty(this.f2100a, this.b);
            } catch (RemoteException e) {
                AnalyticsMgr.O(e);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class g implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f2101a;

        public g(String str) {
            this.f2101a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                AnalyticsMgr.b.removeGlobalProperty(this.f2101a);
            } catch (RemoteException e) {
                AnalyticsMgr.O(e);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class j implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f2103a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ MeasureSet d;
        public final /* synthetic */ DimensionSet e;
        public final /* synthetic */ boolean f;

        public j(boolean z, String str, String str2, MeasureSet measureSet, DimensionSet dimensionSet, boolean z2) {
            this.f2103a = z;
            this.b = str;
            this.c = str2;
            this.d = measureSet;
            this.e = dimensionSet;
            this.f = z2;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                if (this.f2103a) {
                    AnalyticsMgr.d(this.b, this.c, this.d, this.e, this.f);
                }
                AnalyticsMgr.b.register4(this.b, this.c, this.d, this.e, this.f);
            } catch (RemoteException unused) {
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class k implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            nhh.m("AnalyticsMgr", "---call Remote init start---");
            try {
                AnalyticsMgr.b.initUT();
            } catch (Throwable th) {
                nhh.i("AnalyticsMgr", "initut error", th);
                AnalyticsMgr.f();
                try {
                    AnalyticsMgr.b.initUT();
                } catch (Throwable th2) {
                    nhh.i("AnalyticsMgr", "initut error", th2);
                }
            }
            try {
                wu3.c().l();
            } catch (Exception unused) {
            }
            nhh.m("AnalyticsMgr", "---call Remote init end---");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class l implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Map f2104a;

        public l(Map map) {
            this.f2104a = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                AnalyticsMgr.b.turnOnRealTimeDebug(this.f2104a);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class m implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                AnalyticsMgr.b.turnOffRealTimeDebug();
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class n implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f2105a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;

        public n(boolean z, boolean z2, String str, String str2) {
            this.f2105a = z;
            this.b = z2;
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
            try {
                AnalyticsMgr.b.setRequestAuthInfo(this.f2105a, this.b, this.c, this.d);
            } catch (Throwable unused) {
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class o implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f2106a;

        public o(String str) {
            this.f2106a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                AnalyticsMgr.b.setChannel(this.f2106a);
            } catch (Throwable unused) {
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class p implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f2107a;

        public p(String str) {
            this.f2107a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                AnalyticsMgr.b.setAppVersion(this.f2107a);
            } catch (Throwable unused) {
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class q implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                AnalyticsMgr.b.turnOnDebug();
            } catch (Throwable unused) {
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class r implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f2108a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;

        public r(String str, String str2, String str3, String str4) {
            this.f2108a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                AnalyticsMgr.b.updateUserAccount(this.f2108a, this.b, this.c, this.d);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class s {

        /* renamed from: a  reason: collision with root package name */
        public String f2109a;
        public String b;
        public MeasureSet c;
        public DimensionSet d;
        public boolean e;

        static {
            t2o.a(962592792);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class t implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(962592794);
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                o2w.k().C(vyp.i().g());
            } catch (Throwable th) {
                nhh.i("AnalyticsMgr", "UTInitSimpleTask", th);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class v implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(962592796);
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                nhh.m("AnalyticsMgr", "---延时启动任务开始---");
                boolean k = u51.k(AnalyticsMgr.g().getApplicationContext());
                synchronized (AnalyticsMgr.h()) {
                    int i = AnalyticsMgr.i();
                    if (i > 0) {
                        if (k) {
                            i = 3;
                        }
                        nhh.m("AnalyticsMgr", "delay " + i + " second to start service,waiting...");
                        try {
                            AnalyticsMgr.h().wait(i * 1000);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
                if (k) {
                    AnalyticsMgr.f();
                } else {
                    AnalyticsMgr.k(AnalyticsMgr.l());
                }
                new u().run();
                nhh.m("AnalyticsMgr", "---延时启动任务结束---");
            } catch (Throwable th) {
                nhh.i("AnalyticsMgr", "6", th);
            }
        }
    }

    /* compiled from: Taobao */
    @Deprecated
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class w extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(962592797);
        }

        public w(Looper looper) {
            super(looper);
        }

        public static /* synthetic */ Object ipc$super(w wVar, String str, Object... objArr) {
            if (str.hashCode() == 673877017) {
                super.handleMessage((Message) objArr[0]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/analytics/AnalyticsMgr$WaitingHandler");
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                return;
            }
            try {
                Object obj = message.obj;
                if (obj != null && (obj instanceof Runnable)) {
                    ((Runnable) obj).run();
                }
            } catch (Throwable th) {
                nhh.h("AnalyticsMgr", th, new Object[0]);
            }
            super.handleMessage(message);
        }
    }

    static {
        t2o.a(962592770);
    }

    public static Runnable A(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Runnable) ipChange.ipc$dispatch("d03c6516", new Object[]{str, str2});
        }
        return new f(str, str2);
    }

    public static Runnable B(boolean z2, boolean z3, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Runnable) ipChange.ipc$dispatch("dd054643", new Object[]{new Boolean(z2), new Boolean(z3), str, str2});
        }
        return new n(z2, z3, str, str2);
    }

    public static Runnable C(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Runnable) ipChange.ipc$dispatch("2a3eaa1e", new Object[]{map});
        }
        return new c(map);
    }

    public static Runnable D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Runnable) ipChange.ipc$dispatch("a2ec8316", new Object[0]);
        }
        return new m();
    }

    public static Runnable E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Runnable) ipChange.ipc$dispatch("872ebad", new Object[0]);
        }
        return new q();
    }

    public static Runnable F(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Runnable) ipChange.ipc$dispatch("cb94c1ab", new Object[]{map});
        }
        return new l(map);
    }

    public static Runnable G(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Runnable) ipChange.ipc$dispatch("d8a5dfba", new Object[]{map});
        }
        return new a(map);
    }

    public static Runnable H(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Runnable) ipChange.ipc$dispatch("7bb5d263", new Object[]{str, str2, str3, str4});
        }
        return new r(str, str2, str3, str4);
    }

    public static void I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("510b5002", new Object[0]);
        } else if (p()) {
            ((m2v) c).a(w());
        }
    }

    public static int J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d793e316", new Object[0])).intValue();
        }
        String i2 = u51.i(f2097a.getApplicationContext(), "UTANALYTICS_REMOTE_SERVICE_DELAY_SECOND");
        int i3 = z;
        int i4 = A;
        if (i4 >= 0 && i4 <= 30) {
            i3 = i4;
        }
        if (TextUtils.isEmpty(i2)) {
            return i3;
        }
        try {
            int intValue = Integer.valueOf(i2).intValue();
            return (intValue < 0 || intValue > 30) ? i3 : intValue;
        } catch (Throwable unused) {
            return i3;
        }
    }

    public static String K(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6ee50ae1", new Object[]{str});
        }
        if (p() && str != null) {
            return (String) ((ConcurrentHashMap) v).get(str);
        }
        return null;
    }

    public static String L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ea2ce1f", new Object[0]);
        }
        return p;
    }

    public static d8e M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d8e) ipChange.ipc$dispatch("75ba964e", new Object[0]);
        }
        return d;
    }

    public static String N(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a4afea14", new Object[]{str});
        }
        IAnalytics iAnalytics = b;
        if (iAnalytics == null) {
            return null;
        }
        try {
            return iAnalytics.getValue(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public static void O(Exception exc) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e02181e", new Object[]{exc});
            return;
        }
        nhh.u("AnalyticsMgr", exc, new Object[0]);
        if (exc instanceof DeadObjectException) {
            W();
        }
    }

    public static void Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c402122", new Object[0]);
            return;
        }
        h = RunMode.Local;
        b = new AnalyticsImp(f2097a);
        nhh.v("AnalyticsMgr", "Analytics Service run in local Mode...");
    }

    public static void R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c040718f", new Object[0]);
            return;
        }
        try {
            Object obj = f;
            synchronized (obj) {
                obj.notifyAll();
            }
        } catch (Throwable unused) {
        }
    }

    public static void S() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83d13a74", new Object[0]);
        } else if (p()) {
            ((m2v) c).a(s());
        }
    }

    public static void T() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7f3c09", new Object[0]);
        } else if (p()) {
            ((m2v) c).a(t());
        }
    }

    public static void V(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("286ea5cd", new Object[]{str});
        } else if (p() && !hsq.f(str)) {
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) v;
            if (concurrentHashMap.containsKey(str)) {
                concurrentHashMap.remove(str);
                ((m2v) c).a(v(str));
            }
        }
    }

    public static void W() {
        Map<String, String> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fd48316", new Object[0]);
            return;
        }
        nhh.f("AnalyticsMgr", "[restart]");
        try {
            if (i) {
                i = false;
                Q();
                r().run();
                B(m, x, j, l).run();
                z(k).run();
                y(n).run();
                H(o, p, y, q).run();
                G(t).run();
                if (r) {
                    E().run();
                }
                boolean z2 = s;
                if (z2 && (map = u) != null) {
                    C(map).run();
                } else if (z2) {
                    D().run();
                }
                List synchronizedList = Collections.synchronizedList(new ArrayList());
                List<s> list = mRegisterList;
                synchronized (list) {
                    synchronizedList.addAll(list);
                }
                for (int i2 = 0; i2 < synchronizedList.size(); i2++) {
                    s sVar = (s) synchronizedList.get(i2);
                    if (sVar != null) {
                        u(sVar.f2109a, sVar.b, sVar.c, sVar.d, sVar.e, false).run();
                    }
                }
                for (Map.Entry entry : ((ConcurrentHashMap) v).entrySet()) {
                    b0((String) entry.getKey(), (String) entry.getValue());
                }
            }
        } catch (Throwable th) {
            nhh.i("AnalyticsMgr", "[restart]", th);
        }
    }

    public static void X() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8cb210e6", new Object[0]);
        } else if (p()) {
            ((m2v) c).a(x(vep.a().b()));
        }
    }

    public static void Y(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cefab34a", new Object[]{str});
        } else if (p()) {
            ((m2v) c).a(y(str));
            n = str;
        }
    }

    public static void Z(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c107c6cc", new Object[]{str});
        } else if (p()) {
            ((m2v) c).a(z(str));
            k = str;
        }
    }

    @Deprecated
    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab02f562", new Object[0]);
            return;
        }
        HandlerThread handlerThread = new HandlerThread("Analytics_Client_Deprecated");
        try {
            handlerThread.start();
        } catch (Throwable th) {
            nhh.i("AnalyticsMgr", "1", th);
        }
        Looper looper = null;
        for (int i2 = 0; i2 < 3; i2++) {
            try {
                looper = handlerThread.getLooper();
                if (looper != null) {
                    break;
                }
                Thread.sleep(10L);
            } catch (Throwable th2) {
                nhh.i("AnalyticsMgr", "3", th2);
            }
        }
        new w(looper);
    }

    public static void a0(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98f4ce67", new Object[]{new Integer(i2)});
        } else if (i2 >= 0 && i2 <= 30) {
            A = i2;
        }
    }

    public static /* synthetic */ ServiceConnection b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ServiceConnection) ipChange.ipc$dispatch("94d9f46b", new Object[0]);
        }
        return B;
    }

    public static /* synthetic */ Object c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("79619b7a", new Object[0]);
        }
        return e;
    }

    public static void c0(boolean z2, boolean z3, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5136307e", new Object[]{new Boolean(z2), new Boolean(z3), str, str2});
        } else if (p()) {
            ((m2v) c).a(B(z2, z3, str, str2));
            m = z2;
            j = str;
            l = str2;
            x = z3;
        }
    }

    public static /* synthetic */ void d(String str, String str2, MeasureSet measureSet, DimensionSet dimensionSet, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99cd54d2", new Object[]{str, str2, measureSet, dimensionSet, new Boolean(z2)});
        } else {
            n(str, str2, measureSet, dimensionSet, z2);
        }
    }

    public static void d0(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7854497", new Object[]{map});
        } else if (p()) {
            ((m2v) c).a(C(map));
        }
    }

    public static /* synthetic */ boolean e(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b117a53d", new Object[]{new Boolean(z2)})).booleanValue();
        }
        i = z2;
        return z2;
    }

    public static void e0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f108167d", new Object[0]);
        } else if (p()) {
            ((m2v) c).a(D());
            s = false;
        }
    }

    public static /* synthetic */ void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b88b93a", new Object[0]);
        } else {
            Q();
        }
    }

    public static void f0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc27dd7e", new Object[0]);
        } else if (p()) {
            ((m2v) c).a(E());
            r = true;
            nhh.s(true);
        }
    }

    public static /* synthetic */ Application g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Application) ipChange.ipc$dispatch("96a2374a", new Object[0]);
        }
        return f2097a;
    }

    public static void g0(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ee88af2", new Object[]{map});
        } else if (p()) {
            ((m2v) c).a(F(map));
            u = map;
            s = true;
        }
    }

    public static /* synthetic */ Object h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("6967d6f6", new Object[0]);
        }
        return f;
    }

    public static void h0(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17bd97e", new Object[]{map});
        } else if (p()) {
            ((m2v) c).a(G(map));
            t = map;
        }
    }

    public static /* synthetic */ int i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fa3b6af0", new Object[0])).intValue();
        }
        return J();
    }

    @Deprecated
    public static void i0(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c37d5d3e", new Object[]{str, str2, str3});
        } else {
            j0(str, str2, str3, null);
        }
    }

    public static /* synthetic */ boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2f21a642", new Object[0])).booleanValue();
        }
        return w;
    }

    public static /* synthetic */ boolean k(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b87d8598", new Object[]{new Boolean(z2)})).booleanValue();
        }
        w = z2;
        return z2;
    }

    public static void k0(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba557953", new Object[]{str, str2, str3, str4});
            return;
        }
        o = str;
        if (TextUtils.isEmpty(str2)) {
            p = null;
            y = null;
        } else if (!TextUtils.isEmpty(str3) || !str2.equals(p)) {
            p = str2;
            y = str3;
        }
        q = str4;
    }

    public static /* synthetic */ boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6407e183", new Object[0])).booleanValue();
        }
        return o();
    }

    public static /* synthetic */ Runnable m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Runnable) ipChange.ipc$dispatch("b87d0d4", new Object[0]);
        }
        return r();
    }

    public static boolean o() {
        boolean z2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("780e5443", new Object[0])).booleanValue();
        }
        if (f2097a == null) {
            return false;
        }
        if (h == RunMode.Service) {
            a5e uTService = x2v.getUTService();
            if (uTService != null) {
                nhh.m("AnalyticsMgr", "+++UTService bindService+++");
                z2 = uTService.bindService(new Intent(f2097a.getApplicationContext(), AnalyticsService.class), B, 1);
            } else {
                nhh.m("AnalyticsMgr", "+++ApplicationService bindService+++");
                z2 = f2097a.getApplicationContext().bindService(new Intent(f2097a.getApplicationContext(), AnalyticsService.class), B, 1);
            }
            if (!z2) {
                Q();
            }
        } else {
            Q();
            z2 = false;
        }
        nhh.m("AnalyticsMgr", "bindSuccess", Boolean.valueOf(z2));
        return z2;
    }

    public static boolean p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9fdaa2c3", new Object[0])).booleanValue();
        }
        if (!g) {
            nhh.f("AnalyticsMgr", "Please call init() before call other method");
        }
        return g;
    }

    public static boolean q(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8299c92d", new Object[]{str, str2})).booleanValue();
        }
        if (hsq.f(str) || hsq.f(str2)) {
            return false;
        }
        try {
            for (s sVar : mRegisterList) {
                if (str.equals(sVar.f2109a) && str2.equals(sVar.b)) {
                    return false;
                }
            }
        } catch (Exception unused) {
        }
        return true;
    }

    public static Runnable r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Runnable) ipChange.ipc$dispatch("7dce22bc", new Object[0]);
        }
        return new k();
    }

    public static Runnable s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Runnable) ipChange.ipc$dispatch("3947d3f", new Object[0]);
        }
        return new d();
    }

    public static Runnable t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Runnable) ipChange.ipc$dispatch("459d840a", new Object[0]);
        }
        return new e();
    }

    public static Runnable u(String str, String str2, MeasureSet measureSet, DimensionSet dimensionSet, boolean z2, boolean z3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Runnable) ipChange.ipc$dispatch("6445176d", new Object[]{str, str2, measureSet, dimensionSet, new Boolean(z2), new Boolean(z3)});
        }
        return new j(z3, str, str2, measureSet, dimensionSet, z2);
    }

    public static Runnable v(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Runnable) ipChange.ipc$dispatch("fa345b06", new Object[]{str});
        }
        return new g(str);
    }

    public static Runnable w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Runnable) ipChange.ipc$dispatch("24f5cbcb", new Object[0]);
        }
        return new b();
    }

    public static Runnable x(long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Runnable) ipChange.ipc$dispatch("2a2d1b77", new Object[]{new Long(j2)});
        }
        return new i(j2);
    }

    public static Runnable y(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Runnable) ipChange.ipc$dispatch("9a735ca1", new Object[]{str});
        }
        return new p(str);
    }

    public static Runnable z(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Runnable) ipChange.ipc$dispatch("76414621", new Object[]{str});
        }
        return new o(str);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                nhh.f("AnalyticsMgr", "onBackground");
                AnalyticsMgr.b.onBackground();
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                nhh.f("AnalyticsMgr", "onForeground");
                AnalyticsMgr.b.onForeground();
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class i implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ long f2102a;

        public i(long j) {
            this.f2102a = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                nhh.f("AnalyticsMgr", "sessionUpdateInChannel");
                AnalyticsMgr.b.sessionUpdateInChannel(this.f2102a);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class u implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(962592795);
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                if (AnalyticsMgr.j()) {
                    nhh.m("AnalyticsMgr", "wait the Remote service connected...");
                    synchronized (AnalyticsMgr.c()) {
                        try {
                            AnalyticsMgr.c().wait(30000L);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
                if (AnalyticsMgr.b == null) {
                    nhh.m("AnalyticsMgr", "cannot get remote analytics object,new local object");
                    AnalyticsMgr.f();
                }
                AnalyticsMgr.m().run();
            } catch (Throwable th) {
                nhh.i("AnalyticsMgr", "7", th);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class h implements ServiceConnection {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5a4ef237", new Object[]{this, componentName});
                return;
            }
            nhh.f("AnalyticsMgr", "[onServiceDisconnected]");
            synchronized (AnalyticsMgr.c()) {
                AnalyticsMgr.c().notifyAll();
            }
            AnalyticsMgr.e(true);
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1495fa3c", new Object[]{this, componentName, iBinder});
                return;
            }
            nhh.f("AnalyticsMgr", "+++onServiceConnected mConnection+++", AnalyticsMgr.b());
            if (RunMode.Service == AnalyticsMgr.h) {
                IAnalytics asInterface = IAnalytics.Stub.asInterface(iBinder);
                AnalyticsMgr.b = asInterface;
                nhh.m("AnalyticsMgr", "onServiceConnected iAnalytics", asInterface);
            }
            synchronized (AnalyticsMgr.c()) {
                AnalyticsMgr.c().notifyAll();
            }
        }
    }

    public static synchronized void P(Application application) {
        synchronized (AnalyticsMgr.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3847dd28", new Object[]{application});
                return;
            }
            if (!g) {
                nhh.m("AnalyticsMgr", "[init] start sdk_version", g0v.b().a());
                f2097a = application;
                if (u51.l(application)) {
                    b3v d2 = b3v.d();
                    d = d2;
                    d2.e();
                    ((b3v) d).a(new t());
                }
                m2v d3 = m2v.d();
                c = d3;
                d3.e();
                a();
                ((m2v) c).a(new v());
                g = true;
                nhh.f("AnalyticsMgr", "++++++++++++AnalyticsMgr init完成++++++++++++");
            }
            nhh.v("AnalyticsMgr", "isInit", Boolean.valueOf(g), "sdk_version", g0v.b().a());
        }
    }

    public static void b0(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d56d47b5", new Object[]{str, str2});
        } else if (p()) {
            if (hsq.f(str) || str2 == null) {
                nhh.i("AnalyticsMgr", "setGlobalProperty", "key is null or key is empty or value is null,please check it!");
                return;
            }
            ((ConcurrentHashMap) v).put(str, str2);
            ((m2v) c).a(A(str, str2));
        }
    }

    public static void j0(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5c8f388", new Object[]{str, str2, str3, str4});
            return;
        }
        nhh.m("AnalyticsMgr", "userNick", str, "userId", str2, "openId", str3, "userSite", str4);
        if (p()) {
            ((m2v) c).a(H(str, str2, str3, str4));
            k0(str, str2, str3, str4);
        }
    }

    public static void U(String str, String str2, MeasureSet measureSet, DimensionSet dimensionSet, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9377804e", new Object[]{str, str2, measureSet, dimensionSet, new Boolean(z2)});
        } else if (p()) {
            nhh.f("AnalyticsMgr", "[register] : module:", str, "monitorPoint:", str2, "measures:", measureSet, "dimensions:", dimensionSet, "isCommitDetail:", Boolean.valueOf(z2));
            ((m2v) c).a(u(str, str2, measureSet, dimensionSet, z2, true));
        }
    }

    public static synchronized void n(String str, String str2, MeasureSet measureSet, DimensionSet dimensionSet, boolean z2) {
        synchronized (AnalyticsMgr.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("85957a0a", new Object[]{str, str2, measureSet, dimensionSet, new Boolean(z2)});
            } else if (!q(str, str2)) {
                nhh.f("AnalyticsMgr", "[checkRegisterEntityValid] : module:", str, "monitorPoint:", str2, pg1.ATOM_EXT_repeat, Boolean.TRUE);
            } else {
                try {
                    s sVar = new s();
                    sVar.f2109a = str;
                    sVar.b = str2;
                    sVar.c = measureSet;
                    sVar.d = dimensionSet;
                    sVar.e = z2;
                    mRegisterList.add(sVar);
                } catch (Throwable unused) {
                }
            }
        }
    }
}
