package tb;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class gua<T> extends WeakReference<T> {

    /* renamed from: a  reason: collision with root package name */
    public final int f20242a;

    public gua(T t, ReferenceQueue<T> referenceQueue) {
        super(t, referenceQueue);
        int i;
        if (t != null) {
            i = t.hashCode();
        } else {
            i = 0;
        }
        this.f20242a = i;
    }
}
