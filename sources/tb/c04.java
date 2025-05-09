package tb;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class c04 extends b04 {
    public static <T extends Comparable<? super T>> void t(List<T> list) {
        ckf.g(list, "<this>");
        if (list.size() > 1) {
            Collections.sort(list);
        }
    }

    public static <T> void u(List<T> list, Comparator<? super T> comparator) {
        ckf.g(list, "<this>");
        ckf.g(comparator, "comparator");
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }
}
