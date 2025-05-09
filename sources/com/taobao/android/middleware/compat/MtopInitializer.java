package com.taobao.android.middleware.compat;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.SparseArray;
import com.alibaba.ability.localization.Localization;
import com.alibaba.ability.localization.constants.Language;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.base.TaoBaseService;
import com.taobao.accs.common.Constants;
import com.taobao.android.ab.api.ABGlobal;
import com.taobao.taobao.R;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.mtop.common.MtopStatsListener;
import mtopsdk.mtop.domain.EnvModeEnum;
import mtopsdk.mtop.global.MtopConfig;
import mtopsdk.mtop.global.SwitchConfig;
import mtopsdk.mtop.intf.MtopParamType;
import mtopsdk.mtop.intf.MtopSetting;
import mtopsdk.mtop.intf.MtopUnitStrategy;
import mtopsdk.mtop.util.ErrorConstant;
import tb.j5j;
import tb.j8l;
import tb.pa8;
import tb.s9u;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class MtopInitializer implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String CHANNEL_PROCESS_NAME = "com.taobao.taobao:channel";
    private static final String[] ELEME_DOMAINS;
    private static final String GUIDE_DAILY_DOMAIN = "guide-acs.waptest.taobao.com";
    private static final String GUIDE_ONLINE_DOMAIN = "guide-acs.m.taobao.com";
    private static final String GUIDE_PRE_DOMAIN = "guide-acs.wapa.taobao.com";
    private static final String[] KOUBEI_DOMAINS;
    private static final String MAIN_PROCESS_NAME = "com.taobao.taobao";
    private static final String MTOP_DELAY_INIT = "mtop_delay_init";
    private static final String MTOP_ID_INNER = "INNER";
    private static final String MTOP_ID_SSR = "SSR";
    private static final String MTOP_SITE_INNER = "taobao";
    private static final String MTOP_SITE_SSR = "mtop_ssr";
    private static final String TAG = "mtopsdk.MtopInitializer";
    private static final String[] XIANYU_DOMAINS;
    private static Language currLanguage;
    private static String regId;
    private static final AtomicInteger sAtomicInteger;
    private static final String[] sInstanceIds = {"MTOP_ID_ELEME", "MTOP_ID_XIANYU", "MTOP_ID_KOUBEI"};
    private static final String[] sAccountSites = {"eleme", "xianyu", "koubei"};
    private static final String[] SSR_DOMAINS = {"guide-acs.m.taobao.com", "guide-acs.wapa.taobao.com", "guide-acs.waptest.taobao.com"};
    private static SparseArray<List<String>> sDomains = new SparseArray<>();
    private static final AtomicBoolean sDelayInit = new AtomicBoolean(false);
    private static boolean isChannelProcess = false;
    private static AtomicBoolean initMinStatus = new AtomicBoolean(false);
    private static final BroadcastReceiver receiver = new BroadcastReceiver() { // from class: com.taobao.android.middleware.compat.MtopInitializer.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/middleware/compat/MtopInitializer$1");
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                return;
            }
            try {
                TaoBaseService.ConnectInfo connectInfo = (TaoBaseService.ConnectInfo) intent.getExtras().get(Constants.KEY_CONNECT_INFO);
                if (connectInfo != null && connectInfo.connected && j8l.y(context)) {
                    String p = j8l.p(context);
                    if (!(TextUtils.isEmpty(p) || p.equals(MtopInitializer.access$000()))) {
                        MtopSetting.setParam("INNER", MtopParamType.HEADER, Constants.KEY_X_REGID, p);
                        for (String str : MtopInitializer.access$100()) {
                            MtopSetting.setParam(str, MtopParamType.HEADER, Constants.KEY_X_REGID, p);
                        }
                    }
                }
            } catch (Throwable th) {
                TBSdkLog.e(MtopInitializer.TAG, "receive connect info error", th);
            }
        }
    };

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a implements MtopStatsListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // mtopsdk.mtop.common.MtopStatsListener
        public void onStats(Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3e94fe1e", new Object[]{this, map});
            } else if (map != null) {
                HashMap hashMap = new HashMap();
                hashMap.putAll(map);
                j5j.a().b(map.get("seqNo"), hashMap);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Application f8944a;
        public final /* synthetic */ HashMap b;

        public b(Application application, HashMap hashMap) {
            this.f8944a = application;
            this.b = hashMap;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            s9u.u().w(this.f8944a);
            MtopInitializer.access$200(this.f8944a, this.b);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class c implements MtopStatsListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // mtopsdk.mtop.common.MtopStatsListener
        public void onStats(Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3e94fe1e", new Object[]{this, map});
            } else if (map != null) {
                HashMap hashMap = new HashMap();
                hashMap.putAll(map);
                j5j.a().b(map.get("seqNo"), hashMap);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class d implements Localization.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.alibaba.ability.localization.Localization.a
        public void onChange(Language language, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6c58b74d", new Object[]{this, language, str});
            } else if (MtopInitializer.access$300() == null || language == null || !TextUtils.equals(MtopInitializer.access$300().getLanguage(), language.getLanguage())) {
                MtopInitializer.access$302(language);
                Map<String, String> map = SwitchConfig.errorMappingMsgMap;
                map.put(ErrorConstant.ErrorMappingType.NETWORK_ERROR_MAPPING, Localization.q(R.string.taobao_app_1012_1_30273));
                map.put(ErrorConstant.ErrorMappingType.SERVICE_ERROR_MAPPING, Localization.q(R.string.taobao_app_1012_1_30274));
                map.put(ErrorConstant.ErrorMappingType.FLOW_LIMIT_ERROR_MAPPING, Localization.q(R.string.taobao_app_1012_1_30275));
            }
        }
    }

    static {
        String[] strArr = {"shopping.ele.me", "ppe-shopping.ele.me", "acs-waptest.eleme.test"};
        ELEME_DOMAINS = strArr;
        String[] strArr2 = {"acs.m.goofish.com", "acs.wapa.goofish.com", "acs.wapatest.goofish.com"};
        XIANYU_DOMAINS = strArr2;
        String[] strArr3 = {"acs.m.koubei.com", "acs-pre.koubei.com", MtopUnitStrategy.CENTER_DAILY_DOMAIN};
        KOUBEI_DOMAINS = strArr3;
        AtomicInteger atomicInteger = new AtomicInteger(0);
        sAtomicInteger = atomicInteger;
        sDomains.put(atomicInteger.getAndIncrement(), Arrays.asList(strArr));
        sDomains.put(atomicInteger.getAndIncrement(), Arrays.asList(strArr2));
        sDomains.put(atomicInteger.getAndIncrement(), Arrays.asList(strArr3));
    }

    public static /* synthetic */ String access$000() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7022ea09", new Object[0]);
        }
        return regId;
    }

    public static /* synthetic */ String[] access$100() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("90f5d887", new Object[0]);
        }
        return sInstanceIds;
    }

    public static /* synthetic */ void access$200(Application application, HashMap hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dea024ed", new Object[]{application, hashMap});
        } else {
            initElastic(application, hashMap);
        }
    }

    public static /* synthetic */ Language access$300() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Language) ipChange.ipc$dispatch("42032823", new Object[0]);
        }
        return currLanguage;
    }

    public static /* synthetic */ Language access$302(Language language) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Language) ipChange.ipc$dispatch("d6222a6", new Object[]{language});
        }
        currLanguage = language;
        return language;
    }

    private static void initElastic(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ec86420", new Object[]{application, hashMap});
        } else if (hashMap != null) {
            pa8.d(application);
            String str = (String) hashMap.get("process");
            pa8.e(str);
            if ("com.taobao.taobao".equals(str)) {
                pa8.c().initialize(application);
            }
        }
    }

    private static void initLocalization() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4f1dfd0", new Object[0]);
            return;
        }
        currLanguage = Localization.h();
        if (Localization.o()) {
            Map<String, String> map = SwitchConfig.errorMappingMsgMap;
            map.put(ErrorConstant.ErrorMappingType.NETWORK_ERROR_MAPPING, Localization.q(R.string.taobao_app_1012_1_30273));
            map.put(ErrorConstant.ErrorMappingType.SERVICE_ERROR_MAPPING, Localization.q(R.string.taobao_app_1012_1_30274));
            map.put(ErrorConstant.ErrorMappingType.FLOW_LIMIT_ERROR_MAPPING, Localization.q(R.string.taobao_app_1012_1_30275));
        }
        Localization.a(new d());
    }

    private static void initMtop(Application application, HashMap<String, Object> hashMap, String str, String str2, List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d80ab3f8", new Object[]{application, hashMap, str, str2, list});
        } else {
            initMtop(application, hashMap, str, str2, list, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void init(android.app.Application r6, java.util.HashMap<java.lang.String, java.lang.Object> r7) {
        /*
            r0 = 0
            java.lang.String r1 = "mtopsdk.MtopInitializer"
            java.lang.String r2 = "INNERparse ParamsMap succeed.params="
            com.android.alibaba.ip.runtime.IpChange r3 = com.taobao.android.middleware.compat.MtopInitializer.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x001b
            java.lang.String r1 = "dddb138b"
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r0] = r6
            r6 = 1
            r2[r6] = r7
            r3.ipc$dispatch(r1, r2)
            return
        L_0x001b:
            initMin(r6, r7)
            r3 = 0
            java.lang.String r4 = "checkSessionInvalid"
            java.lang.Object r4 = r7.get(r4)     // Catch: Exception -> 0x005a
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch: Exception -> 0x005a
            boolean r0 = r4.booleanValue()     // Catch: Exception -> 0x005a
            java.lang.String r4 = "sid"
            java.lang.Object r4 = r7.get(r4)     // Catch: Exception -> 0x005a
            java.lang.String r4 = (java.lang.String) r4     // Catch: Exception -> 0x005a
            java.lang.String r5 = "userId"
            java.lang.Object r5 = r7.get(r5)     // Catch: Exception -> 0x0058
            java.lang.String r5 = (java.lang.String) r5     // Catch: Exception -> 0x0058
            mtopsdk.common.util.TBSdkLog$LogEnable r3 = mtopsdk.common.util.TBSdkLog.LogEnable.InfoEnable     // Catch: Exception -> 0x0056
            boolean r3 = mtopsdk.common.util.TBSdkLog.isLogEnable(r3)     // Catch: Exception -> 0x0056
            if (r3 == 0) goto L_0x006d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: Exception -> 0x0056
            r3.<init>(r2)     // Catch: Exception -> 0x0056
            r3.append(r7)     // Catch: Exception -> 0x0056
            java.lang.String r2 = r3.toString()     // Catch: Exception -> 0x0056
            mtopsdk.common.util.TBSdkLog.i(r1, r2)     // Catch: Exception -> 0x0056
            goto L_0x006d
        L_0x0056:
            r3 = r4
            goto L_0x005b
        L_0x0058:
            r5 = r3
            goto L_0x0056
        L_0x005a:
            r5 = r3
        L_0x005b:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "INNERparse ParamsMap error.params="
            r2.<init>(r4)
            r2.append(r7)
            java.lang.String r2 = r2.toString()
            mtopsdk.common.util.TBSdkLog.e(r1, r2)
            r4 = r3
        L_0x006d:
            java.lang.String r1 = "INNER"
            if (r0 == 0) goto L_0x007a
            mtopsdk.mtop.intf.Mtop r0 = mtopsdk.mtop.intf.Mtop.getInstance(r1)
            if (r0 == 0) goto L_0x007a
            r0.registerSessionInfo(r4, r5)
        L_0x007a:
            mtopsdk.mtop.intf.Mtop r0 = mtopsdk.mtop.intf.Mtop.getInstance(r1)
            if (r0 == 0) goto L_0x0083
            r0.setLaunchFirstFrame()
        L_0x0083:
            java.lang.String r0 = "mtop_delay_init"
            boolean r0 = isABFeatureOpen(r6, r0)
            if (r0 != 0) goto L_0x008f
            initDelay(r6, r7)
        L_0x008f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.middleware.compat.MtopInitializer.init(android.app.Application, java.util.HashMap):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0191  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void initMtop(android.app.Application r16, java.util.HashMap<java.lang.String, java.lang.Object> r17, java.lang.String r18, java.lang.String r19, java.util.List<java.lang.String> r20, java.lang.String r21) {
        /*
            Method dump skipped, instructions count: 477
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.middleware.compat.MtopInitializer.initMtop(android.app.Application, java.util.HashMap, java.lang.String, java.lang.String, java.util.List, java.lang.String):void");
    }

    private static boolean isABFeatureOpen(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8fea157a", new Object[]{context, str})).booleanValue();
        }
        try {
            boolean b2 = ABGlobal.b(context, "taobao", "tbspeed", str);
            TBSdkLog.e(TAG, "[ABFeatureOpenStatus]key=" + str + "open=" + (b2 ? 1 : 0));
            return b2;
        } catch (Throwable th) {
            TBSdkLog.e(TAG, "error" + th.toString());
            return false;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:8|(2:10|(1:12))|13|(6:(2:17|(1:19)(0))|20|(1:24)|27|29|30)(0)|31|20|(2:22|24)|27|29|30) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x008c, code lost:
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a1, code lost:
        mtopsdk.common.util.TBSdkLog.e(com.taobao.android.middleware.compat.MtopInitializer.TAG, "init ssr fail" + r7.toString());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void initDelay(android.app.Application r6, java.util.HashMap<java.lang.String, java.lang.Object> r7) {
        /*
            r0 = 0
            r1 = 1
            com.android.alibaba.ip.runtime.IpChange r2 = com.taobao.android.middleware.compat.MtopInitializer.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0015
            java.lang.String r3 = "4a780ace"
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r0] = r6
            r4[r1] = r7
            r2.ipc$dispatch(r3, r4)
            return
        L_0x0015:
            java.util.concurrent.atomic.AtomicBoolean r2 = com.taobao.android.middleware.compat.MtopInitializer.sDelayInit
            boolean r2 = r2.compareAndSet(r0, r1)
            if (r2 == 0) goto L_0x00cf
            java.lang.System.currentTimeMillis()
            boolean r2 = tb.j8l.y(r6)
            if (r2 == 0) goto L_0x003e
            java.lang.String r2 = tb.j8l.p(r6)
            com.taobao.android.middleware.compat.MtopInitializer.regId = r2
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x003e
            java.lang.String r2 = com.taobao.android.middleware.compat.MtopInitializer.regId
            java.lang.String r3 = "INNER"
            java.lang.String r4 = "HEADER"
            java.lang.String r5 = "x-regid"
            mtopsdk.mtop.intf.MtopSetting.setParam(r3, r4, r5, r2)
        L_0x003e:
            tb.fca.c()
            initLocalization()
            java.lang.String[] r2 = com.taobao.android.middleware.compat.MtopInitializer.sInstanceIds
            int r3 = r2.length
            java.lang.String[] r4 = com.taobao.android.middleware.compat.MtopInitializer.sAccountSites
            int r4 = r4.length
            if (r3 != r4) goto L_0x006d
            int r2 = r2.length
            android.util.SparseArray<java.util.List<java.lang.String>> r3 = com.taobao.android.middleware.compat.MtopInitializer.sDomains
            int r3 = r3.size()
            if (r2 != r3) goto L_0x006d
        L_0x0055:
            java.lang.String[] r2 = com.taobao.android.middleware.compat.MtopInitializer.sInstanceIds
            int r3 = r2.length
            if (r0 >= r3) goto L_0x006d
            r2 = r2[r0]
            java.lang.String[] r3 = com.taobao.android.middleware.compat.MtopInitializer.sAccountSites
            r3 = r3[r0]
            android.util.SparseArray<java.util.List<java.lang.String>> r4 = com.taobao.android.middleware.compat.MtopInitializer.sDomains
            java.lang.Object r4 = r4.get(r0)
            java.util.List r4 = (java.util.List) r4
            initMtop(r6, r7, r2, r3, r4)
            int r0 = r0 + r1
            goto L_0x0055
        L_0x006d:
            tb.h7j r0 = new tb.h7j     // Catch: all -> 0x008c
            r0.<init>()     // Catch: all -> 0x008c
            tb.zeq.d(r0)     // Catch: all -> 0x008c
            android.content.Context r0 = r6.getApplicationContext()     // Catch: all -> 0x008c
            tb.zeq.c(r0)     // Catch: all -> 0x008c
            java.util.HashMap r0 = tb.zeq.b()     // Catch: all -> 0x008c
            if (r0 == 0) goto L_0x008e
            int r1 = r0.size()     // Catch: all -> 0x008c
            if (r1 <= 0) goto L_0x008e
            tb.ggq.e(r6, r0)     // Catch: all -> 0x008c
            goto L_0x008e
        L_0x008c:
            r7 = move-exception
            goto L_0x00a1
        L_0x008e:
            java.lang.String r2 = "SSR"
            java.lang.String r3 = "mtop_ssr"
            java.lang.String[] r0 = com.taobao.android.middleware.compat.MtopInitializer.SSR_DOMAINS     // Catch: all -> 0x008c
            java.util.List r4 = java.util.Arrays.asList(r0)     // Catch: all -> 0x008c
            java.lang.String r5 = "SSR"
            r0 = r6
            r1 = r7
            initMtop(r0, r1, r2, r3, r4, r5)     // Catch: all -> 0x008c
            goto L_0x00ba
        L_0x00a1:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "init ssr fail"
            r0.<init>(r1)
            java.lang.String r7 = r7.toString()
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            java.lang.String r0 = "mtopsdk.MtopInitializer"
            mtopsdk.common.util.TBSdkLog.e(r0, r7)
        L_0x00ba:
            android.util.SparseArray<java.util.List<java.lang.String>> r7 = com.taobao.android.middleware.compat.MtopInitializer.sDomains
            r7.clear()
            android.content.IntentFilter r7 = new android.content.IntentFilter
            r7.<init>()
            java.lang.String r0 = "com.taobao.accs.intent.action.CONNECTINFO"
            r7.addAction(r0)
            android.content.BroadcastReceiver r0 = com.taobao.android.middleware.compat.MtopInitializer.receiver
            r6.registerReceiver(r0, r7)
        L_0x00cf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.middleware.compat.MtopInitializer.initDelay(android.app.Application, java.util.HashMap):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void initMin(android.app.Application r13, java.util.HashMap<java.lang.String, java.lang.Object> r14) {
        /*
            Method dump skipped, instructions count: 489
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.middleware.compat.MtopInitializer.initMin(android.app.Application, java.util.HashMap):void");
    }

    private static void setConfigParams(MtopConfig mtopConfig, int i, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abd6ed63", new Object[]{mtopConfig, new Integer(i), str, str2});
            return;
        }
        if (i == 0) {
            mtopConfig.envMode = EnvModeEnum.ONLINE;
        } else if (i == 1) {
            mtopConfig.envMode = EnvModeEnum.PREPARE;
        } else if (i == 2) {
            mtopConfig.envMode = EnvModeEnum.TEST;
        } else if (i == 3) {
            mtopConfig.envMode = EnvModeEnum.TEST_SANDBOX;
            if (!TextUtils.isEmpty(str)) {
                mtopConfig.registerMtopSdkProperty("mtopsdk.tb_eagleeyex_scm_project", str);
            }
        }
        mtopConfig.ttid = str2;
    }
}
