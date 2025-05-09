package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class g1b implements arb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(729809601);
        t2o.a(488636418);
    }

    @Override // tb.arb
    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4a4bacea", new Object[]{this});
        }
        return z4a.NEW_FACE_CHILD.c;
    }

    @Override // tb.arb
    public String getContainerId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("94b5b673", new Object[]{this});
        }
        return z4a.NEW_FACE_CHILD.f32522a;
    }

    @Override // tb.arb
    public String getPage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c740e914", new Object[]{this});
        }
        return z4a.NEW_FACE_CHILD.b;
    }
}
