package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class zk8<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final T f32822a;
    public final jj8 b;

    static {
        t2o.a(573571084);
    }

    public zk8(T t, jj8 jj8Var) {
        this.f32822a = t;
        this.b = jj8Var;
    }

    public jj8 a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jj8) ipChange.ipc$dispatch("8a119132", new Object[]{this});
        }
        return this.b;
    }

    public T b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("4ca84d6b", new Object[]{this});
        }
        return this.f32822a;
    }
}
