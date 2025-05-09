package tb;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityManager;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class u60 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(729809126);
    }

    public static boolean a(Context context) throws RuntimeException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6f947fe8", new Object[]{context})).booleanValue();
        }
        if (context == null) {
            return false;
        }
        boolean isEnabled = ((AccessibilityManager) context.getSystemService("accessibility")).isEnabled();
        boolean c = c(context);
        if (!isEnabled || !c) {
            return false;
        }
        return true;
    }

    public static boolean b(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3de5b29", new Object[]{context, str})).booleanValue();
        }
        TextUtils.SimpleStringSplitter simpleStringSplitter = new TextUtils.SimpleStringSplitter(f7l.CONDITION_IF_MIDDLE);
        String string = Settings.Secure.getString(context.getApplicationContext().getContentResolver(), "enabled_accessibility_services");
        if (string != null) {
            simpleStringSplitter.setString(string);
            while (simpleStringSplitter.hasNext()) {
                if (simpleStringSplitter.next().equalsIgnoreCase(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean c(Context context) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fb8e4686", new Object[]{context})).booleanValue();
        }
        Intent intent = new Intent("android.accessibilityservice.AccessibilityService");
        intent.addCategory("android.accessibilityservice.category.FEEDBACK_SPOKEN");
        List<ResolveInfo> queryIntentServices = context.getPackageManager().queryIntentServices(intent, 0);
        if (queryIntentServices != null && queryIntentServices.size() > 0) {
            if (Build.VERSION.SDK_INT >= 26) {
                for (ResolveInfo resolveInfo : queryIntentServices) {
                    z |= b(context, resolveInfo.serviceInfo.packageName + "/" + resolveInfo.serviceInfo.name);
                }
            } else {
                ArrayList arrayList = new ArrayList();
                for (ActivityManager.RunningServiceInfo runningServiceInfo : ((ActivityManager) context.getSystemService("activity")).getRunningServices(Integer.MAX_VALUE)) {
                    arrayList.add(runningServiceInfo.service.getPackageName());
                }
                for (ResolveInfo resolveInfo2 : queryIntentServices) {
                    if (arrayList.contains(resolveInfo2.serviceInfo.packageName)) {
                        z = true;
                    }
                }
            }
        }
        return z;
    }

    public static boolean d(Context context) throws RuntimeException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bbdd879e", new Object[]{context})).booleanValue();
        }
        if (context == null) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
        boolean isEnabled = accessibilityManager.isEnabled();
        boolean isTouchExplorationEnabled = accessibilityManager.isTouchExplorationEnabled();
        if (!isEnabled || !isTouchExplorationEnabled) {
            return false;
        }
        return true;
    }
}
