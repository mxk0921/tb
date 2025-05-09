package tb;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class yz3 extends xz3 {
    public static <T> ArrayList<T> g(T... tArr) {
        ckf.g(tArr, tep.KEY_UNIFORM_RESULT);
        if (tArr.length == 0) {
            return new ArrayList<>();
        }
        return new ArrayList<>(new lb1(tArr, true));
    }

    public static final <T> Collection<T> h(T[] tArr) {
        ckf.g(tArr, "<this>");
        return new lb1(tArr, false);
    }

    public static <T> List<T> i() {
        return EmptyList.INSTANCE;
    }

    public static aef j(Collection<?> collection) {
        ckf.g(collection, "<this>");
        return new aef(0, collection.size() - 1);
    }

    public static <T> int k(List<? extends T> list) {
        ckf.g(list, "<this>");
        return list.size() - 1;
    }

    public static <T> List<T> l(T... tArr) {
        ckf.g(tArr, tep.KEY_UNIFORM_RESULT);
        if (tArr.length > 0) {
            return hc1.c(tArr);
        }
        return i();
    }

    public static <T> List<T> m(T... tArr) {
        ckf.g(tArr, tep.KEY_UNIFORM_RESULT);
        if (tArr.length == 0) {
            return new ArrayList();
        }
        return new ArrayList(new lb1(tArr, true));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> List<T> n(List<? extends T> list) {
        ckf.g(list, "<this>");
        int size = list.size();
        if (size == 0) {
            return i();
        }
        if (size != 1) {
            return list;
        }
        return xz3.e(list.get(0));
    }

    public static void o() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    public static void p() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
