package tb;

import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class oqt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Field f25582a;
    public static final Field b;

    public static void a(Thread thread, Thread thread2) {
        Object obj;
        Object obj2;
        synchronized (oqt.class) {
            try {
                Field field = f25582a;
                if (!(field == null || (obj2 = field.get(thread2)) == null)) {
                    field.set(thread, obj2);
                    field.set(thread2, null);
                }
                Field field2 = b;
                if (!(field2 == null || (obj = field2.get(thread2)) == null)) {
                    field2.set(thread, obj);
                    field2.set(thread2, null);
                }
            }
        }
    }

    public static void b(Thread thread, Thread thread2) {
        Object obj;
        Object obj2;
        synchronized (oqt.class) {
            try {
                Field field = f25582a;
                if (!(field == null || (obj2 = field.get(thread)) == null)) {
                    field.set(thread2, obj2);
                }
                Field field2 = b;
                if (!(field2 == null || (obj = field2.get(thread)) == null)) {
                    field2.set(thread2, obj);
                }
            }
        }
    }

    static {
        Throwable th;
        Method declaredMethod;
        Field field;
        t2o.a(969932809);
        int i = Build.VERSION.SDK_INT;
        Field field2 = null;
        try {
            declaredMethod = Class.class.getDeclaredMethod("getDeclaredField", String.class);
            declaredMethod.setAccessible(true);
            if (i > 23) {
                field = (Field) declaredMethod.invoke(Thread.class, "threadLocals");
            } else {
                field = (Field) declaredMethod.invoke(Thread.class, "localValues");
            }
        } catch (Throwable th2) {
            th = th2;
            field2 = null;
        }
        try {
            field2.setAccessible(true);
            if (i > 23) {
                field2 = (Field) declaredMethod.invoke(Thread.class, "inheritableThreadLocals");
            } else {
                field2 = (Field) declaredMethod.invoke(Thread.class, "inheritableValues");
            }
            field2.setAccessible(true);
        } catch (Throwable th3) {
            th = th3;
            field2 = field2;
            try {
                ghh.c(th);
            } finally {
                f25582a = field2;
                b = field2;
            }
        }
    }
}
