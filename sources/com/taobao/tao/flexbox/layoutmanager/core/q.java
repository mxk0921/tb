package com.taobao.tao.flexbox.layoutmanager.core;

import android.graphics.Rect;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.android.alibaba.ip.runtime.IpChange;
import com.facebook.yoga.YogaPositionType;
import com.taobao.tao.flexbox.layoutmanager.component.BrowserComponent;
import com.taobao.tao.flexbox.layoutmanager.component.ListViewComponent;
import com.taobao.tao.flexbox.layoutmanager.component.TabBarControllerComponent;
import com.taobao.tao.flexbox.layoutmanager.component.d;
import com.taobao.tao.flexbox.layoutmanager.core.Component;
import com.taobao.tao.flexbox.layoutmanager.core.n;
import com.taobao.weex.ui.component.WXBasicComponentType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import tb.a5k;
import tb.akt;
import tb.bh3;
import tb.iqs;
import tb.jfw;
import tb.lkc;
import tb.nwv;
import tb.od0;
import tb.pg1;
import tb.rbi;
import tb.s6o;
import tb.s7p;
import tb.t2o;
import tb.xbu;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class q {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(503317183);
    }

    public static boolean B(n nVar, n nVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b20d6cb6", new Object[]{nVar, nVar2})).booleanValue();
        }
        n Y = nVar2.Y();
        while (Y != nVar && Y != null) {
            Y = Y.Y();
        }
        if (Y == nVar) {
            return true;
        }
        return false;
    }

    public static boolean C(n nVar, n nVar2) {
        ViewPager viewPager;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3d8ff95", new Object[]{nVar, nVar2})).booleanValue();
        }
        if (!(nVar.K() instanceof TabBarControllerComponent) || (viewPager = (ViewPager) nVar.w0()) == null || ((ArrayList) nVar.d).get(viewPager.getCurrentItem()) == nVar2) {
            return true;
        }
        return false;
    }

    public static n a(n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n) ipChange.ipc$dispatch("78a65478", new Object[]{nVar});
        }
        if (nVar.r0().equals("cells")) {
            return nVar.Y().Y();
        }
        if (nVar.r0().equals("section")) {
            return nVar.Y();
        }
        if (nVar.K() == null) {
            return null;
        }
        return nVar;
    }

    public static List<n> b(n nVar, float f, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("a5cc3ede", new Object[]{nVar, new Float(f), new Boolean(z)});
        }
        if (nVar.K() != null && nVar.K().getViewParams().a0) {
            return null;
        }
        if (z && f == 1.0f) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        c(nVar, arrayList);
        return arrayList;
    }

    public static void c(n nVar, List<n> list) {
        rbi S;
        int i;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6fb76a9", new Object[]{nVar, list});
            return;
        }
        rbi S2 = nVar.S();
        List<n> j0 = nVar.j0();
        if (j0 != null) {
            for (n nVar2 : j0) {
                if (nVar2.K() == null || nVar2.K().getViewParams().z != YogaPositionType.ABSOLUTE || ((i = (S = nVar2.S()).c) >= 0 && i + S.f27261a <= S2.f27261a && (i2 = S.d) >= 0 && i2 + S.b <= S2.b)) {
                    c(nVar2, list);
                } else {
                    list.add(nVar2);
                }
            }
        }
    }

    public static n d(n nVar, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n) ipChange.ipc$dispatch("175b6ec", new Object[]{nVar, new Integer(i), new Integer(i2)});
        }
        if (nVar.K() instanceof d) {
            return nVar;
        }
        if (nVar.K() instanceof a5k) {
            return d(((a5k) nVar.K()).n(), i, i2);
        }
        n nVar2 = nVar;
        for (int i3 = 0; i3 < ((ArrayList) nVar.d).size(); i3++) {
            n nVar3 = (n) ((ArrayList) nVar.d).get(i3);
            if (C(nVar, nVar3) && v(nVar3, i, i2)) {
                nVar2 = d(nVar3, i, i2);
            } else if ((nVar2 == null || nVar2 == nVar) && i3 == ((ArrayList) nVar.d).size() - 1) {
                return nVar;
            }
        }
        return nVar2;
    }

    public static n e(n nVar, int i, int i2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n) ipChange.ipc$dispatch("5294f25d", new Object[]{nVar, new Integer(i), new Integer(i2), new Boolean(z)});
        }
        n f = f(nVar, i, i2, z);
        if (f != null) {
            return a(f);
        }
        return f;
    }

    public static n g(n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n) ipChange.ipc$dispatch("382000a7", new Object[]{nVar});
        }
        n nVar2 = nVar.b;
        while (nVar2 != null && !(nVar2.K() instanceof ListViewComponent)) {
            nVar2 = nVar2.b;
        }
        return nVar2;
    }

    public static n h(n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n) ipChange.ipc$dispatch("75b213a3", new Object[]{nVar});
        }
        n nVar2 = nVar.b;
        while (nVar2 != null && !(nVar2.K() instanceof lkc)) {
            nVar2 = nVar2.b;
        }
        return nVar2;
    }

    public static List<Pair<n, n.f>> i(Set<Pair<n, n.f>> set) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("3d3958ca", new Object[]{set});
        }
        ArrayList arrayList = new ArrayList();
        if (set != null && !set.isEmpty()) {
            for (Pair<n, n.f> pair : set) {
                int i = 0;
                while (true) {
                    if (i < arrayList.size()) {
                        Pair pair2 = (Pair) arrayList.get(i);
                        if (!B((n) pair2.first, (n) pair.first)) {
                            if (B((n) pair.first, (n) pair2.first)) {
                                arrayList.set(i, pair);
                                break;
                            }
                            i++;
                        }
                    }
                }
                arrayList.add(pair);
            }
        }
        return arrayList;
    }

    public static n j(n nVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n) ipChange.ipc$dispatch("ac89fb6b", new Object[]{nVar, str});
        }
        if (nVar == null || TextUtils.isEmpty(str)) {
            return nVar;
        }
        n w = nVar.w(str, false);
        if (w == null) {
            return nVar.g0().w(str, false);
        }
        return w;
    }

    public static String k(n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5e81a68c", new Object[]{nVar});
        }
        Map l = l(nVar);
        if (l != null) {
            return nwv.I(l.get("md5"), null);
        }
        return null;
    }

    public static Map l(n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("c98e0266", new Object[]{nVar});
        }
        if (nVar != null) {
            return nwv.z(nVar.u0().g.get("."), null);
        }
        return null;
    }

    public static String m(n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b6d57144", new Object[]{nVar});
        }
        Map l = l(nVar);
        if (l != null) {
            return nwv.I(l.get("time"), null);
        }
        return null;
    }

    public static int n(n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("297249ed", new Object[]{nVar})).intValue();
        }
        Map l = l(nVar);
        if (l != null) {
            return nwv.t(l.get("version"), -1);
        }
        return -1;
    }

    public static Rect o(Component component) {
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rect) ipChange.ipc$dispatch("3c18b32f", new Object[]{component});
        }
        Component.j hostViewComponent = component.getHostViewComponent();
        if (hostViewComponent != null) {
            View view2 = hostViewComponent.f12191a.getView();
            rbi rbiVar = hostViewComponent.b;
            if (!view2.isAttachedToWindow()) {
                return null;
            }
            int[] iArr = new int[2];
            view2.getLocationOnScreen(iArr);
            int i = iArr[0];
            int i2 = rbiVar.c;
            int i3 = iArr[1];
            int i4 = rbiVar.d;
            return new Rect(i + i2, i3 + i4, i + i2 + rbiVar.f27261a, i3 + i4 + rbiVar.b);
        }
        n Y = component.getNode().Y();
        if (Y == null || ((!Y.r0().equals(WXBasicComponentType.CELL) && !(Y.K() instanceof iqs)) || (view = component.getView()) == null || !view.isAttachedToWindow())) {
            return null;
        }
        rbi S = component.getNode().S();
        int[] iArr2 = new int[2];
        view.getLocationOnScreen(iArr2);
        int i5 = iArr2[0];
        int i6 = S.c;
        int i7 = iArr2[1];
        int i8 = S.d;
        return new Rect(i5 + i6, i7 + i8, i5 + i6 + S.f27261a, i7 + i8 + S.b);
    }

    public static int p(n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("eaa11569", new Object[]{nVar})).intValue();
        }
        return Math.max(s6o.U(nVar, nVar.N(), nwv.t(nVar.H("height"), 0)), s6o.U(nVar, nVar.N(), nwv.t(nVar.H(pg1.ATOM_EXT_UDL_min_height), 0)));
    }

    public static int q(n nVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ec57e418", new Object[]{nVar, new Boolean(z)})).intValue();
        }
        jfw jfwVar = new jfw();
        jfwVar.E(nVar);
        jfwVar.B(nVar.N(), nVar.I());
        if (z) {
            return jfwVar.m + jfwVar.n;
        }
        return jfwVar.k + jfwVar.l;
    }

    public static String s(n.g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f0967938", new Object[]{gVar});
        }
        if (gVar == null) {
            return "unknown";
        }
        if (!TextUtils.equals(gVar.d, "onpagedisappear") && !TextUtils.equals(gVar.d, "onstop")) {
            return "unknown";
        }
        String I = nwv.I(gVar.e.get("type"), "page");
        return (!TextUtils.equals(I, "page") || od0.D().j().e()) ? I : "background";
    }

    public static List<n> t(n nVar, n nVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("bfcd29ff", new Object[]{nVar, nVar2});
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(nVar);
        for (n Y = nVar.Y(); Y != nVar2; Y = Y.Y()) {
            arrayList.add(Y);
        }
        arrayList.add(nVar2);
        return arrayList;
    }

    public static n u(n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n) ipChange.ipc$dispatch("469bddb", new Object[]{nVar});
        }
        while (true) {
            n nVar2 = nVar.b;
            if (nVar2 == null) {
                return null;
            }
            if (nVar2.r0().equals("TabBarController")) {
                return nVar;
            }
            nVar = nVar.b;
        }
    }

    public static boolean v(n nVar, int i, int i2) {
        Rect o;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f9d9ec5f", new Object[]{nVar, new Integer(i), new Integer(i2)})).booleanValue();
        }
        Component K = nVar.K();
        if ((K instanceof s7p) || (K instanceof bh3)) {
            return true;
        }
        if (K == null && nVar.r0().equals(WXBasicComponentType.CELL) && !((ArrayList) nVar.d).isEmpty()) {
            K = ((n) ((ArrayList) nVar.d).get(0)).K();
        }
        if (K == null || (o = o(K)) == null) {
            return false;
        }
        return o.contains(i, i2);
    }

    public static boolean w(n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c9b5e11b", new Object[]{nVar})).booleanValue();
        }
        if (akt.v()) {
            return x(nVar);
        }
        return y(nVar);
    }

    public static boolean x(n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f266bcda", new Object[]{nVar})).booleanValue();
        }
        if (h(nVar) != null) {
            return true;
        }
        return false;
    }

    public static boolean y(n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("24e0feb3", new Object[]{nVar})).booleanValue();
        }
        n L = nVar.L();
        if (L == null || L.Y() == null || (!L.Y().r0().equals(WXBasicComponentType.CELL) && !L.Y().r0().equals("header"))) {
            return false;
        }
        return true;
    }

    public static int r(n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3ccfab9a", new Object[]{nVar})).intValue();
        }
        return Math.max(s6o.U(nVar, nVar.N(), nwv.t(nVar.H("width"), 0)), s6o.U(nVar, nVar.N(), nwv.t(nVar.H(pg1.ATOM_EXT_UDL_min_width), 0)));
    }

    public static boolean A(n.g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bd0b3c51", new Object[]{gVar})).booleanValue();
        }
        if (gVar == null || !TextUtils.equals(gVar.d, "onwilldisappear")) {
            return false;
        }
        String I = nwv.I(gVar.e.get("type"), "item");
        return TextUtils.equals(I, "tab") || TextUtils.equals(I, "page");
    }

    public static n f(n nVar, int i, int i2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n) ipChange.ipc$dispatch("6211423a", new Object[]{nVar, new Integer(i), new Integer(i2), new Boolean(z)});
        }
        n nVar2 = null;
        if (nVar.K() instanceof d) {
            return null;
        }
        for (int i3 = 0; i3 < ((ArrayList) nVar.d).size(); i3++) {
            n nVar3 = (n) ((ArrayList) nVar.d).get(i3);
            if (C(nVar, nVar3) && v(nVar3, i, i2)) {
                if (!(nVar3.K() instanceof xbu) || nVar3.H(xbu.KEY_TRACK_TARGET) == null) {
                    nVar2 = f(nVar3, i, i2, z);
                } else {
                    boolean z2 = !z;
                    BrowserComponent browserComponent = (BrowserComponent) nVar3.v(BrowserComponent.class);
                    if (browserComponent != null && v(browserComponent.getNode(), i, i2)) {
                        z2 = z ? browserComponent.v() : !browserComponent.w();
                    }
                    if (z2) {
                        return nVar3;
                    }
                }
            }
        }
        return nVar2;
    }

    public static boolean z(n.g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c4a70bed", new Object[]{gVar})).booleanValue();
        }
        if (gVar == null || !TextUtils.equals(gVar.d, "onwillappear")) {
            return false;
        }
        String I = nwv.I(gVar.e.get("type"), "item");
        return TextUtils.equals(I, "tab") || TextUtils.equals(I, "page");
    }
}
