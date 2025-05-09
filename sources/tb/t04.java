package tb;

import android.util.SparseIntArray;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class t04 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final SparseIntArray f28383a = new SparseIntArray(32);

    static {
        t2o.a(502267972);
    }

    public int a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b72229b3", new Object[]{this, new Integer(i)})).intValue();
        }
        int indexOfKey = this.f28383a.indexOfKey(i);
        if (indexOfKey < 0) {
            return -1;
        }
        return this.f28383a.valueAt(indexOfKey);
    }

    public void b(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9f87dbb", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            this.f28383a.put(i, i2);
        }
    }
}
