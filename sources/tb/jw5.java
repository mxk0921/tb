package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.EmptyStackException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class jw5<E> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final int d = 512;

    /* renamed from: a  reason: collision with root package name */
    public final Object[] f22252a;
    public final int b;
    public int c;

    static {
        t2o.a(444597892);
    }

    public jw5() {
        this(d);
    }

    public E a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (E) ipChange.ipc$dispatch("85bdd710", new Object[]{this});
        }
        int i = this.c;
        if (i != 0) {
            return (E) this.f22252a[i - 1];
        }
        throw new EmptyStackException();
    }

    public E b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (E) ipChange.ipc$dispatch("b39ebda", new Object[]{this});
        }
        E a2 = a();
        Object[] objArr = this.f22252a;
        int i = this.c - 1;
        this.c = i;
        objArr[i] = null;
        return a2;
    }

    public E c(E e) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (E) ipChange.ipc$dispatch("d33ef895", new Object[]{this, e});
        }
        int i = this.c;
        if (i != this.b) {
            this.f22252a[i] = e;
            this.c = i + 1;
            return e;
        }
        throw new RuntimeException("DXExprStack stack overflow ");
    }

    public int d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("32697bfb", new Object[]{this})).intValue();
        }
        return this.c;
    }

    public jw5(int i) {
        this.c = 0;
        this.b = i;
        this.f22252a = new Object[i];
    }
}
