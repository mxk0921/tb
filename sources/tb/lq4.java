package tb;

import android.content.Context;
import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Field;
import java.util.concurrent.ThreadPoolExecutor;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class lq4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static Field f23507a;

    public static boolean a(Context context) {
        Field field;
        try {
            Field[] fieldArr = (Field[]) Class.class.getDeclaredMethod("getDeclaredFields", new Class[0]).invoke(context.getClass(), new Object[0]);
            int length = fieldArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                Field field2 = fieldArr[i];
                if ("mFlags".equals(field2.getName())) {
                    f23507a = field2;
                    break;
                }
                i++;
            }
            field = f23507a;
        } catch (Throwable unused) {
        }
        if (field == null) {
            return false;
        }
        field.setAccessible(true);
        int intValue = ((Integer) field.get(context)).intValue();
        if ((intValue & 16) == 16) {
            field.set(context, Integer.valueOf(intValue & (-17)));
            field.setAccessible(false);
            return true;
        }
        return false;
    }

    public static void b() {
        if (Build.VERSION.SDK_INT > 34) {
            try {
                Field a2 = gun.a(Class.forName("android.app.SharedPreferencesImpl"), "sLoadExecutor");
                a2.setAccessible(true);
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) a2.get(null);
                if (threadPoolExecutor.getMaximumPoolSize() == 1) {
                    int a3 = jrt.a(0.5d);
                    threadPoolExecutor.setCorePoolSize(a3);
                    threadPoolExecutor.setMaximumPoolSize(a3);
                    jdh.a("ContextImplHook", "opt thread pool success from 1 to %d", Integer.valueOf(a3));
                }
            } catch (Throwable th) {
                jdh.a("ContextImplHook", "opt thread poll failed due to", th);
            }
        }
    }
}
