package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.core.n;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class cgs extends ofs {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(503316653);
    }

    public static /* synthetic */ Object ipc$super(cgs cgsVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/animation/TNodeAnimator/TNodeRotateYAnimator");
    }

    public static cgs o(n nVar, float f, float f2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cgs) ipChange.ipc$dispatch("2487333", new Object[]{nVar, new Float(f), new Float(f2), new Boolean(z)});
        }
        cgs cgsVar = new cgs();
        cgsVar.f(z);
        cgsVar.j(nVar, f, f2);
        return cgsVar;
    }

    @Override // tb.wwd
    public int getTag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e16722de", new Object[]{this})).intValue();
        }
        return 19;
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
        return w0.getRotationY();
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
            view.setRotationY(f);
        }
    }

    @Override // tb.ofs
    public void l(n nVar, View view, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee7398e", new Object[]{this, nVar, view, new Float(f)});
        } else {
            nVar.j1("rotateY", Float.valueOf(f), false);
        }
    }
}
