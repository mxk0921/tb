package com.alibaba.evo;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.ut.abtest.UTABTest;
import com.alibaba.ut.abtest.Variation;
import com.alibaba.ut.abtest.VariationSet;
import com.alibaba.ut.abtest.a;
import com.alibaba.ut.abtest.event.EventType;
import com.alibaba.ut.abtest.internal.bucketing.DefaultVariationSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.notification.model.NotificationStyle;
import java.util.Map;
import mtopsdk.mtop.stat.MtopMonitor;
import tb.bj8;
import tb.bpm;
import tb.buv;
import tb.do8;
import tb.eo8;
import tb.fjh;
import tb.gau;
import tb.hrv;
import tb.ko8;
import tb.ku0;
import tb.n;
import tb.o;
import tb.ogh;
import tb.p3v;
import tb.p68;
import tb.q68;
import tb.rau;
import tb.sau;
import tb.t2o;
import tb.tt6;
import tb.uym;
import tb.ydt;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class EVO {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION_INITIALIZE_COMPLETE = "evo.intent.action.INITIALIZE_COMPLETE";
    private static final String TAG = "EVO";
    public static q68 sInitiator = new q68();
    private static final VariationSet EMPTY_VARIATION_SET = new DefaultVariationSet(new do8());

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f2447a;
        public final /* synthetic */ Map b;
        public final /* synthetic */ Object c;

        public a(String str, Map map, Object obj) {
            this.f2447a = str;
            this.b = map;
            this.c = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                n.j().k().e(this.f2447a, this.b, this.c);
            } catch (Throwable th) {
                ku0.j("EVO.activateServerInternal.Async", th);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f2448a;
        public final /* synthetic */ p68 b;
        public final /* synthetic */ Map c;

        public b(String str, p68 p68Var, Map map) {
            this.f2448a = str;
            this.c = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                if (!TextUtils.isEmpty(this.f2448a)) {
                    if (!EVO.isPreInitialized()) {
                        ogh.l(EVO.TAG, "getExperimentsByDomainAsync方法调用，需要先调用 initialize() 方法初始化SDK。");
                    } else {
                        n.j().k().c(this.f2448a, this.c);
                    }
                }
            } catch (Throwable th) {
                ku0.j("EVO.getExperimentsByDomainAsync", th);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(961544197);
        }

        private c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            if (n.j().q()) {
                ogh.q(n.j().q());
            }
            n.j().d();
            ku0.p();
            ku0.q();
            ku0.o();
        }

        public /* synthetic */ c(a aVar) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final com.alibaba.ut.abtest.a f2449a;
        private final boolean b;

        static {
            t2o.a(961544198);
        }

        public d(com.alibaba.ut.abtest.a aVar, boolean z) {
            this.f2449a = aVar;
            this.b = z;
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b8296f99", new Object[]{this});
                return;
            }
            try {
                LocalBroadcastManager.getInstance(n.j().b()).sendBroadcast(new Intent(EVO.ACTION_INITIALIZE_COMPLETE));
            } catch (Throwable th) {
                ku0.j("EVO.BackgroundInit.notifyInitializeComplete", th);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0067 A[Catch: all -> 0x004b, TRY_LEAVE, TryCatch #1 {all -> 0x004b, blocks: (B:10:0x003c, B:12:0x0040, B:17:0x004e, B:18:0x0059, B:20:0x0067, B:22:0x00b5, B:24:0x00d3, B:26:0x00dd, B:27:0x00ea, B:29:0x00fe, B:31:0x0108, B:32:0x010c, B:21:0x0070), top: B:35:0x003c }] */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void run() {
            /*
                Method dump skipped, instructions count: 286
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.alibaba.evo.EVO.d.run():void");
        }
    }

    static {
        t2o.a(961544194);
    }

    public static /* synthetic */ void access$000(com.alibaba.ut.abtest.a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1976f113", new Object[]{aVar, new Boolean(z)});
        } else {
            preInit(aVar, z);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0138 A[Catch: all -> 0x0053, TryCatch #0 {all -> 0x0053, blocks: (B:6:0x003d, B:9:0x004b, B:13:0x0056, B:15:0x0064, B:17:0x006f, B:19:0x007d, B:21:0x0086, B:23:0x008c, B:26:0x0094, B:28:0x009a, B:30:0x00a8, B:32:0x00b1, B:35:0x00be, B:37:0x00cc, B:39:0x00de, B:40:0x00eb, B:42:0x00f1, B:43:0x0101, B:44:0x0116, B:45:0x0122, B:47:0x0128, B:53:0x0138, B:54:0x013a, B:58:0x0147, B:60:0x0151, B:62:0x0157, B:65:0x015e, B:66:0x0174, B:67:0x0184, B:69:0x018f, B:71:0x0195, B:74:0x019c, B:75:0x01bf, B:76:0x01e4, B:78:0x01ea), top: B:82:0x003d }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0151 A[Catch: all -> 0x0053, TryCatch #0 {all -> 0x0053, blocks: (B:6:0x003d, B:9:0x004b, B:13:0x0056, B:15:0x0064, B:17:0x006f, B:19:0x007d, B:21:0x0086, B:23:0x008c, B:26:0x0094, B:28:0x009a, B:30:0x00a8, B:32:0x00b1, B:35:0x00be, B:37:0x00cc, B:39:0x00de, B:40:0x00eb, B:42:0x00f1, B:43:0x0101, B:44:0x0116, B:45:0x0122, B:47:0x0128, B:53:0x0138, B:54:0x013a, B:58:0x0147, B:60:0x0151, B:62:0x0157, B:65:0x015e, B:66:0x0174, B:67:0x0184, B:69:0x018f, B:71:0x0195, B:74:0x019c, B:75:0x01bf, B:76:0x01e4, B:78:0x01ea), top: B:82:0x003d }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0184 A[Catch: all -> 0x0053, TryCatch #0 {all -> 0x0053, blocks: (B:6:0x003d, B:9:0x004b, B:13:0x0056, B:15:0x0064, B:17:0x006f, B:19:0x007d, B:21:0x0086, B:23:0x008c, B:26:0x0094, B:28:0x009a, B:30:0x00a8, B:32:0x00b1, B:35:0x00be, B:37:0x00cc, B:39:0x00de, B:40:0x00eb, B:42:0x00f1, B:43:0x0101, B:44:0x0116, B:45:0x0122, B:47:0x0128, B:53:0x0138, B:54:0x013a, B:58:0x0147, B:60:0x0151, B:62:0x0157, B:65:0x015e, B:66:0x0174, B:67:0x0184, B:69:0x018f, B:71:0x0195, B:74:0x019c, B:75:0x01bf, B:76:0x01e4, B:78:0x01ea), top: B:82:0x003d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.alibaba.ut.abtest.VariationSet activateSync(java.lang.String r18, java.lang.String r19, java.util.Map<java.lang.String, java.lang.Object> r20, java.lang.Object r21) {
        /*
            Method dump skipped, instructions count: 507
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.evo.EVO.activateSync(java.lang.String, java.lang.String, java.util.Map, java.lang.Object):com.alibaba.ut.abtest.VariationSet");
    }

    public static void getExperimentsByDomainAsync(String str, Map<String, Object> map, p68 p68Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5e8bc91", new Object[]{str, map, p68Var});
        } else {
            ydt.b(new b(str, p68Var, map));
        }
    }

    public static q68 getInitiator() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (q68) ipChange.ipc$dispatch("c307eef5", new Object[0]);
        }
        return sInitiator;
    }

    public static String getPageActivateTrackIds() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e23bd774", new Object[0]);
        }
        try {
            if (isPreInitialized()) {
                return n.j().n().h();
            }
            ogh.l(TAG, "getPageActivateTrackIds方法调用，需要先调用 initialize() 方法初始化SDK。");
            return null;
        } catch (Throwable th) {
            ku0.j("EVO.getPageActivateTrackIds", th);
            return null;
        }
    }

    public static void initBeforeExperimentTask(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21917510", new Object[]{context});
            return;
        }
        try {
            initBeforeExperimentTask(context, false);
        } catch (Throwable th) {
            ku0.j("EVO.initBeforeExperimentTask", th);
        }
    }

    public static synchronized void initializeAsync(Context context, com.alibaba.ut.abtest.a aVar) {
        synchronized (EVO.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("aac9e743", new Object[]{context, aVar});
            } else {
                sInitiator.e(context, aVar, false);
            }
        }
    }

    private static void initializeInternal(Context context, com.alibaba.ut.abtest.a aVar, boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8816f30", new Object[]{context, aVar, new Boolean(z)});
            return;
        }
        if (z) {
            str = "是";
        } else {
            str = "否";
        }
        ogh.e(TAG, "SDK开始初始化。是否同步初始化：".concat(str));
        long nanoTime = System.nanoTime();
        bpm.e(context, "context is null");
        bpm.e(aVar, "configuration is null");
        boolean c2 = uym.c(context);
        if (n.j().s() || c2) {
            n.j().t(context);
            n.j().A();
            n.j().w(aVar.e());
            n.j().v(aVar.g());
            n.j().a().f(context);
            if (c2 || !n.j().s()) {
                n.j().g().b(EventType.ExperimentV5Data, new ko8());
                n.j().g().b(EventType.BetaExperimentV5Data, new eo8());
                n.j().g().b(EventType.User, new hrv());
            }
            ogh.e(TAG, "当前环境：" + n.j().f());
            long currentTimeMillis = System.currentTimeMillis();
            if (n.j().a().b()) {
                preInit(aVar, c2);
            }
            ogh.g("preInit", "preInit cost: " + (System.currentTimeMillis() - currentTimeMillis) + "ms");
            if (z) {
                new d(aVar, c2).run();
            } else {
                ydt.b(new d(aVar, c2));
            }
            ogh.g(TAG, "SDK初始化耗时：" + (System.nanoTime() - nanoTime) + NotificationStyle.NOTIFICATION_STYLE);
            return;
        }
        ogh.l(TAG, "未开启多进程支持，只允许主进程初始化SDK。主进程：否，配置开启多进程支持：否");
    }

    public static boolean isInitialized() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("18d112d5", new Object[0])).booleanValue();
        }
        return sInitiator.h();
    }

    public static boolean isPreInitialized() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6b513f06", new Object[0])).booleanValue();
        }
        return sInitiator.i();
    }

    @Deprecated
    public static a.C0105a newConfigurationBuilder() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a.C0105a) ipChange.ipc$dispatch("714e113d", new Object[0]);
        }
        return new a.C0105a();
    }

    public static synchronized void updateUserAccount(String str, String str2) {
        synchronized (EVO.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("782de874", new Object[]{str, str2});
            } else if (!isPreInitialized()) {
                ogh.l(TAG, "updateUserAccount方法调用，需要先调用 initialize() 方法初始化SDK。");
            } else {
                if (!TextUtils.equals(n.j().o(), str2)) {
                    ogh.f(TAG, "【登录信息】用户登录信息发生变化。用户ID: " + str2 + "，用户昵称: " + str + "，原用户ID：" + n.j().o() + "，原用户昵称：" + n.j().p());
                    n.j().y(str2);
                    n.j().z(str);
                    fjh fjhVar = new fjh();
                    fjhVar.a(str2);
                    fjhVar.b(str);
                    n.j().g().a(new bj8(EventType.User, fjhVar));
                } else {
                    ogh.f(TAG, "【登录信息】用户登录信息未发生变化。用户ID：" + str2 + ", 用户昵称：" + str);
                }
            }
        }
    }

    public static void activateServerAsync(String str, Map<String, Object> map, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56bc5eea", new Object[]{str, map, obj});
        } else if (n.j().a().y()) {
            activateServerInternal(str, map, obj, false);
        } else {
            ogh.n(TAG, "【服务端实验】EVO.activateServerAsync已禁止使用，调用旧方法执行。");
            UTABTest.activateServer(str, obj);
        }
    }

    private static void activateServerInternal(String str, Map<String, Object> map, Object obj, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71452717", new Object[]{str, map, obj, new Boolean(z)});
            return;
        }
        try {
            long nanoTime = System.nanoTime();
            if (!n.j().a().w()) {
                ogh.n(TAG, "【服务端实验】一休已禁止使用。");
            } else if (TextUtils.isEmpty(str)) {
                ogh.n(TAG, "【服务端实验】添加埋点规则失败，埋点规则不合法。");
            } else {
                if (z) {
                    n.j().k().e(str, map, obj);
                } else {
                    ydt.b(new a(str, map, obj));
                }
                long nanoTime2 = System.nanoTime();
                if (z) {
                    ku0.e(ku0.EXPERIMENT_ACTIVATE_STAT_TYPE_ACTIVATE_SERVER_SYNC, !TextUtils.isEmpty(str), nanoTime2 - nanoTime);
                } else {
                    ku0.e(ku0.EXPERIMENT_ACTIVATE_STAT_TYPE_ACTIVATE_SERVER, !TextUtils.isEmpty(str), nanoTime2 - nanoTime);
                }
                ku0.b(ku0.EXPERIMENT_ACTIVATE_COUNTER, ku0.EXPERIMENT_ACTIVATE_STAT_TYPE_ACTIVATE_SERVER);
            }
        } catch (Throwable th) {
            ku0.j("EVO.activateServerInternal", th);
        }
    }

    public static void activateServerSync(String str, Map<String, Object> map, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("431bb6bf", new Object[]{str, map, obj});
        } else if (n.j().a().y()) {
            activateServerInternal(str, map, obj, true);
        } else {
            ogh.n(TAG, "【服务端实验】EVO.activateServerSync已禁止使用，调用旧方法执行。");
            UTABTest.activateServerSync(str, obj);
        }
    }

    @Deprecated
    public static synchronized void initializeSync(Context context, com.alibaba.ut.abtest.a aVar) {
        synchronized (EVO.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fc432582", new Object[]{context, aVar});
            } else {
                sInitiator.e(context, aVar, true);
            }
        }
    }

    public static boolean isSwitchOpened(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a94046c8", new Object[]{context, str})).booleanValue();
        }
        try {
            Variation variation = activateSync(context, str).getVariation(str);
            boolean equals = variation != null ? "true".equals(variation.getValueAsString(null)) : false;
            ogh.k(TAG, "【运行实验】开关 " + str + " 运行结果：" + equals);
            return equals;
        } catch (Throwable th) {
            ku0.j("EVO.isSwitchOpened", th);
            return false;
        }
    }

    @Deprecated
    private static void preInit(com.alibaba.ut.abtest.a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a51c8336", new Object[]{aVar, new Boolean(z)});
            return;
        }
        try {
            o.L();
            if (aVar.f() != null) {
                n.j().a().L(aVar.f());
            }
            n.j().k().l(z);
            if (z || !n.j().s()) {
                n.j().u(n.j().a().getMethod());
                if (!sau.b()) {
                    rau.b();
                }
                try {
                    p3v.getInstance().registerListener(new buv());
                } catch (Throwable th) {
                    ogh.h(TAG, "UT页面生命周期监听注册失败，请升级ut-analytics>=6.5.8.26。", th);
                    ku0.j("EVO.UTTrackerListenerRegister", th);
                }
                tt6.a();
                n.j().h();
            }
            try {
                MtopMonitor.addHeaderMonitor(new gau());
            } catch (Throwable th2) {
                if (z) {
                    ogh.i(TAG, "初始化MTOP监听失败，不依赖无痕埋点功能请忽略。" + th2.getMessage());
                    return;
                }
                ogh.g(TAG, "初始化MTOP监听失败，不依赖无痕埋点功能请忽略。" + th2.getMessage());
            }
        } catch (Throwable th3) {
            ku0.j("EVO.ABDatabaseInit", th3);
            n.j().a().u(true);
        }
    }

    public static void initBeforeExperimentTask(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("109ddfc4", new Object[]{context, new Boolean(z)});
        } else {
            sInitiator.d(context, z);
        }
    }

    public static VariationSet activateSync(Context context, String str) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VariationSet) ipChange.ipc$dispatch("b13b4d6c", new Object[]{context, str});
        }
        try {
            long nanoTime = System.nanoTime();
            if (!sInitiator.g()) {
                ogh.l(TAG, "activateSync方法调用，需要先调用 UTABTest.initBeforeExperimentTask(context, isMultiProcessEnable) 方法初始化SDK。");
                return EMPTY_VARIATION_SET;
            } else if (!n.j().a().w()) {
                ogh.n(TAG, "【运行实验】一休已禁止使用。");
                return EMPTY_VARIATION_SET;
            } else if (TextUtils.isEmpty(str)) {
                ogh.n(TAG, "【运行实验】开关名传入为空！");
                return EMPTY_VARIATION_SET;
            } else {
                long uptimeMillis = SystemClock.uptimeMillis();
                VariationSet b2 = n.j().k().b(str);
                ogh.e(TAG, "开关 " + str + " 分流耗时: " + (SystemClock.uptimeMillis() - uptimeMillis));
                if (b2 == null) {
                    b2 = EMPTY_VARIATION_SET;
                }
                if (b2.size() <= 0) {
                    z = false;
                }
                ku0.e("switch", z, System.nanoTime() - nanoTime);
                ogh.k(TAG, "【运行实验】featureName=" + str + " cost=" + ((System.nanoTime() - nanoTime) / 1000000) + "ms Result=" + b2.toString());
                ku0.b(ku0.EXPERIMENT_ACTIVATE_COUNTER, "switch");
                return b2;
            }
        } catch (Throwable th) {
            ku0.j("EVO.activateSync.Switch", th);
            return EMPTY_VARIATION_SET;
        }
    }
}
