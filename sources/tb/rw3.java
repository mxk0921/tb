package tb;

import java.lang.Comparable;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public interface rw3<T extends Comparable<? super T>> {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static final class a {
        public static <T extends Comparable<? super T>> boolean a(rw3<T> rw3Var, T t) {
            ckf.g(t, "value");
            if (t.compareTo(rw3Var.getStart()) < 0 || t.compareTo(rw3Var.getEndInclusive()) > 0) {
                return false;
            }
            return true;
        }

        public static <T extends Comparable<? super T>> boolean b(rw3<T> rw3Var) {
            if (rw3Var.getStart().compareTo(rw3Var.getEndInclusive()) > 0) {
                return true;
            }
            return false;
        }
    }

    T getEndInclusive();

    T getStart();

    boolean isEmpty();
}
