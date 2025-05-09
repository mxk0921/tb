package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.core.Component;
import com.taobao.tao.flexbox.layoutmanager.core.n;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class jfs extends qfs {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int g;
    public int h;

    static {
        t2o.a(503316638);
    }

    public static /* synthetic */ Object ipc$super(jfs jfsVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/animation/TNodeAnimator/TNodeBottomAnimator");
    }

    public static jfs n(n nVar, int i, int i2, int i3, int i4, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jfs) ipChange.ipc$dispatch("3809c6c", new Object[]{nVar, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Boolean(z)});
        }
        jfs jfsVar = new jfs();
        jfsVar.f(z);
        jfsVar.g = i;
        jfsVar.h = i2;
        jfsVar.j(nVar, i3, i4);
        return jfsVar;
    }

    @Override // tb.wwd
    public int getTag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e16722de", new Object[]{this})).intValue();
        }
        return 16;
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
        return w0.getBottom();
    }

    @Override // tb.qfs
    public void k(n nVar, Component component, View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebc84a1c", new Object[]{this, nVar, component, view, new Integer(i)});
        } else if (component != null) {
            component.resetAnimationBottom();
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
        } else if (component != null && component.getView() != null) {
            int i2 = this.e;
            int i3 = this.d;
            component.setAnimationBottom(component.getView().getTop() + this.g + ((int) ((((i - i3) * 1.0f) / (i2 - i3)) * (this.h - this.g))));
        }
    }
}
