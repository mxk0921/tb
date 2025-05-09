package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_uikit.ui.UINode;
import com.taobao.weex.common.Constants;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ax0 extends rwh<ax0> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(986710036);
    }

    public ax0(UINode uINode) {
        super(uINode);
        j("translateX", 0);
        j("translateY", 0);
        Float valueOf = Float.valueOf(0.0f);
        j("rotate", valueOf);
        j("rotateX", valueOf);
        j("rotateY", valueOf);
        Float valueOf2 = Float.valueOf(1.0f);
        j("scaleX", valueOf2);
        j("scaleY", valueOf2);
        j(Constants.Name.ARIA_LABEL, "");
        j(Constants.Name.ARIA_HIDDEN, Boolean.FALSE);
        j("skewX", valueOf);
        j("skewY", valueOf);
    }

    public static /* synthetic */ Object ipc$super(ax0 ax0Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_uikit/ui/AnimUINodeInfo");
    }

    public void A(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("459be768", new Object[]{this, new Float(f)});
        } else {
            i("scaleY", Float.valueOf(f));
        }
    }

    public void B(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd9f664d", new Object[]{this, new Float(f)});
        } else {
            i("skewX", Float.valueOf(f));
        }
    }

    public void C(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff543eec", new Object[]{this, new Float(f)});
        } else {
            i("skewY", Float.valueOf(f));
        }
    }

    public void D(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("beaca010", new Object[]{this, new Integer(i)});
        } else {
            i("translateX", Integer.valueOf(i));
        }
    }

    public void E(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c06178af", new Object[]{this, new Integer(i)});
        } else {
            i("translateY", Integer.valueOf(i));
        }
    }

    public float l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("31ea98e8", new Object[]{this})).floatValue();
        }
        Float f = (Float) f("drawOpacity");
        if (f == null) {
            return 1.0f;
        }
        return f.floatValue();
    }

    public float m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e97cf448", new Object[]{this})).floatValue();
        }
        Float f = (Float) f("rotate");
        if (f == null || f.isNaN()) {
            return 0.0f;
        }
        return f.floatValue();
    }

    public float n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4874231e", new Object[]{this})).floatValue();
        }
        Float f = (Float) f("rotateX");
        if (f == null || f.isNaN()) {
            return 0.0f;
        }
        return f.floatValue();
    }

    public float o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("48823a9f", new Object[]{this})).floatValue();
        }
        Float f = (Float) f("rotateY");
        if (f == null || f.isNaN()) {
            return 0.0f;
        }
        return f.floatValue();
    }

    public float p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("606f85bb", new Object[]{this})).floatValue();
        }
        Float f = (Float) f("scaleX");
        if (f == null || f.isNaN()) {
            return 1.0f;
        }
        return f.floatValue();
    }

    public float q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("607d9d3c", new Object[]{this})).floatValue();
        }
        Float f = (Float) f("scaleY");
        if (f == null || f.isNaN()) {
            return 1.0f;
        }
        return f.floatValue();
    }

    public float r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b41cbb4f", new Object[]{this})).floatValue();
        }
        return ((Float) f("skewX")).floatValue();
    }

    public float s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b42ad2d0", new Object[]{this})).floatValue();
        }
        return ((Float) f("skewY")).floatValue();
    }

    public int t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b1cd153a", new Object[]{this})).intValue();
        }
        return ((Integer) f("translateX")).intValue();
    }

    public int u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b1db2cbb", new Object[]{this})).intValue();
        }
        return ((Integer) f("translateY")).intValue();
    }

    public void v(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af6582d4", new Object[]{this, new Float(f)});
        } else {
            i("drawOpacity", Float.valueOf(f));
        }
    }

    public void w(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc8771dc", new Object[]{this, new Float(f)});
        } else {
            i("rotate", Float.valueOf(f));
        }
    }

    public void x(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc59a55e", new Object[]{this, new Float(f)});
        } else {
            i("rotateX", Float.valueOf(f));
        }
    }

    public void y(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe0e7dfd", new Object[]{this, new Float(f)});
        } else {
            i("rotateY", Float.valueOf(f));
        }
    }

    public void z(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43e70ec9", new Object[]{this, new Float(f)});
        } else {
            i("scaleX", Float.valueOf(f));
        }
    }
}
