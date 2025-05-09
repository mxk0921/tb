package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import tb.tpu;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class l3u {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final List<mxd> f23098a = new ArrayList();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        static {
            t2o.a(916455705);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(916455704);
        t2o.a(916455461);
    }

    public final void a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f08da37b", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        tpu.a aVar = tpu.Companion;
        tpu.a.b(aVar, "TopBarRegistry", "在Tab bar子项选中时通知，lastPosition=" + i + "，currentPosition=" + i2, null, 4, null);
        for (mxd mxdVar : this.f23098a) {
            mxdVar.a(i, i2);
        }
    }
}
