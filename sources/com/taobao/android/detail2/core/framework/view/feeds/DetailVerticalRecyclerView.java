package com.taobao.android.detail2.core.framework.view.feeds;

import android.content.Context;
import android.os.Looper;
import android.os.MessageQueue;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SimpleItemAnimator;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.framework.base.weex.DetailWeexContainer;
import com.taobao.android.detail2.core.framework.view.manager.ListViewManager;
import com.taobao.ptr.PullBase;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.cxj;
import tb.i0d;
import tb.j0d;
import tb.psn;
import tb.q0j;
import tb.r19;
import tb.t2o;
import tb.txj;
import tb.v4n;
import tb.vsn;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class DetailVerticalRecyclerView extends RecyclerView implements v4n {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int PAGE_SCROLL_DIRECTION_DOWN = 1;
    private static final int PAGE_SCROLL_DIRECTION_UP = -1;
    private float downX;
    private float downY;
    public Context mContext;
    private boolean mEnableAlignTop;
    private boolean mEnablePinchConflict;
    private boolean mForbidNotifyPageChange;
    private boolean mIsHoverMode;
    public LinearLayoutManager mLinearLayoutManager;
    private cxj mNewDetailContext;
    public CustomPagerSnapHelper mPageSnapHelper;
    private e mScrollWillChangeListener;
    private int mTouchSlop;
    public boolean enableScroll = true;
    public boolean isSettling = false;
    private int mSmoothScrollTargetPosition = 0;
    private int mBeforeScrollPosition = -1;
    private int mBeforeWillAppearPosition = 0;
    private List<d> mOnPageChangedListeners = new ArrayList();
    private Map<Integer, RecyclerView.ViewHolder> mPositionHolders = new HashMap();
    private List<c> mCardScrollListeners = new CopyOnWriteArrayList();
    private long mLastSendIdleToken = 0;
    private boolean mHasSendIdleTaskRunnable = false;
    private boolean mHasScrollStart = false;
    private boolean mIsRunningScrollBy = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class CustomPagerSnapHelper extends PagerSnapHelper {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public View f7155a;

        static {
            t2o.a(352321957);
        }

        public CustomPagerSnapHelper() {
        }

        public static /* synthetic */ Object ipc$super(CustomPagerSnapHelper customPagerSnapHelper, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -1760828615) {
                return super.calculateDistanceToFinalSnap((RecyclerView.LayoutManager) objArr[0], (View) objArr[1]);
            }
            if (hashCode == -259228053) {
                return super.findSnapView((RecyclerView.LayoutManager) objArr[0]);
            }
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/detail2/core/framework/view/feeds/DetailVerticalRecyclerView$CustomPagerSnapHelper");
        }

        @Override // androidx.recyclerview.widget.PagerSnapHelper, androidx.recyclerview.widget.SnapHelper
        public int[] calculateDistanceToFinalSnap(RecyclerView.LayoutManager layoutManager, View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (int[]) ipChange.ipc$dispatch("970be339", new Object[]{this, layoutManager, view});
            }
            this.f7155a = view;
            if (DetailVerticalRecyclerView.access$100(DetailVerticalRecyclerView.this)) {
                DetailVerticalRecyclerView.access$102(DetailVerticalRecyclerView.this, false);
                return new int[2];
            } else if (DetailVerticalRecyclerView.access$200(DetailVerticalRecyclerView.this)) {
                int[] calculateDistanceToFinalSnap = super.calculateDistanceToFinalSnap(layoutManager, view);
                if (calculateDistanceToFinalSnap == null) {
                    txj.e(txj.TAG_RENDER, "error: NdAndroidX super calculateDistanceToFinalSnap 为 null 。");
                    return null;
                }
                if (DetailVerticalRecyclerView.access$300(DetailVerticalRecyclerView.this)) {
                    calculateDistanceToFinalSnap[1] = view.getTop();
                }
                txj.e(txj.TAG_RENDER, "NdAndroidX calculateDistanceToFinalSnap.result:" + Arrays.toString(calculateDistanceToFinalSnap) + " mEnableAlignTop:" + DetailVerticalRecyclerView.access$300(DetailVerticalRecyclerView.this));
                return calculateDistanceToFinalSnap;
            } else {
                DetailVerticalRecyclerView.access$400(DetailVerticalRecyclerView.this);
                DetailVerticalRecyclerView.access$500(DetailVerticalRecyclerView.this, view);
                int[] calculateDistanceToFinalSnap2 = super.calculateDistanceToFinalSnap(layoutManager, view);
                if (calculateDistanceToFinalSnap2 == null) {
                    txj.e(txj.TAG_RENDER, "error: super calculateDistanceToFinalSnap 为 null 。");
                    return null;
                }
                if (DetailVerticalRecyclerView.access$300(DetailVerticalRecyclerView.this)) {
                    calculateDistanceToFinalSnap2[1] = view.getTop();
                }
                if (r19.A0()) {
                    if (DetailVerticalRecyclerView.access$600(DetailVerticalRecyclerView.this)) {
                        DetailVerticalRecyclerView.access$700(DetailVerticalRecyclerView.this, psn.DX_RECYCLER_LAYOUT_SCROLL_STATE_END, r19.o0());
                    } else {
                        DetailVerticalRecyclerView.access$700(DetailVerticalRecyclerView.this, "onPageInit", r19.m0());
                    }
                }
                return calculateDistanceToFinalSnap2;
            }
        }

        @Override // androidx.recyclerview.widget.PagerSnapHelper, androidx.recyclerview.widget.SnapHelper
        public View findSnapView(RecyclerView.LayoutManager layoutManager) {
            int i = 0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (View) ipChange.ipc$dispatch("f08c7e6b", new Object[]{this, layoutManager});
            }
            try {
            } catch (Throwable th) {
                th.printStackTrace();
            }
            if (DetailVerticalRecyclerView.access$000(DetailVerticalRecyclerView.this) == null) {
                return super.findSnapView(layoutManager);
            }
            float W = DetailVerticalRecyclerView.access$000(DetailVerticalRecyclerView.this).j().W();
            int i2 = (W > 0.0f ? 1 : (W == 0.0f ? 0 : -1));
            if (i2 == 0) {
                return super.findSnapView(layoutManager);
            }
            View view = this.f7155a;
            if (view == null && layoutManager.getChildCount() > 0) {
                view = layoutManager.getChildAt(0);
            }
            int i3 = 0;
            while (true) {
                if (i3 >= layoutManager.getChildCount()) {
                    break;
                } else if (layoutManager.getChildAt(i3) == view) {
                    i = i3;
                    break;
                } else {
                    i3++;
                }
            }
            if (i2 <= 0 || W > 0.5d) {
                W = 0.25f;
            }
            if (view != null) {
                float height = view.getHeight() * W;
                if (Math.abs(view.getTop()) > view.getHeight() / 2) {
                    return super.findSnapView(layoutManager);
                }
                if (view.getTop() > height) {
                    return layoutManager.getChildAt(i - 1);
                }
                if (view.getTop() < (-height)) {
                    return layoutManager.getChildAt(i + 1);
                }
            }
            return super.findSnapView(layoutManager);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public enum ScrollSpeed {
        FAST(30.0f),
        NORMAL(45.0f),
        SLOW(60.0f);
        
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private float speedCoefficient;

        ScrollSpeed(float f) {
            this.speedCoefficient = f;
        }

        public static /* synthetic */ Object ipc$super(ScrollSpeed scrollSpeed, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail2/core/framework/view/feeds/DetailVerticalRecyclerView$ScrollSpeed");
        }

        public static ScrollSpeed valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ScrollSpeed) ipChange.ipc$dispatch("5ca3e3e5", new Object[]{str});
            }
            return (ScrollSpeed) Enum.valueOf(ScrollSpeed.class, str);
        }

        public float getSpeedCoefficient() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("e9bb885b", new Object[]{this})).floatValue();
            }
            return this.speedCoefficient;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a extends r19.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ String b;
        public final /* synthetic */ int c;

        public a(String str, int i) {
            this.b = str;
            this.c = i;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail2/core/framework/view/feeds/DetailVerticalRecyclerView$3");
        }

        @Override // tb.r19.e
        public int b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("ac3af443", new Object[]{this})).intValue();
            }
            return this.c;
        }

        @Override // tb.r19.e
        public String c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("d0a42b93", new Object[]{this});
            }
            return "sendIdleTaskToWeex";
        }

        @Override // tb.r19.e
        public void d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9425d337", new Object[]{this});
            } else {
                DetailVerticalRecyclerView.access$800(DetailVerticalRecyclerView.this, e(), this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements MessageQueue.IdleHandler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ long f7156a;
        public final /* synthetic */ String b;

        public b(long j, String str) {
            this.f7156a = j;
            this.b = str;
        }

        @Override // android.os.MessageQueue.IdleHandler
        public boolean queueIdle() {
            List<DetailWeexContainer> K0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("b5e69690", new Object[]{this})).booleanValue();
            }
            DetailVerticalRecyclerView.access$902(DetailVerticalRecyclerView.this, false);
            if (this.f7156a < DetailVerticalRecyclerView.access$1000(DetailVerticalRecyclerView.this)) {
                return false;
            }
            Context context = DetailVerticalRecyclerView.this.getContext();
            if ((!(context instanceof i0d) || !((i0d) context).O1()) && (context instanceof j0d) && (K0 = ((j0d) context).K0()) != null && !K0.isEmpty()) {
                for (DetailWeexContainer detailWeexContainer : K0) {
                    if (detailWeexContainer != null) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("idleTaskType", (Object) this.b);
                        detailWeexContainer.W("ndIdleTaskStart", jSONObject);
                        txj.e(txj.TAG_TIP, "hasSendIdleTaskToWeex ndIdleTaskStart , idleTaskType:" + this.b);
                    }
                }
            }
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface c {
        void a(RecyclerView recyclerView, int i, int i2);

        void b(float f);

        void c(float f);

        void d(MotionEvent motionEvent);

        void e(String str);

        void onScrollStateChanged(RecyclerView recyclerView, int i);

        void onTouch(MotionEvent motionEvent);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface d {
        void a(int i, int i2);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface e {
    }

    static {
        t2o.a(352321952);
        t2o.a(632291347);
    }

    public DetailVerticalRecyclerView(Context context) {
        super(context);
        init(context);
    }

    public static /* synthetic */ cxj access$000(DetailVerticalRecyclerView detailVerticalRecyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cxj) ipChange.ipc$dispatch("b4a933ec", new Object[]{detailVerticalRecyclerView});
        }
        return detailVerticalRecyclerView.mNewDetailContext;
    }

    public static /* synthetic */ boolean access$100(DetailVerticalRecyclerView detailVerticalRecyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f51d1bbe", new Object[]{detailVerticalRecyclerView})).booleanValue();
        }
        return detailVerticalRecyclerView.mIsHoverMode;
    }

    public static /* synthetic */ long access$1000(DetailVerticalRecyclerView detailVerticalRecyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("45ff3380", new Object[]{detailVerticalRecyclerView})).longValue();
        }
        return detailVerticalRecyclerView.mLastSendIdleToken;
    }

    public static /* synthetic */ boolean access$102(DetailVerticalRecyclerView detailVerticalRecyclerView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8b9530e0", new Object[]{detailVerticalRecyclerView, new Boolean(z)})).booleanValue();
        }
        detailVerticalRecyclerView.mIsHoverMode = z;
        return z;
    }

    public static /* synthetic */ boolean access$200(DetailVerticalRecyclerView detailVerticalRecyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5778329d", new Object[]{detailVerticalRecyclerView})).booleanValue();
        }
        return detailVerticalRecyclerView.mIsRunningScrollBy;
    }

    public static /* synthetic */ boolean access$300(DetailVerticalRecyclerView detailVerticalRecyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b9d3497c", new Object[]{detailVerticalRecyclerView})).booleanValue();
        }
        return detailVerticalRecyclerView.mEnableAlignTop;
    }

    public static /* synthetic */ void access$400(DetailVerticalRecyclerView detailVerticalRecyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c2e6057", new Object[]{detailVerticalRecyclerView});
        } else {
            detailVerticalRecyclerView.notifyPageChange();
        }
    }

    public static /* synthetic */ void access$500(DetailVerticalRecyclerView detailVerticalRecyclerView, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b5f19dc", new Object[]{detailVerticalRecyclerView, view});
        } else {
            detailVerticalRecyclerView.notifyWillAppear(view);
        }
    }

    public static /* synthetic */ boolean access$600(DetailVerticalRecyclerView detailVerticalRecyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e0e48e19", new Object[]{detailVerticalRecyclerView})).booleanValue();
        }
        return detailVerticalRecyclerView.mHasScrollStart;
    }

    public static /* synthetic */ void access$700(DetailVerticalRecyclerView detailVerticalRecyclerView, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7d6b105", new Object[]{detailVerticalRecyclerView, str, new Integer(i)});
        } else {
            detailVerticalRecyclerView.sendIdleTaskToWeex(str, i);
        }
    }

    public static /* synthetic */ void access$800(DetailVerticalRecyclerView detailVerticalRecyclerView, long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4680cdb", new Object[]{detailVerticalRecyclerView, new Long(j), str});
        } else {
            detailVerticalRecyclerView.ifMainIdleThenPreloadForWeex(j, str);
        }
    }

    public static /* synthetic */ boolean access$902(DetailVerticalRecyclerView detailVerticalRecyclerView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d3d358e8", new Object[]{detailVerticalRecyclerView, new Boolean(z)})).booleanValue();
        }
        detailVerticalRecyclerView.mHasSendIdleTaskRunnable = z;
        return z;
    }

    private boolean checkPinchConflictProcess(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("59183deb", new Object[]{this, motionEvent})).booleanValue();
        }
        try {
            if (this.mEnablePinchConflict && this.mNewDetailContext.j().N().s()) {
                if (this.mNewDetailContext == null || motionEvent == null) {
                    txj.e(txj.TAG_GESTURE, "checkPinchConflictProcess: Null Error. ");
                } else {
                    int pointerCount = motionEvent.getPointerCount();
                    txj.e(txj.TAG_GESTURE, "checkPinchConflictProcess: " + motionEvent.getActionMasked() + " pointCount = " + pointerCount);
                    if (pointerCount > 1) {
                        return true;
                    }
                    return false;
                }
            }
        } catch (Throwable th) {
            txj.f(txj.TAG_GESTURE, "checkPinchConflictProcess error. 未知异常.", th);
        }
        return false;
    }

    private void disableAnimator() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce463ef6", new Object[]{this});
            return;
        }
        RecyclerView.ItemAnimator itemAnimator = getItemAnimator();
        if (itemAnimator instanceof SimpleItemAnimator) {
            ((SimpleItemAnimator) itemAnimator).setSupportsChangeAnimations(false);
            itemAnimator.setChangeDuration(0L);
        }
    }

    private int getPositionIdle() {
        RecyclerView.LayoutManager layoutManager;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cecce60d", new Object[]{this})).intValue();
        }
        View findSnapView = this.mPageSnapHelper.findSnapView(getLayoutManager());
        if (findSnapView == null || (layoutManager = getLayoutManager()) == null) {
            return 0;
        }
        return layoutManager.getPosition(findSnapView);
    }

    private void ifMainIdleThenPreloadForWeex(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45d85dff", new Object[]{this, new Long(j), str});
        } else {
            Looper.myQueue().addIdleHandler(new b(j, str));
        }
    }

    private void init(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
            return;
        }
        this.mContext = context;
        this.mTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        setItemViewCacheSize(0);
        setHasFixedSize(true);
        disableAnimator();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.mContext, 1, false) { // from class: com.taobao.android.detail2.core.framework.view.feeds.DetailVerticalRecyclerView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                int hashCode = str.hashCode();
                if (hashCode == 514551467) {
                    return new Boolean(super.canScrollVertically());
                }
                if (hashCode == 1027840325) {
                    super.onLayoutChildren((RecyclerView.Recycler) objArr[0], (RecyclerView.State) objArr[1]);
                    return null;
                }
                int hashCode2 = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/detail2/core/framework/view/feeds/DetailVerticalRecyclerView$1");
            }

            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public boolean canScrollVertically() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("1eab6eab", new Object[]{this})).booleanValue();
                }
                if (!DetailVerticalRecyclerView.this.enableScroll || !super.canScrollVertically()) {
                    return false;
                }
                return true;
            }

            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3d439945", new Object[]{this, recycler, state});
                    return;
                }
                try {
                    super.onLayoutChildren(recycler, state);
                } catch (Throwable th) {
                    if (DetailVerticalRecyclerView.access$000(DetailVerticalRecyclerView.this) != null) {
                        q0j.n("main", q0j.ERROR_CODE_COMMON_ADAPTER_BIND_DATA_ERROR, "recyclerview onLayoutChildren执行异常: ", DetailVerticalRecyclerView.access$000(DetailVerticalRecyclerView.this).j().T(), th);
                    }
                    txj.f(txj.TAG_RENDER, "recyclerview onLayoutChildren执行异常", th);
                }
            }
        };
        this.mLinearLayoutManager = linearLayoutManager;
        setLayoutManager(linearLayoutManager);
        CustomPagerSnapHelper customPagerSnapHelper = new CustomPagerSnapHelper();
        this.mPageSnapHelper = customPagerSnapHelper;
        customPagerSnapHelper.attachToRecyclerView(this);
    }

    public static /* synthetic */ Object ipc$super(DetailVerticalRecyclerView detailVerticalRecyclerView, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1447998406:
                return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
            case -429946499:
                super.smoothScrollToPosition(((Number) objArr[0]).intValue());
                return null;
            case -407533570:
                return new Boolean(super.onInterceptTouchEvent((MotionEvent) objArr[0]));
            case -244855388:
                super.onLayout(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue());
                return null;
            case 1659846701:
                super.onScrollStateChanged(((Number) objArr[0]).intValue());
                return null;
            case 1893018130:
                super.onScrolled(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail2/core/framework/view/feeds/DetailVerticalRecyclerView");
        }
    }

    private static boolean isChildBottomVisible(RecyclerView recyclerView, int i) {
        View childAt;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("374ea84c", new Object[]{recyclerView, new Integer(i)})).booleanValue();
        }
        if (recyclerView == null || (childAt = recyclerView.getChildAt(i)) == null) {
            return false;
        }
        if (childAt.getBottom() > recyclerView.getHeight()) {
            z = false;
        }
        return z;
    }

    private static boolean isChildRightVisible(RecyclerView recyclerView, int i) {
        View childAt;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a48bbd5f", new Object[]{recyclerView, new Integer(i)})).booleanValue();
        }
        if (recyclerView == null || (childAt = recyclerView.getChildAt(i)) == null) {
            return false;
        }
        if (childAt.getRight() > recyclerView.getWidth()) {
            z = false;
        }
        return z;
    }

    private void notifyPageChange() {
        RecyclerView.LayoutManager layoutManager;
        List<d> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f85a47cf", new Object[]{this});
            return;
        }
        View findSnapView = this.mPageSnapHelper.findSnapView(getLayoutManager());
        if (findSnapView != null && (layoutManager = getLayoutManager()) != null) {
            int position = layoutManager.getPosition(findSnapView);
            int i = this.mSmoothScrollTargetPosition;
            this.mBeforeScrollPosition = i;
            this.mSmoothScrollTargetPosition = position;
            if (this.mForbidNotifyPageChange) {
                this.mForbidNotifyPageChange = false;
            } else if (position != i && (list = this.mOnPageChangedListeners) != null) {
                for (d dVar : list) {
                    if (dVar != null) {
                        dVar.a(this.mBeforeScrollPosition, this.mSmoothScrollTargetPosition);
                    }
                }
            }
        }
    }

    private void notifyScrollStatus(int i, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95ad48ec", new Object[]{this, new Integer(i), new Float(f)});
            return;
        }
        List<c> list = this.mCardScrollListeners;
        if (!(list == null || list.size() == 0 || canScrollVertically(i))) {
            for (c cVar : this.mCardScrollListeners) {
                if (cVar != null) {
                    if (i == -1) {
                        cVar.c(f);
                    } else if (i == 1) {
                        cVar.b(f);
                    }
                }
            }
        }
    }

    private void notifyWillAppear(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfabad2c", new Object[]{this, new Integer(i)});
            return;
        }
        txj.e(txj.TAG_RENDER, "notifyWillAppear" + i);
        int i2 = this.mBeforeWillAppearPosition;
        if (i == i2) {
            txj.e(txj.TAG_RENDER, "notifyWillAppear失败，位置相同");
            return;
        }
        e eVar = this.mScrollWillChangeListener;
        if (eVar != null) {
            ((ListViewManager.c) eVar).a(i2, i);
        }
        this.mBeforeWillAppearPosition = i;
    }

    private void sendIdleTaskToWeex(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e428255", new Object[]{this, str, new Integer(i)});
            return;
        }
        this.mHasSendIdleTaskRunnable = true;
        a aVar = new a(str, i);
        this.mLastSendIdleToken = aVar.e();
        r19.e(aVar);
    }

    private void setBeforeWillAppearPosition(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d2d274b", new Object[]{this, new Integer(i)});
        } else {
            this.mBeforeWillAppearPosition = i;
        }
    }

    public void addCardScrollListener(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57b94b23", new Object[]{this, cVar});
        } else {
            this.mCardScrollListeners.add(cVar);
        }
    }

    public void addOnPageChangedListener(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eea286dc", new Object[]{this, dVar});
            return;
        }
        if (this.mOnPageChangedListeners == null) {
            this.mOnPageChangedListeners = new ArrayList();
        }
        this.mOnPageChangedListeners.add(dVar);
    }

    public void addOnScrollWillStatusListener(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b11c9aa4", new Object[]{this, eVar});
        } else {
            this.mScrollWillChangeListener = eVar;
        }
    }

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        this.mCardScrollListeners.clear();
        this.mScrollWillChangeListener = null;
        this.mOnPageChangedListeners.clear();
    }

    public int getCurrentDisplayPosition() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a76604c2", new Object[]{this})).intValue();
        }
        return this.mSmoothScrollTargetPosition;
    }

    public RecyclerView.ViewHolder getHolder(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView.ViewHolder) ipChange.ipc$dispatch("2f6db1c0", new Object[]{this, new Integer(i)});
        }
        if (i < 0) {
            return null;
        }
        try {
            RecyclerView.ViewHolder findViewHolderForAdapterPosition = findViewHolderForAdapterPosition(i);
            if (findViewHolderForAdapterPosition == null) {
                return this.mPositionHolders.get(Integer.valueOf(i));
            }
            this.mPositionHolders.put(Integer.valueOf(i), findViewHolderForAdapterPosition);
            return findViewHolderForAdapterPosition;
        } catch (Exception e2) {
            q0j.n("main", q0j.ERROR_CODE_COMMON_GET_HOLDER_ERROR, "getHolder调用异常", null, e2);
            return null;
        }
    }

    public LinearLayoutManager getLinearLayoutManager() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinearLayoutManager) ipChange.ipc$dispatch("f52cd39e", new Object[]{this});
        }
        return this.mLinearLayoutManager;
    }

    public CustomPagerSnapHelper getPageSnapHelper() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CustomPagerSnapHelper) ipChange.ipc$dispatch("eb6334e0", new Object[]{this});
        }
        return this.mPageSnapHelper;
    }

    @Override // tb.v4n
    public int getPullDirection() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f748d57e", new Object[]{this})).intValue();
        }
        return 0;
    }

    public int getRemainScrollYDistance() {
        int findFirstVisibleItemPosition;
        View findViewByPosition;
        int itemCount;
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b6c2c679", new Object[]{this})).intValue();
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) getLayoutManager();
        if (linearLayoutManager == null || (findViewByPosition = linearLayoutManager.findViewByPosition((findFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition()))) == null) {
            return -1;
        }
        int height = findViewByPosition.getHeight();
        if (getAdapter() != null && (itemCount = getAdapter().getItemCount() - 1) > 0 && (i = itemCount - findFirstVisibleItemPosition) > 0) {
            return (i * height) - (height - findViewByPosition.getBottom());
        }
        return -1;
    }

    public int getScrollYDistance() {
        int findFirstVisibleItemPosition;
        View findViewByPosition;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6688d005", new Object[]{this})).intValue();
        }
        try {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) getLayoutManager();
            if (linearLayoutManager == null || (findViewByPosition = linearLayoutManager.findViewByPosition((findFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition()))) == null) {
                return -1;
            }
            return (findFirstVisibleItemPosition * findViewByPosition.getHeight()) - findViewByPosition.getTop();
        } catch (Throwable th) {
            th.printStackTrace();
            return -1;
        }
    }

    @Override // tb.v4n
    public boolean isReadyForPullEnd() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f76f3051", new Object[]{this})).booleanValue();
        }
        RecyclerView.Adapter adapter = getAdapter();
        if (adapter == null || adapter.getItemCount() == 0) {
            return true;
        }
        int itemCount = adapter.getItemCount() - 1;
        int b2 = vsn.b(this);
        if (b2 == -1 || b2 < itemCount) {
            return false;
        }
        int a2 = b2 - vsn.a(this);
        int c2 = vsn.c(this);
        if (c2 == 0) {
            return isChildRightVisible(this, a2);
        }
        if (c2 != 1) {
            return false;
        }
        return isChildBottomVisible(this, a2);
    }

    @Override // tb.v4n
    public boolean isReadyForPullStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3cf0e198", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public boolean isScrolling() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ad3ffaf6", new Object[]{this})).booleanValue();
        }
        if (getScrollState() != 0) {
            return true;
        }
        return false;
    }

    public void notifyCardScrollBeforeDelete(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84656de1", new Object[]{this, str});
            return;
        }
        for (c cVar : this.mCardScrollListeners) {
            cVar.e(str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0089 A[ADDED_TO_REGION] */
    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            r0 = 1
            r1 = 0
            r2 = 2
            com.android.alibaba.ip.runtime.IpChange r3 = com.taobao.android.detail2.core.framework.view.feeds.DetailVerticalRecyclerView.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x001c
            java.lang.String r4 = "e7b587fe"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r6
            r2[r0] = r7
            java.lang.Object r7 = r3.ipc$dispatch(r4, r2)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            return r7
        L_0x001c:
            boolean r3 = r6.checkPinchConflictProcess(r7)
            if (r3 == 0) goto L_0x0023
            return r1
        L_0x0023:
            int r3 = r7.getActionMasked()
            if (r3 == 0) goto L_0x005e
            if (r3 == r2) goto L_0x002c
            goto L_0x006a
        L_0x002c:
            float r2 = r7.getX()
            float r3 = r6.downX
            float r2 = r2 - r3
            float r2 = java.lang.Math.abs(r2)
            float r3 = r7.getY()
            float r4 = r6.downY
            float r3 = r3 - r4
            float r3 = java.lang.Math.abs(r3)
            int r4 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r4 <= 0) goto L_0x0050
            int r4 = r6.mTouchSlop
            float r4 = (float) r4
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 <= 0) goto L_0x0050
            r2 = 1
        L_0x004e:
            r3 = 0
            goto L_0x006c
        L_0x0050:
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 >= 0) goto L_0x006a
            int r2 = r6.mTouchSlop
            float r2 = (float) r2
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 <= 0) goto L_0x006a
            r2 = 0
            r3 = 1
            goto L_0x006c
        L_0x005e:
            float r2 = r7.getX()
            r6.downX = r2
            float r2 = r7.getY()
            r6.downY = r2
        L_0x006a:
            r2 = 0
            goto L_0x004e
        L_0x006c:
            java.util.List<com.taobao.android.detail2.core.framework.view.feeds.DetailVerticalRecyclerView$c> r4 = r6.mCardScrollListeners
            java.util.Iterator r4 = r4.iterator()
        L_0x0072:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0085
            java.lang.Object r5 = r4.next()
            com.taobao.android.detail2.core.framework.view.feeds.DetailVerticalRecyclerView$c r5 = (com.taobao.android.detail2.core.framework.view.feeds.DetailVerticalRecyclerView.c) r5
            if (r5 != 0) goto L_0x0081
            goto L_0x0072
        L_0x0081:
            r5.d(r7)
            goto L_0x0072
        L_0x0085:
            boolean r4 = r6.isSettling
            if (r4 != 0) goto L_0x0094
            if (r2 == 0) goto L_0x008c
            goto L_0x0094
        L_0x008c:
            if (r3 == 0) goto L_0x008f
            return r0
        L_0x008f:
            boolean r7 = super.onInterceptTouchEvent(r7)
            return r7
        L_0x0094:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.detail2.core.framework.view.feeds.DetailVerticalRecyclerView.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else {
            super.onLayout(z, i, i2, i3, i4);
        }
    }

    @Override // tb.v4n
    public void onPullAdapterAdded(PullBase pullBase) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04e19b", new Object[]{this, pullBase});
        }
    }

    @Override // tb.v4n
    public void onPullAdapterRemoved(PullBase pullBase) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea67bf7b", new Object[]{this, pullBase});
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void onScrollStateChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62ef402d", new Object[]{this, new Integer(i)});
            return;
        }
        super.onScrollStateChanged(i);
        for (c cVar : this.mCardScrollListeners) {
            cVar.onScrollStateChanged(this, i);
        }
        if (i == 0) {
            this.isSettling = false;
        } else if (i == 1) {
            this.isSettling = false;
        } else if (i == 2) {
            this.isSettling = true;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void onScrolled(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70d52a12", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        super.onScrolled(i, i2);
        if (i == 0 && i2 == 0) {
            notifyPageChange();
            setBeforeWillAppearPosition(getPositionIdle());
            if (!r19.A0()) {
                return;
            }
            if (this.mHasScrollStart) {
                sendIdleTaskToWeex(psn.DX_RECYCLER_LAYOUT_SCROLL_STATE_END, r19.o0());
            } else {
                sendIdleTaskToWeex("onPageInit", r19.m0());
            }
        } else {
            for (c cVar : this.mCardScrollListeners) {
                cVar.a(this, i, i2);
            }
            if (r19.A0()) {
                this.mHasScrollStart = true;
                if (this.mHasSendIdleTaskRunnable) {
                    this.mLastSendIdleToken = System.currentTimeMillis();
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.downX = motionEvent.getX();
            this.downY = motionEvent.getY();
        } else if (actionMasked == 1) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if (Math.abs((y - this.downY) / (x - this.downX)) >= 1.0f) {
                float f = y - this.downY;
                float f2 = this.mTouchSlop;
                if (f >= f2) {
                    notifyScrollStatus(-1, f);
                } else if (f < f2) {
                    notifyScrollStatus(1, f);
                }
            }
        }
        for (c cVar : this.mCardScrollListeners) {
            if (cVar != null) {
                cVar.onTouch(motionEvent);
            }
        }
        if (this.isSettling) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void scrollSmoothByHover(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe9acb71", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        this.mIsHoverMode = true;
        smoothScrollBy(i, i2);
    }

    public void setEnableAlignTop(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d70aa498", new Object[]{this, new Boolean(z)});
        } else {
            this.mEnableAlignTop = z;
        }
    }

    public void setEnablePinchConflict(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f0da966", new Object[]{this, new Boolean(z)});
        } else {
            this.mEnablePinchConflict = z;
        }
    }

    public void setEnableScroll(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f594a6bb", new Object[]{this, new Boolean(z)});
        } else {
            this.enableScroll = z;
        }
    }

    public void setForbidNotifyPageChange(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b3a7ef", new Object[]{this, new Boolean(z)});
        } else {
            this.mForbidNotifyPageChange = z;
        }
    }

    public void setIsRunningScrollBy(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f887576", new Object[]{this, new Boolean(z)});
        } else {
            this.mIsRunningScrollBy = z;
        }
    }

    public void setNewDetailContext(cxj cxjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcf8dfb8", new Object[]{this, cxjVar});
        } else {
            this.mNewDetailContext = cxjVar;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void smoothScrollToPosition(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e65f897d", new Object[]{this, new Integer(i)});
            return;
        }
        super.smoothScrollToPosition(i);
        notifyWillAppear(i);
    }

    public void smoothScrollToPosition(int i, final ScrollSpeed scrollSpeed) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b07a59f", new Object[]{this, new Integer(i), scrollSpeed});
            return;
        }
        LinearSmoothScroller linearSmoothScroller = new LinearSmoothScroller(this, this.mContext) { // from class: com.taobao.android.detail2.core.framework.view.feeds.DetailVerticalRecyclerView.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass2 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail2/core/framework/view/feeds/DetailVerticalRecyclerView$2");
            }

            @Override // androidx.recyclerview.widget.LinearSmoothScroller
            public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
                float speedCoefficient;
                int i2;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Number) ipChange2.ipc$dispatch("bbeb1cb2", new Object[]{this, displayMetrics})).floatValue();
                }
                ScrollSpeed scrollSpeed2 = scrollSpeed;
                if (scrollSpeed2 == null) {
                    speedCoefficient = ScrollSpeed.NORMAL.getSpeedCoefficient();
                    i2 = displayMetrics.densityDpi;
                } else {
                    speedCoefficient = scrollSpeed2.getSpeedCoefficient();
                    i2 = displayMetrics.densityDpi;
                }
                return speedCoefficient / i2;
            }

            @Override // androidx.recyclerview.widget.LinearSmoothScroller, androidx.recyclerview.widget.RecyclerView.SmoothScroller
            public void onTargetFound(View view, RecyclerView.State state, RecyclerView.SmoothScroller.Action action) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("43a25518", new Object[]{this, view, state, action});
                    return;
                }
                int calculateDxToMakeVisible = calculateDxToMakeVisible(view, -1);
                int calculateDyToMakeVisible = calculateDyToMakeVisible(view, -1);
                int sqrt = (int) Math.sqrt((calculateDxToMakeVisible * calculateDxToMakeVisible) + (calculateDyToMakeVisible * calculateDyToMakeVisible));
                if (sqrt > 0) {
                    action.update(-calculateDxToMakeVisible, -calculateDyToMakeVisible, calculateTimeForDeceleration(sqrt), this.mDecelerateInterpolator);
                }
            }
        };
        linearSmoothScroller.setTargetPosition(i);
        this.mLinearLayoutManager.startSmoothScroll(linearSmoothScroller);
        notifyWillAppear(i);
    }

    private void notifyWillAppear(View view) {
        RecyclerView.LayoutManager layoutManager;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf191abb", new Object[]{this, view});
        } else if (view != null && (layoutManager = getLayoutManager()) != null) {
            notifyWillAppear(layoutManager.getPosition(view));
        }
    }

    public DetailVerticalRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context);
    }

    public DetailVerticalRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context);
    }
}
