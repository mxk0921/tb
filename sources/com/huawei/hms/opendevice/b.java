package com.huawei.hms.opendevice;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.hms.aaid.HmsInstanceId;
import com.huawei.hms.aaid.entity.DeleteTokenReq;
import com.huawei.hms.aaid.entity.TokenReq;
import com.huawei.hms.aaid.utils.PushPreferences;
import com.huawei.hms.push.HmsMessaging;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.Util;
import java.util.UUID;
import tb.syx;
import tb.t2;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class b {
    public static DeleteTokenReq a(Context context, String str, String str2, String str3, String str4) {
        DeleteTokenReq deleteTokenReq = new DeleteTokenReq();
        deleteTokenReq.setAppId(str);
        deleteTokenReq.setScope(str4);
        deleteTokenReq.setProjectId(str2);
        deleteTokenReq.setPkgName(context.getPackageName());
        deleteTokenReq.setSubjectId(str3);
        if (TextUtils.isEmpty(str)) {
            deleteTokenReq.setAppId(Util.getAppId(context));
        }
        if (TextUtils.isEmpty(str4)) {
            deleteTokenReq.setScope(HmsMessaging.DEFAULT_TOKEN_SCOPE);
        }
        if (TextUtils.isEmpty(str2)) {
            deleteTokenReq.setProjectId(c(context));
        }
        return deleteTokenReq;
    }

    public static TokenReq b(Context context, String str, String str2) {
        return b(context, str, null, null, str2);
    }

    public static String c(Context context) {
        return ((syx) t2.b(context)).getString("client/project_id");
    }

    public static boolean d(Context context) {
        Bundle bundle;
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            if (!(applicationInfo == null || (bundle = applicationInfo.metaData) == null)) {
                if (!TextUtils.isEmpty(bundle.getString("com.huawei.hms.client.service.name:base"))) {
                    return true;
                }
            }
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
            HMSLog.e(HmsInstanceId.TAG, "isIntegratedBaseSdk failed.");
            return true;
        }
    }

    public static TokenReq b(Context context, String str) {
        return b(context, null, null, str, null);
    }

    public static TokenReq b(Context context, String str, String str2, String str3, String str4) {
        TokenReq tokenReq = new TokenReq();
        tokenReq.setPackageName(context.getPackageName());
        tokenReq.setAppId(str);
        tokenReq.setScope(str4);
        tokenReq.setProjectId(str2);
        tokenReq.setSubjectId(str3);
        tokenReq.setMultiSender(false);
        if (TextUtils.isEmpty(str)) {
            tokenReq.setAppId(Util.getAppId(context));
        }
        if (TextUtils.isEmpty(str2)) {
            tokenReq.setProjectId(c(context));
        }
        if (TextUtils.isEmpty(str4)) {
            tokenReq.setScope(HmsMessaging.DEFAULT_TOKEN_SCOPE);
        }
        i a2 = i.a(context);
        if (!a2.getBoolean("hasRequestAgreement")) {
            tokenReq.setFirstTime(true);
            a2.saveBoolean("hasRequestAgreement", true);
        } else {
            tokenReq.setFirstTime(false);
        }
        return tokenReq;
    }

    public static DeleteTokenReq a(Context context, String str, String str2) {
        return a(context, str, null, null, str2);
    }

    public static DeleteTokenReq a(Context context, String str) {
        return a(context, null, null, str, null);
    }

    public static DeleteTokenReq a(Context context) {
        return a(context, null, null, null, null);
    }

    public static synchronized String b(Context context) {
        String str;
        synchronized (b.class) {
            try {
                PushPreferences pushPreferences = new PushPreferences(context, "aaid");
                if (pushPreferences.containsKey("aaid")) {
                    str = pushPreferences.getString("aaid");
                } else {
                    str = UUID.randomUUID().toString();
                    pushPreferences.saveString("aaid", str);
                    pushPreferences.saveLong("creationTime", Long.valueOf(System.currentTimeMillis()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }
}
