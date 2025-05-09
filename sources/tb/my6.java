package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class my6 implements ttc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final int[] f24385a = {-1, 0};
    public final int[] b = {-16777216, 0};

    static {
        t2o.a(993001473);
        t2o.a(993001476);
    }

    @Override // tb.ttc
    public int[] a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("afaf7ad", new Object[]{this, new Boolean(z)});
        }
        if (z) {
            return this.b;
        }
        return this.f24385a;
    }
}
