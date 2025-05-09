package com.vivo.push.f;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.text.TextUtils;
import com.vivo.push.s;
import com.vivo.push.util.aa;
import com.vivo.push.util.u;
import com.vivo.push.v;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class j extends s {
    public j(v vVar) {
        super(vVar);
    }

    public static boolean a(Context context) {
        Intent intent = new Intent("com.vivo.pushservice.action.PUSH_SERVICE");
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> queryIntentServices = context.getPackageManager().queryIntentServices(intent, 576);
        if (queryIntentServices == null || queryIntentServices.size() <= 0) {
            u.a("OnChangePushStatusTask", "enableService error: can not find push service.");
            return false;
        }
        PackageManager packageManager = context.getPackageManager();
        ComponentName componentName = new ComponentName(context, queryIntentServices.get(0).serviceInfo.name);
        if (packageManager.getComponentEnabledSetting(componentName) != 1) {
            packageManager.setComponentEnabledSetting(componentName, 1, 1);
            u.d("OnChangePushStatusTask", "enableService push service.");
            return true;
        }
        u.d("OnChangePushStatusTask", "push service has enabled");
        return false;
    }

    public static boolean b(Context context) {
        Intent intent = new Intent("com.vivo.pushservice.action.PUSH_SERVICE");
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> queryIntentServices = context.getPackageManager().queryIntentServices(intent, 576);
        if (queryIntentServices == null || queryIntentServices.size() <= 0) {
            u.a("OnChangePushStatusTask", "disableService error: can not find push service.");
            return false;
        }
        PackageManager packageManager = context.getPackageManager();
        ComponentName componentName = new ComponentName(context, queryIntentServices.get(0).serviceInfo.name);
        if (packageManager.getComponentEnabledSetting(componentName) != 2) {
            packageManager.setComponentEnabledSetting(componentName, 2, 1);
            u.d("OnChangePushStatusTask", "disableService push service.");
            return true;
        }
        u.d("OnChangePushStatusTask", "push service has disabled");
        return false;
    }

    private static List<ResolveInfo> c(Context context) {
        List<ResolveInfo> list;
        Intent intent = new Intent("com.vivo.pushservice.action.RECEIVE");
        intent.setPackage(context.getPackageName());
        try {
            list = context.getPackageManager().queryBroadcastReceivers(intent, 576);
        } catch (Exception unused) {
            list = null;
        }
        if (list != null && list.size() > 0) {
            return list;
        }
        Intent intent2 = new Intent("com.vivo.pushclient.action.RECEIVE");
        intent2.setPackage(context.getPackageName());
        try {
            return context.getPackageManager().queryBroadcastReceivers(intent2, 576);
        } catch (Exception unused2) {
            return list;
        }
    }

    @Override // com.vivo.push.s
    public final void a(v vVar) {
        if (!this.f14645a.getPackageName().equals(aa.a(this.f14645a))) {
            com.vivo.push.b.j jVar = (com.vivo.push.b.j) vVar;
            int d = jVar.d();
            int e = jVar.e();
            u.d("OnChangePushStatusTask", "OnChangePushStatusTask serviceStatus is " + d + " ; receiverStatus is " + e);
            if (d == 2) {
                b(this.f14645a);
            } else if (d == 1) {
                a(this.f14645a);
            } else if (d == 0) {
                Context context = this.f14645a;
                Intent intent = new Intent("com.vivo.pushservice.action.PUSH_SERVICE");
                intent.setPackage(context.getPackageName());
                List<ResolveInfo> queryIntentServices = context.getPackageManager().queryIntentServices(intent, 576);
                if (queryIntentServices == null || queryIntentServices.size() <= 0) {
                    u.a("OnChangePushStatusTask", "defaultService error: can not find push service.");
                } else {
                    PackageManager packageManager = context.getPackageManager();
                    ComponentName componentName = new ComponentName(context, queryIntentServices.get(0).serviceInfo.name);
                    if (packageManager.getComponentEnabledSetting(componentName) != 0) {
                        packageManager.setComponentEnabledSetting(componentName, 0, 1);
                        u.d("OnChangePushStatusTask", "defaultService push service.");
                    } else {
                        u.d("OnChangePushStatusTask", "push service has defaulted");
                    }
                }
            }
            if (e == 2) {
                Context context2 = this.f14645a;
                List<ResolveInfo> c = c(context2);
                if (c == null || c.size() <= 0) {
                    u.a("OnChangePushStatusTask", "disableReceiver error: can not find push service.");
                    return;
                }
                String str = c.get(0).activityInfo.name;
                if (TextUtils.isEmpty(str)) {
                    u.d("OnChangePushStatusTask", "disableReceiver error: className is null. ");
                    return;
                }
                PackageManager packageManager2 = context2.getPackageManager();
                ComponentName componentName2 = new ComponentName(context2, str);
                if (packageManager2.getComponentEnabledSetting(componentName2) != 2) {
                    packageManager2.setComponentEnabledSetting(componentName2, 2, 1);
                    u.d("OnChangePushStatusTask", "push service disableReceiver ");
                    return;
                }
                u.d("OnChangePushStatusTask", "push service has disableReceiver ");
            } else if (e == 1) {
                Context context3 = this.f14645a;
                List<ResolveInfo> c2 = c(context3);
                if (c2 == null || c2.size() <= 0) {
                    u.a("OnChangePushStatusTask", "enableReceiver error: can not find push service.");
                    return;
                }
                String str2 = c2.get(0).activityInfo.name;
                if (TextUtils.isEmpty(str2)) {
                    u.d("OnChangePushStatusTask", "enableReceiver error: className is null. ");
                    return;
                }
                PackageManager packageManager3 = context3.getPackageManager();
                ComponentName componentName3 = new ComponentName(context3, str2);
                if (packageManager3.getComponentEnabledSetting(componentName3) != 1) {
                    packageManager3.setComponentEnabledSetting(componentName3, 1, 1);
                    u.d("OnChangePushStatusTask", "push service enableReceiver ");
                    return;
                }
                u.d("OnChangePushStatusTask", "push service has enableReceiver ");
            } else if (e == 0) {
                Context context4 = this.f14645a;
                List<ResolveInfo> c3 = c(context4);
                if (c3 == null || c3.size() <= 0) {
                    u.a("OnChangePushStatusTask", "defaultReceiver error: can not find push service.");
                    return;
                }
                String str3 = c3.get(0).activityInfo.name;
                if (TextUtils.isEmpty(str3)) {
                    u.d("OnChangePushStatusTask", "defaultReceiver error: className is null. ");
                    return;
                }
                PackageManager packageManager4 = context4.getPackageManager();
                ComponentName componentName4 = new ComponentName(context4, str3);
                if (packageManager4.getComponentEnabledSetting(componentName4) != 0) {
                    packageManager4.setComponentEnabledSetting(componentName4, 0, 1);
                    u.d("OnChangePushStatusTask", "push service defaultReceiver ");
                    return;
                }
                u.d("OnChangePushStatusTask", "push service has defaulted");
            }
        }
    }
}
