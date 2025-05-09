package tb;

import android.graphics.Rect;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_uikit.ui.UINode;
import com.taobao.android.weex_uikit.widget.border.BorderProp;
import com.taobao.weex.common.Constants;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class fvu extends evu {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final Set<String> i = new HashSet();
    public boolean j;

    static {
        t2o.a(986710090);
    }

    public fvu(UINode uINode) {
        super(uINode);
    }

    public static /* synthetic */ Object ipc$super(fvu fvuVar, String str, Object... objArr) {
        if (str.hashCode() == -2080497642) {
            super.d((evu) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_uikit/ui/UINodeInfoPerf");
    }

    @Override // tb.evu
    public Rect A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rect) ipChange.ipc$dispatch("1a2132ab", new Object[]{this});
        }
        return this.h;
    }

    @Override // tb.evu
    public int B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("86af8f60", new Object[]{this})).intValue();
        }
        return this.h.bottom;
    }

    @Override // tb.evu
    public int C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("111699fc", new Object[]{this})).intValue();
        }
        return this.h.left;
    }

    @Override // tb.evu
    public int D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4f2526fb", new Object[]{this})).intValue();
        }
        return this.h.right;
    }

    @Override // tb.evu
    public int E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1c5536f4", new Object[]{this})).intValue();
        }
        return this.h.top;
    }

    @Override // tb.evu
    public int F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a1d449e0", new Object[]{this})).intValue();
        }
        return this.g.right;
    }

    @Override // tb.evu
    public int G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f9c9cf19", new Object[]{this})).intValue();
        }
        return this.g.top;
    }

    @Override // tb.evu
    public int N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fc48d08a", new Object[]{this})).intValue();
        }
        return y().width();
    }

    @Override // tb.evu
    public void P(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36761a87", new Object[]{this, str});
            return;
        }
        ((HashSet) this.i).remove(str);
        i("events", this.i);
    }

    @Override // tb.evu
    public void V() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71728b5b", new Object[]{this});
            return;
        }
        j("transform", "");
        j("transition", "");
        j(Constants.Name.ARIA_LABEL, "");
        j(Constants.Name.ARIA_HIDDEN, Boolean.FALSE);
    }

    @Override // tb.evu
    public void Z(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ce01816", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        b0(i);
        d0(i2);
        c0(i3);
        a0(i4);
    }

    @Override // tb.evu
    public void a0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e66e5342", new Object[]{this, new Integer(i)});
        } else if (B() != i) {
            this.h.bottom = i;
            this.j = true;
        }
    }

    @Override // tb.evu
    public void b0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5b9af26", new Object[]{this, new Integer(i)});
        } else if (C() != i) {
            this.h.left = i;
            this.j = true;
        }
    }

    @Override // tb.evu
    public void c0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7116396f", new Object[]{this, new Integer(i)});
        } else if (D() != i) {
            this.h.right = i;
            this.j = true;
        }
    }

    @Override // tb.evu
    public void d0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a528b596", new Object[]{this, new Integer(i)});
        } else if (E() != i) {
            this.h.top = i;
            this.j = true;
        }
    }

    @Override // tb.evu
    public void l(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a85d704a", new Object[]{this, str});
            return;
        }
        ((HashSet) this.i).add(str);
        i("events", this.i);
    }

    @Override // tb.evu
    /* renamed from: m */
    public void d(evu evuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83fe2016", new Object[]{this, evuVar});
            return;
        }
        fvu fvuVar = (fvu) evuVar;
        fvuVar.h.set(this.h);
        fvuVar.g.set(this.g);
        fvuVar.i.addAll(this.i);
        super.d(evuVar);
    }

    @Override // tb.evu
    public int t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("89e4c91b", new Object[]{this})).intValue();
        }
        return this.g.bottom;
    }

    @Override // tb.evu
    public Set<String> v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("576a2685", new Object[]{this});
        }
        return this.i;
    }

    @Override // tb.evu
    public int w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4703e217", new Object[]{this})).intValue();
        }
        return y().height();
    }

    @Override // tb.evu
    public int x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e2350677", new Object[]{this})).intValue();
        }
        return this.g.left;
    }

    @Override // tb.evu
    public Rect y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rect) ipChange.ipc$dispatch("2f7e93fb", new Object[]{this});
        }
        return this.g;
    }

    @Override // tb.evu
    public void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f678800b", new Object[]{this});
        } else if (this.j) {
            i("padding", new Rect(this.h));
            this.j = false;
        }
    }

    @Override // tb.evu
    public void X(int i, int i2, int i3, int i4) {
        boolean z = true;
        z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("219b20f2", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        if (x() != i) {
            this.g.left = i;
            z = true;
        }
        if (G() != i2) {
            this.g.top = i2;
            z = true;
        }
        if (F() != i3) {
            this.g.right = i3;
            z = true;
        }
        if (t() != i4) {
            this.g.bottom = i4;
        }
        if (z) {
            i("location", new Rect(this.g));
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // tb.evu, tb.rwh
    public void b(Map<String, Object> map) {
        Set set;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ec191f0", new Object[]{this, map});
            return;
        }
        ((HashMap) this.f27647a).putAll(map);
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        boolean z8 = false;
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
                case -1383304148:
                    if (str.equals(pg1.ATOM_EXT_border)) {
                        c = 4;
                        break;
                    }
                    break;
                case -1291329255:
                    if (str.equals("events")) {
                        c = 5;
                        break;
                    }
                    break;
                case -1267206133:
                    if (str.equals("opacity")) {
                        c = 6;
                        break;
                    }
                    break;
                case -1111969773:
                    if (str.equals(Constants.Name.ARIA_HIDDEN)) {
                        c = 7;
                        break;
                    }
                    break;
                case -863700117:
                    if (str.equals(Constants.Name.ARIA_LABEL)) {
                        c = '\b';
                        break;
                    }
                    break;
                case -806339567:
                    if (str.equals("padding")) {
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
                case 425064969:
                    if (str.equals("transitionDuration")) {
                        c = 11;
                        break;
                    }
                    break;
                case 1052666732:
                    if (str.equals("transform")) {
                        c = '\f';
                        break;
                    }
                    break;
                case 1287124693:
                    if (str.equals("backgroundColor")) {
                        c = '\r';
                        break;
                    }
                    break;
                case 1292595405:
                    if (str.equals("backgroundImage")) {
                        c = 14;
                        break;
                    }
                    break;
                case 1423936074:
                    if (str.equals("transitionProperty")) {
                        c = 15;
                        break;
                    }
                    break;
                case 1901043637:
                    if (str.equals("location")) {
                        c = 16;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                case 1:
                case '\n':
                case 11:
                case '\f':
                case 15:
                    z7 = true;
                    break;
                case 2:
                case 3:
                    z4 = true;
                    break;
                case 4:
                    s(true).a((BorderProp) map.get(pg1.ATOM_EXT_border));
                    z5 = true;
                    break;
                case 5:
                    z8 = true;
                    break;
                case 6:
                    z4 = true;
                    z7 = true;
                    break;
                case 7:
                case '\b':
                    z6 = true;
                    break;
                case '\t':
                    z3 = true;
                    z4 = true;
                    break;
                case '\r':
                    z7 = true;
                    z2 = true;
                    z4 = true;
                    break;
                case 14:
                    z2 = true;
                    z4 = true;
                    break;
                case 16:
                    z = true;
                    z4 = true;
                    break;
            }
        }
        if ((z || z2) && r() != null) {
            r().setBounds(0, 0, N(), w());
        }
        if (z3) {
            Rect rect = (Rect) map.get("padding");
            if (rect != null) {
                this.h.set(rect);
            }
            this.c.setPadding(A());
        }
        if (z) {
            Rect rect2 = (Rect) map.get("location");
            if (rect2 != null) {
                this.g.set(rect2);
            }
            this.c.notifyLocationChange();
        }
        if (z5) {
            this.c.onBorderChange();
        }
        if (z4 || z5) {
            this.c.invalidate();
        }
        if (z6) {
            this.c.updateAriaLabel();
        }
        if (z7) {
            this.c.tryApplyTransform(true);
        }
        if (z8 && (set = (Set) map.get("events")) != null) {
            ((HashSet) this.i).clear();
            this.i.addAll(set);
        }
    }
}
