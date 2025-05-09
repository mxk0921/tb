package tb;

import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class e04 extends d04 {
    public static <T> List<T> I(List<? extends T> list) {
        ckf.g(list, "<this>");
        return new vbo(list);
    }

    public static <T> List<T> J(List<T> list) {
        ckf.g(list, "<this>");
        return new ubo(list);
    }

    public static final int K(List<?> list, int i) {
        if (i >= 0 && i <= yz3.k(list)) {
            return yz3.k(list) - i;
        }
        throw new IndexOutOfBoundsException("Element index " + i + " must be in range [" + new aef(0, yz3.k(list)) + "].");
    }

    public static final int L(List<?> list, int i) {
        return yz3.k(list) - i;
    }

    public static final int M(List<?> list, int i) {
        if (i >= 0 && i <= list.size()) {
            return list.size() - i;
        }
        throw new IndexOutOfBoundsException("Position index " + i + " must be in range [" + new aef(0, list.size()) + "].");
    }
}
