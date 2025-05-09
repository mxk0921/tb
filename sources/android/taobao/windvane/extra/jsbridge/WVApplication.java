package android.taobao.windvane.extra.jsbridge;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import com.alibaba.wireless.aliprivacy.AliPrivacyCore;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import org.json.JSONException;
import org.json.JSONObject;
import tb.itw;
import tb.kpw;
import tb.nsw;
import tb.t2o;
import tb.vpw;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class WVApplication extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(989855955);
    }

    private void getNotificationSettings(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8acc54b2", new Object[]{this, wVCallBackContext, str});
            return;
        }
        nsw nswVar = new nsw();
        if (Build.VERSION.SDK_INT < 22) {
            nswVar.b("status", "unknown");
            wVCallBackContext.success(nswVar);
        } else if (!itw.d(this.mContext)) {
            nswVar.b("status", "denied");
            wVCallBackContext.success(nswVar);
        } else {
            nswVar.b("status", "authorized");
            wVCallBackContext.success(nswVar);
        }
    }

    public static /* synthetic */ Object ipc$super(WVApplication wVApplication, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in android/taobao/windvane/extra/jsbridge/WVApplication");
    }

    private void openSettings(WVCallBackContext wVCallBackContext, String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d10e0f5b", new Object[]{this, wVCallBackContext, str});
            return;
        }
        try {
            try {
                str2 = new JSONObject(str).optString("type", "");
            } catch (JSONException unused) {
                wVCallBackContext.error(new nsw("HY_PARAM_ERR"));
                str2 = null;
            }
            if ("Notification".equals(str2)) {
                vpw.b();
                if (!vpw.commonConfig.v0 || Build.VERSION.SDK_INT < 26) {
                    Intent intent = new Intent();
                    intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
                    intent.putExtra("app_package", this.mContext.getPackageName());
                    intent.putExtra("app_uid", this.mContext.getApplicationInfo().uid);
                    Context context = this.mContext;
                    if (context != null) {
                        context.startActivity(intent);
                        wVCallBackContext.success();
                        return;
                    }
                } else {
                    Intent intent2 = new Intent();
                    intent2.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
                    intent2.putExtra("android.provider.extra.APP_PACKAGE", this.mContext.getPackageName());
                    Context context2 = this.mContext;
                    if (context2 != null) {
                        context2.startActivity(intent2);
                        wVCallBackContext.success();
                        return;
                    }
                }
                nsw nswVar = new nsw();
                nswVar.b("msg", "fail to open Notification Settings");
                wVCallBackContext.error(nswVar);
                return;
            }
            Intent intent3 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            Context context3 = this.mContext;
            if (context3 != null) {
                intent3.setData(Uri.fromParts("package", context3.getPackageName(), null));
                this.mContext.startActivity(intent3);
                wVCallBackContext.success();
                return;
            }
            nsw nswVar2 = new nsw();
            nswVar2.b("msg", "fail to open Application Settings");
            wVCallBackContext.error(nswVar2);
        } catch (Throwable unused2) {
            wVCallBackContext.error();
        }
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if ("getNotificationSettings".equals(str)) {
            getNotificationSettings(wVCallBackContext, str2);
        } else if (!AliPrivacyCore.SETTINGS_CONFIG_KEY.equals(str)) {
            return false;
        } else {
            openSettings(wVCallBackContext, str2);
        }
        return true;
    }
}
