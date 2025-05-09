package com.taobao.android.detail2.core.mainpic;

import android.content.Context;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.ptr.PullBase;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.q0j;
import tb.s0i;
import tb.t2o;
import tb.txj;
import tb.v4n;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class MainPicHorizontalRecyclerView extends RecyclerView implements v4n {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int PAGE_SCROLL_DIRECTION_LEFT = 1;
    private static final int PAGE_SCROLL_DIRECTION_RIGHT = -1;
    private float downX;
    private float downY;
    private float interceptDownX;
    private float interceptDownY;
    private Context mContext;
    private LinearLayoutManager mLinearLayoutManager;
    private s0i mMainPicScrollDeviceHelper;
    private PagerSnapHelper mPageSnapHelper;
    private int mTouchSlop;
    private List<b> mOnScrollStatusListeners = new ArrayList();
    private int mSmoothScrollTargetPosition = 0;
    private int mBeforeScrollPosition = -1;
    private List<a> mOnPageChangedListeners = new ArrayList();
    private Map<Integer, RecyclerView.ViewHolder> mPostionHolders = new HashMap();
    private float scrollSpeedPerPixelTime = 0.3f;
    private boolean isFlinging = false;
    private boolean isDragingAfterFling = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public enum ScrollDirection {
        LEFT("left"),
        RIGHT("right"),
        UP("up"),
        DOWN("down");
        
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private String direction;

        ScrollDirection(String str) {
            this.direction = str;
        }

        public static /* synthetic */ Object ipc$super(ScrollDirection scrollDirection, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail2/core/mainpic/MainPicHorizontalRecyclerView$ScrollDirection");
        }

        public static ScrollDirection valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ScrollDirection) ipChange.ipc$dispatch("64657550", new Object[]{str});
            }
            return (ScrollDirection) Enum.valueOf(ScrollDirection.class, str);
        }

        public String getDirection() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("79d83dd0", new Object[]{this});
            }
            return this.direction;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface a {
        void a(int i, int i2);

        void b(int i, int i2);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface b {
        void a(RecyclerView recyclerView, int i, int i2);

        void onInterceptTouchEvent(MotionEvent motionEvent);

        void onScrollStateChanged(RecyclerView recyclerView, int i);

        void onTouch(MotionEvent motionEvent);
    }

    static {
        t2o.a(352322130);
        t2o.a(632291347);
    }

    public MainPicHorizontalRecyclerView(Context context) {
        super(context);
        init(context);
    }

    public static /* synthetic */ s0i access$000(MainPicHorizontalRecyclerView mainPicHorizontalRecyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (s0i) ipChange.ipc$dispatch("8121c65a", new Object[]{mainPicHorizontalRecyclerView});
        }
        return mainPicHorizontalRecyclerView.mMainPicScrollDeviceHelper;
    }

    public static /* synthetic */ void access$100(MainPicHorizontalRecyclerView mainPicHorizontalRecyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e63e059d", new Object[]{mainPicHorizontalRecyclerView});
        } else {
            mainPicHorizontalRecyclerView.notifyPageChange();
        }
    }

    public static /* synthetic */ List access$200(MainPicHorizontalRecyclerView mainPicHorizontalRecyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("6bfd9b8b", new Object[]{mainPicHorizontalRecyclerView});
        }
        return mainPicHorizontalRecyclerView.mOnScrollStatusListeners;
    }

    public static /* synthetic */ boolean access$300(MainPicHorizontalRecyclerView mainPicHorizontalRecyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1840a8df", new Object[]{mainPicHorizontalRecyclerView})).booleanValue();
        }
        return mainPicHorizontalRecyclerView.isFlinging;
    }

    public static /* synthetic */ boolean access$302(MainPicHorizontalRecyclerView mainPicHorizontalRecyclerView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f172225f", new Object[]{mainPicHorizontalRecyclerView, new Boolean(z)})).booleanValue();
        }
        mainPicHorizontalRecyclerView.isFlinging = z;
        return z;
    }

    public static /* synthetic */ boolean access$402(MainPicHorizontalRecyclerView mainPicHorizontalRecyclerView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f89b04a0", new Object[]{mainPicHorizontalRecyclerView, new Boolean(z)})).booleanValue();
        }
        mainPicHorizontalRecyclerView.isDragingAfterFling = z;
        return z;
    }

    private boolean checkPinchConflictProcess(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("59183deb", new Object[]{this, motionEvent})).booleanValue();
        }
        try {
            int pointerCount = motionEvent.getPointerCount();
            txj.e(txj.TAG_GESTURE, "checkPinchConflictProcess: " + motionEvent.getActionMasked() + " pointCount = " + pointerCount);
            if (pointerCount > 1) {
                return true;
            }
            return false;
        } catch (Throwable th) {
            txj.f(txj.TAG_GESTURE, "checkPinchConflictProcess error. 未知异常.", th);
            return false;
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
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context, 0, false) { // from class: com.taobao.android.detail2.core.mainpic.MainPicHorizontalRecyclerView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail2/core/mainpic/MainPicHorizontalRecyclerView$1");
            }

            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a873752a", new Object[]{this, recyclerView, state, new Integer(i)});
                    return;
                }
                LinearSmoothScroller linearSmoothScroller = new LinearSmoothScroller(recyclerView.getContext()) { // from class: com.taobao.android.detail2.core.mainpic.MainPicHorizontalRecyclerView.1.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    public static /* synthetic */ Object ipc$super(C03931 r2, String str, Object... objArr) {
                        str.hashCode();
                        int hashCode = str.hashCode();
                        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail2/core/mainpic/MainPicHorizontalRecyclerView$1$1");
                    }

                    @Override // androidx.recyclerview.widget.LinearSmoothScroller
                    public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
                        float f;
                        IpChange ipChange3 = $ipChange;
                        if (ipChange3 instanceof IpChange) {
                            return ((Number) ipChange3.ipc$dispatch("bbeb1cb2", new Object[]{this, displayMetrics})).floatValue();
                        }
                        if (MainPicHorizontalRecyclerView.access$000(MainPicHorizontalRecyclerView.this) == null) {
                            f = 120.0f;
                        } else {
                            f = MainPicHorizontalRecyclerView.access$000(MainPicHorizontalRecyclerView.this).d();
                        }
                        return f / displayMetrics.densityDpi;
                    }
                };
                linearSmoothScroller.setTargetPosition(i);
                startSmoothScroll(linearSmoothScroller);
            }
        };
        this.mLinearLayoutManager = linearLayoutManager;
        setLayoutManager(linearLayoutManager);
        PagerSnapHelper pagerSnapHelper = new PagerSnapHelper() { // from class: com.taobao.android.detail2.core.mainpic.MainPicHorizontalRecyclerView.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass2 r2, String str, Object... objArr) {
                if (str.hashCode() == -1760828615) {
                    return super.calculateDistanceToFinalSnap((RecyclerView.LayoutManager) objArr[0], (View) objArr[1]);
                }
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail2/core/mainpic/MainPicHorizontalRecyclerView$2");
            }

            @Override // androidx.recyclerview.widget.PagerSnapHelper, androidx.recyclerview.widget.SnapHelper
            public int[] calculateDistanceToFinalSnap(RecyclerView.LayoutManager layoutManager, View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (int[]) ipChange2.ipc$dispatch("970be339", new Object[]{this, layoutManager, view});
                }
                MainPicHorizontalRecyclerView.access$100(MainPicHorizontalRecyclerView.this);
                return super.calculateDistanceToFinalSnap(layoutManager, view);
            }
        };
        this.mPageSnapHelper = pagerSnapHelper;
        pagerSnapHelper.attachToRecyclerView(this);
        addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: com.taobao.android.detail2.core.mainpic.MainPicHorizontalRecyclerView.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass3 r5, String str, Object... objArr) {
                int hashCode = str.hashCode();
                if (hashCode == -1177043419) {
                    super.onScrolled((RecyclerView) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue());
                    return null;
                } else if (hashCode == 1361287682) {
                    super.onScrollStateChanged((RecyclerView) objArr[0], ((Number) objArr[1]).intValue());
                    return null;
                } else {
                    int hashCode2 = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/detail2/core/mainpic/MainPicHorizontalRecyclerView$3");
                }
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("51239a02", new Object[]{this, recyclerView, new Integer(i)});
                    return;
                }
                super.onScrollStateChanged(recyclerView, i);
                if (i == 1) {
                    if (MainPicHorizontalRecyclerView.access$300(MainPicHorizontalRecyclerView.this)) {
                        MainPicHorizontalRecyclerView.access$402(MainPicHorizontalRecyclerView.this, true);
                    } else {
                        MainPicHorizontalRecyclerView.access$402(MainPicHorizontalRecyclerView.this, false);
                    }
                }
                if (i == 2) {
                    MainPicHorizontalRecyclerView.access$302(MainPicHorizontalRecyclerView.this, true);
                } else {
                    MainPicHorizontalRecyclerView.access$302(MainPicHorizontalRecyclerView.this, false);
                }
                for (b bVar : MainPicHorizontalRecyclerView.access$200(MainPicHorizontalRecyclerView.this)) {
                    if (bVar != null) {
                        bVar.onScrollStateChanged(recyclerView, i);
                    }
                }
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("b9d7be25", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
                    return;
                }
                super.onScrolled(recyclerView, i, i2);
                for (b bVar : MainPicHorizontalRecyclerView.access$200(MainPicHorizontalRecyclerView.this)) {
                    if (bVar != null) {
                        bVar.a(recyclerView, i, i2);
                    }
                }
            }
        });
    }

    public static /* synthetic */ Object ipc$super(MainPicHorizontalRecyclerView mainPicHorizontalRecyclerView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1447998406) {
            return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
        }
        if (hashCode == -407533570) {
            return new Boolean(super.onInterceptTouchEvent((MotionEvent) objArr[0]));
        }
        if (hashCode == 371177099) {
            super.scrollToPosition(((Number) objArr[0]).intValue());
            return null;
        }
        int hashCode2 = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/detail2/core/mainpic/MainPicHorizontalRecyclerView");
    }

    private void notifyPageChange() {
        RecyclerView.LayoutManager layoutManager;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f85a47cf", new Object[]{this});
            return;
        }
        View findSnapView = this.mPageSnapHelper.findSnapView(getLayoutManager());
        if (!(findSnapView == null || (layoutManager = getLayoutManager()) == null)) {
            int position = layoutManager.getPosition(findSnapView);
            int i = this.mSmoothScrollTargetPosition;
            this.mBeforeScrollPosition = i;
            this.mSmoothScrollTargetPosition = position;
            if (position == i) {
                for (a aVar : this.mOnPageChangedListeners) {
                    if (aVar != null) {
                        aVar.b(this.mBeforeScrollPosition, this.mSmoothScrollTargetPosition);
                    }
                }
                return;
            }
            List<a> list = this.mOnPageChangedListeners;
            if (list != null) {
                for (a aVar2 : list) {
                    if (aVar2 != null) {
                        aVar2.a(this.mBeforeScrollPosition, this.mSmoothScrollTargetPosition);
                    }
                }
            }
        }
    }

    public void addOnPageChangedListener(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("186ba7f", new Object[]{this, aVar});
            return;
        }
        if (this.mOnPageChangedListeners == null) {
            this.mOnPageChangedListeners = new ArrayList();
        }
        this.mOnPageChangedListeners.add(aVar);
    }

    public void addOnScrollStatusListener(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6317ad7c", new Object[]{this, bVar});
            return;
        }
        if (this.mOnScrollStatusListeners == null) {
            this.mOnScrollStatusListeners = new ArrayList();
        }
        this.mOnScrollStatusListeners.add(bVar);
    }

    public void clearHolders() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a201e0c1", new Object[]{this});
        } else {
            this.mPostionHolders.clear();
        }
    }

    public Map<Integer, RecyclerView.ViewHolder> getAllHolders() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("d6d6d8", new Object[]{this});
        }
        return this.mPostionHolders;
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
                return this.mPostionHolders.get(Integer.valueOf(i));
            }
            this.mPostionHolders.put(Integer.valueOf(i), findViewHolderForAdapterPosition);
            return findViewHolderForAdapterPosition;
        } catch (Exception e) {
            q0j.n("main", q0j.ERROR_CODE_COMMON_GET_HOLDER_ERROR, "getHolder调用异常", null, e);
            return null;
        }
    }

    @Override // tb.v4n
    public int getPullDirection() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f748d57e", new Object[]{this})).intValue();
        }
        return 1;
    }

    @Override // tb.v4n
    public boolean isReadyForPullEnd() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f76f3051", new Object[]{this})).booleanValue();
        }
        RecyclerView.Adapter adapter = getAdapter();
        if (!(adapter instanceof MainPicHorizontalAdapter)) {
            return false;
        }
        if (adapter.getItemCount() != 0) {
            MainPicHorizontalAdapter mainPicHorizontalAdapter = (MainPicHorizontalAdapter) adapter;
            if (mainPicHorizontalAdapter.P(this.mSmoothScrollTargetPosition) != mainPicHorizontalAdapter.T() - 1) {
                return false;
            }
        }
        return true;
    }

    @Override // tb.v4n
    public boolean isReadyForPullStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3cf0e198", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        for (b bVar : this.mOnScrollStatusListeners) {
            if (bVar != null) {
                bVar.onInterceptTouchEvent(motionEvent);
            }
        }
        if (checkPinchConflictProcess(motionEvent)) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.interceptDownX = motionEvent.getX();
            this.interceptDownY = motionEvent.getY();
        } else if (actionMasked == 2) {
            float x = motionEvent.getX();
            if (Math.abs(Math.abs(x - this.interceptDownX) / Math.abs(motionEvent.getY() - this.interceptDownY)) >= 1.0f && this.interceptDownX - x >= 0.0f) {
                RecyclerView.Adapter adapter = getAdapter();
                if (adapter instanceof MainPicHorizontalAdapter) {
                    if (this.isDragingAfterFling) {
                        MainPicHorizontalAdapter mainPicHorizontalAdapter = (MainPicHorizontalAdapter) adapter;
                        if (mainPicHorizontalAdapter.P(this.mLinearLayoutManager.findLastVisibleItemPosition()) + 1 >= mainPicHorizontalAdapter.T()) {
                            return false;
                        }
                    }
                    MainPicHorizontalAdapter mainPicHorizontalAdapter2 = (MainPicHorizontalAdapter) adapter;
                    if (mainPicHorizontalAdapter2.P(this.mSmoothScrollTargetPosition) + 1 >= mainPicHorizontalAdapter2.T()) {
                        return false;
                    }
                }
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
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
        } else if (actionMasked == 2) {
            float x = motionEvent.getX();
            if (Math.abs(Math.abs(x - this.downX) / Math.abs(motionEvent.getY() - this.downY)) >= 1.0f && this.downX - x >= 0.0f) {
                RecyclerView.Adapter adapter = getAdapter();
                if (adapter instanceof MainPicHorizontalAdapter) {
                    if (this.isDragingAfterFling) {
                        MainPicHorizontalAdapter mainPicHorizontalAdapter = (MainPicHorizontalAdapter) adapter;
                        if (mainPicHorizontalAdapter.P(this.mLinearLayoutManager.findLastVisibleItemPosition()) + 1 >= mainPicHorizontalAdapter.T()) {
                            return false;
                        }
                    }
                    MainPicHorizontalAdapter mainPicHorizontalAdapter2 = (MainPicHorizontalAdapter) adapter;
                    if (mainPicHorizontalAdapter2.P(this.mSmoothScrollTargetPosition) + 1 >= mainPicHorizontalAdapter2.T()) {
                        return false;
                    }
                }
            }
        }
        for (b bVar : this.mOnScrollStatusListeners) {
            if (bVar != null) {
                bVar.onTouch(motionEvent);
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void scrollToPosition(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("161fb68b", new Object[]{this, new Integer(i)});
            return;
        }
        super.scrollToPosition(i);
        this.mSmoothScrollTargetPosition = i;
        this.mBeforeScrollPosition = -1;
    }

    public void setMainPicScrollDeviceHelper(s0i s0iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b40b8645", new Object[]{this, s0iVar});
        } else {
            this.mMainPicScrollDeviceHelper = s0iVar;
        }
    }

    public void setScrollSpeedPerPixel(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a44db178", new Object[]{this, new Float(f)});
        } else {
            this.scrollSpeedPerPixelTime = f;
        }
    }

    public MainPicHorizontalRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context);
    }

    public MainPicHorizontalRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context);
    }
}
