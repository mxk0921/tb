package com.alibaba.triver.triver_shop.container.shopLoft;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.container.shopLoft.ShopContentRecyclerView;
import com.alibaba.triver.triver_shop.container.shopLoft.ShopLoftComponentListAdapter;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.util.List;
import tb.aqp;
import tb.ckf;
import tb.cpp;
import tb.d1a;
import tb.r54;
import tb.t2o;
import tb.xhv;
import tb.xpd;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class ShopLoftComponentView extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private ShopLoftComponentListAdapter adapter;
    private d1a<xhv> closePageCallback;
    private GestureDetector detector;
    private final boolean enableShopLoftLiveCardDisableSwipe;
    private final boolean enableShopLoftSwipeLimit;
    private boolean enableSwipeUpAutoCloseShopLoft;
    private float firstX;
    private float firstY;
    private boolean hasMoveAction;
    private boolean isSettling;
    private boolean lastItemIsLiveCard;
    private LinearLayoutManager manager;
    private ShopContentRecyclerView recyclerView;
    private ShopContentRecyclerView.a swipeToBottomCallback;
    private boolean allowSwipe = true;
    private boolean userCanDrag = true;
    private final int swipeThreshold = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    private boolean hasNext = true;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface a {
        void a();

        void b();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public final class b extends GestureDetector.SimpleOnGestureListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public boolean f2998a;
        public float b;
        public final /* synthetic */ ShopLoftComponentView c;

        static {
            t2o.a(766509172);
        }

        public b(ShopLoftComponentView shopLoftComponentView) {
            ckf.g(shopLoftComponentView, "this$0");
            this.c = shopLoftComponentView;
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            if (str.hashCode() == 307521857) {
                return new Boolean(super.onScroll((MotionEvent) objArr[0], (MotionEvent) objArr[1], ((Number) objArr[2]).floatValue(), ((Number) objArr[3]).floatValue()));
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/container/shopLoft/ShopLoftComponentView$Gesture");
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("12546941", new Object[]{this, motionEvent, motionEvent2, new Float(f), new Float(f2)})).booleanValue();
            }
            ckf.g(motionEvent, "e1");
            ckf.g(motionEvent2, "e2");
            if (!ShopLoftComponentView.access$getAllowSwipe$p(this.c)) {
                return false;
            }
            ShopContentRecyclerView recyclerView = this.c.getRecyclerView();
            if (recyclerView == null) {
                return super.onScroll(motionEvent, motionEvent2, f, f2);
            }
            if ((this.c.getLastItemIsLiveCard() && this.c.getEnableShopLoftLiveCardDisableSwipe()) || !recyclerView.isSlideToBottom() || this.c.getHasNext()) {
                return false;
            }
            if (!this.f2998a && Math.abs(f2) > Math.abs(f)) {
                this.f2998a = true;
            }
            if (!this.f2998a) {
                return false;
            }
            float translationY = recyclerView.getTranslationY() - f2;
            if (translationY > 0.0f) {
                translationY = 0.0f;
            }
            recyclerView.setTranslationY(translationY);
            this.b = translationY;
            float abs = 1 - (Math.abs(translationY) / 900.0f);
            if (abs < 0.6f) {
                abs = 0.6f;
            }
            this.c.setAlpha(abs);
            if (Math.abs(this.b) > 900.0f) {
                a();
            }
            return true;
        }

        public final void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d237c2f7", new Object[]{this});
                return;
            }
            if (this.f2998a) {
                if (Math.abs(this.b) > 900.0f && (this.c.getContext() instanceof Activity) && this.c.getEnableSwipeUpAutoCloseShopLoft()) {
                    d1a<xhv> closePageCallback = this.c.getClosePageCallback();
                    if (closePageCallback != null) {
                        closePageCallback.invoke();
                    }
                    Context context = this.c.getContext();
                    if (context != null) {
                        ((Activity) context).finish();
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type android.app.Activity");
                    }
                }
                ShopContentRecyclerView recyclerView = this.c.getRecyclerView();
                if (recyclerView != null) {
                    recyclerView.setTranslationY(0.0f);
                }
                this.b = 0.0f;
            }
            this.c.setAlpha(1.0f);
            this.f2998a = false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public final class c extends GestureDetector {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final b f2999a;

        static {
            t2o.a(766509173);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ShopLoftComponentView shopLoftComponentView, Context context, b bVar) {
            super(context, bVar);
            ckf.g(shopLoftComponentView, "this$0");
            ckf.g(context, "context");
            ckf.g(bVar, "gestureListener");
            this.f2999a = bVar;
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            if (str.hashCode() == -1447998406) {
                return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/container/shopLoft/ShopLoftComponentView$GestureProcessor");
        }

        @Override // android.view.GestureDetector
        public boolean onTouchEvent(MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
            }
            ckf.g(motionEvent, "ev");
            if (motionEvent.getAction() == 1) {
                this.f2999a.a();
            }
            return super.onTouchEvent(motionEvent);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public final class d implements a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ShopLoftComponentView f3000a;

        static {
            t2o.a(766509174);
            t2o.a(766509171);
        }

        public d(ShopLoftComponentView shopLoftComponentView) {
            ckf.g(shopLoftComponentView, "this$0");
            this.f3000a = shopLoftComponentView;
        }

        @Override // com.alibaba.triver.triver_shop.container.shopLoft.ShopLoftComponentView.a
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("639cb578", new Object[]{this});
            } else {
                ShopLoftComponentView.access$setAllowSwipe$p(this.f3000a, true);
            }
        }

        @Override // com.alibaba.triver.triver_shop.container.shopLoft.ShopLoftComponentView.a
        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c85c2986", new Object[]{this});
            } else {
                ShopLoftComponentView.access$setAllowSwipe$p(this.f3000a, false);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ShopContentRecyclerView.a swipeToBottomCallback;
            List<JSONObject> dataList;
            int i = 0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            ShopContentRecyclerView recyclerView = ShopLoftComponentView.this.getRecyclerView();
            if (recyclerView != null) {
                recyclerView.notifyPositionChanged();
            }
            ShopLoftComponentListAdapter access$getAdapter$p = ShopLoftComponentView.access$getAdapter$p(ShopLoftComponentView.this);
            if (!(access$getAdapter$p == null || (dataList = access$getAdapter$p.getDataList()) == null)) {
                i = dataList.size();
            }
            if (i > 1) {
                return;
            }
            if (ShopLoftComponentView.this.getHasNext()) {
                ShopContentRecyclerView recyclerView2 = ShopLoftComponentView.this.getRecyclerView();
                if (recyclerView2 != null && (swipeToBottomCallback = recyclerView2.getSwipeToBottomCallback()) != null) {
                    swipeToBottomCallback.a();
                    return;
                }
                return;
            }
            Context context = ShopLoftComponentView.this.getContext();
            ckf.f(context, "context");
            r54.Z(context);
        }
    }

    static {
        t2o.a(766509170);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopLoftComponentView(Context context) {
        super(context);
        ckf.g(context, "context");
        aqp.a aVar = aqp.Companion;
        this.enableShopLoftSwipeLimit = aVar.i0();
        this.enableShopLoftLiveCardDisableSwipe = aVar.h0();
    }

    public static final /* synthetic */ ShopLoftComponentListAdapter access$getAdapter$p(ShopLoftComponentView shopLoftComponentView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShopLoftComponentListAdapter) ipChange.ipc$dispatch("b16b430c", new Object[]{shopLoftComponentView});
        }
        return shopLoftComponentView.adapter;
    }

    public static final /* synthetic */ boolean access$getAllowSwipe$p(ShopLoftComponentView shopLoftComponentView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("63a8b4a2", new Object[]{shopLoftComponentView})).booleanValue();
        }
        return shopLoftComponentView.allowSwipe;
    }

    public static final /* synthetic */ boolean access$getEnableShopLoftSwipeLimit$p(ShopLoftComponentView shopLoftComponentView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7c8acc8", new Object[]{shopLoftComponentView})).booleanValue();
        }
        return shopLoftComponentView.enableShopLoftSwipeLimit;
    }

    public static final /* synthetic */ void access$onUserDragFinish(ShopLoftComponentView shopLoftComponentView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47b0da80", new Object[]{shopLoftComponentView});
        } else {
            shopLoftComponentView.onUserDragFinish();
        }
    }

    public static final /* synthetic */ void access$setAllowSwipe$p(ShopLoftComponentView shopLoftComponentView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d576e802", new Object[]{shopLoftComponentView, new Boolean(z)});
        } else {
            shopLoftComponentView.allowSwipe = z;
        }
    }

    public static final /* synthetic */ void access$setSettling$p(ShopLoftComponentView shopLoftComponentView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3d6a059", new Object[]{shopLoftComponentView, new Boolean(z)});
        } else {
            shopLoftComponentView.isSettling = z;
        }
    }

    public static final /* synthetic */ void access$setUserCanDrag$p(ShopLoftComponentView shopLoftComponentView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18767426", new Object[]{shopLoftComponentView, new Boolean(z)});
        } else {
            shopLoftComponentView.userCanDrag = z;
        }
    }

    private final void clearTouchEventRecordStatus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6b4bf92", new Object[]{this});
            return;
        }
        this.hasMoveAction = false;
        this.firstX = 0.0f;
        this.firstY = 0.0f;
    }

    public static /* synthetic */ Object ipc$super(ShopLoftComponentView shopLoftComponentView, String str, Object... objArr) {
        if (str.hashCode() == 2075560917) {
            return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/container/shopLoft/ShopLoftComponentView");
    }

    private final void onUserDragFinish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("145b10d8", new Object[]{this});
            return;
        }
        this.userCanDrag = false;
        r54.E(new ShopLoftComponentView$onUserDragFinish$1(this), 800L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0037, code lost:
        if (r3 != 3) goto L_0x007f;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean dispatchTouchEvent(android.view.MotionEvent r9) {
        /*
            r8 = this;
            r0 = 1
            r1 = 0
            r2 = 2
            com.android.alibaba.ip.runtime.IpChange r3 = com.alibaba.triver.triver_shop.container.shopLoft.ShopLoftComponentView.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x001c
            java.lang.String r4 = "7bb68bd5"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r8
            r2[r0] = r9
            java.lang.Object r9 = r3.ipc$dispatch(r4, r2)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            return r9
        L_0x001c:
            if (r9 != 0) goto L_0x001f
            return r1
        L_0x001f:
            boolean r3 = r8.enableShopLoftSwipeLimit
            if (r3 == 0) goto L_0x007f
            boolean r3 = r8.isSettling
            if (r3 == 0) goto L_0x0028
            return r1
        L_0x0028:
            boolean r3 = r8.userCanDrag
            if (r3 != 0) goto L_0x007f
            int r3 = r9.getAction()
            if (r3 == 0) goto L_0x0070
            if (r3 == r0) goto L_0x003d
            if (r3 == r2) goto L_0x003a
            r0 = 3
            if (r3 == r0) goto L_0x0070
            goto L_0x007f
        L_0x003a:
            r8.hasMoveAction = r0
            return r1
        L_0x003d:
            float r0 = r8.firstX
            float r2 = r9.getX()
            float r0 = r0 - r2
            double r2 = (double) r0
            double r2 = java.lang.Math.abs(r2)
            r4 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r2 = java.lang.Math.pow(r2, r4)
            float r0 = r8.firstY
            float r6 = r9.getY()
            float r0 = r0 - r6
            double r6 = (double) r0
            double r6 = java.lang.Math.abs(r6)
            double r4 = java.lang.Math.pow(r6, r4)
            double r2 = r2 + r4
            double r2 = java.lang.Math.sqrt(r2)
            boolean r0 = r8.hasMoveAction
            if (r0 == 0) goto L_0x007f
            int r0 = r8.swipeThreshold
            double r4 = (double) r0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x007f
            return r1
        L_0x0070:
            r8.clearTouchEventRecordStatus()
            float r0 = r9.getX()
            r8.firstX = r0
            float r0 = r9.getY()
            r8.firstY = r0
        L_0x007f:
            android.view.GestureDetector r0 = r8.detector
            if (r0 == 0) goto L_0x008b
            r0.onTouchEvent(r9)
            boolean r9 = super.dispatchTouchEvent(r9)
            return r9
        L_0x008b:
            java.lang.String r9 = "detector"
            tb.ckf.y(r9)
            r9 = 0
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.triver.triver_shop.container.shopLoft.ShopLoftComponentView.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public final d1a<xhv> getClosePageCallback() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d1a) ipChange.ipc$dispatch("21adabc0", new Object[]{this});
        }
        return this.closePageCallback;
    }

    public final boolean getEnableShopLoftLiveCardDisableSwipe() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f1ca6059", new Object[]{this})).booleanValue();
        }
        return this.enableShopLoftLiveCardDisableSwipe;
    }

    public final boolean getEnableSwipeUpAutoCloseShopLoft() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("df380b7f", new Object[]{this})).booleanValue();
        }
        return this.enableSwipeUpAutoCloseShopLoft;
    }

    public final boolean getHasNext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9ff6182", new Object[]{this})).booleanValue();
        }
        return this.hasNext;
    }

    public final boolean getLastItemIsLiveCard() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e69c910", new Object[]{this})).booleanValue();
        }
        return this.lastItemIsLiveCard;
    }

    public final ShopContentRecyclerView getRecyclerView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShopContentRecyclerView) ipChange.ipc$dispatch("633f9b9d", new Object[]{this});
        }
        return this.recyclerView;
    }

    public final void init() {
        xpd.a X;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
        } else if (this.adapter != null) {
            View inflate = LayoutInflater.from(getContext()).inflate(R.layout.view_shop_loft_component_view, (ViewGroup) null);
            ckf.f(inflate, "from(context).inflate(R.layout.view_shop_loft_component_view, null)");
            addView(inflate);
            ShopContentRecyclerView shopContentRecyclerView = (ShopContentRecyclerView) inflate.findViewById(R.id.shopLoftContentList);
            this.recyclerView = shopContentRecyclerView;
            if (shopContentRecyclerView != null) {
                ShopLoftComponentListAdapter shopLoftComponentListAdapter = this.adapter;
                ckf.d(shopLoftComponentListAdapter);
                shopContentRecyclerView.setSwipeToItemCallback(shopLoftComponentListAdapter.Z());
            }
            ShopContentRecyclerView shopContentRecyclerView2 = this.recyclerView;
            if (shopContentRecyclerView2 != null) {
                shopContentRecyclerView2.setSwipeToBottomCallback(this.swipeToBottomCallback);
            }
            final Context context = getContext();
            LinearLayoutManager shopLoftComponentView$init$1 = new LinearLayoutManager(context) { // from class: com.alibaba.triver.triver_shop.container.shopLoft.ShopLoftComponentView$init$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(ShopLoftComponentView$init$1 shopLoftComponentView$init$12, String str, Object... objArr) {
                    if (str.hashCode() == 514551467) {
                        return new Boolean(super.canScrollVertically());
                    }
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/container/shopLoft/ShopLoftComponentView$init$1");
                }

                @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
                public boolean canScrollVertically() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("1eab6eab", new Object[]{this})).booleanValue();
                    }
                    if (!ShopLoftComponentView.access$getAllowSwipe$p(ShopLoftComponentView.this) || !super.canScrollVertically()) {
                        return false;
                    }
                    return true;
                }
            };
            this.manager = shopLoftComponentView$init$1;
            ShopContentRecyclerView shopContentRecyclerView3 = this.recyclerView;
            if (shopContentRecyclerView3 != null) {
                shopContentRecyclerView3.setLayoutManager(shopLoftComponentView$init$1);
            }
            ShopContentRecyclerView shopContentRecyclerView4 = this.recyclerView;
            if (shopContentRecyclerView4 != null) {
                shopContentRecyclerView4.setAdapter(this.adapter);
            }
            Context context2 = getContext();
            ckf.f(context2, "this.context");
            this.detector = new c(this, context2, new b(this));
            ShopContentRecyclerView shopContentRecyclerView5 = this.recyclerView;
            if (shopContentRecyclerView5 != null) {
                shopContentRecyclerView5.addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: com.alibaba.triver.triver_shop.container.shopLoft.ShopLoftComponentView$init$2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    /* renamed from: a  reason: collision with root package name */
                    public int f3003a;

                    public static /* synthetic */ Object ipc$super(ShopLoftComponentView$init$2 shopLoftComponentView$init$2, String str, Object... objArr) {
                        str.hashCode();
                        int hashCode = str.hashCode();
                        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/container/shopLoft/ShopLoftComponentView$init$2");
                    }

                    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
                    public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("51239a02", new Object[]{this, recyclerView, new Integer(i)});
                        } else if (ShopLoftComponentView.access$getEnableShopLoftSwipeLimit$p(ShopLoftComponentView.this)) {
                            int i2 = this.f3003a;
                            this.f3003a = i;
                            if (i == 2) {
                                ShopLoftComponentView.access$setSettling$p(ShopLoftComponentView.this, true);
                                return;
                            }
                            ShopLoftComponentView.access$setSettling$p(ShopLoftComponentView.this, false);
                            if (i2 == 1 && i != i2) {
                                ShopLoftComponentView.access$onUserDragFinish(ShopLoftComponentView.this);
                            }
                        }
                    }
                });
            }
            ShopLoftComponentListAdapter shopLoftComponentListAdapter2 = this.adapter;
            if (shopLoftComponentListAdapter2 != null && (X = shopLoftComponentListAdapter2.X()) != null) {
                cpp cppVar = new cpp();
                cppVar.g(new ShopLoftComponentView$init$3$1(this));
                cppVar.h(new ShopLoftComponentView$init$3$2(this));
                xhv xhvVar = xhv.INSTANCE;
                X.c("shopLoftFeedsController", cppVar);
            }
        }
    }

    public final void onDestroyed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf354a81", new Object[]{this});
            return;
        }
        ShopLoftComponentListAdapter shopLoftComponentListAdapter = this.adapter;
        if (shopLoftComponentListAdapter != null) {
            shopLoftComponentListAdapter.f0();
        }
    }

    public final void onLoadNewData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc8f444c", new Object[]{this});
            return;
        }
        ShopContentRecyclerView shopContentRecyclerView = this.recyclerView;
        if (shopContentRecyclerView != null) {
            shopContentRecyclerView.scrollBy(0, 1);
        }
        ShopContentRecyclerView shopContentRecyclerView2 = this.recyclerView;
        if (shopContentRecyclerView2 != null) {
            shopContentRecyclerView2.scrollBy(0, -1);
        }
        r54.F(new ShopLoftComponentView$onLoadNewData$1(this));
    }

    public final void removeCurrentItem() {
        ShopLoftComponentListAdapter.ShopLoftItemViewHolder W;
        List<JSONObject> dataList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("899dfd8f", new Object[]{this});
            return;
        }
        ShopLoftComponentListAdapter shopLoftComponentListAdapter = this.adapter;
        if (shopLoftComponentListAdapter != null && (W = shopLoftComponentListAdapter.W()) != null) {
            ShopLoftComponentListAdapter shopLoftComponentListAdapter2 = this.adapter;
            if (!(shopLoftComponentListAdapter2 == null || (dataList = shopLoftComponentListAdapter2.getDataList()) == null)) {
                dataList.remove(W.getAdapterPosition());
            }
            ShopLoftComponentListAdapter shopLoftComponentListAdapter3 = this.adapter;
            if (shopLoftComponentListAdapter3 != null) {
                shopLoftComponentListAdapter3.notifyItemRemoved(W.getAdapterPosition());
            }
            ShopContentRecyclerView recyclerView = getRecyclerView();
            if (recyclerView != null) {
                recyclerView.post(new e());
            }
        }
    }

    public final void scrollToNextItem() {
        ShopLoftComponentListAdapter.ShopLoftItemViewHolder W;
        ShopContentRecyclerView recyclerView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4a75475", new Object[]{this});
            return;
        }
        ShopLoftComponentListAdapter shopLoftComponentListAdapter = this.adapter;
        if (shopLoftComponentListAdapter != null && (W = shopLoftComponentListAdapter.W()) != null) {
            int adapterPosition = W.getAdapterPosition();
            ShopLoftComponentListAdapter shopLoftComponentListAdapter2 = this.adapter;
            ckf.d(shopLoftComponentListAdapter2);
            if (adapterPosition < shopLoftComponentListAdapter2.getItemCount() - 1 && (recyclerView = getRecyclerView()) != null) {
                recyclerView.smoothScrollToPosition(W.getAdapterPosition() + 1);
            }
        }
    }

    public final void setAdapter(ShopLoftComponentListAdapter shopLoftComponentListAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("442003b6", new Object[]{this, shopLoftComponentListAdapter});
            return;
        }
        ckf.g(shopLoftComponentListAdapter, "adapter");
        this.adapter = shopLoftComponentListAdapter;
        shopLoftComponentListAdapter.h0(new d(this));
    }

    public final void setClosePageCallback(d1a<xhv> d1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7fcdeb8", new Object[]{this, d1aVar});
        } else {
            this.closePageCallback = d1aVar;
        }
    }

    public final void setEnableSwipeUpAutoCloseShopLoft(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97a96e2d", new Object[]{this, new Boolean(z)});
        } else {
            this.enableSwipeUpAutoCloseShopLoft = z;
        }
    }

    public final void setHasNext(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c367c22", new Object[]{this, new Boolean(z)});
        } else {
            this.hasNext = z;
        }
    }

    public final void setLastItemIsLiveCard(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4fff0bc", new Object[]{this, new Boolean(z)});
        } else {
            this.lastItemIsLiveCard = z;
        }
    }

    public final void setRecyclerView(ShopContentRecyclerView shopContentRecyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdfbd3bf", new Object[]{this, shopContentRecyclerView});
        } else {
            this.recyclerView = shopContentRecyclerView;
        }
    }

    public final void setSwipeToBottomCallback(ShopContentRecyclerView.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b2e3a00", new Object[]{this, aVar});
        } else {
            this.swipeToBottomCallback = aVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopLoftComponentView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ckf.g(context, "context");
        aqp.a aVar = aqp.Companion;
        this.enableShopLoftSwipeLimit = aVar.i0();
        this.enableShopLoftLiveCardDisableSwipe = aVar.h0();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopLoftComponentView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ckf.g(context, "context");
        aqp.a aVar = aqp.Companion;
        this.enableShopLoftSwipeLimit = aVar.i0();
        this.enableShopLoftLiveCardDisableSwipe = aVar.h0();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopLoftComponentView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        ckf.g(context, "context");
        aqp.a aVar = aqp.Companion;
        this.enableShopLoftSwipeLimit = aVar.i0();
        this.enableShopLoftLiveCardDisableSwipe = aVar.h0();
    }
}
