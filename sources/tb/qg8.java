package tb;

import android.os.Build;
import android.os.Process;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.android.SystemUtils;
import java.lang.reflect.Method;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class qg8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(970981420);
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8b4e6f9c", new Object[0])).booleanValue();
        }
        if (Build.VERSION.SDK_INT > 28) {
            return false;
        }
        String str = Build.BRAND;
        if (str.equalsIgnoreCase(SystemUtils.PRODUCT_HUAWEI) || str.equalsIgnoreCase(SystemUtils.PRODUCT_HONOR)) {
            return true;
        }
        return false;
    }

    public static boolean c() {
        Object invoke;
        boolean is64Bit;
        if (Build.VERSION.SDK_INT >= 23) {
            is64Bit = Process.is64Bit();
            return is64Bit;
        }
        try {
            Class<?> cls = Class.forName("dalvik.system.VMRuntime");
            Method declaredMethod = cls.getDeclaredMethod("is64Bit", new Class[0]);
            declaredMethod.setAccessible(true);
            Method declaredMethod2 = cls.getDeclaredMethod("getRuntime", new Class[0]);
            declaredMethod2.setAccessible(true);
            Object invoke2 = declaredMethod2.invoke(null, new Object[0]);
            if (!(invoke2 == null || (invoke = declaredMethod.invoke(invoke2, new Object[0])) == null)) {
                return ((Boolean) invoke).booleanValue();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return true;
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c1a74d8d", new Object[0])).booleanValue();
        }
        if (!c() || b() || Build.VERSION.SDK_INT <= 23) {
            return true;
        }
        return false;
    }

    public static boolean e(j1r j1rVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7646d13f", new Object[]{j1rVar})).booleanValue();
        }
        if (!c() || b() || a(j1rVar)) {
            return true;
        }
        return false;
    }

    public static boolean a(j1r j1rVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ddb14a65", new Object[]{j1rVar})).booleanValue();
        }
        return Build.VERSION.SDK_INT <= 23 && j1rVar.c("isBelow23", true);
    }
}
