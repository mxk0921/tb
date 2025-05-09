package com.taobao.tao.flexbox.layoutmanager.component;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.ViewAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.ac.d;
import com.taobao.tao.flexbox.layoutmanager.core.Component;
import com.taobao.tao.flexbox.layoutmanager.core.j;
import com.taobao.tao.flexbox.layoutmanager.core.n;
import com.taobao.taobao.R;
import com.taobao.weex.common.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.akt;
import tb.hk8;
import tb.jfw;
import tb.nwv;
import tb.ol4;
import tb.sxo;
import tb.t2o;
import tb.tfs;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class SliderComponent extends Component<ViewGroup, b> implements j, sxo, ol4 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int ANIMATION_DURATION = 300;
    private static final String DIRECTION_BOTTOM_TO_TOP = "up";
    private static final String DIRECTION_LEFT_TO_RIGHT = "right";
    private static final String DIRECTION_RIGHT_TO_LEFT = "left";
    private static final String DIRECTION_TOP_TO_BOTTOM = "down";
    private static final String MODE_MULTI = "multi";
    private static final String MODE_SINGLE = "single";
    private static final int UNSET = -1;
    private boolean mLastAutoPlay;
    private boolean pausedByElementCall;
    private Handler handler = new Handler(Looper.getMainLooper());
    private Runnable showNext = new a();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class MultiSlideRecyclerView extends RecyclerView {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private static final int ITEM_COUNT = 0;
        private RecyclerViewAdapter adapter;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class LocalLinearLayoutManager extends LinearLayoutManager {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public float f12098a = 100.0f;
            public RecyclerView b;

            static {
                t2o.a(503316838);
            }

            public LocalLinearLayoutManager(Context context) {
                super(context);
                z(context);
            }

            public static /* synthetic */ Object ipc$super(LocalLinearLayoutManager localLinearLayoutManager, String str, Object... objArr) {
                int hashCode = str.hashCode();
                if (hashCode == -1078087916) {
                    super.offsetChildrenVertical(((Number) objArr[0]).intValue());
                    return null;
                } else if (hashCode == 1027840325) {
                    super.onLayoutChildren((RecyclerView.Recycler) objArr[0], (RecyclerView.State) objArr[1]);
                    return null;
                } else if (hashCode == 1769978169) {
                    super.layoutDecoratedWithMargins((View) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue());
                    return null;
                } else {
                    int hashCode2 = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/tao/flexbox/layoutmanager/component/SliderComponent$MultiSlideRecyclerView$LocalLinearLayoutManager");
                }
            }

            public static /* synthetic */ float y(LocalLinearLayoutManager localLinearLayoutManager) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Number) ipChange.ipc$dispatch("935331ad", new Object[]{localLinearLayoutManager})).floatValue();
                }
                return localLinearLayoutManager.f12098a;
            }

            @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
            public void layoutDecoratedWithMargins(View view, int i, int i2, int i3, int i4) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("697fb939", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
                    return;
                }
                super.layoutDecoratedWithMargins(view, i, i2, i3, i4);
                this.b = (RecyclerView) view.getParent();
            }

            @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
            public void offsetChildrenVertical(int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("bfbdaf14", new Object[]{this, new Integer(i)});
                    return;
                }
                super.offsetChildrenVertical(i);
                RecyclerView recyclerView = this.b;
                if (recyclerView != null) {
                    int childCount = recyclerView.getChildCount();
                    for (int i2 = 0; i2 < childCount; i2++) {
                        View childAt = this.b.getChildAt(i2);
                        int top = childAt.getTop();
                        int bottom = childAt.getBottom();
                        int i3 = bottom - top;
                        int height = getHeight();
                        if (i3 > 0) {
                            if (top < i3) {
                                if (top < 0) {
                                    childAt.setAlpha(0.0f);
                                } else {
                                    childAt.setAlpha((top * 1.0f) / i3);
                                }
                            } else if (bottom > height) {
                                childAt.setAlpha(((height * 1.0f) - top) / i3);
                            } else {
                                childAt.setAlpha(1.0f);
                            }
                        }
                    }
                }
            }

            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("3d439945", new Object[]{this, recycler, state});
                    return;
                }
                try {
                    super.onLayoutChildren(recycler, state);
                } catch (Exception e) {
                    tfs.e("LocalLinearLayoutManager", e.getMessage());
                }
            }

            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i) {
                String str;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("a873752a", new Object[]{this, recyclerView, state, new Integer(i)});
                    return;
                }
                int size = ((ArrayList) SliderComponent.access$1800(SliderComponent.this).d).size();
                if (i >= 0 && i < size) {
                    n nVar = (n) ((ArrayList) SliderComponent.access$1900(SliderComponent.this).d).get(i);
                    if (!(nVar == null || nVar.K() == null)) {
                        this.f12098a = nVar.S().b + nVar.K().getViewParams().m + nVar.K().getViewParams().n;
                    }
                    LinearSmoothScroller linearSmoothScroller = new LinearSmoothScroller(recyclerView.getContext()) { // from class: com.taobao.tao.flexbox.layoutmanager.component.SliderComponent.MultiSlideRecyclerView.LocalLinearLayoutManager.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str2, Object... objArr) {
                            str2.hashCode();
                            int hashCode = str2.hashCode();
                            throw new InstantReloadException("String switch could not find '" + str2 + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/component/SliderComponent$MultiSlideRecyclerView$LocalLinearLayoutManager$1");
                        }

                        @Override // androidx.recyclerview.widget.LinearSmoothScroller
                        public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                return ((Number) ipChange2.ipc$dispatch("bbeb1cb2", new Object[]{this, displayMetrics})).floatValue();
                            }
                            return (((b) SliderComponent.access$2000(SliderComponent.this)).x0 * 0.3356f) / LocalLinearLayoutManager.y(LocalLinearLayoutManager.this);
                        }
                    };
                    linearSmoothScroller.setTargetPosition(i);
                    startSmoothScroll(linearSmoothScroller);
                    if (nVar != null && (str = (String) nVar.H("onwillappear")) != null) {
                        HashMap hashMap = new HashMap();
                        hashMap.put("index", Integer.valueOf(i));
                        SliderComponent.this.sendMessage(130, nVar, "onwillappear", str, hashMap, null);
                    }
                }
            }

            public final void z(Context context) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class RecyclerViewAdapter extends RecyclerView.Adapter {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* compiled from: Taobao */
            /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
            public class RecyclerViewHolder extends RecyclerView.ViewHolder {
                static {
                    t2o.a(503316841);
                }

                public RecyclerViewHolder(RecyclerViewAdapter recyclerViewAdapter, View view) {
                    super(view);
                }
            }

            static {
                t2o.a(503316840);
            }

            public RecyclerViewAdapter() {
            }

            public static /* synthetic */ Object ipc$super(RecyclerViewAdapter recyclerViewAdapter, String str, Object... objArr) {
                if (str.hashCode() == 143764512) {
                    super.onViewRecycled((RecyclerView.ViewHolder) objArr[0]);
                    return null;
                }
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/component/SliderComponent$MultiSlideRecyclerView$RecyclerViewAdapter");
            }

            public final FrameLayout.LayoutParams M(n nVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (FrameLayout.LayoutParams) ipChange.ipc$dispatch("f65a3904", new Object[]{this, nVar});
                }
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, nVar.S().b);
                jfw viewParams = nVar.K().getViewParams();
                layoutParams.topMargin = viewParams.m;
                layoutParams.bottomMargin = viewParams.n;
                layoutParams.leftMargin = viewParams.k;
                layoutParams.rightMargin = viewParams.l;
                return layoutParams;
            }

            public n N(int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (n) ipChange.ipc$dispatch("e662b913", new Object[]{this, new Integer(i)});
                }
                if (i >= 0 && i < ((ArrayList) SliderComponent.access$2300(SliderComponent.this).d).size()) {
                    return (n) ((ArrayList) SliderComponent.access$2400(SliderComponent.this).d).get(i);
                }
                return null;
            }

            @Override // androidx.recyclerview.widget.RecyclerView.Adapter
            public int getItemCount() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue();
                }
                return ((ArrayList) SliderComponent.access$2200(SliderComponent.this).d).size();
            }

            @Override // androidx.recyclerview.widget.RecyclerView.Adapter
            public int getItemViewType(int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Number) ipChange.ipc$dispatch("65c98627", new Object[]{this, new Integer(i)})).intValue();
                }
                return 0;
            }

            @Override // androidx.recyclerview.widget.RecyclerView.Adapter
            public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List list) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5ee143bc", new Object[]{this, viewHolder, new Integer(i), list});
                } else {
                    onBindViewHolder(viewHolder, i);
                }
            }

            @Override // androidx.recyclerview.widget.RecyclerView.Adapter
            public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (RecyclerView.ViewHolder) ipChange.ipc$dispatch("9e3c0169", new Object[]{this, viewGroup, new Integer(i)});
                }
                return new RecyclerViewHolder(this, new FrameLayout(viewGroup.getContext()));
            }

            @Override // androidx.recyclerview.widget.RecyclerView.Adapter
            public void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("891ac20", new Object[]{this, viewHolder});
                    return;
                }
                super.onViewRecycled(viewHolder);
                n nVar = (n) viewHolder.itemView.getTag(R.id.layout_manager_cell_tag_id);
                if (nVar != null) {
                    nVar.n(false);
                }
            }

            @Override // androidx.recyclerview.widget.RecyclerView.Adapter
            public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
                n N;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("aa17accb", new Object[]{this, viewHolder, new Integer(i)});
                    return;
                }
                FrameLayout frameLayout = (FrameLayout) viewHolder.itemView;
                frameLayout.removeAllViews();
                if (i >= 0 && (N = N(i)) != null) {
                    try {
                        if (N.D0()) {
                            N.K0();
                        }
                        if (!N.A0() || N.F0()) {
                            N.b1(frameLayout.getContext());
                        }
                        ViewParent parent = N.w0().getParent();
                        if (parent != null) {
                            ((ViewGroup) parent).removeView(N.w0());
                        }
                        frameLayout.addView(N.w0(), M(N));
                        frameLayout.setTag(R.id.layout_manager_cell_tag_id, N);
                        Component K = N.K();
                        frameLayout.setLayoutParams(new RecyclerView.LayoutParams(-1, N.S().b + K.getViewParams().m + K.getViewParams().n));
                    } catch (Exception e) {
                        tfs.e("TNode", e.getMessage());
                    }
                }
            }
        }

        static {
            t2o.a(503316837);
        }

        public MultiSlideRecyclerView(Context context) {
            super(context);
            setLayoutManager(new LocalLinearLayoutManager(context));
            RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter();
            this.adapter = recyclerViewAdapter;
            setAdapter(recyclerViewAdapter);
        }

        public static /* synthetic */ Object ipc$super(MultiSlideRecyclerView multiSlideRecyclerView, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == 949399698) {
                super.onDetachedFromWindow();
                return null;
            } else if (hashCode == 1626033557) {
                super.onAttachedToWindow();
                return null;
            } else {
                int hashCode2 = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/tao/flexbox/layoutmanager/component/SliderComponent$MultiSlideRecyclerView");
            }
        }

        public int getCurrentPosition() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("b656e206", new Object[]{this})).intValue();
            }
            int findLastCompletelyVisibleItemPosition = ((LinearLayoutManager) getLayoutManager()).findLastCompletelyVisibleItemPosition();
            if (findLastCompletelyVisibleItemPosition < 0) {
                return 0;
            }
            return findLastCompletelyVisibleItemPosition;
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
        public void onAttachedToWindow() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
                return;
            }
            super.onAttachedToWindow();
            SliderComponent.this.startSlide(-1);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
        public void onDetachedFromWindow() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3896b092", new Object[]{this});
                return;
            }
            super.onDetachedFromWindow();
            SliderComponent.this.stopSlide();
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
            }
            return false;
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
            }
            return false;
        }

        public void reset() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("788e6256", new Object[]{this});
            } else {
                setAdapter(this.adapter);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (SliderComponent.access$000(SliderComponent.this) instanceof TNodeViewAnimator) {
                TNodeViewAnimator tNodeViewAnimator = (TNodeViewAnimator) SliderComponent.access$100(SliderComponent.this);
                int displayedChild = tNodeViewAnimator.getDisplayedChild();
                if (displayedChild < ((ArrayList) SliderComponent.access$200(SliderComponent.this).d).size()) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("index", Integer.valueOf(displayedChild));
                    SliderComponent sliderComponent = SliderComponent.this;
                    sliderComponent.sendMessage(Component.MSG_FLAG_DISAPPEAR, (n) ((ArrayList) SliderComponent.access$300(sliderComponent).d).get(displayedChild), "onwilldisappear", null, hashMap, null);
                }
                int displayedChild2 = tNodeViewAnimator.getDisplayedChild() + 1;
                if (displayedChild2 < ((ArrayList) SliderComponent.access$400(SliderComponent.this).d).size()) {
                    n nVar = (n) ((ArrayList) SliderComponent.access$500(SliderComponent.this).d).get(displayedChild2);
                    if (nVar.D0()) {
                        nVar.K0();
                    }
                    if (!nVar.A0()) {
                        nVar.b1(((ViewGroup) SliderComponent.access$600(SliderComponent.this)).getContext());
                    }
                }
                tNodeViewAnimator.showNext();
                int displayedChild3 = tNodeViewAnimator.getDisplayedChild();
                n i0 = SliderComponent.access$700(SliderComponent.this).i0(displayedChild3);
                if (i0 != null) {
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("index", Integer.valueOf(displayedChild3));
                    SliderComponent.this.sendMessage(130, i0, "onwillappear", null, hashMap2, null);
                }
                if (!((Activity) ((ViewGroup) SliderComponent.access$800(SliderComponent.this)).getContext()).isFinishing()) {
                    SliderComponent.access$1200(SliderComponent.this).postDelayed(SliderComponent.access$900(SliderComponent.this), ((b) SliderComponent.access$1000(SliderComponent.this)).y0 + ((b) SliderComponent.access$1100(SliderComponent.this)).x0);
                }
            } else if ((SliderComponent.access$1300(SliderComponent.this) instanceof MultiSlideRecyclerView) && SliderComponent.access$1400(SliderComponent.this)) {
                MultiSlideRecyclerView multiSlideRecyclerView = (MultiSlideRecyclerView) SliderComponent.access$1500(SliderComponent.this);
                int currentPosition = multiSlideRecyclerView.getCurrentPosition() + 1;
                if (currentPosition < multiSlideRecyclerView.getAdapter().getItemCount()) {
                    multiSlideRecyclerView.smoothScrollToPosition(currentPosition);
                    SliderComponent.access$1200(SliderComponent.this).removeCallbacks(SliderComponent.access$900(SliderComponent.this));
                    SliderComponent.access$1200(SliderComponent.this).postDelayed(SliderComponent.access$900(SliderComponent.this), ((b) SliderComponent.access$1600(SliderComponent.this)).y0 + ((b) SliderComponent.access$1700(SliderComponent.this)).x0);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class b extends jfw {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final String ATTR_MULTI_NOT_RESET = "multi-not-reset";
        public boolean B0;
        public String w0 = "up";
        public int x0 = 300;
        public int y0 = 2000;
        public int z0 = 0;
        public String A0 = "single";
        public boolean C0 = false;

        static {
            t2o.a(503316842);
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            if (str.hashCode() == -998046064) {
                super.B((Context) objArr[0], (HashMap) objArr[1]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/component/SliderComponent$SliderViewParams");
        }

        @Override // tb.jfw
        public void B(Context context, HashMap hashMap) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c4830690", new Object[]{this, context, hashMap});
                return;
            }
            super.B(context, hashMap);
            if (hashMap == null || !hashMap.containsKey("direction")) {
                this.w0 = "up";
            } else {
                this.w0 = (String) hashMap.get("direction");
            }
            this.x0 = nwv.t(hashMap.get("duration"), 300);
            this.y0 = nwv.t(hashMap.get(Constants.Name.INTERVAL), 2000);
            this.z0 = nwv.t(hashMap.get("delay"), 0);
            String str = (String) hashMap.get("mode");
            if (!TextUtils.isEmpty(str)) {
                this.A0 = str;
            }
            this.B0 = nwv.o(hashMap.get("autoplay"), false);
            this.C0 = nwv.o(hashMap.get(ATTR_MULTI_NOT_RESET), false);
        }
    }

    static {
        t2o.a(503316835);
        t2o.a(503317092);
        t2o.a(503317117);
        t2o.a(503317030);
    }

    public static /* synthetic */ View access$000(SliderComponent sliderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("2c8be4c7", new Object[]{sliderComponent});
        }
        return sliderComponent.view;
    }

    public static /* synthetic */ View access$100(SliderComponent sliderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("1593a9c8", new Object[]{sliderComponent});
        }
        return sliderComponent.view;
    }

    public static /* synthetic */ jfw access$1000(SliderComponent sliderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jfw) ipChange.ipc$dispatch("65c7e37f", new Object[]{sliderComponent});
        }
        return sliderComponent.viewParams;
    }

    public static /* synthetic */ jfw access$1100(SliderComponent sliderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jfw) ipChange.ipc$dispatch("a620649e", new Object[]{sliderComponent});
        }
        return sliderComponent.viewParams;
    }

    public static /* synthetic */ Handler access$1200(SliderComponent sliderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("4afdef90", new Object[]{sliderComponent});
        }
        return sliderComponent.handler;
    }

    public static /* synthetic */ View access$1300(SliderComponent sliderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("9c0bdb39", new Object[]{sliderComponent});
        }
        return sliderComponent.view;
    }

    public static /* synthetic */ boolean access$1400(SliderComponent sliderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ae195fc", new Object[]{sliderComponent})).booleanValue();
        }
        return sliderComponent.attached;
    }

    public static /* synthetic */ View access$1500(SliderComponent sliderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("6e1b653b", new Object[]{sliderComponent});
        }
        return sliderComponent.view;
    }

    public static /* synthetic */ jfw access$1600(SliderComponent sliderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jfw) ipChange.ipc$dispatch("e7daea39", new Object[]{sliderComponent});
        }
        return sliderComponent.viewParams;
    }

    public static /* synthetic */ jfw access$1700(SliderComponent sliderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jfw) ipChange.ipc$dispatch("28336b58", new Object[]{sliderComponent});
        }
        return sliderComponent.viewParams;
    }

    public static /* synthetic */ n access$1800(SliderComponent sliderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n) ipChange.ipc$dispatch("f69110fe", new Object[]{sliderComponent});
        }
        return sliderComponent.node;
    }

    public static /* synthetic */ n access$1900(SliderComponent sliderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n) ipChange.ipc$dispatch("d05ade3f", new Object[]{sliderComponent});
        }
        return sliderComponent.node;
    }

    public static /* synthetic */ n access$200(SliderComponent sliderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n) ipChange.ipc$dispatch("e1dd0649", new Object[]{sliderComponent});
        }
        return sliderComponent.node;
    }

    public static /* synthetic */ jfw access$2000(SliderComponent sliderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jfw) ipChange.ipc$dispatch("307f8640", new Object[]{sliderComponent});
        }
        return sliderComponent.viewParams;
    }

    public static /* synthetic */ n access$2200(SliderComponent sliderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n) ipChange.ipc$dispatch("3b461c57", new Object[]{sliderComponent});
        }
        return sliderComponent.node;
    }

    public static /* synthetic */ n access$2300(SliderComponent sliderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n) ipChange.ipc$dispatch("150fe998", new Object[]{sliderComponent});
        }
        return sliderComponent.node;
    }

    public static /* synthetic */ n access$2400(SliderComponent sliderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n) ipChange.ipc$dispatch("eed9b6d9", new Object[]{sliderComponent});
        }
        return sliderComponent.node;
    }

    public static /* synthetic */ n access$300(SliderComponent sliderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n) ipChange.ipc$dispatch("bba6d38a", new Object[]{sliderComponent});
        }
        return sliderComponent.node;
    }

    public static /* synthetic */ n access$400(SliderComponent sliderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n) ipChange.ipc$dispatch("9570a0cb", new Object[]{sliderComponent});
        }
        return sliderComponent.node;
    }

    public static /* synthetic */ n access$500(SliderComponent sliderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n) ipChange.ipc$dispatch("6f3a6e0c", new Object[]{sliderComponent});
        }
        return sliderComponent.node;
    }

    public static /* synthetic */ View access$600(SliderComponent sliderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("a2ba82cd", new Object[]{sliderComponent});
        }
        return sliderComponent.view;
    }

    public static /* synthetic */ n access$700(SliderComponent sliderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n) ipChange.ipc$dispatch("22ce088e", new Object[]{sliderComponent});
        }
        return sliderComponent.node;
    }

    public static /* synthetic */ View access$800(SliderComponent sliderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("74ca0ccf", new Object[]{sliderComponent});
        }
        return sliderComponent.view;
    }

    public static /* synthetic */ Runnable access$900(SliderComponent sliderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Runnable) ipChange.ipc$dispatch("df769dc6", new Object[]{sliderComponent});
        }
        return sliderComponent.showNext;
    }

    public static /* synthetic */ Object ipc$super(SliderComponent sliderComponent, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1619485803) {
            return new Boolean(super.invoke((d.j) objArr[0], (String) objArr[1], (JSONObject) objArr[2], (d.k) objArr[3]));
        }
        if (hashCode == -703216504) {
            super.applyAttrForView((SliderComponent) ((View) objArr[0]), (View) ((jfw) objArr[1]), (Map) objArr[2], ((Boolean) objArr[3]).booleanValue());
            return null;
        } else if (hashCode == 1052797818) {
            super.detach(((Boolean) objArr[0]).booleanValue());
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/tao/flexbox/layoutmanager/component/SliderComponent");
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void detach(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ec06b7a", new Object[]{this, new Boolean(z)});
            return;
        }
        super.detach(z);
        Handler handler = this.handler;
        if (handler != null) {
            handler.removeCallbacks(this.showNext);
        }
        if (this.node.d != null) {
            for (int i = 0; i < ((ArrayList) this.node.d).size(); i++) {
                ((n) ((ArrayList) this.node.d).get(i)).n(z);
            }
        }
    }

    @Override // tb.sxo
    public int getScrollCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ce801786", new Object[]{this})).intValue();
        }
        return this.node.k0();
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.j
    public boolean onHandleTNodeMessage(n nVar, n nVar2, String str, String str2, Map map, hk8 hk8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("abab8f80", new Object[]{this, nVar, nVar2, str, str2, map, hk8Var})).booleanValue();
        }
        return false;
    }

    public void resetSlide() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("daab0d29", new Object[]{this});
            return;
        }
        stopSlide();
        slideToIndex(0);
    }

    @Override // tb.sxo
    public void scrollBy(int i, int i2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f06fc09", new Object[]{this, new Integer(i), new Integer(i2), new Boolean(z)});
        }
    }

    @Override // tb.sxo
    public void scrollTo(int i, int i2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d0b0965", new Object[]{this, new Integer(i), new Integer(i2), new Boolean(z)});
        }
    }

    @Override // tb.sxo
    public void scrollToPosition(int i, boolean z, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d225a7a", new Object[]{this, new Integer(i), new Boolean(z), new Integer(i2)});
        }
    }

    @Override // tb.sxo
    public void scrollToPositionWithNumber(int i, boolean z, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cb0b758", new Object[]{this, new Integer(i), new Boolean(z), new Integer(i2), new Integer(i3)});
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component, tb.w91
    public boolean sendViewAppearForAdd(n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e6a1a1f5", new Object[]{this, nVar})).booleanValue();
        }
        V v = this.view;
        if (v instanceof TNodeViewAnimator) {
            if (nVar == this.node.i0(((TNodeViewAnimator) v).getDisplayedChild())) {
                return true;
            }
            return false;
        } else if (!(v instanceof MultiSlideRecyclerView) || nVar != this.node.i0(((MultiSlideRecyclerView) v).getCurrentPosition())) {
            return false;
        } else {
            return true;
        }
    }

    public void startSlide(int i) {
        List<n> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af60364d", new Object[]{this, new Integer(i)});
        } else if (!this.pausedByElementCall) {
            if (akt.K() && !this.node.z0()) {
                return;
            }
            if (!"multi".equalsIgnoreCase(((b) this.viewParams).A0)) {
                this.handler.removeCallbacks(this.showNext);
                n nVar = this.node;
                if (nVar == null || (list = nVar.d) == null || ((ArrayList) list).size() >= 2) {
                    if (i == -1) {
                        b bVar = (b) this.viewParams;
                        i = bVar.z0 + bVar.y0;
                    }
                    this.handler.postDelayed(this.showNext, i);
                }
            } else if (!this.mLastAutoPlay) {
                b bVar2 = (b) this.viewParams;
                if (bVar2.B0) {
                    if (i == -1) {
                        i = bVar2.z0;
                    }
                    ViewGroup view = getView();
                    if ((view instanceof MultiSlideRecyclerView) && !((b) this.viewParams).C0) {
                        ((MultiSlideRecyclerView) view).reset();
                    }
                    this.handler.removeCallbacks(this.showNext);
                    this.handler.postDelayed(this.showNext, i);
                    this.mLastAutoPlay = true;
                }
            }
        }
    }

    public void stopSlide() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("588c7bd6", new Object[]{this});
            return;
        }
        if ("multi".equalsIgnoreCase(((b) this.viewParams).A0)) {
            this.mLastAutoPlay = false;
            if (!((b) this.viewParams).C0) {
                ViewGroup view = getView();
                if (view instanceof MultiSlideRecyclerView) {
                    ((MultiSlideRecyclerView) view).reset();
                }
            }
        }
        this.handler.removeCallbacks(this.showNext);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class TNodeViewAnimator extends ViewAnimator {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(503316843);
        }

        public TNodeViewAnimator(Context context) {
            super(context);
        }

        public static /* synthetic */ Object ipc$super(TNodeViewAnimator tNodeViewAnimator, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == 949399698) {
                super.onDetachedFromWindow();
                return null;
            } else if (hashCode == 1626033557) {
                super.onAttachedToWindow();
                return null;
            } else {
                int hashCode2 = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/tao/flexbox/layoutmanager/component/SliderComponent$TNodeViewAnimator");
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        public void onAttachedToWindow() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
                return;
            }
            super.onAttachedToWindow();
            SliderComponent.this.startSlide(-1);
        }

        @Override // android.view.ViewGroup, android.view.View
        public void onDetachedFromWindow() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3896b092", new Object[]{this});
                return;
            }
            super.onDetachedFromWindow();
            SliderComponent.access$1200(SliderComponent.this).removeCallbacks(SliderComponent.access$900(SliderComponent.this));
        }

        public TNodeViewAnimator(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public void applyAttrForView(ViewGroup viewGroup, b bVar, Map map, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb85e32c", new Object[]{this, viewGroup, bVar, map, new Boolean(z)});
            return;
        }
        super.applyAttrForView((SliderComponent) viewGroup, (ViewGroup) bVar, map, z);
        if (viewGroup instanceof MultiSlideRecyclerView) {
            boolean z2 = this.mLastAutoPlay;
            if (!z2 && bVar.B0) {
                startSlide(-1);
            } else if (z2 && !bVar.B0) {
                stopSlide();
            }
        } else {
            n i0 = this.node.i0(0);
            if (i0 != null) {
                if (i0.D0()) {
                    i0.K0();
                }
                if (!i0.A0()) {
                    i0.b1(viewGroup.getContext());
                }
            }
            startSlide(-1);
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public b generateViewParams() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("d93b3489", new Object[]{this}) : new b();
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public ViewGroup onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("4783d8d4", new Object[]{this, context});
        }
        if ("multi".equalsIgnoreCase(((b) this.viewParams).A0)) {
            return new MultiSlideRecyclerView(context);
        }
        TNodeViewAnimator tNodeViewAnimator = new TNodeViewAnimator(context);
        Animation[] animations = getAnimations(((b) this.viewParams).w0);
        tNodeViewAnimator.setInAnimation(animations[0]);
        tNodeViewAnimator.setOutAnimation(animations[1]);
        return tNodeViewAnimator;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.j
    public boolean onHandleMessage(n.g gVar) {
        int displayedChild;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1e782cf4", new Object[]{this, gVar})).booleanValue();
        }
        if ((gVar.d.equals("onwilldisappear") || gVar.d.equals("onwillappear")) && getView() != null) {
            if (gVar.d.equals("onwillappear")) {
                startSlide(-1);
            } else {
                stopSlide();
            }
            V v = this.view;
            if ((v instanceof TNodeViewAnimator) && (displayedChild = ((TNodeViewAnimator) v).getDisplayedChild()) < ((ArrayList) this.node.d).size()) {
                HashMap hashMap = new HashMap();
                hashMap.put("index", Integer.valueOf(displayedChild));
                sendMessage(gVar.d.equals("onwillappear") ? 130 : Component.MSG_FLAG_DISAPPEAR, (n) ((ArrayList) this.node.d).get(displayedChild), gVar.d, null, hashMap, gVar.g);
            }
        }
        return false;
    }

    private void slideToIndex(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b23e6f6", new Object[]{this, new Integer(i)});
            return;
        }
        this.handler.removeCallbacks(this.showNext);
        V v = this.view;
        if (v instanceof TNodeViewAnimator) {
            int displayedChild = ((TNodeViewAnimator) v).getDisplayedChild();
            if (i < ((ArrayList) this.node.d).size() && displayedChild != i) {
                for (int i2 = 0; i2 <= i; i2++) {
                    n nVar = (n) ((ArrayList) this.node.d).get(i2);
                    if (nVar.D0()) {
                        nVar.K0();
                    }
                    if (!nVar.A0()) {
                        nVar.b1(((ViewGroup) this.view).getContext());
                    }
                }
                ((TNodeViewAnimator) this.view).setDisplayedChild(i);
                HashMap hashMap = new HashMap();
                hashMap.put("index", Integer.valueOf(i));
                sendMessage(130, (n) ((ArrayList) this.node.d).get(i), "onwillappear", null, hashMap, null);
            }
        } else if (v instanceof MultiSlideRecyclerView) {
            MultiSlideRecyclerView multiSlideRecyclerView = (MultiSlideRecyclerView) v;
            if (((MultiSlideRecyclerView) v).getCurrentPosition() != i && i < multiSlideRecyclerView.getAdapter().getItemCount()) {
                multiSlideRecyclerView.smoothScrollToPosition(i);
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0039, code lost:
        if (r10.equals("slideToIndex") == false) goto L_0x0030;
     */
    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean invoke(com.taobao.tao.flexbox.layoutmanager.ac.d.j r9, java.lang.String r10, com.alibaba.fastjson.JSONObject r11, com.taobao.tao.flexbox.layoutmanager.ac.d.k r12) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.flexbox.layoutmanager.component.SliderComponent.invoke(com.taobao.tao.flexbox.layoutmanager.ac.d$j, java.lang.String, com.alibaba.fastjson.JSONObject, com.taobao.tao.flexbox.layoutmanager.ac.d$k):boolean");
    }

    private Animation[] getAnimations(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animation[]) ipChange.ipc$dispatch("3cbd2fb", new Object[]{this, str});
        }
        Animation[] animationArr = new Animation[2];
        if (str.equals("right")) {
            animationArr[0] = new TranslateAnimation(2, -1.0f, 2, 0.0f, 2, 0.0f, 2, 0.0f);
            animationArr[1] = new TranslateAnimation(2, 0.0f, 2, 1.0f, 2, 0.0f, 2, 0.0f);
        } else if (str.equals("left")) {
            animationArr[0] = new TranslateAnimation(2, 1.0f, 2, 0.0f, 2, 0.0f, 2, 0.0f);
            animationArr[1] = new TranslateAnimation(2, 0.0f, 2, -1.0f, 2, 0.0f, 2, 0.0f);
        } else if (str.equals("down")) {
            animationArr[0] = new TranslateAnimation(2, 0.0f, 2, 0.0f, 2, -1.0f, 2, 0.0f);
            animationArr[1] = new TranslateAnimation(2, 0.0f, 2, 0.0f, 2, 0.0f, 2, 1.0f);
        } else {
            animationArr[0] = new TranslateAnimation(2, 0.0f, 2, 0.0f, 2, 1.0f, 2, 0.0f);
            animationArr[1] = new TranslateAnimation(2, 0.0f, 2, 0.0f, 2, 0.0f, 2, -1.0f);
        }
        animationArr[0].setDuration(((b) this.viewParams).x0);
        animationArr[1].setDuration(((b) this.viewParams).x0);
        animationArr[0].setInterpolator(new DecelerateInterpolator(1.2f));
        animationArr[1].setInterpolator(new DecelerateInterpolator(1.2f));
        return animationArr;
    }
}
