package tb;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Outline;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXButterRootView;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.expression.event.DXScrollEvent;
import com.taobao.android.dinamicx.view.DXLinearLayoutManager;
import com.taobao.android.dinamicx.view.DXNativeRecyclerView;
import com.taobao.android.dinamicx.widget.DXScrollerLayout;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.infoflow.core.subservice.base.item.dxservice.impl.dinamic3.bindingx.ScrollIconsVariableHighMsg;
import com.taobao.infoflow.protocol.subservice.biz.IIconService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class bz5 extends ob5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_HICONSCROLL = 6745126353234294379L;
    public int b;
    public int c;

    /* renamed from: a  reason: collision with root package name */
    public final ScrollIconsVariableHighMsg f16728a = new ScrollIconsVariableHighMsg();
    public final Handler e = new Handler(Looper.getMainLooper());
    public final long f = v();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ cfc f16729a;
        public final /* synthetic */ DXRuntimeContext b;
        public final /* synthetic */ int[] c;
        public final /* synthetic */ DXRootView d;

        public a(cfc cfcVar, DXRuntimeContext dXRuntimeContext, int[] iArr, DXRootView dXRootView) {
            this.f16729a = cfcVar;
            this.b = dXRuntimeContext;
            this.c = iArr;
            this.d = dXRootView;
        }

        @Override // java.lang.Runnable
        public void run() {
            int currentPageIndex;
            int r;
            DXWidgetNode expandWidgetNode;
            DXWidgetNode queryWidgetNodeByUserId;
            int measuredHeight;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                IIconService iIconService = (IIconService) this.f16729a.a(IIconService.class);
                if (!(iIconService == null || (r = bz5.r(bz5.this, this.b, this.c, this.d.getContext(), (currentPageIndex = iIconService.getCurrentPageIndex()))) <= 0 || (expandWidgetNode = this.d.getExpandWidgetNode()) == null || (queryWidgetNodeByUserId = expandWidgetNode.queryWidgetNodeByUserId("icon_slider")) == null || queryWidgetNodeByUserId.getDXRuntimeContext() == null)) {
                    View D = queryWidgetNodeByUserId.getDXRuntimeContext().D();
                    if ((D instanceof RecyclerView) && D.isAttachedToWindow() && ((RecyclerView) D).getScrollState() == 0 && (measuredHeight = this.d.getMeasuredHeight()) != 0) {
                        fve.e("DXHIconScrollEventHandler", "start icon height monitor");
                        if (Math.abs(r - measuredHeight) > 5) {
                            fve.e("DXHIconScrollEventHandler", "icon height not match, expect:" + r + ", actual:" + measuredHeight + " currentPageIndex: " + currentPageIndex);
                            hve.a("Page_Home", "icon_scroll_height_error", null, "height_error", null);
                        }
                    }
                }
            } catch (Throwable th) {
                fve.c("DXHIconScrollEventHandler", "monitorIconHeight error", th);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b extends ViewOutlineProvider {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f16730a;

        public b(bz5 bz5Var, int i) {
            this.f16730a = i;
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/core/subservice/base/item/dxservice/impl/dinamic3/eventhandler/DXHIconScrollEventHandler$2");
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7054f590", new Object[]{this, view, outline});
            } else {
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), this.f16730a);
            }
        }
    }

    static {
        t2o.a(486539350);
    }

    public static /* synthetic */ Object ipc$super(bz5 bz5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/core/subservice/base/item/dxservice/impl/dinamic3/eventhandler/DXHIconScrollEventHandler");
    }

    public static /* synthetic */ int r(bz5 bz5Var, DXRuntimeContext dXRuntimeContext, int[] iArr, Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b99391d6", new Object[]{bz5Var, dXRuntimeContext, iArr, context, new Integer(i)})).intValue();
        }
        return bz5Var.f(dXRuntimeContext, iArr, context, i);
    }

    public final int a(DinamicXEngine dinamicXEngine, Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("636496d1", new Object[]{this, dinamicXEngine, context, new Integer(i)})).intValue();
        }
        if (dinamicXEngine != null) {
            return pb6.d(dinamicXEngine, context, i);
        }
        return pb6.c(context, i);
    }

    public final void b(ViewGroup viewGroup, DXRuntimeContext dXRuntimeContext, DXRootView dXRootView, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb39240", new Object[]{this, viewGroup, dXRuntimeContext, dXRootView, iArr});
            return;
        }
        viewGroup.removeAllViews();
        Context h = dXRuntimeContext.h();
        int s = (pb6.s(h) - a(dXRuntimeContext.r(), h, Math.max(iArr[0], iArr[1]))) / 2;
        ((FrameLayout.LayoutParams) dXRootView.getLayoutParams()).setMargins(s, 0, s, 0);
        dXRootView.setTag("cornerFrameLayout");
        viewGroup.addView(dXRootView);
    }

    public final int c(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("49b49a36", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)})).intValue();
        }
        int i4 = this.b;
        if (i4 != 0 && i != i2) {
            return Math.max(i - i4, 0);
        }
        if (i > i2) {
            return i2;
        }
        if (i == i3) {
            return 0;
        }
        return i;
    }

    public final int e(Object[] objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8004140b", new Object[]{this, objArr})).intValue();
        }
        int parseColor = Color.parseColor("#FFFFFF");
        Object obj = objArr[3];
        if (!(obj instanceof JSONObject)) {
            return parseColor;
        }
        try {
            return Color.parseColor(((JSONObject) obj).getString("backgroundColor"));
        } catch (Exception e) {
            fve.e("DXHIconScrollEventHandler", "解析背景色信息出现异常：" + e);
            return parseColor;
        }
    }

    public final int f(DXRuntimeContext dXRuntimeContext, int[] iArr, Context context, int i) {
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("86531cd2", new Object[]{this, dXRuntimeContext, iArr, context, new Integer(i)})).intValue();
        }
        if (i < iArr.length) {
            i2 = iArr[i];
        } else {
            i2 = -1;
        }
        if (i2 <= 0) {
            return -1;
        }
        return a(dXRuntimeContext.r(), context, i2);
    }

    public final int g(DXRuntimeContext dXRuntimeContext) {
        IIconService iIconService;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d8370f08", new Object[]{this, dXRuntimeContext})).intValue();
        }
        cfc c = j18.c(dXRuntimeContext);
        if (c == null || (iIconService = (IIconService) c.a(IIconService.class)) == null) {
            return 0;
        }
        return iIconService.getInitPageIndex();
    }

    public final float h(DXRuntimeContext dXRuntimeContext, DXScrollEvent dXScrollEvent, Context context, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("51c961aa", new Object[]{this, dXRuntimeContext, dXScrollEvent, context, iArr})).floatValue();
        }
        int a2 = a(dXRuntimeContext.r(), context, iArr[0]);
        int c = c(dXScrollEvent.getOffsetX(), a2, a(dXRuntimeContext.r(), context, iArr[1]) - a2);
        if (c != a2) {
            return c % a2;
        }
        this.b = 0;
        return a2;
    }

    @Override // tb.ob5, tb.mvb
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
            return;
        }
        int g = g(dXRuntimeContext);
        if (objArr != null && objArr.length >= 5 && dXRuntimeContext != null) {
            int[] j = j(objArr);
            int[] k = k(objArr);
            int e = e(objArr);
            int d = d(dXRuntimeContext, objArr, dXRuntimeContext.h());
            DXRootView L = dXRuntimeContext.L();
            if (L != null) {
                if (dXEvent instanceof DXScrollEvent) {
                    l((DXScrollEvent) dXEvent, dXRuntimeContext, j, k, L, e, d);
                    fve.e("DXHIconScrollEventHandler", "on scroll");
                } else if (5288671110273408574L == dXEvent.getEventId()) {
                    m(dXRuntimeContext, L, k, g);
                    fve.e("DXHIconScrollEventHandler", "on appear");
                } else {
                    p(dXRuntimeContext, j, k, L, e, d, g);
                    if (t() && dXEvent.getEventId() == 2683803675109176030L) {
                        w(L, g);
                    }
                }
                if (s()) {
                    u(dXRuntimeContext, j, L);
                }
            }
        }
    }

    public final boolean i(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f2d5494", new Object[]{this, viewGroup})).booleanValue();
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt != null && "cornerFrameLayout".equals(childAt.getTag())) {
                return true;
            }
        }
        return false;
    }

    public final void m(DXRuntimeContext dXRuntimeContext, DXRootView dXRootView, int[] iArr, int i) {
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d77bef32", new Object[]{this, dXRuntimeContext, dXRootView, iArr, new Integer(i)});
            return;
        }
        DXWidgetNode queryWidgetNodeByUserId = dXRootView.getExpandWidgetNode().queryWidgetNodeByUserId("icon_slider");
        if (queryWidgetNodeByUserId instanceof DXScrollerLayout) {
            view = ((DXScrollerLayout) queryWidgetNodeByUserId).getDXRuntimeContext().D();
        } else {
            view = null;
        }
        if (view instanceof DXNativeRecyclerView) {
            DXNativeRecyclerView dXNativeRecyclerView = (DXNativeRecyclerView) view;
            int scrolledX = dXNativeRecyclerView.getScrolledX();
            if (scrolledX >= a(dXRuntimeContext.r(), dXRootView.getContext(), iArr[1]) && dXNativeRecyclerView.getLayoutManager() != null && (dXNativeRecyclerView.getLayoutManager() instanceof DXLinearLayoutManager)) {
                int findFirstVisibleItemPosition = ((DXLinearLayoutManager) dXNativeRecyclerView.getLayoutManager()).findFirstVisibleItemPosition();
                if (i == 1 && findFirstVisibleItemPosition != i) {
                    dXNativeRecyclerView.scrollToPosition(1);
                }
            }
            if (scrolledX == this.c && iArr[0] == iArr[1]) {
                this.b = scrolledX;
                fve.e("DXHIconScrollEventHandler", "appear offset:" + this.b);
            }
            this.c = a(dXRuntimeContext.r(), dXRootView.getContext(), iArr[1] - iArr[0]);
        }
    }

    public final void n(DXRuntimeContext dXRuntimeContext, DXRootView dXRootView, int i, int i2, int[] iArr, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5133960", new Object[]{this, dXRuntimeContext, dXRootView, new Integer(i), new Integer(i2), iArr, new Integer(i3), new Integer(i4)});
        } else if (dXRootView != null && dXRootView.getParent() != null && (dXRootView.getParent() instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) dXRootView.getParent();
            if (!i(viewGroup)) {
                b(viewGroup, dXRuntimeContext, dXRootView, iArr);
            }
            viewGroup.setBackgroundColor(i3);
            int i5 = i + i2;
            o(viewGroup, i5);
            if (dXRootView instanceof DXButterRootView) {
                dXRootView.getLayoutParams().height = i5;
                dXRootView.getExpandWidgetNode().queryWidgetNodeByUserId("icon_slider").getDXRuntimeContext().D().requestLayout();
            } else {
                o(dXRootView, i5);
            }
            fve.e("DXHIconScrollEventHandler", "requestLayout height:" + i5);
            q(dXRootView, i4);
        }
    }

    public final void o(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22715add", new Object[]{this, viewGroup, new Integer(i)});
            return;
        }
        viewGroup.getLayoutParams().height = i;
        viewGroup.requestLayout();
    }

    public final void p(DXRuntimeContext dXRuntimeContext, int[] iArr, int[] iArr2, DXRootView dXRootView, int i, int i2, int i3) {
        int i4;
        int i5;
        int i6 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16316309", new Object[]{this, dXRuntimeContext, iArr, iArr2, dXRootView, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        int f = f(dXRuntimeContext, iArr, dXRootView.getContext(), 0);
        int f2 = f(dXRuntimeContext, iArr, dXRootView.getContext(), 1);
        if (dXRootView instanceof DXButterRootView) {
            ((DXButterRootView) dXRootView).setSkipSetHeightLayoutParams(true);
            if (!p2b.k()) {
                if (i3 != 0) {
                    i6 = f2 - f;
                }
                x(dXRootView, f, i6);
                return;
            }
            if (i3 == 0) {
                i5 = 0;
            } else {
                i5 = f2 - f;
            }
            n(dXRuntimeContext, dXRootView, f, i5, iArr2, i, i2);
            return;
        }
        if (i3 == 0) {
            i4 = 0;
        } else {
            i4 = f2 - f;
        }
        n(dXRuntimeContext, dXRootView, f, i4, iArr2, i, i2);
        DXWidgetNode queryWidgetNodeByUserId = dXRootView.getExpandWidgetNode().queryWidgetNodeByUserId("icon_slider");
        if (i3 == 0 && (queryWidgetNodeByUserId instanceof DXScrollerLayout)) {
            ((DXScrollerLayout) queryWidgetNodeByUserId).resetScrollerListener();
        }
    }

    public final void q(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e5ac3cf", new Object[]{this, view, new Integer(i)});
            return;
        }
        view.setOutlineProvider(new b(this, i));
        view.setClipToOutline(true);
        view.invalidateOutline();
    }

    public final boolean s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cf5ee5b5", new Object[]{this})).booleanValue();
        }
        return mve.a("enableIconScrollHeightMonitorV2", true);
    }

    public final boolean t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ef5d3484", new Object[]{this})).booleanValue();
        }
        return mve.a("enableIconScrollResetOffset", true);
    }

    public final void u(DXRuntimeContext dXRuntimeContext, int[] iArr, DXRootView dXRootView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15144941", new Object[]{this, dXRuntimeContext, iArr, dXRootView});
            return;
        }
        cfc c = j18.c(dXRuntimeContext);
        if (c != null) {
            this.e.removeCallbacksAndMessages(null);
            this.e.postDelayed(new a(c, dXRuntimeContext, iArr, dXRootView), this.f);
        }
    }

    public final long v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ecb797da", new Object[]{this})).longValue();
        }
        try {
            return Long.parseLong(mve.d("monitorIconHeightInterval", "2000"));
        } catch (Exception unused) {
            return 2000L;
        }
    }

    public final void x(DXRootView dXRootView, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0a820f4", new Object[]{this, dXRootView, new Integer(i), new Integer(i2)});
        } else if (dXRootView != null) {
            dXRootView.getLayoutParams().height = i + i2;
        }
    }

    public final int d(DXRuntimeContext dXRuntimeContext, Object[] objArr, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("475ede5f", new Object[]{this, dXRuntimeContext, objArr, context})).intValue();
        }
        int a2 = a(dXRuntimeContext.r(), context, 12);
        if (!(objArr[4] instanceof JSONObject)) {
            return a2;
        }
        try {
            return a(dXRuntimeContext.r(), context, ((JSONObject) objArr[4]).getIntValue(hij.KEY_CORNER_RADIUS));
        } catch (Exception e) {
            fve.e("DXHIconScrollEventHandler", "解析圆角信息出现异常：" + e);
            return a2;
        }
    }

    public final void w(DXRootView dXRootView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec480deb", new Object[]{this, dXRootView, new Integer(i)});
            return;
        }
        DXWidgetNode queryWidgetNodeByUserId = dXRootView.getExpandWidgetNode().queryWidgetNodeByUserId("icon_slider");
        if (queryWidgetNodeByUserId instanceof DXScrollerLayout) {
            View D = queryWidgetNodeByUserId.getDXRuntimeContext().D();
            if (D instanceof DXNativeRecyclerView) {
                Object tag = D.getTag(DXScrollerLayout.DX_TAG_HAS_SCROLL_LISTENER);
                if (tag instanceof DXScrollerLayout.ScrollListener) {
                    if (i == 1) {
                        DXNativeRecyclerView dXNativeRecyclerView = (DXNativeRecyclerView) D;
                        View childAt = dXNativeRecyclerView.getChildAt(0);
                        if (childAt != null) {
                            int measuredWidth = childAt.getMeasuredWidth();
                            dXNativeRecyclerView.setScrolledX(measuredWidth);
                            ((DXScrollerLayout.ScrollListener) tag).v(measuredWidth);
                            fve.e("DXHIconScrollEventHandler", "reset icon scroll offsetX: " + measuredWidth);
                            return;
                        }
                        return;
                    }
                    ((DXNativeRecyclerView) D).setScrolledX(0);
                    ((DXScrollerLayout.ScrollListener) tag).v(0);
                    fve.e("DXHIconScrollEventHandler", "reset icon scroll offsetX: 0");
                }
            }
        }
    }

    public final int[] j(Object[] objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("cbd93062", new Object[]{this, objArr});
        }
        int[] iArr = new int[2];
        Object obj = objArr[1];
        if (!(obj instanceof JSONObject)) {
            return iArr;
        }
        try {
            JSONArray jSONArray = ((JSONObject) obj).getJSONArray("heightArray");
            for (int i = 0; i < jSONArray.size(); i++) {
                iArr[i] = Integer.parseInt(String.valueOf(jSONArray.get(i)));
            }
        } catch (Exception e) {
            fve.e("DXHIconScrollEventHandler", "解析高度信息出现异常：" + e);
        }
        return iArr;
    }

    public final int[] k(Object[] objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("512655fb", new Object[]{this, objArr});
        }
        int[] iArr = new int[2];
        Object obj = objArr[2];
        if (!(obj instanceof JSONObject)) {
            return iArr;
        }
        try {
            JSONArray jSONArray = ((JSONObject) obj).getJSONArray("widthArray");
            for (int i = 0; i < jSONArray.size(); i++) {
                iArr[i] = Integer.parseInt(String.valueOf(jSONArray.get(i)));
            }
        } catch (Exception e) {
            fve.e("DXHIconScrollEventHandler", "解析宽度信息出现异常：" + e);
        }
        return iArr;
    }

    public void l(DXScrollEvent dXScrollEvent, DXRuntimeContext dXRuntimeContext, int[] iArr, int[] iArr2, DXRootView dXRootView, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed929b49", new Object[]{this, dXScrollEvent, dXRuntimeContext, iArr, iArr2, dXRootView, new Integer(i), new Integer(i2)});
            return;
        }
        ViewParent parent = dXRootView.getParent();
        if (parent instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) parent;
            if (viewGroup.getLayoutParams() != null) {
                Context h = dXRuntimeContext.h();
                int f = f(dXRuntimeContext, iArr, h, 0);
                if (f >= 0) {
                    int f2 = f(dXRuntimeContext, iArr, h, 1);
                    if (f2 < 0) {
                        f2 = f;
                    }
                    int a2 = a(dXRuntimeContext.r(), h, iArr2[0]);
                    float h2 = h(dXRuntimeContext, dXScrollEvent, h, iArr2);
                    fve.e("DXHIconScrollEventHandler", "scrollX:" + h2);
                    n(dXRuntimeContext, dXRootView, f, h2 > 0.0f ? a2 == 0 ? f : (int) ((h2 / a2) * (f2 - f)) : 0, iArr2, i, i2);
                    this.f16728a.postMessage(dXRuntimeContext.s().f(), dXRootView, (int) h2, viewGroup.getLayoutParams().height);
                    return;
                }
                return;
            }
        }
        fve.e("DXHIconScrollEventHandler", "scrollEvent trigger but this View is not attached to a parent");
    }
}
