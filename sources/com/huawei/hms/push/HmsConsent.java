package com.huawei.hms.push;

import android.app.Activity;
import android.content.Context;
import com.huawei.hms.aaid.constant.ErrorEnum;
import com.huawei.hms.aaid.task.PushClientBuilder;
import com.huawei.hms.api.Api;
import com.huawei.hms.api.HuaweiApiAvailability;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.HuaweiApi;
import com.huawei.hms.common.internal.AbstractClientBuilder;
import com.huawei.hms.common.internal.Preconditions;
import com.huawei.hms.push.task.ConsentTask;
import com.huawei.hms.push.utils.PushBiUtil;
import com.huawei.hms.support.api.entity.push.EnableConsentReq;
import com.huawei.hms.support.api.entity.push.PushNaming;
import com.huawei.hms.utils.JsonUtil;
import tb.fdt;
import tb.tct;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class HmsConsent {

    /* renamed from: a  reason: collision with root package name */
    private HuaweiApi<Api.ApiOptions.NoOptions> f5429a;
    private Context b;

    private HmsConsent(Context context) {
        Preconditions.checkNotNull(context);
        this.b = context;
        Api api = new Api(HuaweiApiAvailability.HMS_API_NAME_PUSH);
        if (context instanceof Activity) {
            this.f5429a = new HuaweiApi<>((Activity) context, (Api<Api.ApiOptions>) api, (Api.ApiOptions) null, (AbstractClientBuilder) new PushClientBuilder());
        } else {
            this.f5429a = new HuaweiApi<>(context, api, (Api.ApiOptions) null, new PushClientBuilder());
        }
        this.f5429a.setKitSdkVersion(61200300);
    }

    private tct<Void> a(boolean z) {
        fdt fdtVar;
        int i;
        String reportEntry = PushBiUtil.reportEntry(this.b, PushNaming.PUSH_CONSENT);
        try {
            if (d.d(this.b)) {
                EnableConsentReq enableConsentReq = new EnableConsentReq();
                enableConsentReq.setPackageName(this.b.getPackageName());
                enableConsentReq.setEnable(z);
                return this.f5429a.doWrite(new ConsentTask(PushNaming.PUSH_CONSENT, JsonUtil.createJsonString(enableConsentReq), reportEntry));
            }
            throw ErrorEnum.ERROR_OPERATION_NOT_SUPPORTED.toApiException();
        } catch (ApiException e) {
            fdt fdtVar2 = new fdt();
            fdtVar2.c(e);
            i = e.getStatusCode();
            fdtVar = fdtVar2;
            PushBiUtil.reportExit(this.b, PushNaming.PUSH_CONSENT, reportEntry, i);
            return fdtVar.b();
        } catch (Exception unused) {
            fdtVar = new fdt();
            ErrorEnum errorEnum = ErrorEnum.ERROR_INTERNAL_ERROR;
            fdtVar.c(errorEnum.toApiException());
            i = errorEnum.getExternalCode();
            PushBiUtil.reportExit(this.b, PushNaming.PUSH_CONSENT, reportEntry, i);
            return fdtVar.b();
        }
    }

    public static HmsConsent getInstance(Context context) {
        return new HmsConsent(context);
    }

    public tct<Void> consentOff() {
        return a(false);
    }

    public tct<Void> consentOn() {
        return a(true);
    }
}
