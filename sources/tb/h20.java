package tb;

import java.util.Map;
import java.util.Map.Entry;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public abstract class h20<E extends Map.Entry<? extends K, ? extends V>, K, V> extends s20<E> {
    public final boolean a(E e) {
        ckf.g(e, "element");
        return c(e);
    }

    public abstract boolean c(Map.Entry<? extends K, ? extends V> entry);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        return a((Map.Entry) obj);
    }

    public abstract /* bridge */ boolean d(Map.Entry<?, ?> entry);

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        return d((Map.Entry) obj);
    }
}
