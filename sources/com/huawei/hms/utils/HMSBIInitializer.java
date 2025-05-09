package com.huawei.hms.utils;

import android.content.Context;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.huawei.hianalytics.process.HiAnalyticsConfig;
import com.huawei.hianalytics.process.HiAnalyticsInstance;
import com.huawei.hianalytics.process.HiAnalyticsManager;
import com.huawei.hms.framework.network.grs.GrsApp;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.huawei.hms.framework.network.grs.GrsClient;
import com.huawei.hms.framework.network.grs.IQueryUrlCallBack;
import com.huawei.hms.hatool.HmsHiAnalyticsUtils;
import com.huawei.hms.stats.HianalyticsExist;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.huawei.hms.support.log.HMSLog;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class HMSBIInitializer {
    private static final Object d = new Object();
    private static HMSBIInitializer e;
    private static HiAnalyticsInstance f;

    /* renamed from: a  reason: collision with root package name */
    private final Context f5509a;
    private AtomicBoolean b = new AtomicBoolean(false);
    private boolean c = HianalyticsExist.isHianalyticsExist();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements IQueryUrlCallBack {
        public a() {
        }

        @Override // com.huawei.hms.framework.network.grs.IQueryUrlCallBack
        public void onCallBackFail(int i) {
            HMSLog.e("HMSBIInitializer", "get grs failed, the errorcode is " + i);
            HMSBIInitializer.this.b.set(false);
            com.huawei.hms.stats.a.c().a();
        }

        @Override // com.huawei.hms.framework.network.grs.IQueryUrlCallBack
        public void onCallBackSuccess(String str) {
            if (!TextUtils.isEmpty(str)) {
                if (!HMSBIInitializer.this.c) {
                    HmsHiAnalyticsUtils.init(HMSBIInitializer.this.f5509a, false, false, false, str, "com.huawei.hwid");
                } else {
                    HMSBIInitializer.this.a(str);
                }
                HMSLog.i("HMSBIInitializer", "BI URL acquired successfully");
            }
            HMSBIInitializer.this.b.set(false);
            com.huawei.hms.stats.a.c().b();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b extends AsyncTask<String, Integer, Void> {
        private b() {
        }

        /* renamed from: a */
        public Void doInBackground(String... strArr) {
            HMSBIInitializer.this.b(strArr[0]);
            return null;
        }

        public /* synthetic */ b(HMSBIInitializer hMSBIInitializer, a aVar) {
            this();
        }
    }

    private HMSBIInitializer(Context context) {
        this.f5509a = context;
    }

    public static HMSBIInitializer getInstance(Context context) {
        synchronized (d) {
            try {
                if (e == null && context != null) {
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext != null) {
                        e = new HMSBIInitializer(applicationContext);
                    } else {
                        e = new HMSBIInitializer(context);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return e;
    }

    public HiAnalyticsInstance getAnalyticsInstance() {
        return f;
    }

    public void initBI() {
        boolean z;
        if (!this.c) {
            z = HmsHiAnalyticsUtils.getInitFlag();
        } else {
            z = HiAnalyticsManager.getInitFlag(HiAnalyticsConstant.HA_SERVICE_TAG);
        }
        HMSLog.i("HMSBIInitializer", "Builder->biInitFlag :" + z);
        if (!z && !AnalyticsSwitchHolder.isAnalyticsDisabled(this.f5509a)) {
            HMSLog.i("HMSBIInitializer", "Builder->biInitFlag : start initHaSDK");
            initHaSDK();
        }
    }

    public void initHaSDK() {
        if (this.b.compareAndSet(false, true)) {
            String issueCountryCode = GrsApp.getInstance().getIssueCountryCode(this.f5509a);
            if (!TextUtils.isEmpty(issueCountryCode)) {
                issueCountryCode = issueCountryCode.toUpperCase(Locale.ENGLISH);
            }
            if ("UNKNOWN".equalsIgnoreCase(issueCountryCode) || TextUtils.isEmpty(issueCountryCode)) {
                HMSLog.e("HMSBIInitializer", "Failed to get device issue country");
                this.b.set(false);
                return;
            }
            new b(this, null).execute(issueCountryCode);
        }
    }

    public boolean isInit() {
        if (!this.c) {
            return HmsHiAnalyticsUtils.getInitFlag();
        }
        return HiAnalyticsManager.getInitFlag(HiAnalyticsConstant.HA_SERVICE_TAG);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        HiAnalyticsInstance instanceByTag = HiAnalyticsManager.getInstanceByTag(HiAnalyticsConstant.HA_SERVICE_TAG);
        f = instanceByTag;
        if (instanceByTag != null) {
            instanceByTag.setAppid("com.huawei.hwid");
            return;
        }
        HiAnalyticsConfig build = new HiAnalyticsConfig.Builder().setEnableImei(false).setEnableUDID(false).setEnableSN(false).setCollectURL(str).build();
        HiAnalyticsInstance create = new HiAnalyticsInstance.Builder(this.f5509a).setOperConf(build).setMaintConf(new HiAnalyticsConfig.Builder().setEnableImei(false).setEnableUDID(false).setEnableSN(false).setCollectURL(str).build()).create(HiAnalyticsConstant.HA_SERVICE_TAG);
        f = create;
        if (create != null) {
            create.setAppid("com.huawei.hwid");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str) {
        HMSLog.i("HMSBIInitializer", "Start to query GRS");
        GrsBaseInfo grsBaseInfo = new GrsBaseInfo();
        grsBaseInfo.setIssueCountry(str);
        new GrsClient(this.f5509a, grsBaseInfo).ayncGetGrsUrl("com.huawei.cloud.opensdkhianalytics", "ROOTV2", new a());
    }
}
