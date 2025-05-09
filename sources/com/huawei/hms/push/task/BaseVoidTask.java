package com.huawei.hms.push.task;

import com.huawei.hms.aaid.constant.ErrorEnum;
import com.huawei.hms.aaid.task.PushClient;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.common.internal.TaskApiCall;
import com.huawei.hms.push.utils.PushBiUtil;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.log.HMSLog;
import tb.fdt;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class BaseVoidTask extends TaskApiCall<PushClient, Void> {
    public BaseVoidTask(String str, String str2, String str3) {
        super(str, str2, str3);
    }

    @Override // com.huawei.hms.common.internal.TaskApiCall
    public int getMinApkVersion() {
        return 30000000;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    public void doExecute(PushClient pushClient, ResponseErrorCode responseErrorCode, String str, fdt<Void> fdtVar) {
        if (responseErrorCode.getErrorCode() == 0) {
            HMSLog.i("BaseVoidTask", "Operate succeed");
            fdtVar.d(null);
        } else {
            HMSLog.e("BaseVoidTask", "Operate failed with ret=" + responseErrorCode.getErrorCode());
            ErrorEnum fromCode = ErrorEnum.fromCode(responseErrorCode.getErrorCode());
            if (fromCode != ErrorEnum.ERROR_UNKNOWN) {
                fdtVar.c(fromCode.toApiException());
            } else {
                fdtVar.c(new ApiException(new Status(responseErrorCode.getErrorCode(), responseErrorCode.getErrorReason())));
            }
        }
        PushBiUtil.reportExit(pushClient.getContext(), getUri(), responseErrorCode);
    }
}
