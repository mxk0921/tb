package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public abstract class ozx<T> implements xxx<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(628097407);
        t2o.a(628097399);
    }

    @Override // tb.u7y
    public final boolean a(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a6251248", new Object[]{this, t})).booleanValue();
        }
        throw new UnsupportedOperationException("Should not be called");
    }
}
