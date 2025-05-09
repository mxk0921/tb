package com.sina.weibo.sdk;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import com.sina.weibo.sdk.auth.AuthInfo;
import com.sina.weibo.sdk.b.a;
import com.sina.weibo.sdk.openapi.SdkListener;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f5984a = false;
    private static AuthInfo b;

    static {
        t2o.a(988807170);
    }

    public static void a(AuthInfo authInfo, SdkListener sdkListener) {
        if (f5984a) {
            return;
        }
        if (authInfo != null) {
            b = authInfo;
            f5984a = true;
            if (sdkListener != null) {
                sdkListener.onInitSuccess();
                return;
            }
            return;
        }
        throw new RuntimeException("authInfo must not be null.");
    }

    public static boolean b(Context context) {
        a.C0305a e;
        if (!a(context) || (e = com.sina.weibo.sdk.b.a.e(context)) == null || e.ah < 10772) {
            return false;
        }
        return true;
    }

    public static boolean a(Context context) {
        List<ResolveInfo> queryIntentServices;
        String[] strArr = {"com.sina.weibo", "com.sina.weibog3"};
        for (int i = 0; i < 2; i++) {
            String str = strArr[i];
            Intent intent = new Intent("com.sina.weibo.action.sdkidentity");
            intent.setPackage(str);
            intent.addCategory("android.intent.category.DEFAULT");
            if (!(context == null || (queryIntentServices = context.getPackageManager().queryIntentServices(intent, 0)) == null || queryIntentServices.isEmpty())) {
                return true;
            }
        }
        return false;
    }

    public static AuthInfo a() {
        if (f5984a) {
            return b;
        }
        throw new RuntimeException("please init sdk before use it. Wb.install()");
    }
}
