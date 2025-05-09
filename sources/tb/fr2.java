package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultronx.base.CPointer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public abstract class fr2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public CPointer mPointer;

    static {
        t2o.a(939524099);
    }

    public fr2(CPointer cPointer) {
        this.mPointer = cPointer;
    }

    public long getAddress() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("87ac4d39", new Object[]{this})).longValue();
        }
        return this.mPointer.f9875a;
    }
}
