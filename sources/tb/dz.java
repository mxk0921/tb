package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public abstract class dz<V> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(79691996);
    }

    public V a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (V) ipChange.ipc$dispatch("6352d3f5", new Object[]{this});
        }
        return null;
    }
}
