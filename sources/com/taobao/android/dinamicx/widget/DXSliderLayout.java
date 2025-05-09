package com.taobao.android.dinamicx.widget;

import android.content.Context;
import android.os.Looper;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.expression.event.DXPageChangeEvent;
import com.taobao.android.dinamicx.expression.event.DXPageEndDraggingEvent;
import com.taobao.android.dinamicx.expression.event.DXSetPageIndexEvent;
import com.taobao.android.dinamicx.f;
import com.taobao.android.dinamicx.view.DXLinearLayoutManager;
import com.taobao.android.dinamicx.view.DXNativeAutoLoopRecyclerView;
import com.taobao.android.dinamicx.view.DXNativeProgressIndicator;
import com.taobao.android.dinamicx.view.DXNativeRecyclerView;
import com.taobao.android.dinamicx.view.DXScrollLinearLayoutManager;
import com.taobao.android.dinamicx.widget.DXScrollerLayout;
import com.taobao.android.dinamicx.widget.utils.DXRecyclerViewCacheExtension;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import tb.cxb;
import tb.exb;
import tb.fzo;
import tb.h36;
import tb.ic5;
import tb.jb6;
import tb.la6;
import tb.qub;
import tb.t2o;
import tb.xv5;
import tb.zg5;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class DXSliderLayout extends DXScrollerLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXSLIDERLAYOUT_ALLOWCHILDSIZELESSTHANPARENT = 7651182500694545478L;
    public static final long DXSLIDERLAYOUT_AVOIDINCESSANTSCROLL = 6175561478597347134L;
    public static final long DXSLIDERLAYOUT_AVOIDINDEXDELTATOLARGEFIRST_ANDROID = -546983449460568482L;
    public static final long DXSLIDERLAYOUT_AVOIDINDEXDELTATOLARGE_ANDROID = 4501425988663277281L;
    public static final long DXSLIDERLAYOUT_CHILDWIDTH = 4702072828301052174L;
    public static final long DXSLIDERLAYOUT_DISABLEPAGESELECTANDSTARTTIMEONPRERENDER = -5411074322938787347L;
    public static final long DXSLIDERLAYOUT_ENABLEINFINITYEDGECHECK = -7668517989997933541L;
    public static final long DXSLIDERLAYOUT_ENABLEPRERENDER = 6042404229400734461L;
    public static final long DXSLIDERLAYOUT_IGNOREPLAYCONTROL = -5610109432173134324L;
    public static final long DXSLIDERLAYOUT_INTERCEPTTOUCHEVENT = -3458159313298372122L;
    public static final int DXSLIDERLAYOUT_INTERCEPTTOUCHEVENT_NONE = 0;
    public static final long DXSLIDERLAYOUT_ISCANPARENTTOUCHWHENEDGE_ANDROID = 2244805349756585284L;
    public static final long DXSLIDERLAYOUT_ISCORRECTIONSLIDEOFFSET_ANDROID = 3230619470895835019L;
    public static final long DXSLIDERLAYOUT_ISENABLEDETACHEDSTOPTIMER_ANDROID = -4421262611787364777L;
    public static final long DXSLIDERLAYOUT_ISENABLEEDGECHECK_ANDROID = -7293179166348573521L;
    public static final long DXSLIDERLAYOUT_ISINTERCEPTMULTIPOINTTOUCH = -4985343460365605412L;
    public static final long DXSLIDERLAYOUT_NEEDMANUALSTOPLOOP = -8807003443392417972L;
    public static final long DXSLIDERLAYOUT_NEEDMANUALSTOPLOOPONMOVE = 1470866451661440934L;
    public static final long DXSLIDERLAYOUT_ONENDDRAGGING = -3551035547655452124L;
    public static final long DXSLIDERLAYOUT_OVERRIDECANSCROLLHORIZONTALLY = 2622876492584549901L;
    public static final long DXSLIDERLAYOUT_SCROLLWITHPOSTMSG = -7857363928666175735L;
    public static final long DXSLIDERLAYOUT_USERSCROLLTOPOSITIONWHENRENDER_ANDROID = 3751416681290120446L;
    public static final long DX_SLIDER_LAYOUT = 7645421793448373229L;
    public static final long DX_SLIDER_LAYOUT_AUTO_SCROLL = 2618773720063865426L;
    public static final long DX_SLIDER_LAYOUT_AUTO_SCROLL_INTERVAL = 5501313022839937951L;
    public static final long DX_SLIDER_LAYOUT_IS_INFINITE = -3537170322378136036L;
    public static final long DX_SLIDER_LAYOUT_MANUAL_SWITCH_ENABLED = -7107533083539416402L;
    public static final long DX_SLIDER_LAYOUT_ON_PAGE_CHANGE = -8975195222378757716L;
    public static final long DX_SLIDER_LAYOUT_ON_SET_PAGE_INDEX = -3492248032330035060L;
    public static final long DX_SLIDER_LAYOUT_PAGE_INDEX = 7816489696776271262L;
    private static final String TAG = "DXSliderLayout";
    private boolean autoScroll;
    private int childWidth;
    private DXRecyclerViewCacheExtension dxRecyclerViewCacheExtension;
    private boolean isCanParentTouchWhenEdge_Android;
    private boolean isInfinite;
    private int pageIndex;
    private boolean needManualStopLoopOnMove = false;
    private boolean manualSwitchEnabled = true;
    private int autoScrollInterval = 1000;
    private int interceptTouchEvent = 0;
    private boolean avoidIncessantScroll = false;
    private boolean disablePageSelectAndstartTimeOnPreRender = false;
    private boolean avoidIndexDeltaToLarge_Android = false;
    private boolean avoidIndexDeltaToLargeFirst_Android = false;
    private boolean enablePreRender = false;
    private boolean needManualStopLoop = false;
    private boolean enableInfinityEdgeCheck = false;
    private boolean allowChildSizeLessThanParent = false;
    private boolean useDefaultScrollFinite = false;
    private boolean isInterceptMultipointTouch = true;
    private boolean scrollWithPostMsg = false;
    private boolean overrideCanScrollHorizontal = false;
    private boolean isEnableEdgeCheck_Android = false;
    private boolean ignorePlayControl = false;
    private boolean isCorrectionSlideOffset_Android = false;
    private boolean isEnableDetachedStopTimer = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class AutoLoopScrollerAdapter extends SliderAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(444597384);
        }

        public AutoLoopScrollerAdapter(Context context, DXScrollerLayout dXScrollerLayout) {
            super(context, dXScrollerLayout);
        }

        public static /* synthetic */ Object ipc$super(AutoLoopScrollerAdapter autoLoopScrollerAdapter, String str, Object... objArr) {
            if (str.hashCode() == -442608494) {
                return super.getItem(((Number) objArr[0]).intValue());
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/widget/DXSliderLayout$AutoLoopScrollerAdapter");
        }

        @Override // com.taobao.android.dinamicx.widget.DXScrollerLayout.ScrollerAdapter
        public DXWidgetNode getItem(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DXWidgetNode) ipChange.ipc$dispatch("e59e5492", new Object[]{this, new Integer(i)});
            }
            return super.getItem(i % this.dataSource.size());
        }

        @Override // com.taobao.android.dinamicx.widget.DXScrollerLayout.ScrollerAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue();
            }
            ArrayList<DXWidgetNode> arrayList = this.dataSource;
            if (arrayList == null || arrayList.size() == 0) {
                return 0;
            }
            return Integer.MAX_VALUE;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("65c98627", new Object[]{this, new Integer(i)})).intValue();
            }
            ArrayList<DXWidgetNode> arrayList = this.dataSource;
            return arrayList.get(i % arrayList.size()).getAutoId();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class SliderAdapter extends DXScrollerLayout.ScrollerAdapter implements DXRecyclerViewCacheExtension.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(444597386);
            t2o.a(444597692);
        }

        public SliderAdapter(Context context, DXScrollerLayout dXScrollerLayout) {
            super(context, dXScrollerLayout);
        }

        public static /* synthetic */ Object ipc$super(SliderAdapter sliderAdapter, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -1519310257) {
                super.onAfterRenderItemWidgetNode((DXWidgetNode) objArr[0], ((Number) objArr[1]).intValue(), (DXScrollerLayout.ScrollerAdapter.ItemViewHolder) objArr[2]);
                return null;
            } else if (hashCode == -1314151937) {
                return super.onCreateView((ViewGroup) objArr[0], ((Number) objArr[1]).intValue());
            } else {
                if (hashCode == -621054607) {
                    super.onRenderItemWidgetNode((DXWidgetNode) objArr[0], ((Number) objArr[1]).intValue(), (DXScrollerLayout.ScrollerAdapter.ItemViewHolder) objArr[2]);
                    return null;
                }
                int hashCode2 = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/dinamicx/widget/DXSliderLayout$SliderAdapter");
            }
        }

        @Override // com.taobao.android.dinamicx.widget.utils.DXRecyclerViewCacheExtension.c
        public View G(RecyclerView recyclerView, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (View) ipChange.ipc$dispatch("e10f8177", new Object[]{this, recyclerView, new Integer(i)});
            }
            DXScrollerLayout.ScrollerAdapter.ItemViewHolder itemViewHolder = (DXScrollerLayout.ScrollerAdapter.ItemViewHolder) onCreateViewHolder(recyclerView, getItemViewType(i));
            super.onRenderItemWidgetNode(getItem(i), i, itemViewHolder);
            return itemViewHolder.itemView;
        }

        @Override // com.taobao.android.dinamicx.widget.utils.DXRecyclerViewCacheExtension.c
        public boolean l(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5acb395a", new Object[]{this, new Integer(i)})).booleanValue();
            }
            DXWidgetNode item = getItem(i);
            if (item == null || item.getDXRuntimeContext().D() != null) {
                return false;
            }
            return true;
        }

        @Override // com.taobao.android.dinamicx.widget.DXScrollerLayout.ScrollerAdapter
        public void onAfterRenderItemWidgetNode(DXWidgetNode dXWidgetNode, int i, DXScrollerLayout.ScrollerAdapter.ItemViewHolder itemViewHolder) {
            DXRecyclerViewCacheExtension access$100;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a5712a4f", new Object[]{this, dXWidgetNode, new Integer(i), itemViewHolder});
                return;
            }
            super.onAfterRenderItemWidgetNode(dXWidgetNode, i, itemViewHolder);
            DXScrollerLayout dXScrollerLayout = this.scrollerLayout;
            if ((dXScrollerLayout instanceof DXSliderLayout) && (access$100 = DXSliderLayout.access$100((DXSliderLayout) dXScrollerLayout)) != null) {
                access$100.m(i);
            }
        }

        @Override // com.taobao.android.dinamicx.widget.DXScrollerLayout.ScrollerAdapter
        public View onCreateView(ViewGroup viewGroup, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (View) ipChange.ipc$dispatch("b1aba1ff", new Object[]{this, viewGroup, new Integer(i)});
            }
            DXScrollerLayout dXScrollerLayout = this.scrollerLayout;
            if (!(dXScrollerLayout instanceof DXSliderLayout)) {
                return super.onCreateView(viewGroup, i);
            }
            DXRecyclerViewCacheExtension access$100 = DXSliderLayout.access$100((DXSliderLayout) dXScrollerLayout);
            if (access$100 == null) {
                return super.onCreateView(viewGroup, i);
            }
            View b = access$100.b(i);
            if (b != null) {
                return b;
            }
            return super.onCreateView(viewGroup, i);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ DXNativeAutoLoopRecyclerView f7394a;
        public final /* synthetic */ int b;

        public a(DXNativeAutoLoopRecyclerView dXNativeAutoLoopRecyclerView, int i) {
            this.f7394a = dXNativeAutoLoopRecyclerView;
            this.b = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                this.f7394a.scrollToPosition(this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements DXNativeAutoLoopRecyclerView.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final int f7395a;
        public final /* synthetic */ DXNativeAutoLoopRecyclerView b;

        public b(int i, DXNativeAutoLoopRecyclerView dXNativeAutoLoopRecyclerView) {
            this.b = dXNativeAutoLoopRecyclerView;
            this.f7395a = i;
        }

        @Override // com.taobao.android.dinamicx.view.DXNativeAutoLoopRecyclerView.b
        public void a(int i, DXNativeProgressIndicator dXNativeProgressIndicator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1c7f2ca8", new Object[]{this, new Integer(i), dXNativeProgressIndicator});
                return;
            }
            DXNativeProgressIndicator c = c(dXNativeProgressIndicator, this.b);
            if (c != null) {
                c.setIndexWithAnimation(i % this.f7395a);
            }
        }

        @Override // com.taobao.android.dinamicx.view.DXNativeAutoLoopRecyclerView.b
        public void b(int i, DXNativeProgressIndicator dXNativeProgressIndicator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c5944baa", new Object[]{this, new Integer(i), dXNativeProgressIndicator});
                return;
            }
            DXNativeProgressIndicator c = c(dXNativeProgressIndicator, this.b);
            if (c != null) {
                c.setIndex((i % this.f7395a) + 1);
            }
        }

        public final DXNativeProgressIndicator c(DXNativeProgressIndicator dXNativeProgressIndicator, DXNativeAutoLoopRecyclerView dXNativeAutoLoopRecyclerView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DXNativeProgressIndicator) ipChange.ipc$dispatch("f27858a8", new Object[]{this, dXNativeProgressIndicator, dXNativeAutoLoopRecyclerView});
            }
            if (dXNativeProgressIndicator != null) {
                return dXNativeProgressIndicator;
            }
            DXSliderLayout dXSliderLayout = DXSliderLayout.this;
            dXSliderLayout.indicatorWidgetNode = dXSliderLayout.queryIndicatorNodeByUserId(dXSliderLayout.indicatorId);
            DXWidgetNode dXWidgetNode = DXSliderLayout.this.indicatorWidgetNode;
            if (dXWidgetNode == null) {
                return dXNativeProgressIndicator;
            }
            View D = dXWidgetNode.getDXRuntimeContext().D();
            if (!(D instanceof DXNativeProgressIndicator)) {
                return dXNativeProgressIndicator;
            }
            DXNativeProgressIndicator dXNativeProgressIndicator2 = (DXNativeProgressIndicator) D;
            dXNativeAutoLoopRecyclerView.setIndicator(dXNativeProgressIndicator2);
            return dXNativeProgressIndicator2;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ DXNativeAutoLoopRecyclerView f7396a;
        public final /* synthetic */ int b;

        public c(DXNativeAutoLoopRecyclerView dXNativeAutoLoopRecyclerView, int i) {
            this.f7396a = dXNativeAutoLoopRecyclerView;
            this.b = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                this.f7396a.scrollToPosition(this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ DXNativeAutoLoopRecyclerView f7398a;
        public final /* synthetic */ int b;

        public e(DXNativeAutoLoopRecyclerView dXNativeAutoLoopRecyclerView, int i) {
            this.f7398a = dXNativeAutoLoopRecyclerView;
            this.b = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            this.f7398a.scrollToPosition(this.b);
            this.f7398a.setCurrentIndex(this.b);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class f implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ DXNativeAutoLoopRecyclerView f7399a;
        public final /* synthetic */ int b;

        public f(DXNativeAutoLoopRecyclerView dXNativeAutoLoopRecyclerView, int i) {
            this.f7399a = dXNativeAutoLoopRecyclerView;
            this.b = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            this.f7399a.smoothScrollToPosition(this.b);
            this.f7399a.setCurrentIndex(this.b);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class g implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ DXScrollerLayout.ScrollListener f7400a;

        public g(DXScrollerLayout.ScrollListener scrollListener) {
            this.f7400a = scrollListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                this.f7400a.t(fzo.SCROLLING);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class h implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ DXNativeAutoLoopRecyclerView f7401a;
        public final /* synthetic */ int b;

        public h(DXNativeAutoLoopRecyclerView dXNativeAutoLoopRecyclerView, int i) {
            this.f7401a = dXNativeAutoLoopRecyclerView;
            this.b = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                this.f7401a.scrollToPosition(this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class i implements qub {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(444597385);
            t2o.a(444597451);
        }

        @Override // tb.qub
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
            }
            return new DXSliderLayout();
        }
    }

    static {
        t2o.a(444597375);
    }

    public static /* synthetic */ boolean access$000(DXSliderLayout dXSliderLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8cadbbf7", new Object[]{dXSliderLayout})).booleanValue();
        }
        return dXSliderLayout.isInfinite;
    }

    public static /* synthetic */ DXRecyclerViewCacheExtension access$100(DXSliderLayout dXSliderLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRecyclerViewCacheExtension) ipChange.ipc$dispatch("b593a998", new Object[]{dXSliderLayout});
        }
        return dXSliderLayout.dxRecyclerViewCacheExtension;
    }

    public static /* synthetic */ Object ipc$super(DXSliderLayout dXSliderLayout, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1834790766:
                super.onBeforeBindChildData();
                return null;
            case -1653756745:
                super.stopVideoPlayControl();
                return null;
            case -1133248269:
                return new Integer(super.getDefaultValueForIntAttr(((Number) objArr[0]).longValue()));
            case -740240234:
                super.onSetIntAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).intValue());
                return null;
            case -467598483:
                super.triggerVideoPlayControl();
                return null;
            case -303753557:
                super.onRenderView((Context) objArr[0], (View) objArr[1]);
                return null;
            case 650865254:
                super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case 1327675976:
                return new Boolean(super.onEvent((DXEvent) objArr[0]));
            case 1524202196:
                return super.getNodePropByKey((String) objArr[0]);
            case 1795205734:
                super.setLayoutManager((Context) objArr[0], (DXScrollerLayout) objArr[1], (RecyclerView) objArr[2]);
                return null;
            case 1959225327:
                super.onCanPlay((cxb) objArr[0], (String) objArr[1]);
                return null;
            case 2119721610:
                super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/widget/DXSliderLayout");
        }
    }

    private boolean isPreRender() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c3d4411a", new Object[]{this})).booleanValue();
        }
        if (zg5.h4()) {
            if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                return true;
            }
            return false;
        } else if (getDXRuntimeContext().J() == 2) {
            return true;
        } else {
            return false;
        }
    }

    private void scrollToIndexOnIsNotInfinite(DXNativeAutoLoopRecyclerView dXNativeAutoLoopRecyclerView, DXSliderLayout dXSliderLayout, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9429de46", new Object[]{this, dXNativeAutoLoopRecyclerView, dXSliderLayout, new Integer(i2)});
            return;
        }
        this.useDefaultScrollFinite = true;
        if (getOrientation() != 0 || this.useDefaultScrollFinite) {
            jb6.g(new h(dXNativeAutoLoopRecyclerView, i2));
            return;
        }
        DXScrollerLayout.ScrollListener scrollListener = (DXScrollerLayout.ScrollListener) dXNativeAutoLoopRecyclerView.getTag(DXScrollerLayout.DX_TAG_HAS_SCROLL_LISTENER);
        dXNativeAutoLoopRecyclerView.needScrollAfterLayout(i2 * getMeasuredWidth(), 0, dXSliderLayout.contentHorizontalLength, dXSliderLayout.contentVerticalLength);
        scrollListener.u(dXNativeAutoLoopRecyclerView, new DXSetPageIndexEvent(DX_SLIDER_LAYOUT_ON_SET_PAGE_INDEX));
        jb6.g(new g(scrollListener));
    }

    @Override // com.taobao.android.dinamicx.widget.DXScrollerLayout, com.taobao.android.dinamicx.widget.k, com.taobao.android.dinamicx.widget.DXWidgetNode, tb.qub
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
        }
        return new DXSliderLayout();
    }

    public boolean canAutoPlay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4088147e", new Object[]{this})).booleanValue();
        }
        if (!this.isInfinite || this.autoScrollInterval <= 0 || !this.autoScroll || !this.scrollEnabled) {
            return false;
        }
        return true;
    }

    @Override // com.taobao.android.dinamicx.widget.DXScrollerLayout, com.taobao.android.dinamicx.widget.o, com.taobao.android.dinamicx.widget.DXWidgetNode
    public int getDefaultValueForIntAttr(long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bc7400f3", new Object[]{this, new Long(j2)})).intValue();
        }
        if (j2 == 2618773720063865426L) {
            return 0;
        }
        if (j2 == 5501313022839937951L) {
            return 1000;
        }
        if (j2 == -3537170322378136036L) {
            return 0;
        }
        if (j2 == DX_SLIDER_LAYOUT_MANUAL_SWITCH_ENABLED) {
            return 1;
        }
        if (j2 == DXSLIDERLAYOUT_DISABLEPAGESELECTANDSTARTTIMEONPRERENDER || j2 == 7816489696776271262L) {
            return 0;
        }
        if (j2 == DXSLIDERLAYOUT_ISINTERCEPTMULTIPOINTTOUCH) {
            return 1;
        }
        if (j2 == DXSLIDERLAYOUT_AVOIDINDEXDELTATOLARGE_ANDROID || j2 == DXSLIDERLAYOUT_SCROLLWITHPOSTMSG || j2 == DXSLIDERLAYOUT_ISCORRECTIONSLIDEOFFSET_ANDROID || j2 == DXSLIDERLAYOUT_ISENABLEEDGECHECK_ANDROID) {
            return 0;
        }
        return super.getDefaultValueForIntAttr(j2);
    }

    @Override // com.taobao.android.dinamicx.widget.DXScrollerLayout, com.taobao.android.dinamicx.widget.j, tb.hwb
    public Object getNodePropByKey(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("5ad97ad4", new Object[]{this, str});
        }
        if ("pageIndex".equals(str)) {
            return Integer.valueOf(this.pageIndex);
        }
        return super.getNodePropByKey(str);
    }

    public int getPageIndex() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("913ddec7", new Object[]{this})).intValue();
        }
        return this.pageIndex;
    }

    public boolean isEnablePagingPreRender() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3857716b", new Object[]{this})).booleanValue();
        }
        return this.enablePreRender;
    }

    @Override // com.taobao.android.dinamicx.widget.o
    public int measureSpecForChild(int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7e582946", new Object[]{this, new Integer(i2), new Integer(i3)})).intValue();
        }
        return i3;
    }

    @Override // com.taobao.android.dinamicx.widget.DXScrollerLayout
    public DXLinearLayoutManager newLinearLayoutManager(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXLinearLayoutManager) ipChange.ipc$dispatch("ab4f4def", new Object[]{this, context});
        }
        if (this.allowChildSizeLessThanParent) {
            return new DXLinearLayoutManager(context, getOrientation(), false);
        }
        return new DXScrollLinearLayoutManager(context, getOrientation(), false);
    }

    @Override // com.taobao.android.dinamicx.widget.DXScrollerLayout
    public DXScrollerLayout.ScrollListener newScrollListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXScrollerLayout.ScrollListener) ipChange.ipc$dispatch("748e3cc8", new Object[]{this});
        }
        return new SliderScrollListener(this.isCorrectionSlideOffset_Android, this.avoidIndexDeltaToLarge_Android, this.allowChildSizeLessThanParent);
    }

    @Override // com.taobao.android.dinamicx.widget.o, com.taobao.android.dinamicx.widget.j, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onBeforeBindChildData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92a35092", new Object[]{this});
            return;
        }
        super.onBeforeBindChildData();
        if (isEnablePagingPreRender()) {
            this.dxRecyclerViewCacheExtension = new DXRecyclerViewCacheExtension(getDXRuntimeContext().c());
        } else {
            this.dxRecyclerViewCacheExtension = null;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXScrollerLayout, com.taobao.android.dinamicx.widget.o, tb.exb
    public void onCanPlay(cxb<?, exb> cxbVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74c767ef", new Object[]{this, cxbVar, str});
        } else if (this.ignorePlayControl) {
            cxbVar.g(this, str);
        } else {
            super.onCanPlay(cxbVar, str);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXScrollerLayout, com.taobao.android.dinamicx.widget.o, com.taobao.android.dinamicx.widget.k, com.taobao.android.dinamicx.widget.j, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
            return;
        }
        super.onClone(dXWidgetNode, z);
        if (dXWidgetNode instanceof DXSliderLayout) {
            DXSliderLayout dXSliderLayout = (DXSliderLayout) dXWidgetNode;
            this.isInfinite = dXSliderLayout.isInfinite;
            this.pageIndex = dXSliderLayout.pageIndex;
            this.autoScrollInterval = dXSliderLayout.autoScrollInterval;
            this.autoScroll = dXSliderLayout.autoScroll;
            this.manualSwitchEnabled = dXSliderLayout.manualSwitchEnabled;
            this.disablePageSelectAndstartTimeOnPreRender = dXSliderLayout.disablePageSelectAndstartTimeOnPreRender;
            this.interceptTouchEvent = dXSliderLayout.interceptTouchEvent;
            this.avoidIncessantScroll = dXSliderLayout.avoidIncessantScroll;
            this.isInterceptMultipointTouch = dXSliderLayout.isInterceptMultipointTouch;
            this.avoidIndexDeltaToLarge_Android = dXSliderLayout.avoidIndexDeltaToLarge_Android;
            this.avoidIndexDeltaToLargeFirst_Android = dXSliderLayout.avoidIndexDeltaToLargeFirst_Android;
            this.scrollWithPostMsg = dXSliderLayout.scrollWithPostMsg;
            this.overrideCanScrollHorizontal = dXSliderLayout.overrideCanScrollHorizontal;
            this.isCorrectionSlideOffset_Android = dXSliderLayout.isCorrectionSlideOffset_Android;
            this.isEnableEdgeCheck_Android = dXSliderLayout.isEnableEdgeCheck_Android;
            this.dxRecyclerViewCacheExtension = dXSliderLayout.dxRecyclerViewCacheExtension;
            this.enablePreRender = dXSliderLayout.enablePreRender;
            this.needManualStopLoop = dXSliderLayout.needManualStopLoop;
            this.enableInfinityEdgeCheck = dXSliderLayout.enableInfinityEdgeCheck;
            this.useDefaultScrollFinite = dXSliderLayout.useDefaultScrollFinite;
            this.isCanParentTouchWhenEdge_Android = dXSliderLayout.isCanParentTouchWhenEdge_Android;
            this.ignorePlayControl = dXSliderLayout.ignorePlayControl;
            this.needManualStopLoopOnMove = dXSliderLayout.needManualStopLoopOnMove;
            this.isEnableDetachedStopTimer = dXSliderLayout.isEnableDetachedStopTimer;
            this.allowChildSizeLessThanParent = dXSliderLayout.allowChildSizeLessThanParent;
            this.childWidth = dXSliderLayout.childWidth;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXScrollerLayout, com.taobao.android.dinamicx.widget.k, com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        return new DXNativeAutoLoopRecyclerView(context);
    }

    @Override // com.taobao.android.dinamicx.widget.o, com.taobao.android.dinamicx.widget.k, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onMeasure(int i2, int i3) {
        ArrayList<DXWidgetNode> arrayList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i2), new Integer(i3)});
            return;
        }
        super.onMeasure(i2, i3);
        if (isViewMatrixChanged() && (arrayList = this.itemWidgetNodes) != null && !arrayList.isEmpty()) {
            Iterator<DXWidgetNode> it = this.itemWidgetNodes.iterator();
            while (it.hasNext()) {
                it.next().setViewMatrixChanged(true);
            }
        }
    }

    public void scrollToPageIndex(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb8dfa01", new Object[]{this, new Integer(i2)});
        } else if (getDXRuntimeContext().D() instanceof DXNativeAutoLoopRecyclerView) {
            DXNativeAutoLoopRecyclerView dXNativeAutoLoopRecyclerView = (DXNativeAutoLoopRecyclerView) getDXRuntimeContext().D();
            DXSliderLayout dXSliderLayout = (DXSliderLayout) getDXRuntimeContext().W();
            int calculateTargetIndex = calculateTargetIndex(dXSliderLayout, i2);
            if (dXSliderLayout.isInfinite) {
                jb6.g(new e(dXNativeAutoLoopRecyclerView, calculateTargetIndex));
            } else {
                scrollToIndexOnIsNotInfinite(dXNativeAutoLoopRecyclerView, dXSliderLayout, calculateTargetIndex);
            }
            DXNativeAutoLoopRecyclerView.c onPageChangeListener = dXNativeAutoLoopRecyclerView.getOnPageChangeListener();
            if (!this.disablePageSelectAndstartTimeOnPreRender || !isPreRender()) {
                onPageChangeListener.onPageSelected(calculateTargetIndex);
            }
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXScrollerLayout
    public void setAdapter(DXScrollerLayout dXScrollerLayout, RecyclerView recyclerView, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c19e8ee", new Object[]{this, dXScrollerLayout, recyclerView, context});
            return;
        }
        DXSliderLayout dXSliderLayout = (DXSliderLayout) dXScrollerLayout;
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (!dXSliderLayout.isInfinite) {
            if (adapter instanceof AutoLoopScrollerAdapter) {
                recyclerView.setAdapter(null);
                SliderAdapter sliderAdapter = new SliderAdapter(context, dXScrollerLayout);
                sliderAdapter.setHasStableIds(true);
                sliderAdapter.setDataSource(dXScrollerLayout.itemWidgetNodes);
                recyclerView.setAdapter(sliderAdapter);
            } else if (adapter == null) {
                SliderAdapter sliderAdapter2 = new SliderAdapter(context, dXScrollerLayout);
                sliderAdapter2.setHasStableIds(true);
                sliderAdapter2.setDataSource(dXScrollerLayout.itemWidgetNodes);
                recyclerView.setAdapter(sliderAdapter2);
            } else {
                DXScrollerLayout.ScrollerAdapter scrollerAdapter = (DXScrollerLayout.ScrollerAdapter) recyclerView.getAdapter();
                scrollerAdapter.setDataSource(dXScrollerLayout.itemWidgetNodes);
                scrollerAdapter.setScrollerLayout(dXScrollerLayout);
                if (this.pageIndex == 0) {
                    ((DXNativeRecyclerView) recyclerView).needScrollAfterLayout(0, 0, dXScrollerLayout.contentHorizontalLength, dXScrollerLayout.contentVerticalLength, this.scrollWithPostMsg);
                }
                Parcelable saveInstanceState = ((DXNativeAutoLoopRecyclerView) recyclerView).getSaveInstanceState();
                if (saveInstanceState != null) {
                    recyclerView.getLayoutManager().onRestoreInstanceState(saveInstanceState);
                }
                adapter.notifyDataSetChanged();
            }
            ((DXScrollerLayout.ScrollerAdapter) recyclerView.getAdapter()).setNeedSetLayoutParams(false);
        } else if (adapter instanceof AutoLoopScrollerAdapter) {
            AutoLoopScrollerAdapter autoLoopScrollerAdapter = (AutoLoopScrollerAdapter) adapter;
            autoLoopScrollerAdapter.setDataSource(dXScrollerLayout.itemWidgetNodes);
            autoLoopScrollerAdapter.setScrollerLayout(dXSliderLayout);
            autoLoopScrollerAdapter.notifyDataSetChanged();
        } else {
            AutoLoopScrollerAdapter autoLoopScrollerAdapter2 = new AutoLoopScrollerAdapter(context, dXScrollerLayout);
            autoLoopScrollerAdapter2.setDataSource(dXScrollerLayout.itemWidgetNodes);
            recyclerView.setAdapter(autoLoopScrollerAdapter2);
        }
    }

    public void setInterceptMultipointTouch(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fdf4545", new Object[]{this, new Boolean(z)});
        } else {
            this.isInterceptMultipointTouch = z;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXScrollerLayout
    public void setLayoutManager(Context context, DXScrollerLayout dXScrollerLayout, RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b00aa66", new Object[]{this, context, dXScrollerLayout, recyclerView});
            return;
        }
        super.setLayoutManager(context, dXScrollerLayout, recyclerView);
        if (recyclerView.getLayoutManager() instanceof DXScrollLinearLayoutManager) {
            DXScrollLinearLayoutManager dXScrollLinearLayoutManager = (DXScrollLinearLayoutManager) recyclerView.getLayoutManager();
            if (getOrientation() == 1) {
                dXScrollLinearLayoutManager.A(getHeight());
            } else {
                dXScrollLinearLayoutManager.A(getWidth());
            }
        }
    }

    public void setPageIndex(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e74d6bb", new Object[]{this, new Integer(i2)});
        } else {
            this.pageIndex = i2;
        }
    }

    public void smoothScrollToPosition(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e65f897d", new Object[]{this, new Integer(i2)});
        } else if (getDXRuntimeContext().D() instanceof DXNativeAutoLoopRecyclerView) {
            DXNativeAutoLoopRecyclerView dXNativeAutoLoopRecyclerView = (DXNativeAutoLoopRecyclerView) getDXRuntimeContext().D();
            int calculateTargetIndex = calculateTargetIndex((DXSliderLayout) getDXRuntimeContext().W(), i2);
            jb6.g(new f(dXNativeAutoLoopRecyclerView, calculateTargetIndex));
            DXNativeAutoLoopRecyclerView.c onPageChangeListener = dXNativeAutoLoopRecyclerView.getOnPageChangeListener();
            if (!this.disablePageSelectAndstartTimeOnPreRender || !isPreRender()) {
                onPageChangeListener.onPageSelected(calculateTargetIndex);
            }
        }
    }

    public void stopTimer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b325b6a", new Object[]{this});
        } else if (getDXRuntimeContext().D() instanceof DXNativeAutoLoopRecyclerView) {
            DXNativeAutoLoopRecyclerView dXNativeAutoLoopRecyclerView = (DXNativeAutoLoopRecyclerView) getDXRuntimeContext().D();
            dXNativeAutoLoopRecyclerView.stopTimer();
            dXNativeAutoLoopRecyclerView.setAutoPlay(false);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.o, tb.t8e
    public void stopVideoPlayControl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d6dacb7", new Object[]{this});
            return;
        }
        super.stopVideoPlayControl();
        if (isEnableNestedPlayControl() && this.autoScroll) {
            if (DinamicXEngine.j0()) {
                h36.g(TAG, "stopTimer by stopVideoPlayControl");
            }
            stopTimer();
        }
    }

    @Override // com.taobao.android.dinamicx.widget.o, tb.t8e
    public void triggerVideoPlayControl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e421036d", new Object[]{this});
            return;
        }
        super.triggerVideoPlayControl();
        if (canAutoPlay() && isEnableNestedPlayControl()) {
            if (DinamicXEngine.j0()) {
                h36.g(TAG, "startTimer by triggerVideoPlayControl");
            }
            startTimer();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f7397a;
        public final /* synthetic */ DXScrollerLayout.ScrollListener b;

        public d(int i, DXScrollerLayout.ScrollListener scrollListener) {
            this.f7397a = i;
            this.b = scrollListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            if (this.f7397a == 0) {
                this.b.v(1);
                this.b.t(fzo.SCROLLING);
                this.b.v(0);
            }
            this.b.t(fzo.SCROLLING);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class j implements DXNativeAutoLoopRecyclerView.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final DXSliderLayout f7402a;
        public final int b;
        public final DXPageChangeEvent c = new DXPageChangeEvent(-8975195222378757716L);
        public final DXPageEndDraggingEvent d = new DXPageEndDraggingEvent(DXSliderLayout.DXSLIDERLAYOUT_ONENDDRAGGING);

        static {
            t2o.a(444597387);
            t2o.a(444597161);
        }

        public j(DXSliderLayout dXSliderLayout, int i) {
            this.f7402a = dXSliderLayout;
            this.b = i;
        }

        @Override // com.taobao.android.dinamicx.view.DXNativeAutoLoopRecyclerView.c
        public void a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b3c77251", new Object[]{this, new Integer(i)});
            } else {
                b(i, this.d);
            }
        }

        @Override // com.taobao.android.dinamicx.view.DXNativeAutoLoopRecyclerView.c
        public void onPageSelected(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("184d6f33", new Object[]{this, new Integer(i)});
            } else {
                b(i, this.c);
            }
        }

        public final void b(int i, DXPageChangeEvent dXPageChangeEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e9d7077a", new Object[]{this, new Integer(i), dXPageChangeEvent});
            } else if (this.b == 0) {
                DXRuntimeContext dXRuntimeContext = this.f7402a.getDXRuntimeContext();
                com.taobao.android.dinamicx.f fVar = new com.taobao.android.dinamicx.f(dXRuntimeContext.c());
                fVar.b = dXRuntimeContext.p();
                f.a aVar = new f.a("Engine", "Engine_Render", com.taobao.android.dinamicx.f.DX_ERROR_CODE_SLIDER_LAYOUT_ITEM_COUNT_0);
                aVar.e = "position=" + i;
                fVar.c.add(aVar);
            } else {
                DXRuntimeContext dXRuntimeContext2 = this.f7402a.getDXRuntimeContext();
                if (dXRuntimeContext2 != null) {
                    DXNativeAutoLoopRecyclerView dXNativeAutoLoopRecyclerView = (DXNativeAutoLoopRecyclerView) dXRuntimeContext2.D();
                    WeakReference<View> weakReference = null;
                    if (dXNativeAutoLoopRecyclerView == null) {
                        new com.taobao.android.dinamicx.f(dXRuntimeContext2.c()).b = dXRuntimeContext2.p();
                        f.a aVar2 = new f.a("Engine", "Engine_Render", 200001);
                        aVar2.g = false;
                        DXWidgetNode referenceNode = this.f7402a.getReferenceNode();
                        if (referenceNode != null) {
                            weakReference = referenceNode.getWRView();
                        }
                        StringBuilder sb = new StringBuilder("flattenWidgetNode is");
                        String str = "notNull";
                        sb.append(referenceNode == null ? "null" : str);
                        sb.append("weakReferenceView is");
                        if (weakReference == null) {
                            str = "null";
                        }
                        sb.append(str);
                        aVar2.e = sb.toString();
                        try {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("thread info:");
                            sb2.append(Thread.currentThread().getName());
                            DXWidgetNode W = dXRuntimeContext2.W();
                            if (W != null) {
                                sb2.append("expandedWT != null\n ");
                                if (W.getReferenceNode() == null) {
                                    sb2.append("flatten == null");
                                }
                            } else {
                                sb2.append("expandedWT == null\n ");
                            }
                            StackTraceElement[] stackTrace = new Throwable().getStackTrace();
                            if (stackTrace != null) {
                                for (int i2 = 0; i2 < stackTrace.length; i2++) {
                                    sb2.append(stackTrace[i2].getClassName() + "#" + stackTrace[i2].getMethodName() + " #" + stackTrace[i2].getLineNumber() + "\n");
                                }
                            }
                            la6.b(sb2.toString());
                            aVar2.e += sb2.toString();
                        } finally {
                            try {
                                return;
                            } finally {
                            }
                        }
                        return;
                    }
                    dXNativeAutoLoopRecyclerView.setSaveInstanceState(null);
                    if (DXSliderLayout.access$000(this.f7402a)) {
                        dXPageChangeEvent.setPageIndex(i % this.b, dXNativeAutoLoopRecyclerView.isTouched());
                    } else {
                        dXPageChangeEvent.setPageIndex(i, dXNativeAutoLoopRecyclerView.isTouched());
                    }
                    DXWidgetNode dXWidgetNode = this.f7402a.indicatorWidgetNode;
                    if (dXWidgetNode != null) {
                        dXWidgetNode.postEvent(dXPageChangeEvent);
                    }
                    this.f7402a.setPageIndex(dXPageChangeEvent.pageIndex);
                    this.f7402a.postEvent(dXPageChangeEvent);
                }
            }
        }
    }

    private int calculateTargetIndex(DXSliderLayout dXSliderLayout, int i2) {
        int i3 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cf1e5fee", new Object[]{this, dXSliderLayout, new Integer(i2)})).intValue();
        }
        ArrayList<DXWidgetNode> arrayList = dXSliderLayout.itemWidgetNodes;
        int size = arrayList != null ? arrayList.size() : 0;
        if (!dXSliderLayout.isInfinite || this.enableInfinityEdgeCheck) {
            i3 = i2;
        } else if (size != 0) {
            i3 = ((536870911 / size) * size) + i2;
        }
        la6.d(TAG, TAG, "calculateTargetIndex = " + i3 + ";pageIndex = " + i2 + ";itemCount = " + size);
        return i3;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class SliderScrollListener extends DXScrollerLayout.ScrollListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final boolean m;
        public final boolean n;
        public final boolean o;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ DXNativeAutoLoopRecyclerView f7393a;
            public final /* synthetic */ int b;

            public a(DXNativeAutoLoopRecyclerView dXNativeAutoLoopRecyclerView, int i) {
                this.f7393a = dXNativeAutoLoopRecyclerView;
                this.b = i;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    this.f7393a.scrollToPosition(this.b);
                }
            }
        }

        static {
            t2o.a(444597388);
        }

        public SliderScrollListener(boolean z, boolean z2, boolean z3) {
            this.m = z2;
            this.n = z;
            this.o = z3;
        }

        public static /* synthetic */ Object ipc$super(SliderScrollListener sliderScrollListener, String str, Object... objArr) {
            if (str.hashCode() == 1361287682) {
                super.onScrollStateChanged((RecyclerView) objArr[0], ((Number) objArr[1]).intValue());
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/widget/DXSliderLayout$SliderScrollListener");
        }

        @Override // com.taobao.android.dinamicx.widget.DXScrollerLayout.ScrollListener, androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            int size;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("51239a02", new Object[]{this, recyclerView, new Integer(i)});
                return;
            }
            super.onScrollStateChanged(recyclerView, i);
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
            int findFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
            int findLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
            DXNativeAutoLoopRecyclerView dXNativeAutoLoopRecyclerView = (DXNativeAutoLoopRecyclerView) recyclerView;
            if (i == 0) {
                if (dXNativeAutoLoopRecyclerView.getCurrentIndex() != findFirstVisibleItemPosition && findFirstVisibleItemPosition == findLastVisibleItemPosition) {
                    la6.d(DXSliderLayout.TAG, DXSliderLayout.TAG, "onScrollStateChanged state idle。 currentIndex = " + dXNativeAutoLoopRecyclerView.getCurrentIndex() + ";firstVisiblePosition = " + findFirstVisibleItemPosition + ";delta = " + (findFirstVisibleItemPosition - dXNativeAutoLoopRecyclerView.getCurrentIndex()));
                    dXNativeAutoLoopRecyclerView.setCurrentIndex(findFirstVisibleItemPosition);
                    if (this.m && !jb6.g(new a(dXNativeAutoLoopRecyclerView, findFirstVisibleItemPosition))) {
                        la6.d(DXSliderLayout.TAG, DXSliderLayout.TAG, "onScrollStateChanged state idle scrollToPosition failed, position =  " + findFirstVisibleItemPosition);
                        com.taobao.android.dinamicx.f fVar = new com.taobao.android.dinamicx.f("dinamicx");
                        f.a aVar = new f.a("Render", "RENDER_ERROR", com.taobao.android.dinamicx.f.DX_ERROR_CODE_SLIDER_LAYOUT_IDLE_SCROLL_TO_FAILED);
                        aVar.e = "onScrollStateChanged state idle scrollToPosition failed, position =  " + findFirstVisibleItemPosition;
                        ((ArrayList) fVar.c).add(aVar);
                        ic5.p(fVar);
                    }
                    if (dXNativeAutoLoopRecyclerView.getOnPageChangeListener() != null) {
                        dXNativeAutoLoopRecyclerView.getOnPageChangeListener().onPageSelected(findFirstVisibleItemPosition);
                    }
                    if (r().getOrientation() == 0) {
                        DXScrollerLayout.ScrollListener scrollListener = (DXScrollerLayout.ScrollListener) dXNativeAutoLoopRecyclerView.getTag(DXScrollerLayout.DX_TAG_HAS_SCROLL_LISTENER);
                        int measuredWidth = r().getMeasuredWidth();
                        if (measuredWidth != 0 && scrollListener.g % measuredWidth != 0) {
                            if (scrollListener.r() != null && scrollListener.r().itemWidgetNodes != null && this.n && (size = scrollListener.r().itemWidgetNodes.size()) > 0 && findFirstVisibleItemPosition > 100) {
                                findFirstVisibleItemPosition %= size;
                            }
                            int measuredWidth2 = findFirstVisibleItemPosition * r().getMeasuredWidth();
                            dXNativeAutoLoopRecyclerView.setScrolledX(measuredWidth2);
                            dXNativeAutoLoopRecyclerView.setScrolledY(0);
                            scrollListener.v(measuredWidth2);
                            scrollListener.w(0);
                            u(recyclerView, this.b);
                            t("scroll_end");
                        }
                    }
                } else if (this.n) {
                    int measuredWidth3 = r().getMeasuredWidth();
                    DXScrollerLayout.ScrollListener scrollListener2 = (DXScrollerLayout.ScrollListener) dXNativeAutoLoopRecyclerView.getTag(DXScrollerLayout.DX_TAG_HAS_SCROLL_LISTENER);
                    int i2 = scrollListener2.g;
                    if ((i2 % measuredWidth3 != 0 && findFirstVisibleItemPosition == findLastVisibleItemPosition) || ((i2 / measuredWidth3) % 4 != dXNativeAutoLoopRecyclerView.getCurrentIndex() % 4 && findFirstVisibleItemPosition == findLastVisibleItemPosition)) {
                        int currentIndex = (dXNativeAutoLoopRecyclerView.getCurrentIndex() % 4) * r().getMeasuredWidth();
                        dXNativeAutoLoopRecyclerView.setScrolledX(currentIndex);
                        dXNativeAutoLoopRecyclerView.setScrolledY(0);
                        scrollListener2.v(currentIndex);
                        scrollListener2.w(0);
                        u(recyclerView, this.b);
                        t("scroll_end");
                    }
                } else if (this.o) {
                    int i3 = (findFirstVisibleItemPosition + findLastVisibleItemPosition) / 2;
                    dXNativeAutoLoopRecyclerView.setCurrentIndex(i3);
                    if (dXNativeAutoLoopRecyclerView.getOnPageChangeListener() != null) {
                        if (findLastVisibleItemPosition - findFirstVisibleItemPosition > 1 || findFirstVisibleItemPosition == 0) {
                            dXNativeAutoLoopRecyclerView.getOnPageChangeListener().onPageSelected(i3);
                        } else {
                            dXNativeAutoLoopRecyclerView.getOnPageChangeListener().onPageSelected(findLastVisibleItemPosition);
                        }
                    }
                    u(recyclerView, this.b);
                    t("scroll_end");
                }
            } else if (findFirstVisibleItemPosition == 0 && findLastVisibleItemPosition == 1 && i == 1) {
                la6.d(DXSliderLayout.TAG, DXSliderLayout.TAG, "first = 0 && last = 1 protect index。set current index = " + findFirstVisibleItemPosition);
                dXNativeAutoLoopRecyclerView.setCurrentIndex(findFirstVisibleItemPosition);
                if (dXNativeAutoLoopRecyclerView.getOnPageChangeListener() != null) {
                    dXNativeAutoLoopRecyclerView.getOnPageChangeListener().onPageSelected(findFirstVisibleItemPosition);
                }
            }
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXScrollerLayout, com.taobao.android.dinamicx.widget.o, com.taobao.android.dinamicx.widget.k, com.taobao.android.dinamicx.widget.j, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j2, int i2) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j2), new Integer(i2)});
        } else if (j2 == 2618773720063865426L) {
            if (i2 == 0) {
                z = false;
            }
            this.autoScroll = z;
        } else if (j2 == 5501313022839937951L) {
            this.autoScrollInterval = Math.max(0, i2);
        } else if (j2 == 7816489696776271262L) {
            this.pageIndex = Math.max(0, i2);
        } else if (j2 == -3537170322378136036L) {
            if (i2 == 0) {
                z = false;
            }
            this.isInfinite = z;
        } else if (j2 == DX_SLIDER_LAYOUT_MANUAL_SWITCH_ENABLED) {
            if (i2 == 0) {
                z = false;
            }
            this.manualSwitchEnabled = z;
        } else if (j2 == DXSLIDERLAYOUT_DISABLEPAGESELECTANDSTARTTIMEONPRERENDER) {
            if (i2 == 0) {
                z = false;
            }
            this.disablePageSelectAndstartTimeOnPreRender = z;
        } else if (j2 == DXSLIDERLAYOUT_INTERCEPTTOUCHEVENT) {
            this.interceptTouchEvent = i2;
        } else if (j2 == DXSLIDERLAYOUT_AVOIDINCESSANTSCROLL) {
            if (i2 == 0) {
                z = false;
            }
            this.avoidIncessantScroll = z;
        } else if (j2 == DXSLIDERLAYOUT_AVOIDINDEXDELTATOLARGE_ANDROID) {
            if (i2 == 0) {
                z = false;
            }
            this.avoidIndexDeltaToLarge_Android = z;
        } else if (j2 == DXSLIDERLAYOUT_AVOIDINDEXDELTATOLARGEFIRST_ANDROID) {
            if (i2 == 0) {
                z = false;
            }
            this.avoidIndexDeltaToLargeFirst_Android = z;
        } else if (j2 == DXSLIDERLAYOUT_ISINTERCEPTMULTIPOINTTOUCH) {
            if (i2 == 0) {
                z = false;
            }
            this.isInterceptMultipointTouch = z;
        } else if (j2 == DXSLIDERLAYOUT_SCROLLWITHPOSTMSG) {
            if (i2 == 0) {
                z = false;
            }
            this.scrollWithPostMsg = z;
        } else if (j2 == DXSLIDERLAYOUT_OVERRIDECANSCROLLHORIZONTALLY) {
            if (i2 == 0) {
                z = false;
            }
            this.overrideCanScrollHorizontal = z;
        } else if (j2 == DXSLIDERLAYOUT_ISCORRECTIONSLIDEOFFSET_ANDROID) {
            if (i2 == 0) {
                z = false;
            }
            this.isCorrectionSlideOffset_Android = z;
        } else if (j2 == DXSLIDERLAYOUT_ISENABLEEDGECHECK_ANDROID) {
            if (i2 == 0) {
                z = false;
            }
            this.isEnableEdgeCheck_Android = z;
        } else if (j2 == 6042404229400734461L) {
            if (i2 == 0) {
                z = false;
            }
            this.enablePreRender = z;
        } else if (j2 == DXSLIDERLAYOUT_NEEDMANUALSTOPLOOP) {
            if (i2 == 0) {
                z = false;
            }
            this.needManualStopLoop = z;
        } else if (j2 == DXSLIDERLAYOUT_ENABLEINFINITYEDGECHECK) {
            if (i2 == 0) {
                z = false;
            }
            this.enableInfinityEdgeCheck = z;
        } else if (j2 == DXSLIDERLAYOUT_USERSCROLLTOPOSITIONWHENRENDER_ANDROID) {
            if (i2 == 0) {
                z = false;
            }
            this.useDefaultScrollFinite = z;
        } else if (j2 == DXSLIDERLAYOUT_ISCANPARENTTOUCHWHENEDGE_ANDROID) {
            if (i2 == 0) {
                z = false;
            }
            this.isCanParentTouchWhenEdge_Android = z;
        } else if (j2 == DXSLIDERLAYOUT_IGNOREPLAYCONTROL) {
            if (i2 == 0) {
                z = false;
            }
            this.ignorePlayControl = z;
        } else if (j2 == DXSLIDERLAYOUT_NEEDMANUALSTOPLOOPONMOVE) {
            if (i2 == 0) {
                z = false;
            }
            this.needManualStopLoopOnMove = z;
        } else if (j2 == DXSLIDERLAYOUT_ISENABLEDETACHEDSTOPTIMER_ANDROID) {
            if (i2 == 0) {
                z = false;
            }
            this.isEnableDetachedStopTimer = z;
        } else if (j2 == DXSLIDERLAYOUT_ALLOWCHILDSIZELESSTHANPARENT) {
            if (i2 == 0) {
                z = false;
            }
            this.allowChildSizeLessThanParent = z;
        } else if (j2 == DXSLIDERLAYOUT_CHILDWIDTH) {
            this.childWidth = i2;
        } else {
            super.onSetIntAttribute(j2, i2);
        }
    }

    public void startTimer() {
        DXNativeAutoLoopRecyclerView dXNativeAutoLoopRecyclerView;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edfb8b0a", new Object[]{this});
        } else if ((getDXRuntimeContext().D() instanceof DXNativeAutoLoopRecyclerView) && (dXNativeAutoLoopRecyclerView = (DXNativeAutoLoopRecyclerView) getDXRuntimeContext().D()) != null && this.isInfinite && (i2 = this.autoScrollInterval) > 0 && this.autoScroll && this.scrollEnabled) {
            dXNativeAutoLoopRecyclerView.setInterval(i2);
            dXNativeAutoLoopRecyclerView.setAutoPlay(true);
            if (!this.disablePageSelectAndstartTimeOnPreRender || !isPreRender()) {
                dXNativeAutoLoopRecyclerView.startTimer();
            }
            dXNativeAutoLoopRecyclerView.setTouched(false);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public boolean onEvent(DXEvent dXEvent) {
        DXRootView L;
        DXNativeAutoLoopRecyclerView dXNativeAutoLoopRecyclerView;
        int measuredWidth;
        int scrolledX;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4f22ba48", new Object[]{this, dXEvent})).booleanValue();
        }
        if (super.onEvent(dXEvent) || (L = getDXRuntimeContext().L()) == null) {
            return true;
        }
        if (!L.hasDXRootViewLifeCycle() || (dXNativeAutoLoopRecyclerView = (DXNativeAutoLoopRecyclerView) getDXRuntimeContext().D()) == null) {
            return false;
        }
        dXNativeAutoLoopRecyclerView.setNeedProcessViewLifeCycle(false);
        dXNativeAutoLoopRecyclerView.setEnableDetachedStopTimer(this.isEnableDetachedStopTimer);
        long eventId = dXEvent.getEventId();
        if (5288671110273408574L == eventId) {
            if (dXNativeAutoLoopRecyclerView.canStartPlay()) {
                dXNativeAutoLoopRecyclerView.startTimer();
            }
            if (!dXNativeAutoLoopRecyclerView.isAutoPlay() && getOrientation() == 0 && !dXNativeAutoLoopRecyclerView.isNeedScrollAfterLayout() && (measuredWidth = getMeasuredWidth()) != 0 && (scrolledX = dXNativeAutoLoopRecyclerView.getScrolledX() % measuredWidth) != 0) {
                int measuredWidth2 = getMeasuredWidth() / 2;
                int scrolledX2 = dXNativeAutoLoopRecyclerView.getScrolledX() / measuredWidth;
                if (scrolledX > measuredWidth2) {
                    dXNativeAutoLoopRecyclerView.scrollBy(measuredWidth - scrolledX, 0);
                    scrolledX2++;
                } else {
                    dXNativeAutoLoopRecyclerView.scrollBy(-scrolledX, 0);
                }
                la6.d(TAG, TAG, "onAppear correct index。  oldIndex = " + dXNativeAutoLoopRecyclerView.getCurrentIndex() + ";newIndex = " + scrolledX2 + ";delta = " + (scrolledX2 - dXNativeAutoLoopRecyclerView.getCurrentIndex()));
                dXNativeAutoLoopRecyclerView.setCurrentIndex(scrolledX2);
                if (this.avoidIndexDeltaToLarge_Android && !jb6.g(new c(dXNativeAutoLoopRecyclerView, scrolledX2))) {
                    la6.d(TAG, TAG, "onAppear correct index scrollToPosition failed, position =  " + scrolledX2);
                    com.taobao.android.dinamicx.f fVar = new com.taobao.android.dinamicx.f("dinamicx");
                    f.a aVar = new f.a("Render", "RENDER_ERROR", com.taobao.android.dinamicx.f.DX_ERROR_CODE_SLIDER_LAYOUT_APPEAR_SCROLL_TO_FAILED);
                    aVar.e = "onAppear correct index scrollToPosition failed, position =  " + scrolledX2;
                    ((ArrayList) fVar.c).add(aVar);
                    ic5.p(fVar);
                }
                if (dXNativeAutoLoopRecyclerView.getOnPageChangeListener() != null) {
                    dXNativeAutoLoopRecyclerView.getOnPageChangeListener().onPageSelected(scrolledX2);
                }
                jb6.g(new d(scrolledX2, (DXScrollerLayout.ScrollListener) dXNativeAutoLoopRecyclerView.getTag(DXScrollerLayout.DX_TAG_HAS_SCROLL_LISTENER)));
            }
            return true;
        }
        if (5388973340095122049L == eventId) {
            try {
                dXNativeAutoLoopRecyclerView.stopTimer();
                dXNativeAutoLoopRecyclerView.setSaveInstanceState(dXNativeAutoLoopRecyclerView.getLayoutManager().onSaveInstanceState());
                return true;
            } catch (Throwable th) {
                xv5.b(th);
            }
        }
        return false;
    }

    @Override // com.taobao.android.dinamicx.widget.DXScrollerLayout, com.taobao.android.dinamicx.widget.o, com.taobao.android.dinamicx.widget.k, com.taobao.android.dinamicx.widget.j, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        DXSliderLayout dXSliderLayout;
        int size;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
            return;
        }
        super.onRenderView(context, view);
        if ((view instanceof DXNativeAutoLoopRecyclerView) && (dXSliderLayout = (DXSliderLayout) getDXRuntimeContext().W()) != null) {
            DXNativeAutoLoopRecyclerView dXNativeAutoLoopRecyclerView = (DXNativeAutoLoopRecyclerView) view;
            dXNativeAutoLoopRecyclerView.setOverrideCanScrollHorizontal(this.overrideCanScrollHorizontal);
            dXNativeAutoLoopRecyclerView.setEnableHorizontalEdgeCheck(this.isEnableEdgeCheck_Android);
            dXNativeAutoLoopRecyclerView.setDinamicXEngine(getDXRuntimeContext().s().f());
            dXNativeAutoLoopRecyclerView.setNeedManualStopLoopOnMove(this.needManualStopLoopOnMove);
            dXNativeAutoLoopRecyclerView.setEnabled(getEnabled() == 1);
            dXNativeAutoLoopRecyclerView.setNestedType(this.interceptTouchEvent);
            dXNativeAutoLoopRecyclerView.setInterceptMultipointTouch(this.isInterceptMultipointTouch);
            dXNativeAutoLoopRecyclerView.setIsCanParentTouchWhenEdge_Android(this.isCanParentTouchWhenEdge_Android);
            int calculateTargetIndex = calculateTargetIndex(dXSliderLayout, dXSliderLayout.pageIndex);
            if (dXSliderLayout.getMeasuredWidth() != 0 && getOrientation() == 0 && this.isCorrectionSlideOffset_Android) {
                DXScrollerLayout.ScrollListener scrollListener = (DXScrollerLayout.ScrollListener) dXNativeAutoLoopRecyclerView.getTag(DXScrollerLayout.DX_TAG_HAS_SCROLL_LISTENER);
                int measuredWidth = ((scrollListener == null || scrollListener.r() == null || scrollListener.r().itemWidgetNodes == null || (size = scrollListener.r().itemWidgetNodes.size()) <= 0 || calculateTargetIndex <= 100) ? calculateTargetIndex : calculateTargetIndex % size) * dXSliderLayout.getMeasuredWidth();
                dXNativeAutoLoopRecyclerView.setScrolledX(measuredWidth);
                dXNativeAutoLoopRecyclerView.setScrolledY(0);
                scrollListener.v(measuredWidth);
                scrollListener.w(0);
            }
            DXRootView L = getDXRuntimeContext().L();
            if (L != null) {
                dXNativeAutoLoopRecyclerView.setNeedProcessViewLifeCycle(!L.hasDXRootViewLifeCycle());
                la6.d(TAG, TAG, "onRenderView oldIndex = " + dXNativeAutoLoopRecyclerView.getCurrentIndex() + ";newIndex = " + calculateTargetIndex + ";delta = " + (calculateTargetIndex - dXNativeAutoLoopRecyclerView.getCurrentIndex()));
                dXNativeAutoLoopRecyclerView.setCurrentIndex(calculateTargetIndex);
                DXRecyclerViewCacheExtension.l(dXNativeAutoLoopRecyclerView, this.dxRecyclerViewCacheExtension, calculateTargetIndex);
                if (!dXSliderLayout.isInfinite || this.allowChildSizeLessThanParent) {
                    scrollToIndexOnIsNotInfinite(dXNativeAutoLoopRecyclerView, dXSliderLayout, calculateTargetIndex);
                } else {
                    boolean g2 = jb6.g(new a(dXNativeAutoLoopRecyclerView, calculateTargetIndex));
                    dXNativeAutoLoopRecyclerView.setEnableInfinityEdgeCheck(this.enableInfinityEdgeCheck);
                    if (this.avoidIndexDeltaToLarge_Android && !g2) {
                        la6.d(TAG, TAG, "onRenderView scrollToPosition failed, targetIndex = " + calculateTargetIndex);
                        com.taobao.android.dinamicx.f fVar = new com.taobao.android.dinamicx.f("dinamicx");
                        f.a aVar = new f.a("Render", "RENDER_ERROR", 200003);
                        aVar.e = "onRenderView scrollToPosition failed, targetIndex = " + calculateTargetIndex;
                        ((ArrayList) fVar.c).add(aVar);
                        ic5.p(fVar);
                    }
                }
                ArrayList<DXWidgetNode> arrayList = dXSliderLayout.itemWidgetNodes;
                int size2 = arrayList != null ? arrayList.size() : 0;
                dXNativeAutoLoopRecyclerView.setActualCount(size2);
                j jVar = new j(dXSliderLayout, size2);
                dXNativeAutoLoopRecyclerView.setOnPageChangeListener(jVar);
                if (!this.disablePageSelectAndstartTimeOnPreRender || !isPreRender()) {
                    jVar.onPageSelected(calculateTargetIndex);
                }
                dXNativeAutoLoopRecyclerView.setManualSwitchEnabled(this.manualSwitchEnabled);
                dXNativeAutoLoopRecyclerView.setAvoidIncessantScroll(this.avoidIncessantScroll);
                dXNativeAutoLoopRecyclerView.setAvoidFirstIncessantScroll(this.avoidIndexDeltaToLargeFirst_Android);
                if (dXSliderLayout.canAutoPlay()) {
                    dXNativeAutoLoopRecyclerView.setAutoPlay(true);
                    if (isEnableNestedPlayControl()) {
                        dXNativeAutoLoopRecyclerView.setNeedProcessViewLifeCycle(false);
                        dXNativeAutoLoopRecyclerView.stopTimer();
                    } else {
                        dXNativeAutoLoopRecyclerView.setInterval(dXSliderLayout.autoScrollInterval);
                        if (!this.disablePageSelectAndstartTimeOnPreRender || !isPreRender()) {
                            dXNativeAutoLoopRecyclerView.startTimer();
                        }
                        dXNativeAutoLoopRecyclerView.setNeedProcessViewLifeCycle(true ^ L.hasDXRootViewLifeCycle());
                    }
                    DXWidgetNode dXWidgetNode = this.indicatorWidgetNode;
                    if (dXWidgetNode instanceof n) {
                        ((n) dXWidgetNode).u(this.autoScrollInterval);
                    }
                    dXNativeAutoLoopRecyclerView.setNeedManualStop(this.needManualStopLoop);
                    dXNativeAutoLoopRecyclerView.setTouched(false);
                    dXNativeAutoLoopRecyclerView.setOnAutoLoopTimerListener(new b(size2, dXNativeAutoLoopRecyclerView));
                } else {
                    dXNativeAutoLoopRecyclerView.stopTimer();
                    dXNativeAutoLoopRecyclerView.setAutoPlay(false);
                    dXNativeAutoLoopRecyclerView.setOnAutoLoopTimerListener(null);
                    dXNativeAutoLoopRecyclerView.setIndicator(null);
                }
                setViewMatrixChanged(false);
                if (dXSliderLayout.allowChildSizeLessThanParent) {
                    dXNativeAutoLoopRecyclerView.setAllowChildSizeLessThanParent(this.allowChildSizeLessThanParent);
                    if (this.isInfinite) {
                        ((LinearLayoutManager) dXNativeAutoLoopRecyclerView.getLayoutManager()).scrollToPositionWithOffset(calculateTargetIndex, (-(this.childWidth - dXSliderLayout.getMeasuredWidth())) / 2);
                    } else if (dXNativeAutoLoopRecyclerView.getItemDecorationAt(0) == null) {
                        dXNativeAutoLoopRecyclerView.addItemDecoration(new SliderLayoutSpaceItemDecoration((-(this.childWidth - dXSliderLayout.getMeasuredWidth())) / 2), 0);
                    }
                }
            }
        }
    }
}
