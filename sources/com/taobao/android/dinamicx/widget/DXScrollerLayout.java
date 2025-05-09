package com.taobao.android.dinamicx.widget;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SimpleItemAnimator;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXScrollEvent;
import com.taobao.android.dinamicx.expression.event.DXViewEvent;
import com.taobao.android.dinamicx.f;
import com.taobao.android.dinamicx.o;
import com.taobao.android.dinamicx.view.DXLinearLayoutManager;
import com.taobao.android.dinamicx.view.DXNativeFrameLayout;
import com.taobao.android.dinamicx.view.DXNativeRecyclerView;
import com.taobao.android.turbo.core.component.BaseOuterComponent;
import com.taobao.taobao.R;
import com.taobao.weex.common.Constants;
import java.util.ArrayList;
import java.util.Map;
import tb.av5;
import tb.cxb;
import tb.exb;
import tb.fzo;
import tb.ic5;
import tb.qub;
import tb.t2o;
import tb.uof;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class DXScrollerLayout extends o {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXSCROLLERLAYOUT_ANDROIDFIXSCROLLVERTICALCONFLICT = 3042866685285795334L;
    public static final long DXSCROLLERLAYOUT_DISABLEBOUNCES = -7721339152929171023L;
    public static final long DXSCROLLERLAYOUT_DISABLECONTENTOFFSETRESET = -7541569833091285454L;
    public static final long DXSCROLLERLAYOUT_ENABLESMOOTHSCROLL = 7492731803194590965L;
    public static final long DXSCROLLERLAYOUT_IGNOREREPEATRENDER = -1510047720479239593L;
    public static final long DXSCROLLERLAYOUT_NESTEDSCROLLINGENABLED = 601161579145018097L;
    public static final long DXSCROLLERLAYOUT_OPENSCROLLERANIMATION = -7123870390816445523L;
    public static final long DXSCROLLERLAYOUT_VELOCITYSPEED = -8777566321444773011L;
    public static final long DX_SCROLLER_LAYOUT = 5192418215958133202L;
    public static final long DX_SCROLLER_LAYOUT_CONTENT_OFFSET = 1750803361827314031L;
    public static final long DX_SCROLLER_LAYOUT_ITEM_PREFETCH = 3722067687195294700L;
    public static final int DX_TAG_HAS_SCROLL_LISTENER = R.id.dx_recycler_view_has_scroll_listener;
    private cxb<?, exb> dxVideoController;
    private boolean itemPrefetch = true;
    public int contentOffset = -1;
    private boolean openScrollerAnimation = false;
    private boolean ignoreRepeatRender = false;
    private boolean androidFixScrollVerticalConflict = false;
    private boolean disableContentOffsetReset = false;
    private double velocitySpeed = -1.0d;
    private int nestedScrollingEnabled = -1;
    private boolean enableSmoothScroll = false;
    public boolean hasResetScrollerListener = false;
    public boolean needCheck = false;
    public boolean disableBounces = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class ScrollListener extends RecyclerView.OnScrollListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public DXScrollerLayout f7390a;
        public final DXScrollEvent b = new DXScrollEvent(5288751146867425108L);
        public final DXScrollEvent c = new DXScrollEvent(9144262755562405950L);
        public final DXScrollEvent d = new DXScrollEvent(2691126191158604142L);
        public final uof e = new uof();
        public final uof f = new uof();
        public int g;
        public int h;
        public DXRootView i;
        public JSONObject j;
        public JSONObject k;
        public av5 l;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                ScrollListener scrollListener = ScrollListener.this;
                scrollListener.b.setOffsetX(scrollListener.g);
                ScrollListener scrollListener2 = ScrollListener.this;
                scrollListener2.b.setOffsetY(scrollListener2.h);
                if (ScrollListener.o(ScrollListener.this).indicatorWidgetNode != null) {
                    ScrollListener.o(ScrollListener.this).indicatorWidgetNode.postEvent(ScrollListener.this.b);
                }
                ScrollListener.o(ScrollListener.this).postEvent(ScrollListener.this.b);
            }
        }

        static {
            t2o.a(444597369);
        }

        public static /* synthetic */ void b(ScrollListener scrollListener) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("eb0bee11", new Object[]{scrollListener});
            } else {
                scrollListener.s();
            }
        }

        public static /* synthetic */ Object ipc$super(ScrollListener scrollListener, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/widget/DXScrollerLayout$ScrollListener");
        }

        public static /* synthetic */ DXScrollerLayout o(ScrollListener scrollListener) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DXScrollerLayout) ipChange.ipc$dispatch("86e2ba95", new Object[]{scrollListener});
            }
            return scrollListener.f7390a;
        }

        public void p(RecyclerView recyclerView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("62507623", new Object[]{this, recyclerView});
                return;
            }
            DXScrollerLayout dXScrollerLayout = this.f7390a;
            if ((!dXScrollerLayout.needCheck || !dXScrollerLayout.hasResetScrollerListener) && (recyclerView instanceof DXNativeRecyclerView)) {
                DXNativeRecyclerView dXNativeRecyclerView = (DXNativeRecyclerView) recyclerView;
                v(dXNativeRecyclerView.getScrolledX());
                w(dXNativeRecyclerView.getScrolledY());
                new Handler(Looper.getMainLooper()).post(new a());
            }
        }

        public DXScrollerLayout r() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DXScrollerLayout) ipChange.ipc$dispatch("b9ba8c42", new Object[]{this});
            }
            return this.f7390a;
        }

        public final void s() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("de75c2db", new Object[]{this});
            } else if (DXScrollerLayout.access$200(this.f7390a)) {
                JSONObject jSONObject = new JSONObject();
                this.j = jSONObject;
                jSONObject.put("type", (Object) "BNDX");
                JSONObject jSONObject2 = new JSONObject();
                this.k = jSONObject2;
                this.j.put("params", (Object) jSONObject2);
                this.k.put("widget", (Object) this.f7390a);
                this.i = this.f7390a.getDXRuntimeContext().L();
                this.l = this.f7390a.getDXRuntimeContext().s();
            }
        }

        public void t(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c1c5d6", new Object[]{this, str});
            } else if (DXScrollerLayout.access$200(this.f7390a)) {
                this.k.put("offsetX", (Object) Integer.valueOf(this.g));
                this.k.put("offsetY", (Object) Integer.valueOf(this.h));
                this.k.put("action", (Object) str);
                this.k.put(BaseOuterComponent.b.SOURCE_COMPONENT_ID, (Object) this.f7390a.getUserId());
                this.l.t(this.i, this.j);
            }
        }

        public void u(RecyclerView recyclerView, DXScrollEvent dXScrollEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e5202cfa", new Object[]{this, recyclerView, dXScrollEvent});
                return;
            }
            dXScrollEvent.setOffsetX(this.g);
            dXScrollEvent.setOffsetY(this.h);
            if (this.f7390a.getOrientation() == 0) {
                this.f7390a.contentOffset = this.g;
            } else {
                this.f7390a.contentOffset = this.h;
            }
            DXWidgetNode dXWidgetNode = this.f7390a.indicatorWidgetNode;
            if (dXWidgetNode != null) {
                dXWidgetNode.postEvent(dXScrollEvent);
            }
            this.f7390a.postEvent(dXScrollEvent);
        }

        public void v(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bd51edd9", new Object[]{this, new Integer(i)});
            } else {
                this.g = i;
            }
        }

        public void w(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bf06c678", new Object[]{this, new Integer(i)});
            } else {
                this.h = i;
            }
        }

        public void x(DXScrollerLayout dXScrollerLayout, RecyclerView recyclerView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("78f11413", new Object[]{this, dXScrollerLayout, recyclerView});
                return;
            }
            this.f7390a = dXScrollerLayout;
            if (dXScrollerLayout.getOrientation() == 0) {
                uof uofVar = this.f;
                uofVar.f29533a = dXScrollerLayout.contentHorizontalLength;
                dXScrollerLayout.getMeasuredHeight();
                uofVar.getClass();
                this.b.setContentSize(this.f);
                this.c.setContentSize(this.f);
                this.d.setContentSize(this.f);
            } else {
                this.f.f29533a = dXScrollerLayout.getMeasuredWidth();
                this.f.getClass();
                this.b.setContentSize(this.f);
                this.c.setContentSize(this.f);
                this.d.setContentSize(this.f);
            }
            this.e.f29533a = dXScrollerLayout.getMeasuredWidth();
            uof uofVar2 = this.e;
            dXScrollerLayout.getMeasuredHeight();
            uofVar2.getClass();
            this.b.setScrollerSize(this.e);
            this.c.setScrollerSize(this.e);
            this.d.setScrollerSize(this.e);
            this.b.setRecyclerView(recyclerView);
            this.c.setRecyclerView(recyclerView);
            this.d.setRecyclerView(recyclerView);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("51239a02", new Object[]{this, recyclerView, new Integer(i)});
            } else if (i == 1) {
                u(recyclerView, this.c);
                t("scroll_beigin");
            } else if (i == 0) {
                u(recyclerView, this.d);
                t("scroll_end");
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            ArrayList<DXWidgetNode> arrayList;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b9d7be25", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
                return;
            }
            this.g += i;
            this.h += i2;
            DXScrollerLayout dXScrollerLayout = this.f7390a;
            if (dXScrollerLayout.needCheck && dXScrollerLayout.hasResetScrollerListener && (arrayList = dXScrollerLayout.itemWidgetNodes) != null && arrayList.size() >= 1 && this.g >= this.f7390a.itemWidgetNodes.get(0).getMeasuredWidth()) {
                this.g = i;
            }
            DXScrollerLayout dXScrollerLayout2 = this.f7390a;
            dXScrollerLayout2.needCheck = false;
            dXScrollerLayout2.hasResetScrollerListener = false;
            u(recyclerView, this.b);
            t(fzo.SCROLLING);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class ScrollerAdapter extends RecyclerView.Adapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public Context context;
        public DXScrollerLayout scrollerLayout;
        private o simpleRenderPipeline;
        public ArrayList<DXWidgetNode> dataSource = new ArrayList<>();
        private boolean needSetLayoutParams = true;
        private DXViewEvent appearViewEvent = new DXViewEvent(-8975334121118753601L);
        private DXViewEvent disAppearViewEvent = new DXViewEvent(-5201408949358043646L);

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public static class ItemViewHolder extends RecyclerView.ViewHolder {

            /* renamed from: a  reason: collision with root package name */
            public DXWidgetNode f7392a;

            static {
                t2o.a(444597372);
            }

            public ItemViewHolder(View view) {
                super(view);
            }
        }

        static {
            t2o.a(444597371);
        }

        public ScrollerAdapter(Context context, DXScrollerLayout dXScrollerLayout) {
            this.simpleRenderPipeline = dXScrollerLayout.pipeline;
            this.context = context;
            this.scrollerLayout = dXScrollerLayout;
        }

        private DXRuntimeContext cloneDxRuntimeContextResetError(DXWidgetNode dXWidgetNode) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DXRuntimeContext) ipChange.ipc$dispatch("b9da80c0", new Object[]{this, dXWidgetNode});
            }
            DXRuntimeContext b = dXWidgetNode.getDXRuntimeContext().b(dXWidgetNode);
            f fVar = new f(b.c());
            fVar.b = b.p();
            b.g0(fVar);
            return b;
        }

        public static /* synthetic */ Object ipc$super(ScrollerAdapter scrollerAdapter, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/widget/DXScrollerLayout$ScrollerAdapter");
        }

        private void setRecyclerViewParams(int i, RecyclerView.LayoutParams layoutParams) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("45dd0215", new Object[]{this, new Integer(i), layoutParams});
            } else if (this.scrollerLayout.getOrientation() == 0) {
                if (i == 0) {
                    layoutParams.setMargins(this.scrollerLayout.getPaddingLeft(), this.scrollerLayout.getPaddingTop(), 0, this.scrollerLayout.getPaddingBottom());
                } else if (i == this.dataSource.size() - 1) {
                    layoutParams.setMargins(0, this.scrollerLayout.getPaddingTop(), this.scrollerLayout.getPaddingRight(), this.scrollerLayout.getPaddingBottom());
                } else {
                    layoutParams.setMargins(0, this.scrollerLayout.getPaddingTop(), 0, this.scrollerLayout.getPaddingBottom());
                }
            } else if (i == 0) {
                layoutParams.setMargins(this.scrollerLayout.getPaddingLeft(), this.scrollerLayout.getPaddingTop(), this.scrollerLayout.getPaddingRight(), 0);
            } else if (i == this.dataSource.size() - 1) {
                layoutParams.setMargins(this.scrollerLayout.getPaddingLeft(), 0, this.scrollerLayout.getPaddingRight(), this.scrollerLayout.getPaddingBottom());
            } else {
                layoutParams.setMargins(this.scrollerLayout.getPaddingLeft(), 0, this.scrollerLayout.getPaddingRight(), 0);
            }
        }

        public DXWidgetNode getItem(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DXWidgetNode) ipChange.ipc$dispatch("e59e5492", new Object[]{this, new Integer(i)});
            }
            return this.dataSource.get(i);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue();
            }
            ArrayList<DXWidgetNode> arrayList = this.dataSource;
            if (arrayList == null) {
                return 0;
            }
            return arrayList.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public long getItemId(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("19b1c34c", new Object[]{this, new Integer(i)})).longValue();
            }
            return i;
        }

        public boolean isNeedSetLayoutParams() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("156c295d", new Object[]{this})).booleanValue();
            }
            return this.needSetLayoutParams;
        }

        public void onAfterRenderItemWidgetNode(DXWidgetNode dXWidgetNode, int i, ItemViewHolder itemViewHolder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a5712a4f", new Object[]{this, dXWidgetNode, new Integer(i), itemViewHolder});
                return;
            }
            itemViewHolder.f7392a = dXWidgetNode;
            this.appearViewEvent.setItemIndex(i);
            if (dXWidgetNode.getBindingXExecutingMap() != null) {
                dXWidgetNode.getBindingXExecutingMap().clear();
            }
            dXWidgetNode.sendBroadcastEvent(this.appearViewEvent);
            this.scrollerLayout.postEvent(this.appearViewEvent);
            this.scrollerLayout.addAppearWidget(dXWidgetNode);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("aa17accb", new Object[]{this, viewHolder, new Integer(i)});
            } else {
                onBindViewHolderInternal(viewHolder, i);
            }
        }

        public void onBindViewHolderInternal(RecyclerView.ViewHolder viewHolder, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("12c2d0ce", new Object[]{this, viewHolder, new Integer(i)});
                return;
            }
            DXWidgetNode item = getItem(i);
            ItemViewHolder itemViewHolder = (ItemViewHolder) viewHolder;
            if (item.isViewMatrixChanged() || !onBeforeRenderItemWidgetNode(item, i, itemViewHolder)) {
                onRenderItemWidgetNode(item, i, itemViewHolder);
                onAfterRenderItemWidgetNode(item, i, itemViewHolder);
                item.setViewMatrixChanged(false);
            }
        }

        public View onCreateView(ViewGroup viewGroup, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (View) ipChange.ipc$dispatch("b1aba1ff", new Object[]{this, viewGroup, new Integer(i)});
            }
            o oVar = this.simpleRenderPipeline;
            if (oVar == null) {
                return new DXNativeFrameLayout(this.context);
            }
            return oVar.i(this.context);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (RecyclerView.ViewHolder) ipChange.ipc$dispatch("9e3c0169", new Object[]{this, viewGroup, new Integer(i)});
            }
            return new ItemViewHolder(onCreateView(viewGroup, i));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("891ac20", new Object[]{this, viewHolder});
                return;
            }
            this.disAppearViewEvent.setItemIndex(viewHolder.getAdapterPosition());
            this.scrollerLayout.postEvent(this.disAppearViewEvent);
            ItemViewHolder itemViewHolder = (ItemViewHolder) viewHolder;
            DXWidgetNode dXWidgetNode = itemViewHolder.f7392a;
            if (dXWidgetNode != null) {
                dXWidgetNode.sendBroadcastEvent(this.disAppearViewEvent);
                this.scrollerLayout.removeAppearWidget(itemViewHolder.f7392a);
            }
        }

        public void setDataSource(ArrayList<DXWidgetNode> arrayList) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("82fc4efc", new Object[]{this, arrayList});
            } else {
                this.dataSource = arrayList;
            }
        }

        public void setNeedSetLayoutParams(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d44f3bd3", new Object[]{this, new Boolean(z)});
            } else {
                this.needSetLayoutParams = z;
            }
        }

        public void setScrollerLayout(DXScrollerLayout dXScrollerLayout) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9456e9e4", new Object[]{this, dXScrollerLayout});
                return;
            }
            this.scrollerLayout = dXScrollerLayout;
            this.simpleRenderPipeline = dXScrollerLayout.pipeline;
        }

        public void onRenderItemWidgetNode(DXWidgetNode dXWidgetNode, int i, ItemViewHolder itemViewHolder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dafb7571", new Object[]{this, dXWidgetNode, new Integer(i), itemViewHolder});
                return;
            }
            DXRuntimeContext cloneDxRuntimeContextResetError = cloneDxRuntimeContextResetError(dXWidgetNode);
            this.simpleRenderPipeline.k(dXWidgetNode, null, itemViewHolder.itemView, cloneDxRuntimeContextResetError, 2, 9, this.scrollerLayout.getOldWidthMeasureSpec(), this.scrollerLayout.getOldHeightMeasureSpec(), i);
            if (cloneDxRuntimeContextResetError.Y()) {
                ic5.q(cloneDxRuntimeContextResetError.m(), true);
            }
        }

        public boolean onBeforeRenderItemWidgetNode(DXWidgetNode dXWidgetNode, int i, ItemViewHolder itemViewHolder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d9eddd94", new Object[]{this, dXWidgetNode, new Integer(i), itemViewHolder})).booleanValue();
            }
            this.scrollerLayout.removeAppearWidget(itemViewHolder.f7392a);
            if (this.needSetLayoutParams) {
                ViewGroup.LayoutParams layoutParams = itemViewHolder.itemView.getLayoutParams();
                if (layoutParams instanceof RecyclerView.LayoutParams) {
                    setRecyclerViewParams(i, (RecyclerView.LayoutParams) layoutParams);
                } else {
                    RecyclerView.LayoutParams layoutParams2 = new RecyclerView.LayoutParams(this.scrollerLayout.getMeasuredWidth(), this.scrollerLayout.getMeasuredHeight());
                    itemViewHolder.itemView.setLayoutParams(layoutParams2);
                    setRecyclerViewParams(i, layoutParams2);
                }
            }
            if (itemViewHolder.f7392a != dXWidgetNode || DXScrollerLayout.access$100(this.scrollerLayout)) {
                return false;
            }
            this.appearViewEvent.setItemIndex(i);
            if (dXWidgetNode.getBindingXExecutingMap() != null) {
                dXWidgetNode.getBindingXExecutingMap().clear();
            }
            dXWidgetNode.sendBroadcastEvent(this.appearViewEvent);
            this.scrollerLayout.postEvent(this.appearViewEvent);
            this.scrollerLayout.addAppearWidget(dXWidgetNode);
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a implements qub {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(444597368);
            t2o.a(444597451);
        }

        @Override // tb.qub
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
            }
            return new DXScrollerLayout();
        }
    }

    static {
        t2o.a(444597367);
    }

    public static /* synthetic */ boolean access$100(DXScrollerLayout dXScrollerLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("37fcfa9d", new Object[]{dXScrollerLayout})).booleanValue();
        }
        return dXScrollerLayout.ignoreRepeatRender;
    }

    public static /* synthetic */ boolean access$200(DXScrollerLayout dXScrollerLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3e00c5fc", new Object[]{dXScrollerLayout})).booleanValue();
        }
        return dXScrollerLayout.openScrollerAnimation;
    }

    public static /* synthetic */ Object ipc$super(DXScrollerLayout dXScrollerLayout, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1133248269:
                return new Integer(super.getDefaultValueForIntAttr(((Number) objArr[0]).longValue()));
            case -740240234:
                super.onSetIntAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).intValue());
                return null;
            case -638169079:
                super.onSetDoubleAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).doubleValue());
                return null;
            case -303753557:
                super.onRenderView((Context) objArr[0], (View) objArr[1]);
                return null;
            case 1524202196:
                return super.getNodePropByKey((String) objArr[0]);
            case 2119721610:
                super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/widget/DXScrollerLayout");
        }
    }

    @Override // com.taobao.android.dinamicx.widget.k, com.taobao.android.dinamicx.widget.DXWidgetNode, tb.qub
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
        }
        return new DXScrollerLayout();
    }

    public void closeDefaultAnimator(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56490c60", new Object[]{this, recyclerView});
            return;
        }
        try {
            recyclerView.getItemAnimator().setAddDuration(0L);
            recyclerView.getItemAnimator().setChangeDuration(0L);
            recyclerView.getItemAnimator().setMoveDuration(0L);
            recyclerView.getItemAnimator().setRemoveDuration(0L);
            ((SimpleItemAnimator) recyclerView.getItemAnimator()).setSupportsChangeAnimations(false);
        } catch (Throwable unused) {
        }
    }

    public int getContentOffset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("77777c30", new Object[]{this})).intValue();
        }
        return this.contentOffset;
    }

    @Override // com.taobao.android.dinamicx.widget.o, com.taobao.android.dinamicx.widget.DXWidgetNode
    public int getDefaultValueForIntAttr(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bc7400f3", new Object[]{this, new Long(j)})).intValue();
        }
        if (j == DXSCROLLERLAYOUT_DISABLECONTENTOFFSETRESET || j == DXSCROLLERLAYOUT_ANDROIDFIXSCROLLVERTICALCONFLICT) {
            return 0;
        }
        return super.getDefaultValueForIntAttr(j);
    }

    @Override // com.taobao.android.dinamicx.widget.j, tb.hwb
    public Object getNodePropByKey(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("5ad97ad4", new Object[]{this, str});
        }
        if (Constants.Name.CONTENT_OFFSET.equals(str)) {
            return Integer.valueOf(this.contentOffset);
        }
        return super.getNodePropByKey(str);
    }

    public boolean isItemPrefetch() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5cf4baff", new Object[]{this})).booleanValue();
        }
        return this.itemPrefetch;
    }

    public DXLinearLayoutManager newLinearLayoutManager(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXLinearLayoutManager) ipChange.ipc$dispatch("ab4f4def", new Object[]{this, context});
        }
        return new DXLinearLayoutManager(context);
    }

    public ScrollListener newScrollListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScrollListener) ipChange.ipc$dispatch("748e3cc8", new Object[]{this});
        }
        return new ScrollListener();
    }

    @Override // com.taobao.android.dinamicx.widget.o, tb.exb
    public void onCanPlay(cxb<?, exb> cxbVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74c767ef", new Object[]{this, cxbVar, str});
            return;
        }
        this.dxVideoController = cxbVar;
        triggerVideoPlayControl();
    }

    @Override // com.taobao.android.dinamicx.widget.o, com.taobao.android.dinamicx.widget.k, com.taobao.android.dinamicx.widget.j, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
            return;
        }
        super.onClone(dXWidgetNode, z);
        if (dXWidgetNode instanceof DXScrollerLayout) {
            DXScrollerLayout dXScrollerLayout = (DXScrollerLayout) dXWidgetNode;
            this.contentOffset = dXScrollerLayout.contentOffset;
            this.itemPrefetch = dXScrollerLayout.itemPrefetch;
            this.openScrollerAnimation = dXScrollerLayout.openScrollerAnimation;
            this.ignoreRepeatRender = dXScrollerLayout.ignoreRepeatRender;
            this.disableContentOffsetReset = dXScrollerLayout.disableContentOffsetReset;
            this.androidFixScrollVerticalConflict = dXScrollerLayout.androidFixScrollVerticalConflict;
            this.velocitySpeed = dXScrollerLayout.velocitySpeed;
            this.nestedScrollingEnabled = dXScrollerLayout.nestedScrollingEnabled;
            this.hasResetScrollerListener = dXScrollerLayout.hasResetScrollerListener;
            this.needCheck = dXScrollerLayout.needCheck;
            this.enableSmoothScroll = dXScrollerLayout.enableSmoothScroll;
            this.disableBounces = dXScrollerLayout.disableBounces;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.k, com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        DXNativeRecyclerView dXNativeRecyclerView = new DXNativeRecyclerView(context);
        closeDefaultAnimator(dXNativeRecyclerView);
        dXNativeRecyclerView.setEnableSmoothScroll(this.enableSmoothScroll);
        setDisableBounces(dXNativeRecyclerView, this.disableBounces);
        return dXNativeRecyclerView;
    }

    @Override // com.taobao.android.dinamicx.widget.o, tb.axb
    public void onDidFinishPlayingLastItem(int i, boolean z, String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2206a3f", new Object[]{this, new Integer(i), new Boolean(z), str, map});
            return;
        }
        cxb<?, exb> cxbVar = this.dxVideoController;
        if (cxbVar != null) {
            cxbVar.h(this, str);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetDoubleAttribute(long j, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9f65009", new Object[]{this, new Long(j), new Double(d)});
            return;
        }
        super.onSetDoubleAttribute(j, d);
        if (j == DXSCROLLERLAYOUT_VELOCITYSPEED) {
            this.velocitySpeed = d;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.o, tb.exb
    public void onShouldStop(cxb<?, exb> cxbVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c812a17e", new Object[]{this, cxbVar, str});
            return;
        }
        this.dxVideoController = null;
        stopVideoPlayControl();
    }

    public void resetScrollerListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a06ba484", new Object[]{this});
            return;
        }
        View D = getDXRuntimeContext().D();
        if (D != null && (D.getTag(DX_TAG_HAS_SCROLL_LISTENER) instanceof ScrollListener)) {
            this.hasResetScrollerListener = true;
        }
    }

    public void setAdapter(DXScrollerLayout dXScrollerLayout, RecyclerView recyclerView, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c19e8ee", new Object[]{this, dXScrollerLayout, recyclerView, context});
            return;
        }
        ScrollerAdapter scrollerAdapter = (ScrollerAdapter) recyclerView.getAdapter();
        if (scrollerAdapter == null) {
            ScrollerAdapter scrollerAdapter2 = new ScrollerAdapter(context, dXScrollerLayout);
            scrollerAdapter2.setHasStableIds(true);
            scrollerAdapter2.setDataSource(dXScrollerLayout.itemWidgetNodes);
            recyclerView.setAdapter(scrollerAdapter2);
            return;
        }
        scrollerAdapter.setDataSource(dXScrollerLayout.itemWidgetNodes);
        scrollerAdapter.setScrollerLayout(dXScrollerLayout);
        if (!this.disableContentOffsetReset && this.contentOffset <= -1) {
            ((DXNativeRecyclerView) recyclerView).needScrollAfterLayout(0, 0, dXScrollerLayout.contentHorizontalLength, dXScrollerLayout.contentVerticalLength);
        }
        scrollerAdapter.notifyDataSetChanged();
    }

    public void setContentOffset(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea40072", new Object[]{this, new Integer(i)});
        } else {
            this.contentOffset = i;
        }
    }

    public void setItemPrefetch(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd3eff01", new Object[]{this, new Boolean(z)});
        } else {
            this.itemPrefetch = z;
        }
    }

    public void setLayoutManager(Context context, DXScrollerLayout dXScrollerLayout, RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b00aa66", new Object[]{this, context, dXScrollerLayout, recyclerView});
            return;
        }
        DXLinearLayoutManager dXLinearLayoutManager = (DXLinearLayoutManager) recyclerView.getLayoutManager();
        if (dXLinearLayoutManager == null) {
            dXLinearLayoutManager = newLinearLayoutManager(context);
            recyclerView.setLayoutManager(dXLinearLayoutManager);
        }
        if (getOrientation() == 1) {
            dXLinearLayoutManager.setOrientation(1);
        } else {
            dXLinearLayoutManager.setOrientation(0);
        }
        dXLinearLayoutManager.setItemPrefetchEnabled(dXScrollerLayout.itemPrefetch);
        dXLinearLayoutManager.y(dXScrollerLayout.scrollEnabled);
    }

    public void setScrollListener(DXScrollerLayout dXScrollerLayout, RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2cbb8c30", new Object[]{this, dXScrollerLayout, recyclerView});
            return;
        }
        int i = DX_TAG_HAS_SCROLL_LISTENER;
        ScrollListener scrollListener = (ScrollListener) recyclerView.getTag(i);
        if (scrollListener == null) {
            ScrollListener newScrollListener = newScrollListener();
            newScrollListener.x(dXScrollerLayout, recyclerView);
            recyclerView.addOnScrollListener(newScrollListener);
            recyclerView.setTag(i, newScrollListener);
            newScrollListener.p(recyclerView);
            ScrollListener.b(newScrollListener);
            return;
        }
        scrollListener.x(dXScrollerLayout, recyclerView);
        scrollListener.p(recyclerView);
        ScrollListener.b(scrollListener);
    }

    public void setDisableBounces(RecyclerView recyclerView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0ca4529", new Object[]{this, recyclerView, new Boolean(z)});
        } else if (z) {
            recyclerView.setOverScrollMode(2);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.o, com.taobao.android.dinamicx.widget.k, com.taobao.android.dinamicx.widget.j, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        DXScrollerLayout dXScrollerLayout;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
            return;
        }
        super.onRenderView(context, view);
        this.needCheck = true;
        if ((view instanceof RecyclerView) && (dXScrollerLayout = (DXScrollerLayout) getDXRuntimeContext().W()) != null) {
            DXNativeRecyclerView dXNativeRecyclerView = (DXNativeRecyclerView) view;
            setLayoutManager(context, dXScrollerLayout, dXNativeRecyclerView);
            int i = dXScrollerLayout.contentOffset;
            if (i > -1) {
                if (getOrientation() == 1) {
                    dXNativeRecyclerView.needScrollAfterLayout(0, i, dXScrollerLayout.contentHorizontalLength, dXScrollerLayout.contentVerticalLength);
                } else {
                    dXNativeRecyclerView.needScrollAfterLayout(i, 0, dXScrollerLayout.contentHorizontalLength, dXScrollerLayout.contentVerticalLength);
                }
            }
            dXNativeRecyclerView.setNeedFixScrollConflict(this.androidFixScrollVerticalConflict ? 1 : 0);
            setAdapter(dXScrollerLayout, dXNativeRecyclerView, context);
            setScrollListener(dXScrollerLayout, dXNativeRecyclerView);
            double d = this.velocitySpeed;
            if (d > vu3.b.GEO_NOT_SUPPORT) {
                dXNativeRecyclerView.setVelocitySpeed(d);
            }
            int i2 = this.nestedScrollingEnabled;
            if (i2 >= 0) {
                if (i2 != 1) {
                    z = false;
                }
                if (z != dXNativeRecyclerView.isNestedScrollingEnabled()) {
                    dXNativeRecyclerView.setNestedScrollingEnabled(z);
                }
            }
        }
    }

    @Override // com.taobao.android.dinamicx.widget.o, com.taobao.android.dinamicx.widget.k, com.taobao.android.dinamicx.widget.j, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
        } else if (j == 1750803361827314031L) {
            this.contentOffset = i;
        } else if (j == DX_SCROLLER_LAYOUT_ITEM_PREFETCH) {
            if (i == 0) {
                z = false;
            }
            this.itemPrefetch = z;
        } else if (j == -7123870390816445523L) {
            if (i != 1) {
                z = false;
            }
            this.openScrollerAnimation = z;
        } else if (j == DXSCROLLERLAYOUT_IGNOREREPEATRENDER) {
            if (i == 0) {
                z = false;
            }
            this.ignoreRepeatRender = z;
        } else if (j == DXSCROLLERLAYOUT_DISABLECONTENTOFFSETRESET) {
            if (i != 1) {
                z = false;
            }
            this.disableContentOffsetReset = z;
        } else if (j == DXSCROLLERLAYOUT_ANDROIDFIXSCROLLVERTICALCONFLICT) {
            if (i != 1) {
                z = false;
            }
            this.androidFixScrollVerticalConflict = z;
        } else if (j == DXSCROLLERLAYOUT_NESTEDSCROLLINGENABLED) {
            this.nestedScrollingEnabled = i;
        } else if (j == 7492731803194590965L) {
            if (i == 0) {
                z = false;
            }
            this.enableSmoothScroll = z;
        } else if (j == -7721339152929171023L) {
            if (i == 0) {
                z = false;
            }
            this.disableBounces = z;
        } else {
            super.onSetIntAttribute(j, i);
        }
    }
}
