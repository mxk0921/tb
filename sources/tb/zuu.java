package tb;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_uikit.ui.MUSView;
import com.taobao.android.weex_uikit.ui.UINode;
import com.taobao.android.weex_uikit.ui.UINodeType;
import com.taobao.android.weex_uikit.widget.border.BorderProp;
import com.taobao.android.weex_uikit.widget.img.Image;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class zuu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final MUSView f33028a;
    public int b;
    public int c;
    public int d;
    public int e;
    public Context f;
    public final Rect g = new Rect();
    public boolean h = true;
    public xuu i;

    static {
        t2o.a(986710074);
    }

    public zuu(MUSView mUSView) {
        this.f33028a = mUSView;
        this.f = mUSView.getContext();
    }

    public static void a(Object obj, int i, int i2, int i3, int i4, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7326a9b3", new Object[]{obj, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Boolean(z)});
        } else if (obj instanceof View) {
            nuu.a((View) obj, i, i2, i3, i4, z);
        } else if (obj instanceof Drawable) {
            ((Drawable) obj).setBounds(0, 0, i3 - i, i4 - i2);
        } else {
            throw new IllegalStateException("Unsupported mounted content " + obj);
        }
    }

    public static void b(UINode uINode, Object obj, Rect rect) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9062c13c", new Object[]{uINode, obj, rect});
            return;
        }
        if (obj != null) {
            BorderProp s = uINode.getNodeInfo().s(false);
            if (s == null) {
                a(obj, rect.left, rect.top, rect.right, rect.bottom, true);
            } else {
                a(obj, rect.left + s.g(0), rect.top + s.g(1), rect.right - s.g(2), rect.bottom - s.g(3), true);
            }
        }
        if (uINode.getNodeInfo().r() != null) {
            a(uINode.getNodeInfo().r(), rect.left, rect.top, rect.right, rect.bottom, true);
        }
        uINode.onBoundsChange(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static void e(UINode uINode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ea6ff24", new Object[]{uINode});
        } else if (jvu.b(uINode)) {
            o((View) uINode.getMountContent());
        }
    }

    public static void o(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab6d7de6", new Object[]{view});
        } else {
            jvu.h(view);
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e14def59", new Object[]{this});
            return;
        }
        this.g.setEmpty();
        this.h = true;
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("278b3153", new Object[]{this})).booleanValue();
        }
        return this.h;
    }

    public void f(UINode uINode, Rect rect) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27985531", new Object[]{this, uINode, rect});
        } else if (uINode != null) {
            if (uINode.getNodeType() != UINodeType.LAYOUT) {
                obj = dd4.a(this.f, uINode);
                if (obj instanceof vuu) {
                    vuu vuuVar = (vuu) obj;
                    vuuVar.n(uINode.getNodeInfo().A());
                    vuuVar.m(uINode);
                } else if (obj instanceof View) {
                    jvu.g(uINode, (View) obj);
                }
                this.f33028a.mount(obj);
                if (uINode instanceof Image) {
                    this.f33028a.addImageNode();
                }
            } else {
                obj = null;
            }
            uINode.setView(this.f33028a);
            b(uINode, obj, rect);
            uINode.mount(this.f33028a.getInstance(), obj);
            if (obj == null) {
                uINode.invalidate();
            } else {
                this.f33028a.invalidate();
            }
        } else {
            throw new RuntimeException("Trying to mount a null Node.");
        }
    }

    public void g(xuu xuuVar, Rect rect, boolean z, boolean z2, boolean z3) {
        boolean z4;
        boolean z5;
        boolean z6;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad6a331a", new Object[]{this, xuuVar, rect, new Boolean(z), new Boolean(z2), new Boolean(z3)});
        } else if (xuuVar != null) {
            this.i = xuuVar;
            this.f33028a.suppressInvalidate(true);
            if (rect == null || !z2) {
                z4 = false;
            } else {
                z4 = true;
            }
            if (!z4 || !h(xuuVar, rect, z)) {
                int e = xuuVar.e();
                for (int i = 0; i < e; i++) {
                    UINode d = xuuVar.d(i);
                    boolean isMounted = d.isMounted();
                    if (!z4 || Rect.intersects(rect, d.getGlobalVisibleRect())) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (!z3 || (rect != null && Rect.intersects(rect, d.getGlobalVisibleRect()))) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (z) {
                        if (z5 && !isMounted) {
                            f(d, d.getGlobalVisibleRect());
                        } else if (!z5 && isMounted) {
                            m(d, false);
                        }
                    }
                    if (z6 && !d.isMountState()) {
                        d.notifyMountState();
                    } else if (!z6 && d.isMountState()) {
                        d.notifyUnmountState();
                    }
                }
                if (rect != null && z3) {
                    l(xuuVar, rect);
                }
            }
            if (rect != null) {
                this.g.set(rect);
            }
            this.f33028a.suppressInvalidate(false);
        } else {
            throw new IllegalStateException("Trying to mount a null layoutState");
        }
    }

    public final boolean h(xuu xuuVar, Rect rect, boolean z) {
        boolean z2;
        boolean z3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ef0fc665", new Object[]{this, xuuVar, rect, new Boolean(z)})).booleanValue();
        }
        if (this.g.isEmpty()) {
            return false;
        }
        int i = rect.left;
        Rect rect2 = this.g;
        if (i == rect2.left && rect.right == rect2.right) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (rect.top == rect2.top && rect.bottom == rect2.bottom) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (z3) {
            List<UINode> i2 = xuuVar.i();
            List<UINode> f = xuuVar.f();
            int e = xuuVar.e();
            if (rect.top > 0 || this.g.top > 0) {
                while (true) {
                    int i3 = this.c;
                    if (i3 >= e || rect.top < f.get(i3).getGlobalVisibleRect().bottom) {
                        break;
                    }
                    UINode uINode = f.get(this.c);
                    if (uINode.isMounted() && z) {
                        m(uINode, false);
                    }
                    if (uINode.isMountState()) {
                        uINode.notifyUnmountState();
                    }
                    this.c++;
                }
                while (true) {
                    int i4 = this.c;
                    if (i4 <= 0 || rect.top >= f.get(i4 - 1).getGlobalVisibleRect().bottom) {
                        break;
                    }
                    int i5 = this.c - 1;
                    this.c = i5;
                    UINode uINode2 = f.get(i5);
                    if (!uINode2.isMounted() && z) {
                        f(uINode2, uINode2.getGlobalVisibleRect());
                    }
                    if (!uINode2.isMountState()) {
                        uINode2.notifyMountState();
                    }
                }
            }
            int height = this.f33028a.getHeight();
            if (rect.bottom < height || this.g.bottom < height) {
                while (true) {
                    int i6 = this.b;
                    if (i6 >= e || rect.bottom <= i2.get(i6).getGlobalVisibleRect().top) {
                        break;
                    }
                    UINode uINode3 = i2.get(this.b);
                    if (!uINode3.isMounted() && z) {
                        f(uINode3, uINode3.getGlobalVisibleRect());
                    }
                    if (!uINode3.isMountState()) {
                        uINode3.notifyMountState();
                    }
                    this.b++;
                }
                while (true) {
                    int i7 = this.b;
                    if (i7 <= 0 || rect.bottom > i2.get(i7 - 1).getGlobalVisibleRect().top) {
                        break;
                    }
                    int i8 = this.b - 1;
                    this.b = i8;
                    UINode uINode4 = i2.get(i8);
                    if (uINode4.isMounted() && z) {
                        m(uINode4, false);
                    }
                    if (uINode4.isMountState()) {
                        uINode4.notifyUnmountState();
                    }
                }
            }
        }
        if (z2) {
            List<UINode> g = xuuVar.g();
            List<UINode> h = xuuVar.h();
            int e2 = xuuVar.e();
            if (rect.left > 0 || this.g.left > 0) {
                while (true) {
                    int i9 = this.e;
                    if (i9 >= e2 || rect.left < h.get(i9).getGlobalVisibleRect().right) {
                        break;
                    }
                    UINode uINode5 = h.get(this.e);
                    if (uINode5.isMounted() && z) {
                        m(uINode5, false);
                    }
                    if (uINode5.isMountState()) {
                        uINode5.notifyUnmountState();
                    }
                    this.e++;
                }
                while (true) {
                    int i10 = this.e;
                    if (i10 <= 0 || rect.left >= h.get(i10 - 1).getGlobalVisibleRect().right) {
                        break;
                    }
                    int i11 = this.e - 1;
                    this.e = i11;
                    UINode uINode6 = h.get(i11);
                    if (!uINode6.isMounted() && z) {
                        f(uINode6, uINode6.getGlobalVisibleRect());
                    }
                    if (!uINode6.isMountState()) {
                        uINode6.notifyMountState();
                    }
                }
            }
            int width = this.f33028a.getWidth();
            if (rect.right < width || this.g.right < width) {
                while (true) {
                    int i12 = this.d;
                    if (i12 >= e2 || rect.right <= g.get(i12).getGlobalVisibleRect().left) {
                        break;
                    }
                    UINode uINode7 = g.get(this.d);
                    if (!uINode7.isMounted() && z) {
                        f(uINode7, uINode7.getGlobalVisibleRect());
                    }
                    if (!uINode7.isMountState()) {
                        uINode7.notifyMountState();
                    }
                    this.d++;
                }
                while (true) {
                    int i13 = this.d;
                    if (i13 <= 0 || rect.right > g.get(i13 - 1).getGlobalVisibleRect().left) {
                        break;
                    }
                    int i14 = this.d - 1;
                    this.d = i14;
                    UINode uINode8 = g.get(i14);
                    if (uINode8.isMounted() && z) {
                        m(uINode8, false);
                    }
                    if (uINode8.isMountState()) {
                        uINode8.notifyUnmountState();
                    }
                }
            }
        }
        if (z2 || z3) {
            return true;
        }
        return false;
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
            return;
        }
        xuu xuuVar = this.i;
        if (xuuVar != null) {
            int e = xuuVar.e();
            this.f33028a.suppressInvalidate(true);
            for (int i = 0; i < e; i++) {
                UINode d = this.i.d(i);
                if (d.isMounted()) {
                    m(d, true);
                }
                if (d.isMountState()) {
                    d.notifyUnmountState();
                }
            }
            this.f33028a.suppressInvalidate(false);
        }
        this.g.setEmpty();
        j();
        this.h = true;
    }

    public final void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96484993", new Object[]{this});
            return;
        }
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
    }

    public void k(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a164154", new Object[]{this, context});
        } else {
            this.f = context;
        }
    }

    public final void l(xuu xuuVar, Rect rect) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42960e09", new Object[]{this, xuuVar, rect});
        } else if (!rect.isEmpty()) {
            List<UINode> i = xuuVar.i();
            List<UINode> f = xuuVar.f();
            List<UINode> g = xuuVar.g();
            List<UINode> h = xuuVar.h();
            int e = xuuVar.e();
            this.b = e;
            int i2 = 0;
            while (true) {
                if (i2 >= e) {
                    break;
                } else if (rect.bottom <= i.get(i2).getGlobalVisibleRect().top) {
                    this.b = i2;
                    break;
                } else {
                    i2++;
                }
            }
            this.c = e;
            int i3 = 0;
            while (true) {
                if (i3 >= e) {
                    break;
                } else if (rect.top < f.get(i3).getGlobalVisibleRect().bottom) {
                    this.c = i3;
                    break;
                } else {
                    i3++;
                }
            }
            this.d = e;
            int i4 = 0;
            while (true) {
                if (i4 >= e) {
                    break;
                } else if (rect.right <= g.get(i4).getGlobalVisibleRect().left) {
                    this.d = i4;
                    break;
                } else {
                    i4++;
                }
            }
            this.e = e;
            for (int i5 = 0; i5 < e; i5++) {
                if (rect.left < h.get(i5).getGlobalVisibleRect().right) {
                    this.e = i5;
                    return;
                }
            }
        }
    }

    public void m(UINode uINode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b74c33", new Object[]{this, uINode, new Boolean(z)});
        } else if (uINode != null) {
            uINode.setView(null);
            this.f33028a.unmount(uINode.getMountContent());
            e(uINode);
            Object mountContent = uINode.getMountContent();
            uINode.unmount(this.f33028a.getInstance(), mountContent);
            if (uINode.getNodeType() != UINodeType.LAYOUT) {
                if (mountContent != null) {
                    try {
                        dd4.h(this.f, uINode, mountContent);
                    } catch (Exception e) {
                        wvh.a().b("UIMountState.unmount", e);
                        dwh.i(e);
                    }
                }
                if (uINode instanceof Image) {
                    this.f33028a.removeImageNode();
                }
            }
            if (z) {
                this.f33028a.invalidate();
            }
        }
    }

    public void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3b91230", new Object[]{this});
        } else {
            this.h = false;
        }
    }
}
