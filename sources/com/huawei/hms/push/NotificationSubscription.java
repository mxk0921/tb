package com.huawei.hms.push;

import android.app.Activity;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.text.TextUtils;
import com.huawei.hms.aaid.constant.ErrorEnum;
import com.huawei.hms.aaid.task.PushClientBuilder;
import com.huawei.hms.aaid.utils.BaseUtils;
import com.huawei.hms.api.Api;
import com.huawei.hms.api.HuaweiApiAvailability;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.HuaweiApi;
import com.huawei.hms.common.internal.AbstractClientBuilder;
import com.huawei.hms.common.internal.Preconditions;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.push.notification.SubscribedItem;
import com.huawei.hms.push.task.SubscribeNotificationTask;
import com.huawei.hms.push.utils.PushBiUtil;
import com.huawei.hms.support.api.entity.push.PushNaming;
import com.huawei.hms.support.api.entity.push.SubscribeNotificationReq;
import com.huawei.hms.support.log.HMSLog;
import java.util.List;
import org.json.JSONArray;
import tb.fdt;
import tb.rft;
import tb.tct;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class NotificationSubscription {
    public static final int NOTIFICATION_SUBSCRIBE_REQUEST_CODE = 1001;
    private static final String d = "NotificationSubscription";

    /* renamed from: a  reason: collision with root package name */
    private Activity f5435a;
    private Context b;
    private HuaweiApi<Api.ApiOptions.NoOptions> c;

    private NotificationSubscription(Activity activity) {
        Preconditions.checkNotNull(activity);
        this.b = activity.getApplicationContext();
        this.f5435a = activity;
        HuaweiApi<Api.ApiOptions.NoOptions> huaweiApi = new HuaweiApi<>(activity, (Api<Api.ApiOptions>) new Api(HuaweiApiAvailability.HMS_API_NAME_PUSH), (Api.ApiOptions) null, (AbstractClientBuilder) new PushClientBuilder());
        this.c = huaweiApi;
        huaweiApi.setKitSdkVersion(61200300);
    }

    private tct<SubscribeResult> a(List<String> list) {
        boolean areNotificationsEnabled;
        String reportEntry = PushBiUtil.reportEntry(this.b, PushNaming.SUBSCRIBE_NOTIFICATION);
        if (list == null || list.isEmpty() || list.size() > 3) {
            Context context = this.b;
            ErrorEnum errorEnum = ErrorEnum.ERROR_ARGUMENTS_INVALID;
            PushBiUtil.reportExit(context, PushNaming.SUBSCRIBE_NOTIFICATION, reportEntry, errorEnum);
            HMSLog.e(d, "Invalid entityIds: entityId list should not be empty or more than max size");
            return a(errorEnum.toApiException());
        } else if (Looper.getMainLooper() == Looper.myLooper()) {
            Context context2 = this.b;
            ErrorEnum errorEnum2 = ErrorEnum.ERROR_MAIN_THREAD;
            PushBiUtil.reportExit(context2, PushNaming.SUBSCRIBE_NOTIFICATION, reportEntry, errorEnum2);
            return a(errorEnum2.toApiException());
        } else {
            areNotificationsEnabled = ((NotificationManager) this.b.getSystemService(RemoteMessageConst.NOTIFICATION)).areNotificationsEnabled();
            if (!areNotificationsEnabled) {
                HMSLog.i(d, "App disabled notification");
                Context context3 = this.b;
                ErrorEnum errorEnum3 = ErrorEnum.ERROR_NOTIFICATION_DISABLED;
                PushBiUtil.reportExit(context3, PushNaming.SUBSCRIBE_NOTIFICATION, reportEntry, errorEnum3);
                return a(errorEnum3.toApiException());
            }
            try {
                if (v.a(this.b) != ErrorEnum.SUCCESS) {
                    return a(ErrorEnum.ERROR_NO_TOKEN.toApiException());
                }
                if (-1 == this.b.getPackageManager().checkPermission("android.permission.ACCESS_NETWORK_STATE", this.b.getPackageName()) || g.a(this.b) != -1) {
                    tct doWrite = this.c.doWrite(new SubscribeNotificationTask(this.f5435a, PushNaming.SUBSCRIBE_NOTIFICATION, b(list), reportEntry));
                    rft.a(doWrite);
                    return doWrite;
                }
                HMSLog.e(d, "no network");
                return a(ErrorEnum.ERROR_NO_NETWORK.toApiException());
            } catch (Exception e) {
                if (e.getCause() instanceof ApiException) {
                    ApiException apiException = (ApiException) e.getCause();
                    PushBiUtil.reportExit(this.b, PushNaming.SUBSCRIBE_NOTIFICATION, reportEntry, apiException.getStatusCode());
                    return a(apiException);
                }
                Context context4 = this.b;
                ErrorEnum errorEnum4 = ErrorEnum.ERROR_INTERNAL_ERROR;
                PushBiUtil.reportExit(context4, PushNaming.SUBSCRIBE_NOTIFICATION, reportEntry, errorEnum4);
                return a(errorEnum4.toApiException());
            }
        }
    }

    private SubscribeNotificationReq b(List<String> list) {
        JSONArray jSONArray = new JSONArray();
        for (String str : list) {
            jSONArray.put(str);
        }
        SubscribeNotificationReq subscribeNotificationReq = new SubscribeNotificationReq();
        subscribeNotificationReq.setEntityIds(jSONArray.toString());
        subscribeNotificationReq.setToken(BaseUtils.getLocalToken(this.b, null));
        return subscribeNotificationReq;
    }

    public static NotificationSubscription getInstance(Activity activity) {
        return new NotificationSubscription(activity);
    }

    public static SubscribeResult getSubscribeResult(Intent intent) {
        String stringExtra;
        if (intent == null) {
            return null;
        }
        try {
            stringExtra = intent.getStringExtra("errorMsg");
        } catch (Throwable unused) {
            HMSLog.e(d, "get subscribe result occurs exception");
        }
        if (!TextUtils.isEmpty(stringExtra)) {
            SubscribeResult subscribeResult = new SubscribeResult();
            subscribeResult.setErrorMsg(stringExtra);
            String str = d;
            HMSLog.e(str, "get subscribe error msg:" + stringExtra);
            return subscribeResult;
        }
        String stringExtra2 = intent.getStringExtra("subscribedItems");
        if (!TextUtils.isEmpty(stringExtra2)) {
            List<SubscribedItem> a2 = b.a(stringExtra2);
            SubscribeResult subscribeResult2 = new SubscribeResult();
            subscribeResult2.setSubscribedItems(a2);
            return subscribeResult2;
        }
        return null;
    }

    public tct<SubscribeResult> requestSubscribeNotification(List<String> list) {
        HMSLog.i(d, "invoke request subscribe notification");
        return a(list);
    }

    private tct<SubscribeResult> a(Exception exc) {
        fdt fdtVar = new fdt();
        fdtVar.c(exc);
        return fdtVar.b();
    }
}
