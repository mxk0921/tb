package com.huawei.hms.opendevice;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.aaid.HmsInstanceId;
import com.huawei.hms.aaid.constant.ErrorEnum;
import com.huawei.hms.aaid.entity.TokenReq;
import com.huawei.hms.aaid.entity.TokenResp;
import com.huawei.hms.aaid.entity.TokenResult;
import com.huawei.hms.aaid.task.PushClient;
import com.huawei.hms.aaid.threads.AsyncExec;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.common.internal.TaskApiCall;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.JsonUtil;
import tb.fdt;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class g extends TaskApiCall<PushClient, TokenResult> {

    /* renamed from: a  reason: collision with root package name */
    private Context f5420a;
    private TokenReq b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f5421a;
        final /* synthetic */ String b;

        public a(String str, String str2) {
            this.f5421a = str;
            this.b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!i.a(g.this.f5420a).b(this.f5421a).equals(this.b)) {
                HMSLog.i(HmsInstanceId.TAG, "receive a new token, refresh the local token");
                i.a(g.this.f5420a).b(this.f5421a, this.b);
            }
        }
    }

    public g(String str, TokenReq tokenReq, Context context, String str2) {
        super(str, JsonUtil.createJsonString(tokenReq), str2);
        this.f5420a = context;
        this.b = tokenReq;
    }

    @Override // com.huawei.hms.common.internal.TaskApiCall
    public int getMinApkVersion() {
        if (this.b.isMultiSender()) {
            return 50004300;
        }
        return 30000000;
    }

    /* renamed from: a */
    public void doExecute(PushClient pushClient, ResponseErrorCode responseErrorCode, String str, fdt<TokenResult> fdtVar) {
        if (responseErrorCode.getErrorCode() != 0) {
            String str2 = HmsInstanceId.TAG;
            HMSLog.e(str2, "TokenTask failed, ErrorCode:" + responseErrorCode.getErrorCode());
            a(responseErrorCode, fdtVar);
        } else {
            TokenResp tokenResp = (TokenResp) JsonUtil.jsonToEntity(str, new TokenResp());
            ErrorEnum fromCode = ErrorEnum.fromCode(tokenResp.getRetCode());
            if (fromCode != ErrorEnum.SUCCESS) {
                fdtVar.c(fromCode.toApiException());
                String str3 = HmsInstanceId.TAG;
                HMSLog.e(str3, "TokenTask failed, StatusCode:" + fromCode.getExternalCode());
            } else {
                TokenResult tokenResult = new TokenResult();
                tokenResult.setToken(tokenResp.getToken());
                tokenResult.setBelongId(tokenResp.getBelongId());
                tokenResult.setRetCode(ErrorEnum.fromCode(tokenResp.getRetCode()).getExternalCode());
                fdtVar.d(tokenResult);
                String token = tokenResp.getToken();
                if (TextUtils.isEmpty(token)) {
                    HMSLog.i(HmsInstanceId.TAG, "GetTokenTask receive an empty token, please check onNewToken callback method.");
                    h.a(pushClient.getContext(), getUri(), responseErrorCode);
                    return;
                }
                a(token, this.b.getSubjectId());
            }
        }
        h.a(pushClient.getContext(), getUri(), responseErrorCode);
    }

    private void a(ResponseErrorCode responseErrorCode, fdt<TokenResult> fdtVar) {
        ErrorEnum fromCode = ErrorEnum.fromCode(responseErrorCode.getErrorCode());
        if (fromCode != ErrorEnum.ERROR_UNKNOWN) {
            fdtVar.c(fromCode.toApiException());
        } else {
            fdtVar.c(new ApiException(new Status(responseErrorCode.getErrorCode(), responseErrorCode.getErrorReason())));
        }
    }

    private void a(String str, String str2) {
        AsyncExec.submitSeqIO(new a(str2, str));
    }
}
