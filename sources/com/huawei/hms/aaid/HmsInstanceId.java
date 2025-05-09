package com.huawei.hms.aaid;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import com.huawei.hms.aaid.constant.ErrorEnum;
import com.huawei.hms.aaid.entity.AAIDResult;
import com.huawei.hms.aaid.entity.DeleteTokenReq;
import com.huawei.hms.aaid.entity.TokenReq;
import com.huawei.hms.aaid.entity.TokenResult;
import com.huawei.hms.aaid.plugin.ProxyCenter;
import com.huawei.hms.aaid.task.PushClientBuilder;
import com.huawei.hms.aaid.utils.BaseUtils;
import com.huawei.hms.aaid.utils.PushPreferences;
import com.huawei.hms.api.Api;
import com.huawei.hms.api.HuaweiApiAvailability;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.HuaweiApi;
import com.huawei.hms.common.internal.AbstractClientBuilder;
import com.huawei.hms.common.internal.Preconditions;
import com.huawei.hms.opendevice.a;
import com.huawei.hms.opendevice.b;
import com.huawei.hms.opendevice.e;
import com.huawei.hms.opendevice.f;
import com.huawei.hms.opendevice.g;
import com.huawei.hms.opendevice.h;
import com.huawei.hms.opendevice.i;
import com.huawei.hms.opendevice.l;
import com.huawei.hms.support.log.HMSLog;
import tb.fdt;
import tb.rft;
import tb.tct;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class HmsInstanceId {
    public static final String TAG = "HmsInstanceId";

    /* renamed from: a  reason: collision with root package name */
    private Context f5230a;
    private PushPreferences b;
    private HuaweiApi<Api.ApiOptions.NoOptions> c;

    private HmsInstanceId(Context context) {
        this.f5230a = context.getApplicationContext();
        this.b = new PushPreferences(context, "aaid");
        Api api = new Api(HuaweiApiAvailability.HMS_API_NAME_PUSH);
        if (context instanceof Activity) {
            this.c = new HuaweiApi<>((Activity) context, (Api<Api.ApiOptions>) api, (Api.ApiOptions) null, (AbstractClientBuilder) new PushClientBuilder());
        } else {
            this.c = new HuaweiApi<>(context, api, (Api.ApiOptions) null, new PushClientBuilder());
        }
        this.c.setKitSdkVersion(61200300);
    }

    private void a(String str) {
        if (!TextUtils.isEmpty(str)) {
            if (e.e(this.f5230a)) {
                String string = i.a(this.f5230a).getString("subjectId");
                if (TextUtils.isEmpty(string)) {
                    i.a(this.f5230a).saveString("subjectId", str);
                } else if (!string.contains(str)) {
                    i a2 = i.a(this.f5230a);
                    a2.saveString("subjectId", string + "," + str);
                }
            } else {
                i.a(this.f5230a).removeKey("subjectId");
            }
        }
    }

    private void b() throws ApiException {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            throw ErrorEnum.ERROR_MAIN_THREAD.toApiException();
        }
    }

    public static HmsInstanceId getInstance(Context context) {
        Preconditions.checkNotNull(context);
        l.c(context);
        return new HmsInstanceId(context);
    }

    public void deleteAAID() throws ApiException {
        b();
        try {
            if (this.b.containsKey("aaid")) {
                this.b.removeKey("aaid");
                this.b.removeKey("creationTime");
                if (b.d(this.f5230a)) {
                    if (ProxyCenter.getProxy() != null) {
                        HMSLog.i(TAG, "use proxy delete all token after delete AaId.");
                        ProxyCenter.getProxy().deleteAllToken(this.f5230a);
                        return;
                    }
                    DeleteTokenReq a2 = b.a(this.f5230a);
                    a2.setDeleteType(1);
                    a2.setMultiSender(false);
                    a(a2, 1);
                    BaseUtils.deleteAllTokenCache(this.f5230a);
                }
            }
        } catch (ApiException e) {
            throw e;
        } catch (Exception unused) {
            throw ErrorEnum.ERROR_INTERNAL_ERROR.toApiException();
        }
    }

    public void deleteToken(String str, String str2) throws ApiException {
        b();
        a();
        DeleteTokenReq a2 = b.a(this.f5230a, str, str2);
        a2.setMultiSender(false);
        a(a2, 1);
    }

    public tct<AAIDResult> getAAID() {
        try {
            return rft.b(new a(this.f5230a.getApplicationContext()));
        } catch (Exception unused) {
            fdt fdtVar = new fdt();
            fdtVar.c(ErrorEnum.ERROR_INTERNAL_ERROR.toApiException());
            return fdtVar.b();
        }
    }

    public long getCreationTime() {
        try {
            if (!this.b.containsKey("creationTime")) {
                getAAID();
            }
            return this.b.getLong("creationTime");
        } catch (Exception unused) {
            return 0L;
        }
    }

    public String getId() {
        return b.b(this.f5230a);
    }

    @Deprecated
    public String getToken() {
        try {
            return getToken(null, null);
        } catch (Exception unused) {
            return null;
        }
    }

    public String getToken(String str, String str2) throws ApiException {
        b();
        a();
        TokenReq b = b.b(this.f5230a, null, str2);
        b.setAaid(getId());
        b.setMultiSender(false);
        i.a(this.f5230a).saveString(this.f5230a.getPackageName(), "1");
        return a(b, 1);
    }

    public void deleteToken(String str) throws ApiException {
        b();
        a();
        if (!TextUtils.isEmpty(str)) {
            String c = b.c(this.f5230a);
            if (TextUtils.isEmpty(c)) {
                throw ErrorEnum.ERROR_MISSING_PROJECT_ID.toApiException();
            } else if (str.equals(c)) {
                deleteToken(null, null);
            } else {
                DeleteTokenReq a2 = b.a(this.f5230a, str);
                a2.setMultiSender(true);
                a(a2, 2);
            }
        } else {
            throw ErrorEnum.ERROR_ARGUMENTS_INVALID.toApiException();
        }
    }

    public String getToken(String str) throws ApiException {
        b();
        a();
        if (!TextUtils.isEmpty(str)) {
            String c = b.c(this.f5230a);
            if (TextUtils.isEmpty(c)) {
                throw ErrorEnum.ERROR_MISSING_PROJECT_ID.toApiException();
            } else if (str.equals(c)) {
                return getToken(null, null);
            } else {
                TokenReq b = b.b(this.f5230a, str);
                b.setAaid(getId());
                b.setMultiSender(true);
                return a(b, 2);
            }
        } else {
            throw ErrorEnum.ERROR_ARGUMENTS_INVALID.toApiException();
        }
    }

    private String a(TokenReq tokenReq, int i) throws ApiException {
        if (ProxyCenter.getProxy() != null) {
            HMSLog.i(TAG, "use proxy get token, please check HmsMessageService.onNewToken receive result.");
            ProxyCenter.getProxy().getToken(this.f5230a, tokenReq.getSubjectId(), null);
            return null;
        }
        a(tokenReq.getSubjectId());
        String a2 = h.a(this.f5230a, "push.gettoken");
        try {
            String str = TAG;
            HMSLog.d(str, "getToken req :" + tokenReq.toString());
            g gVar = new g("push.gettoken", tokenReq, this.f5230a, a2);
            gVar.setApiLevel(i);
            return ((TokenResult) rft.a(this.c.doWrite(gVar))).getToken();
        } catch (Exception e) {
            if (e.getCause() instanceof ApiException) {
                ApiException apiException = (ApiException) e.getCause();
                h.a(this.f5230a, "push.gettoken", a2, apiException.getStatusCode());
                throw apiException;
            }
            Context context = this.f5230a;
            ErrorEnum errorEnum = ErrorEnum.ERROR_INTERNAL_ERROR;
            h.a(context, "push.gettoken", a2, errorEnum);
            throw errorEnum.toApiException();
        }
    }

    private void a(DeleteTokenReq deleteTokenReq, int i) throws ApiException {
        String subjectId = deleteTokenReq.getSubjectId();
        if (ProxyCenter.getProxy() != null) {
            HMSLog.i(TAG, "use proxy delete token");
            ProxyCenter.getProxy().deleteToken(this.f5230a, subjectId, null);
            return;
        }
        String a2 = h.a(this.f5230a, "push.deletetoken");
        try {
            String b = i.a(this.f5230a).b(subjectId);
            if (!deleteTokenReq.isMultiSender() || (!TextUtils.isEmpty(b) && !b.equals(i.a(this.f5230a).b(null)))) {
                deleteTokenReq.setToken(b);
                f fVar = new f("push.deletetoken", deleteTokenReq, a2);
                fVar.setApiLevel(i);
                rft.a(this.c.doWrite(fVar));
                i.a(this.f5230a).c(subjectId);
                return;
            }
            i.a(this.f5230a).removeKey(subjectId);
            HMSLog.i(TAG, "The local subject token is null");
        } catch (Exception e) {
            if (e.getCause() instanceof ApiException) {
                ApiException apiException = (ApiException) e.getCause();
                h.a(this.f5230a, "push.deletetoken", a2, apiException.getStatusCode());
                throw apiException;
            }
            Context context = this.f5230a;
            ErrorEnum errorEnum = ErrorEnum.ERROR_INTERNAL_ERROR;
            h.a(context, "push.deletetoken", a2, errorEnum);
            throw errorEnum.toApiException();
        }
    }

    private void a() throws ApiException {
        if (BaseUtils.getProxyInit(this.f5230a) && ProxyCenter.getProxy() == null && !BaseUtils.isMainProc(this.f5230a)) {
            HMSLog.e(TAG, "Operations in child processes are not supported.");
            throw ErrorEnum.ERROR_OPER_IN_CHILD_PROCESS.toApiException();
        }
    }
}
