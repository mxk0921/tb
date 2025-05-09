package tb;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.vectordrawable.graphics.drawable.ArgbEvaluator;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.core.Component;
import com.taobao.tao.flexbox.layoutmanager.core.b;
import com.taobao.tao.flexbox.layoutmanager.core.n;
import tb.mx7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ifs extends qfs {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(503316637);
    }

    public static /* synthetic */ Object ipc$super(ifs ifsVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/animation/TNodeAnimator/TNodeBackgroundColorAnimator");
    }

    public static int n(View view) {
        int c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("77c7b55f", new Object[]{view})).intValue();
        }
        if (view == null) {
            return 0;
        }
        Drawable background = view.getBackground();
        if (background instanceof ColorDrawable) {
            return ((ColorDrawable) background).getColor();
        }
        if (!(background instanceof mx7.b) || (c = ((mx7.b) background).c()) == 1) {
            return 0;
        }
        return c;
    }

    public static ifs o(n nVar, int i, int i2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ifs) ipChange.ipc$dispatch("abe62f3c", new Object[]{nVar, new Integer(i), new Integer(i2), new Boolean(z)});
        }
        ifs ifsVar = new ifs();
        ifsVar.f(z);
        ifsVar.j(nVar, i, i2);
        return ifsVar;
    }

    @Override // tb.qfs
    public int g(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2777ede", new Object[]{this, new Float(f)})).intValue();
        }
        return ((Integer) ArgbEvaluator.getInstance().evaluate(f, Integer.valueOf(this.d), Integer.valueOf(this.e))).intValue();
    }

    @Override // tb.wwd
    public int getTag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e16722de", new Object[]{this})).intValue();
        }
        return 9;
    }

    @Override // tb.qfs
    public int i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("954cf079", new Object[]{this})).intValue();
        }
        n nVar = this.b;
        if (nVar != null) {
            return n(nVar.w0());
        }
        return 0;
    }

    @Override // tb.qfs
    public void k(n nVar, Component component, View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebc84a1c", new Object[]{this, nVar, component, view, new Integer(i)});
        } else {
            p(nVar, nVar.K(), view, i);
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
        } else {
            p(nVar, nVar.K(), view, i);
        }
    }

    public final void p(n nVar, Component component, View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ece2bdc8", new Object[]{this, nVar, component, view, new Integer(i)});
            return;
        }
        jfw viewParams = component.getViewParams();
        int i2 = viewParams.E;
        viewParams.E = i;
        b.k(nVar.w0(), mx7.d(view.getBackground(), viewParams));
        viewParams.E = i2;
    }
}
