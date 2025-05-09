package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class yew {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(1001390094);
    }

    public static final <T> alk<T> a(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (alk) ipChange.ipc$dispatch("b7eb4969", new Object[]{t});
        }
        return new alk<>(t);
    }
}
