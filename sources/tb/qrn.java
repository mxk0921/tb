package tb;

import androidx.core.util.Pools;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class qrn<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final int f26897a;
    public final boolean b;
    public final Pools.Pool<T> c;
    public int d;

    static {
        t2o.a(986710035);
        t2o.a(986710031);
    }

    public qrn(String str, int i, boolean z) {
        Pools.Pool<T> pool;
        this.b = z;
        this.f26897a = i;
        if (z) {
            pool = new Pools.SynchronizedPool<>(i);
        } else {
            pool = new Pools.SimplePool<>(i);
        }
        this.c = pool;
    }

    public T c() {
        T d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("e292f275", new Object[]{this});
        }
        if (!this.b) {
            return d();
        }
        synchronized (this) {
            d = d();
        }
        return d;
    }

    public final T d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("7cf699b8", new Object[]{this});
        }
        T acquire = this.c.acquire();
        this.d = Math.max(0, this.d - 1);
        return acquire;
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1ffb6ee4", new Object[]{this})).booleanValue();
        }
        if (this.d >= this.f26897a) {
            return true;
        }
        return false;
    }

    public final void f(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da929987", new Object[]{this, t});
            return;
        }
        this.c.release(t);
        this.d = Math.min(this.f26897a, this.d + 1);
    }

    public void release(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ae8596a", new Object[]{this, t});
        } else if (this.b) {
            synchronized (this) {
                f(t);
            }
        } else {
            f(t);
        }
    }
}
