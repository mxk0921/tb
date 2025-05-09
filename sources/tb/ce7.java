package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ce7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final int f17013a;
    public final int b;
    public final long c;

    public ce7(int i, int i2, long j) {
        this.f17013a = i;
        this.b = i2;
        this.c = j;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "detail: { totalCount=" + this.f17013a + ",sensitiveCount=" + this.b + ",duration=" + this.c + "ms }";
    }
}
