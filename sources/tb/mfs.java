package tb;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.core.Component;
import com.taobao.tao.flexbox.layoutmanager.core.n;
import tb.mx7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class mfs extends ofs {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(503316639);
    }

    public static /* synthetic */ Object ipc$super(mfs mfsVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/animation/TNodeAnimator/TNodeCornersAnimator");
    }

    public static float o(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d3320058", new Object[]{view})).floatValue();
        }
        Drawable background = view.getBackground();
        if (background instanceof mx7.b) {
            return ((mx7.b) background).b();
        }
        return 0.0f;
    }

    public static mfs p(n nVar, int i, int i2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mfs) ipChange.ipc$dispatch("2bcb1073", new Object[]{nVar, new Integer(i), new Integer(i2), new Boolean(z)});
        }
        mfs mfsVar = new mfs();
        mfsVar.f(z);
        mfsVar.j(nVar, i, i2);
        return mfsVar;
    }

    @Override // tb.wwd
    public int getTag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e16722de", new Object[]{this})).intValue();
        }
        return 24;
    }

    @Override // tb.ofs
    public float i() {
        View w0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("954cf076", new Object[]{this})).floatValue();
        }
        n nVar = this.b;
        if (nVar == null || (w0 = nVar.w0()) == null) {
            return 0.0f;
        }
        return o(w0);
    }

    @Override // tb.ofs
    public void l(n nVar, View view, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee7398e", new Object[]{this, nVar, view, new Float(f)});
        } else {
            q(nVar.K(), view, f);
        }
    }

    @Override // tb.ofs
    public void m(n nVar, View view, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10b051e7", new Object[]{this, nVar, view, new Float(f)});
        }
    }

    @Override // tb.ofs
    public void n(n nVar, View view, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59349600", new Object[]{this, nVar, view, new Float(f)});
        } else {
            q(nVar.K(), view, f);
        }
    }

    public final void q(Component component, View view, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38cab0fd", new Object[]{this, component, view, new Float(f)});
            return;
        }
        Drawable d = mx7.d(view.getBackground(), component.getViewParams());
        if (d instanceof GradientDrawable) {
            ((GradientDrawable) d).setCornerRadius(f);
        }
    }
}
