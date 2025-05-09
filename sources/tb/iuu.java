package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tbugc.adapter.MtopAdapter;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class iuu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f21591a = false;

    static {
        t2o.a(758120551);
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[0]);
        } else if (!f21591a) {
            vd0.b().h(new sqr());
            vd0.b().g(new t0m());
            vd0.b().i(new MtopAdapter());
            vd0.b().k(new ltv());
            vd0.b().j(new uwr());
            f21591a = true;
        }
    }
}
