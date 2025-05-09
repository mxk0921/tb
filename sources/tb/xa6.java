package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class xa6 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f31245a;
    public final DXRootView b;

    static {
        t2o.a(804257842);
    }

    public xa6(boolean z, DXRootView dXRootView) {
        this.f31245a = z;
        this.b = dXRootView;
    }

    public final DXRootView a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRootView) ipChange.ipc$dispatch("f4259b7f", new Object[]{this});
        }
        return this.b;
    }

    public final boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b2dc3ee2", new Object[]{this})).booleanValue();
        }
        return this.f31245a;
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof xa6) {
                xa6 xa6Var = (xa6) obj;
                if (this.f31245a != xa6Var.f31245a || !ckf.b(this.b, xa6Var.b)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i = 0;
        int i2 = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        boolean z = this.f31245a;
        if (!z) {
            i2 = z ? 1 : 0;
        }
        int i3 = i2 * 31;
        DXRootView dXRootView = this.b;
        if (dXRootView != null) {
            i = dXRootView.hashCode();
        }
        return i3 + i;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "DXRenderResult(renderSuccess=" + this.f31245a + ", dxRootView=" + this.b + f7l.BRACKET_END_STR;
    }
}
