package tb;

import java.util.Arrays;
import kotlin.KotlinNullPointerException;
import kotlin.UninitializedPropertyAccessException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class ckf {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static class a {
    }

    public static boolean a(Float f, float f2) {
        if (f == null || f.floatValue() != f2) {
            return false;
        }
        return true;
    }

    public static boolean b(Object obj, Object obj2) {
        if (obj != null) {
            return obj.equals(obj2);
        }
        if (obj2 == null) {
            return true;
        }
        return false;
    }

    public static void c(Object obj, String str) {
        if (obj == null) {
            IllegalStateException illegalStateException = new IllegalStateException(str + " must not be null");
            n(illegalStateException);
            throw illegalStateException;
        }
    }

    public static void d(Object obj) {
        if (obj == null) {
            q();
            throw null;
        }
    }

    public static void e(Object obj, String str) {
        if (obj == null) {
            r(str);
            throw null;
        }
    }

    public static void f(Object obj, String str) {
        if (obj == null) {
            NullPointerException nullPointerException = new NullPointerException(str + " must not be null");
            n(nullPointerException);
            throw nullPointerException;
        }
    }

    public static void g(Object obj, String str) {
        if (obj == null) {
            u(str);
            throw null;
        }
    }

    public static void h(Object obj, String str) {
        if (obj == null) {
            t(str);
            throw null;
        }
    }

    public static int i(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        if (i == i2) {
            return 0;
        }
        return 1;
    }

    public static int j(long j, long j2) {
        int i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
        if (i < 0) {
            return -1;
        }
        if (i == 0) {
            return 0;
        }
        return 1;
    }

    public static String k(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        String name = ckf.class.getName();
        int i = 0;
        while (!stackTrace[i].getClassName().equals(name)) {
            i++;
        }
        while (stackTrace[i].getClassName().equals(name)) {
            i++;
        }
        StackTraceElement stackTraceElement = stackTrace[i];
        String className = stackTraceElement.getClassName();
        String methodName = stackTraceElement.getMethodName();
        return "Parameter specified as non-null is null: method " + className + "." + methodName + ", parameter " + str;
    }

    public static void l() {
        v();
        throw null;
    }

    public static void m(int i, String str) {
        v();
        throw null;
    }

    public static <T extends Throwable> T n(T t) {
        o(t, ckf.class.getName());
        return t;
    }

    public static <T extends Throwable> T o(T t, String str) {
        StackTraceElement[] stackTrace = t.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        t.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i + 1, length));
        return t;
    }

    public static String p(String str, Object obj) {
        return str + obj;
    }

    public static void q() {
        NullPointerException nullPointerException = new NullPointerException();
        n(nullPointerException);
        throw nullPointerException;
    }

    public static void r(String str) {
        NullPointerException nullPointerException = new NullPointerException(str);
        n(nullPointerException);
        throw nullPointerException;
    }

    public static void s() {
        KotlinNullPointerException kotlinNullPointerException = new KotlinNullPointerException();
        n(kotlinNullPointerException);
        throw kotlinNullPointerException;
    }

    public static void t(String str) {
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(k(str));
        n(illegalArgumentException);
        throw illegalArgumentException;
    }

    public static void u(String str) {
        NullPointerException nullPointerException = new NullPointerException(k(str));
        n(nullPointerException);
        throw nullPointerException;
    }

    public static void v() {
        w("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
        throw null;
    }

    public static void w(String str) {
        throw new UnsupportedOperationException(str);
    }

    public static void x(String str) {
        UninitializedPropertyAccessException uninitializedPropertyAccessException = new UninitializedPropertyAccessException(str);
        n(uninitializedPropertyAccessException);
        throw uninitializedPropertyAccessException;
    }

    public static void y(String str) {
        x("lateinit property " + str + " has not been initialized");
        throw null;
    }
}
