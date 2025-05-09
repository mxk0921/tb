package com.taobao.tao.flexbox.layoutmanager.view.swipeRefresh;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Scroller;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tab2liveroom.liveroom.topAvatar.a;
import com.taobao.taobao.R;
import com.taobao.uikit.feature.features.internal.pullrefresh.CustomProgressBar;
import tb.akt;
import tb.s6o;
import tb.t2o;
import tb.tfs;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class CustomSwipeRefreshLayout extends ViewGroup {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "CustomSwipeRefreshLayout";
    private static Typeface sIconfont;
    private static int sReference = 0;
    private TextView mArrow;
    private int mFirstStageOffset;
    private ViewGroup mFirstStageView;
    private c mOnRefreshListener;
    private CustomProgressBar mProgressBar;
    private RecyclerView mRecyclerView;
    private TextView mRefreshTipText;
    private Scroller mScroller;
    private LinearLayout mSecondView;
    private float mStartY;
    private View mTarget;
    private float mTempY;
    private boolean enableFirstStage = true;
    private int mFirstStageHeight = 0;
    private boolean mIsFirstStageShowing = false;
    private int mSecondStageHeight = 1200;
    private boolean mIsRefreshing = false;
    private boolean mIntercepting = false;
    private float mDragRate = 3.1f;
    private int mFirstStageHotZoneHeight = 0;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements View.OnLayoutChangeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f12406a;

        public a(boolean z) {
            this.f12406a = z;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("899df952", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8)});
                return;
            }
            int i9 = i4 - i2;
            if (i9 > 0) {
                CustomSwipeRefreshLayout customSwipeRefreshLayout = CustomSwipeRefreshLayout.this;
                CustomSwipeRefreshLayout.access$002(customSwipeRefreshLayout, i9 - s6o.c(customSwipeRefreshLayout.getContext(), 10));
                CustomSwipeRefreshLayout customSwipeRefreshLayout2 = CustomSwipeRefreshLayout.this;
                CustomSwipeRefreshLayout.access$102(customSwipeRefreshLayout2, s6o.c(customSwipeRefreshLayout2.getContext(), 12));
            }
            if (this.f12406a && i8 - i6 != i9 && CustomSwipeRefreshLayout.access$200(CustomSwipeRefreshLayout.this)) {
                CustomSwipeRefreshLayout.this.showFirstStageWhenStart();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (CustomSwipeRefreshLayout.access$300(CustomSwipeRefreshLayout.this) != null && CustomSwipeRefreshLayout.access$200(CustomSwipeRefreshLayout.this)) {
                CustomSwipeRefreshLayout customSwipeRefreshLayout = CustomSwipeRefreshLayout.this;
                CustomSwipeRefreshLayout.access$002(customSwipeRefreshLayout, CustomSwipeRefreshLayout.access$300(customSwipeRefreshLayout).getMeasuredHeight());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface c {
    }

    static {
        t2o.a(503317525);
    }

    public CustomSwipeRefreshLayout(Context context, View view, ViewGroup viewGroup, int i) {
        super(context);
        this.mTarget = view;
        this.mFirstStageView = viewGroup;
        this.mFirstStageOffset = i;
        init(context);
    }

    public static /* synthetic */ int access$002(CustomSwipeRefreshLayout customSwipeRefreshLayout, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3a15b377", new Object[]{customSwipeRefreshLayout, new Integer(i)})).intValue();
        }
        customSwipeRefreshLayout.mFirstStageHeight = i;
        return i;
    }

    public static /* synthetic */ int access$102(CustomSwipeRefreshLayout customSwipeRefreshLayout, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("231d7878", new Object[]{customSwipeRefreshLayout, new Integer(i)})).intValue();
        }
        customSwipeRefreshLayout.mFirstStageHotZoneHeight = i;
        return i;
    }

    public static /* synthetic */ boolean access$200(CustomSwipeRefreshLayout customSwipeRefreshLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7d63d3e3", new Object[]{customSwipeRefreshLayout})).booleanValue();
        }
        return customSwipeRefreshLayout.enableFirstStage;
    }

    public static /* synthetic */ ViewGroup access$300(CustomSwipeRefreshLayout customSwipeRefreshLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("a2b6f997", new Object[]{customSwipeRefreshLayout});
        }
        return customSwipeRefreshLayout.mFirstStageView;
    }

    private boolean canChildScrollUp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e81f6c1f", new Object[]{this})).booleanValue();
        }
        return this.mRecyclerView.canScrollVertically(-1);
    }

    private void closeRefreshLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("842cc4d4", new Object[]{this});
            return;
        }
        smoothScrollTo(0);
        setFirstStageState(false);
        setSecondStageState(false);
    }

    private void disAllowIntercept() {
        RecyclerView recyclerView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("606ad8ae", new Object[]{this});
        } else if (akt.m() && (recyclerView = this.mRecyclerView) != null && recyclerView.getAdapter() != null && this.mRecyclerView.getAdapter().getItemCount() > 5) {
            tfs.g(TAG, "disAllowIntercept,requestDisallowInterceptTouchEvent(true)");
            requestDisallowInterceptTouchEvent(true);
        }
    }

    private RecyclerView findRecyclerView(ViewGroup viewGroup) {
        RecyclerView findRecyclerView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView) ipChange.ipc$dispatch("a319e88a", new Object[]{this, viewGroup});
        }
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if ((childAt instanceof RecyclerView) && childAt.getTag(R.id.live_room_recycler_view) != null) {
                return (RecyclerView) childAt;
            }
            if (!(!(childAt instanceof ViewGroup) || (findRecyclerView = findRecyclerView((ViewGroup) childAt)) == null || findRecyclerView.getTag(R.id.live_room_recycler_view) == null)) {
                return findRecyclerView;
            }
        }
        return null;
    }

    public static int getRecyclerViewTagId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("41d96b75", new Object[0])).intValue();
        }
        return R.id.live_room_recycler_view;
    }

    private void init(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
            return;
        }
        setClipChildren(false);
        this.mScroller = new Scroller(context);
        setFirstStageState(false);
        addView(this.mFirstStageView, new ViewGroup.LayoutParams(-1, -2));
        this.mFirstStageView.post(new b());
        this.mSecondView = new LinearLayout(context);
        createSecondView();
        this.mRecyclerView = findRecyclerView((ViewGroup) this.mTarget);
    }

    public static /* synthetic */ Object ipc$super(CustomSwipeRefreshLayout customSwipeRefreshLayout, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 650865254) {
            super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
            return null;
        } else if (hashCode == 949399698) {
            super.onDetachedFromWindow();
            return null;
        } else if (hashCode == 1626033557) {
            super.onAttachedToWindow();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/tao/flexbox/layoutmanager/view/swipeRefresh/CustomSwipeRefreshLayout");
        }
    }

    private boolean isPointInsideView(float f, float f2, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1a54f8a8", new Object[]{this, new Float(f), new Float(f2), view})).booleanValue();
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        int width = view.getWidth();
        int height = view.getHeight();
        if (f < i || f > i + width || f2 < i2 || f2 > i2 + height) {
            return false;
        }
        return true;
    }

    private void setFirstStageState(boolean z) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e042c18c", new Object[]{this, new Boolean(z)});
        } else if (this.enableFirstStage) {
            ViewGroup viewGroup = this.mFirstStageView;
            if (!z) {
                i = 4;
            }
            viewGroup.setVisibility(i);
            this.mIsFirstStageShowing = z;
        }
    }

    private void smoothScrollTo(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a600b26", new Object[]{this, new Integer(i)});
            return;
        }
        this.mScroller.startScroll(0, getScrollY(), 0, i - getScrollY());
        invalidate();
    }

    public void bringFirstView2Front() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("485d7a61", new Object[]{this});
            return;
        }
        ViewGroup viewGroup = this.mFirstStageView;
        if (viewGroup != null) {
            viewGroup.bringToFront();
        }
    }

    public void closeFirstStageView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67a97512", new Object[]{this});
        } else if (this.mIsFirstStageShowing) {
            setRefreshing(false);
            setFirstStageState(false);
            setSecondStageState(false);
            smoothScrollTo(0);
        }
    }

    @Override // android.view.View
    public void computeScroll() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cab3086b", new Object[]{this});
        } else if (this.mScroller.computeScrollOffset()) {
            scrollTo(0, this.mScroller.getCurrY());
            postInvalidate();
        }
    }

    public LinearLayout getSecondView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinearLayout) ipChange.ipc$dispatch("c7e1ca8d", new Object[]{this});
        }
        return this.mSecondView;
    }

    public boolean isFirstStageShowing() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b9c60bb8", new Object[]{this})).booleanValue();
        }
        return this.mIsFirstStageShowing;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        this.mArrow.setTypeface(null);
        int i = sReference - 1;
        sReference = i;
        if (i == 0) {
            sIconfont = null;
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        if (this.mIsRefreshing) {
            setRefreshing(false);
            return true;
        } else if (!this.mIsFirstStageShowing || !isPointInsideView(motionEvent.getX(), motionEvent.getY(), this.mFirstStageView)) {
            int action = motionEvent.getAction();
            if (action == 0) {
                float y = motionEvent.getY();
                this.mStartY = y;
                this.mTempY = y;
                this.mIntercepting = false;
                if (akt.l() && canChildScrollUp() && this.mIsFirstStageShowing) {
                    this.mIntercepting = false;
                    closeFirstStageView();
                }
            } else if (action != 1) {
                if (action == 2) {
                    float y2 = motionEvent.getY() - this.mStartY;
                    if ((y2 > 0.0f && !canChildScrollUp()) || (y2 < 0.0f && getScrollY() < 0)) {
                        this.mIntercepting = true;
                    }
                } else if (action == 3) {
                    this.mIntercepting = false;
                }
            } else if (this.mIsFirstStageShowing && !isPointInsideView(motionEvent.getX(), motionEvent.getY(), this.mFirstStageView)) {
                closeRefreshLayout();
                this.mIntercepting = false;
            }
            return this.mIntercepting;
        } else {
            disAllowIntercept();
            return false;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        int measuredWidth = getMeasuredWidth();
        if (this.enableFirstStage) {
            ViewGroup viewGroup = this.mFirstStageView;
            int i5 = this.mFirstStageHotZoneHeight;
            viewGroup.layout(0, (-this.mFirstStageHeight) + i5, measuredWidth, i5);
        }
        int measuredWidth2 = (measuredWidth - this.mSecondView.getMeasuredWidth()) / 2;
        int c2 = ((-this.mFirstStageHeight) + s6o.c(getContext(), 12)) - (this.mSecondView.getMeasuredHeight() / 2);
        LinearLayout linearLayout = this.mSecondView;
        linearLayout.layout(measuredWidth2, c2, linearLayout.getMeasuredWidth() + measuredWidth2, this.mSecondView.getMeasuredHeight() + c2);
        int measuredHeight = getMeasuredHeight();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        this.mTarget.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        super.onMeasure(i, i2);
        CustomProgressBar customProgressBar = this.mProgressBar;
        if (customProgressBar != null) {
            customProgressBar.setPullDownDistance(getMeasuredHeight());
        }
        measureChildren(i, i2);
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
    }

    public void setFirstBlankView(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d25cbb91", new Object[]{this, viewGroup});
            return;
        }
        ViewGroup viewGroup2 = this.mFirstStageView;
        if (viewGroup2 != null) {
            viewGroup2.removeAllViews();
            this.mFirstStageView.addView(viewGroup);
        }
    }

    public void setFirstStageView(View view, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81230b3e", new Object[]{this, view, new Boolean(z)});
        } else if (this.enableFirstStage) {
            this.mFirstStageView.removeAllViews();
            this.mFirstStageView.addView(view, new ViewGroup.LayoutParams(-1, -2));
            view.addOnLayoutChangeListener(new a(z));
        }
    }

    public void setOnRefreshListener(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fc889f7", new Object[]{this, cVar});
        } else {
            this.mOnRefreshListener = cVar;
        }
    }

    public void setProgress(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bf028ca", new Object[]{this, new Float(f)});
        } else if (getMeasuredHeight() != 0) {
            this.mProgressBar.changeProgressBarState((int) (f * getMeasuredHeight()));
        }
    }

    public void setRefreshing(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("706bb7a4", new Object[]{this, new Boolean(z)});
            return;
        }
        this.mIsRefreshing = z;
        if (!z) {
            if (this.mIsFirstStageShowing) {
                setFirstStageState(true);
            }
            setSecondStageState(false);
            this.mProgressBar.stopLoadingAnimation();
            invalidate();
        }
    }

    public void setSecondStageState(boolean z) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88d3a884", new Object[]{this, new Boolean(z)});
            return;
        }
        LinearLayout linearLayout = this.mSecondView;
        if (!z) {
            i = 4;
        }
        linearLayout.setVisibility(i);
    }

    public void setTarget(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3de402f8", new Object[]{this, view});
            return;
        }
        this.mTarget = view;
        this.mRecyclerView = findRecyclerView((ViewGroup) view);
    }

    public void showFirstStageWhenStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2810aa84", new Object[]{this});
            return;
        }
        smoothScrollTo(((-this.mFirstStageOffset) - this.mFirstStageHeight) + this.mFirstStageHotZoneHeight);
        setFirstStageState(true);
        setSecondStageState(false);
        c cVar = this.mOnRefreshListener;
        if (cVar != null && this.enableFirstStage) {
            ((a.C0490a) cVar).c(this.mIsFirstStageShowing, true);
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
        if (sIconfont == null) {
            try {
                sIconfont = Typeface.createFromAsset(getContext().getAssets(), "uik_core_iconfont.ttf");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        this.mArrow.setTypeface(sIconfont);
        sReference++;
    }

    public void setEnableFirstStage(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eb83e7a", new Object[]{this, new Boolean(z)});
            return;
        }
        tfs.e(TAG, "setEnableFirstStage:" + z);
        this.enableFirstStage = z;
        if (!z) {
            setFirstStageState(false);
            removeView(this.mFirstStageView);
            this.mIsFirstStageShowing = false;
            this.mFirstStageHeight = 0;
            this.mFirstStageOffset = 0;
        }
    }

    private void createSecondView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbd9dd5c", new Object[]{this});
            return;
        }
        float f = getResources().getDisplayMetrics().density;
        this.mSecondView.setOrientation(1);
        this.mSecondView.setGravity(17);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setGravity(17);
        linearLayout.setOrientation(0);
        linearLayout.setPadding((int) (f * 12.0f), 0, (int) (15.0f * f), 0);
        linearLayout.setBackgroundResource(R.drawable.gg_pull_refresh_bg);
        this.mSecondView.addView(linearLayout, new ViewGroup.LayoutParams(-2, (int) (36.0f * f)));
        FrameLayout frameLayout = new FrameLayout(getContext());
        linearLayout.addView(frameLayout, new LinearLayout.LayoutParams(-2, -2));
        TextView textView = new TextView(getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        frameLayout.addView(textView, layoutParams);
        this.mArrow = textView;
        textView.setIncludeFontPadding(false);
        this.mArrow.setTextColor(-6710887);
        this.mArrow.setText(getContext().getResources().getString(R.string.uik_refresh_arrow));
        CustomProgressBar customProgressBar = new CustomProgressBar(getContext());
        this.mProgressBar = customProgressBar;
        customProgressBar.setPaintColor(-6710887);
        int i = (int) (24.0f * f);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i, i);
        layoutParams2.gravity = 16;
        frameLayout.addView(this.mProgressBar, layoutParams2);
        TextView textView2 = new TextView(getContext());
        this.mRefreshTipText = textView2;
        textView2.setText("下拉刷新");
        this.mRefreshTipText.setTextSize(12.0f);
        this.mRefreshTipText.setTextColor(-6710887);
        this.mRefreshTipText.setMaxLines(3);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.leftMargin = (int) (f * 9.0f);
        linearLayout.addView(this.mRefreshTipText, layoutParams3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0033, code lost:
        if (r3 != 3) goto L_0x019c;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r14) {
        /*
            Method dump skipped, instructions count: 422
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.flexbox.layoutmanager.view.swipeRefresh.CustomSwipeRefreshLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public CustomSwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context);
    }

    public CustomSwipeRefreshLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context);
    }
}
