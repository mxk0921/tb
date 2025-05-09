package tb;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.log.TLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class p9k {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(588251198);
    }

    public static void a(Context context, String str) {
        ActivityInfo activityInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bea7228", new Object[]{context, str});
            return;
        }
        Intent intent = new Intent();
        intent.setFlags(335544320);
        if (!TextUtils.isEmpty(str)) {
            StringBuilder sb = new StringBuilder("notification--[url:");
            sb.append(str);
            sb.append("]");
            try {
                intent.setData(Uri.parse(str));
                intent.setAction("android.intent.action.VIEW");
                String packageName = context.getPackageName();
                intent.setPackage(packageName);
                ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(intent, 65536);
                if (!(resolveActivity == null || (activityInfo = resolveActivity.activityInfo) == null)) {
                    String str2 = activityInfo.name;
                    if (!TextUtils.isEmpty(str2)) {
                        intent.setClassName(packageName, str2);
                        StringBuilder sb2 = new StringBuilder("activityInfo.name--[");
                        sb2.append(activityInfo.name);
                        sb2.append("]");
                    }
                }
            } catch (Throwable th) {
                y7t.a("NotificationUtil", "goToTargetActivity Uri.parse" + th.toString());
                TLog.loge("NotificationUtil", Log.getStackTraceString(th));
                intent = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
            }
        } else {
            intent = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
        }
        try {
            context.startActivity(intent);
        } catch (Throwable th2) {
            y7t.a("NotificationUtil", "goToTargetActivity.startActivity" + th2.toString());
            TLog.loge("NotificationUtil", Log.getStackTraceString(th2));
        }
    }

    public static void b(Context context, String str, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1c9c4a3", new Object[]{context, str, bundle});
        } else if (TextUtils.isEmpty(str)) {
            a(context, str);
        } else {
            Nav.from(context).withExtras(bundle).withFlags(335544320).toUri(str);
        }
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("17b4fbbb", new Object[0])).booleanValue();
        }
        return "1".equals(OrangeConfig.getInstance().getConfig("mpm_business_switch", "use_new_agoo_notification_burying_point", "1"));
    }
}
