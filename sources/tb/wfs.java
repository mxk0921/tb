package tb;

import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.component.e;
import com.taobao.tao.flexbox.layoutmanager.core.Component;
import com.taobao.tao.flexbox.layoutmanager.core.n;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class wfs extends qfs {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(503316648);
    }

    public static /* synthetic */ Object ipc$super(wfs wfsVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/animation/TNodeAnimator/TNodePaddingLeftAnimator");
    }

    public static wfs n(n nVar, int i, int i2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wfs) ipChange.ipc$dispatch("a174c39", new Object[]{nVar, new Integer(i), new Integer(i2), new Boolean(z)});
        }
        wfs wfsVar = new wfs();
        wfsVar.f(z);
        wfsVar.j(nVar, i, i2);
        return wfsVar;
    }

    @Override // tb.wwd
    public int getTag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e16722de", new Object[]{this})).intValue();
        }
        return 26;
    }

    @Override // tb.qfs
    public int i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("954cf079", new Object[]{this})).intValue();
        }
        n nVar = this.b;
        if (nVar == null) {
            return 0;
        }
        View w0 = nVar.w0();
        if (this.b.K() instanceof e) {
            ViewGroup viewGroup = (ViewGroup) w0;
            if (viewGroup.getChildCount() > 0) {
                return viewGroup.getChildAt(0).getPaddingLeft();
            }
            return 0;
        } else if (w0 != null) {
            return w0.getPaddingLeft();
        } else {
            return 0;
        }
    }

    @Override // tb.qfs
    public void l(n nVar, Component component, View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d0d3763", new Object[]{this, nVar, component, view, new Integer(i)});
        }
    }

    @Override // tb.qfs
    public void m(n nVar, Component component, View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("795ad0ea", new Object[]{this, nVar, component, view, new Integer(i)});
        } else if (component instanceof e) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() > 0) {
                View childAt = viewGroup.getChildAt(0);
                childAt.setPadding(i, childAt.getPaddingTop(), childAt.getPaddingRight(), childAt.getPaddingBottom());
            }
        } else if (view != null) {
            view.setPadding(i, view.getPaddingTop(), view.getPaddingRight(), view.getPaddingBottom());
        }
    }

    @Override // tb.qfs
    public void k(n nVar, Component component, View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebc84a1c", new Object[]{this, nVar, component, view, new Integer(i)});
        } else {
            nVar.j1(pg1.ATOM_EXT_UDL_padding_left, Integer.valueOf(i), false);
        }
    }
}
