package com.huawei.hms.push;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.aaid.constant.ErrorEnum;
import com.huawei.hms.aaid.task.PushClientBuilder;
import com.huawei.hms.api.Api;
import com.huawei.hms.api.HuaweiApiAvailability;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.HuaweiApi;
import com.huawei.hms.common.internal.AbstractClientBuilder;
import com.huawei.hms.common.internal.Preconditions;
import com.huawei.hms.push.task.ProfileTask;
import com.huawei.hms.push.utils.PushBiUtil;
import com.huawei.hms.support.api.entity.push.ProfileReq;
import com.huawei.hms.support.api.entity.push.PushNaming;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.JsonUtil;
import tb.fdt;
import tb.lmo;
import tb.syx;
import tb.t2;
import tb.tct;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class HmsProfile {
    public static final int CUSTOM_PROFILE = 2;
    public static final int HUAWEI_PROFILE = 1;
    private static final String c = "HmsProfile";

    /* renamed from: a  reason: collision with root package name */
    private Context f5434a;
    private HuaweiApi<Api.ApiOptions.NoOptions> b;

    private HmsProfile(Context context) {
        this.f5434a = null;
        Preconditions.checkNotNull(context);
        this.f5434a = context;
        Api api = new Api(HuaweiApiAvailability.HMS_API_NAME_PUSH);
        if (context instanceof Activity) {
            this.b = new HuaweiApi<>((Activity) context, (Api<Api.ApiOptions>) api, (Api.ApiOptions) null, (AbstractClientBuilder) new PushClientBuilder());
        } else {
            this.b = new HuaweiApi<>(context, api, (Api.ApiOptions) null, new PushClientBuilder());
        }
        this.b.setKitSdkVersion(61200300);
    }

    private tct<Void> a(int i, String str, int i2, String str2) {
        if (!isSupportProfile()) {
            fdt fdtVar = new fdt();
            fdtVar.c(ErrorEnum.ERROR_OPERATION_NOT_SUPPORTED.toApiException());
            return fdtVar.b();
        }
        if (!TextUtils.isEmpty(str)) {
            String a2 = a(this.f5434a);
            if (TextUtils.isEmpty(a2)) {
                HMSLog.i(c, "agc connect services config missing project id.");
                fdt fdtVar2 = new fdt();
                fdtVar2.c(ErrorEnum.ERROR_MISSING_PROJECT_ID.toApiException());
                return fdtVar2.b();
            } else if (str.equals(a2)) {
                str = "";
            }
        }
        ProfileReq profileReq = new ProfileReq();
        if (i == 0) {
            profileReq.setOperation(0);
            profileReq.setType(i2);
        } else {
            profileReq.setOperation(1);
        }
        String reportEntry = PushBiUtil.reportEntry(this.f5434a, PushNaming.PUSH_PROFILE);
        try {
            profileReq.setSubjectId(str);
            profileReq.setProfileId(lmo.b(str2));
            profileReq.setPkgName(this.f5434a.getPackageName());
            return this.b.doWrite(new ProfileTask(PushNaming.PUSH_PROFILE, JsonUtil.createJsonString(profileReq), reportEntry));
        } catch (Exception e) {
            if (e.getCause() instanceof ApiException) {
                fdt fdtVar3 = new fdt();
                ApiException apiException = (ApiException) e.getCause();
                fdtVar3.c(apiException);
                PushBiUtil.reportExit(this.f5434a, PushNaming.PUSH_PROFILE, reportEntry, apiException.getStatusCode());
                return fdtVar3.b();
            }
            fdt fdtVar4 = new fdt();
            Context context = this.f5434a;
            ErrorEnum errorEnum = ErrorEnum.ERROR_INTERNAL_ERROR;
            PushBiUtil.reportExit(context, PushNaming.PUSH_PROFILE, reportEntry, errorEnum);
            fdtVar4.c(errorEnum.toApiException());
            return fdtVar4.b();
        }
    }

    private boolean b(Context context) {
        if (d.b(context) >= 110001400) {
            return true;
        }
        return false;
    }

    public static HmsProfile getInstance(Context context) {
        return new HmsProfile(context);
    }

    public tct<Void> addProfile(int i, String str) {
        return addProfile("", i, str);
    }

    public tct<Void> deleteProfile(String str) {
        return deleteProfile("", str);
    }

    public boolean isSupportProfile() {
        if (!d.d(this.f5434a)) {
            return true;
        }
        if (d.c()) {
            HMSLog.i(c, "current EMUI version below 9.1, not support profile operation.");
            return false;
        } else if (b(this.f5434a)) {
            return true;
        } else {
            HMSLog.i(c, "current HwPushService.apk version below 11.0.1.400,please upgrade your HwPushService.apk version.");
            return false;
        }
    }

    public tct<Void> addProfile(String str, int i, String str2) {
        if (i != 1 && i != 2) {
            HMSLog.i(c, "add profile type undefined.");
            fdt fdtVar = new fdt();
            fdtVar.c(ErrorEnum.ERROR_PUSH_ARGUMENTS_INVALID.toApiException());
            return fdtVar.b();
        } else if (!TextUtils.isEmpty(str2)) {
            return a(0, str, i, str2);
        } else {
            HMSLog.i(c, "add profile params is empty.");
            fdt fdtVar2 = new fdt();
            fdtVar2.c(ErrorEnum.ERROR_PUSH_ARGUMENTS_INVALID.toApiException());
            return fdtVar2.b();
        }
    }

    public tct<Void> deleteProfile(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            return a(1, str, -1, str2);
        }
        HMSLog.e(c, "del profile params is empty.");
        fdt fdtVar = new fdt();
        fdtVar.c(ErrorEnum.ERROR_PUSH_ARGUMENTS_INVALID.toApiException());
        return fdtVar.b();
    }

    private static String a(Context context) {
        return ((syx) t2.b(context)).getString("client/project_id");
    }
}
