package tb;

import android.os.Build;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Method;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class aun {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(615514152);
    }

    public static Method a(Class<?> cls, String str, Class<?>... clsArr) {
        if (cls != null) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    if (Build.VERSION.SDK_INT >= 28) {
                        return (Method) Class.class.getDeclaredMethod("getDeclaredMethod", String.class, Class[].class).invoke(cls, str, clsArr);
                    }
                    return cls.getDeclaredMethod(str, clsArr);
                }
            } catch (Throwable th) {
                idh.c("ReflectUtils", "getHiddenMethod", th);
            }
        }
        return null;
    }
}
