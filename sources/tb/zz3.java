package tb;

import java.util.Collection;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class zz3 extends yz3 {
    public static <T> int q(Iterable<? extends T> iterable, int i) {
        ckf.g(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        return i;
    }

    public static final <T> Integer r(Iterable<? extends T> iterable) {
        ckf.g(iterable, "<this>");
        if (iterable instanceof Collection) {
            return Integer.valueOf(((Collection) iterable).size());
        }
        return null;
    }
}
