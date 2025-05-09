package tb;

import android.graphics.Rect;
import android.util.Pair;
import android.view.View;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.component.BrowserComponent;
import com.taobao.tao.flexbox.layoutmanager.component.ListViewComponent;
import com.taobao.tao.flexbox.layoutmanager.component.ScrollViewComponent;
import com.taobao.tao.flexbox.layoutmanager.core.Component;
import com.taobao.tao.flexbox.layoutmanager.core.n;
import com.taobao.tao.flexbox.layoutmanager.module.element.ScrollChangeListener;
import java.util.ArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class djw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final float f17875a;
    public final float b;
    public final n c;
    public final Component d;
    public final Component e;
    public final ScrollChangeListener f;
    public final w2w g;

    static {
        t2o.a(503316891);
    }

    public djw(n nVar, float f, float f2, ScrollChangeListener scrollChangeListener, w2w w2wVar) {
        this.c = nVar;
        this.f17875a = f;
        this.b = f2;
        boolean z = nVar.K() instanceof xbu;
        Component d = d(nVar);
        this.d = d;
        if (d != null && !z) {
            this.e = d(d.getNode());
        }
        this.f = scrollChangeListener;
        this.g = w2wVar;
        if (d != null) {
            o(d);
        }
        Component component = this.e;
        if (component != null) {
            o(component);
        }
    }

    public static boolean a(n nVar) {
        int currentItem;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("72bb2217", new Object[]{nVar})).booleanValue();
        }
        try {
            n z = nVar.z(BrowserComponent.class, null, true);
            if (z != null && (currentItem = ((ViewPager) z.w0()).getCurrentItem()) >= 0 && currentItem < ((ArrayList) z.d).size()) {
                return ((n) ((ArrayList) z.d).get(currentItem)).k(nVar);
            }
        } catch (Throwable th) {
            tfs.d(th.getMessage());
        }
        return true;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7b39a9a", new Object[]{this});
            return;
        }
        Component component = this.d;
        if (component != null) {
            n(component);
        }
        Component component2 = this.e;
        if (component2 != null) {
            n(component2);
        }
    }

    public final Pair<n, View> c() {
        View view;
        n nVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("68e74b11", new Object[]{this});
        }
        Component component = this.d;
        if (component instanceof lkc) {
            nVar = this.c.L();
            view = (View) nVar.w0().getParent();
        } else {
            n nVar2 = null;
            if (component instanceof ScrollViewComponent) {
                n node = component.getNode();
                int size = ((ArrayList) node.d).size();
                if (size == 1) {
                    nVar2 = (n) ((ArrayList) node.d).get(0);
                } else if (size > 1) {
                    nVar2 = node;
                }
                nVar = this.c;
                while (nVar.Y() != null && nVar.Y() != nVar2) {
                    nVar = nVar.Y();
                }
                view = nVar.w0();
            } else if (component instanceof BrowserComponent) {
                nVar = this.c.L();
                view = (View) nVar.w0().getParent();
            } else {
                nVar = null;
                view = null;
            }
        }
        return new Pair<>(nVar, view);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0041, code lost:
        return r5.K();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.taobao.tao.flexbox.layoutmanager.core.Component d(com.taobao.tao.flexbox.layoutmanager.core.n r5) {
        /*
            r4 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = tb.djw.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x0018
            java.lang.String r1 = "c68f0e64"
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r4
            r3 = 1
            r2[r3] = r5
            java.lang.Object r5 = r0.ipc$dispatch(r1, r2)
            com.taobao.tao.flexbox.layoutmanager.core.Component r5 = (com.taobao.tao.flexbox.layoutmanager.core.Component) r5
            return r5
        L_0x0018:
            com.taobao.tao.flexbox.layoutmanager.core.n r5 = r5.Y()
        L_0x001c:
            if (r5 == 0) goto L_0x003b
            com.taobao.tao.flexbox.layoutmanager.core.Component r0 = r5.K()
            boolean r0 = r0 instanceof tb.lkc
            if (r0 != 0) goto L_0x003b
            com.taobao.tao.flexbox.layoutmanager.core.Component r0 = r5.K()
            boolean r0 = r0 instanceof com.taobao.tao.flexbox.layoutmanager.component.ScrollViewComponent
            if (r0 != 0) goto L_0x003b
            com.taobao.tao.flexbox.layoutmanager.core.Component r0 = r5.K()
            boolean r0 = r0 instanceof com.taobao.tao.flexbox.layoutmanager.component.BrowserComponent
            if (r0 != 0) goto L_0x003b
            com.taobao.tao.flexbox.layoutmanager.core.n r5 = r5.Y()
            goto L_0x001c
        L_0x003b:
            if (r5 == 0) goto L_0x0042
            com.taobao.tao.flexbox.layoutmanager.core.Component r5 = r5.K()
            return r5
        L_0x0042:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.djw.d(com.taobao.tao.flexbox.layoutmanager.core.n):com.taobao.tao.flexbox.layoutmanager.core.Component");
    }

    public int e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("109572f3", new Object[]{this})).intValue();
        }
        Component component = this.d;
        if (component == null) {
            return 0;
        }
        View view = component.getView();
        if (view instanceof RecyclerView) {
            return ((RecyclerView) view).getScrollState();
        }
        Component component2 = this.d;
        if (component2 instanceof ScrollViewComponent) {
            return ((ScrollViewComponent) component2).getScrollState();
        }
        return 0;
    }

    public final int[] f() {
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("4b0288ac", new Object[]{this});
        }
        Component component = this.d;
        if (component != null) {
            view = component.getView();
        } else {
            view = this.c.g0().w0();
        }
        if (view == null) {
            return new int[]{0, 0};
        }
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        return new int[]{rect.width(), rect.height()};
    }

    public final int[] g(n nVar) {
        int i;
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("419416e", new Object[]{this, nVar});
        }
        rbi S = this.c.S();
        if (!akt.l2()) {
            i2 = S.c;
            i = S.d;
        } else if (this.c != nVar) {
            i2 = S.c;
            i = S.d;
        } else {
            i = 0;
        }
        try {
            n nVar2 = this.c;
            if (nVar2 != nVar) {
                for (n Y = nVar2.Y(); Y != null && Y != nVar; Y = Y.Y()) {
                    i += Y.S().d;
                    i2 += Y.S().c;
                }
            }
        } catch (Exception unused) {
        }
        return new int[]{i2, i};
    }

    public Component h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Component) ipChange.ipc$dispatch("f9c9f300", new Object[]{this});
        }
        return this.d;
    }

    public final Rect i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rect) ipChange.ipc$dispatch("379a5ef6", new Object[]{this});
        }
        rbi S = this.c.S();
        int[] j = j();
        return new Rect((int) ((-S.f27261a) * (1.0f - this.b)), (int) ((-S.b) * (1.0f - this.f17875a)), j[0], j[1]);
    }

    public final int[] j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("6920988c", new Object[]{this});
        }
        rbi S = this.c.S();
        int[] f = f();
        return new int[]{f[0] + ((int) (S.f27261a * (1.0f - this.b))), f[1] + ((int) (S.b * (1.0f - this.f17875a)))};
    }

    public final Rect k() {
        int i;
        int i2;
        int left;
        int scrollX;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rect) ipChange.ipc$dispatch("10d262b", new Object[]{this});
        }
        try {
            Pair<n, View> c = c();
            View view = (View) c.second;
            Component component = this.d;
            if (component instanceof lkc) {
                i = view.getTop();
                i2 = view.getLeft();
            } else {
                if (component instanceof ScrollViewComponent) {
                    i = view.getTop() - ((ScrollViewComponent) this.d).getScrollView().getScrollY();
                    left = view.getLeft();
                    scrollX = ((ScrollViewComponent) this.d).getScrollView().getScrollX();
                } else if (component instanceof BrowserComponent) {
                    i = view.getTop();
                    left = view.getLeft();
                    scrollX = this.d.getView().getScrollX();
                } else {
                    i2 = 0;
                    i = 0;
                }
                i2 = left - scrollX;
            }
            rbi S = this.c.S();
            int[] g = g((n) c.first);
            int i3 = i + g[1];
            int i4 = i2 + g[0];
            return new Rect(i4, i3, S.f27261a + i4, S.b + i3);
        } catch (Exception unused) {
            return new Rect();
        }
    }

    public final boolean l(Component component) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("717f95cd", new Object[]{this, component})).booleanValue();
        }
        View view = component.getView();
        if (view == null || !nwv.a0(view)) {
            return false;
        }
        return true;
    }

    public boolean m(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c1a73849", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        try {
            View w0 = this.c.w0();
            if (w0 != null && nwv.a0(w0) && ViewCompat.isAttachedToWindow(w0) && w0.getVisibility() == 0 && a(this.c)) {
                if (this.d != null && ((akt.z0() && !this.d.getNode().z0()) || !l(this.d))) {
                    return false;
                }
                Rect k = k();
                boolean contains = i().contains(k);
                if (!z || contains) {
                    return contains;
                }
                int[] f = f();
                return new Rect(0, 0, f[0], f[1]).intersect(k);
            }
            return false;
        } catch (Throwable th) {
            tfs.d(th.getMessage());
            return false;
        }
    }

    public final void n(Component component) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5a2f393", new Object[]{this, component});
        } else if (component instanceof ListViewComponent) {
            ListViewComponent listViewComponent = (ListViewComponent) component;
            listViewComponent.removeScrollStateListener(this.f);
            w2w w2wVar = this.g;
            if (w2wVar != null) {
                listViewComponent.Y1(w2wVar);
            }
        } else if (component instanceof ScrollViewComponent) {
            ((ScrollViewComponent) component).removeScrollChangedListener(this.f);
        } else if (component instanceof BrowserComponent) {
            ((BrowserComponent) component).removeScrollStateListener(this.f);
        } else if (component instanceof czo) {
            ((czo) component).removeScrollStateListener(this.f);
        }
    }

    public final void o(Component component) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("114da3cc", new Object[]{this, component});
        } else if (component instanceof ListViewComponent) {
            ListViewComponent listViewComponent = (ListViewComponent) component;
            listViewComponent.addScrollStateListener(this.f);
            w2w w2wVar = this.g;
            if (w2wVar != null) {
                listViewComponent.v1(w2wVar);
            }
        } else if (component instanceof ScrollViewComponent) {
            ((ScrollViewComponent) component).addScrollChangedListener(this.f);
        } else if (component instanceof BrowserComponent) {
            ((BrowserComponent) component).addScrollStateListener(this.f);
        } else if (component instanceof czo) {
            ((czo) component).addScrollStateListener(this.f);
        }
    }
}
