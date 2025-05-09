package com.taobao.monitor.adapter;

import android.app.Application;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ab.api.ABGlobal;
import com.taobao.android.dinamicx.m;
import com.taobao.monitor.ProcedureGlobal;
import com.taobao.monitor.adapter.test.AliAPMBridge;
import com.taobao.monitor.adapter.test.H5ProcedureGetterBridge;
import com.taobao.monitor.procedure.c;
import com.taobao.orange.OConstant;
import com.taobao.popupcenter.strategy.PopStrategy;
import com.uc.webview.export.WebView;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import tb.aih;
import tb.avr;
import tb.b5e;
import tb.cst;
import tb.fln;
import tb.fsw;
import tb.g3v;
import tb.icc;
import tb.jc;
import tb.lq6;
import tb.luj;
import tb.mdd;
import tb.mq6;
import tb.nca;
import tb.o48;
import tb.out;
import tb.re2;
import tb.rrl;
import tb.sxm;
import tb.t1x;
import tb.t5r;
import tb.txm;
import tb.tz;
import tb.u5r;
import tb.v5r;
import tb.w9a;
import tb.wsa;
import tb.xpl;
import tb.xqr;
import tb.y2v;
import tb.z4u;
import tb.zq6;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public abstract class AbsAPMInitiator implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "AbsAPMInitiator";
    private final long apmStartTime = out.a();
    private final long cpuStartTime = SystemClock.currentThreadTimeMillis();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements icc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(AbsAPMInitiator absAPMInitiator) {
        }

        public HandlerThread a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (HandlerThread) ipChange.ipc$dispatch("60bf987d", new Object[]{this, str});
            }
            return wsa.a(str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b extends tz {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b(AbsAPMInitiator absAPMInitiator) {
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/monitor/adapter/AbsAPMInitiator$2");
        }

        @Override // tb.wbe
        public boolean b(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5f25b880", new Object[]{this, view})).booleanValue();
            }
            return view instanceof WebView;
        }

        @Override // tb.tz
        public int f(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("86cad9db", new Object[]{this, view})).intValue();
            }
            return ((WebView) view).getProgress();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class c implements re2 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ String f11076a;
            public final /* synthetic */ HashMap b;

            public a(String str, HashMap hashMap) {
                this.f11076a = str;
                this.b = hashMap;
            }

            @Override // java.lang.Runnable
            public void run() {
                HashMap hashMap;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                if ("afc".equals(this.f11076a) && (hashMap = this.b) != null) {
                    zq6.a(AbsAPMInitiator.TAG, this.f11076a, hashMap);
                }
                mdd a2 = mq6.a();
                if (a2 != null) {
                    a2.b(this.f11076a, this.b);
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
        public class b implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ String f11077a;
            public final /* synthetic */ HashMap b;

            public b(String str, HashMap hashMap) {
                this.f11077a = str;
                this.b = hashMap;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                mdd a2 = mq6.a();
                if (a2 != null) {
                    a2.h(this.f11077a, this.b);
                }
            }
        }

        /* compiled from: Taobao */
        /* renamed from: com.taobao.monitor.adapter.AbsAPMInitiator$c$c  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
        public class RunnableC0623c implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ String f11078a;
            public final /* synthetic */ long b;
            public final /* synthetic */ String c;

            public RunnableC0623c(String str, long j, String str2) {
                this.f11078a = str;
                this.b = j;
                this.c = str2;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                mdd a2 = mq6.a();
                if (a2 != null) {
                    HashMap hashMap = new HashMap();
                    hashMap.put(this.f11078a, Long.valueOf(this.b));
                    a2.o(this.c, hashMap);
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
        public class d implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ String f11079a;
            public final /* synthetic */ String b;

            public d(String str, String str2) {
                this.f11079a = str;
                this.b = str2;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                mdd a2 = mq6.a();
                if (a2 != null) {
                    a2.a("bizID", this.f11079a);
                    if (!TextUtils.isEmpty(this.b)) {
                        a2.a("bizCode", this.b);
                    }
                }
            }
        }

        public c(AbsAPMInitiator absAPMInitiator) {
        }

        public final void a(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c3d03401", new Object[]{this, runnable});
            } else {
                w9a.g().f().post(runnable);
            }
        }

        public void b(String str, String str2, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("402a968a", new Object[]{this, str, str2, new Long(j)});
            } else {
                a(new RunnableC0623c(str2, out.a(), str));
            }
        }

        public void d(String str, HashMap<String, String> hashMap) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f0a58564", new Object[]{this, str, hashMap});
            } else {
                a(new b(str, hashMap));
            }
        }

        public void e(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("121d0bf3", new Object[]{this, str, str2});
            } else {
                a(new d(str, str2));
            }
        }

        public void c(String str, HashMap<String, String> hashMap) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("47bd9125", new Object[]{this, str, hashMap});
                return;
            }
            if (PopStrategy.IDENTIFIER_SPLASH.equals(str)) {
                nca.c = true;
            }
            a(new a(str, hashMap));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class d implements b5e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d(AbsAPMInitiator absAPMInitiator) {
        }

        @Override // tb.b5e
        public String a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("3f70c80", new Object[]{this});
            }
            return g3v.getInstance().getUtsid();
        }
    }

    private void initAPMFunction(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a18a3361", new Object[]{this, application, hashMap});
            return;
        }
        initParams(application, hashMap);
        initThread();
        initDataLogger();
        xpl.e(application);
        initEnv(hashMap);
        initAPMLauncher(application, hashMap);
        initNetwork();
        initSender();
        initDataHub();
        initLauncherProcedure();
        initWebView();
        initExpendLauncher(application);
        initUTSession(hashMap);
    }

    private void initAPMLauncher(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75181f29", new Object[]{this, application, hashMap});
            return;
        }
        initPage(application);
        txm.b(application, hashMap);
        jc.g(application, hashMap);
    }

    private void initDataHub() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e51a4c2", new Object[]{this});
        } else {
            lq6.a().b(new c(this));
        }
    }

    private void initDataLogger() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61330691", new Object[]{this});
        } else {
            zq6.d(new aih());
        }
    }

    private void initNetwork() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28339085", new Object[]{this});
            return;
        }
        try {
            xqr.a();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private void initSender() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71f7a96c", new Object[]{this});
            return;
        }
        luj.c().b(new avr());
        if (!TextUtils.isEmpty(v5r.d)) {
            luj.c().b(new fln());
        }
    }

    private void initThread() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efe0aac1", new Object[]{this});
        } else {
            cst.b(new a(this));
        }
    }

    private void initWebView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("407bf8f0", new Object[]{this});
            return;
        }
        fsw.i(H5ProcedureGetterBridge.API_SERVER_NAME, H5ProcedureGetterBridge.class, false);
        fsw.i(AliAPMBridge.API_SERVER_NAME, AliAPMBridge.class, false);
        t1x.INSTANCE.c(new b(this));
    }

    public void initExpendLauncher(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec6a26a", new Object[]{this, application});
        }
    }

    public abstract void initPage(Application application);

    public void initParams(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abb2c931", new Object[]{this, application, hashMap});
            return;
        }
        o48.r = ABGlobal.isFeatureOpened(application, "apmFixedScrollHitchThreshold");
        w9a g = w9a.g();
        g.j(application);
        Object obj = hashMap.get("userId");
        if (obj != null) {
            t5r.b("sid", hashMap.get("sid"));
            t5r.b("userId", obj);
        }
        t5r.b("isLoginSessionValid", hashMap.get("checkSessionInvalid"));
        g.m(rrl.a(hashMap.get("ttid"), null));
    }

    private static void initEnv(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("904eab41", new Object[]{map});
            return;
        }
        try {
            Number number = (Number) map.get(OConstant.LAUNCH_ENVINDEX);
            if (number != null) {
                if (!(number.intValue() == 0 || number.intValue() == 1 || number.intValue() == 2)) {
                    return;
                }
                v5r.f29797a = number.intValue();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private void initUTSession(HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1a62a05", new Object[]{this, hashMap});
        } else if (rrl.b(hashMap.get("needUT"), true)) {
            y2v.b().c(new d(this));
        }
    }

    public void init(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{this, application, hashMap});
        } else if (!v5r.b) {
            initAPMFunction(application, hashMap);
            v5r.b = true;
        }
    }

    private void initLauncherProcedure() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdf59eea", new Object[]{this});
            return;
        }
        com.taobao.monitor.procedure.c h = new c.b().j(false).o(true).m(false).l(null).h();
        sxm sxmVar = sxm.b;
        mdd a2 = sxmVar.a(z4u.a("/startup"), h);
        a2.c();
        ProcedureGlobal.PROCEDURE_MANAGER.F(a2);
        mdd a3 = sxmVar.a("/APMSelf", new c.b().j(false).o(false).m(false).l(a2).h());
        a3.c();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            z = true;
        }
        a3.a("isMainThread", Boolean.valueOf(z));
        a3.a(m.THREAD_NAME, Thread.currentThread().getName());
        a3.j("taskStart", this.apmStartTime);
        a3.j("cpuStartTime", this.cpuStartTime);
        u5r.k();
        t5r.c();
        a3.j("taskEnd", out.a());
        a3.j("cpuEndTime", SystemClock.currentThreadTimeMillis());
        a3.end();
    }
}
