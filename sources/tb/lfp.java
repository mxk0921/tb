package tb;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class lfp extends kfp {
    public static <T> Set<T> i(Set<? extends T> set, Iterable<? extends T> iterable) {
        ckf.g(set, "<this>");
        ckf.g(iterable, tep.KEY_UNIFORM_RESULT);
        Collection<?> x = d04.x(iterable);
        if (x.isEmpty()) {
            return i04.G0(set);
        }
        if (x instanceof Set) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (T t : set) {
                if (!((Set) x).contains(t)) {
                    linkedHashSet.add(t);
                }
            }
            return linkedHashSet;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet(set);
        linkedHashSet2.removeAll(x);
        return linkedHashSet2;
    }

    public static <T> Set<T> j(Set<? extends T> set, Iterable<? extends T> iterable) {
        int i;
        ckf.g(set, "<this>");
        ckf.g(iterable, tep.KEY_UNIFORM_RESULT);
        Integer r = zz3.r(iterable);
        if (r != null) {
            i = set.size() + r.intValue();
        } else {
            i = set.size() * 2;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(v3i.e(i));
        linkedHashSet.addAll(set);
        d04.v(linkedHashSet, iterable);
        return linkedHashSet;
    }
}
