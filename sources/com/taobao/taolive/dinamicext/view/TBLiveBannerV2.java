package com.taobao.taolive.dinamicext.view;

import android.content.Context;
import android.graphics.Color;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.taolive.uikit.view.TBLIndicatorView;
import java.util.ArrayList;
import java.util.Iterator;
import tb.owo;
import tb.t2d;
import tb.t2o;
import tb.v5d;
import tb.vhr;
import tb.wvt;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class TBLiveBannerV2 extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int DEFAULT_CYCLE_INTERVAL_MILLS = 3000;
    private static final int MAX_CACHE_SIZE = 5;
    private SimpleAdapter mAdapter;
    private t2d mCardChangeListener;
    private ArrayList<View> mChildViews;
    public TBLIndicatorView mIndicator;
    private float mRatio;
    private wvt mTimer;
    private ViewPager.PageTransformer mTransformer;
    public ViewPager mViewPager;
    private int mScrollInterval = 3000;
    public v5d mCInfo = new v5d();
    private wvt.a mTimerHandlerListener = new a();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class BigSmallPageTransformer implements ViewPager.PageTransformer {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final int f13003a;

        static {
            t2o.a(779092462);
        }

        public BigSmallPageTransformer(TBLiveBannerV2 tBLiveBannerV2, Context context) {
            this.f13003a = owo.g(context);
        }

        @Override // androidx.viewpager.widget.ViewPager.PageTransformer
        public void transformPage(View view, float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7b6a8f50", new Object[]{this, view, new Float(f)});
                return;
            }
            View b = vhr.b("bottomMaskView", view);
            View b2 = vhr.b("bottomBlackMaskView", view);
            if (f < -1.0f) {
                if (b != null) {
                    b.setAlpha(0.0f);
                }
                if (b2 != null) {
                    b2.setAlpha(1.0f);
                }
            } else if (f < 0.0f) {
                view.setTranslationX(this.f13003a * Math.abs(f) * (-0.03f));
                float f2 = 1.0f + f;
                float f3 = (0.120000005f * f2) + 0.88f;
                view.setScaleX(f3);
                view.setScaleY(f3);
                if (b != null) {
                    b.setAlpha(f2);
                }
                if (b2 != null) {
                    b2.setAlpha(Math.abs(f));
                }
            } else if (f == 0.0f) {
                view.setTranslationX(0.0f);
                view.setScaleX(1.0f);
                view.setScaleY(1.0f);
                if (b != null) {
                    b.setAlpha(1.0f);
                }
                if (b2 != null) {
                    b2.setAlpha(0.0f);
                }
            } else if (f < 1.0f) {
                view.setTranslationX(this.f13003a * f * (-0.03f));
                float f4 = 1.0f - f;
                float f5 = (0.120000005f * f4) + 0.88f;
                view.setScaleX(f5);
                view.setScaleY(f5);
                if (b != null) {
                    b.setAlpha(f4);
                }
                if (b2 != null) {
                    b2.setAlpha(f);
                }
            } else {
                view.setTranslationX(this.f13003a * (-0.03f));
                view.setScaleX(0.88f);
                view.setScaleY(0.88f);
                if (b != null) {
                    b.setAlpha(0.0f);
                }
                if (b2 != null) {
                    b2.setAlpha(1.0f);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class SimpleAdapter extends PagerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final ArrayList<View> f13004a;

        static {
            t2o.a(779092463);
        }

        public SimpleAdapter(ArrayList<View> arrayList) {
            this.f13004a = arrayList;
        }

        public static /* synthetic */ Object ipc$super(SimpleAdapter simpleAdapter, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/dinamicext/view/TBLiveBannerV2$SimpleAdapter");
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2a141ccc", new Object[]{this, viewGroup, new Integer(i), obj});
            } else if (getRealCount() == 0) {
                viewGroup.removeView((View) obj);
            } else if (getRealCount() > 5) {
                viewGroup.removeView(this.f13004a.get(i(i)));
            }
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getCount() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("4fed2753", new Object[]{this})).intValue();
            }
            ArrayList<View> arrayList = this.f13004a;
            if (arrayList == null || arrayList.size() == 0) {
                return 0;
            }
            if (1 == this.f13004a.size()) {
                return 1;
            }
            return getRealCount() * 1000;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getItemPosition(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("304bee8", new Object[]{this, obj})).intValue();
            }
            return -2;
        }

        public int getRealCount() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("3e642a55", new Object[]{this})).intValue();
            }
            ArrayList<View> arrayList = this.f13004a;
            if (arrayList == null || arrayList.size() == 0) {
                return 0;
            }
            if (1 == this.f13004a.size()) {
                return 1;
            }
            int i = TBLiveBannerV2.this.mCInfo.f29790a;
            if (-1 != i) {
                return i;
            }
            return this.f13004a.size();
        }

        public int h() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("44e9bc51", new Object[]{this})).intValue();
            }
            ArrayList<View> arrayList = this.f13004a;
            if (arrayList == null || 1 == arrayList.size()) {
                return 0;
            }
            return getRealCount() * 500;
        }

        public final int i(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("ff70a612", new Object[]{this, new Integer(i)})).intValue();
            }
            if (-1 != TBLiveBannerV2.this.mCInfo.f29790a && this.f13004a.size() != 0) {
                return i % this.f13004a.size();
            }
            if (getRealCount() != 0) {
                return i % getRealCount();
            }
            return i;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public Object instantiateItem(ViewGroup viewGroup, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("1038d332", new Object[]{this, viewGroup, new Integer(i)});
            }
            if (getRealCount() == 0) {
                return null;
            }
            int i2 = i(i);
            View view = this.f13004a.get(i2);
            viewGroup.removeView(view);
            viewGroup.addView(view);
            if (TBLiveBannerV2.access$100(TBLiveBannerV2.this) != null) {
                TBLiveBannerV2.access$100(TBLiveBannerV2.this).a(i2);
            }
            return view;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public boolean isViewFromObject(View view, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("9e758b33", new Object[]{this, view, obj})).booleanValue();
            }
            if (view == obj) {
                return true;
            }
            return false;
        }

        public void j() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a6532022", new Object[]{this});
            } else {
                this.f13004a.clear();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements wvt.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.wvt.a
        public void a() {
            int count;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("82685e6c", new Object[]{this});
                return;
            }
            ViewPager viewPager = TBLiveBannerV2.this.mViewPager;
            if (viewPager != null && viewPager.getAdapter() != null && (count = TBLiveBannerV2.this.mViewPager.getAdapter().getCount()) != 0) {
                TBLiveBannerV2.this.mViewPager.setCurrentItem((TBLiveBannerV2.this.mViewPager.getCurrentItem() + 1) % count, true);
            }
        }

        @Override // tb.wvt.a
        public int b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("68e91c96", new Object[]{this})).intValue();
            }
            return 0;
        }
    }

    static {
        t2o.a(779092459);
        t2o.a(779093577);
        t2o.a(779093579);
    }

    public TBLiveBannerV2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context, attributeSet, i);
    }

    public static /* synthetic */ SimpleAdapter access$000(TBLiveBannerV2 tBLiveBannerV2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SimpleAdapter) ipChange.ipc$dispatch("591a443c", new Object[]{tBLiveBannerV2});
        }
        return tBLiveBannerV2.mAdapter;
    }

    public static /* synthetic */ t2d access$100(TBLiveBannerV2 tBLiveBannerV2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (t2d) ipChange.ipc$dispatch("cdd3603e", new Object[]{tBLiveBannerV2});
        }
        return tBLiveBannerV2.mCardChangeListener;
    }

    public static /* synthetic */ ViewPager.PageTransformer access$200(TBLiveBannerV2 tBLiveBannerV2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewPager.PageTransformer) ipChange.ipc$dispatch("5a458c66", new Object[]{tBLiveBannerV2});
        }
        return tBLiveBannerV2.mTransformer;
    }

    public static /* synthetic */ int access$300(TBLiveBannerV2 tBLiveBannerV2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("238dcc97", new Object[]{tBLiveBannerV2})).intValue();
        }
        return tBLiveBannerV2.getViewPagerClientWidth();
    }

    private void disableAutoScroll() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ba0a0eb", new Object[]{this});
            return;
        }
        stopTimer();
        this.mTimer = null;
    }

    private void doTimerEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d625591c", new Object[]{this, motionEvent});
        } else if (this.mTimer != null) {
            int action = motionEvent.getAction();
            if (action == 0) {
                stopTimer();
            }
            if (action == 1 || action == 3) {
                startTimer();
            }
        }
    }

    private int getViewPagerClientWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2c71c52d", new Object[]{this})).intValue();
        }
        ViewPager viewPager = this.mViewPager;
        if (viewPager != null) {
            return (viewPager.getMeasuredWidth() - this.mViewPager.getPaddingLeft()) - this.mViewPager.getPaddingRight();
        }
        return 1;
    }

    private void init(Context context, AttributeSet attributeSet, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa26a346", new Object[]{this, context, attributeSet, new Integer(i)});
            return;
        }
        this.mCInfo.getClass();
        this.mCInfo.getClass();
        this.mCInfo.f29790a = -1;
        initAttr(context, attributeSet, i);
        initView();
    }

    private void initAttr(Context context, AttributeSet attributeSet, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d31a655", new Object[]{this, context, attributeSet, new Integer(i)});
            return;
        }
        this.mScrollInterval = 3000;
        this.mRatio = 0.3125f;
    }

    private void initTimer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fb3ce1c", new Object[]{this});
        } else if (this.mScrollInterval != 0) {
            if (this.mTimer != null) {
                disableAutoScroll();
            }
            this.mTimer = new wvt(this.mTimerHandlerListener, this.mScrollInterval, Looper.getMainLooper());
            startTimer();
        }
    }

    private void initView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce529ddc", new Object[]{this});
            return;
        }
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(getContext()).inflate(R.layout.tbliveuikit_banner_v2_layout, (ViewGroup) null, false);
        if (viewGroup != null) {
            ViewPager viewPager = (ViewPager) viewGroup.findViewById(R.id.tbliveuikit_banner_viewpager);
            this.mViewPager = viewPager;
            if (viewPager != null) {
                this.mViewPager.setPadding(0, 0, owo.e(getContext(), "153ap", (int) (owo.g(getContext()) * 0.408f)), 0);
                int e = owo.e(getContext(), "216ap", 0);
                int indexOfChild = viewGroup.indexOfChild(this.mViewPager);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, e);
                viewGroup.removeView(this.mViewPager);
                viewGroup.addView(this.mViewPager, indexOfChild, layoutParams);
            }
            TBLIndicatorView tBLIndicatorView = (TBLIndicatorView) viewGroup.findViewById(R.id.tbliveuikit_banner_indicator);
            this.mIndicator = tBLIndicatorView;
            if (tBLIndicatorView != null) {
                tBLIndicatorView.setFocusColor(Color.parseColor("#ff2851"));
            }
            addView(viewGroup);
            setRatio(0.576f);
            setAutoScroll(10500);
            setBackgroundColor(0);
            this.mTransformer = new BigSmallPageTransformer(this, getContext());
            this.mViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() { // from class: com.taobao.taolive.dinamicext.view.TBLiveBannerV2.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
                public void onPageScrollStateChanged(int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("6581cc1e", new Object[]{this, new Integer(i)});
                    } else if (i == 0 && TBLiveBannerV2.access$200(TBLiveBannerV2.this) != null) {
                        int scrollX = TBLiveBannerV2.this.mViewPager.getScrollX();
                        int childCount = TBLiveBannerV2.this.mViewPager.getChildCount();
                        for (int i2 = 0; i2 < childCount; i2++) {
                            View childAt = TBLiveBannerV2.this.mViewPager.getChildAt(i2);
                            if (!((ViewPager.LayoutParams) childAt.getLayoutParams()).isDecor) {
                                TBLiveBannerV2.access$200(TBLiveBannerV2.this).transformPage(childAt, (childAt.getLeft() - scrollX) / TBLiveBannerV2.access$300(TBLiveBannerV2.this));
                            }
                        }
                    }
                }

                @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
                public void onPageScrolled(int i, float f, int i2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f4c13b05", new Object[]{this, new Integer(i), new Float(f), new Integer(i2)});
                    }
                }

                @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
                public void onPageSelected(int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("184d6f33", new Object[]{this, new Integer(i)});
                        return;
                    }
                    if (!(TBLiveBannerV2.access$000(TBLiveBannerV2.this) == null || TBLiveBannerV2.access$000(TBLiveBannerV2.this).getRealCount() == 0)) {
                        i %= TBLiveBannerV2.access$000(TBLiveBannerV2.this).getRealCount();
                    }
                    TBLiveBannerV2.this.mIndicator.setIndex(i);
                    if (TBLiveBannerV2.access$100(TBLiveBannerV2.this) != null) {
                        TBLiveBannerV2.access$100(TBLiveBannerV2.this).b(i);
                    }
                }
            });
            this.mViewPager.setOffscreenPageLimit(2);
            this.mViewPager.setPageTransformer(true, this.mTransformer);
        }
    }

    public static /* synthetic */ Object ipc$super(TBLiveBannerV2 tBLiveBannerV2, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -270519527:
                super.onFinishTemporaryDetach();
                return null;
            case 348684699:
                super.onVisibilityChanged((View) objArr[0], ((Number) objArr[1]).intValue());
                return null;
            case 650865254:
                super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case 949399698:
                super.onDetachedFromWindow();
                return null;
            case 1626033557:
                super.onAttachedToWindow();
                return null;
            case 1861606664:
                super.onStartTemporaryDetach();
                return null;
            case 2075560917:
                return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/dinamicext/view/TBLiveBannerV2");
        }
    }

    private void startTimer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edfb8b0a", new Object[]{this});
            return;
        }
        wvt wvtVar = this.mTimer;
        if (wvtVar != null && this.mViewPager != null && wvtVar.b()) {
            this.mTimer.c(this.mTimerHandlerListener);
            this.mTimer.removeCallbacksAndMessages(null);
            this.mTimer.f(0);
            this.mTimer.e(false);
        }
    }

    private void stopTimer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b325b6a", new Object[]{this});
            return;
        }
        wvt wvtVar = this.mTimer;
        if (wvtVar != null && this.mViewPager != null && !wvtVar.b()) {
            this.mTimer.removeCallbacksAndMessages(null);
            this.mTimer.c(null);
            this.mTimer.e(true);
        }
    }

    public void addChildView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51bfb6ab", new Object[]{this, view});
            return;
        }
        if (this.mChildViews == null) {
            this.mChildViews = new ArrayList<>();
        }
        if (view != null) {
            this.mChildViews.add(view);
        }
    }

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        disableAutoScroll();
        this.mCInfo.f29790a = -1;
        SimpleAdapter simpleAdapter = (SimpleAdapter) this.mViewPager.getAdapter();
        if (simpleAdapter != null) {
            simpleAdapter.j();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
        }
        doTimerEvent(motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    public v5d getInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (v5d) ipChange.ipc$dispatch("d003153", new Object[]{this});
        }
        return this.mCInfo;
    }

    public void makeView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("960c80ba", new Object[]{this});
        } else if (this.mChildViews != null) {
            SimpleAdapter simpleAdapter = this.mAdapter;
            if (simpleAdapter == null) {
                SimpleAdapter simpleAdapter2 = new SimpleAdapter(this.mChildViews);
                this.mAdapter = simpleAdapter2;
                setAdapter(simpleAdapter2);
                return;
            }
            simpleAdapter.notifyDataSetChanged();
            this.mIndicator.setTotal(this.mAdapter.getRealCount());
        }
    }

    public boolean needLazyLoad() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4c7455bb", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        startTimer();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        stopTimer();
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efe03319", new Object[]{this});
            return;
        }
        super.onFinishTemporaryDetach();
        startTimer();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            super.onMeasure(i, i2);
        }
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ef5dd08", new Object[]{this});
            return;
        }
        super.onStartTemporaryDetach();
        stopTimer();
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14c8819b", new Object[]{this, view, new Integer(i)});
            return;
        }
        super.onVisibilityChanged(view, i);
        if (i == 0) {
            startTimer();
        } else {
            stopTimer();
        }
    }

    public void pause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
        }
    }

    public void removeChildViews() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4d36fdd", new Object[]{this});
            return;
        }
        ArrayList<View> arrayList = this.mChildViews;
        if (arrayList != null) {
            arrayList.clear();
            SimpleAdapter simpleAdapter = this.mAdapter;
            if (simpleAdapter != null) {
                simpleAdapter.notifyDataSetChanged();
                this.mAdapter = null;
            }
        }
    }

    public void resume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("deb96e34", new Object[]{this});
        }
    }

    public void setAdapter(SimpleAdapter simpleAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70a46771", new Object[]{this, simpleAdapter});
            return;
        }
        this.mViewPager.setAdapter(simpleAdapter);
        this.mViewPager.setCurrentItem(simpleAdapter.h());
        this.mIndicator.setTotal(simpleAdapter.getRealCount());
        if (simpleAdapter.getRealCount() != 0) {
            this.mIndicator.setIndex(simpleAdapter.h() % simpleAdapter.getRealCount());
        } else {
            this.mIndicator.setIndex(0);
        }
    }

    public void setAutoScroll(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6cef2be", new Object[]{this, new Integer(i)});
            return;
        }
        this.mScrollInterval = i;
        initTimer();
    }

    public void setChildViews(ArrayList<View> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f643e54f", new Object[]{this, arrayList});
        } else if (arrayList != null && arrayList.size() > 0) {
            removeChildViews();
            Iterator<View> it = arrayList.iterator();
            while (it.hasNext()) {
                addChildView(it.next());
            }
        }
    }

    public void setCurrentCard(int i) {
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e45e555", new Object[]{this, new Integer(i)});
        } else if (i >= 0 && i < this.mChildViews.size()) {
            this.mViewPager.setCurrentItem(this.mAdapter.h() + i);
            if (i == 0 && (view = this.mChildViews.get(0)) != null) {
                View b = vhr.b("bottomMaskView", view);
                if (b != null) {
                    b.setAlpha(1.0f);
                }
                View b2 = vhr.b("bottomBlackMaskView", view);
                if (b2 != null) {
                    b2.setAlpha(0.0f);
                }
            }
            t2d t2dVar = this.mCardChangeListener;
            if (t2dVar != null) {
                t2dVar.b(i);
            }
        }
    }

    public void setLayout(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e54ca8b0", new Object[]{this, new Integer(i)});
        } else {
            setLayout(LayoutInflater.from(getContext()).inflate(i, (ViewGroup) null));
        }
    }

    public void setOnCardChangeListener(t2d t2dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a757c6ec", new Object[]{this, t2dVar});
        } else {
            this.mCardChangeListener = t2dVar;
        }
    }

    public void setRatio(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("978378f0", new Object[]{this, new Float(f)});
        } else {
            this.mRatio = f;
        }
    }

    public void setLayout(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d66bbd3f", new Object[]{this, view});
        } else if (view.findViewById(R.id.tbliveuikit_banner_viewpager) == null || view.findViewById(R.id.tbliveuikit_banner_indicator) == null) {
            throw new RuntimeException("banner need two views which's are viewpager and indicator");
        } else {
            removeAllViews();
            addView(view);
            initView();
        }
    }

    public TBLiveBannerV2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context, attributeSet, 0);
    }

    public TBLiveBannerV2(Context context) {
        super(context);
        init(context, null, 0);
    }
}
