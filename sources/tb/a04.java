package tb;

import java.util.Enumeration;
import java.util.Iterator;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class a04 extends zz3 {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static final class a implements Iterator<T>, rzf {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Enumeration<T> f15463a;

        public a(Enumeration<T> enumeration) {
            this.f15463a = enumeration;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f15463a.hasMoreElements();
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Object] */
        @Override // java.util.Iterator
        public T next() {
            return this.f15463a.nextElement();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public static <T> Iterator<T> s(Enumeration<T> enumeration) {
        ckf.g(enumeration, "<this>");
        return new a(enumeration);
    }
}
