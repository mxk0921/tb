package com.taobao.android.editionswitcher;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.ability.localization.Localization;
import com.alibaba.ability.localization.LocalizationManager;
import com.alibaba.poplayer.PopLayer;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.address.wrapper.weex.WXAddressModule2;
import com.taobao.android.editionswitcher.api.EditionApi;
import com.taobao.android.editionswitcher.request.HomeLocationResult;
import com.taobao.android.editionswitcher.request.HomeLocationRet;
import com.taobao.android.revisionswitch.TBRevisionSwitchManager;
import com.taobao.location.common.TBLocationDTO;
import com.taobao.login4android.api.Login;
import com.taobao.statistic.TBS;
import com.taobao.tao.log.TLog;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.c21;
import tb.nbq;
import tb.o78;
import tb.r0j;
import tb.r4p;
import tb.r78;
import tb.s9m;
import tb.sa8;
import tb.t2o;
import tb.t7l;
import tb.ta8;
import tb.tza;
import tb.unr;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class LocationCallBack implements unr {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION_IP_BLACKLIST_CHECK = "com.alibaba.edition.action.ACTION_IP_BLACKLIST_CHECK";
    public static final String ELDER_HOME = "elderHome";
    public static final String ORIGIN_ELDER_HOME = "originElderHome";

    /* renamed from: a  reason: collision with root package name */
    public IRemoteBaseListener f7603a;
    public final WeakReference<Context> b;
    public final String c;
    public volatile boolean d = false;
    public final a e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class ColdStartI8nBlacklistReceiver extends BroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final I18nBlacklistHandler f7606a;

        static {
            t2o.a(456130579);
        }

        public ColdStartI8nBlacklistReceiver(I18nBlacklistHandler i18nBlacklistHandler) {
            this.f7606a = i18nBlacklistHandler;
        }

        public static /* synthetic */ Object ipc$super(ColdStartI8nBlacklistReceiver coldStartI8nBlacklistReceiver, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/editionswitcher/LocationCallBack$ColdStartI8nBlacklistReceiver");
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                return;
            }
            I18nBlacklistHandler i18nBlacklistHandler = this.f7606a;
            if (i18nBlacklistHandler != null) {
                i18nBlacklistHandler.a();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class ColdStartPoplayerDoneReceiver extends BroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final a f7607a;

        static {
            t2o.a(456130580);
        }

        public ColdStartPoplayerDoneReceiver(a aVar) {
            this.f7607a = aVar;
        }

        public static /* synthetic */ Object ipc$super(ColdStartPoplayerDoneReceiver coldStartPoplayerDoneReceiver, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/editionswitcher/LocationCallBack$ColdStartPoplayerDoneReceiver");
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                return;
            }
            a aVar = this.f7607a;
            if (aVar != null) {
                aVar.e();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class I18nBlacklistHandler extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(456130581);
        }

        public I18nBlacklistHandler(Context context, String str) {
            super(Looper.getMainLooper());
            if ("coldStart".equals(str)) {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction(LocationCallBack.ACTION_IP_BLACKLIST_CHECK);
                LocalBroadcastManager.getInstance(context).registerReceiver(new ColdStartI8nBlacklistReceiver(this), intentFilter);
            }
        }

        public static /* synthetic */ Object ipc$super(I18nBlacklistHandler i18nBlacklistHandler, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/editionswitcher/LocationCallBack$I18nBlacklistHandler");
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("14313f3b", new Object[]{this});
            } else if (Localization.p()) {
                TLog.loge("EditionSwitcher", "i18nboarding request checkBlack isSimplifiedChinese");
            } else {
                HashMap hashMap = new HashMap();
                hashMap.put("source", "others");
                hashMap.put("userId", Login.getUserId());
                new EditionApi().f(hashMap, new IRemoteBaseListener() { // from class: com.taobao.android.editionswitcher.LocationCallBack.I18nBlacklistHandler.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.tao.remotebusiness.IRemoteListener
                    public void onError(int i, MtopResponse mtopResponse, Object obj) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                            return;
                        }
                        r0j.c(mtopResponse);
                        TLog.loge("EditionSwitcher", "i18nboarding request checkBlack exceptione");
                    }

                    @Override // com.taobao.tao.remotebusiness.IRemoteListener
                    public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                            return;
                        }
                        try {
                            HomeLocationResult homeLocationResult = ((HomeLocationRet) baseOutDo).data;
                            if (homeLocationResult != null && homeLocationResult.i18nBlackIp && Localization.o()) {
                                TLog.loge("EditionSwitcher", "i18nboarding request checkBlack show");
                                com.taobao.android.editionswitcher.boarding.a.d();
                            }
                        } catch (Exception e) {
                            TLog.loge("EditionSwitcher", "i18nboarding request checkBlack exception" + e);
                        }
                    }

                    @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
                    public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                            return;
                        }
                        r0j.c(mtopResponse);
                        TLog.loge("EditionSwitcher", "i18nboarding request checkBlack onSystemFailure");
                    }
                });
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final String f7608a;
        public final ColdStartPoplayerDoneReceiver b;
        public Runnable c;
        public boolean d;
        public final Context e;

        /* compiled from: Taobao */
        /* renamed from: com.taobao.android.editionswitcher.LocationCallBack$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class RunnableC0406a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Runnable f7609a;

            public RunnableC0406a(Runnable runnable) {
                this.f7609a = runnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                a.a(a.this, this.f7609a);
                a.b(a.this);
            }
        }

        static {
            t2o.a(456130583);
        }

        public a(Context context, String str) {
            super(Looper.getMainLooper());
            this.f7608a = str;
            this.e = context;
            if ("coldStart".equals(str)) {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction(PopLayer.ACTION_FRAGMENT_SWITCH);
                ColdStartPoplayerDoneReceiver coldStartPoplayerDoneReceiver = new ColdStartPoplayerDoneReceiver(this);
                this.b = coldStartPoplayerDoneReceiver;
                LocalBroadcastManager.getInstance(context).registerReceiver(coldStartPoplayerDoneReceiver, intentFilter);
            }
        }

        public static /* synthetic */ Runnable a(a aVar, Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Runnable) ipChange.ipc$dispatch("5089af91", new Object[]{aVar, runnable});
            }
            aVar.c = runnable;
            return runnable;
        }

        public static /* synthetic */ void b(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("47157a46", new Object[]{aVar});
            } else {
                aVar.d();
            }
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/editionswitcher/LocationCallBack$PoplayerHandler");
        }

        public void c(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("291ada1a", new Object[]{this, runnable});
            } else if ("coldStart".equals(this.f7608a)) {
                post(new RunnableC0406a(runnable));
            } else {
                post(runnable);
            }
        }

        public final void d() {
            Runnable runnable;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9076f49a", new Object[]{this});
            } else if (this.d && (runnable = this.c) != null) {
                postDelayed(runnable, 100L);
                this.d = false;
                this.c = null;
                LocalBroadcastManager.getInstance(this.e).unregisterReceiver(this.b);
            }
        }

        public void e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c31e7cc8", new Object[]{this});
                return;
            }
            this.d = true;
            d();
        }
    }

    static {
        t2o.a(456130575);
        t2o.a(756023314);
    }

    public LocationCallBack(Context context, String str) {
        this.b = new WeakReference<>(context);
        this.e = new a(context, str);
        new I18nBlacklistHandler(context, str);
        this.c = str;
    }

    public static /* synthetic */ IRemoteBaseListener a(LocationCallBack locationCallBack, IRemoteBaseListener iRemoteBaseListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IRemoteBaseListener) ipChange.ipc$dispatch("7b511913", new Object[]{locationCallBack, iRemoteBaseListener});
        }
        locationCallBack.f7603a = iRemoteBaseListener;
        return iRemoteBaseListener;
    }

    public static /* synthetic */ a b(LocationCallBack locationCallBack) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("9c2cd5b8", new Object[]{locationCallBack});
        }
        return locationCallBack.e;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0085 A[Catch: all -> 0x0027, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0009, B:6:0x000f, B:11:0x002c, B:13:0x0034, B:16:0x0039, B:18:0x0067, B:20:0x0072, B:22:0x0076, B:25:0x007c, B:28:0x0085), top: B:36:0x0009 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static synchronized boolean c(android.content.Context r17, java.lang.String r18, com.taobao.android.editionswitcher.OvsPopExt r19) {
        /*
            r0 = r17
            r1 = r18
            r2 = 1
            r3 = 0
            java.lang.Class<com.taobao.android.editionswitcher.LocationCallBack> r4 = com.taobao.android.editionswitcher.LocationCallBack.class
            monitor-enter(r4)
            com.android.alibaba.ip.runtime.IpChange r5 = com.taobao.android.editionswitcher.LocationCallBack.$ipChange     // Catch: all -> 0x0027
            boolean r6 = r5 instanceof com.android.alibaba.ip.runtime.IpChange     // Catch: all -> 0x0027
            if (r6 == 0) goto L_0x002a
            java.lang.String r6 = "52706766"
            r7 = 3
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch: all -> 0x0027
            r7[r3] = r0     // Catch: all -> 0x0027
            r7[r2] = r1     // Catch: all -> 0x0027
            r0 = 2
            r7[r0] = r19     // Catch: all -> 0x0027
            java.lang.Object r0 = r5.ipc$dispatch(r6, r7)     // Catch: all -> 0x0027
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: all -> 0x0027
            boolean r0 = r0.booleanValue()     // Catch: all -> 0x0027
            monitor-exit(r4)
            return r0
        L_0x0027:
            r0 = move-exception
            goto L_0x00b5
        L_0x002a:
            if (r19 != 0) goto L_0x0032
            com.taobao.android.editionswitcher.OvsPopExt r5 = new com.taobao.android.editionswitcher.OvsPopExt     // Catch: all -> 0x0027
            r5.<init>()     // Catch: all -> 0x0027
            goto L_0x0034
        L_0x0032:
            r5 = r19
        L_0x0034:
            int r6 = r5.ovsExpTime     // Catch: all -> 0x0027
            if (r6 > 0) goto L_0x0039
            r6 = 7
        L_0x0039:
            int r7 = r5.ovsExpDaysCount     // Catch: all -> 0x0027
            int r7 = java.lang.Math.max(r7, r2)     // Catch: all -> 0x0027
            int r5 = r5.ovsExpTotalCount     // Catch: all -> 0x0027
            int r5 = java.lang.Math.max(r5, r2)     // Catch: all -> 0x0027
            com.taobao.android.editionswitcher.SwitcheFatigue r8 = tb.o78.k(r17, r18)     // Catch: all -> 0x0027
            long r9 = java.lang.System.currentTimeMillis()     // Catch: all -> 0x0027
            r11 = 28800000(0x1b77400, double:1.42290906E-316)
            long r13 = r9 + r11
            r15 = 86400000(0x5265c00, double:4.2687272E-316)
            long r13 = r13 / r15
            int r14 = (int) r13     // Catch: all -> 0x0027
            long r2 = r8.lastTime     // Catch: all -> 0x0027
            long r2 = r2 + r11
            long r2 = r2 / r15
            int r3 = (int) r2     // Catch: all -> 0x0027
            long r11 = (long) r14     // Catch: all -> 0x0027
            r2 = r14
            long r13 = r8.startDay     // Catch: all -> 0x0027
            long r13 = r11 - r13
            long r0 = (long) r6     // Catch: all -> 0x0027
            int r6 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r6 < 0) goto L_0x0072
            r8.startDay = r11     // Catch: all -> 0x0027
            r8.lastTime = r9     // Catch: all -> 0x0027
            r0 = 0
            r8.daysCount = r0     // Catch: all -> 0x0027
            r8.totalCount = r0     // Catch: all -> 0x0027
        L_0x0070:
            r0 = 1
            goto L_0x0083
        L_0x0072:
            int r0 = r8.totalCount     // Catch: all -> 0x0027
            if (r0 >= r5) goto L_0x0082
            int r0 = r8.daysCount     // Catch: all -> 0x0027
            if (r0 >= r7) goto L_0x0082
            if (r2 <= r3) goto L_0x0070
            r0 = 0
            r8.daysCount = r0     // Catch: all -> 0x0027
            r8.lastTime = r9     // Catch: all -> 0x0027
            goto L_0x0070
        L_0x0082:
            r0 = 0
        L_0x0083:
            if (r0 == 0) goto L_0x00b3
            int r1 = r8.daysCount     // Catch: all -> 0x0027
            r2 = 1
            int r1 = r1 + r2
            r8.daysCount = r1     // Catch: all -> 0x0027
            int r1 = r8.totalCount     // Catch: all -> 0x0027
            int r1 = r1 + r2
            r8.totalCount = r1     // Catch: all -> 0x0027
            r1 = r17
            r2 = r18
            tb.o78.D(r1, r2, r8)     // Catch: all -> 0x0027
            java.lang.String r1 = "Page_Home"
            java.lang.String r2 = "checkFatigue"
            int r3 = r8.totalCount     // Catch: all -> 0x0027
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: all -> 0x0027
            int r5 = r8.daysCount     // Catch: all -> 0x0027
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: all -> 0x0027
            r6 = 2101(0x835, float:2.944E-42)
            com.taobao.statistic.TBS.Ext.commitEvent(r1, r6, r2, r3, r5)     // Catch: all -> 0x0027
            boolean r1 = com.taobao.android.editionswitcher.SwitcheFatigue.forceMute     // Catch: all -> 0x0027
            if (r1 == 0) goto L_0x00b3
            monitor-exit(r4)
            r0 = 0
            return r0
        L_0x00b3:
            monitor-exit(r4)
            return r0
        L_0x00b5:
            monitor-exit(r4)     // Catch: all -> 0x0027
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.editionswitcher.LocationCallBack.c(android.content.Context, java.lang.String, com.taobao.android.editionswitcher.OvsPopExt):boolean");
    }

    @Override // tb.unr
    public void onLocationChanged(TBLocationDTO tBLocationDTO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("240b6877", new Object[]{this, tBLocationDTO});
        } else if (!this.d && tBLocationDTO != null) {
            this.d = true;
            final Context context = this.b.get();
            if (context != null) {
                HashMap hashMap = new HashMap();
                if (tBLocationDTO.isNavSuccess()) {
                    o78.z(context, o78.PREF_KEY_LOCATION_AREA, tBLocationDTO.getAreaName());
                    TLog.loge(o78.TAG, "EditionPositionSwitcher 定位成功");
                    hashMap.put("provinceCode", tBLocationDTO.getProvinceCode());
                    hashMap.put(WXAddressModule2.PLUGIN_NAME, tBLocationDTO.getAddress());
                    hashMap.put(r4p.KEY_CITY_CODE, tBLocationDTO.getCityCode());
                    hashMap.put("latitude", tBLocationDTO.getLatitude());
                    hashMap.put("longitude", tBLocationDTO.getLongitude());
                    hashMap.put(r4p.KEY_COUNTRY_CODE, tBLocationDTO.getAreaCode());
                } else {
                    TLog.loge(o78.TAG, "EditionPositionSwitcher 定位失败");
                    r0j.b(tBLocationDTO);
                }
                hashMap.put("userId", Login.getOldUserId());
                hashMap.put("source", this.c);
                this.f7603a = new IRemoteBaseListener() { // from class: com.taobao.android.editionswitcher.LocationCallBack.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    /* compiled from: Taobao */
                    /* renamed from: com.taobao.android.editionswitcher.LocationCallBack$1$a */
                    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
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
                            sa8.c(context);
                            Log.e("lx", "OldinvitedElder");
                        }
                    }

                    /* compiled from: Taobao */
                    /* renamed from: com.taobao.android.editionswitcher.LocationCallBack$1$b */
                    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
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
                            sa8.b(context);
                            Log.e("lx", "OldinvitedElder");
                        }
                    }

                    @Override // com.taobao.tao.remotebusiness.IRemoteListener
                    public void onError(int i, MtopResponse mtopResponse, Object obj) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                            return;
                        }
                        r0j.c(mtopResponse);
                        TLog.loge(o78.TAG, "mtop.taobao.wireless.home.location onFailure");
                        TLog.loge("EditionSwitcher", "i18nboarding location request onFailure");
                        LocationCallBack.a(LocationCallBack.this, null);
                        r78.b().a(null, new t7l(r78.LOCATION_REQUEST_ERROR));
                    }

                    @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
                    public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                            return;
                        }
                        r0j.c(mtopResponse);
                        TLog.loge(o78.TAG, "mtop.taobao.wireless.home.location onSystemFailure");
                        TLog.loge("EditionSwitcher", "i18nboarding location request onSystemFailure");
                        LocationCallBack.a(LocationCallBack.this, null);
                        r78.b().a(null, new t7l(r78.LOCATION_REQUEST_ERROR));
                    }

                    @Override // com.taobao.tao.remotebusiness.IRemoteListener
                    public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                        Exception e;
                        String str;
                        String str2;
                        PositionInfo i2;
                        String str3;
                        String str4;
                        String str5;
                        String str6;
                        String str7;
                        String str8 = r78.LOCATION_REQUEST_SUCCESS;
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                            return;
                        }
                        try {
                            HomeLocationResult homeLocationResult = ((HomeLocationRet) baseOutDo).data;
                            if (!homeLocationResult.i18nBlackIp || !Localization.o()) {
                                TLog.loge("EditionSwitcher", "i18nboarding location request success target edition: " + homeLocationResult.editionCode);
                                LocationCallBack.a(LocationCallBack.this, null);
                                o78.E();
                                o78.G(context, homeLocationResult);
                                r78.b().a(null, new t7l(str8));
                                TLog.loge("Page_Home", o78.TAG, homeLocationResult.editionCode + "通知location接口返回");
                                context.sendBroadcast(new Intent(o78.ACTION_LOCATION_RECEIVE));
                                TLog.loge(o78.TAG, "发送位置接口返回广播");
                                Map<String, String> map = homeLocationResult.yixiuTrack;
                                if (!(map == null || (str7 = map.get("elderHome")) == null || !str7.contains("_"))) {
                                    String[] split = str7.split("_");
                                    if (split.length == 2) {
                                        nbq.a(s9m.LPM_BIZ_CODE, "elderHome", split[1], split[0]);
                                    }
                                }
                                if ("1".equals(homeLocationResult.elderHome)) {
                                    str = "1";
                                } else {
                                    str = "0";
                                }
                                ta8.a().i(str);
                                if ("OLD".equals(o78.i(context).editionCode)) {
                                    HashMap hashMap2 = new HashMap();
                                    hashMap2.put("elderHome", str);
                                    str2 = "i18nboarding check boarding mark timestamp: ";
                                    TBRevisionSwitchManager.c().l(hashMap2, false, 0);
                                } else {
                                    str2 = "i18nboarding check boarding mark timestamp: ";
                                }
                                HashMap hashMap3 = new HashMap();
                                hashMap3.put(LocationCallBack.ORIGIN_ELDER_HOME, str);
                                TBRevisionSwitchManager.c().l(hashMap3, false, 0);
                                Map<String, String> map2 = homeLocationResult.elderTags;
                                if (map2 == null) {
                                    map2 = Collections.emptyMap();
                                }
                                try {
                                    TBRevisionSwitchManager.c().l(map2, true, 0);
                                    ta8.a().f(map2);
                                    TLog.loge("Page_Home", o78.TAG, "elderHomeForLocation=" + homeLocationResult.elderHome + "elderTags=" + map2.get("evo_is_large_font"));
                                    i2 = o78.i(context);
                                    str3 = i2.editionCode;
                                    str4 = homeLocationResult.editionCode;
                                    if (o78.o(str4)) {
                                        Locale d = LocalizationManager.INSTANCE.d();
                                        str6 = "Page_Home";
                                        StringBuilder sb = new StringBuilder();
                                        str5 = "i18nboarding location finish write I18N_BOARDING_API_COMPENSATION : ";
                                        sb.append(d.getLanguage());
                                        sb.append("-");
                                        sb.append(d.getCountry());
                                        String sb2 = sb.toString();
                                        TBS.Ext.commitEvent("Page_Home", 2101, "htao_location", "", "", "target_site=" + str4 + ",system_lang=" + sb2 + ",isFirstLaunch=" + c21.g().getBoolean("isFirstLaunch", false) + ",isFirstInstall=" + c21.g().getBoolean("isFullNewInstall", false) + ",installType=" + c21.g().getString("installType", ""));
                                    } else {
                                        str6 = "Page_Home";
                                        str5 = "i18nboarding location finish write I18N_BOARDING_API_COMPENSATION : ";
                                    }
                                } catch (Exception e2) {
                                    e = e2;
                                    str8 = "EditionSwitcher";
                                }
                                try {
                                    if (!TextUtils.equals(str4, str3)) {
                                        if (!TextUtils.equals(o78.CHINA_MAINLAND, str3) && !TextUtils.equals(str4, o78.CHINA_MAINLAND) && (TextUtils.equals(o78.CHINA_MAINLAND, i2.countryCode) || TextUtils.equals(o78.CHINA_MAINLAND, homeLocationResult.countryId))) {
                                            TLog.loge(o78.TAG, str3 + " " + str4 + " 不能直接互切");
                                            r78.b().a(null, new t7l(str8));
                                        } else if (TextUtils.equals("OLD", str4) && (TextUtils.isEmpty(homeLocationResult.oldDialogTitle) || TextUtils.isEmpty(homeLocationResult.oldDialogSubTitle) || TextUtils.isEmpty(homeLocationResult.oldDialogContentImg))) {
                                        } else {
                                            if (TextUtils.equals("OLD", str4) && "1".equals(str)) {
                                                LocationCallBack.b(LocationCallBack.this).c(new a());
                                            } else if (Localization.o() || !LocationCallBack.c(context, str4, homeLocationResult.ovsPopExt)) {
                                                TLog.loge("EditionSwitcher", "i18nboarding location request success fatigue hit once a week");
                                                TLog.loge(o78.TAG, str4 + "一周内提示过了");
                                            } else {
                                                long parseLong = Long.parseLong(tza.d(EditionApi.f7610a, "0"));
                                                if (0 == parseLong) {
                                                    TLog.loge("EditionSwitcher", str5 + homeLocationResult.editionCode);
                                                    tza.f(EditionApi.b, homeLocationResult.editionCode);
                                                }
                                                TLog.loge(o78.TAG, str2 + parseLong);
                                                if (System.currentTimeMillis() >= EditionApi.c + parseLong || !com.taobao.android.editionswitcher.boarding.a.c(homeLocationResult.editionCode)) {
                                                    TLog.loge(o78.TAG, "i18nboarding boarding mark timeout, run history path");
                                                    OvsPopExt ovsPopExt = homeLocationResult.ovsPopExt;
                                                    if (ovsPopExt == null || 2 != ovsPopExt.ovsRemindKind || !o78.o(homeLocationResult.editionCode)) {
                                                        TLog.loge(o78.TAG, str4 + "通知出现弹窗");
                                                        context.sendBroadcast(new Intent(o78.ACTION_LOCATION_CHANGED));
                                                        r78.b().a(null, new t7l(r78.LOCATION_CHANGED));
                                                        TLog.loge(o78.TAG, "发送位置变化广播");
                                                        return;
                                                    }
                                                    TBS.Ext.commitEvent("Page_Home", 2101, "htao_button-areaauto-confirm", null, null, "area=" + o78.c() + ",page_version=" + o78.i(context).editionCode + ",option=" + str4);
                                                    o78.I(context, homeLocationResult.editionCode, o78.SWITCH_TYPE_FORCE);
                                                    return;
                                                }
                                                TBS.Ext.commitEvent(str6, 2201, "htao_willshow-multiLangPop");
                                                String str9 = EditionApi.d;
                                                TBS.Ext.commitEvent(str9, 2101, "investigate", "showI18nGuildDialog-1", (System.currentTimeMillis() - parseLong) + "");
                                                com.taobao.android.editionswitcher.boarding.a.e(homeLocationResult.editionCode);
                                            }
                                        }
                                    } else if (TextUtils.equals(o78.CHINA_MAINLAND, str4) && "1".equals(homeLocationResult.invitedElder) && !ta8.d()) {
                                        LocationCallBack.b(LocationCallBack.this).c(new b());
                                    }
                                } catch (Exception e3) {
                                    e = e3;
                                    TLog.loge(str8, "location request suceess exception : " + e);
                                }
                            } else {
                                com.taobao.android.editionswitcher.boarding.a.d();
                            }
                        } catch (Exception e4) {
                            e = e4;
                            str8 = "EditionSwitcher";
                        }
                    }
                };
                TLog.loge("EditionSwitcher", "i18nboarding location request start...");
                new EditionApi().f(hashMap, this.f7603a);
            }
        }
    }
}
