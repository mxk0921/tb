package tb;

import java.util.Collections;
import java.util.Set;
import kotlin.collections.builders.SetBuilder;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class jfp {
    public static <E> Set<E> a(Set<E> set) {
        ckf.g(set, "builder");
        return ((SetBuilder) set).build();
    }

    public static <E> Set<E> b(int i) {
        return new SetBuilder(i);
    }

    public static <T> Set<T> c(T t) {
        Set<T> singleton = Collections.singleton(t);
        ckf.f(singleton, "singleton(...)");
        return singleton;
    }
}
