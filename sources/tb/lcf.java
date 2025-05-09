package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public abstract class lcf<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<T> f23254a = new ArrayList<>();
    public final int b;

    static {
        t2o.a(766509574);
    }

    public lcf(int i) {
        this.b = Math.max(i, 1);
    }

    public abstract void a(T t);

    public final synchronized void b(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30f156d5", new Object[]{this, t});
        } else {
            this.f23254a.add(t);
        }
    }

    public final synchronized boolean c(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b06c8586", new Object[]{this, t})).booleanValue();
        }
        return this.f23254a.contains(t);
    }

    public final synchronized T d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("99af18d1", new Object[]{this});
        } else if (this.f23254a.isEmpty()) {
            return null;
        } else {
            return (T) i04.a0(this.f23254a);
        }
    }

    public final int e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a4f9274", new Object[]{this})).intValue();
        }
        return this.b;
    }

    public final ArrayList<T> f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("b58cfbf5", new Object[]{this});
        }
        return this.f23254a;
    }

    public final synchronized int g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ae43b971", new Object[]{this})).intValue();
        }
        return this.f23254a.size();
    }

    public final synchronized void h(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec2dfe27", new Object[]{this, t});
        } else {
            this.f23254a.remove(t);
        }
    }

    public final synchronized T i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("b528447f", new Object[]{this});
        }
        T d = d();
        if (d == null) {
            return null;
        }
        this.f23254a.remove(d);
        return d;
    }

    public abstract void j(T t);

    public final synchronized void k(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("242617c6", new Object[]{this, t});
            return;
        }
        h(t);
        b(t);
    }
}
