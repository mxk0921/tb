package com.taobao.orange;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Process;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.detail.rate.vivid.presenter.PreRequestPresenter;
import com.taobao.orange.OConstant;
import com.taobao.orange.aidl.IOrangeApiService;
import com.taobao.orange.aidl.IOrangeBindService;
import com.taobao.orange.aidl.OrangeApiServiceStub;
import com.taobao.orange.aidl.OrangeConfigListenerStub;
import com.taobao.orange.service.OrangeBindService;
import com.taobao.orange.util.OLog;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.cw0;
import tb.eal;
import tb.fck;
import tb.h1p;
import tb.jno;
import tb.mbk;
import tb.obk;
import tb.pg1;
import tb.t2o;
import tb.tzc;
import tb.ual;
import tb.v4s;
import tb.y8l;
import tb.z8l;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class OrangeConfigImpl extends OrangeConfig {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "OrangeConfigImpl";
    public static final OrangeConfigImpl p = new OrangeConfigImpl();

    /* renamed from: a  reason: collision with root package name */
    public volatile Context f11380a;
    public volatile IOrangeApiService b;
    public volatile CountDownLatch c;
    public volatile OConfig d;
    public volatile double h;
    public final AtomicBoolean e = new AtomicBoolean(false);
    public final AtomicBoolean f = new AtomicBoolean(false);
    public final AtomicBoolean g = new AtomicBoolean(false);
    public volatile String i = null;
    public final Set<String> j = Collections.synchronizedSet(new HashSet());
    public final Map<String, Set<OrangeConfigListenerStub>> k = new ConcurrentHashMap();
    public final Map<String, Set<OrangeConfigListenerStub>> l = new ConcurrentHashMap();
    public final List<OCandidate> m = Collections.synchronizedList(new ArrayList());
    public final Set<String> n = new HashSet<String>() { // from class: com.taobao.orange.OrangeConfigImpl.1
        {
            add(ual.GROUP);
            add("flow_customs_config");
            add("custom_out_config");
        }
    };
    public final ServiceConnection o = new d();

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
            } else {
                OrangeConfigImpl.c(OrangeConfigImpl.this, 0);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class d implements ServiceConnection {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ IBinder f11385a;

            public a(IBinder iBinder) {
                this.f11385a = iBinder;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    IOrangeBindService asInterface = IOrangeBindService.Stub.asInterface(this.f11385a);
                    if (asInterface != null) {
                        asInterface.setRemoteService(new OrangeApiServiceStub(OrangeConfigImpl.this.f11380a));
                    }
                } catch (Throwable th) {
                    OLog.e(OrangeConfigImpl.TAG, "mBindChannelConnection setRemoteService exception " + th, new Object[0]);
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
        public class b implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    OrangeConfigImpl.c(OrangeConfigImpl.this, 0);
                }
            }
        }

        public d() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1495fa3c", new Object[]{this, componentName, iBinder});
                return;
            }
            OLog.e(OrangeConfigImpl.TAG, "mBindChannelConnection onServiceConnected: " + Process.myPid() + ", " + OrangeConfigImpl.e(OrangeConfigImpl.this).hashCode(), new Object[0]);
            eal.r(OConstant.MONITOR_MODULE, OConstant.POINT_PROCESS_BIND_MODE, pg1.ATOM_EXT_bind);
            OLog.e(OrangeConfigImpl.TAG, "mBindChannelConnection OrangeBindService keep alive", new Object[0]);
            fck.c(new a(iBinder));
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5a4ef237", new Object[]{this, componentName});
                return;
            }
            OLog.e(OrangeConfigImpl.TAG, "mBindChannelConnection onServiceDisconnected: " + Process.myPid() + ", " + OrangeConfigImpl.e(OrangeConfigImpl.this).hashCode(), new Object[0]);
            com.taobao.orange.a.e = false;
            OrangeConfigImpl.this.f.set(false);
            fck.d(new b(), 15000L);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f11387a;
        public final /* synthetic */ OConfig b;

        public e(Context context, OConfig oConfig) {
            this.f11387a = context;
            this.b = oConfig;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                OrangeConfigImpl.this.l(this.f11387a, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class f implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f11388a;

        public f(int i) {
            this.f11388a = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            OLog.e(OrangeConfigImpl.TAG, "trigger index update", new Object[0]);
            OrangeConfigImpl.a(OrangeConfigImpl.this, this.f11388a);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class g implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String[] f11389a;
        public final /* synthetic */ OrangeConfigListenerStub b;

        public g(String[] strArr, OrangeConfigListenerStub orangeConfigListenerStub) {
            this.f11389a = strArr;
            this.b = orangeConfigListenerStub;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                OrangeConfigImpl.this.s(this.f11389a, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class h implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            OLog.e(OrangeConfigImpl.TAG, "bind OrangeBindService start", "isChannelProcessAlive", Boolean.valueOf(com.taobao.orange.a.e));
            OrangeConfigImpl.b(OrangeConfigImpl.this);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
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
            OLog.e(OrangeConfigImpl.TAG, "bind OrangeBindService start", "isChannelProcessAlive", Boolean.valueOf(com.taobao.orange.a.e));
            OrangeConfigImpl.c(OrangeConfigImpl.this, 0);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class j implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f11392a;

        public j(int i) {
            this.f11392a = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                OrangeConfigImpl.c(OrangeConfigImpl.this, this.f11392a + 1);
            }
        }
    }

    static {
        t2o.a(613417007);
    }

    private OrangeConfigImpl() {
    }

    public static /* synthetic */ void a(OrangeConfigImpl orangeConfigImpl, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f46e713b", new Object[]{orangeConfigImpl, new Integer(i2)});
        } else {
            orangeConfigImpl.v(i2);
        }
    }

    public static /* synthetic */ void b(OrangeConfigImpl orangeConfigImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("587ec989", new Object[]{orangeConfigImpl});
        } else {
            orangeConfigImpl.g();
        }
    }

    public static /* synthetic */ void c(OrangeConfigImpl orangeConfigImpl, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a4743f9", new Object[]{orangeConfigImpl, new Integer(i2)});
        } else {
            orangeConfigImpl.i(i2);
        }
    }

    public static /* synthetic */ void d(OrangeConfigImpl orangeConfigImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2301a70b", new Object[]{orangeConfigImpl});
        } else {
            orangeConfigImpl.p();
        }
    }

    public static /* synthetic */ ServiceConnection e(OrangeConfigImpl orangeConfigImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ServiceConnection) ipChange.ipc$dispatch("c57b2d80", new Object[]{orangeConfigImpl});
        }
        return orangeConfigImpl.o;
    }

    public static /* synthetic */ Object ipc$super(OrangeConfigImpl orangeConfigImpl, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/orange/OrangeConfigImpl");
    }

    public static void m(IOrangeApiService iOrangeApiService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b862705", new Object[]{iOrangeApiService});
            return;
        }
        OrangeConfigImpl orangeConfigImpl = p;
        if (orangeConfigImpl != null) {
            orangeConfigImpl.t(iOrangeApiService);
        }
    }

    public static long o(long j2, TimeZone timeZone) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("acfa62e4", new Object[]{new Long(j2), timeZone})).longValue();
        }
        return (timeZone.getOffset(j2) + j2) / 86400;
    }

    @Override // com.taobao.orange.OrangeConfig
    public void enterForeground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc1a8d42", new Object[]{this});
        } else {
            forceCheckUpdate();
        }
    }

    public final void i(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a111aa89", new Object[]{this, new Integer(i2)});
        } else if (!this.f.get()) {
            cw0.a(this.f11380a);
            if (com.taobao.orange.a.e) {
                g();
            } else if (i2 < 10) {
                fck.d(new j(i2), 15000L);
            } else {
                OLog.e(TAG, "Reached max retry times to bind service", new Object[0]);
                fck.d(new a(), 86400000L);
            }
        }
    }

    public final Set<OrangeConfigListenerStub> j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("1b8e1eb2", new Object[]{this, str});
        }
        Set<OrangeConfigListenerStub> set = (Set) ((ConcurrentHashMap) this.k).get(str);
        if (set != null) {
            return set;
        }
        HashSet hashSet = new HashSet();
        ((ConcurrentHashMap) this.k).put(str, hashSet);
        return hashSet;
    }

    public final String k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dec7a016", new Object[]{this});
        }
        return h1p.HTTP_PREFIX + OConstant.SUB_PROCESS_INDEX_QUERY_HOSTS[com.taobao.orange.a.C.getEnvMode()] + OConstant.SUB_PROCESS_INDEX_QUERY_URL;
    }

    public void q(String[] strArr, OrangeConfigListenerStub orangeConfigListenerStub) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a1a472a", new Object[]{this, strArr, orangeConfigListenerStub});
        } else if (strArr != null && strArr.length != 0 && orangeConfigListenerStub != null) {
            for (String str : strArr) {
                Set set = (Set) ((ConcurrentHashMap) this.l).get(str);
                if (set == null) {
                    set = new HashSet();
                    ((ConcurrentHashMap) this.l).put(str, set);
                }
                set.add(orangeConfigListenerStub);
            }
        }
    }

    @Override // com.taobao.orange.OrangeConfig
    public void registerListener(String[] strArr, y8l y8lVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd3ae91e", new Object[]{this, strArr, y8lVar});
        } else {
            r(strArr, y8lVar, true);
        }
    }

    @Override // com.taobao.orange.OrangeConfig
    public void setEnableDiffIndex(boolean z) {
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("baaa2b65", new Object[]{this, new Boolean(z)});
            return;
        }
        if (z) {
            i2 = 2;
        }
        com.taobao.orange.a.v = i2;
    }

    @Override // com.taobao.orange.OrangeConfig
    public void unregisterListener(String[] strArr, z8l z8lVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f77af5aa", new Object[]{this, strArr, z8lVar});
        } else if (strArr == null || strArr.length == 0 || z8lVar == null) {
            OLog.e(TAG, "unregisterListenerV1 error as param null", new Object[0]);
        } else if (this.b != null) {
            try {
                for (String str : strArr) {
                    this.b.unregisterListener(str, new OrangeConfigListenerStub(z8lVar));
                }
            } catch (Throwable th) {
                OLog.e(TAG, "unregisterListenerV1", th, new Object[0]);
            }
        } else {
            OLog.w(TAG, "unregisterListenerV1 fail", new Object[0]);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            if (OrangeConfigImpl.this.b == null) {
                OrangeConfigImpl.this.b = new OrangeApiServiceStub(OrangeConfigImpl.this.f11380a);
            }
            double d = OrangeConfigImpl.this.h;
            OrangeConfigImpl.this.h = System.currentTimeMillis();
            eal.p("success", "local", OrangeConfigImpl.this.h, d);
            OLog.e(OrangeConfigImpl.TAG, "local stub start reInit", "lastBindTime", Double.valueOf(d), "lastLocalTime", Double.valueOf(OrangeConfigImpl.this.h));
            OrangeConfigImpl.d(OrangeConfigImpl.this);
        }
    }

    @Override // com.taobao.orange.OrangeConfig
    public void enterBackground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("436c8bad", new Object[]{this});
        } else {
            OLog.e(TAG, "enterBackground api is @Deprecated", new Object[0]);
        }
    }

    @Override // com.taobao.orange.OrangeConfig
    public void forceCheckUpdate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b2de18d", new Object[]{this});
        } else if (this.b != null) {
            try {
                this.b.forceCheckUpdate();
            } catch (Throwable th) {
                OLog.e(TAG, "forceCheckUpdate", th, new Object[0]);
            }
        } else {
            OLog.w(TAG, "forceCheckUpdate fail", new Object[0]);
        }
    }

    @Override // com.taobao.orange.OrangeConfig
    public void registerListener(String[] strArr, z8l z8lVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ba4d723", new Object[]{this, strArr, z8lVar});
        } else {
            r(strArr, z8lVar, true);
        }
    }

    @Override // com.taobao.orange.OrangeConfig
    public void setAppSecret(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6199740", new Object[]{this, str});
        } else {
            OLog.e(TAG, "setAppSecret api is @Deprecated, please set appSecret in init(OConfig config) api", new Object[0]);
        }
    }

    @Override // com.taobao.orange.OrangeConfig
    public void setHosts(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6450581", new Object[]{this, list});
        } else {
            OLog.e(TAG, "setHosts api is @Deprecated, please set probeHosts in init(OConfig config) api", new Object[0]);
        }
    }

    @Override // com.taobao.orange.OrangeConfig
    public void setIndexUpdateMode(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("722e0920", new Object[]{this, new Integer(i2)});
        } else {
            OLog.e(TAG, "setIndexUpdateMode api is @Deprecated, please set indexUpdateMode in init(OConfig config) api", new Object[0]);
        }
    }

    @Override // com.taobao.orange.OrangeConfig
    public void setUserId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ca419d9", new Object[]{this, str});
            return;
        }
        if (str == null) {
            str = "";
        }
        if (this.b == null) {
            this.i = str;
            return;
        }
        try {
            this.b.setUserId(str);
        } catch (Throwable th) {
            OLog.e(TAG, "setUserId", th, new Object[0]);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ IOrangeApiService f11383a;

        public c(IOrangeApiService iOrangeApiService) {
            this.f11383a = iOrangeApiService;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                OLog.e(OrangeConfigImpl.TAG, "start replace remoteService", new Object[0]);
                boolean z = OrangeConfigImpl.this.b instanceof OrangeApiServiceStub;
                if (OrangeConfigImpl.this.d != null && com.taobao.orange.a.c) {
                    OrangeConfigImpl.this.b = this.f11383a;
                    double d = OrangeConfigImpl.this.h;
                    OrangeConfigImpl.this.h = System.currentTimeMillis();
                    eal.p("success", pg1.ATOM_EXT_bind, d, OrangeConfigImpl.this.h);
                    OrangeConfigImpl.d(OrangeConfigImpl.this);
                    OLog.e(OrangeConfigImpl.TAG, "replace remoteService done", "lastLocalMode", Boolean.valueOf(z), "lastBindTime", Double.valueOf(OrangeConfigImpl.this.h), "lastLocalTime", Double.valueOf(d));
                    return;
                }
                OLog.e(OrangeConfigImpl.TAG, "replaceRemoteService mConfig is null or main process die, return", "isMainProcessAlive", Boolean.valueOf(com.taobao.orange.a.c));
            } catch (Throwable th) {
                OLog.e(OrangeConfigImpl.TAG, "replaceRemoteService failed", th.toString());
                eal.p("fail", pg1.ATOM_EXT_bind, OrangeConfigImpl.this.h, System.currentTimeMillis());
            }
        }
    }

    public static boolean n(long j2, long j3, TimeZone timeZone) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d2cba7ad", new Object[]{new Long(j2), new Long(j3), timeZone})).booleanValue();
        }
        long j4 = j2 - j3;
        return j4 < 86400 && j4 > -86400 && o(j2, timeZone) == o(j3, timeZone);
    }

    @Override // com.taobao.orange.OrangeConfig
    public void fetchCriticalConfigs(Context context, String str, String str2, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c13770a6", new Object[]{this, context, str, str2, new Integer(i2)});
        } else if (context == null || !(context instanceof Application)) {
            OLog.e(TAG, "start fetch error as ctx is null", new Object[0]);
        } else if (!this.g.compareAndSet(false, true)) {
            OLog.e(TAG, "has fetch critical configs, just return", new Object[0]);
        } else if (i2 != OConstant.ENV.TEST.getEnvMode()) {
            int intValue = ((Integer) jno.b(context, OConstant.SYSKEY_ENABLE_FETCH_CRITICAL_CONFIGS, 1)).intValue();
            com.taobao.orange.a.M = intValue;
            if (intValue != 0) {
                if (this.f11380a == null) {
                    this.f11380a = context;
                }
                com.taobao.orange.a.g = this.f11380a;
                com.taobao.orange.a.C = OConstant.ENV.valueOf(i2);
                com.taobao.orange.a.h = str;
                com.taobao.orange.a.j = str2;
                ConfigCenter.getInstance().fetchCriticalConfigs(true);
            }
        }
    }

    public final void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81b727f4", new Object[]{this});
            return;
        }
        try {
            if (!this.f.compareAndSet(false, true)) {
                OLog.i(TAG, "channel service is binding", "isChannelProcessAlive", Boolean.valueOf(com.taobao.orange.a.e));
                return;
            }
            Intent intent = new Intent(this.f11380a, OrangeBindService.class);
            intent.setAction(OrangeBindService.class.getName());
            intent.addCategory("android.intent.category.DEFAULT");
            OLog.e(TAG, "bind OrangeBindService  context hashcode", Integer.valueOf(this.f11380a.hashCode()));
            if (!this.f11380a.bindService(intent, this.o, 1)) {
                OLog.e(TAG, "bind OrangeBindService fail", new Object[0]);
                eal.l(OConstant.MONITOR_MODULE, OConstant.POINT_BIND_CHANNEL_SERVICE, "bind serviceDelayBind", "-1", "return false");
                return;
            }
            eal.r(OConstant.MONITOR_MODULE, OConstant.POINT_BIND_CHANNEL_SERVICE, "bind serviceDelayBind");
        } catch (Throwable th) {
            OLog.e(TAG, "bind OrangeBindService exception ", th, new Object[0]);
            eal.l(OConstant.MONITOR_MODULE, OConstant.POINT_BIND_CHANNEL_SERVICE, "bind fail", PreRequestPresenter.SOURCE_RATE_HISTORY, th.getMessage());
        }
    }

    public void l(Context context, OConfig oConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b41c66bc", new Object[]{this, context, oConfig});
            return;
        }
        f(context, true);
        if (this.b != null) {
            if (com.taobao.orange.a.d && (this.b instanceof OrangeApiServiceStub)) {
                try {
                    u();
                    oConfig.time = 0L;
                    oConfig.channelIndexUpdate = true;
                    this.b.init(oConfig);
                    OLog.e(TAG, "init local stub on channel process", new Object[0]);
                    w(context);
                    return;
                } catch (Throwable th) {
                    OLog.e(TAG, "int local stub failed", th.toString());
                }
            }
            try {
                u();
                this.b.init(oConfig);
            } catch (Throwable th2) {
                OLog.e(TAG, "asyncInit", th2, new Object[0]);
            }
        }
    }

    public final void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b542db73", new Object[]{this});
        } else if (this.f11380a != null && this.d != null) {
            try {
                l(this.f11380a, this.d);
                if (((ConcurrentHashMap) this.l).size() != 0) {
                    for (Map.Entry entry : ((ConcurrentHashMap) this.l).entrySet()) {
                        for (OrangeConfigListenerStub orangeConfigListenerStub : (Set) entry.getValue()) {
                            this.b.registerListener((String) entry.getKey(), orangeConfigListenerStub, orangeConfigListenerStub.isAppend());
                        }
                    }
                }
            } catch (Throwable th) {
                OLog.e(TAG, "reInitServiceInChannel init failed", th.toString());
            }
        }
    }

    @Override // com.taobao.orange.OrangeConfig
    public void registerListener(String[] strArr, obk obkVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d5c18ab", new Object[]{this, strArr, obkVar, new Boolean(z)});
        } else {
            r(strArr, obkVar, z);
        }
    }

    public void s(String[] strArr, OrangeConfigListenerStub orangeConfigListenerStub) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d99f03d", new Object[]{this, strArr, orangeConfigListenerStub});
        } else if (this.b != null && strArr != null && strArr.length != 0 && orangeConfigListenerStub != null) {
            for (String str : strArr) {
                try {
                    this.b.registerListener(str, orangeConfigListenerStub, orangeConfigListenerStub.isAppend());
                } catch (Throwable th) {
                    OLog.w(TAG, "registerListener", th, new Object[0]);
                }
            }
        }
    }

    public final void t(IOrangeApiService iOrangeApiService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ab88f90", new Object[]{this, iOrangeApiService});
        } else if (iOrangeApiService == null) {
            OLog.e(TAG, "remoteService is null", new Object[0]);
            com.taobao.orange.a.c = false;
            if (!(this.b instanceof OrangeApiServiceStub)) {
                OLog.e(TAG, "use channel stub", new Object[0]);
                this.b = null;
                fck.c(new b());
            }
        } else {
            com.taobao.orange.a.c = true;
            fck.c(new c(iOrangeApiService));
        }
    }

    public void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d7dd421", new Object[]{this});
        } else if (this.b != null) {
            try {
                OLog.i(TAG, "sendFailItems start", new Object[0]);
                long currentTimeMillis = System.currentTimeMillis();
                if (this.i != null) {
                    this.b.setUserId(this.i);
                    this.i = null;
                }
                if (this.j.size() > 0) {
                    IOrangeApiService iOrangeApiService = this.b;
                    Set<String> set = this.j;
                    iOrangeApiService.addFails((String[]) set.toArray(new String[set.size()]));
                }
                this.j.clear();
                for (Map.Entry entry : ((ConcurrentHashMap) this.k).entrySet()) {
                    for (OrangeConfigListenerStub orangeConfigListenerStub : (Set) entry.getValue()) {
                        this.b.registerListener((String) entry.getKey(), orangeConfigListenerStub, orangeConfigListenerStub.isAppend());
                    }
                }
                ((ConcurrentHashMap) this.k).clear();
                if (com.taobao.orange.a.b) {
                    for (OCandidate oCandidate : this.m) {
                        this.b.addCandidate(oCandidate.d(), oCandidate.b(), oCandidate.c());
                    }
                }
                this.m.clear();
                OLog.i(TAG, "sendFailItems end", "cost", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
            } catch (Throwable th) {
                OLog.e(TAG, "sendFailItems", th, new Object[0]);
            }
        }
    }

    @Override // com.taobao.orange.OrangeConfig
    public void addCandidate(OCandidate oCandidate) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66e48a36", new Object[]{this, oCandidate});
        } else if (oCandidate == null) {
            OLog.e(TAG, "addCandidate error as candidate is null", new Object[0]);
        } else {
            String d2 = oCandidate.d();
            if ("app_ver".equals(d2) || "os_ver".equals(d2) || OConstant.CANDIDATE_MANUFACTURER.equals(d2) || OConstant.CANDIDATE_BRAND.equals(d2) || OConstant.CANDIDATE_MODEL.equals(d2) || "did_hash".equals(d2)) {
                OLog.e(TAG, "addCandidate fail as not allow override build-in candidate", "key", d2);
            } else if (this.b != null) {
                try {
                    if (com.taobao.orange.a.b) {
                        this.b.addCandidate(oCandidate.d(), oCandidate.b(), oCandidate.c());
                    }
                } catch (Throwable th) {
                    OLog.e(TAG, "addCandidate", th, new Object[0]);
                }
            } else if (this.m.add(oCandidate)) {
                OLog.w(TAG, "addCandidate wait", "candidate", oCandidate);
            }
        }
    }

    public void f(Context context, boolean z) {
        int i2 = 3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67ee3588", new Object[]{this, context, new Boolean(z)});
        } else if (this.b == null) {
            h(context);
            if (z) {
                if (this.c == null) {
                    this.c = new CountDownLatch(1);
                }
                if (this.b == null) {
                    try {
                        if (com.taobao.orange.a.b) {
                            i2 = ((Integer) jno.b(com.taobao.orange.a.g, OConstant.SYSKEY_BIND_TIMEOUT, 3)).intValue();
                        }
                        OLog.i(TAG, "syncGetBindService bindTimeout", Integer.valueOf(i2));
                        this.c.await(i2, TimeUnit.SECONDS);
                    } catch (Throwable th) {
                        OLog.e(TAG, "syncGetBindService", th, new Object[0]);
                    }
                    if (this.b != null || context == null || !com.taobao.orange.a.b) {
                        eal.l(OConstant.MONITOR_MODULE, OConstant.POINT_EXCEPTION, String.valueOf(System.currentTimeMillis()), "101", "bind fail in other process");
                        return;
                    }
                    OLog.w(TAG, "syncGetBindService", "bind service timeout local stub in main process");
                    this.b = new OrangeApiServiceStub(context);
                    eal.l(OConstant.MONITOR_MODULE, OConstant.POINT_EXCEPTION, String.valueOf(System.currentTimeMillis()), "101", "bind fail and start local stub");
                }
            }
        }
    }

    @Override // com.taobao.orange.OrangeConfig
    public String getConfig(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("611c4ee3", new Object[]{this, str, str2, str3});
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            OLog.e(TAG, "getConfig error as param is empty", new Object[0]);
            return str3;
        }
        f(this.f11380a, false);
        if (this.b == null) {
            if (!this.j.add(str)) {
                return str3;
            }
            OLog.w(TAG, "getConfig wait", "namespace", str);
            return str3;
        } else if (com.taobao.orange.a.f11393a && !com.taobao.orange.a.b && ((HashSet) this.n).contains(str)) {
            return str3;
        } else {
            try {
                return this.b.getConfig(str, str2, str3);
            } catch (Throwable th) {
                OLog.e(TAG, "getConfig", th, new Object[0]);
                return str3;
            }
        }
    }

    @Override // com.taobao.orange.OrangeConfig
    public Map<String, String> getConfigs(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("6165ac1", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            OLog.e(TAG, "getConfigs error as param is empty", new Object[0]);
            return null;
        }
        f(this.f11380a, false);
        if (this.b == null) {
            if (!this.j.add(str)) {
                return null;
            }
            OLog.w(TAG, "getConfigs wait", "namespace", str);
            return null;
        } else if (com.taobao.orange.a.f11393a && !com.taobao.orange.a.b && ((HashSet) this.n).contains(str)) {
            return null;
        } else {
            try {
                return this.b.getConfigs(str);
            } catch (Throwable th) {
                OLog.e(TAG, "getConfigs", th, new Object[0]);
                return null;
            }
        }
    }

    @Override // com.taobao.orange.OrangeConfig
    public String getCustomConfig(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3a44377c", new Object[]{this, str, str2});
        }
        if (TextUtils.isEmpty(str)) {
            OLog.e(TAG, "getCustomConfig error as param is empty", new Object[0]);
            return null;
        }
        f(this.f11380a, false);
        if (this.b == null) {
            if (this.j.add(str)) {
                OLog.w(TAG, "getCustomConfig wait", "namespace", str);
            }
        } else if (com.taobao.orange.a.f11393a && !com.taobao.orange.a.b && ((HashSet) this.n).contains(str)) {
            return null;
        } else {
            try {
                return this.b.getCustomConfig(str, str2);
            } catch (Throwable th) {
                OLog.e(TAG, "getCustomConfig", th, new Object[0]);
            }
        }
        return str2;
    }

    public final void h(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be7d540f", new Object[]{this, context});
        } else if (context != null && this.b == null && this.e.compareAndSet(false, true)) {
            com.taobao.orange.a.d = cw0.f(context);
            OLog.e(TAG, "current process is ", "channel", Boolean.valueOf(com.taobao.orange.a.d), "main", Boolean.valueOf(com.taobao.orange.a.b));
            if (com.taobao.orange.a.d) {
                OLog.i(TAG, "create local service at channel process start", new Object[0]);
                this.b = new OrangeApiServiceStub(context);
                this.e.set(false);
                OLog.e(TAG, "create local service at channel process done", new Object[0]);
                this.h = System.currentTimeMillis();
                eal.p("success", pg1.ATOM_EXT_bind, this.h, -1.0d);
            } else if (com.taobao.orange.a.b) {
                OLog.e(TAG, "main process init, not bind service. channel process alive = " + com.taobao.orange.a.e, new Object[0]);
                this.b = new OrangeApiServiceStub(context);
                if (com.taobao.orange.a.e) {
                    fck.d(new h(), 3000L);
                } else {
                    fck.d(new i(), 15000L);
                }
            }
        }
    }

    public final <T extends mbk> void r(String[] strArr, T t, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("162b6a7e", new Object[]{this, strArr, t, new Boolean(z)});
        } else if (strArr == null || strArr.length == 0 || t == null) {
            OLog.e(TAG, "registerListener error as param null", new Object[0]);
        } else {
            OrangeConfigListenerStub orangeConfigListenerStub = new OrangeConfigListenerStub(t, z);
            if (com.taobao.orange.a.d) {
                q(strArr, orangeConfigListenerStub);
            }
            if (this.b == null) {
                OLog.w(TAG, "registerListener wait", "namespaces", Arrays.asList(strArr));
                for (String str : strArr) {
                    j(str).add(orangeConfigListenerStub);
                }
                return;
            }
            fck.c(new g(strArr, orangeConfigListenerStub));
        }
    }

    public final void v(int i2) {
        Throwable th;
        tzc tzcVar = null;
        try {
            tzcVar = (tzc) com.taobao.orange.a.f.newInstance();
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            String k = k();
            if (TextUtils.isEmpty(k)) {
                OLog.e(TAG, "triggerIndexUpdate", "get request url failed");
                if (tzcVar == null) {
                    return;
                }
                return;
            }
            tzcVar.f(k);
            tzcVar.setMethod("GET");
            tzcVar.connect();
            int d2 = tzcVar.d();
            OLog.e(TAG, "triggerIndexUpdate", "send success", Integer.valueOf(d2));
            if (200 == d2) {
                jno.f(com.taobao.orange.a.g, OConstant.PROCESS_QUERY_SENT_COUNT, Integer.valueOf(i2 + 1));
                jno.f(com.taobao.orange.a.g, OConstant.PROCESS_QUERY_SENT_LAST_TIME_SECONDS, Long.valueOf(System.currentTimeMillis() / 1000));
            }
            tzcVar.disconnect();
        } catch (Throwable th3) {
            th = th3;
            tzcVar = tzcVar;
            try {
                OLog.e(TAG, "triggerIndexUpdate", "send failed", th.getMessage());
                if (tzcVar != null) {
                    tzcVar.disconnect();
                }
            } finally {
                if (tzcVar != null) {
                    tzcVar.disconnect();
                }
            }
        }
    }

    @Override // com.taobao.orange.OrangeConfig
    public void init(Context context, OConfig oConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7508d46d", new Object[]{this, context, oConfig});
        } else if (context == null) {
            OLog.e(TAG, "init error as ctx is null", new Object[0]);
        } else {
            String packageName = context.getPackageName();
            com.taobao.orange.a.f11393a = !TextUtils.isEmpty(packageName) && packageName.equals("com.taobao.taobao");
            com.taobao.orange.a.b = cw0.d(context);
            boolean z = (context.getApplicationInfo().flags & 2) != 0;
            if (z) {
                OLog.isUseTlog = false;
            } else {
                OLog.isUseTlog = true;
            }
            OLog.i(TAG, "init", v4s.PARAM_IS_DEBUG, Boolean.valueOf(z), "isMainProcess", Boolean.valueOf(com.taobao.orange.a.b));
            if (TextUtils.isEmpty(oConfig.appKey) || TextUtils.isEmpty(oConfig.appVersion)) {
                OLog.e(TAG, "init error as appKey or appVersion is empty", new Object[0]);
                return;
            }
            if (this.f11380a == null) {
                this.f11380a = context.getApplicationContext();
            }
            com.taobao.orange.a.g = this.f11380a;
            com.taobao.orange.a.C = OConstant.ENV.valueOf(oConfig.env);
            com.taobao.orange.a.h = oConfig.appKey;
            com.taobao.orange.a.j = oConfig.appVersion;
            this.d = oConfig;
            fck.c(new e(context, oConfig));
        }
    }

    @Override // com.taobao.orange.OrangeConfig
    public void unregisterListener(String[] strArr, obk obkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34b31ea2", new Object[]{this, strArr, obkVar});
        } else if (strArr == null || strArr.length == 0 || obkVar == null) {
            OLog.e(TAG, "unregisterListener error as param null", new Object[0]);
        } else if (this.b != null) {
            try {
                for (String str : strArr) {
                    this.b.unregisterListener(str, new OrangeConfigListenerStub(obkVar));
                }
            } catch (Throwable th) {
                OLog.e(TAG, "unregisterListener", th, new Object[0]);
            }
        } else {
            OLog.w(TAG, "unregisterListener fail", new Object[0]);
        }
    }

    public final void w(Context context) {
        int i2;
        int i3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bcf6f42", new Object[]{this, context});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        long longValue = ((Long) jno.b(context, OConstant.PROCESS_QUERY_SENT_LAST_TIME_SECONDS, 0L)).longValue();
        if (!TextUtils.isEmpty(com.taobao.orange.a.x)) {
            String[] split = com.taobao.orange.a.x.split("#");
            i3 = (int) (1.0d + (Math.random() * Integer.parseInt(split[0])));
            if (longValue > 0) {
                long j2 = currentTimeMillis - longValue;
                if (j2 < Long.parseLong(split[1])) {
                    OLog.e(TAG, "last query time send too near ", Long.valueOf(j2));
                    return;
                }
                int parseInt = Integer.parseInt(split[2]);
                Integer num = (Integer) jno.b(context, OConstant.PROCESS_QUERY_SENT_COUNT, 5);
                i2 = num.intValue();
                if (i2 >= parseInt && n(currentTimeMillis, longValue, TimeZone.getDefault())) {
                    OLog.e(TAG, "exceed sent count limit ", num, Integer.valueOf(parseInt));
                    return;
                }
                OLog.e(TAG, "ready to send query at delay time", Integer.valueOf(i3));
                fck.d(new f(i2), i3 * 1000);
            }
        } else {
            i3 = 1200;
        }
        i2 = 0;
        OLog.e(TAG, "ready to send query at delay time", Integer.valueOf(i3));
        fck.d(new f(i2), i3 * 1000);
    }

    @Override // com.taobao.orange.OrangeConfig
    public void unregisterListener(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dca95a28", new Object[]{this, strArr});
        } else if (strArr == null || strArr.length == 0) {
            OLog.e(TAG, "unregisterListeners error as namespaces is null", new Object[0]);
        } else if (this.b != null) {
            try {
                for (String str : strArr) {
                    this.b.unregisterListeners(str);
                }
            } catch (Throwable th) {
                OLog.e(TAG, "unregisterListeners", th, new Object[0]);
            }
        } else {
            OLog.w(TAG, "unregisterListeners fail", new Object[0]);
        }
    }
}
