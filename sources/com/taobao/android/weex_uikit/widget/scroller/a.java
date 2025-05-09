package com.taobao.android.weex_uikit.widget.scroller;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_uikit.ui.UINode;
import java.util.List;
import tb.dwh;
import tb.egl;
import tb.fxh;
import tb.g57;
import tb.pxh;
import tb.t2o;
import tb.vvh;
import tb.ywh;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ATTR_DIRECTION = "scrollDirection";
    public static final String ATTR_SCROLLABLE = "scrollable";
    public static final String ATTR_SCROLL_DIRECTION = "scrollDirection";
    public static final String ATTR_SHOW_SCROLLBAR = "showScrollbar";
    public static final boolean DEFAULT_SCROLLABLE = true;
    public static final boolean DEFAULT_SHOW_SCROLLBAR = true;
    public static final String DIRECTION_HORIZONTAL = "horizontal";
    public static final String DIRECTION_VERTICAL = "vertical";
    public static final int HORIZONTAL = 2;
    public static final int NONE = 0;
    public static final int VERTICAL = 1;

    /* compiled from: Taobao */
    /* renamed from: com.taobao.android.weex_uikit.widget.scroller.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class C0526a {

        /* renamed from: a  reason: collision with root package name */
        public final int f10022a;
        public final float b;
        public final boolean c;
        public final int d;

        static {
            t2o.a(986710219);
        }

        public C0526a(int i, float f, boolean z, int i2) {
            this.f10022a = i;
            this.b = f;
            this.c = z;
            this.d = i2;
        }
    }

    static {
        t2o.a(986710218);
    }

    public static boolean b(UINode uINode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("49449bc6", new Object[]{uINode})).booleanValue();
        }
        return ((Boolean) uINode.getAttribute("showScrollbar")).booleanValue();
    }

    public static void c(UINode uINode, MUSDKInstance mUSDKInstance, ScrollerRootNode scrollerRootNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ade122f5", new Object[]{uINode, mUSDKInstance, scrollerRootNode});
        } else {
            scrollerRootNode.setInstance(mUSDKInstance);
        }
    }

    public static void d(UINode uINode, egl<pxh> eglVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cb72d69", new Object[]{uINode, eglVar});
        } else {
            eglVar.c(new g57(uINode));
        }
    }

    public static ScrollerContainer e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScrollerContainer) ipChange.ipc$dispatch("140e4ff2", new Object[]{context});
        }
        return new ScrollerContainer(context);
    }

    public static void g(UINode uINode, List<Runnable> list, ScrollerRootNode scrollerRootNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0ac35ce", new Object[]{uINode, list, scrollerRootNode});
        } else {
            scrollerRootNode.collectBatchTasks(list);
        }
    }

    public static void h(UINode uINode, MUSDKInstance mUSDKInstance, ScrollerContainer scrollerContainer, egl<Integer> eglVar, egl<C0526a> eglVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92e164e6", new Object[]{uINode, mUSDKInstance, scrollerContainer, eglVar, eglVar2});
            return;
        }
        if (a(uINode) == 1) {
            eglVar.c(Integer.valueOf(scrollerContainer.getCurrentScrollY()));
        } else {
            eglVar.c(Integer.valueOf(scrollerContainer.getCurrentScrollX()));
        }
        scrollerContainer.unmount();
        eglVar2.c(null);
    }

    public static void i(UINode uINode, int i, int i2, int i3, int i4, ScrollerRootNode scrollerRootNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bcff89e", new Object[]{uINode, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), scrollerRootNode});
        } else {
            scrollerRootNode.updateLayout(0, 0, i3 - i, i4 - i2);
        }
    }

    public static void j(UINode uINode, ScrollerContainer scrollerContainer, String str, ywh ywhVar, ScrollerRootNode scrollerRootNode) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80c6dee5", new Object[]{uINode, scrollerContainer, str, ywhVar, scrollerRootNode});
            return;
        }
        int a2 = a(uINode);
        if (a2 != 1) {
            z = false;
        }
        scrollerRootNode.setVertical(z);
        scrollerContainer.setDirection(a2);
        ywhVar.A();
    }

    public static void k(UINode uINode, ScrollerContainer scrollerContainer, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69ebd397", new Object[]{uINode, scrollerContainer, new Boolean(z)});
        } else {
            scrollerContainer.setScrollable(z);
        }
    }

    public static void l(UINode uINode, ScrollerContainer scrollerContainer, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd9c888b", new Object[]{uINode, scrollerContainer, new Boolean(z)});
        } else {
            scrollerContainer.setShowScrollBar(z);
        }
    }

    public static void n(UINode uINode, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9df392fb", new Object[]{uINode, str});
        } else {
            uINode.setAttribute("scrollDirection", str);
        }
    }

    public static void o(UINode uINode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0a132fc", new Object[]{uINode, new Boolean(z)});
        } else {
            uINode.setAttribute("scrollable", Boolean.valueOf(z));
        }
    }

    public static void p(UINode uINode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9388fd1a", new Object[]{uINode, new Boolean(z)});
        } else {
            uINode.setAttribute("showScrollbar", Boolean.valueOf(z));
        }
    }

    public static int a(UINode uINode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f619d058", new Object[]{uINode})).intValue();
        }
        String str = (String) uINode.getAttribute("scrollDirection");
        str.hashCode();
        if (str.equals("vertical")) {
            return 1;
        }
        if (str.equals("horizontal")) {
            return 2;
        }
        if (!TextUtils.isEmpty(str) && dwh.r()) {
            dwh.w("Scroller", "input scrollDirection is not valid: ".concat(str));
        }
        return 1;
    }

    public static void m(UINode uINode, int i, float f, boolean z, int i2, egl<C0526a> eglVar, ScrollerRootNode scrollerRootNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4fa2f3d9", new Object[]{uINode, new Integer(i), new Float(f), new Boolean(z), new Integer(i2), eglVar, scrollerRootNode});
            return;
        }
        ScrollerContainer scrollerContainer = (ScrollerContainer) uINode.getMountContent();
        if (scrollerContainer == null) {
            if (eglVar != null) {
                eglVar.c(new C0526a(i, f, z, i2));
            }
        } else if (i < 0 || i >= scrollerRootNode.getChildCount()) {
            dwh.f("Scroller", "position is beyond the bounds;child count is " + scrollerRootNode.getChildCount() + " but position is " + i);
        } else {
            float round = Math.round(fxh.a(f));
            UINode childAt = scrollerRootNode.getChildAt(i);
            if (childAt != null) {
                int a2 = a(uINode);
                Rect y = childAt.getNodeInfo().y();
                if (a2 == 1) {
                    int currentScrollY = scrollerContainer.getCurrentScrollY();
                    int i3 = (int) (y.top + round);
                    if (currentScrollY != i3) {
                        scrollerContainer.scrollTo(true, currentScrollY, i3, z, i2);
                    }
                } else if (vvh.n()) {
                    int currentScrollRight = (int) ((childAt.getGlobalVisibleRect().right - round) - scrollerContainer.getCurrentScrollRight());
                    if (currentScrollRight != 0) {
                        scrollerContainer.scrollTo(false, scrollerContainer.getCurrentScrollX(), scrollerContainer.getCurrentScrollX() + currentScrollRight, z, i2);
                    }
                } else {
                    int currentScrollX = scrollerContainer.getCurrentScrollX();
                    int i4 = (int) (y.left + round);
                    if (currentScrollX != i4) {
                        scrollerContainer.scrollTo(false, currentScrollX, i4, z, i2);
                    }
                }
            }
        }
    }

    public static void f(UINode uINode, MUSDKInstance mUSDKInstance, ScrollerContainer scrollerContainer, C0526a aVar, ScrollerRootNode scrollerRootNode, ywh ywhVar, int i, pxh pxhVar, egl<C0526a> eglVar, egl<Integer> eglVar2) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ced16dc8", new Object[]{uINode, mUSDKInstance, scrollerContainer, aVar, scrollerRootNode, ywhVar, new Integer(i), pxhVar, eglVar, eglVar2});
            return;
        }
        int a2 = a(uINode);
        if (a2 != 1) {
            z = false;
        }
        scrollerRootNode.setVertical(z);
        scrollerContainer.mount(mUSDKInstance, b(uINode), ((Boolean) uINode.getAttribute("scrollable")).booleanValue(), a2, ywhVar, aVar != null ? 0 : i, pxhVar);
        eglVar2.c(0);
        if (aVar != null) {
            m(uINode, aVar.f10022a, aVar.b, aVar.c, aVar.d, null, scrollerRootNode);
            eglVar.c(null);
        }
    }
}
