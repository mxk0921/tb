package com.taobao.adaemon;

import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Debug;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ACCSClient;
import com.taobao.accs.AccsException;
import com.taobao.accs.IHeartBeat;
import com.taobao.accs.connection.state.TimeMeter;
import com.taobao.accs.connection.state.a;
import com.taobao.accs.utl.UtilityImpl;
import com.taobao.adaemon.LocalProcessMonitor;
import com.taobao.adaemon.ProcessController;
import com.taobao.adaemon.anr.ANRHacker;
import com.taobao.adaemon.e;
import com.taobao.adaemon.power.APower;
import com.taobao.android.linkback.LinkBackUrlExecutor;
import com.taobao.android.live.plugin.proxy.FlexaLiveX;
import com.taobao.aranger.exception.IPCException;
import com.taobao.artc.api.AConstants;
import com.taobao.tao.TBMainHost;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.cp;
import tb.e61;
import tb.h5d;
import tb.hkq;
import tb.m09;
import tb.mf;
import tb.nxm;
import tb.obq;
import tb.oxn;
import tb.s55;
import tb.sy9;
import tb.t2o;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class LocalProcessMonitor {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile boolean W = false;
    public static boolean X = false;
    public volatile int A;
    public volatile WeakReference<Activity> B;
    public volatile long C;
    public volatile Pair<Long, Long> D;
    public volatile long E;
    public volatile String F;
    public volatile boolean G;
    public volatile boolean H;
    public final Application.ActivityLifecycleCallbacks I;
    public String J;
    public String K;
    public long L;
    public k M;
    public Pair<Long, Long> N;
    public boolean O;
    public volatile boolean P;
    public long Q;
    public volatile int R;
    public final IRemoteProcessHandler S;
    public final BroadcastReceiver T;
    public final Runnable U;
    public Integer V;

    /* renamed from: a  reason: collision with root package name */
    public volatile Boolean f6112a;
    public String b;
    public SharedPreferences c;
    public SharedPreferences.Editor d;
    public long e;
    public long f;
    public String g;
    public volatile boolean h;
    public Context i;
    public final AtomicBoolean j;
    public final AtomicBoolean k;
    public final List<WeakReference<Activity>> l;
    public volatile nxm m;
    public e61 n;
    public boolean o;
    public final APower p;
    public long q;
    public final ComponentCallbacks2 r;
    public final IHeartBeat s;
    public boolean t;
    public final a.g u;
    public volatile long v;
    public volatile String w;
    public volatile String x;
    public volatile String y;
    public volatile String z;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements IHeartBeat {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // com.taobao.accs.IHeartBeat
        public void onPingSuccess(String str) throws IPCException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("290e2be3", new Object[]{this, str});
                return;
            }
            LocalProcessMonitor.this.R0(0L, false);
            if (oxn.s().G()) {
                LocalProcessMonitor.h0().V0();
            }
        }

        @Override // com.taobao.accs.IHeartBeat
        public void onPingTimeout(String str) throws IPCException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b586bec1", new Object[]{this, str});
                return;
            }
            LocalProcessMonitor.this.R0(0L, false);
            if (oxn.s().G()) {
                LocalProcessMonitor.h0().V0();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class d implements Application.ActivityLifecycleCallbacks {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public int f6119a;

        public d() {
        }

        public final void f(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ecb4fd5c", new Object[]{this, activity});
                return;
            }
            Context applicationContext = activity.getApplicationContext();
            if (LocalProcessMonitor.x(LocalProcessMonitor.this) == null) {
                LocalProcessMonitor.A(LocalProcessMonitor.this, applicationContext);
            }
            mf.k(new Runnable() { // from class: tb.e9h
                @Override // java.lang.Runnable
                public final void run() {
                    LocalProcessMonitor.d.this.g();
                }
            }, 10L, TimeUnit.SECONDS);
        }

        public final /* synthetic */ void h(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6a73d7c4", new Object[]{this, str, str2});
                return;
            }
            try {
                if (oxn.s().h().contains(str)) {
                    if ((!"com.taobao.android.layoutmanager.container.MultiPageTransparentContainerActivity".equals(str) || LocalProcessMonitor.D(LocalProcessMonitor.this, str, str2)) && Build.VERSION.SDK_INT >= 23) {
                        LocalProcessMonitor.F(LocalProcessMonitor.this, com.taobao.adaemon.g.n());
                        LocalProcessMonitor.J(LocalProcessMonitor.this, SystemClock.elapsedRealtime());
                        LocalProcessMonitor.H(LocalProcessMonitor.this, str);
                        LocalProcessMonitor.m(LocalProcessMonitor.this, true);
                        s55.i("LocalProcM", "calcCpuConsume start", "activity", str);
                    }
                }
            } catch (Throwable th) {
                s55.h("LocalProcM", "onActivityCreated calc err", th, new Object[0]);
            }
        }

        public final /* synthetic */ void i() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7fb3bd0a", new Object[]{this});
                return;
            }
            LocalProcessMonitor.K(LocalProcessMonitor.this);
            if (LocalProcessMonitor.i(LocalProcessMonitor.this).get()) {
                ProcessController.IPC.e(LocalProcessMonitor.j(LocalProcessMonitor.this), false, null);
            }
        }

        public final /* synthetic */ void j() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6a9efcd7", new Object[]{this});
            } else {
                LocalProcessMonitor.q(LocalProcessMonitor.this).c.e();
            }
        }

        public final /* synthetic */ void k(String str, String str2) {
            String str3;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("86c6fd6c", new Object[]{this, str, str2});
                return;
            }
            if (LocalProcessMonitor.l(LocalProcessMonitor.this) && LocalProcessMonitor.E(LocalProcessMonitor.this) != null && str.equals(LocalProcessMonitor.G(LocalProcessMonitor.this))) {
                try {
                    Pair<Long, Long> n = com.taobao.adaemon.g.n();
                    if (n != null) {
                        long longValue = (((Long) n.first).longValue() - ((Long) LocalProcessMonitor.E(LocalProcessMonitor.this).first).longValue()) + (((Long) n.second).longValue() - ((Long) LocalProcessMonitor.E(LocalProcessMonitor.this).second).longValue());
                        long elapsedRealtime = SystemClock.elapsedRealtime() - LocalProcessMonitor.I(LocalProcessMonitor.this);
                        if (longValue > 0 && elapsedRealtime > 30000) {
                            e.h hVar = new e.h("cpu_consume_v1", longValue);
                            StringBuilder sb = new StringBuilder();
                            sb.append(str);
                            if (LocalProcessMonitor.D(LocalProcessMonitor.this, str, str2)) {
                                str3 = "_theater";
                            } else {
                                str3 = "";
                            }
                            sb.append(str3);
                            hVar.f(sb.toString()).b();
                            s55.i("LocalProcM", "calcCpuConsume end", "activity", str, "cpu usage(ms)", Long.valueOf(longValue));
                        }
                    } else {
                        return;
                    }
                } catch (Throwable th) {
                    s55.h("LocalProcM", "onActivityDestroyed calc err", th, new Object[0]);
                }
            } else if ("com.taobao.android.layoutmanager.container.MultiPageTransparentContainerActivity".equals(LocalProcessMonitor.G(LocalProcessMonitor.this)) && LocalProcessMonitor.l(LocalProcessMonitor.this)) {
                return;
            }
            LocalProcessMonitor.m(LocalProcessMonitor.this, false);
            LocalProcessMonitor.F(LocalProcessMonitor.this, null);
            LocalProcessMonitor.J(LocalProcessMonitor.this, 0L);
        }

        public final boolean l(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("1de10506", new Object[]{this, str, str2})).booleanValue();
            }
            if (FlexaLiveX.TAO_LIVE_VIDEO_ACTIVITY.equals(str)) {
                return tb.f.f();
            }
            if ("com.taobao.android.detail2.core.framework.NewDetailActivity".equals(str)) {
                return tb.f.e();
            }
            if (LocalProcessMonitor.D(LocalProcessMonitor.this, str, str2)) {
                return tb.f.h();
            }
            return false;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a4658a75", new Object[]{this, activity});
                return;
            }
            String localClassName = activity.getLocalClassName();
            LocalProcessMonitor.X(LocalProcessMonitor.this, localClassName);
            LocalProcessMonitor.Z(LocalProcessMonitor.this, "onActivityPaused");
            int hashCode = activity.hashCode();
            s55.i("LocalProcM", "onActivityPaused", "name", localClassName, "hash", Integer.valueOf(hashCode));
            sy9.m().B(hashCode, 1);
            if ("com.taobao.tao.welcome.Welcome".equals(localClassName) || obq.BIZ_NAME.equals(localClassName)) {
                sy9.m().z(LocalProcessMonitor.x(LocalProcessMonitor.this), 0);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3e8abf42", new Object[]{this, activity});
                return;
            }
            String localClassName = activity.getLocalClassName();
            LocalProcessMonitor localProcessMonitor = LocalProcessMonitor.this;
            LocalProcessMonitor.X(localProcessMonitor, LocalProcessMonitor.s(localProcessMonitor, localClassName));
            LocalProcessMonitor.Z(LocalProcessMonitor.this, "onActivityResumed");
            LocalProcessMonitor.u(LocalProcessMonitor.this, activity.hashCode());
            LocalProcessMonitor.v(LocalProcessMonitor.this, new WeakReference(activity));
            LocalProcessMonitor.w(LocalProcessMonitor.this, SystemClock.elapsedRealtime());
            s55.i("LocalProcM", "onActivityResumed", "name", LocalProcessMonitor.r(LocalProcessMonitor.this), "hash", Integer.valueOf(LocalProcessMonitor.t(LocalProcessMonitor.this)));
            sy9.m().F(LocalProcessMonitor.t(LocalProcessMonitor.this), 1);
            if (LocalProcessMonitor.this.R > 0) {
                return;
            }
            if ("com.taobao.tao.welcome.Welcome".equals(localClassName) || obq.BIZ_NAME.equals(localClassName)) {
                sy9.m().z(LocalProcessMonitor.x(LocalProcessMonitor.this), 10102);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2c9c12a", new Object[]{this, activity, bundle});
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5e01616c", new Object[]{this, activity});
                return;
            }
            LocalProcessMonitor.X(LocalProcessMonitor.this, activity.getLocalClassName());
            LocalProcessMonitor.Z(LocalProcessMonitor.this, "onActivityStarted");
            s55.i("LocalProcM", "onActivityStarted", "name", LocalProcessMonitor.W(LocalProcessMonitor.this));
            int i = this.f6119a;
            this.f6119a = i + 1;
            if (i == 0) {
                LocalProcessMonitor.n(LocalProcessMonitor.this, activity, Boolean.TRUE);
                LocalProcessMonitor.o(true);
                LocalProcessMonitor.p(LocalProcessMonitor.this, false);
                s55.i("LocalProcM", "foreground()", new Object[0]);
                mf.l(new Runnable() { // from class: tb.c9h
                    @Override // java.lang.Runnable
                    public final void run() {
                        LocalProcessMonitor.d.this.i();
                    }
                });
                final APower.e eVar = LocalProcessMonitor.q(LocalProcessMonitor.this).c;
                eVar.getClass();
                mf.j(new Runnable() { // from class: tb.d9h
                    @Override // java.lang.Runnable
                    public final void run() {
                        APower.e.this.a();
                    }
                });
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            Activity activity2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dc236bb8", new Object[]{this, activity});
                return;
            }
            final String localClassName = activity.getLocalClassName();
            LocalProcessMonitor.X(LocalProcessMonitor.this, localClassName);
            LocalProcessMonitor.Z(LocalProcessMonitor.this, "onActivityStopped");
            s55.i("LocalProcM", "onActivityStopped", "name", localClassName);
            int i = this.f6119a - 1;
            this.f6119a = i;
            if (i == 0) {
                LocalProcessMonitor.n(LocalProcessMonitor.this, activity, Boolean.FALSE);
                LocalProcessMonitor.o(true);
                LocalProcessMonitor.p(LocalProcessMonitor.this, true);
                s55.i("LocalProcM", "background()", new Object[0]);
                LocalProcessMonitor.this.b0(true);
                mf.j(new Runnable() { // from class: tb.a9h
                    @Override // java.lang.Runnable
                    public final void run() {
                        LocalProcessMonitor.d.this.j();
                    }
                });
                if (LocalProcessMonitor.y(LocalProcessMonitor.this) == null) {
                    LocalProcessMonitor localProcessMonitor = LocalProcessMonitor.this;
                    LocalProcessMonitor.z(localProcessMonitor, LocalProcessMonitor.B(localProcessMonitor).edit());
                }
                long currentTimeMillis = System.currentTimeMillis();
                List k = LocalProcessMonitor.k(LocalProcessMonitor.this);
                if (!k.isEmpty() && (activity2 = (Activity) ((WeakReference) k.get(k.size() - 1)).get()) != null) {
                    LocalProcessMonitor.y(LocalProcessMonitor.this).putString("background_page", activity2.getLocalClassName());
                }
                LocalProcessMonitor.y(LocalProcessMonitor.this).putLong("background_time", currentTimeMillis);
                LocalProcessMonitor.y(LocalProcessMonitor.this).apply();
            }
            LocalProcessMonitor.this.N = null;
            final String g = com.taobao.adaemon.g.g(activity);
            mf.a(new Runnable() { // from class: tb.b9h
                @Override // java.lang.Runnable
                public final void run() {
                    LocalProcessMonitor.d.this.k(localClassName, g);
                }
            });
        }

        public final /* synthetic */ void g() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c2cf0dbd", new Object[]{this});
                return;
            }
            try {
                if (oxn.s().l(LocalProcessMonitor.x(LocalProcessMonitor.this), "triggerType", 0) != 0) {
                    oxn.s().L(LocalProcessMonitor.x(LocalProcessMonitor.this), 0);
                    oxn.s().H(LocalProcessMonitor.x(LocalProcessMonitor.this), AConstants.ArtcErrorServerErrorDropByMobility);
                }
            } catch (Exception e) {
                s55.h("LocalProcM", "reset trigger type error", e, new Object[0]);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4148cc84", new Object[]{this, activity});
                return;
            }
            LocalProcessMonitor.C(LocalProcessMonitor.this, SystemClock.elapsedRealtime());
            String localClassName = activity.getLocalClassName();
            LocalProcessMonitor.X(LocalProcessMonitor.this, localClassName);
            LocalProcessMonitor.Z(LocalProcessMonitor.this, "onActivityDestroyed");
            if ("wxapi.WXPayEntryActivity".equals(localClassName)) {
                LocalProcessMonitor.T(LocalProcessMonitor.this, false);
            }
            if (localClassName.equals(LocalProcessMonitor.V(LocalProcessMonitor.this))) {
                LocalProcessMonitor.Y(LocalProcessMonitor.this, null);
            }
            for (int i = 0; i < LocalProcessMonitor.k(LocalProcessMonitor.this).size(); i++) {
                WeakReference weakReference = (WeakReference) LocalProcessMonitor.k(LocalProcessMonitor.this).get(i);
                if (!(weakReference == null || weakReference.get() == null || weakReference.get() != activity)) {
                    LocalProcessMonitor.k(LocalProcessMonitor.this).remove(weakReference);
                }
            }
            s55.i("LocalProcM", "onActivityDestroyed", "name", localClassName, "activitySize", Integer.valueOf(LocalProcessMonitor.k(LocalProcessMonitor.this).size()));
            sy9.m().G(activity.hashCode());
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
                return;
            }
            if (!LocalProcessMonitor.R()) {
                LocalProcessMonitor.S(true);
                f(activity);
            }
            final String localClassName = activity.getLocalClassName();
            if ("wxapi.WXPayEntryActivity".equals(localClassName)) {
                LocalProcessMonitor.T(LocalProcessMonitor.this, true);
            } else if ("com.taobao.homepage.page.MagicWindowActivity".equals(localClassName)) {
                LocalProcessMonitor.U(LocalProcessMonitor.this, true);
            }
            LocalProcessMonitor localProcessMonitor = LocalProcessMonitor.this;
            LocalProcessMonitor.X(localProcessMonitor, LocalProcessMonitor.Y(localProcessMonitor, localClassName));
            LocalProcessMonitor.Z(LocalProcessMonitor.this, "onActivityCreated");
            LocalProcessMonitor.k(LocalProcessMonitor.this).add(new WeakReference(activity));
            s55.i("LocalProcM", "onActivityCreated", "name", localClassName, "activitySize", Integer.valueOf(LocalProcessMonitor.k(LocalProcessMonitor.this).size()));
            Intent intent = activity.getIntent();
            final String dataString = intent != null ? intent.getDataString() : null;
            if (l(localClassName, dataString)) {
                sy9.m().A(activity);
            }
            LocalProcessMonitor.m(LocalProcessMonitor.this, false);
            mf.a(new Runnable() { // from class: tb.z8h
                @Override // java.lang.Runnable
                public final void run() {
                    LocalProcessMonitor.d.this.h(localClassName, dataString);
                }
            });
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class e implements IRemoteProcessHandler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        public final void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("671436f5", new Object[]{this});
                return;
            }
            try {
                LinkBackUrlExecutor.c().a();
            } catch (Throwable th) {
                s55.h("LocalProcM", "clearLinkBack err", th, new Object[0]);
            }
        }

        @Override // com.taobao.adaemon.IRemoteProcessHandler
        public long getLiveTime() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("5281a44a", new Object[]{this})).longValue();
            }
            LocalProcessMonitor.L(LocalProcessMonitor.this);
            return LocalProcessMonitor.M(LocalProcessMonitor.this);
        }

        @Override // com.taobao.adaemon.IRemoteProcessHandler
        public String getMainProcCpuCost() throws IPCException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("3462cd49", new Object[]{this});
            }
            Pair<Long, Long> n = com.taobao.adaemon.g.n();
            if (n == null) {
                return null;
            }
            return n.first + "," + n.second;
        }

        @Override // com.taobao.adaemon.IRemoteProcessHandler
        public boolean isProcessLive() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("e648f47c", new Object[]{this})).booleanValue();
            }
            return true;
        }

        @Override // com.taobao.adaemon.IRemoteProcessHandler
        public boolean isTinyProcess() throws IPCException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("18d6b9d0", new Object[]{this})).booleanValue();
            }
            return com.taobao.adaemon.g.S();
        }

        @Override // com.taobao.adaemon.IRemoteProcessHandler
        public void tryDumpMainProc(long j, long j2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1fcfa0e5", new Object[]{this, new Long(j), new Long(j2)});
                return;
            }
            try {
                ((APower.c) LocalProcessMonitor.q(LocalProcessMonitor.this).f6158a).j(j, j2);
            } catch (Throwable th) {
                s55.h("LocalProcM", "tryDumpMainProc", th, new Object[0]);
            }
        }

        public static /* synthetic */ void c(List list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("de7584ad", new Object[]{list});
                return;
            }
            for (int i = 0; i < list.size(); i++) {
                WeakReference weakReference = (WeakReference) list.get(i);
                if (weakReference == null) {
                    s55.i("LocalProcM", "ref null:", new Object[0]);
                } else {
                    Activity activity = (Activity) weakReference.get();
                    String localClassName = activity.getLocalClassName();
                    if (!activity.isFinishing()) {
                        s55.i("LocalProcM", "finish activity:" + localClassName, new Object[0]);
                        activity.finish();
                    }
                }
            }
        }

        @Override // com.taobao.adaemon.IRemoteProcessHandler
        public boolean clearActivityStack() {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("26833df7", new Object[]{this})).booleanValue();
            }
            int size = LocalProcessMonitor.k(LocalProcessMonitor.this).size();
            s55.i("LocalProcM", "clearActivityStack:" + size, new Object[0]);
            try {
                boolean N = LocalProcessMonitor.N(LocalProcessMonitor.this);
                final ArrayList arrayList = new ArrayList();
                arrayList.addAll(LocalProcessMonitor.k(LocalProcessMonitor.this));
                if (!oxn.s().c() || N) {
                    List<String> j = oxn.s().j();
                    if (!j.isEmpty() && !arrayList.isEmpty()) {
                        WeakReference weakReference = (WeakReference) arrayList.get(arrayList.size() - 1);
                        if (weakReference.get() == null) {
                            str = "";
                        } else {
                            str = ((Activity) weakReference.get()).getClass().getName();
                        }
                        if (j.contains(str)) {
                            s55.i("LocalProcM", "clearActivityStack block", "topActivityName", str);
                            return false;
                        }
                    }
                    if (oxn.s().k()) {
                        b();
                    }
                }
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: tb.f9h
                    @Override // java.lang.Runnable
                    public final void run() {
                        LocalProcessMonitor.e.c(arrayList);
                    }
                });
                LocalProcessMonitor.k(LocalProcessMonitor.this).clear();
                return true;
            } catch (Exception e) {
                s55.h("LocalProcM", "[clearActivityStack]", null, e);
                return false;
            }
        }

        @Override // com.taobao.adaemon.IRemoteProcessHandler
        public boolean isBgFromHomePage() throws IPCException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("27d30792", new Object[]{this})).booleanValue();
            }
            String q = oxn.s().q();
            String str = null;
            if (TextUtils.isEmpty(q) || LocalProcessMonitor.k(LocalProcessMonitor.this).size() != 1) {
                s55.g("LocalProcM", "isBgFromHomePage:", null, "homepage", q, "size", Integer.valueOf(LocalProcessMonitor.k(LocalProcessMonitor.this).size()));
                return false;
            }
            WeakReference weakReference = (WeakReference) LocalProcessMonitor.k(LocalProcessMonitor.this).get(0);
            if (weakReference == null || weakReference.get() == null) {
                return false;
            }
            String localClassName = ((Activity) weakReference.get()).getLocalClassName();
            s55.g("LocalProcM", "isBgFromHomePage activity:" + localClassName, new Object[0]);
            if (!q.equals(localClassName)) {
                return false;
            }
            if ("com.taobao.taobao".equals(LocalProcessMonitor.x(LocalProcessMonitor.this).getPackageName())) {
                try {
                    str = TBMainHost.b().getCurrentFragment().getClass().getName();
                } catch (Throwable th) {
                    s55.h("LocalProcM", "isBgFromHomePage:", null, th);
                }
                if (!"com.taobao.tao.homepage.HomepageFragment".equals(str)) {
                    return false;
                }
                s55.g("LocalProcM", "to bg from home fragment", new Object[0]);
            } else {
                s55.g("LocalProcM", "to bg from home page", new Object[0]);
            }
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class f implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                LocalProcessMonitor.this.M0(0, false);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class g implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (LocalProcessMonitor.Q(LocalProcessMonitor.this).get()) {
                LocalProcessMonitor.L(LocalProcessMonitor.this);
                if (oxn.s().G()) {
                    LocalProcessMonitor.h0().V0();
                }
                mf.k(this, 300000L, TimeUnit.MILLISECONDS);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class h implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (com.taobao.adaemon.g.N(LocalProcessMonitor.x(LocalProcessMonitor.this))) {
                s55.i("LocalProcM", "mem stat, fg return", new Object[0]);
            } else {
                LocalProcessMonitor.this.M0(1, true);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class j {
        public static final LocalProcessMonitor INSTANCE = new LocalProcessMonitor(null);

        static {
            t2o.a(349175850);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class k {

        /* renamed from: a  reason: collision with root package name */
        public int f6125a;
        public String b = "";
        public String c = "";
        public String d = "";
        public String e = "";
        public long f = 0;
        public long g = 0;
        public long h = 0;

        static {
            t2o.a(349175851);
        }

        public k(LocalProcessMonitor localProcessMonitor) {
        }
    }

    static {
        t2o.a(349175837);
    }

    public /* synthetic */ LocalProcessMonitor(a aVar) {
        this();
    }

    public static /* synthetic */ Context A(LocalProcessMonitor localProcessMonitor, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("d2211eef", new Object[]{localProcessMonitor, context});
        }
        localProcessMonitor.i = context;
        return context;
    }

    public static /* synthetic */ SharedPreferences B(LocalProcessMonitor localProcessMonitor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences) ipChange.ipc$dispatch("37a48290", new Object[]{localProcessMonitor});
        }
        return localProcessMonitor.c;
    }

    public static /* synthetic */ long C(LocalProcessMonitor localProcessMonitor, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f344a99", new Object[]{localProcessMonitor, new Long(j2)})).longValue();
        }
        localProcessMonitor.C = j2;
        return j2;
    }

    public static /* synthetic */ boolean D(LocalProcessMonitor localProcessMonitor, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("49e03b56", new Object[]{localProcessMonitor, str, str2})).booleanValue();
        }
        return localProcessMonitor.t0(str, str2);
    }

    public static /* synthetic */ Pair E(LocalProcessMonitor localProcessMonitor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("ff922409", new Object[]{localProcessMonitor});
        }
        return localProcessMonitor.D;
    }

    public static /* synthetic */ Pair F(LocalProcessMonitor localProcessMonitor, Pair pair) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("4bbed4c3", new Object[]{localProcessMonitor, pair});
        }
        localProcessMonitor.D = pair;
        return pair;
    }

    public static /* synthetic */ String G(LocalProcessMonitor localProcessMonitor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cc5a12e0", new Object[]{localProcessMonitor});
        }
        return localProcessMonitor.F;
    }

    public static /* synthetic */ String H(LocalProcessMonitor localProcessMonitor, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9a7c3214", new Object[]{localProcessMonitor, str});
        }
        localProcessMonitor.F = str;
        return str;
    }

    public static /* synthetic */ long I(LocalProcessMonitor localProcessMonitor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b1a8bff5", new Object[]{localProcessMonitor})).longValue();
        }
        return localProcessMonitor.E;
    }

    public static /* synthetic */ long J(LocalProcessMonitor localProcessMonitor, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f65ed215", new Object[]{localProcessMonitor, new Long(j2)})).longValue();
        }
        localProcessMonitor.E = j2;
        return j2;
    }

    public static /* synthetic */ void K(LocalProcessMonitor localProcessMonitor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2722e642", new Object[]{localProcessMonitor});
        } else {
            localProcessMonitor.J0();
        }
    }

    public static /* synthetic */ void L(LocalProcessMonitor localProcessMonitor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c9d0c83", new Object[]{localProcessMonitor});
        } else {
            localProcessMonitor.U0();
        }
    }

    public static /* synthetic */ long M(LocalProcessMonitor localProcessMonitor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("121732b8", new Object[]{localProcessMonitor})).longValue();
        }
        return localProcessMonitor.f;
    }

    public static /* synthetic */ boolean N(LocalProcessMonitor localProcessMonitor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2a967c5e", new Object[]{localProcessMonitor})).booleanValue();
        }
        return localProcessMonitor.o0();
    }

    public static /* synthetic */ boolean O(LocalProcessMonitor localProcessMonitor, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7e471ae6", new Object[]{localProcessMonitor, new Boolean(z)})).booleanValue();
        }
        localProcessMonitor.t = z;
        return z;
    }

    public static /* synthetic */ void P(LocalProcessMonitor localProcessMonitor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a010a29b", new Object[]{localProcessMonitor});
        } else {
            localProcessMonitor.O0();
        }
    }

    public static /* synthetic */ AtomicBoolean Q(LocalProcessMonitor localProcessMonitor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicBoolean) ipChange.ipc$dispatch("a30b301d", new Object[]{localProcessMonitor});
        }
        return localProcessMonitor.j;
    }

    public static /* synthetic */ boolean R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("906ef47f", new Object[0])).booleanValue();
        }
        return W;
    }

    public static /* synthetic */ boolean S(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("80d9fefb", new Object[]{new Boolean(z)})).booleanValue();
        }
        W = z;
        return z;
    }

    public static /* synthetic */ boolean T(LocalProcessMonitor localProcessMonitor, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f1dc5ea4", new Object[]{localProcessMonitor, new Boolean(z)})).booleanValue();
        }
        localProcessMonitor.H = z;
        return z;
    }

    public static /* synthetic */ boolean U(LocalProcessMonitor localProcessMonitor, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2ba70083", new Object[]{localProcessMonitor, new Boolean(z)})).booleanValue();
        }
        localProcessMonitor.P = z;
        return z;
    }

    public static /* synthetic */ String V(LocalProcessMonitor localProcessMonitor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3662b4cb", new Object[]{localProcessMonitor});
        }
        return localProcessMonitor.x;
    }

    public static /* synthetic */ String W(LocalProcessMonitor localProcessMonitor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b801b0ec", new Object[]{localProcessMonitor});
        }
        return localProcessMonitor.y;
    }

    public static /* synthetic */ String X(LocalProcessMonitor localProcessMonitor, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("56b4e520", new Object[]{localProcessMonitor, str});
        }
        localProcessMonitor.y = str;
        return str;
    }

    public static /* synthetic */ String Y(LocalProcessMonitor localProcessMonitor, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("85664f3f", new Object[]{localProcessMonitor, str});
        }
        localProcessMonitor.x = str;
        return str;
    }

    public static /* synthetic */ String Z(LocalProcessMonitor localProcessMonitor, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b417b95e", new Object[]{localProcessMonitor, str});
        }
        localProcessMonitor.z = str;
        return str;
    }

    public static LocalProcessMonitor h0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LocalProcessMonitor) ipChange.ipc$dispatch("754fa23a", new Object[0]);
        }
        return j.INSTANCE;
    }

    public static /* synthetic */ AtomicBoolean i(LocalProcessMonitor localProcessMonitor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicBoolean) ipChange.ipc$dispatch("c3a9836d", new Object[]{localProcessMonitor});
        }
        return localProcessMonitor.k;
    }

    public static /* synthetic */ String j(LocalProcessMonitor localProcessMonitor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c1bb99b2", new Object[]{localProcessMonitor});
        }
        return localProcessMonitor.b;
    }

    public static /* synthetic */ List k(LocalProcessMonitor localProcessMonitor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("e4d0ce2b", new Object[]{localProcessMonitor});
        }
        return localProcessMonitor.l;
    }

    public static /* synthetic */ boolean l(LocalProcessMonitor localProcessMonitor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2c7b5ee1", new Object[]{localProcessMonitor})).booleanValue();
        }
        return localProcessMonitor.G;
    }

    public static /* synthetic */ boolean m(LocalProcessMonitor localProcessMonitor, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d5e04ad9", new Object[]{localProcessMonitor, new Boolean(z)})).booleanValue();
        }
        localProcessMonitor.G = z;
        return z;
    }

    public static /* synthetic */ void n(LocalProcessMonitor localProcessMonitor, Activity activity, Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("986cf75d", new Object[]{localProcessMonitor, activity, bool});
        } else {
            localProcessMonitor.T0(activity, bool);
        }
    }

    public static /* synthetic */ boolean o(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b2818acd", new Object[]{new Boolean(z)})).booleanValue();
        }
        X = z;
        return z;
    }

    public static /* synthetic */ boolean p(LocalProcessMonitor localProcessMonitor, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("83403076", new Object[]{localProcessMonitor, new Boolean(z)})).booleanValue();
        }
        localProcessMonitor.h = z;
        return z;
    }

    public static /* synthetic */ APower q(LocalProcessMonitor localProcessMonitor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (APower) ipChange.ipc$dispatch("14276187", new Object[]{localProcessMonitor});
        }
        return localProcessMonitor.p;
    }

    public static /* synthetic */ String r(LocalProcessMonitor localProcessMonitor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fcfb9ebe", new Object[]{localProcessMonitor});
        }
        return localProcessMonitor.w;
    }

    public static /* synthetic */ String s(LocalProcessMonitor localProcessMonitor, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("21b1c272", new Object[]{localProcessMonitor, str});
        }
        localProcessMonitor.w = str;
        return str;
    }

    public static boolean s0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("32bd6d67", new Object[0])).booleanValue();
        }
        if (W || X) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ int t(LocalProcessMonitor localProcessMonitor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ed584456", new Object[]{localProcessMonitor})).intValue();
        }
        return localProcessMonitor.A;
    }

    public static /* synthetic */ int u(LocalProcessMonitor localProcessMonitor, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("309fd631", new Object[]{localProcessMonitor, new Integer(i2)})).intValue();
        }
        localProcessMonitor.A = i2;
        return i2;
    }

    public static /* synthetic */ WeakReference v(LocalProcessMonitor localProcessMonitor, WeakReference weakReference) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeakReference) ipChange.ipc$dispatch("e4a86586", new Object[]{localProcessMonitor, weakReference});
        }
        localProcessMonitor.B = weakReference;
        return weakReference;
    }

    public static /* synthetic */ long w(LocalProcessMonitor localProcessMonitor, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a4351db1", new Object[]{localProcessMonitor, new Long(j2)})).longValue();
        }
        localProcessMonitor.v = j2;
        return j2;
    }

    public static /* synthetic */ Context x(LocalProcessMonitor localProcessMonitor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("5757f4e7", new Object[]{localProcessMonitor});
        }
        return localProcessMonitor.i;
    }

    public static /* synthetic */ SharedPreferences.Editor y(LocalProcessMonitor localProcessMonitor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences.Editor) ipChange.ipc$dispatch("aa6900d6", new Object[]{localProcessMonitor});
        }
        return localProcessMonitor.d;
    }

    public static /* synthetic */ SharedPreferences.Editor z(LocalProcessMonitor localProcessMonitor, SharedPreferences.Editor editor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences.Editor) ipChange.ipc$dispatch("ad3429d9", new Object[]{localProcessMonitor, editor});
        }
        localProcessMonitor.d = editor;
        return editor;
    }

    public final /* synthetic */ void A0(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("124bf10d", new Object[]{this, context});
        } else if (!this.k.get() && com.taobao.adaemon.g.L(context)) {
            O0();
        }
    }

    public final /* synthetic */ void C0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1700ed3", new Object[]{this});
        } else {
            this.p.c.d();
        }
    }

    public void I0(long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d8474db", new Object[]{this, new Long(j2)});
        } else {
            mf.k(new h(), j2, TimeUnit.MILLISECONDS);
        }
    }

    public void N0(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee56e7a", new Object[]{this, context});
        } else {
            ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(this.I);
        }
    }

    public void b0(final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609c1ab4", new Object[]{this, new Boolean(z)});
        } else {
            mf.l(new Runnable() { // from class: tb.y8h
                @Override // java.lang.Runnable
                public final void run() {
                    LocalProcessMonitor.this.w0(z);
                }
            });
        }
    }

    public int c0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("883ef7de", new Object[]{this})).intValue();
        }
        return ((ArrayList) this.l).size();
    }

    public String e0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ff024b15", new Object[]{this});
        }
        return this.w;
    }

    public Activity f0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("1a6bab3b", new Object[]{this});
        }
        if (this.B != null) {
            return this.B.get();
        }
        return null;
    }

    public int g0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("69ef94ae", new Object[]{this})).intValue();
        }
        return this.A;
    }

    public String i0(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("863edce8", new Object[]{this, context});
        }
        return l0(context).getString("background_page", "");
    }

    public long j0(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7cd2ff2e", new Object[]{this, context})).longValue();
        }
        return l0(context).getLong("background_time", 0L);
    }

    public Pair<String, String> k0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("14261215", new Object[]{this});
        }
        return Pair.create(this.y, this.z);
    }

    public final SharedPreferences l0(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences) ipChange.ipc$dispatch("bc7eafb3", new Object[]{this, context});
        }
        if (this.c == null) {
            this.c = context.getSharedPreferences(com.taobao.adaemon.g.o(context).replace(":", "_") + "_adaemon", 4);
        }
        return this.c;
    }

    public long m0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a37f7a22", new Object[]{this})).longValue();
        }
        return this.v;
    }

    public String n0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d3e102a0", new Object[]{this});
        }
        if (TextUtils.isEmpty(this.x)) {
            return this.w;
        }
        return this.x;
    }

    public void p0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e073e78", new Object[]{this, new Boolean(z)});
        } else {
            this.p.h(z);
        }
    }

    public boolean r0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9bf06855", new Object[]{this})).booleanValue();
        }
        return this.P;
    }

    public boolean u0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("85d86ec", new Object[]{this})).booleanValue();
        }
        return this.H;
    }

    public boolean v0(long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ba481673", new Object[]{this, new Long(j2)})).booleanValue();
        }
        if (this.C <= 0 || SystemClock.elapsedRealtime() - this.C > j2) {
            return false;
        }
        return true;
    }

    public final /* synthetic */ void x0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7802644", new Object[]{this});
            return;
        }
        this.p.f6158a.e();
        this.p.b.e();
    }

    public final /* synthetic */ void y0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cca5ff18", new Object[]{this});
            return;
        }
        this.p.f6158a.a();
        this.p.b.a();
    }

    public final /* synthetic */ void z0(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("119f456e", new Object[]{this, context});
        } else {
            a0(context);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class i {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final String f6124a = "adaemon_gc";
        public static final String b = "d";
        public static final String c = "c";
        public static final String d = "t";
        public static long e;
        public static long f;

        public static void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a187dea6", new Object[0]);
            } else {
                new WeakReference(new i());
            }
        }

        public void finalize() throws Throwable {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a35321a5", new Object[]{this});
                return;
            }
            super.finalize();
            if (TimeMeter.a("adaemon_gc", 300000L)) {
                mf.a(new Runnable() { // from class: tb.h9h
                    @Override // java.lang.Runnable
                    public final void run() {
                        LocalProcessMonitor.i.c();
                    }
                });
            }
            b();
        }

        public static /* synthetic */ void c() {
            String runtimeStat;
            String runtimeStat2;
            long j;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8e2be72e", new Object[0]);
                return;
            }
            try {
                SharedPreferences sharedPreferences = com.taobao.adaemon.g.l().getSharedPreferences(f6124a, 0);
                String str = b;
                int i = sharedPreferences.getInt(str, -1);
                int i2 = Calendar.getInstance().get(6);
                String str2 = c;
                long j2 = sharedPreferences.getLong(str2, 0L);
                String str3 = d;
                long j3 = sharedPreferences.getLong(str3, 0L);
                runtimeStat = Debug.getRuntimeStat("art.gc.gc-count");
                long parseLong = Long.parseLong(runtimeStat);
                runtimeStat2 = Debug.getRuntimeStat("art.gc.gc-time");
                long parseLong2 = Long.parseLong(runtimeStat2);
                long j4 = parseLong - e;
                long j5 = parseLong2 - f;
                e = parseLong;
                f = parseLong2;
                SharedPreferences.Editor edit = sharedPreferences.edit();
                if (i == i2 || i <= 0) {
                    j = j2;
                } else {
                    s55.i("LocalProcM", "gc report", "count", Long.valueOf(j2), "spent", Long.valueOf(j3));
                    e.h hVar = new e.h("gc", j3);
                    hVar.e(j2);
                    hVar.b();
                    j3 = 0;
                    j = 0;
                }
                long j6 = j + j4;
                long j7 = j3 + j5;
                s55.i("LocalProcM", "gc record", "count", Long.valueOf(j6), "spent", Long.valueOf(j7));
                edit.putInt(str, i2).putLong(str2, j6).putLong(str3, j7).commit();
            } catch (Throwable th) {
                s55.h("LocalProcM", "gc err", th, new Object[0]);
            }
        }

        static {
            t2o.a(349175849);
        }
    }

    public LocalProcessMonitor() {
        this.g = "";
        this.h = false;
        this.j = new AtomicBoolean(false);
        this.k = new AtomicBoolean(false);
        this.l = new ArrayList();
        this.o = false;
        this.q = 0L;
        this.r = new a();
        this.s = new b();
        this.u = new c();
        this.I = new d();
        this.R = -1;
        this.S = new e();
        this.T = new BroadcastReceiver() { // from class: com.taobao.adaemon.LocalProcessMonitor.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* compiled from: Taobao */
            /* renamed from: com.taobao.adaemon.LocalProcessMonitor$6$a */
            /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
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
                        LocalProcessMonitor.P(LocalProcessMonitor.this);
                    }
                }
            }

            public static /* synthetic */ Object ipc$super(AnonymousClass6 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/adaemon/LocalProcessMonitor$6");
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                    return;
                }
                String action = intent.getAction();
                s55.i("LocalProcM", "channelProcessReceiver", "action", action);
                if ("com.taobao.adaemon.CORE_PROCESS_CREATED".equals(action)) {
                    mf.l(new a());
                }
            }
        };
        this.U = new g();
        this.V = null;
        this.p = new APower();
    }

    public final /* synthetic */ void D0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a17e2654", new Object[]{this});
            return;
        }
        s55.i("LocalProcM", "wakeup", new Object[0]);
        this.p.f6158a.d();
        this.p.b.d();
        this.p.m();
    }

    public void G0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7f3c09", new Object[]{this});
            return;
        }
        s55.i("LocalProcM", "onForeground", new Object[0]);
        this.f6112a = Boolean.FALSE;
        if (oxn.s().G()) {
            mf.j(new Runnable() { // from class: tb.v8h
                @Override // java.lang.Runnable
                public final void run() {
                    LocalProcessMonitor.this.y0();
                }
            });
        }
    }

    public final void J0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6246870f", new Object[]{this});
            return;
        }
        SharedPreferences sharedPreferences = this.c;
        if (sharedPreferences == null) {
            s55.i("LocalProcM", "recordForegroundDay empty mPreferences", new Object[0]);
            return;
        }
        if (this.d == null) {
            this.d = sharedPreferences.edit();
        }
        this.d.putInt("adaemon_foreground_day", Calendar.getInstance().get(6)).apply();
    }

    public final void O0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49471f9", new Object[]{this});
            return;
        }
        ProcessController.IPC.c(this.b, this.S);
        ProcessController.IPC.e(this.b, this.h, "init");
        this.k.set(true);
    }

    public void P0(e61 e61Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a85515ce", new Object[]{this, e61Var});
            return;
        }
        s55.i("LocalProcM", "setAppLifecycleCallback", new Object[0]);
        this.n = e61Var;
    }

    public void R0(long j2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e608b3", new Object[]{this, new Long(j2), new Boolean(z)});
        } else if (!this.j.get()) {
            s55.i("LocalProcM", "startTargetProcess not init", new Object[0]);
        } else if (this.m != null) {
            this.m.j(j2, z);
        }
    }

    public final void S0() {
        Pair<Long, Long> n;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0f690a8", new Object[]{this});
            return;
        }
        if (this.O) {
            this.O = false;
            sy9.m().G(h0().g0());
        }
        if (this.N != null) {
            if (SystemClock.elapsedRealtime() - this.Q > 30000 && (n = com.taobao.adaemon.g.n()) != null) {
                new e.h("cpu_consume_tab2", (((Long) n.first).longValue() - ((Long) this.N.first).longValue()) + (((Long) n.second).longValue() - ((Long) this.N.second).longValue())).b();
            }
            this.N = null;
            this.Q = 0L;
        }
    }

    public k d0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (k) ipChange.ipc$dispatch("b0550bcc", new Object[]{this});
        }
        if (this.M == null) {
            this.M = new k(this);
            SharedPreferences l0 = l0(com.taobao.adaemon.g.l());
            this.M.f6125a = l0.getInt("dead_pid", 0);
            this.M.b = l0.getString("invoke_first_bg_info", "");
            this.M.h = l0.getLong("app_launch_time", 0L);
            this.M.f = l0.getLong("fore_time_first", 0L);
            this.M.g = l0.getLong("background_time_first", 0L);
            this.M.c = l0.getString("background_page_first", "");
            this.M.d = l0.getString("background_page_url", "");
            this.M.e = l0.getString("last_state", "");
            l0.edit().remove("dead_pid").remove("invoke_first_bg_info").remove("app_launch_time").remove("fore_time_first").remove("background_time_first").remove("background_page_first").remove("background_page_url").remove("last_state").commit();
        }
        return this.M;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements ComponentCallbacks2 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* renamed from: com.taobao.adaemon.LocalProcessMonitor$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class RunnableC0315a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ int f6116a;

            public RunnableC0315a(int i) {
                this.f6116a = i;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else if (LocalProcessMonitor.i(LocalProcessMonitor.this).get()) {
                    ProcessController.IPC.f(LocalProcessMonitor.j(LocalProcessMonitor.this), this.f6116a);
                }
            }
        }

        public a() {
        }

        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(Configuration configuration) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("eb2f300c", new Object[]{this, configuration});
            }
        }

        @Override // android.content.ComponentCallbacks
        public void onLowMemory() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4bbd23dd", new Object[]{this});
            } else {
                s55.i("LocalProcM", "onLowMemory", new Object[0]);
            }
        }

        @Override // android.content.ComponentCallbacks2
        public void onTrimMemory(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c69db59a", new Object[]{this, new Integer(i)});
            } else if (SystemClock.elapsedRealtime() - LocalProcessMonitor.this.q >= 300000) {
                s55.i("LocalProcM", "onTrimMemory", m09.TASK_TYPE_LEVEL, Integer.valueOf(i));
                LocalProcessMonitor.this.q = SystemClock.elapsedRealtime();
                mf.l(new RunnableC0315a(i));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class c implements a.g {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // com.taobao.accs.connection.state.a.g
        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("898c8053", new Object[]{this, str});
                return;
            }
            s55.i("LocalProcM", "onProcessLaunched", "process", str);
            if (LocalProcessMonitor.x(LocalProcessMonitor.this).getPackageName().equals(str)) {
                LocalProcessMonitor.O(LocalProcessMonitor.this, true);
            }
        }

        @Override // com.taobao.accs.connection.state.a.g
        public void b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5675eb25", new Object[]{this, str});
                return;
            }
            s55.i("LocalProcM", "onProcessDied", "process", str);
            if (LocalProcessMonitor.x(LocalProcessMonitor.this).getPackageName().equals(str)) {
                LocalProcessMonitor.this.R0(0L, true);
                if (oxn.s().G()) {
                    LocalProcessMonitor.this.F0();
                }
            }
        }
    }

    public final void E0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4c9f8f", new Object[]{this});
            return;
        }
        Activity f0 = h0().f0();
        if (f0 != null) {
            this.O = true;
            sy9.m().A(f0);
            return;
        }
        s55.i("LocalProcM", "onTabChanged lock, empty activity", new Object[0]);
    }

    public void F0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83d13a74", new Object[]{this});
            return;
        }
        s55.i("LocalProcM", "onBackground", "isBgInChannel", this.f6112a);
        if (this.f6112a == null) {
            hkq.b(com.taobao.adaemon.e.MODULE_NAME, com.taobao.adaemon.e.b, "bg_channel_null", vu3.b.GEO_NOT_SUPPORT);
            return;
        }
        if (!this.f6112a.booleanValue() && oxn.s().G()) {
            mf.j(new Runnable() { // from class: tb.w8h
                @Override // java.lang.Runnable
                public final void run() {
                    LocalProcessMonitor.this.x0();
                }
            });
        }
        this.f6112a = Boolean.TRUE;
    }

    public void M0(int i2, boolean z) {
        Debug.MemoryInfo memoryInfo;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        String memoryStat;
        String memoryStat2;
        String memoryStat3;
        String memoryStat4;
        String memoryStat5;
        String memoryStat6;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c953f0f3", new Object[]{this, new Integer(i2), new Boolean(z)});
        } else if (oxn.s().e() || com.taobao.adaemon.g.K(this.i)) {
            try {
                if (z) {
                    memoryInfo = com.taobao.adaemon.g.A(this.i);
                } else {
                    memoryInfo = com.taobao.adaemon.g.B(this.i);
                }
                e.c cVar = new e.c(this.b);
                cVar.b = i2;
                cVar.c = com.taobao.adaemon.g.R();
                cVar.d = com.taobao.adaemon.g.G();
                cVar.e = memoryInfo == null ? 0 : memoryInfo.getTotalPss();
                cVar.f = memoryInfo == null ? 0 : memoryInfo.getTotalPrivateClean();
                cVar.g = memoryInfo == null ? 0 : memoryInfo.getTotalPrivateDirty();
                if (Build.VERSION.SDK_INT >= 23) {
                    if (memoryInfo == null) {
                        i3 = 0;
                    } else {
                        memoryStat6 = memoryInfo.getMemoryStat("summary.java-heap");
                        i3 = Integer.parseInt(memoryStat6);
                    }
                    cVar.h = i3;
                    if (memoryInfo == null) {
                        i4 = 0;
                    } else {
                        memoryStat5 = memoryInfo.getMemoryStat("summary.native-heap");
                        i4 = Integer.parseInt(memoryStat5);
                    }
                    cVar.i = i4;
                    if (memoryInfo == null) {
                        i5 = 0;
                    } else {
                        memoryStat4 = memoryInfo.getMemoryStat("summary.code");
                        i5 = Integer.parseInt(memoryStat4);
                    }
                    cVar.k = i5;
                    if (memoryInfo == null) {
                        i6 = 0;
                    } else {
                        memoryStat3 = memoryInfo.getMemoryStat("summary.stack");
                        i6 = Integer.parseInt(memoryStat3);
                    }
                    cVar.l = i6;
                    if (memoryInfo == null) {
                        i7 = 0;
                    } else {
                        memoryStat2 = memoryInfo.getMemoryStat("summary.private-other");
                        i7 = Integer.parseInt(memoryStat2);
                    }
                    cVar.m = i7;
                    if (memoryInfo == null) {
                        i8 = 0;
                    } else {
                        memoryStat = memoryInfo.getMemoryStat("summary.system");
                        i8 = Integer.parseInt(memoryStat);
                    }
                    cVar.n = i8;
                }
                Runtime runtime = Runtime.getRuntime();
                cVar.j = ((float) (runtime.totalMemory() - runtime.freeMemory())) / ((float) runtime.maxMemory());
                cVar.b();
            } catch (Throwable th) {
                s55.h("LocalProcM", "recordUsedMemStat error", null, th);
            }
        }
    }

    public void V0() {
        int i2 = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3eb9446", new Object[]{this});
            return;
        }
        Context l = com.taobao.adaemon.g.l();
        if (q0(l)) {
            if (!cp.f()) {
                i2 = 10;
            }
            if (!TimeMeter.a("adaemon_wakeup", i2 * 60000)) {
                s55.i("LocalProcM", "wakeup freq", new Object[0]);
            } else if (!com.taobao.adaemon.g.K(l)) {
                mf.j(new Runnable() { // from class: tb.r8h
                    @Override // java.lang.Runnable
                    public final void run() {
                        LocalProcessMonitor.this.C0();
                    }
                });
            } else {
                mf.j(new Runnable() { // from class: tb.s8h
                    @Override // java.lang.Runnable
                    public final void run() {
                        LocalProcessMonitor.this.D0();
                    }
                });
            }
        }
    }

    public final boolean o0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e40279aa", new Object[]{this})).booleanValue();
        }
        SharedPreferences sharedPreferences = this.c;
        if (sharedPreferences != null) {
            return sharedPreferences.getInt("adaemon_foreground_day", -1) == Calendar.getInstance().get(6);
        }
        s55.i("LocalProcM", "hasBeenForeToday empty mPreferences", new Object[0]);
        return false;
    }

    public boolean q0(Context context) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d155d876", new Object[]{this, context})).booleanValue();
        }
        if (cp.h(context)) {
            return this.h;
        }
        if (!cp.e(context)) {
            return true;
        }
        if (this.t) {
            this.f6112a = null;
            this.t = false;
        }
        Boolean bool = this.f6112a;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (com.taobao.accs.connection.state.a.v().A(context) && com.taobao.adaemon.g.N(context)) {
            z = false;
        }
        this.f6112a = Boolean.valueOf(z);
        return z;
    }

    public final boolean t0(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a339ced5", new Object[]{this, str, str2})).booleanValue();
        }
        return "com.taobao.android.layoutmanager.container.MultiPageTransparentContainerActivity".equals(str) && !TextUtils.isEmpty(str2) && (str2.contains("type=guangguang_collection&source=common_collection_theater_tab") || str2.contains("type=guangguang_collection&source=common_collection_VIDEO_TAB"));
    }

    public final void K0(Long l) {
        long j2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5db30046", new Object[]{this, l});
            return;
        }
        if (l == null) {
            SharedPreferences sharedPreferences = this.c;
            j2 = sharedPreferences.getLong(this.b + "_processLiveTime_v2", 0L);
        } else {
            j2 = l.longValue();
        }
        if (j2 != 0) {
            SharedPreferences sharedPreferences2 = this.c;
            String string = sharedPreferences2.getString(this.b + "_processMemTrace", "");
            SharedPreferences sharedPreferences3 = this.c;
            String string2 = sharedPreferences3.getString(this.b + "_sw", "");
            e.d dVar = new e.d(this.b);
            dVar.c = j2;
            dVar.d = string;
            dVar.e = com.taobao.adaemon.g.R();
            dVar.f = string2;
            dVar.b();
            s55.i("LocalProcM", "recordLastLiveTime", "mProcessName", this.b, "lastLiveTime", Long.valueOf(j2));
            this.f = 0L;
            this.g = "";
            if (this.d == null) {
                this.d = this.c.edit();
            }
            SharedPreferences.Editor editor = this.d;
            SharedPreferences.Editor remove = editor.remove(this.b + "_processLiveTime");
            SharedPreferences.Editor remove2 = remove.remove(this.b + "_processLiveTime_v2");
            SharedPreferences.Editor remove3 = remove2.remove(this.b + "_processMemTrace");
            remove3.remove(this.b + "_sw").apply();
        }
    }

    public final void L0(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("201a4f1", new Object[]{this, context});
        } else if (Build.VERSION.SDK_INT >= 30) {
            try {
                String a2 = com.taobao.adaemon.a.a(context, h5d.f());
                if (!TextUtils.isEmpty(a2)) {
                    new e.b().a(a2);
                } else {
                    s55.i("LocalProcM", "empty dead info", new Object[0]);
                }
            } catch (Throwable th) {
                s55.i("LocalProcM", "recordProcessDeadInfo err", "", th);
            }
        }
    }

    public void Q0(final Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe5cbff", new Object[]{this, context});
            return;
        }
        try {
            if (this.j.compareAndSet(false, true)) {
                this.i = context;
                this.b = com.taobao.adaemon.g.o(context);
                this.e = SystemClock.elapsedRealtime();
                System.currentTimeMillis();
                this.c = context.getSharedPreferences(this.b.replace(":", "_") + "_adaemon", 4);
                boolean K = com.taobao.adaemon.g.K(context);
                this.o = K;
                if (K && oxn.s().G()) {
                    q0(this.i);
                    this.p.h(true);
                }
                K0(null);
                L0(context);
                boolean N = com.taobao.adaemon.g.N(context);
                if (this.o) {
                    s55.i("LocalProcM", "channel send", "action", "com.taobao.adaemon.CORE_PROCESS_CREATED");
                    Intent intent = new Intent();
                    intent.setPackage(context.getPackageName());
                    intent.setAction("com.taobao.adaemon.CORE_PROCESS_CREATED");
                    context.sendBroadcast(intent);
                    this.k.set(true);
                    try {
                        this.m = new nxm(this.i);
                        ACCSClient.getAccsClient().registerHeartBeatListener(this.s);
                        com.taobao.accs.connection.state.a.v().H(this.u);
                    } catch (AccsException e2) {
                        s55.i("LocalProcM", "initialize channel err", "", e2);
                    }
                    if (Build.VERSION.SDK_INT >= 23 && com.taobao.adaemon.g.X(1)) {
                        i.b();
                    }
                    mf.l(new Runnable() { // from class: tb.t8h
                        @Override // java.lang.Runnable
                        public final void run() {
                            LocalProcessMonitor.this.z0(context);
                        }
                    });
                } else {
                    s55.g("LocalProcM", "register broadcast", new Object[0]);
                    this.h = !N;
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("com.taobao.adaemon.CORE_PROCESS_CREATED");
                    context.registerReceiver(this.T, intentFilter);
                    if (com.taobao.adaemon.g.L(context)) {
                        O0();
                    }
                    mf.k(new Runnable() { // from class: tb.u8h
                        @Override // java.lang.Runnable
                        public final void run() {
                            LocalProcessMonitor.this.A0(context);
                        }
                    }, 15000L, TimeUnit.MILLISECONDS);
                    T0(null, null);
                }
                if (UtilityImpl.isMainProcess(context) && !N) {
                    this.h = true;
                    b0(false);
                }
                context.getApplicationContext().registerComponentCallbacks(this.r);
                this.q = 0L;
                Runnable runnable = this.U;
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                mf.k(runnable, 300000L, timeUnit);
                mf.k(new f(), 60000L, timeUnit);
            }
        } catch (Throwable th) {
            s55.i("LocalProcM", "initialize proc monitor error", "", th);
        }
    }

    public final void T0(Activity activity, final Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("946f8ea9", new Object[]{this, activity, bool});
            return;
        }
        s55.i("LocalProcM", "updateForeAndBgStat()", "state", bool);
        if (bool != null) {
            this.h = !bool.booleanValue();
        }
        if (!(this.n == null || bool == null)) {
            if (bool.booleanValue()) {
                ((ANRHacker) this.n).K0();
            } else {
                ((ANRHacker) this.n).J0();
            }
        }
        final String str = "";
        if (activity != null) {
            String localClassName = activity.getLocalClassName();
            if (activity.getIntent() != null) {
                str = activity.getIntent().getDataString();
            }
            str = localClassName;
        } else {
            str = str;
        }
        mf.a(new Runnable() { // from class: tb.x8h
            @Override // java.lang.Runnable
            public final void run() {
                LocalProcessMonitor.this.B0(bool, str, str);
            }
        });
    }

    public final void a0(Context context) {
        ApplicationInfo applicationInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51e0af6c", new Object[]{this, context});
        } else if (Build.VERSION.SDK_INT >= 23 && oxn.s().f()) {
            int i2 = Calendar.getInstance().get(6);
            if (this.c.getInt("app_collect_day", -1) == i2) {
                s55.i("LocalProcM", "collect freq", new Object[0]);
                return;
            }
            PackageManager packageManager = context.getPackageManager();
            Intent intent = new Intent();
            intent.setAction("android.intent.action.MAIN");
            intent.addCategory("android.intent.category.LAUNCHER");
            List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 131072);
            if (queryIntentActivities == null || queryIntentActivities.isEmpty()) {
                s55.i("LocalProcM", "collecting, empty dev list", new Object[0]);
                return;
            }
            StringBuilder sb = new StringBuilder();
            for (ResolveInfo resolveInfo : queryIntentActivities) {
                ActivityInfo activityInfo = resolveInfo.activityInfo;
                if (!(activityInfo == null || (applicationInfo = activityInfo.applicationInfo) == null || (applicationInfo.flags & 1) != 0)) {
                    sb.append(activityInfo.packageName);
                    sb.append(",");
                }
            }
            if (sb.length() > 0) {
                sb.deleteCharAt(sb.length() - 1);
            }
            String sb2 = sb.toString();
            hkq.b(com.taobao.adaemon.e.MODULE_NAME, com.taobao.adaemon.e.d, sb2, vu3.b.GEO_NOT_SUPPORT);
            if (this.d == null) {
                this.d = this.c.edit();
            }
            this.d.putInt("app_collect_day", i2).apply();
            s55.g("LocalProcM", "collect result", "result", sb2);
            s55.i("LocalProcM", "collect finish", new Object[0]);
        }
    }

    public final /* synthetic */ void w0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ad3178b", new Object[]{this, new Boolean(z)});
            return;
        }
        try {
            s55.i("LocalProcM", "doBackground", "coreProcessReady", Boolean.valueOf(this.k.get()), "needIPC", Boolean.valueOf(z));
            if (this.k.get() && z) {
                ProcessController.IPC.e(this.b, true, null);
            }
        } catch (Throwable th) {
            s55.h("LocalProcM", "doBackground err", th, new Object[0]);
        }
    }

    public void H0(int i2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91f35fc8", new Object[]{this, new Integer(i2), str});
        } else if (this.R != i2) {
            this.R = i2;
            s55.i("LocalProcM", "onTabChanged", "tabIndex", Integer.valueOf(i2), "tabName", str);
            sy9.m().z(com.taobao.adaemon.g.l(), i2 == 0 ? 10102 : 0);
            try {
                if ("tab2".equals(str)) {
                    this.N = com.taobao.adaemon.g.n();
                    this.Q = SystemClock.elapsedRealtime();
                    if (tb.f.g()) {
                        E0();
                    }
                } else {
                    S0();
                }
            } catch (Throwable th) {
                s55.h("LocalProcM", "tab cpu calc err", th, new Object[0]);
            }
        }
    }

    public final synchronized void U0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4a43666", new Object[]{this});
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.f += elapsedRealtime - this.e;
        this.g += "|" + com.taobao.adaemon.g.G();
        if (this.d == null) {
            this.d = this.c.edit();
        }
        this.d.putLong(this.b + "_processLiveTime_v2", this.f);
        this.d.putString(this.b + "_processMemTrace", this.g);
        this.d.putString(this.b + "_sw", String.valueOf(true));
        this.d.apply();
        this.e = elapsedRealtime;
        s55.i("LocalProcM", "updateProcessLiveTime", "mProcessName", this.b, "mLiveTime", Long.valueOf(this.f));
        int i2 = Calendar.getInstance().get(6);
        oxn s = oxn.s();
        Integer num = this.V;
        if (!(num == null || num.intValue() == i2)) {
            s55.i("LocalProcM", "DAY_OF_YEAR changed", "tmpDay", Integer.valueOf(i2), "dayOfYear", this.V);
            K0(Long.valueOf(this.f));
        }
        int w = s.w();
        if (w >= 30) {
            long j2 = this.f;
            if ((j2 / 300000) % w == 0) {
                s55.i("LocalProcM", "recordUsedMemStat per 2hour", "liveTime", Long.valueOf(j2));
                if (!com.taobao.adaemon.g.K(this.i) || !oxn.s().i()) {
                    M0(3, false);
                } else {
                    try {
                        MemArt.a(this.i, 0L);
                    } catch (Exception e2) {
                        s55.i("LocalProcM", e2.getMessage(), new Object[0]);
                    }
                }
            }
        }
        this.V = Integer.valueOf(i2);
    }

    public final /* synthetic */ void B0(Boolean bool, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32fa169f", new Object[]{this, bool, str, str2});
            return;
        }
        try {
            d0();
            String h2 = com.taobao.adaemon.g.h(com.taobao.adaemon.g.l());
            long currentTimeMillis = System.currentTimeMillis();
            if (bool == null) {
                boolean s0 = s0();
                s55.i("LocalProcM", "adaemon start", "launched", Boolean.valueOf(s0), "afcId", h2);
                if (!s0) {
                    l0(com.taobao.adaemon.g.l()).edit().putInt("dead_pid", Process.myPid()).putString("invoke_first_bg_info", h2).putLong("app_launch_time", ADaemon.appLaunchTimeInMill).remove("fore_time_first").remove("background_time_first").remove("background_page_first").remove("background_page_url").commit();
                }
            } else if (bool.booleanValue()) {
                if (TextUtils.isEmpty(this.J) || !this.J.equals(h2)) {
                    s55.i("LocalProcM", "fore afcId changed", "afcId", h2);
                    this.L = currentTimeMillis;
                    this.J = h2;
                }
                l0(com.taobao.adaemon.g.l()).edit().putString("last_state", "fg").commit();
            } else {
                SharedPreferences.Editor edit = l0(com.taobao.adaemon.g.l()).edit();
                if (TextUtils.isEmpty(this.K) || !this.K.equals(h2)) {
                    s55.i("LocalProcM", "background afcId changed", "backPage", str, "pageUrl", str2, "afcId", h2);
                    edit.putInt("dead_pid", Process.myPid()).putString("invoke_first_bg_info", h2).putLong("app_launch_time", ADaemon.appLaunchTimeInMill).putLong("fore_time_first", this.L).putLong("background_time_first", currentTimeMillis).putString("background_page_first", str).putString("background_page_url", str2);
                    this.K = h2;
                }
                edit.putString("last_state", "bg").commit();
            }
        } catch (Throwable th) {
            s55.h("LocalProcM", "updateForeAndBgStat err", th, new Object[0]);
        }
    }
}
