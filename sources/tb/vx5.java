package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class vx5 implements uvb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final int f30311a;

    static {
        t2o.a(444597918);
        t2o.a(444597921);
    }

    public vx5(int i) {
        this.f30311a = i;
    }

    public int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a6577a21", new Object[]{this})).intValue();
        }
        return this.f30311a;
    }
}
