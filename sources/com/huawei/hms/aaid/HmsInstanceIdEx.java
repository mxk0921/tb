package com.huawei.hms.aaid;

import android.app.Activity;
import android.content.Context;
import com.huawei.hms.aaid.constant.ErrorEnum;
import com.huawei.hms.aaid.entity.TokenReq;
import com.huawei.hms.aaid.entity.TokenResult;
import com.huawei.hms.aaid.plugin.ProxyCenter;
import com.huawei.hms.aaid.task.PushClientBuilder;
import com.huawei.hms.aaid.utils.PushPreferences;
import com.huawei.hms.api.Api;
import com.huawei.hms.api.HuaweiApiAvailability;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.HuaweiApi;
import com.huawei.hms.common.internal.AbstractClientBuilder;
import com.huawei.hms.common.internal.Preconditions;
import com.huawei.hms.opendevice.b;
import com.huawei.hms.opendevice.g;
import com.huawei.hms.opendevice.h;
import com.huawei.hms.support.log.HMSLog;
import java.util.UUID;
import tb.fdt;
import tb.tct;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class HmsInstanceIdEx {
    public static final String TAG = "HmsInstanceIdEx";

    /* renamed from: a  reason: collision with root package name */
    private Context f5231a;
    private PushPreferences b;
    private HuaweiApi<Api.ApiOptions.NoOptions> c;

    private HmsInstanceIdEx(Context context) {
        this.b = null;
        this.f5231a = context;
        this.b = new PushPreferences(context, "aaid");
        Api api = new Api(HuaweiApiAvailability.HMS_API_NAME_PUSH);
        if (context instanceof Activity) {
            this.c = new HuaweiApi<>((Activity) context, (Api<Api.ApiOptions>) api, (Api.ApiOptions) null, (AbstractClientBuilder) new PushClientBuilder());
        } else {
            this.c = new HuaweiApi<>(context, api, (Api.ApiOptions) null, new PushClientBuilder());
        }
        this.c.setKitSdkVersion(61200300);
    }

    private String a(String str) {
        return "creationTime" + str;
    }

    public static HmsInstanceIdEx getInstance(Context context) {
        Preconditions.checkNotNull(context);
        return new HmsInstanceIdEx(context);
    }

    public void deleteAAID(String str) throws ApiException {
        if (str != null) {
            try {
                if (this.b.containsKey(str)) {
                    this.b.removeKey(str);
                    this.b.removeKey(a(str));
                }
            } catch (RuntimeException unused) {
                throw ErrorEnum.ERROR_INTERNAL_ERROR.toApiException();
            } catch (Exception unused2) {
                throw ErrorEnum.ERROR_INTERNAL_ERROR.toApiException();
            }
        } else {
            throw ErrorEnum.ERROR_ARGUMENTS_INVALID.toApiException();
        }
    }

    public String getAAId(String str) throws ApiException {
        if (str != null) {
            try {
                if (this.b.containsKey(str)) {
                    return this.b.getString(str);
                }
                String uuid = UUID.randomUUID().toString();
                this.b.saveString(str, uuid);
                this.b.saveLong(a(str), Long.valueOf(System.currentTimeMillis()));
                return uuid;
            } catch (RuntimeException unused) {
                throw ErrorEnum.ERROR_INTERNAL_ERROR.toApiException();
            } catch (Exception unused2) {
                throw ErrorEnum.ERROR_INTERNAL_ERROR.toApiException();
            }
        } else {
            throw ErrorEnum.ERROR_ARGUMENTS_INVALID.toApiException();
        }
    }

    public long getCreationTime(String str) throws ApiException {
        if (str != null) {
            try {
                if (!this.b.containsKey(a(str))) {
                    getAAId(str);
                }
                return this.b.getLong(a(str));
            } catch (RuntimeException unused) {
                throw ErrorEnum.ERROR_INTERNAL_ERROR.toApiException();
            } catch (Exception unused2) {
                throw ErrorEnum.ERROR_INTERNAL_ERROR.toApiException();
            }
        } else {
            throw ErrorEnum.ERROR_ARGUMENTS_INVALID.toApiException();
        }
    }

    public tct<TokenResult> getToken() {
        if (ProxyCenter.getProxy() != null) {
            try {
                HMSLog.i(TAG, "use proxy get token, please check HmsMessageService.onNewToken receive result.");
                ProxyCenter.getProxy().getToken(this.f5231a, null, null);
                fdt fdtVar = new fdt();
                fdtVar.d(new TokenResult());
                return fdtVar.b();
            } catch (ApiException e) {
                return a(e);
            } catch (Exception unused) {
                return a(ErrorEnum.ERROR_INTERNAL_ERROR.toApiException());
            }
        } else {
            String a2 = h.a(this.f5231a, "push.gettoken");
            try {
                TokenReq b = b.b(this.f5231a, null, null);
                b.setAaid(HmsInstanceId.getInstance(this.f5231a).getId());
                return this.c.doWrite(new g("push.gettoken", b, this.f5231a, a2));
            } catch (RuntimeException unused2) {
                Context context = this.f5231a;
                ErrorEnum errorEnum = ErrorEnum.ERROR_INTERNAL_ERROR;
                h.a(context, "push.gettoken", a2, errorEnum);
                return a(errorEnum.toApiException());
            } catch (Exception unused3) {
                Context context2 = this.f5231a;
                ErrorEnum errorEnum2 = ErrorEnum.ERROR_INTERNAL_ERROR;
                h.a(context2, "push.gettoken", a2, errorEnum2);
                return a(errorEnum2.toApiException());
            }
        }
    }

    private tct<TokenResult> a(Exception exc) {
        fdt fdtVar = new fdt();
        fdtVar.c(exc);
        return fdtVar.b();
    }
}
