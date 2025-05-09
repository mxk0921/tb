package com.huawei.hms.activity;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.text.TextUtils;
import android.view.KeyEvent;
import com.huawei.hms.activity.internal.BusResponseCallback;
import com.huawei.hms.activity.internal.BusResponseResult;
import com.huawei.hms.activity.internal.ForegroundBusResponseMgr;
import com.huawei.hms.activity.internal.ForegroundInnerHeader;
import com.huawei.hms.adapter.AvailableAdapter;
import com.huawei.hms.api.HuaweiApiAvailability;
import com.huawei.hms.common.internal.RequestHeader;
import com.huawei.hms.common.internal.ResponseHeader;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.huawei.hms.support.hianalytics.HiAnalyticsUtil;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.HMSPackageManager;
import com.huawei.hms.utils.IntentUtil;
import com.huawei.hms.utils.JsonUtil;
import com.huawei.hms.utils.UIUtil;
import com.huawei.hms.utils.Util;
import java.lang.ref.WeakReference;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ForegroundBusDelegate implements IBridgeActivityDelegate {
    public static final String HMS_FOREGROUND_REQ_BODY = "HMS_FOREGROUND_REQ_BODY";
    public static final String HMS_FOREGROUND_REQ_HEADER = "HMS_FOREGROUND_REQ_HEADER";
    public static final String HMS_FOREGROUND_REQ_INNER = "HMS_FOREGROUND_REQ_INNER";
    public static final String HMS_FOREGROUND_RESP_HEADER = "HMS_FOREGROUND_RESP_HEADER";
    public static final String INNER_PKG_NAME = "INNER_PACKAGE_NAME";

    /* renamed from: a  reason: collision with root package name */
    private RequestHeader f5238a;
    private String b;
    private ForegroundInnerHeader c = new ForegroundInnerHeader();
    private ResponseHeader d;
    private WeakReference<Activity> e;
    private boolean f;

    private BusResponseCallback b(String str) {
        return ForegroundBusResponseMgr.getInstance().get(str);
    }

    private void c() {
        if (this.f5238a != null) {
            a(HiAnalyticsConstant.HMS_SDK_BASE_ACTIVITY_STARTED);
        }
    }

    private void d() {
        a(HiAnalyticsConstant.HMS_SDK_BASE_START_CORE_ACTIVITY);
    }

    private void e() {
        if (g() == null) {
            HMSLog.e("ForegroundBusDelegate", "checkMinVersion failed, activity must not be null.");
            a(0, "checkMinVersion failed, activity must not be null.");
        } else if (this.f) {
            h();
        } else if (Util.isAvailableLibExist(g().getApplicationContext())) {
            b bVar = new b();
            AvailableAdapter availableAdapter = new AvailableAdapter(this.c.getApkVersion());
            int isHuaweiMobileServicesAvailable = availableAdapter.isHuaweiMobileServicesAvailable(g());
            if (isHuaweiMobileServicesAvailable == 0) {
                bVar.onComplete(isHuaweiMobileServicesAvailable);
            } else if (availableAdapter.isUserResolvableError(isHuaweiMobileServicesAvailable)) {
                a(g(), availableAdapter, bVar);
            } else {
                bVar.onComplete(isHuaweiMobileServicesAvailable);
            }
        } else if (HuaweiApiAvailability.getInstance().isHuaweiMobileServicesAvailable(g().getApplicationContext(), this.c.getApkVersion()) != 0) {
            HMSLog.e("ForegroundBusDelegate", "checkMinVersion failed, and no available lib exists.");
            a(0, "apk version is invalid");
        } else {
            h();
        }
    }

    private void f() {
        Activity g = g();
        if (g != null && !g.isFinishing()) {
            g.finish();
        }
    }

    private Activity g() {
        WeakReference<Activity> weakReference = this.e;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        String str;
        HMSLog.i("ForegroundBusDelegate", "startApkHubActivity");
        Activity g = g();
        if (g == null) {
            HMSLog.e("ForegroundBusDelegate", "startApkHubActivity but activity is null");
            return;
        }
        if (this.f) {
            str = g.getPackageName();
        } else {
            str = HMSPackageManager.getInstance(g.getApplicationContext()).getHMSPackageNameForMultiService();
        }
        if (TextUtils.isEmpty(str)) {
            HMSLog.e("ForegroundBusDelegate", "hmsPackageName is null, Service is invalid.");
            a(0, "hmsPackageName is null, Service is invalid.");
            return;
        }
        Intent intent = new Intent(this.c.getAction());
        intent.putExtra(HMS_FOREGROUND_REQ_BODY, this.b);
        try {
            intent.setPackage(str);
        } catch (IllegalArgumentException unused) {
            HMSLog.e("ForegroundBusDelegate", "IllegalArgumentException when startApkHubActivity intent.setPackage");
        }
        intent.putExtra(BridgeActivity.EXTRA_IS_FULLSCREEN, UIUtil.isActivityFullscreen(g));
        intent.setClassName(str, "com.huawei.hms.core.activity.UiJumpActivity");
        intent.putExtra(HMS_FOREGROUND_REQ_HEADER, this.f5238a.toJson());
        intent.putExtra("intent.extra.hms.core.DELEGATE_NAME", "com.huawei.hms.core.activity.ForegroundBus");
        try {
            b();
            g.startActivityForResult(intent, 431057);
        } catch (ActivityNotFoundException e) {
            HMSLog.e("ForegroundBusDelegate", "Launch sign in Intent failed. hms is probably being updated：", e);
            a(0, "launch bus intent failed");
        }
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public int getRequestCode() {
        return 431057;
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeActivityCreate(Activity activity) {
        if (activity == null) {
            HMSLog.e("ForegroundBusDelegate", "activity is null");
            a(0, "activity is null");
        } else if (activity.isFinishing()) {
            HMSLog.e("ForegroundBusDelegate", "activity is finishing");
            a(0, "activity is finishing");
        } else {
            this.e = new WeakReference<>(activity);
            try {
                Intent intent = activity.getIntent();
                if (intent == null) {
                    a(0, "intent is invalid");
                    return;
                }
                String stringExtra = intent.getStringExtra(HMS_FOREGROUND_REQ_HEADER);
                RequestHeader requestHeader = new RequestHeader();
                this.f5238a = requestHeader;
                if (!requestHeader.fromJson(stringExtra)) {
                    a(0, "header is invalid");
                    return;
                }
                this.b = intent.getStringExtra(HMS_FOREGROUND_REQ_BODY);
                ForegroundInnerHeader foregroundInnerHeader = this.c;
                if (foregroundInnerHeader == null) {
                    a(0, "inner header is invalid");
                    return;
                }
                foregroundInnerHeader.fromJson(intent.getStringExtra(HMS_FOREGROUND_REQ_INNER));
                if (TextUtils.isEmpty(this.f5238a.getApiName())) {
                    a(0, "action is invalid");
                    return;
                }
                a();
                if (!TextUtils.isEmpty(intent.getStringExtra(INNER_PKG_NAME))) {
                    HMSLog.i("ForegroundBusDelegate", "isUseInnerHms: true");
                    this.f = true;
                }
                e();
            } catch (Throwable th) {
                HMSLog.e("ForegroundBusDelegate", "ForegroundBusDelegate getStringExtra error:" + th.getMessage());
                a(0, "ForegroundBusDelegate getStringExtra error:" + th.getMessage());
            }
        }
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeActivityDestroy() {
        c();
        this.e = null;
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public boolean onBridgeActivityResult(int i, int i2, Intent intent) {
        String str;
        if (i != 431057) {
            return false;
        }
        if (intent != null && intent.hasExtra(HMS_FOREGROUND_RESP_HEADER)) {
            try {
                str = intent.getStringExtra(HMS_FOREGROUND_RESP_HEADER);
            } catch (Throwable unused) {
                HMSLog.w("ForegroundBusDelegate", "exception occur, HMS_FOREGROUND_RESP_HEADER get failed.");
                str = "";
            }
            ResponseHeader responseHeader = new ResponseHeader();
            this.d = responseHeader;
            JsonUtil.jsonToEntity(str, responseHeader);
        }
        d();
        BusResponseCallback b2 = b(this.c.getResponseCallbackKey());
        if (b2 == null) {
            a(i2, intent);
            return true;
        }
        BusResponseResult succeedReturn = b2.succeedReturn(this.e.get(), i2, intent);
        if (succeedReturn == null) {
            a(i2, intent);
            return true;
        }
        a(succeedReturn.getCode(), succeedReturn.getIntent());
        return true;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements AvailableAdapter.AvailableCallBack {
        private b() {
        }

        @Override // com.huawei.hms.adapter.AvailableAdapter.AvailableCallBack
        public void onComplete(int i) {
            if (i == 0) {
                ForegroundBusDelegate.this.h();
                return;
            }
            HMSLog.i("ForegroundBusDelegate", "version check failed");
            ForegroundBusDelegate.this.a(0, "apk version is invalid");
        }
    }

    private void b() {
        Map<String, String> mapFromForegroundRequestHeader = HiAnalyticsUtil.getInstance().getMapFromForegroundRequestHeader(this.f5238a);
        mapFromForegroundRequestHeader.put("direction", "req");
        mapFromForegroundRequestHeader.put("version", HiAnalyticsUtil.versionCodeToName(String.valueOf(this.f5238a.getKitSdkVersion())));
        if (g() != null) {
            HiAnalyticsUtil.getInstance().onNewEvent(g().getApplicationContext(), HiAnalyticsConstant.HMS_SDK_BASE_START_CORE_ACTIVITY, mapFromForegroundRequestHeader);
        }
    }

    private void a(int i, Intent intent) {
        HMSLog.i("ForegroundBusDelegate", "succeedReturn");
        Activity g = g();
        if (g != null) {
            g.setResult(i, IntentUtil.modifyIntentBehaviorsSafe(intent));
            f();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, String str) {
        HMSLog.e("ForegroundBusDelegate", str);
        Activity g = g();
        if (g != null) {
            BusResponseCallback b2 = b(this.c.getResponseCallbackKey());
            if (b2 != null) {
                BusResponseResult innerError = b2.innerError(this.e.get(), i, str);
                if (innerError == null) {
                    g.setResult(0);
                } else {
                    g.setResult(innerError.getCode(), IntentUtil.modifyIntentBehaviorsSafe(innerError.getIntent()));
                }
            } else {
                g.setResult(0);
            }
            f();
        }
    }

    private static void a(Activity activity, AvailableAdapter availableAdapter, AvailableAdapter.AvailableCallBack availableCallBack) {
        if (activity == null) {
            HMSLog.i("ForegroundBusDelegate", "null activity, could not start resolution intent");
        }
        availableAdapter.startResolution(activity, availableCallBack);
    }

    private void a() {
        Map<String, String> mapFromForegroundRequestHeader = HiAnalyticsUtil.getInstance().getMapFromForegroundRequestHeader(this.f5238a);
        mapFromForegroundRequestHeader.put("direction", "req");
        mapFromForegroundRequestHeader.put("version", HiAnalyticsUtil.versionCodeToName(String.valueOf(this.f5238a.getKitSdkVersion())));
        if (g() != null) {
            HiAnalyticsUtil.getInstance().onNewEvent(g().getApplicationContext(), HiAnalyticsConstant.HMS_SDK_BASE_ACTIVITY_STARTED, mapFromForegroundRequestHeader);
        }
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeConfigurationChanged() {
    }

    private void a(String str) {
        Map<String, String> mapFromForegroundRequestHeader = HiAnalyticsUtil.getInstance().getMapFromForegroundRequestHeader(this.f5238a);
        mapFromForegroundRequestHeader.put("direction", HiAnalyticsConstant.Direction.RESPONSE);
        mapFromForegroundRequestHeader.put("version", HiAnalyticsUtil.versionCodeToName(String.valueOf(this.f5238a.getKitSdkVersion())));
        ResponseHeader responseHeader = this.d;
        if (responseHeader != null) {
            mapFromForegroundRequestHeader.put("statusCode", String.valueOf(responseHeader.getStatusCode()));
            mapFromForegroundRequestHeader.put("result", String.valueOf(this.d.getErrorCode()));
        }
        if (g() != null) {
            HiAnalyticsUtil.getInstance().onNewEvent(g().getApplicationContext(), str, mapFromForegroundRequestHeader);
        }
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onKeyUp(int i, KeyEvent keyEvent) {
    }
}
