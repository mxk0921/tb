package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.core.Component;
import com.taobao.tao.flexbox.layoutmanager.core.n;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class mgs extends qfs {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(503316659);
    }

    public static /* synthetic */ Object ipc$super(mgs mgsVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/animation/TNodeAnimator/TNodeWidthAnimator");
    }

    public static mgs n(n nVar, int i, int i2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mgs) ipChange.ipc$dispatch("b6b797ab", new Object[]{nVar, new Integer(i), new Integer(i2), new Boolean(z)});
        }
        mgs mgsVar = new mgs();
        mgsVar.f(z);
        mgsVar.j(nVar, i, i2);
        return mgsVar;
    }

    @Override // tb.wwd
    public int getTag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e16722de", new Object[]{this})).intValue();
        }
        return 11;
    }

    @Override // tb.qfs
    public int i() {
        View w0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("954cf079", new Object[]{this})).intValue();
        }
        n nVar = this.b;
        if (nVar == null || (w0 = nVar.w0()) == null) {
            return 0;
        }
        return w0.getWidth();
    }

    @Override // tb.qfs
    public void k(n nVar, Component component, View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebc84a1c", new Object[]{this, nVar, component, view, new Integer(i)});
        } else if (component != null) {
            component.resetAnimationWidth();
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
        } else if (component != null) {
            component.setAnimationWidth(i);
        }
    }
}
