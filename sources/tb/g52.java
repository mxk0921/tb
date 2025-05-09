package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class g52<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final int b;
    public final y0a<T, Void, Throwable> c;
    public final int d;

    /* renamed from: a  reason: collision with root package name */
    public final ConcurrentLinkedQueue<T> f19729a = new ConcurrentLinkedQueue<>();
    public boolean e = false;
    public final Runnable f = new Runnable() { // from class: tb.f52
        @Override // java.lang.Runnable
        public final void run() {
            g52.this.d();
        }
    };

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ArrayList f19730a;

        public a(ArrayList arrayList) {
            this.f19730a = arrayList;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                Iterator it = this.f19730a.iterator();
                while (it.hasNext()) {
                    g52.this.c.apply(it.next());
                }
            } catch (Throwable th) {
                pgh.f("BatchRunner", "consume error", th);
            }
        }
    }

    public g52(int i, int i2, y0a<T, Void, Throwable> y0aVar) {
        this.b = i;
        this.d = i2;
        this.c = y0aVar;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        try {
            ArrayList arrayList = new ArrayList(this.b + 16);
            while (true) {
                T poll = this.f19729a.poll();
                if (poll != null) {
                    arrayList.add(poll);
                } else {
                    pgh.i("BatchRunner", "flushing " + arrayList.size() + " items");
                    jst.d.submit(new a(arrayList));
                    return;
                }
            }
        } catch (Throwable th) {
            pgh.f("BatchRunner", "caught error, dropping", th);
            try {
                this.f19729a.clear();
            } catch (Throwable unused) {
            }
        }
    }

    public void c(T t) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6251244", new Object[]{this, t});
            return;
        }
        try {
            this.f19729a.add(t);
            if (this.f19729a.size() >= this.b) {
                b();
            } else if (!this.e && (i = this.d) > 0) {
                this.e = true;
                jst.d.schedule(this.f, i, TimeUnit.SECONDS);
            }
        } catch (Throwable th) {
            pgh.f("BatchRunner", "caught error, dropping", th);
            try {
                this.f19729a.clear();
            } catch (Throwable unused) {
            }
        }
    }

    public final /* synthetic */ void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.e = false;
        pgh.i("BatchRunner", "scheduled flushing");
        b();
    }
}
