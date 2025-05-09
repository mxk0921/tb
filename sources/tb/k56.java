package tb;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.collection.LongSparseArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamic_v35.view.DXNanoHorizontalScrollView;
import com.taobao.android.dinamic_v35.view.DXNanoVerticalScrollView;
import com.taobao.android.dinamic_v35.view.DXScrollableViewImpl;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXPageChangeEvent;
import com.taobao.android.dinamicx.expression.event.DXScrollEvent;
import com.taobao.android.dinamicx.expression.event.DXViewEvent;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.turbo.core.component.BaseOuterComponent;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class k56 extends nu<View, l56> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a extends un6 {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final long DX_SCROLL_LAYOUT_BASE_ON_PAGE_APPEAR = -8975334121118753601L;
        public static final long DX_SCROLL_LAYOUT_BASE_ON_PAGE_DISAPPEAR = -5201408949358043646L;
        public static final long DX_SCROLL_LAYOUT_BASE_ON_SCROLL = 5288751146867425108L;
        public static final long DX_SCROLL_LAYOUT_BASE_ON_SCROLL_BEGIN = 9144262755562405950L;
        public static final long DX_SCROLL_LAYOUT_BASE_ON_SCROLL_END = 2691126191158604142L;
        public static final long DX_SLIDER_LAYOUT_ON_PAGE_CHANGE = -8975195222378757716L;
        public DXWidgetNode h;
        public JSONObject k;
        public JSONObject l;
        public boolean m;
        public av5 n;
        public DXRootView o;
        public final vn6 p;
        public final DXPageChangeEvent b = new DXPageChangeEvent(-8975195222378757716L);
        public final DXScrollEvent c = new DXScrollEvent(5288751146867425108L);
        public final DXScrollEvent d = new DXScrollEvent(9144262755562405950L);
        public final DXScrollEvent e = new DXScrollEvent(2691126191158604142L);
        public final DXViewEvent f = new DXViewEvent(-8975334121118753601L);
        public final DXViewEvent g = new DXViewEvent(-5201408949358043646L);
        public final uof i = new uof();
        public final uof j = new uof();

        /* compiled from: Taobao */
        /* renamed from: tb.k56$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class C0965a implements DXScrollableViewImpl.e {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public C0965a() {
            }

            public void a(View view, int i, int i2, int i3, int i4) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("a715c0a2", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
                } else {
                    a.this.q(view);
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class b implements DXScrollableViewImpl.i {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public b() {
            }

            public void a(View view, int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("56538206", new Object[]{this, view, new Integer(i)});
                } else {
                    a.this.s(view);
                }
            }

            public void b(View view, int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8b9ef80b", new Object[]{this, view, new Integer(i)});
                } else {
                    a.this.r(view);
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class c implements DXScrollableViewImpl.f {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public c() {
            }

            public void a(int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("184d6f33", new Object[]{this, new Integer(i)});
                    return;
                }
                a.d(a.this).setPageIndex(i);
                a.e(a.this).a(a.d(a.this));
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class d implements DXScrollableViewImpl.g {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public d() {
            }

            public void a(int i, int i2, int i3, int i4) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("13595a23", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
                    return;
                }
                a aVar = a.this;
                a.g(aVar, a.f(aVar), i, i2);
                a.this.t(fzo.SCROLLING);
            }
        }

        static {
            t2o.a(444596458);
        }

        public a(tn6 tn6Var) {
            super(tn6Var);
            this.p = (vn6) tn6Var.c();
        }

        public static /* synthetic */ DXPageChangeEvent d(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DXPageChangeEvent) ipChange.ipc$dispatch("490a81bc", new Object[]{aVar});
            }
            return aVar.b;
        }

        public static /* synthetic */ vn6 e(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (vn6) ipChange.ipc$dispatch("a585641e", new Object[]{aVar});
            }
            return aVar.p;
        }

        public static /* synthetic */ DXScrollEvent f(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DXScrollEvent) ipChange.ipc$dispatch("1dc498ec", new Object[]{aVar});
            }
            return aVar.c;
        }

        public static /* synthetic */ void g(a aVar, DXScrollEvent dXScrollEvent, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("66ff0667", new Object[]{aVar, dXScrollEvent, new Integer(i), new Integer(i2)});
            } else {
                aVar.u(dXScrollEvent, i, i2);
            }
        }

        public static /* synthetic */ tn6 h(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (tn6) ipChange.ipc$dispatch("609eaa92", new Object[]{aVar});
            }
            return aVar.f29509a;
        }

        public static /* synthetic */ DXScrollEvent i(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DXScrollEvent) ipChange.ipc$dispatch("9b489cef", new Object[]{aVar});
            }
            return aVar.e;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamic_v35/widget/DXNanoScrollerLayoutComponentDesc$DXScrollerCoordinator");
        }

        public static /* synthetic */ tn6 j(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (tn6) ipChange.ipc$dispatch("3c2f70d0", new Object[]{aVar});
            }
            return aVar.f29509a;
        }

        public static /* synthetic */ tn6 k(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (tn6) ipChange.ipc$dispatch("29f7d3ef", new Object[]{aVar});
            }
            return aVar.f29509a;
        }

        public static /* synthetic */ DXScrollEvent l(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DXScrollEvent) ipChange.ipc$dispatch("18cca0f2", new Object[]{aVar});
            }
            return aVar.d;
        }

        public static /* synthetic */ tn6 m(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (tn6) ipChange.ipc$dispatch("5889a2d", new Object[]{aVar});
            }
            return aVar.f29509a;
        }

        @Override // tb.un6
        public void a(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e1565fe5", new Object[]{this, new Long(j)});
                return;
            }
            knd kndVar = (knd) this.f29509a.d();
            if (j == -8975195222378757716L) {
                kndVar.getScrollViewImpl().O(new c());
            } else if (j == 5288751146867425108L) {
                kndVar.getScrollViewImpl().P(new d());
            } else if (j == 9144262755562405950L || j == 2691126191158604142L) {
                kndVar.getScrollViewImpl().Q(new e());
            }
        }

        @Override // tb.un6
        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e524f042", new Object[]{this});
            } else if (this.f29509a.d() instanceof knd) {
                knd kndVar = (knd) this.f29509a.d();
                kndVar.getScrollViewImpl().N(new C0965a());
                kndVar.getScrollViewImpl().R(new b());
            }
        }

        public final DXWidgetNode n(String str) {
            DXWidgetNode i;
            DXWidgetNode parentWidget;
            dh5 dh5Var;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DXWidgetNode) ipChange.ipc$dispatch("957bb186", new Object[]{this, str});
            }
            if (str == null || (i = this.f29509a.i()) == null || (parentWidget = i.getParentWidget()) == null) {
                return null;
            }
            for (DXWidgetNode dXWidgetNode : parentWidget.getChildren()) {
                LongSparseArray<dh5> constAttributeMap = dXWidgetNode.getConstAttributeMap();
                if (!(constAttributeMap == null || (dh5Var = constAttributeMap.get(10297924263834610L)) == null || !str.equals(dh5Var.e))) {
                    return dXWidgetNode;
                }
            }
            return null;
        }

        public void o(tn6 tn6Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("98922cf0", new Object[]{this, tn6Var});
            } else if (tn6Var.d() instanceof knd) {
                knd kndVar = (knd) tn6Var.d();
                boolean[] k = kndVar.getScrollViewImpl().k();
                if (k != null) {
                    for (int i = 0; i < k.length; i++) {
                        if (k[i]) {
                            r(kndVar.getScrollViewImpl().n(i));
                        }
                    }
                }
            }
        }

        public void p(tn6 tn6Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("255ebac0", new Object[]{this, tn6Var});
            } else if (tn6Var.d() instanceof knd) {
                knd kndVar = (knd) this.f29509a.d();
                boolean[] k = kndVar.getScrollViewImpl().k();
                if (k != null) {
                    for (int i = 0; i < k.length; i++) {
                        if (k[i]) {
                            s(kndVar.getScrollViewImpl().n(i));
                        }
                    }
                }
            }
        }

        public void q(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("75cad8e2", new Object[]{this, view});
                return;
            }
            knd kndVar = (knd) view;
            this.j.f29533a = kndVar.getScrollViewImpl().m();
            uof uofVar = this.j;
            kndVar.getScrollViewImpl().l();
            uofVar.getClass();
            this.c.setContentSize(this.j);
            this.i.f29533a = view.getWidth();
            uof uofVar2 = this.i;
            view.getHeight();
            uofVar2.getClass();
            this.c.setScrollerSize(this.i);
        }

        public void r(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("85779148", new Object[]{this, view});
                return;
            }
            DXWidgetNode dXWidgetNode = (DXWidgetNode) view.getTag(DXWidgetNode.TAG_WIDGET_NODE);
            if (dXWidgetNode != null) {
                this.f.setItemIndex(dXWidgetNode.getDXRuntimeContext().P());
                dXWidgetNode.sendBroadcastEvent(this.f);
                this.p.a(this.f);
            }
        }

        public void s(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("74e9d316", new Object[]{this, view});
                return;
            }
            DXWidgetNode dXWidgetNode = (DXWidgetNode) view.getTag(DXWidgetNode.TAG_WIDGET_NODE);
            if (dXWidgetNode != null) {
                this.g.setItemIndex(dXWidgetNode.getDXRuntimeContext().P());
                dXWidgetNode.sendBroadcastEvent(this.g);
                this.p.a(this.g);
            }
        }

        public final void u(DXScrollEvent dXScrollEvent, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6eae747b", new Object[]{this, dXScrollEvent, new Integer(i), new Integer(i2)});
                return;
            }
            dXScrollEvent.setOffsetX(i);
            dXScrollEvent.setOffsetY(i2);
            DXWidgetNode dXWidgetNode = this.h;
            if (dXWidgetNode != null) {
                dXWidgetNode.postEvent(dXScrollEvent);
            }
            this.p.a(dXScrollEvent);
        }

        public void v(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e28e6e59", new Object[]{this, str});
            } else if (this.h == null && str != null && this.f29509a.i() != null) {
                this.h = n(str);
            }
        }

        public void w(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7151e9ef", new Object[]{this, new Boolean(z)});
                return;
            }
            this.m = z;
            if (z) {
                JSONObject jSONObject = new JSONObject();
                this.k = jSONObject;
                jSONObject.put("type", (Object) "BNDX");
                JSONObject jSONObject2 = new JSONObject();
                this.l = jSONObject2;
                this.k.put("params", (Object) jSONObject2);
                this.l.put("widget", (Object) this.f29509a.i());
                DXRuntimeContext dXRuntimeContext = this.f29509a.i().getDXRuntimeContext();
                if (dXRuntimeContext != null) {
                    this.n = dXRuntimeContext.s();
                    this.o = dXRuntimeContext.L();
                }
            }
        }

        public void x(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b5627edd", new Object[]{this, new Boolean(z)});
                return;
            }
            DXWidgetNode dXWidgetNode = this.h;
            if (dXWidgetNode == null) {
                return;
            }
            if (z) {
                dXWidgetNode.setRealVisibility(0);
            } else {
                dXWidgetNode.setRealVisibility(2);
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class e implements DXScrollableViewImpl.h {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public e() {
            }

            public void a(int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("9c60403a", new Object[]{this, new Integer(i)});
                } else if (i == 0) {
                    a.i(a.this).setOffsetX(a.h(a.this).d().getScrollX());
                    a.i(a.this).setOffsetY(0);
                    a aVar = a.this;
                    a.g(aVar, a.i(aVar), a.j(a.this).d().getScrollX(), 0);
                    a.this.t("scroll_end");
                } else if (i == 1) {
                    a.l(a.this).setOffsetX(a.k(a.this).d().getScrollX());
                    a.l(a.this).setOffsetY(0);
                    a aVar2 = a.this;
                    a.g(aVar2, a.l(aVar2), a.m(a.this).d().getScrollX(), 0);
                    a.this.t("scroll_beigin");
                }
            }
        }

        public void t(String str) {
            DXRootView dXRootView;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c1c5d6", new Object[]{this, str});
            } else if (this.m) {
                this.l.put("offsetX", (Object) Float.valueOf(this.f29509a.d().getX()));
                this.l.put("offsetY", (Object) 0);
                this.l.put("action", (Object) str);
                this.l.put(BaseOuterComponent.b.SOURCE_COMPONENT_ID, (Object) this.f29509a.i().getUserId());
                av5 av5Var = this.n;
                if (av5Var != null && (dXRootView = this.o) != null) {
                    av5Var.t(dXRootView, this.k);
                }
            }
        }
    }

    static {
        t2o.a(444596457);
    }

    public static /* synthetic */ Object ipc$super(k56 k56Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamic_v35/widget/DXNanoScrollerLayoutComponentDesc");
    }

    @Override // tb.nu
    public ViewGroup.LayoutParams a(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup.LayoutParams) ipChange.ipc$dispatch("d55d0150", new Object[]{this, dXWidgetNode});
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(dXWidgetNode.getLayoutWidth(), dXWidgetNode.getLayoutHeight());
        layoutParams.leftMargin = dXWidgetNode.getMarginLeft();
        layoutParams.rightMargin = dXWidgetNode.getMarginRight();
        layoutParams.topMargin = dXWidgetNode.getMarginTop();
        layoutParams.bottomMargin = dXWidgetNode.getMarginBottom();
        int layoutGravity = dXWidgetNode.getLayoutGravity();
        if (layoutGravity != 0) {
            layoutParams.gravity = m(layoutGravity);
        }
        return layoutParams;
    }

    @Override // tb.nu
    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8b49052a", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // tb.nu
    public lrb c(tn6 tn6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lrb) ipChange.ipc$dispatch("bf1820b2", new Object[]{this, tn6Var});
        }
        return new a(tn6Var);
    }

    @Override // tb.nu
    public wij d(tn6 tn6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wij) ipChange.ipc$dispatch("83bb1c71", new Object[]{this, tn6Var});
        }
        return new vn6(tn6Var);
    }

    @Override // tb.nu
    public void h(tn6 tn6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98922cf0", new Object[]{this, tn6Var});
            return;
        }
        a aVar = (a) tn6Var.b();
        if (aVar != null) {
            aVar.o(tn6Var);
        }
    }

    @Override // tb.nu
    public void i(tn6 tn6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("255ebac0", new Object[]{this, tn6Var});
            return;
        }
        a aVar = (a) tn6Var.b();
        if (aVar != null) {
            aVar.p(tn6Var);
        }
    }

    @Override // tb.nu
    public boolean k(ViewGroup.LayoutParams layoutParams, DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56e832f6", new Object[]{this, layoutParams, dXWidgetNode})).booleanValue();
        }
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            int m = m(dXWidgetNode.getLayoutGravity());
            if (layoutParams2.width == dXWidgetNode.getLayoutWidth() && layoutParams2.height == dXWidgetNode.getLayoutHeight() && layoutParams2.leftMargin == dXWidgetNode.getMarginLeft() && layoutParams2.rightMargin == dXWidgetNode.getMarginRight() && layoutParams2.topMargin == dXWidgetNode.getMarginTop() && layoutParams2.bottomMargin == dXWidgetNode.getMarginBottom() && layoutParams2.gravity == m) {
                return false;
            }
            layoutParams2.leftMargin = dXWidgetNode.getMarginLeft();
            layoutParams2.rightMargin = dXWidgetNode.getMarginRight();
            layoutParams2.topMargin = dXWidgetNode.getMarginTop();
            layoutParams2.bottomMargin = dXWidgetNode.getMarginBottom();
            layoutParams2.width = dXWidgetNode.getLayoutWidth();
            layoutParams2.height = dXWidgetNode.getLayoutHeight();
            layoutParams2.gravity = m;
        }
        return true;
    }

    public final int m(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("40c914a7", new Object[]{this, new Integer(i)})).intValue();
        }
        switch (i) {
            case 1:
                return 19;
            case 2:
                return 83;
            case 3:
                return 49;
            case 4:
                return 17;
            case 5:
                return 81;
            case 6:
                return 53;
            case 7:
                return 21;
            case 8:
                return 85;
            default:
                return 51;
        }
    }

    /* renamed from: n */
    public l56 e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (l56) ipChange.ipc$dispatch("d76718e7", new Object[]{this});
        }
        return new l56();
    }

    /* renamed from: o */
    public View g(tn6 tn6Var, l56 l56Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("f79a5a3f", new Object[]{this, tn6Var, l56Var});
        }
        if (l56Var == null) {
            return new DXNanoHorizontalScrollView(tn6Var.a());
        }
        if (l56Var.g == 0) {
            return new DXNanoHorizontalScrollView(tn6Var.a());
        }
        return new DXNanoVerticalScrollView(tn6Var.a());
    }

    /* renamed from: p */
    public void l(tn6 tn6Var, View view, l56 l56Var, l56 l56Var2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c18905c", new Object[]{this, tn6Var, view, l56Var, l56Var2});
        } else if (view instanceof knd) {
            knd kndVar = (knd) view;
            int i = l56Var2.f23117a;
            if (i > -1 && i != l56Var.f23117a) {
                kndVar.getScrollViewImpl().I(l56Var2.f23117a, l56Var2.b);
            }
            a aVar = (a) tn6Var.b();
            if (!TextUtils.equals(l56Var2.c, l56Var.c)) {
                aVar.v(l56Var2.c);
            }
            aVar.x(l56Var2.d);
            aVar.w(l56Var2.e);
            kndVar.getScrollViewImpl().D();
        }
    }
}
