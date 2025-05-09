package tb;

import java.lang.reflect.Method;
import kotlin.random.Random;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class c5m {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static final class a {
        public static final a INSTANCE = new a();
        public static final Method addSuppressed;
        public static final Method getSuppressed;

        static {
            Method method;
            Method method2;
            Method[] methods = Throwable.class.getMethods();
            ckf.d(methods);
            int length = methods.length;
            int i = 0;
            int i2 = 0;
            while (true) {
                method = null;
                if (i2 >= length) {
                    method2 = null;
                    break;
                }
                method2 = methods[i2];
                if (ckf.b(method2.getName(), "addSuppressed")) {
                    Class<?>[] parameterTypes = method2.getParameterTypes();
                    ckf.f(parameterTypes, "getParameterTypes(...)");
                    if (ckf.b(ic1.Y(parameterTypes), Throwable.class)) {
                        break;
                    }
                }
                i2++;
            }
            addSuppressed = method2;
            int length2 = methods.length;
            while (true) {
                if (i >= length2) {
                    break;
                }
                Method method3 = methods[i];
                if (ckf.b(method3.getName(), "getSuppressed")) {
                    method = method3;
                    break;
                }
                i++;
            }
            getSuppressed = method;
        }
    }

    public void a(Throwable th, Throwable th2) {
        ckf.g(th, "cause");
        ckf.g(th2, "exception");
        Method method = a.addSuppressed;
        if (method != null) {
            method.invoke(th, th2);
        }
    }

    public Random b() {
        return new zz8();
    }
}
