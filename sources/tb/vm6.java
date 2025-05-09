package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class vm6<T> implements um6<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Object[] f30099a;
    public int b;

    static {
        t2o.a(444596584);
        t2o.a(444596583);
    }

    public vm6(int i) {
        if (i > 0) {
            this.f30099a = new Object[i];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    public final boolean a(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("21f54f12", new Object[]{this, t})).booleanValue();
        }
        for (int i = 0; i < this.b; i++) {
            if (this.f30099a[i] == t) {
                return true;
            }
        }
        return false;
    }

    @Override // tb.um6
    public T acquire() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("e292f275", new Object[]{this});
        }
        int i = this.b;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object[] objArr = this.f30099a;
        T t = (T) objArr[i2];
        objArr[i2] = null;
        this.b = i - 1;
        return t;
    }

    @Override // tb.um6
    public boolean release(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6ae8596e", new Object[]{this, t})).booleanValue();
        }
        if (!a(t)) {
            int i = this.b;
            Object[] objArr = this.f30099a;
            if (i >= objArr.length) {
                return false;
            }
            objArr[i] = t;
            this.b = i + 1;
            return true;
        }
        throw new IllegalStateException("Already in the pool!");
    }

    @Override // tb.um6
    public int size() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("32697bfb", new Object[]{this})).intValue();
        }
        return this.b;
    }
}
