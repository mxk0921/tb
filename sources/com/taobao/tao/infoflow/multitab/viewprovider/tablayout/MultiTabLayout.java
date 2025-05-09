package com.taobao.tao.infoflow.multitab.viewprovider.tablayout;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.core.view.ViewCompat;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.google.android.material.tabs.TabLayout;
import com.taobao.tao.infoflow.multitab.viewprovider.tablayout.a;
import com.taobao.tao.infoflow.multitab.viewprovider.tablayout.e;
import com.taobao.tao.util.DensityUtil;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import tb.bmv;
import tb.d9j;
import tb.fve;
import tb.phg;
import tb.t2o;
import tb.vxl;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class MultiTabLayout extends TabLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int DEFAULT_INDICATOR_BOTTOM_OFFSET_DP = 2;
    private static final int DEFAULT_INDICATOR_HEIGHT_DP = 2;
    private static final int DEFAULT_INDICATOR_RADIUS_DP = 2;
    private static final int DEFAULT_INDICATOR_WIDTH_DP = 15;
    private static final int DEFAULT_INDICATOR_WIDTH_SHOW_PILITAOP_DP = 12;
    private static final int SCROLL_STATE_CHECK_INTERVAL = 100;
    private static final String TAG = "MultiTabLayout";
    private d indicatorConfig;
    private Method mCreateTabViewMethod;
    private int mCurrentSelectIndex;
    private Paint mIndicatorPaint;
    private RectF mIndicatorRect;
    private a.AbstractC0708a mOnPreCreateListener;
    private a.d mOnScrollListener;
    private Field mParentFiled;
    private boolean mShowIndicator;
    private Constructor<TabLayout.f> mTabConstructor;
    private Field mViewFiled;
    private int mIndicatorLeft = -1;
    private float mDownX = 0.0f;
    private float mMoveX = 0.0f;
    private float lastPositionOffset = 0.0f;
    private int lastLeft = 0;
    private int mTabPaddingAp = 0;
    private final Handler mHandler = new Handler(Looper.getMainLooper());
    private final Runnable mScrollStopRunnable = new a();
    private final TabLayout.d tabSelectListener = new b();

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
            } else if (MultiTabLayout.access$000(MultiTabLayout.this) != null) {
                MultiTabLayout.access$000(MultiTabLayout.this).onScrollStopped();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements TabLayout.d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void onTabReselected(TabLayout.f fVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a1c8ee3b", new Object[]{this, fVar});
            }
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void onTabSelected(TabLayout.f fVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c48ba408", new Object[]{this, fVar});
                return;
            }
            MultiTabLayout.access$102(MultiTabLayout.this, fVar.f());
            d9j.c(MultiTabLayout.TAG, "tabSelectListener mCurrentSelectIndex:" + MultiTabLayout.access$100(MultiTabLayout.this));
            MultiTabLayout multiTabLayout = MultiTabLayout.this;
            multiTabLayout.updateIndicatorPosition(MultiTabLayout.access$100(multiTabLayout), 0.0f);
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void onTabUnselected(TabLayout.f fVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("eca6e1a1", new Object[]{this, fVar});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f12449a;

        public c(int i) {
            this.f12449a = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                MultiTabLayout.access$000(MultiTabLayout.this).b(this.f12449a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class d {

        /* renamed from: a  reason: collision with root package name */
        public int f12450a;
        public int b;
        public int c;
        public int d;
        public int e;

        static {
            t2o.a(729809504);
        }

        public d(MultiTabLayout multiTabLayout) {
        }
    }

    static {
        t2o.a(729809500);
    }

    public MultiTabLayout(Context context) {
        super(context);
        init();
    }

    public static /* synthetic */ a.d access$000(MultiTabLayout multiTabLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a.d) ipChange.ipc$dispatch("9baf5e4", new Object[]{multiTabLayout});
        }
        return multiTabLayout.mOnScrollListener;
    }

    public static /* synthetic */ int access$100(MultiTabLayout multiTabLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("50b58e8b", new Object[]{multiTabLayout})).intValue();
        }
        return multiTabLayout.mCurrentSelectIndex;
    }

    public static /* synthetic */ int access$102(MultiTabLayout multiTabLayout, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f7ff5a9c", new Object[]{multiTabLayout, new Integer(i)})).intValue();
        }
        multiTabLayout.mCurrentSelectIndex = i;
        return i;
    }

    private int[] getViewCoordinates(int i) {
        View d2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("f16fd4e8", new Object[]{this, new Integer(i)});
        }
        TabLayout.f tabAt = getTabAt(i);
        if (tabAt == null || (d2 = tabAt.d()) == null) {
            return null;
        }
        Rect rect = new Rect();
        d2.getGlobalVisibleRect(rect);
        return new int[]{rect.left, rect.right};
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        Paint paint = new Paint();
        this.mIndicatorPaint = paint;
        paint.setStyle(Paint.Style.FILL);
        this.mIndicatorPaint.setAntiAlias(true);
        d dVar = new d(this);
        this.indicatorConfig = dVar;
        dVar.f12450a = DensityUtil.dip2px(getContext(), 2.0f);
        this.indicatorConfig.b = DensityUtil.dip2px(getContext(), 15.0f);
        this.indicatorConfig.d = DensityUtil.dip2px(getContext(), 2.0f);
        this.indicatorConfig.c = DensityUtil.dip2px(getContext(), 2.0f);
        this.mIndicatorRect = new RectF();
        addOnTabSelectedListener(this.tabSelectListener);
    }

    public static /* synthetic */ Object ipc$super(MultiTabLayout multiTabLayout, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1117127205:
                super.onDraw((Canvas) objArr[0]);
                return null;
            case -407533570:
                return new Boolean(super.onInterceptTouchEvent((MotionEvent) objArr[0]));
            case 798505930:
                return super.newTab();
            case 1004220751:
                super.onScrollChanged(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
                return null;
            case 1850872843:
                super.addOnTabSelectedListener((TabLayout.d) objArr[0]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/infoflow/multitab/viewprovider/tablayout/MultiTabLayout");
        }
    }

    private void setIndicatorPosition(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cadc4d06", new Object[]{this, new Integer(i)});
        } else if (i != this.mIndicatorLeft) {
            this.mIndicatorLeft = i;
            invalidate();
        }
    }

    @Override // com.google.android.material.tabs.TabLayout
    public void addOnTabSelectedListener(TabLayout.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e52140b", new Object[]{this, dVar});
        } else {
            super.addOnTabSelectedListener(dVar);
        }
    }

    public View getChildCustomView(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("da773b62", new Object[]{this, new Integer(i)});
        }
        TabLayout.f tabAt = getTabAt(i);
        if (tabAt == null) {
            return null;
        }
        return tabAt.d();
    }

    public View getChildTabView(int i) {
        View d2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bbacd88a", new Object[]{this, new Integer(i)});
        }
        TabLayout.f tabAt = getTabAt(i);
        if (tabAt == null || (d2 = tabAt.d()) == null || d2.getParent() == null) {
            return null;
        }
        return (ViewGroup) d2.getParent();
    }

    public d getIndicatorConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("32a4c0e7", new Object[]{this});
        }
        return this.indicatorConfig;
    }

    public RectF getIndicatorRect() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RectF) ipChange.ipc$dispatch("c7d36203", new Object[]{this});
        }
        return this.mIndicatorRect;
    }

    public TabLayout.f newTab(View view) {
        fve.e(TAG, "newTab .... customView");
        if (!vxl.b().B()) {
            TabLayout.f newTab = super.newTab();
            newTab.o(view);
            return newTab;
        }
        try {
            phg.e("newTab");
            long currentTimeMillis = System.currentTimeMillis();
            if (this.mTabConstructor == null) {
                Constructor<TabLayout.f> declaredConstructor = TabLayout.f.class.getDeclaredConstructor(new Class[0]);
                this.mTabConstructor = declaredConstructor;
                declaredConstructor.setAccessible(true);
            }
            TabLayout.f newInstance = this.mTabConstructor.newInstance(new Object[0]);
            newInstance.o(view);
            if (this.mParentFiled == null) {
                Field declaredField = TabLayout.f.class.getDeclaredField("h");
                this.mParentFiled = declaredField;
                declaredField.setAccessible(true);
            }
            this.mParentFiled.set(newInstance, this);
            if (this.mCreateTabViewMethod == null) {
                Method declaredMethod = TabLayout.class.getDeclaredMethod("createTabView", TabLayout.f.class);
                this.mCreateTabViewMethod = declaredMethod;
                declaredMethod.setAccessible(true);
            }
            Object invoke = this.mCreateTabViewMethod.invoke(this, newInstance);
            if (invoke instanceof LinearLayout) {
                LinearLayout linearLayout = (LinearLayout) invoke;
                linearLayout.setBackground(null);
                linearLayout.setGravity(17);
                linearLayout.setMinimumWidth(0);
                linearLayout.setPadding(0, 0, 0, 0);
            }
            if (this.mViewFiled == null) {
                Field declaredField2 = TabLayout.f.class.getDeclaredField(bmv.MSGTYPE_INTERVAL);
                this.mViewFiled = declaredField2;
                declaredField2.setAccessible(true);
            }
            this.mViewFiled.set(newInstance, invoke);
            phg.d("newTab");
            fve.e(TAG, "homeTabInitOpt...newTab, cost:" + (System.currentTimeMillis() - currentTimeMillis));
            return newInstance;
        } catch (Throwable th) {
            fve.c(TAG, "newTab .... customView error", th);
            TabLayout.f newTab2 = super.newTab();
            newTab2.o(view);
            return newTab2;
        }
    }

    @Override // com.google.android.material.tabs.TabLayout, android.view.View
    public void onDraw(Canvas canvas) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        super.onDraw(canvas);
        if (this.mShowIndicator && (i = this.mIndicatorLeft) >= 0) {
            int height = getHeight();
            d dVar = this.indicatorConfig;
            this.mIndicatorRect.set(i, (height - dVar.f12450a) - dVar.c, dVar.b + i, getHeight() - this.indicatorConfig.c);
            RectF rectF = this.mIndicatorRect;
            int i2 = this.indicatorConfig.d;
            canvas.drawRoundRect(rectF, i2, i2, this.mIndicatorPaint);
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.mDownX = motionEvent.getX();
            this.mMoveX = 0.0f;
        } else if (action == 1) {
            d9j.c(TAG, "onInterceptTouchEvent ACTION_UP mDownX:" + this.mDownX + ",mMoveX:" + this.mMoveX);
            float f = this.mMoveX;
            if (f == 0.0f || Math.abs(this.mDownX - f) <= 1.0f) {
                int[] viewCoordinates = getViewCoordinates(this.mCurrentSelectIndex);
                if (viewCoordinates == null || viewCoordinates.length < 2) {
                    d9j.c(TAG, "onInterceptTouchEvent 坐标计算异常");
                    return super.onInterceptTouchEvent(motionEvent);
                }
                float f2 = this.mDownX;
                if (f2 > viewCoordinates[1]) {
                    int findTargetSelectIndex = findTargetSelectIndex(f2, this.mCurrentSelectIndex + 1, getTabCount());
                    d9j.c(TAG, "onInterceptTouchEvent 查找右侧 targetSelectIndex:" + findTargetSelectIndex);
                    a.AbstractC0708a aVar = this.mOnPreCreateListener;
                    if (!(aVar == null || findTargetSelectIndex == -1)) {
                        ((e.j) aVar).a(findTargetSelectIndex);
                    }
                }
                float f3 = this.mDownX;
                if (f3 < viewCoordinates[0]) {
                    int findTargetSelectIndex2 = findTargetSelectIndex(f3, 0, this.mCurrentSelectIndex);
                    d9j.c(TAG, "onInterceptTouchEvent 查找左侧 targetSelectIndex:" + findTargetSelectIndex2);
                    a.AbstractC0708a aVar2 = this.mOnPreCreateListener;
                    if (aVar2 != null) {
                        ((e.j) aVar2).a(findTargetSelectIndex2);
                    }
                }
                this.mDownX = 0.0f;
                this.mMoveX = 0.0f;
            } else {
                d9j.c(TAG, "onInterceptTouchEvent 滑动拦截");
                return super.onInterceptTouchEvent(motionEvent);
            }
        } else if (action == 2) {
            this.mMoveX = motionEvent.getX();
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bdb314f", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onScrollChanged(i, i2, i3, i4);
        this.mHandler.removeCallbacksAndMessages(null);
        if (this.mOnScrollListener != null) {
            this.mHandler.post(new c(i));
        }
        if (this.mOnScrollListener != null) {
            this.mHandler.postDelayed(this.mScrollStopRunnable, 100L);
        }
    }

    public void setIndicatorBottomOffset(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3baad731", new Object[]{this, new Integer(i)});
        } else {
            this.indicatorConfig.c = i;
        }
    }

    public void setPreCreateListener(a.AbstractC0708a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27ec14b2", new Object[]{this, aVar});
        } else {
            this.mOnPreCreateListener = aVar;
        }
    }

    public void setScrollListener(a.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86b3f36f", new Object[]{this, dVar});
        } else {
            this.mOnScrollListener = dVar;
        }
    }

    public void setShowIndicator(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5627edd", new Object[]{this, new Boolean(z)});
        } else {
            this.mShowIndicator = z;
        }
    }

    public void updateIndicatorPosition(int i, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac43b33", new Object[]{this, new Integer(i), new Float(f)});
        } else if (this.mShowIndicator) {
            updateIndicatorPositionInternal(i, f);
        }
    }

    public void updateIndicatorStyle(int i, boolean z, int i2) {
        Context context;
        float f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2db88ea0", new Object[]{this, new Integer(i), new Boolean(z), new Integer(i2)});
            return;
        }
        d dVar = this.indicatorConfig;
        dVar.e = i;
        if (z) {
            context = getContext();
            f = 12.0f;
        } else {
            context = getContext();
            f = 15.0f;
        }
        dVar.b = DensityUtil.dip2px(context, f);
        this.mIndicatorPaint.setColor(i);
        this.mTabPaddingAp = i2;
        ViewCompat.postInvalidateOnAnimation(this);
    }

    private int calculateCorrectLeft(int i) {
        View childTabView;
        View view;
        int width;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3071d5e4", new Object[]{this, new Integer(i)})).intValue();
        }
        TabLayout.f tabAt = getTabAt(i);
        if (tabAt == null || (childTabView = getChildTabView(i)) == null) {
            return 0;
        }
        if (tabAt.d() instanceof FrameLayout) {
            view = tabAt.d().findViewWithTag(com.taobao.tao.infoflow.multitab.viewprovider.tablayout.c.TAB_TAG);
        } else {
            view = tabAt.d();
        }
        int left = childTabView.getLeft();
        if (view == null) {
            width = childTabView.getWidth();
            i2 = this.mTabPaddingAp;
        } else {
            width = view.getWidth();
            i2 = this.indicatorConfig.b;
        }
        return left + ((width - i2) / 2);
    }

    private void updateIndicatorPositionInternal(int i, float f) {
        int i2;
        int i3;
        int i4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("405f4d50", new Object[]{this, new Integer(i), new Float(f)});
            return;
        }
        View childTabView = getChildTabView(i);
        if (getTabAt(i) != null) {
            if (childTabView == null || childTabView.getWidth() <= 0) {
                i2 = -1;
            } else {
                View findViewWithTag = childTabView.findViewWithTag(com.taobao.tao.infoflow.multitab.viewprovider.tablayout.c.TAB_TAG);
                if (i == 0 && findViewWithTag != null) {
                    childTabView = findViewWithTag;
                }
                i2 = childTabView.getLeft() + ((childTabView.getWidth() - this.indicatorConfig.b) / 2);
                int calculateCorrectLeft = calculateCorrectLeft(i);
                int i5 = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
                if (i5 > 0 && i < getTabCount() - 1) {
                    int i6 = i + 1;
                    View childTabView2 = getChildTabView(i6);
                    if (childTabView2 != null) {
                        i2 = (int) (((childTabView2.getLeft() + ((childTabView2.getWidth() - this.indicatorConfig.b) / 2)) * f) + ((1.0f - f) * i2));
                        int calculateCorrectLeft2 = calculateCorrectLeft(i6);
                        if (i6 != 1 || f >= this.lastPositionOffset) {
                            if (f < this.lastPositionOffset) {
                                int calculateCorrectLeft3 = calculateCorrectLeft(i);
                                int i7 = this.lastLeft;
                                if (i7 == 0) {
                                    i4 = i2 - this.mTabPaddingAp;
                                } else {
                                    i4 = Math.min(i7, i2 - this.mTabPaddingAp);
                                }
                                i2 = Math.max(i4, calculateCorrectLeft3);
                            }
                            if (f == this.lastPositionOffset && (i3 = this.lastLeft) != 0) {
                                i2 = i3;
                            }
                        }
                        this.lastPositionOffset = f;
                        calculateCorrectLeft = calculateCorrectLeft2;
                    } else {
                        return;
                    }
                }
                d9j.c(TAG, "测试left：" + i2 + ",correctLeft:" + calculateCorrectLeft);
                if (!(i == 0 && i5 == 0)) {
                    i2 = Math.min(i2, calculateCorrectLeft);
                }
                this.lastLeft = i2;
            }
            setIndicatorPosition(i2);
        }
    }

    private int findTargetSelectIndex(float f, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6892d280", new Object[]{this, new Float(f), new Integer(i), new Integer(i2)})).intValue();
        }
        while (i < i2) {
            d9j.c(TAG, "查询坐标 i:" + i);
            int[] viewCoordinates = getViewCoordinates(i);
            if (viewCoordinates != null && viewCoordinates.length >= 2 && viewCoordinates[0] <= f && viewCoordinates[1] >= f) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public MultiTabLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public MultiTabLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }
}
