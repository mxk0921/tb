package com.hihonor.push.sdk.ipc;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.text.TextUtils;
import com.hihonor.push.sdk.internal.HonorPushErrorEnum;
import java.util.Iterator;
import java.util.List;
import tb.zsx;
import tb.zyn;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class HonorApiAvailability {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public enum PackageStates {
        ENABLED,
        DISABLED,
        NOT_INSTALLED
    }

    public static zyn a(Context context) {
        zyn zynVar = new zyn();
        Intent intent = new Intent();
        intent.setComponent(new ComponentName("android", "com.hihonor.android.pushagentproxy.HiPushService"));
        List<ResolveInfo> queryIntentServices = context.getPackageManager().queryIntentServices(intent, 128);
        if (queryIntentServices.size() > 0) {
            Iterator<ResolveInfo> it = queryIntentServices.iterator();
            if (it.hasNext()) {
                ResolveInfo next = it.next();
                String str = next.serviceInfo.applicationInfo.packageName;
                String d = zsx.d(context, str);
                zynVar.e(str);
                zynVar.f(next.serviceInfo.name);
                zynVar.g(d);
            }
        }
        return zynVar;
    }

    public static int b(Context context) {
        PackageStates packageStates;
        if (context != null) {
            zyn a2 = a(context);
            String b = a2.b();
            if (TextUtils.isEmpty(b)) {
                packageStates = PackageStates.NOT_INSTALLED;
            } else {
                try {
                    if (context.getPackageManager().getApplicationInfo(b, 0).enabled) {
                        packageStates = PackageStates.ENABLED;
                    } else {
                        packageStates = PackageStates.DISABLED;
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    packageStates = PackageStates.NOT_INSTALLED;
                }
            }
            if (PackageStates.NOT_INSTALLED.equals(packageStates)) {
                return 8002008;
            }
            if (PackageStates.DISABLED.equals(packageStates)) {
                return 8002007;
            }
            if (!TextUtils.equals(b, "android") || TextUtils.isEmpty(a2.d())) {
                return 8002006;
            }
            return HonorPushErrorEnum.SUCCESS.statusCode;
        }
        throw new NullPointerException("context must not be null.");
    }
}
