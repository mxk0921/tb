package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.lang.Number;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class g0q<T extends Number> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public T f19666a;
    public T b;

    static {
        t2o.a(511705122);
    }

    public g0q(T t, T t2) {
        this.f19666a = t;
        this.b = t2;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return this.f19666a + "x" + this.b;
    }
}
