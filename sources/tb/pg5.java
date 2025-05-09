package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class pg5 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final a16 f26075a;
    public final List<og5> b = new ArrayList();

    static {
        t2o.a(444597858);
        t2o.a(444597873);
    }

    public pg5(a16 a16Var) {
        this.f26075a = a16Var;
    }

    public List<og5> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("4d84c2d3", new Object[]{this});
        }
        return this.b;
    }

    public boolean b(lg5 lg5Var, DXRuntimeContext dXRuntimeContext) {
        yv5 yv5Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a2df0ee7", new Object[]{this, lg5Var, dXRuntimeContext})).booleanValue();
        }
        lg5Var.k(this.f26075a.b());
        int h = lg5Var.h();
        if (h > 0) {
            for (int i = 0; i < h; i++) {
                if (lg5Var.j() != 1) {
                    yv5Var = null;
                } else {
                    yv5Var = new yv5(lg5Var.h());
                }
                if (yv5Var != null) {
                    ((ArrayList) this.b).add(yv5Var);
                }
            }
        }
        return true;
    }
}
