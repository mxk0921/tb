package tb;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.EmptySet;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class kfp extends jfp {
    public static <T> Set<T> d() {
        return EmptySet.INSTANCE;
    }

    public static <T> HashSet<T> e(T... tArr) {
        ckf.g(tArr, tep.KEY_UNIFORM_RESULT);
        HashSet<T> hashSet = new HashSet<>(v3i.e(tArr.length));
        ic1.f0(tArr, hashSet);
        return hashSet;
    }

    public static <T> Set<T> f(T... tArr) {
        ckf.g(tArr, tep.KEY_UNIFORM_RESULT);
        LinkedHashSet linkedHashSet = new LinkedHashSet(v3i.e(tArr.length));
        ic1.f0(tArr, linkedHashSet);
        return linkedHashSet;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> Set<T> g(Set<? extends T> set) {
        ckf.g(set, "<this>");
        int size = set.size();
        if (size == 0) {
            return d();
        }
        if (size != 1) {
            return set;
        }
        return jfp.c(set.iterator().next());
    }

    public static <T> Set<T> h(T... tArr) {
        ckf.g(tArr, tep.KEY_UNIFORM_RESULT);
        return ic1.k0(tArr);
    }
}
