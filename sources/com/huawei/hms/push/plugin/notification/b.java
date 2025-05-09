package com.huawei.hms.push.plugin.notification;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import com.huawei.hms.aaid.constant.ErrorEnum;
import com.huawei.hms.aaid.task.PushClient;
import com.huawei.hms.aaid.utils.PushPreferences;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.common.internal.TaskApiCall;
import com.huawei.hms.push.utils.PushBiUtil;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.entity.push.NotificationEnableReq;
import com.huawei.hms.support.api.entity.push.NotificationEnableResp;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.JsonUtil;
import tb.fdt;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class b extends TaskApiCall<PushClient, NotificationStatus> {

    /* renamed from: a  reason: collision with root package name */
    private Context f5452a;
    private NotificationEnableReq b;

    public b(String str, NotificationEnableReq notificationEnableReq, Context context, String str2) {
        super(str, JsonUtil.createJsonString(notificationEnableReq), str2);
        this.f5452a = context;
        this.b = notificationEnableReq;
    }

    /* renamed from: a */
    public void doExecute(PushClient pushClient, ResponseErrorCode responseErrorCode, String str, fdt<NotificationStatus> fdtVar) {
        if (responseErrorCode.getErrorCode() != 0) {
            HMSLog.e("HmsNotificationManagerEx", "Notification Enable failed, ErrorCode:" + responseErrorCode.getErrorCode());
            a(responseErrorCode, fdtVar);
            return;
        }
        ErrorEnum fromCode = ErrorEnum.fromCode(((NotificationEnableResp) JsonUtil.jsonToEntity(str, new NotificationEnableResp())).getRetCode());
        if (fromCode != ErrorEnum.SUCCESS) {
            fdtVar.c(fromCode.toApiException());
            HMSLog.e("HmsNotificationManagerEx", "Notification Enable failed, StatusCode:" + fromCode.getExternalCode());
            return;
        }
        NotificationStatus notificationStatus = new NotificationStatus();
        notificationStatus.setRetCode(fromCode.getExternalCode());
        notificationStatus.getStatus().setIntent(a(responseErrorCode));
        fdtVar.d(notificationStatus);
        new PushPreferences(this.f5452a, "hwpush_local_config").saveLong("notification_request_time", Long.valueOf(System.currentTimeMillis()));
        PushBiUtil.reportExit(pushClient.getContext(), getUri(), responseErrorCode);
    }

    @Override // com.huawei.hms.common.internal.TaskApiCall
    public int getApiLevel() {
        return 5;
    }

    private void a(ResponseErrorCode responseErrorCode, fdt<NotificationStatus> fdtVar) {
        ErrorEnum fromCode = ErrorEnum.fromCode(responseErrorCode.getErrorCode());
        if (fromCode != ErrorEnum.ERROR_UNKNOWN) {
            fdtVar.c(fromCode.toApiException());
        } else {
            fdtVar.c(new ApiException(new Status(responseErrorCode.getErrorCode(), responseErrorCode.getErrorReason())));
        }
    }

    private Intent a(ResponseErrorCode responseErrorCode) {
        Parcelable parcelable = responseErrorCode.getParcelable();
        if (parcelable == null) {
            return new Intent();
        }
        if (parcelable instanceof Intent) {
            return (Intent) parcelable;
        }
        return new Intent();
    }
}
