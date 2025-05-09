package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Method;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class alz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(435159136);
    }

    public static <T> T a(String str, String str2, Class<?> cls, Object... objArr) {
        try {
            Method declaredMethod = Class.forName(str).getDeclaredMethod(str2, cls);
            declaredMethod.setAccessible(true);
            return (T) declaredMethod.invoke(null, objArr);
        } catch (Throwable th) {
            ggh.d("invokeStaticMethod error: " + th);
            return null;
        }
    }
}
