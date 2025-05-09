package com.huawei.hms.push.plugin.notification;

import android.app.Activity;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Looper;
import com.alipay.security.mobile.cache.AuthenticatorCache;
import com.huawei.hms.aaid.constant.ErrorEnum;
import com.huawei.hms.aaid.task.PushClientBuilder;
import com.huawei.hms.aaid.utils.PushPreferences;
import com.huawei.hms.api.Api;
import com.huawei.hms.api.HuaweiApiAvailability;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.HuaweiApi;
import com.huawei.hms.common.internal.AbstractClientBuilder;
import com.huawei.hms.common.internal.Preconditions;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.push.utils.PushBiUtil;
import com.huawei.hms.support.api.entity.push.NotificationEnableReq;
import com.huawei.hms.support.log.HMSLog;
import tb.fdt;
import tb.rft;
import tb.tct;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class HmsNotificationManagerEx {

    /* renamed from: a  reason: collision with root package name */
    private HuaweiApi<Api.ApiOptions.NoOptions> f5450a;
    private Context b;

    private HmsNotificationManagerEx(Activity activity) {
        Preconditions.checkNotNull(activity);
        this.b = activity;
        HuaweiApi<Api.ApiOptions.NoOptions> huaweiApi = new HuaweiApi<>((Activity) this.b, (Api<Api.ApiOptions>) new Api(HuaweiApiAvailability.HMS_API_NAME_PUSH), (Api.ApiOptions) null, (AbstractClientBuilder) new PushClientBuilder());
        this.f5450a = huaweiApi;
        huaweiApi.setKitSdkVersion(61000300);
    }

    private tct<NotificationStatus> a() {
        boolean areNotificationsEnabled;
        if (Looper.getMainLooper() == Looper.myLooper()) {
            return a(ErrorEnum.ERROR_MAIN_THREAD.toApiException());
        }
        if (!a.a()) {
            HMSLog.e("HmsNotificationManagerEx", "operation not supported on device with EMUI lower than 10");
            return a(ErrorEnum.ERROR_OPERATION_NOT_SUPPORTED.toApiException());
        }
        areNotificationsEnabled = ((NotificationManager) this.b.getSystemService(RemoteMessageConst.NOTIFICATION)).areNotificationsEnabled();
        if (areNotificationsEnabled) {
            HMSLog.e("HmsNotificationManagerEx", "App already enabled notification");
            return a(ErrorEnum.ERROR_NOTIFICATION_ENABLED.toApiException());
        }
        long j = new PushPreferences(this.b, "hwpush_local_config").getLong("notification_request_time");
        if (j <= 0 || System.currentTimeMillis() - j >= AuthenticatorCache.MAX_CACHE_TIME) {
            String reportEntry = PushBiUtil.reportEntry(this.b, "push.enableNotification");
            try {
                NotificationEnableReq notificationEnableReq = new NotificationEnableReq();
                notificationEnableReq.setPkgName(this.b.getPackageName());
                tct doWrite = this.f5450a.doWrite(new b("push.enableNotification", notificationEnableReq, this.b, reportEntry));
                rft.a(doWrite);
                return doWrite;
            } catch (Exception e) {
                if (e.getCause() instanceof ApiException) {
                    ApiException apiException = (ApiException) e.getCause();
                    PushBiUtil.reportExit(this.b, "push.enableNotification", reportEntry, apiException.getStatusCode());
                    return a(apiException);
                }
                Context context = this.b;
                ErrorEnum errorEnum = ErrorEnum.ERROR_INTERNAL_ERROR;
                PushBiUtil.reportExit(context, "push.enableNotification", reportEntry, errorEnum);
                return a(errorEnum.toApiException());
            }
        } else {
            HMSLog.e("HmsNotificationManagerEx", "the frequency is too high");
            return a(ErrorEnum.ERROR_OVER_FLOW_CONTROL_SIZE.toApiException());
        }
    }

    public static HmsNotificationManagerEx getInstance(Activity activity) {
        return new HmsNotificationManagerEx(activity);
    }

    public tct<NotificationStatus> enableNotification() {
        return a();
    }

    private tct<NotificationStatus> a(Exception exc) {
        fdt fdtVar = new fdt();
        fdtVar.c(exc);
        return fdtVar.b();
    }
}
