package com.taobao.analysis;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.util.ALog;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.analysis.flow.DayFlowReport;
import com.taobao.analysis.flow.PageFlowReport;
import com.taobao.analysis.fulltrace.FullTraceAnalysis;
import com.taobao.analysis.fulltrace.NWFullTracePlugin;
import com.taobao.analysis.scene.SceneIdentifier;
import com.taobao.android.behavir.config.BHRTaskConfigBase;
import com.taobao.orange.OrangeConfig;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import tb.as;
import tb.bzp;
import tb.c21;
import tb.chb;
import tb.cpk;
import tb.ctf;
import tb.jvv;
import tb.s9u;
import tb.srj;
import tb.u11;
import tb.yn1;
import tb.yy8;
import tb.z8l;
import tb.zr;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class FlowCenter {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final long DEFAULT_REPORT_INTERVAL = 300000;
    private static final int DEFAULT_THREAD_NUM = 2;
    private static final String FALCO_GROUP = "falco";
    private static final String TAG = "falco.FlowCenter";
    private static final String WEBVIEW_URL_EXTRA = "URL_REFERER_ORIGIN";
    private static volatile FlowCenter flowCenter;
    private static final AtomicInteger integer = new AtomicInteger(0);
    public static volatile boolean isMainProcess;
    private String curPageActivityName;
    private String curPageWebviewUrl;
    private ScheduledThreadPoolExecutor scheduleThreadPoolExecutor;
    private boolean isBackground = false;
    public final i innerListener = new i(this, null);
    private AtomicBoolean isApmInited = new AtomicBoolean(false);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements ThreadFactory {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(FlowCenter flowCenter) {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
            }
            int andIncrement = FlowCenter.access$100().getAndIncrement();
            return new Thread(runnable, "FLOWCENTER:" + andIncrement);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements z8l {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b(FlowCenter flowCenter) {
        }

        @Override // tb.z8l
        public void onConfigUpdate(String str, boolean z) {
            boolean z2 = true;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9458c0f9", new Object[]{this, str, new Boolean(z)});
                return;
            }
            as.b("falco");
            try {
                String config = OrangeConfig.getInstance().getConfig("falco", "full_trace_tlog_enable", null);
                if (!TextUtils.isEmpty(config)) {
                    FullTraceAnalysis.getInstance().setTLogTraceEnable(Boolean.valueOf(config).booleanValue());
                }
            } catch (Exception e) {
                ALog.e(FlowCenter.TAG, "[onConfigUpdate]error", null, e, new Object[0]);
            }
            try {
                String config2 = OrangeConfig.getInstance().getConfig("falco", "important_mtop_apis", null);
                if (!TextUtils.isEmpty(config2)) {
                    FullTraceAnalysis.getInstance().setImportantMtopApi(config2);
                }
            } catch (Exception e2) {
                ALog.e(FlowCenter.TAG, "[onConfigUpdate]error", null, e2, new Object[0]);
            }
            try {
                String config3 = OrangeConfig.getInstance().getConfig("falco", "background_flow_max_minute_value", null);
                if (!TextUtils.isEmpty(config3)) {
                    yn1.m(Integer.valueOf(config3).intValue());
                }
            } catch (Exception e3) {
                ALog.e(FlowCenter.TAG, "[onConfigUpdate]error", null, e3, new Object[0]);
            }
            try {
                String config4 = OrangeConfig.getInstance().getConfig("falco", "background_flow_monitor", null);
                if (!TextUtils.isEmpty(config4)) {
                    yn1.n(Boolean.valueOf(config4).booleanValue());
                }
            } catch (Exception e4) {
                ALog.e(FlowCenter.TAG, "[onConfigUpdate]error", null, e4, new Object[0]);
            }
            try {
                String config5 = OrangeConfig.getInstance().getConfig("falco", "important_network_urls", null);
                if (!TextUtils.isEmpty(config5)) {
                    FullTraceAnalysis.getInstance().setImportantNetworkUrl(config5);
                }
            } catch (Exception e5) {
                ALog.e(FlowCenter.TAG, "[onConfigUpdate]error", null, e5, new Object[0]);
            }
            s9u.u().L("falco");
            try {
                String config6 = OrangeConfig.getInstance().getConfig("falco", "important_utdids", null);
                if (!TextUtils.isEmpty(config6)) {
                    JSONArray jSONArray = new JSONArray(config6);
                    int i = 0;
                    while (true) {
                        if (i >= jSONArray.length()) {
                            z2 = false;
                            break;
                        } else if (GlobalAppRuntimeInfo.getUtdid().equals(jSONArray.getString(i))) {
                            break;
                        } else {
                            i++;
                        }
                    }
                    FullTraceAnalysis.getInstance().setImportantUser(z2);
                }
            } catch (Exception unused) {
            }
            try {
                String config7 = OrangeConfig.getInstance().getConfig("falco", "falco_extend_enable", null);
                if (!TextUtils.isEmpty(config7)) {
                    FullTraceAnalysis.getInstance().setFalcoExtendEnable(Boolean.valueOf(config7).booleanValue());
                }
            } catch (Exception unused2) {
            }
            try {
                String config8 = OrangeConfig.getInstance().getConfig("falco", "mtop_ssr_ut_enable", null);
                if (!TextUtils.isEmpty(config8)) {
                    FullTraceAnalysis.getInstance().setFalcoSSRMonitorEnable(Boolean.valueOf(config8).booleanValue());
                }
            } catch (Exception unused3) {
            }
            try {
                String config9 = OrangeConfig.getInstance().getConfig("falco", "falco_extend_timeout", null);
                if (!TextUtils.isEmpty(config9)) {
                    FullTraceAnalysis.getInstance().setFalcoExtendTimeout(Long.valueOf(config9).longValue());
                }
            } catch (Exception unused4) {
            }
            try {
                String config10 = OrangeConfig.getInstance().getConfig("falco", "fix_timeout_clean", null);
                if (!TextUtils.isEmpty(config10)) {
                    FullTraceAnalysis.getInstance().setTimeoutFix(Boolean.valueOf(config10).booleanValue());
                }
            } catch (Exception unused5) {
            }
            try {
                String config11 = OrangeConfig.getInstance().getConfig("falco", bzp.CHANNEL_MONITOR_SWITCH_KEY, null);
                if (!TextUtils.isEmpty(config11)) {
                    bzp.b().c(Boolean.valueOf(config11).booleanValue());
                }
            } catch (Exception e6) {
                ALog.e(FlowCenter.TAG, "[onConfigUpdate]error", null, e6, new Object[0]);
            }
            try {
                String config12 = OrangeConfig.getInstance().getConfig("falco", ctf.KEY_WHITE_LIST, null);
                if (!TextUtils.isEmpty(config12)) {
                    ctf.j().n(config12);
                }
            } catch (Exception unused6) {
            }
            try {
                String config13 = OrangeConfig.getInstance().getConfig("falco", ctf.KEY_EXCLUDE_BIZ_CODES, null);
                if (!TextUtils.isEmpty(config13)) {
                    ctf.j().m(config13);
                }
            } catch (Exception unused7) {
            }
            try {
                String config14 = OrangeConfig.getInstance().getConfig("falco", ctf.KEY_JANK_THRESHOLD, null);
                if (!TextUtils.isEmpty(config14)) {
                    ctf.j().p(Float.valueOf(config14).floatValue());
                }
            } catch (Exception unused8) {
            }
            try {
                String config15 = OrangeConfig.getInstance().getConfig("falco", ctf.KEY_JANK_CHECK_INTERVAL, null);
                if (!TextUtils.isEmpty(config15)) {
                    ctf.j().o(Long.valueOf(config15).longValue());
                }
            } catch (Exception unused9) {
            }
            zr.d("falco");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                FlowCenter.access$200(FlowCenter.this);
            }
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
                FlowCenter.access$200(FlowCenter.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class g implements u11 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public g() {
        }

        @Override // tb.u11, com.taobao.application.common.IApmEventListener
        public void onEvent(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fef3fc41", new Object[]{this, new Integer(i)});
            } else if (i == 1) {
                FlowCenter.access$700(FlowCenter.this);
            } else if (i == 2) {
                FlowCenter.access$800(FlowCenter.this);
                yn1.j().f();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class h extends cpk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public h() {
        }

        public static /* synthetic */ Object ipc$super(h hVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/analysis/FlowCenter$8");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a4658a75", new Object[]{this, activity});
            } else if (activity != null) {
                FlowCenter.access$402(FlowCenter.this, activity.getLocalClassName());
                PageFlowReport.b().e(FlowCenter.access$400(FlowCenter.this));
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3e8abf42", new Object[]{this, activity});
            } else if (activity != null) {
                FlowCenter.access$402(FlowCenter.this, activity.getLocalClassName());
                PageFlowReport.b().d(FlowCenter.access$400(FlowCenter.this));
                Intent intent = activity.getIntent();
                if (intent != null) {
                    FlowCenter.access$902(FlowCenter.this, srj.b(intent.getStringExtra("URL_REFERER_ORIGIN")));
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class i implements NetworkStatusHelper.INetworkStatusChangeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public i(FlowCenter flowCenter) {
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9a23a9aa", new Object[]{this});
            } else {
                NetworkStatusHelper.addStatusChangeListener(this);
            }
        }

        @Override // anet.channel.status.NetworkStatusHelper.INetworkStatusChangeListener
        public void onNetworkStatusChanged(NetworkStatusHelper.NetworkStatus networkStatus) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4275ba3b", new Object[]{this, networkStatus});
                return;
            }
            ALog.d(FlowCenter.TAG, "onNetworkStatusChanged", null, new Object[0]);
            srj.a();
        }

        public /* synthetic */ i(FlowCenter flowCenter, a aVar) {
            this(flowCenter);
        }
    }

    private FlowCenter() {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(2, new a(this));
        this.scheduleThreadPoolExecutor = scheduledThreadPoolExecutor;
        scheduledThreadPoolExecutor.setKeepAliveTime(120L, TimeUnit.SECONDS);
        this.scheduleThreadPoolExecutor.allowCoreThreadTimeOut(true);
        checkApmInitStatus();
        UemAnalysis.setAnalysisDelegate(FullTraceAnalysis.getInstance());
        yy8.b(GlobalAppRuntimeInfo.getContext());
        s9u.u().v();
        NWFullTracePlugin.register();
        zr.e().g();
        try {
            zr.d("falco");
            OrangeConfig.getInstance().registerListener(new String[]{"falco"}, new b(this));
            as.b("falco");
        } catch (Exception unused) {
        }
    }

    public static /* synthetic */ AtomicInteger access$100() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicInteger) ipChange.ipc$dispatch("64f15fa2", new Object[0]);
        }
        return integer;
    }

    public static /* synthetic */ void access$200(FlowCenter flowCenter2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e8fde85", new Object[]{flowCenter2});
        } else {
            flowCenter2.tryCommitStatFlow();
        }
    }

    public static /* synthetic */ boolean access$300(FlowCenter flowCenter2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4790d5ca", new Object[]{flowCenter2})).booleanValue();
        }
        return flowCenter2.checkApmInitStatus();
    }

    public static /* synthetic */ String access$400(FlowCenter flowCenter2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7ed8f679", new Object[]{flowCenter2});
        }
        return flowCenter2.curPageActivityName;
    }

    public static /* synthetic */ String access$402(FlowCenter flowCenter2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("31ab5f6d", new Object[]{flowCenter2, str});
        }
        flowCenter2.curPageActivityName = str;
        return str;
    }

    public static /* synthetic */ boolean access$500(FlowCenter flowCenter2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d992c44c", new Object[]{flowCenter2})).booleanValue();
        }
        return flowCenter2.isBackground;
    }

    public static /* synthetic */ void access$600(FlowCenter flowCenter2, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9880ac5f", new Object[]{flowCenter2, context});
        } else {
            flowCenter2.initWithContext(context);
        }
    }

    public static /* synthetic */ void access$700(FlowCenter flowCenter2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b94b2ca", new Object[]{flowCenter2});
        } else {
            flowCenter2.enterBackground();
        }
    }

    public static /* synthetic */ void access$800(FlowCenter flowCenter2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3495aa0b", new Object[]{flowCenter2});
        } else {
            flowCenter2.enterForeground();
        }
    }

    public static /* synthetic */ String access$902(FlowCenter flowCenter2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5e03d08", new Object[]{flowCenter2, str});
        }
        flowCenter2.curPageWebviewUrl = str;
        return str;
    }

    private boolean checkApmInitStatus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("af817e43", new Object[]{this})).booleanValue();
        }
        if (c21.g() == chb.DEFAULT) {
            return false;
        }
        if (this.isApmInited.compareAndSet(false, true)) {
            c21.c(new g());
            c21.a(new h(), false);
        }
        return true;
    }

    private void enterBackground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("436c8bad", new Object[]{this});
            return;
        }
        this.isBackground = true;
        this.curPageActivityName = "";
        this.curPageWebviewUrl = "";
        this.scheduleThreadPoolExecutor.execute(new f());
    }

    private void enterForeground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc1a8d42", new Object[]{this});
            return;
        }
        this.isBackground = false;
        as.c().d();
        zr.e().i();
    }

    public static FlowCenter getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FlowCenter) ipChange.ipc$dispatch("52b95350", new Object[0]);
        }
        if (flowCenter == null) {
            synchronized (FlowCenter.class) {
                try {
                    if (flowCenter == null) {
                        flowCenter = new FlowCenter();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return flowCenter;
    }

    private void tryCommitStatFlow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b36c1d1b", new Object[]{this});
            return;
        }
        jvv.b().c();
        DayFlowReport.j().l(true);
        if (isMainProcess) {
            PageFlowReport.b().c();
            as.c().e(true);
        }
    }

    public void commitFlow(Context context, String str, String str2, long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf1a77d0", new Object[]{this, context, str, str2, new Long(j), new Long(j2)});
        } else {
            commitFlow(context, str, null, str2, null, null, j, j2);
        }
    }

    public void createConnectCount(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d0ed546", new Object[]{this, str, str2, str3});
        } else if (this.isBackground) {
            yn1.j().h(str, str2, str3);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f6218a;
        public final /* synthetic */ String b;
        public final /* synthetic */ long c;
        public final /* synthetic */ long d;
        public final /* synthetic */ String e;
        public final /* synthetic */ String f;
        public final /* synthetic */ String g;
        public final /* synthetic */ String h;

        public e(Context context, String str, long j, long j2, String str2, String str3, String str4, String str5) {
            this.f6218a = context;
            this.b = str;
            this.c = j;
            this.d = j2;
            this.e = str2;
            this.f = str3;
            this.g = str4;
            this.h = str5;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (this.f6218a != null) {
                if (srj.b == null) {
                    FlowCenter.access$600(FlowCenter.this, this.f6218a);
                }
                FlowCenter.access$300(FlowCenter.this);
                if (BHRTaskConfigBase.TYPE_CONFIG_UT.equals(this.b)) {
                    jvv.b().a(this.c, this.d);
                } else {
                    bzp.b().a(this.b, FlowCenter.access$500(FlowCenter.this), this.e, this.f, this.g, this.h, this.c, this.d);
                }
                DayFlowReport.j().i(this.b, FlowCenter.access$500(FlowCenter.this), this.f, this.c, this.d);
                if (FlowCenter.isMainProcess) {
                    PageFlowReport.b().a(this.g, this.c, this.d);
                    as.c().a(this.b, this.g, this.f, FlowCenter.access$500(FlowCenter.this), this.c, this.d);
                }
            }
        }
    }

    private void initWithContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d95dcce8", new Object[]{this, context});
            return;
        }
        synchronized (FlowCenter.class) {
            try {
                if (srj.b == null) {
                    srj.b = context.getApplicationContext();
                    this.innerListener.a();
                    ALog.d(TAG, "initWithContext: innerListener.register", null, new Object[0]);
                    isMainProcess = srj.f();
                    if (!isMainProcess) {
                        this.scheduleThreadPoolExecutor.scheduleAtFixedRate(new c(), 300000L, 300000L, TimeUnit.MILLISECONDS);
                    }
                    SceneIdentifier.setContext(srj.b);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void commitFlow(Context context, String str, boolean z, String str2, long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3ddf958", new Object[]{this, context, str, new Boolean(z), str2, new Long(j), new Long(j2)});
        } else {
            commitFlow(context, str, null, null, null, null, j, j2);
        }
    }

    public void commitFlow(Context context, String str, String str2, String str3, long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3071231a", new Object[]{this, context, str, str2, str3, new Long(j), new Long(j2)});
        } else {
            commitFlow(context, str, str2, str3, this.curPageActivityName, this.curPageWebviewUrl, j, j2);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f6217a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ long d;
        public final /* synthetic */ long e;
        public final /* synthetic */ long f;
        public final /* synthetic */ long g;

        public d(int i, String str, String str2, long j, long j2, long j3, long j4) {
            this.f6217a = i;
            this.b = str;
            this.c = str2;
            this.d = j;
            this.e = j2;
            this.f = j3;
            this.g = j4;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            FlowCenter.access$300(FlowCenter.this);
            int i = this.f6217a;
            if (i == 1 || i == 2) {
                ALog.d("NetworkAnalysis", "start AbnormalFlowMonitor", null, new Object[0]);
                zr.e().h(this.b, FlowCenter.access$400(FlowCenter.this), this.c, FlowCenter.access$500(FlowCenter.this), this.d, this.e, this.f6217a);
            } else if (yn1.l()) {
                ALog.d("NetworkAnalysis", "start BgFlowMonitor", null, new Object[0]);
                yn1.j().e(FlowCenter.access$500(FlowCenter.this), this.c, this.d, this.e, this.f, this.g);
            }
        }
    }

    public void commitFlow(int i2, String str, String str2, long j, long j2, long j3, long j4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2678888b", new Object[]{this, new Integer(i2), str, str2, new Long(j), new Long(j2), new Long(j3), new Long(j4)});
        } else if (j != 0 || j2 != 0) {
            this.scheduleThreadPoolExecutor.execute(new d(i2, str, str2, j, j2, j3, j4));
        }
    }

    private void commitFlow(Context context, String str, String str2, String str3, String str4, String str5, long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41f39e2e", new Object[]{this, context, str, str2, str3, str4, str5, new Long(j), new Long(j2)});
        } else if (j != 0 || j2 != 0) {
            this.scheduleThreadPoolExecutor.execute(new e(context, str, j, j2, str2, str3, str4, str5));
        }
    }
}
