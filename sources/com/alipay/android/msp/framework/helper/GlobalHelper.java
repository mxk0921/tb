package com.alipay.android.msp.framework.helper;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.alipay.android.app.safepaylogv2.api.StatisticCollector;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorType;
import com.alipay.android.msp.pay.GlobalSdkConstant;
import com.alipay.android.msp.plugin.manager.PhoneCashierMspEngine;
import com.alipay.android.msp.utils.EventLogUtil;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.android.msp.utils.MspContextUtil;
import com.alipay.android.msp.utils.UserLocation;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.device.UTDevice;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class GlobalHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile GlobalHelper h;

    /* renamed from: a  reason: collision with root package name */
    public Context f3620a;
    public String b;
    public String c;
    public String d = "";
    public String e = "";
    public PackageInfo f = null;
    public String g = "";

    public static GlobalHelper getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (GlobalHelper) ipChange.ipc$dispatch("1f54a6e", new Object[0]);
        }
        if (h == null) {
            synchronized (GlobalHelper.class) {
                try {
                    if (h == null) {
                        h = new GlobalHelper();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return h;
    }

    public final boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("41a3854", new Object[]{this})).booleanValue();
        }
        return "com.taobao.taobao".equals(this.d);
    }

    public String getConfigSDKAppId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5150addf", new Object[]{this});
        }
        if (TextUtils.isEmpty(this.g) && !a()) {
            StatisticCollector.addError(StatisticCollector.GLOBAL_AGENT, ErrorType.WARNING, "SDKAppIdEmpty", "");
        }
        LogUtil.record(8, "GlobalHelper:getConfigSDKAppId", "appId=" + this.g);
        return this.g;
    }

    @Deprecated
    public Context getContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this});
        }
        if (this.f3620a == null) {
            if (!GlobalSdkConstant.getSdkType()) {
                this.f3620a = MspContextUtil.getContext();
            }
            LogUtil.record(4, "GlobalHelper:getContext", "mContext=" + this.f3620a);
        }
        return this.f3620a;
    }

    public PackageInfo getPackageInfo() {
        Context context;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PackageInfo) ipChange.ipc$dispatch("4454a4a8", new Object[]{this});
        }
        if (TextUtils.isEmpty(this.d)) {
            return null;
        }
        if (this.f == null && (context = this.f3620a) != null) {
            try {
                this.f = context.getPackageManager().getPackageInfo(this.d, 0);
            } catch (Throwable th) {
                LogUtil.printExceptionStackTrace(th);
            }
        }
        return this.f;
    }

    public String getPackageName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b4fb6b1e", new Object[]{this});
        }
        if (TextUtils.isEmpty(this.d)) {
            return "unknown";
        }
        return this.d;
    }

    public String getPackageVersion() {
        Context context;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bc3cd551", new Object[]{this});
        }
        if (TextUtils.isEmpty(this.d)) {
            return "-1.-1";
        }
        if (TextUtils.isEmpty(this.e) && (context = this.f3620a) != null) {
            try {
                this.e = context.getPackageManager().getPackageInfo(this.d, 64).versionName;
            } catch (PackageManager.NameNotFoundException e) {
                LogUtil.printExceptionStackTrace(e);
            }
        }
        if (TextUtils.isEmpty(this.e)) {
            return "-1.-1";
        }
        return this.e;
    }

    public String getStringById(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("59d6a45", new Object[]{this, context, new Integer(i)});
        }
        if (context == null) {
            return "";
        }
        this.f3620a = context;
        try {
            try {
                return PhoneCashierMspEngine.getMspBase().getResources(null).getString(i);
            } catch (Exception unused) {
                return "";
            }
        } catch (Exception unused2) {
            return context.getString(i);
        }
    }

    public String getUserId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("58ad3b3d", new Object[]{this});
        }
        return this.b;
    }

    public String getUtdid(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8f7eefe9", new Object[]{this, context});
        }
        if (!TextUtils.isEmpty(this.c)) {
            return this.c;
        }
        this.f3620a = context;
        String utdid = UTDevice.getUtdid(context);
        this.c = utdid;
        return utdid;
    }

    public void setUserId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ca419d9", new Object[]{this, str});
        } else {
            this.b = str;
        }
    }

    public void init(Context context) {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
            return;
        }
        try {
            this.f3620a = context.getApplicationContext();
            UserLocation.locationInit(context, false);
            this.d = context.getPackageName();
            LogUtil.record(2, "GlobalHelper::Init", "Initialization complete");
            if (GlobalSdkConstant.getSdkType() && TextUtils.isEmpty(this.g) && !a()) {
                long currentTimeMillis = System.currentTimeMillis();
                Context context2 = this.f3620a;
                if (context2 != null) {
                    this.g = context2.getPackageManager().getApplicationInfo(getPackageName(), 128).metaData.getString("msp_app_id");
                } else {
                    StatisticCollector.addError(StatisticCollector.GLOBAL_AGENT, ErrorType.WARNING, "SDKAppIdLoadFail", "ContextNull");
                }
                long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                if (TextUtils.isEmpty(this.d)) {
                    str = "-";
                } else {
                    str = this.d;
                }
                if (TextUtils.isEmpty(this.g)) {
                    str2 = "-";
                } else {
                    str2 = this.g;
                }
                EventLogUtil.logPayEvent("103624", "appName", str, "appId", str2, "costTime", String.valueOf(currentTimeMillis2));
                LogUtil.record(8, "GlobalHelper:loadAppIdForSDK", "appId=" + this.g + ", cost=" + currentTimeMillis2);
            }
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
    }
}
