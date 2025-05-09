package com.sina.weibo.sdk.b;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.text.TextUtils;
import com.taobao.codetrack.sdk.assets.AssetsDelegate;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class a {

    /* compiled from: Taobao */
    /* renamed from: com.sina.weibo.sdk.b.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class C0305a {
        public int ah;
        public String packageName = "com.sina.weibo";
        public String ag = "com.sina.weibo.SSOActivity";

        static {
            t2o.a(988807211);
        }
    }

    static {
        t2o.a(988807210);
    }

    public static boolean a(Context context, Intent intent) {
        PackageManager packageManager;
        ResolveInfo resolveActivity;
        if (context == null || (packageManager = context.getPackageManager()) == null || (resolveActivity = packageManager.resolveActivity(intent, 0)) == null) {
            return false;
        }
        try {
            Signature[] signatureArr = packageManager.getPackageInfo(resolveActivity.activityInfo.packageName, 64).signatures;
            if (signatureArr == null) {
                return false;
            }
            for (Signature signature : signatureArr) {
                if ("18da2bf10352443a00a5e046d9fca6bd".equals(d.a(signature.toByteArray()))) {
                    return true;
                }
            }
            return false;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static C0305a c(Context context) {
        return e(context);
    }

    public static boolean d(Context context) {
        C0305a e = e(context);
        if (e == null || e.ah < 10791) {
            return false;
        }
        return true;
    }

    public static C0305a e(Context context) {
        List<ResolveInfo> queryIntentServices;
        C0305a a2;
        String[] strArr = {"com.sina.weibo", "com.sina.weibog3"};
        for (int i = 0; i < 2; i++) {
            String str = strArr[i];
            Intent intent = new Intent("com.sina.weibo.action.sdkidentity");
            intent.setPackage(str);
            intent.addCategory("android.intent.category.DEFAULT");
            if (!(context == null || (queryIntentServices = context.getPackageManager().queryIntentServices(intent, 0)) == null || queryIntentServices.isEmpty())) {
                for (ResolveInfo resolveInfo : queryIntentServices) {
                    ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                    if (!(serviceInfo == null || serviceInfo.applicationInfo == null || TextUtils.isEmpty(serviceInfo.packageName))) {
                        String str2 = resolveInfo.serviceInfo.packageName;
                        if (TextUtils.equals(str, str2) && (a2 = a(context, str2)) != null) {
                            return a2;
                        }
                    }
                }
                continue;
            }
        }
        return null;
    }

    private static C0305a a(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            InputStream proxy_open = AssetsDelegate.proxy_open(context.createPackageContext(str, 2).getAssets(), "weibo_for_sdk.json");
            StringBuilder sb = new StringBuilder();
            byte[] bArr = new byte[4096];
            while (true) {
                int read = proxy_open.read(bArr, 0, 4096);
                if (read != -1) {
                    sb.append(new String(bArr, 0, read));
                } else {
                    JSONObject jSONObject = new JSONObject(sb.toString());
                    C0305a aVar = new C0305a();
                    aVar.ah = jSONObject.optInt("support_api", -1);
                    aVar.ag = jSONObject.optString("authActivityName", null);
                    aVar.packageName = str;
                    return aVar;
                }
            }
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return null;
        } catch (IOException e2) {
            e2.printStackTrace();
            return null;
        } catch (JSONException e3) {
            e3.printStackTrace();
            return null;
        }
    }
}
