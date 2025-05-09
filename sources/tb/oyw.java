package tb;

import androidx.collection.LongSparseArray;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class oyw<E> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ReferenceQueue<E> f25755a = new ReferenceQueue<>();
    public final LongSparseArray<a<E>> b = new LongSparseArray<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a<E> extends WeakReference<E> {

        /* renamed from: a  reason: collision with root package name */
        public final long f25756a;

        static {
            t2o.a(993001994);
        }

        public a(E e, ReferenceQueue<? super E> referenceQueue, long j) {
            super(e, referenceQueue);
            this.f25756a = j;
        }
    }

    static {
        t2o.a(993001993);
    }

    public void a(long j, E e) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71bc995f", new Object[]{this, new Long(j), e});
            return;
        }
        c();
        this.b.append(j, new a<>(e, this.f25755a, j));
    }

    public E b(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (E) ipChange.ipc$dispatch("a2fe5c8b", new Object[]{this, new Long(j)});
        }
        c();
        a<E> aVar = this.b.get(j);
        if (aVar != null) {
            return aVar.get();
        }
        return null;
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c528079", new Object[]{this});
            return;
        }
        while (true) {
            Reference<? extends E> poll = this.f25755a.poll();
            if (poll != null) {
                this.b.remove(((a) poll).f25756a);
            } else {
                return;
            }
        }
    }
}
