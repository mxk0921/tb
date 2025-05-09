package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class aso {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f15978a = 0;
    public long b = 0;

    static {
        t2o.a(481296721);
    }

    public long a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("83c9dcbb", new Object[]{this})).longValue();
        }
        int i = this.f15978a;
        if (i > 0) {
            return this.b / i;
        }
        return 0L;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
            return;
        }
        this.f15978a = 0;
        this.b = 0L;
    }

    public void c(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e04835f", new Object[]{this, new Long(j)});
            return;
        }
        int i = this.f15978a;
        if (i < 200) {
            this.f15978a = i + 1;
            this.b += j;
        }
    }
}
