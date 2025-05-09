package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class bc5 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final hh5 f16312a;
    public List<ac5> b;

    static {
        t2o.a(444597854);
        t2o.a(444597873);
    }

    public bc5(hh5 hh5Var) {
        this.f16312a = hh5Var;
    }

    public List<ac5> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("4547153", new Object[]{this});
        }
        return this.b;
    }

    public boolean b(lg5 lg5Var, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a2df0ee7", new Object[]{this, lg5Var, dXRuntimeContext})).booleanValue();
        }
        this.b = new ArrayList();
        short j = lg5Var.j();
        for (int i = 0; i < j; i++) {
            this.b.add(new ac5(lg5Var.e(), this.f16312a.b(lg5Var.h()), lg5Var.h(), lg5Var.h(), lg5Var.h()));
        }
        return true;
    }
}
