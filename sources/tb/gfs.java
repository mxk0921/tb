package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.core.n;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class gfs extends ofs {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(503316636);
    }

    public static /* synthetic */ Object ipc$super(gfs gfsVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/animation/TNodeAnimator/TNodeAlphaAnimator");
    }

    public static gfs o(n nVar, float f, float f2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gfs) ipChange.ipc$dispatch("cd073b73", new Object[]{nVar, new Float(f), new Float(f2), new Boolean(z)});
        }
        gfs gfsVar = new gfs();
        gfsVar.f(z);
        gfsVar.j(nVar, f, f2);
        return gfsVar;
    }

    @Override // tb.wwd
    public int getTag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e16722de", new Object[]{this})).intValue();
        }
        return 10;
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
        return w0.getAlpha();
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
            view.setAlpha(f);
        }
    }

    @Override // tb.ofs
    public void l(n nVar, View view, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee7398e", new Object[]{this, nVar, view, new Float(f)});
            return;
        }
        boolean A0 = nVar.A0();
        nVar.j1("opacity", Float.valueOf(f), false);
        if (akt.p2("fixAlphaClickListener", true) && A0) {
            nVar.K().updateClickListener();
        }
    }
}
