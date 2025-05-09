package tb;

import android.graphics.Rect;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_uikit.ui.UINode;
import com.taobao.android.weex_uikit.widget.border.BorderProp;
import com.taobao.weex.common.Constants;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class evu extends rwh<evu> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public BorderProp f;
    public final Rect g = new Rect();
    public final Rect h = new Rect();

    static {
        t2o.a(986710089);
    }

    public evu(UINode uINode) {
        super(uINode);
        V();
    }

    public static /* synthetic */ Object ipc$super(evu evuVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 784437744) {
            super.b((Map) objArr[0]);
            return null;
        } else if (hashCode == 1030092084) {
            super.d((rwh) objArr[0]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/weex_uikit/ui/UINodeInfo");
        }
    }

    public Rect A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rect) ipChange.ipc$dispatch("1a2132ab", new Object[]{this});
        }
        this.h.set(C(), E(), D(), B());
        return this.h;
    }

    public int B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("86af8f60", new Object[]{this})).intValue();
        }
        return ((Integer) f("paddingBottom")).intValue();
    }

    public int C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("111699fc", new Object[]{this})).intValue();
        }
        return ((Integer) f("paddingLeft")).intValue();
    }

    public int D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4f2526fb", new Object[]{this})).intValue();
        }
        return ((Integer) f("paddingRight")).intValue();
    }

    public int E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1c5536f4", new Object[]{this})).intValue();
        }
        return ((Integer) f("paddingTop")).intValue();
    }

    public int F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a1d449e0", new Object[]{this})).intValue();
        }
        return ((Integer) f("right")).intValue();
    }

    public int G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f9c9cf19", new Object[]{this})).intValue();
        }
        return ((Integer) f("top")).intValue();
    }

    public String H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("21738003", new Object[]{this});
        }
        return (String) f("transform");
    }

    public String I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b275d68e", new Object[]{this});
        }
        return (String) f("transition");
    }

    public String J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c563ff01", new Object[]{this});
        }
        return (String) f("transitionDelay");
    }

    public String K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5664985a", new Object[]{this});
        }
        return (String) f("transitionDuration");
    }

    public String L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3b696ab9", new Object[]{this});
        }
        return (String) f("transitionProperty");
    }

    public String M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c20474ac", new Object[]{this});
        }
        return (String) f("transitionTimingFunction");
    }

    public int N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fc48d08a", new Object[]{this})).intValue();
        }
        return y().width();
    }

    public boolean O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("79ad7ae8", new Object[]{this})).booleanValue();
        }
        return ((Boolean) f(Constants.Name.ARIA_HIDDEN)).booleanValue();
    }

    public void P(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36761a87", new Object[]{this, str});
            return;
        }
        Set<String> v = v();
        v.remove(str);
        i("events", v);
    }

    public void Q(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8758e38", new Object[]{this, new Boolean(z)});
        } else {
            i(Constants.Name.ARIA_HIDDEN, Boolean.valueOf(z));
        }
    }

    public void R(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("808332fa", new Object[]{this, str});
        } else {
            i(Constants.Name.ARIA_LABEL, str);
        }
    }

    public void S(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20ef1372", new Object[]{this, str});
        } else {
            i("ariaRole", str);
        }
    }

    public void T(xn1 xn1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf541dc8", new Object[]{this, xn1Var});
            return;
        }
        xn1 xn1Var2 = (xn1) f("backgroundColor");
        if (!(xn1Var2 == null || xn1Var == null)) {
            xn1Var.r(xn1Var2.p());
        }
        i("backgroundColor", xn1Var);
    }

    public void U(xn1 xn1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1f66d0", new Object[]{this, xn1Var});
        } else {
            i("backgroundImage", xn1Var);
        }
    }

    public void W(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7dfbf78d", new Object[]{this, new Integer(i)});
            return;
        }
        xn1 r = r();
        if (r != null) {
            r.r(i);
        }
    }

    public void X(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("219b20f2", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        if (x() != i) {
            i("left", Integer.valueOf(i));
        }
        if (G() != i2) {
            i("top", Integer.valueOf(i2));
        }
        if (F() != i3) {
            i("right", Integer.valueOf(i3));
        }
        if (t() != i4) {
            i("bottom", Integer.valueOf(i4));
        }
    }

    public void Y(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c5f5870", new Object[]{this, new Float(f)});
        } else {
            i("opacity", Float.valueOf(f));
        }
    }

    public void Z(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ce01816", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        if (C() != i) {
            i("paddingLeft", Integer.valueOf(i));
        }
        if (E() != i2) {
            i("paddingTop", Integer.valueOf(i2));
        }
        if (D() != i3) {
            i("paddingRight", Integer.valueOf(i3));
        }
        if (B() != i4) {
            i("paddingBottom", Integer.valueOf(i4));
        }
    }

    public void a0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e66e5342", new Object[]{this, new Integer(i)});
        } else if (B() != i) {
            i("paddingBottom", Integer.valueOf(i));
        }
    }

    public void b0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5b9af26", new Object[]{this, new Integer(i)});
        } else if (C() != i) {
            i("paddingLeft", Integer.valueOf(i));
        }
    }

    @Override // tb.rwh
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("155d431d", new Object[]{this});
            return;
        }
        BorderProp borderProp = this.f;
        if (borderProp != null && this.e) {
            borderProp.E(N(), w());
            if (this.f.B()) {
                i(pg1.ATOM_EXT_border, this.f);
            }
        }
    }

    public void c0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7116396f", new Object[]{this, new Integer(i)});
        } else if (D() != i) {
            i("paddingRight", Integer.valueOf(i));
        }
    }

    public void d0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a528b596", new Object[]{this, new Integer(i)});
        } else if (E() != i) {
            i("paddingTop", Integer.valueOf(i));
        }
    }

    public void e0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f3a3c3b", new Object[]{this, str});
        } else if (!TextUtils.equals(str, H())) {
            i("transform", str);
        }
    }

    public void f0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("132e82a8", new Object[]{this, str});
        } else if (!TextUtils.equals(str, I())) {
            i("transition", str);
        }
    }

    public void g0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a143b5fd", new Object[]{this, str});
        } else if (!TextUtils.equals(str, J())) {
            i("transitionDelay", str);
        }
    }

    public void h0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da002e5c", new Object[]{this, str});
        } else if (!TextUtils.equals(str, K())) {
            i("transitionDuration", str);
        }
    }

    public void i0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9595a7dd", new Object[]{this, str});
        } else if (!TextUtils.equals(str, L())) {
            i("transitionProperty", str);
        }
    }

    public void j0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1dbde34a", new Object[]{this, str});
        } else if (!TextUtils.equals(str, M())) {
            i("transitionTimingFunction", str);
        }
    }

    public void l(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a85d704a", new Object[]{this, str});
            return;
        }
        Set<String> v = v();
        v.add(str);
        i("events", v);
    }

    /* renamed from: m */
    public void d(evu evuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83fe2016", new Object[]{this, evuVar});
            return;
        }
        super.d(evuVar);
        if (this.f != null) {
            BorderProp borderProp = new BorderProp();
            evuVar.f = borderProp;
            borderProp.a(this.f);
        }
    }

    public boolean n(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1120bc3b", new Object[]{this, str})).booleanValue();
        }
        return v().contains(str);
    }

    public void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f678800b", new Object[]{this});
        }
    }

    public String p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bde13564", new Object[]{this});
        }
        return (String) f(Constants.Name.ARIA_LABEL);
    }

    public String q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fc953784", new Object[]{this});
        }
        return (String) f("ariaRole");
    }

    public xn1 r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xn1) ipChange.ipc$dispatch("b31679fd", new Object[]{this});
        }
        xn1 xn1Var = (xn1) f("backgroundImage");
        if (xn1Var != null) {
            return xn1Var;
        }
        return (xn1) f("backgroundColor");
    }

    public BorderProp s(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BorderProp) ipChange.ipc$dispatch("42e42b3e", new Object[]{this, new Boolean(z)});
        }
        if (z && this.f == null) {
            this.f = new BorderProp();
        }
        return this.f;
    }

    public int t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("89e4c91b", new Object[]{this})).intValue();
        }
        return ((Integer) f("bottom")).intValue();
    }

    public int u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1f6cdcb5", new Object[]{this})).intValue();
        }
        xn1 r = r();
        if (r != null) {
            return r.p();
        }
        return 0;
    }

    public Set<String> v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("576a2685", new Object[]{this});
        }
        return (Set) f("events");
    }

    public int w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4703e217", new Object[]{this})).intValue();
        }
        return y().height();
    }

    public int x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e2350677", new Object[]{this})).intValue();
        }
        return ((Integer) f("left")).intValue();
    }

    public Rect y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rect) ipChange.ipc$dispatch("2f7e93fb", new Object[]{this});
        }
        this.g.set(x(), G(), F(), t());
        return this.g;
    }

    public float z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2242c5cc", new Object[]{this})).floatValue();
        }
        Float f = (Float) f("opacity");
        if (f == null) {
            return 1.0f;
        }
        return f.floatValue();
    }

    public void V() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71728b5b", new Object[]{this});
            return;
        }
        j("events", new HashSet());
        j("paddingLeft", 0);
        j("paddingTop", 0);
        j("paddingRight", 0);
        j("paddingBottom", 0);
        j("left", 0);
        j("top", 0);
        j("right", 0);
        j("bottom", 0);
        j("transform", "");
        j("transition", "");
        j(Constants.Name.ARIA_LABEL, "");
        j(Constants.Name.ARIA_HIDDEN, Boolean.FALSE);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // tb.rwh
    public void b(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ec191f0", new Object[]{this, map});
            return;
        }
        super.b(map);
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        for (String str : map.keySet()) {
            str.hashCode();
            char c = 65535;
            switch (str.hashCode()) {
                case -1998952146:
                    if (str.equals("transitionDelay")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1724158635:
                    if (str.equals("transition")) {
                        c = 1;
                        break;
                    }
                    break;
                case -1721943862:
                    if (str.equals("translateX")) {
                        c = 2;
                        break;
                    }
                    break;
                case -1721943861:
                    if (str.equals("translateY")) {
                        c = 3;
                        break;
                    }
                    break;
                case -1501175880:
                    if (str.equals("paddingLeft")) {
                        c = 4;
                        break;
                    }
                    break;
                case -1383304148:
                    if (str.equals(pg1.ATOM_EXT_border)) {
                        c = 5;
                        break;
                    }
                    break;
                case -1383228885:
                    if (str.equals("bottom")) {
                        c = 6;
                        break;
                    }
                    break;
                case -1267206133:
                    if (str.equals("opacity")) {
                        c = 7;
                        break;
                    }
                    break;
                case -1111969773:
                    if (str.equals(Constants.Name.ARIA_HIDDEN)) {
                        c = '\b';
                        break;
                    }
                    break;
                case -863700117:
                    if (str.equals(Constants.Name.ARIA_LABEL)) {
                        c = '\t';
                        break;
                    }
                    break;
                case -699883785:
                    if (str.equals("transitionTimingFunction")) {
                        c = '\n';
                        break;
                    }
                    break;
                case 115029:
                    if (str.equals("top")) {
                        c = 11;
                        break;
                    }
                    break;
                case 3317767:
                    if (str.equals("left")) {
                        c = '\f';
                        break;
                    }
                    break;
                case 90130308:
                    if (str.equals("paddingTop")) {
                        c = '\r';
                        break;
                    }
                    break;
                case 108511772:
                    if (str.equals("right")) {
                        c = 14;
                        break;
                    }
                    break;
                case 202355100:
                    if (str.equals("paddingBottom")) {
                        c = 15;
                        break;
                    }
                    break;
                case 425064969:
                    if (str.equals("transitionDuration")) {
                        c = 16;
                        break;
                    }
                    break;
                case 713848971:
                    if (str.equals("paddingRight")) {
                        c = 17;
                        break;
                    }
                    break;
                case 1052666732:
                    if (str.equals("transform")) {
                        c = 18;
                        break;
                    }
                    break;
                case 1287124693:
                    if (str.equals("backgroundColor")) {
                        c = 19;
                        break;
                    }
                    break;
                case 1292595405:
                    if (str.equals("backgroundImage")) {
                        c = 20;
                        break;
                    }
                    break;
                case 1423936074:
                    if (str.equals("transitionProperty")) {
                        c = 21;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                case 1:
                case '\n':
                case 16:
                case 18:
                case 21:
                    z7 = true;
                    break;
                case 2:
                case 3:
                    z5 = true;
                    break;
                case 4:
                case '\r':
                case 15:
                case 17:
                    z3 = true;
                    z5 = true;
                    break;
                case 5:
                    s(true).a((BorderProp) map.get(pg1.ATOM_EXT_border));
                    z4 = true;
                    break;
                case 6:
                case 11:
                case '\f':
                case 14:
                    z = true;
                    z5 = true;
                    break;
                case 7:
                    z5 = true;
                    z7 = true;
                    break;
                case '\b':
                case '\t':
                    z6 = true;
                    break;
                case 19:
                    z7 = true;
                    z2 = true;
                    z5 = true;
                    break;
                case 20:
                    z2 = true;
                    z5 = true;
                    break;
            }
        }
        if ((z || z2) && r() != null) {
            r().setBounds(0, 0, N(), w());
        }
        if (z3) {
            this.c.setPadding(A());
        }
        if (z) {
            this.c.notifyLocationChange();
        }
        if (z4) {
            this.c.onBorderChange();
        }
        if (z5 || z4) {
            this.c.invalidate();
        }
        if (z6) {
            this.c.updateAriaLabel();
        }
        if (z7) {
            this.c.tryApplyTransform(true);
        }
    }
}
