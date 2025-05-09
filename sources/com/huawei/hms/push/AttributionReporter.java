package com.huawei.hms.push;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
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
import com.huawei.hms.push.task.AttributionReportTask;
import com.huawei.hms.push.utils.PushBiUtil;
import com.huawei.hms.support.api.entity.push.AttributionReportReq;
import com.huawei.hms.support.api.entity.push.PushNaming;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.ui.SafeBundle;
import com.huawei.hms.utils.JsonUtil;
import tb.fdt;
import tb.tct;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class AttributionReporter {
    public static final String APP_VERSION = "appVersion";
    public static final String SYSTEM_PERMISSION = "permission";

    /* renamed from: a  reason: collision with root package name */
    private HuaweiApi<Api.ApiOptions.NoOptions> f5427a;
    private Context b;

    private AttributionReporter(Context context) {
        Preconditions.checkNotNull(context);
        this.b = context;
        Api api = new Api(HuaweiApiAvailability.HMS_API_NAME_PUSH);
        if (context instanceof Activity) {
            this.f5427a = new HuaweiApi<>((Activity) context, (Api<Api.ApiOptions>) api, (Api.ApiOptions) null, (AbstractClientBuilder) new PushClientBuilder());
        } else {
            this.f5427a = new HuaweiApi<>(context, api, (Api.ApiOptions) null, new PushClientBuilder());
        }
        this.f5427a.setKitSdkVersion(61200300);
    }

    private tct<Void> a(AttributionEvent attributionEvent, Bundle bundle) {
        int i;
        fdt fdtVar;
        String reportEntry = PushBiUtil.reportEntry(this.b, PushNaming.PUSH_ANALYSIS_REPORT);
        if (bundle == null || attributionEvent == null) {
            PushBiUtil.reportExit(this.b, PushNaming.PUSH_ANALYSIS_REPORT, reportEntry, ErrorEnum.ERROR_ARGUMENTS_INVALID);
            HMSLog.e("AttributionReporter", "Invalid argument: argument should not be null");
            throw new IllegalArgumentException("Invalid argument: argument should not be null");
        }
        try {
            if (d.d(this.b)) {
                long j = new PushPreferences(this.b, "hwpush_local_config").getLong("analysis_last_failed_time");
                if (j > 0 && System.currentTimeMillis() - j < 86400000) {
                    throw ErrorEnum.ERROR_NOT_IN_SERVICE.toApiException();
                }
                return this.f5427a.doWrite(new AttributionReportTask(PushNaming.PUSH_ANALYSIS_REPORT, JsonUtil.createJsonString(a(attributionEvent, new SafeBundle(bundle))), reportEntry));
            }
            throw ErrorEnum.ERROR_OPERATION_NOT_SUPPORTED.toApiException();
        } catch (ApiException e) {
            fdt fdtVar2 = new fdt();
            fdtVar2.c(e);
            i = e.getStatusCode();
            fdtVar = fdtVar2;
            PushBiUtil.reportExit(this.b, PushNaming.PUSH_ANALYSIS_REPORT, reportEntry, i);
            return fdtVar.b();
        } catch (Exception unused) {
            fdtVar = new fdt();
            ErrorEnum errorEnum = ErrorEnum.ERROR_INTERNAL_ERROR;
            fdtVar.c(errorEnum.toApiException());
            i = errorEnum.getExternalCode();
            PushBiUtil.reportExit(this.b, PushNaming.PUSH_ANALYSIS_REPORT, reportEntry, i);
            return fdtVar.b();
        }
    }

    public static AttributionReporter getInstance(Context context) {
        return new AttributionReporter(context);
    }

    public tct<Void> report(AttributionEvent attributionEvent, Bundle bundle) {
        return a(attributionEvent, bundle);
    }

    private AttributionReportReq a(AttributionEvent attributionEvent, SafeBundle safeBundle) throws ApiException {
        Bundle bundle = safeBundle.getBundle().getBundle("analysisExt");
        if (bundle == null || bundle.isEmpty()) {
            throw ErrorEnum.ERROR_ARGUMENTS_INVALID.toApiException();
        }
        String string = bundle.getString(RemoteMessageConst.MSGID);
        if (!TextUtils.isEmpty(string)) {
            String string2 = bundle.getString("hsId");
            if (!TextUtils.isEmpty(string2)) {
                AttributionReportReq attributionReportReq = new AttributionReportReq();
                attributionReportReq.setCampaignId(bundle.getString("cid"));
                attributionReportReq.setMsgId(string);
                attributionReportReq.setHaStorageId(string2);
                attributionReportReq.setEventId(attributionEvent.getEventId());
                attributionReportReq.setPkgName(this.b.getPackageName());
                if (attributionEvent.equals(AttributionEvent.PERMISSION_GRANTED) || attributionEvent.equals(AttributionEvent.PERMISSION_DENIED)) {
                    String string3 = safeBundle.getString(SYSTEM_PERMISSION);
                    if (TextUtils.isEmpty(string3) || !string3.startsWith("android.permission")) {
                        throw ErrorEnum.ERROR_ARGUMENTS_INVALID.toApiException();
                    }
                    attributionReportReq.setReqPermission(string3);
                }
                attributionReportReq.setTimeStamp(System.currentTimeMillis());
                attributionReportReq.setAppVersion(safeBundle.getString("appVersion"));
                return attributionReportReq;
            }
            throw ErrorEnum.ERROR_ARGUMENTS_INVALID.toApiException();
        }
        throw ErrorEnum.ERROR_ARGUMENTS_INVALID.toApiException();
    }
}
