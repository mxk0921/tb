package tb;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.DXWidgetRefreshOption;
import com.taobao.android.dinamicx.widget.h;
import com.taobao.android.icart.widget.swipe.SwipeFrameLayout;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.common.utils.UnifyLog;
import com.taobao.schedule.ViewProxy;
import com.taobao.tao.Globals;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class qf5 extends h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXCARTFRAMELAYOUT_CARTFRAMELAYOUT = 2501112744873668354L;
    public static final long DXCARTFRAMELAYOUT_DISABLEONLONGCLICK = -5720946013866990567L;
    public static final long DXCARTFRAMELAYOUT_DISABLESWIPE = 2690426589777932264L;

    /* renamed from: a  reason: collision with root package name */
    public boolean f26716a = false;
    public boolean b = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements ivk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ SwipeFrameLayout f26717a;

        public a(SwipeFrameLayout swipeFrameLayout) {
            this.f26717a = swipeFrameLayout;
        }

        @Override // tb.ivk
        public boolean a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("958aa262", new Object[]{this})).booleanValue();
            }
            kmb b = yn2.b(qf5.this.getDXRuntimeContext());
            if (b == null || !b.d().B().C()) {
                return false;
            }
            return true;
        }

        @Override // tb.ivk
        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("29b1518e", new Object[]{this});
            } else {
                qf5.w(qf5.this, this.f26717a, false);
            }
        }

        @Override // tb.ivk
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2f9f56c7", new Object[]{this});
            }
        }

        @Override // tb.ivk
        public Rect d() {
            View D;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Rect) ipChange.ipc$dispatch("9f791e18", new Object[]{this});
            }
            DXWidgetNode t = qf5.t(qf5.this);
            if (t == null || (D = t.getDXRuntimeContext().D()) == null) {
                return null;
            }
            int[] iArr = new int[2];
            D.getLocationOnScreen(iArr);
            return new Rect(D.getLeft(), iArr[1], D.getRight(), iArr[1] + D.getHeight());
        }

        @Override // tb.ivk
        public void e(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5a166064", new Object[]{this, new Boolean(z)});
            } else if (z) {
                IDMComponent c = yn2.c(qf5.this.getDXRuntimeContext());
                kmb b = yn2.b(qf5.this.getDXRuntimeContext());
                if (c == null) {
                    ub3.g("ItemSwipeError", "component is null");
                    return;
                }
                DXWidgetNode t = qf5.t(qf5.this);
                if (t == null) {
                    ub3.g("ItemSwipeError", "swipeWidget is null");
                } else if (qf5.u(qf5.this, t) && u8l.q("forceRefreshComponent", true)) {
                    c.getFields().put(ar6.HIDE_SWIPE_ITEM, (Object) Boolean.FALSE);
                    qf5.v(qf5.this, c);
                    ub3.g("ItemSwipeError", "swipeWidget's children count is 0 And orange forceRefresh");
                } else if (b != null) {
                    juv.a(b, "Page_ShoppingCart_Item_OpenOperate", vo0.b(c, b, "isSwipe=true"));
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements View.OnLongClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("7edba102", new Object[]{this, view})).booleanValue();
            }
            qf5.this.postEvent(new DXEvent(-6544685697300501093L));
            return true;
        }
    }

    static {
        t2o.a(478151129);
    }

    public static /* synthetic */ Object ipc$super(qf5 qf5Var, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1775895211:
                super.onBindEvent((Context) objArr[0], (View) objArr[1], ((Number) objArr[2]).longValue());
                return null;
            case -1133248269:
                return new Integer(super.getDefaultValueForIntAttr(((Number) objArr[0]).longValue()));
            case -740240234:
                super.onSetIntAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).intValue());
                return null;
            case -303753557:
                super.onRenderView((Context) objArr[0], (View) objArr[1]);
                return null;
            case 650865254:
                super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case 2119721610:
                super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/icart/widget/swipe/DXCartFrameLayoutWidgetNode");
        }
    }

    public static /* synthetic */ DXWidgetNode t(qf5 qf5Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("b4919dc7", new Object[]{qf5Var});
        }
        return qf5Var.z();
    }

    public static /* synthetic */ boolean u(qf5 qf5Var, DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("31acdc4c", new Object[]{qf5Var, dXWidgetNode})).booleanValue();
        }
        return qf5Var.C(dXWidgetNode);
    }

    public static /* synthetic */ void v(qf5 qf5Var, IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e49242e", new Object[]{qf5Var, iDMComponent});
        } else {
            qf5Var.x(iDMComponent);
        }
    }

    public static /* synthetic */ void w(qf5 qf5Var, SwipeFrameLayout swipeFrameLayout, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5159ae44", new Object[]{qf5Var, swipeFrameLayout, new Boolean(z)});
        } else {
            qf5Var.A(swipeFrameLayout, z);
        }
    }

    public final void A(SwipeFrameLayout swipeFrameLayout, boolean z) {
        DXWidgetNode z2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40f51606", new Object[]{this, swipeFrameLayout, new Boolean(z)});
            return;
        }
        IDMComponent c = yn2.c(getDXRuntimeContext());
        if (c != null && (z2 = z()) != null) {
            JSONObject fields = c.getFields();
            if (fields.containsKey(ar6.HIDE_SWIPE_ITEM) && fields.getBooleanValue(ar6.HIDE_SWIPE_ITEM) != z) {
                fields.put(ar6.HIDE_SWIPE_ITEM, (Object) Boolean.valueOf(z));
                z2.setNeedParse(new DXWidgetRefreshOption.a().g(true).d(true).a());
                swipeFrameLayout.setMaxSwipeWidth(z2.getMeasuredWidth());
            }
        }
    }

    public final boolean B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("39a4e6e8", new Object[]{this})).booleanValue();
        }
        kmb b2 = yn2.b(getDXRuntimeContext());
        if (b2 == null || !sca.u(b2.d())) {
            return false;
        }
        return true;
    }

    @Override // com.taobao.android.dinamicx.widget.h, com.taobao.android.dinamicx.widget.DXWidgetNode, tb.qub
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
        }
        return new qf5();
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public int getDefaultValueForIntAttr(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bc7400f3", new Object[]{this, new Long(j)})).intValue();
        }
        if (j == DXCARTFRAMELAYOUT_DISABLEONLONGCLICK || j == DXCARTFRAMELAYOUT_DISABLESWIPE) {
            return 0;
        }
        return super.getDefaultValueForIntAttr(j);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onBindEvent(Context context, View view, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9625fd55", new Object[]{this, context, view, new Long(j)});
            return;
        }
        super.onBindEvent(context, view, j);
        if (j == -6544685697300501093L && (view instanceof SwipeFrameLayout)) {
            SwipeFrameLayout swipeFrameLayout = (SwipeFrameLayout) view;
            if (this.f26716a) {
                ViewProxy.setOnLongClickListener(view, null);
                swipeFrameLayout.setOnLongClick(null);
                return;
            }
            swipeFrameLayout.setOnLongClick(new b());
        }
    }

    @Override // com.taobao.android.dinamicx.widget.j, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
        } else if (dXWidgetNode != null && (dXWidgetNode instanceof qf5)) {
            super.onClone(dXWidgetNode, z);
            qf5 qf5Var = (qf5) dXWidgetNode;
            this.f26716a = qf5Var.f26716a;
            this.b = qf5Var.b;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.h, com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        return new SwipeFrameLayout(context);
    }

    @Override // com.taobao.android.dinamicx.widget.h, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        super.onMeasure(i, i2);
        try {
            DXWidgetNode z = z();
            if (z != null) {
                View D = getDXRuntimeContext().D();
                if (D instanceof SwipeFrameLayout) {
                    int measuredWidth = z.getMeasuredWidth();
                    SwipeFrameLayout swipeFrameLayout = (SwipeFrameLayout) D;
                    if (measuredWidth <= 0) {
                        measuredWidth = 100;
                    }
                    swipeFrameLayout.setMaxSwipeWidth(measuredWidth);
                }
            }
        } catch (Throwable th) {
            ub3.g("DXCartFrameLayoutWidgetNode#onMeasureError", th.getMessage());
        }
    }

    @Override // com.taobao.android.dinamicx.widget.j, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
            return;
        }
        super.onRenderView(context, view);
        if (view instanceof SwipeFrameLayout) {
            SwipeFrameLayout swipeFrameLayout = (SwipeFrameLayout) view;
            if (!B() || this.b) {
                z = false;
            }
            swipeFrameLayout.setSwipeShow(z);
            if (z) {
                swipeFrameLayout.setSwipeListener(new a(swipeFrameLayout));
                DXWidgetNode z2 = z();
                if (z2 != null) {
                    int measuredWidth = z2.getMeasuredWidth();
                    if (measuredWidth <= 0) {
                        measuredWidth = 100;
                    }
                    swipeFrameLayout.setMaxSwipeWidth(measuredWidth);
                }
                Drawable background = view.getBackground();
                if (background instanceof GradientDrawable) {
                    GradientDrawable gradientDrawable = (GradientDrawable) background;
                    if (getBorderWidth() == 0) {
                        gradientDrawable.setStroke(0, 0, 0.0f, 0.0f);
                    }
                }
            }
        }
    }

    @Override // com.taobao.android.dinamicx.widget.h, com.taobao.android.dinamicx.widget.j, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
        } else if (j == DXCARTFRAMELAYOUT_DISABLEONLONGCLICK) {
            if (i == 0) {
                z = false;
            }
            this.f26716a = z;
        } else if (j == DXCARTFRAMELAYOUT_DISABLESWIPE) {
            if (i == 0) {
                z = false;
            }
            this.b = z;
        } else {
            super.onSetIntAttribute(j, i);
        }
    }

    public final void x(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18e35460", new Object[]{this, iDMComponent});
            return;
        }
        kmb y = y();
        if (y != null) {
            try {
                y.e().z0(iDMComponent);
            } catch (Exception e) {
                hav.b(c9x.CART_BIZ_NAME, "ItemSwipeError", e.getMessage());
            }
        }
    }

    public final kmb y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kmb) ipChange.ipc$dispatch("5d2c502", new Object[]{this});
        }
        kmb b2 = yn2.b(getDXRuntimeContext());
        if (b2 != null) {
            return b2;
        }
        ub3.g("ItemSwipeError", "cartPresenter is null");
        return null;
    }

    public final DXWidgetNode z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("466b4c8e", new Object[]{this});
        }
        DXWidgetNode parentWidget = getParentWidget();
        if (parentWidget == null) {
            return null;
        }
        for (int i = 0; i < parentWidget.getChildrenCount(); i++) {
            DXWidgetNode childAt = parentWidget.getChildAt(i);
            if (childAt != null && pg1.ATOM_EXT_button.equals(childAt.getUserId())) {
                return childAt;
            }
        }
        return parentWidget.queryWidgetNodeByUserId(pg1.ATOM_EXT_button);
    }

    public final boolean C(DXWidgetNode dXWidgetNode) {
        View D;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a4d93b1a", new Object[]{this, dXWidgetNode})).booleanValue();
        }
        if (dXWidgetNode.getDXRuntimeContext() == null || (D = dXWidgetNode.getDXRuntimeContext().D()) == null) {
            return true;
        }
        if (D instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) D;
            UnifyLog.e("ItemSwipeInfo", "viewGroup childCount=" + viewGroup.getChildCount());
            if (viewGroup.getChildCount() == 0) {
                return true;
            }
        }
        float c = fxo.c(Globals.getApplication());
        int left = D.getLeft();
        UnifyLog.e("ItemSwipeInfo", "screenWidth=" + c + ",left=" + left);
        return ((float) Math.abs(left)) > c;
    }
}
