package tb;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlin.collections.builders.ListBuilder;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class xz3 {
    public static <E> List<E> a(List<E> list) {
        ckf.g(list, "builder");
        return ((ListBuilder) list).build();
    }

    public static final <T> Object[] b(T[] tArr, boolean z) {
        ckf.g(tArr, "<this>");
        if (z && ckf.b(tArr.getClass(), Object[].class)) {
            return tArr;
        }
        Object[] copyOf = Arrays.copyOf(tArr, tArr.length, Object[].class);
        ckf.f(copyOf, "copyOf(...)");
        return copyOf;
    }

    public static <E> List<E> c() {
        return new ListBuilder(0, 1, null);
    }

    public static <E> List<E> d(int i) {
        return new ListBuilder(i);
    }

    public static <T> List<T> e(T t) {
        List<T> singletonList = Collections.singletonList(t);
        ckf.f(singletonList, "singletonList(...)");
        return singletonList;
    }

    public static <T> T[] f(int i, T[] tArr) {
        ckf.g(tArr, "array");
        if (i < tArr.length) {
            tArr[i] = null;
        }
        return tArr;
    }
}
