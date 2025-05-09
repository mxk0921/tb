package tb;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Process;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Method;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class cwi {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final cwi INSTANCE = new cwi();

    public final Intent a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("4f1bdf43", new Object[]{this, context});
        }
        ckf.g(context, "context");
        try {
            try {
                Intent intent = new Intent();
                intent.setClassName("com.miui.securitycenter", "com.miui.permcenter.permissions.PermissionsEditorActivity");
                intent.putExtra("extra_pkgname", context.getPackageName());
                return intent;
            } catch (Exception unused) {
                return null;
            }
        } catch (Exception unused2) {
            Intent intent2 = new Intent("miui.intent.action.APP_PERM_EDITOR");
            intent2.setClassName("com.miui.securitycenter", "com.miui.permcenter.permissions.AppPermissionsEditorActivity");
            intent2.putExtra("extra_pkgname", context.getPackageName());
            return intent2;
        }
    }

    public final boolean b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a2f9c3f5", new Object[]{this, context})).booleanValue();
        }
        ckf.g(context, "context");
        return d3k.INSTANCE.e(context) & c(context, 10016);
    }

    public final boolean c(Context context, int i) {
        Object systemService;
        boolean z = false;
        if (!d()) {
            return true;
        }
        try {
            systemService = context.getSystemService("appops");
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (systemService != null) {
            AppOpsManager appOpsManager = (AppOpsManager) systemService;
            Class<?> cls = appOpsManager.getClass();
            Class<?> cls2 = Integer.TYPE;
            Method declaredMethod = cls.getDeclaredMethod("checkOpNoThrow", cls2, cls2, String.class);
            ckf.f(declaredMethod, "checkOpNoThrow");
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(appOpsManager, Integer.valueOf(i), Integer.valueOf(Process.myUid()), context.getPackageName());
            if (!(invoke instanceof Integer)) {
                invoke = null;
            }
            Integer num = (Integer) invoke;
            if (num != null && num.intValue() == 0) {
                z = true;
            }
            return z;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.app.AppOpsManager");
    }

    public final boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b664cce5", new Object[]{this})).booleanValue();
        }
        return tsq.x("xiaomi", Build.MANUFACTURER, true);
    }
}
