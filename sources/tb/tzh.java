package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class tzh implements dqc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final int f29043a;
    public final int b;

    static {
        t2o.a(486539598);
        t2o.a(488636505);
    }

    public tzh(int i, int i2) {
        this.f29043a = i;
        this.b = i2;
    }

    @Override // tb.dqc
    public int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("46f90e8b", new Object[]{this})).intValue();
        }
        return this.f29043a;
    }

    @Override // tb.dqc
    public int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f6724ef5", new Object[]{this})).intValue();
        }
        return this.b;
    }
}
