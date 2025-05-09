package tb;

import android.util.SparseArray;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class ryw<E> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ReferenceQueue<E> f27685a = new ReferenceQueue<>();
    public final SparseArray<a<E>> b = new SparseArray<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a<E> extends WeakReference<E> {

        /* renamed from: a  reason: collision with root package name */
        public final int f27686a;

        static {
            t2o.a(993001996);
        }

        public a(E e, ReferenceQueue<? super E> referenceQueue, int i) {
            super(e, referenceQueue);
            this.f27686a = i;
        }
    }

    static {
        t2o.a(993001995);
    }

    public void a(int i, E e) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6523a3de", new Object[]{this, new Integer(i), e});
            return;
        }
        c();
        this.b.append(i, new a<>(e, this.f27685a, i));
    }

    public E b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (E) ipChange.ipc$dispatch("bb5c862c", new Object[]{this, new Integer(i)});
        }
        c();
        a<E> aVar = this.b.get(i);
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
            Reference<? extends E> poll = this.f27685a.poll();
            if (poll != null) {
                this.b.remove(((a) poll).f27686a);
            } else {
                return;
            }
        }
    }
}
