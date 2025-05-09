package tb;

import java.util.ArrayDeque;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlinx.coroutines.internal.ExceptionsConstructorKt;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class rgq {

    /* renamed from: a  reason: collision with root package name */
    public static final StackTraceElement f27370a = new pc1().a();
    public static final String b;
    public static final String c;

    static {
        Object obj;
        Object obj2;
        try {
            obj = Result.m1108constructorimpl(BaseContinuationImpl.class.getCanonicalName());
        } catch (Throwable th) {
            obj = Result.m1108constructorimpl(b.a(th));
        }
        if (Result.m1111exceptionOrNullimpl(obj) != null) {
            obj = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        b = (String) obj;
        try {
            obj2 = Result.m1108constructorimpl(rgq.class.getCanonicalName());
        } catch (Throwable th2) {
            obj2 = Result.m1108constructorimpl(b.a(th2));
        }
        if (Result.m1111exceptionOrNullimpl(obj2) != null) {
            obj2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
        c = (String) obj2;
    }

    public static final <E extends Throwable> Pair<E, StackTraceElement[]> b(E e) {
        Throwable cause = e.getCause();
        if (cause == null || !ckf.b(cause.getClass(), e.getClass())) {
            return jpu.a(e, new StackTraceElement[0]);
        }
        StackTraceElement[] stackTrace = e.getStackTrace();
        for (StackTraceElement stackTraceElement : stackTrace) {
            if (g(stackTraceElement)) {
                return jpu.a(cause, stackTrace);
            }
        }
        return jpu.a(e, new StackTraceElement[0]);
    }

    public static final <E extends Throwable> E c(E e, E e2, ArrayDeque<StackTraceElement> arrayDeque) {
        arrayDeque.addFirst(f27370a);
        StackTraceElement[] stackTrace = e.getStackTrace();
        int f = f(stackTrace, b);
        int i = 0;
        if (f == -1) {
            e2.setStackTrace((StackTraceElement[]) arrayDeque.toArray(new StackTraceElement[0]));
            return e2;
        }
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[arrayDeque.size() + f];
        for (int i2 = 0; i2 < f; i2++) {
            stackTraceElementArr[i2] = stackTrace[i2];
        }
        Iterator<StackTraceElement> it = arrayDeque.iterator();
        while (it.hasNext()) {
            int i3 = i + 1;
            stackTraceElementArr[i + f] = it.next();
            i = i3;
        }
        e2.setStackTrace(stackTraceElementArr);
        return e2;
    }

    public static final ArrayDeque<StackTraceElement> d(vu4 vu4Var) {
        ArrayDeque<StackTraceElement> arrayDeque = new ArrayDeque<>();
        StackTraceElement stackTraceElement = vu4Var.getStackTraceElement();
        if (stackTraceElement != null) {
            arrayDeque.add(stackTraceElement);
        }
        while (true) {
            vu4Var = vu4Var.getCallerFrame();
            if (vu4Var == null) {
                return arrayDeque;
            }
            StackTraceElement stackTraceElement2 = vu4Var.getStackTraceElement();
            if (stackTraceElement2 != null) {
                arrayDeque.add(stackTraceElement2);
            }
        }
    }

    public static final boolean e(StackTraceElement stackTraceElement, StackTraceElement stackTraceElement2) {
        if (stackTraceElement.getLineNumber() != stackTraceElement2.getLineNumber() || !ckf.b(stackTraceElement.getMethodName(), stackTraceElement2.getMethodName()) || !ckf.b(stackTraceElement.getFileName(), stackTraceElement2.getFileName()) || !ckf.b(stackTraceElement.getClassName(), stackTraceElement2.getClassName())) {
            return false;
        }
        return true;
    }

    public static final int f(StackTraceElement[] stackTraceElementArr, String str) {
        int length = stackTraceElementArr.length;
        for (int i = 0; i < length; i++) {
            if (ckf.b(str, stackTraceElementArr[i].getClassName())) {
                return i;
            }
        }
        return -1;
    }

    public static final boolean g(StackTraceElement stackTraceElement) {
        return tsq.I(stackTraceElement.getClassName(), ou4.c(), false, 2, null);
    }

    public static final void h(StackTraceElement[] stackTraceElementArr, ArrayDeque<StackTraceElement> arrayDeque) {
        int length = stackTraceElementArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            } else if (g(stackTraceElementArr[i])) {
                break;
            } else {
                i++;
            }
        }
        int i2 = i + 1;
        int length2 = stackTraceElementArr.length - 1;
        if (i2 <= length2) {
            while (true) {
                if (e(stackTraceElementArr[length2], arrayDeque.getLast())) {
                    arrayDeque.removeLast();
                }
                arrayDeque.addFirst(stackTraceElementArr[length2]);
                if (length2 != i2) {
                    length2--;
                } else {
                    return;
                }
            }
        }
    }

    public static final <E extends Throwable> E i(E e, vu4 vu4Var) {
        Pair b2 = b(e);
        Throwable th = (Throwable) b2.component1();
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) b2.component2();
        Throwable g = ExceptionsConstructorKt.g(th);
        if (g == null) {
            return e;
        }
        ArrayDeque<StackTraceElement> d = d(vu4Var);
        if (d.isEmpty()) {
            return e;
        }
        if (th != e) {
            h(stackTraceElementArr, d);
        }
        return (E) c(th, g, d);
    }

    public static final <E extends Throwable> E j(E e) {
        if (!dv6.c()) {
            return e;
        }
        E e2 = (E) ExceptionsConstructorKt.g(e);
        if (e2 == null) {
            return e;
        }
        k(e2);
        return e2;
    }

    public static final <E extends Throwable> E k(E e) {
        int i;
        StackTraceElement stackTraceElement;
        StackTraceElement[] stackTrace = e.getStackTrace();
        int length = stackTrace.length;
        int length2 = stackTrace.length - 1;
        if (length2 >= 0) {
            while (true) {
                int i2 = length2 - 1;
                if (ckf.b(c, stackTrace[length2].getClassName())) {
                    break;
                } else if (i2 < 0) {
                    break;
                } else {
                    length2 = i2;
                }
            }
        }
        length2 = -1;
        int i3 = length2 + 1;
        int f = f(stackTrace, b);
        if (f == -1) {
            i = 0;
        } else {
            i = length - f;
        }
        int i4 = (length - length2) - i;
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[i4];
        for (int i5 = 0; i5 < i4; i5++) {
            if (i5 == 0) {
                stackTraceElement = f27370a;
            } else {
                stackTraceElement = stackTrace[(i3 + i5) - 1];
            }
            stackTraceElementArr[i5] = stackTraceElement;
        }
        e.setStackTrace(stackTraceElementArr);
        return e;
    }

    public static final <E extends Throwable> E l(E e) {
        E e2 = (E) e.getCause();
        if (e2 != null && ckf.b(e2.getClass(), e.getClass())) {
            for (StackTraceElement stackTraceElement : e.getStackTrace()) {
                if (g(stackTraceElement)) {
                    return e2;
                }
            }
        }
        return e;
    }
}
