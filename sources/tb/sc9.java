package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class sc9 implements jn2<rc9> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f27947a;
    public rc9 b;

    static {
        t2o.a(620757019);
        t2o.a(620757013);
    }

    public synchronized rc9 a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rc9) ipChange.ipc$dispatch("ce07f39e", new Object[]{this});
        } else if (this.f27947a) {
            return this.b;
        } else {
            this.f27947a = true;
            if (this.b == null) {
                this.b = new d17();
            }
            return this.b;
        }
    }
}
