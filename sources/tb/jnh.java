package tb;

import com.android.alibaba.ip.runtime.IpChange;
import tb.hpc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public abstract class jnh implements xdc, hpc.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Object f22091a;

    static {
        t2o.a(815792396);
        t2o.a(815792722);
        t2o.a(982516044);
    }

    @Override // tb.hpc.a
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5e62fda", new Object[]{this});
        }
    }

    @Override // tb.hpc.a
    public void g(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e11aa67b", new Object[]{this, obj});
        } else {
            this.f22091a = obj;
        }
    }

    @Override // tb.hpc.a
    public Object getTag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("61e2c7a7", new Object[]{this});
        }
        return this.f22091a;
    }
}
