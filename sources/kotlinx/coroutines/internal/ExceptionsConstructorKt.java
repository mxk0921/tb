package kotlinx.coroutines.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.Result;
import kotlin.b;
import tb.ckf;
import tb.g1a;
import tb.gyf;
import tb.jpu;
import tb.k19;
import tb.pyw;
import tb.rs3;
import tb.tt4;
import tb.wy4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class ExceptionsConstructorKt {

    /* renamed from: a  reason: collision with root package name */
    public static final int f15381a = e(Throwable.class, -1);
    public static final wy4 b;

    static {
        wy4 wy4Var;
        try {
            if (k19.a()) {
                wy4Var = pyw.INSTANCE;
            } else {
                wy4Var = rs3.INSTANCE;
            }
        } catch (Throwable unused) {
            wy4Var = pyw.INSTANCE;
        }
        b = wy4Var;
    }

    public static final <E extends Throwable> g1a<Throwable, Throwable> b(Class<E> cls) {
        Object obj;
        g1a<Throwable, Throwable> g1aVar;
        Pair pair;
        ExceptionsConstructorKt$createConstructor$nullResult$1 exceptionsConstructorKt$createConstructor$nullResult$1 = ExceptionsConstructorKt$createConstructor$nullResult$1.INSTANCE;
        if (f15381a != e(cls, 0)) {
            return exceptionsConstructorKt$createConstructor$nullResult$1;
        }
        Constructor<?>[] constructors = cls.getConstructors();
        ArrayList arrayList = new ArrayList(constructors.length);
        int length = constructors.length;
        int i = 0;
        while (true) {
            obj = null;
            if (i >= length) {
                break;
            }
            Constructor<?> constructor = constructors[i];
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            int length2 = parameterTypes.length;
            if (length2 == 0) {
                pair = jpu.a(f(new ExceptionsConstructorKt$createConstructor$1$4(constructor)), 0);
            } else if (length2 == 1) {
                Class<?> cls2 = parameterTypes[0];
                if (ckf.b(cls2, String.class)) {
                    pair = jpu.a(f(new ExceptionsConstructorKt$createConstructor$1$2(constructor)), 2);
                } else if (ckf.b(cls2, Throwable.class)) {
                    pair = jpu.a(f(new ExceptionsConstructorKt$createConstructor$1$3(constructor)), 1);
                } else {
                    pair = jpu.a(null, -1);
                }
            } else if (length2 != 2) {
                pair = jpu.a(null, -1);
            } else if (!ckf.b(parameterTypes[0], String.class) || !ckf.b(parameterTypes[1], Throwable.class)) {
                pair = jpu.a(null, -1);
            } else {
                pair = jpu.a(f(new ExceptionsConstructorKt$createConstructor$1$1(constructor)), 3);
            }
            arrayList.add(pair);
            i++;
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            obj = it.next();
            if (it.hasNext()) {
                int intValue = ((Number) ((Pair) obj).getSecond()).intValue();
                do {
                    Object next = it.next();
                    int intValue2 = ((Number) ((Pair) next).getSecond()).intValue();
                    if (intValue < intValue2) {
                        obj = next;
                        intValue = intValue2;
                    }
                } while (it.hasNext());
            }
        }
        Pair pair2 = (Pair) obj;
        if (pair2 == null || (g1aVar = (g1a) pair2.getFirst()) == null) {
            return exceptionsConstructorKt$createConstructor$nullResult$1;
        }
        return g1aVar;
    }

    public static final int c(Class<?> cls, int i) {
        do {
            int i2 = 0;
            for (Field field : cls.getDeclaredFields()) {
                if (!Modifier.isStatic(field.getModifiers())) {
                    i2++;
                }
            }
            i += i2;
            cls = cls.getSuperclass();
        } while (cls != null);
        return i;
    }

    public static /* synthetic */ int d(Class cls, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return c(cls, i);
    }

    public static final int e(Class<?> cls, int i) {
        Integer num;
        gyf.d(cls);
        try {
            num = Result.m1108constructorimpl(Integer.valueOf(d(cls, 0, 1, null)));
        } catch (Throwable th) {
            num = Result.m1108constructorimpl(b.a(th));
        }
        Integer valueOf = Integer.valueOf(i);
        if (Result.m1114isFailureimpl(num)) {
            num = valueOf;
        }
        return ((Number) num).intValue();
    }

    public static final g1a<Throwable, Throwable> f(g1a<? super Throwable, ? extends Throwable> g1aVar) {
        return new ExceptionsConstructorKt$safeCtor$1(g1aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <E extends Throwable> E g(E e) {
        Object obj;
        if (e instanceof tt4) {
            try {
                obj = Result.m1108constructorimpl(((tt4) e).createCopy());
            } catch (Throwable th) {
                obj = Result.m1108constructorimpl(b.a(th));
            }
            if (Result.m1114isFailureimpl(obj)) {
                obj = null;
            }
            return (E) ((Throwable) obj);
        }
        return (E) b.a(e.getClass()).invoke(e);
    }
}
