package com.taobao.android.weex_uikit.widget.slide;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.viewpager.widget.ViewPager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import java.lang.reflect.Field;
import java.util.List;
import tb.dwh;
import tb.t2o;
import tb.vvh;
import tb.yio;
import tb.ywh;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class SlideViewPager extends ViewPager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final Handler H = new Handler(Looper.getMainLooper());
    private SlideAdapter adapter;
    private boolean attached;
    private boolean autoPlay;
    private Runnable autoPlayRunnable = new a();
    private boolean hasTransformer;
    private boolean infinite;
    private int interval;
    private boolean scrollable;
    private boolean touching;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a extends yio {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_uikit/widget/slide/SlideViewPager$1");
        }

        @Override // tb.yio
        public void e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
                return;
            }
            SlideViewPager.access$000(SlideViewPager.this);
            SlideViewPager.access$100(SlideViewPager.this);
        }
    }

    static {
        t2o.a(986710248);
    }

    public SlideViewPager(Context context) {
        super(context);
        setOffscreenPageLimit(1);
        setOverScrollMode(2);
    }

    public static /* synthetic */ void access$000(SlideViewPager slideViewPager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b72c44c", new Object[]{slideViewPager});
        } else {
            slideViewPager.scrollToNext();
        }
    }

    public static /* synthetic */ void access$100(SlideViewPager slideViewPager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95a24c6b", new Object[]{slideViewPager});
        } else {
            slideViewPager.startAutoPlay();
        }
    }

    public static /* synthetic */ Object ipc$super(SlideViewPager slideViewPager, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1447998406:
                return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
            case -270519527:
                super.onFinishTemporaryDetach();
                return null;
            case 949399698:
                super.onDetachedFromWindow();
                return null;
            case 951016108:
                super.setPageTransformer(((Boolean) objArr[0]).booleanValue(), (ViewPager.PageTransformer) objArr[1]);
                return null;
            case 1626033557:
                super.onAttachedToWindow();
                return null;
            case 1861606664:
                super.onStartTemporaryDetach();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_uikit/widget/slide/SlideViewPager");
        }
    }

    private void onAttach() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51f7278b", new Object[]{this});
            return;
        }
        this.attached = true;
        startAutoPlay();
    }

    private void onDetach() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ed0f9d9", new Object[]{this});
            return;
        }
        this.attached = false;
        H.removeCallbacks(this.autoPlayRunnable);
    }

    private void scrollToNext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edd58c42", new Object[]{this});
            return;
        }
        SlideAdapter slideAdapter = this.adapter;
        if (slideAdapter == null || !slideAdapter.h(getCurrentItem())) {
            return;
        }
        if (vvh.n()) {
            setCurrentItem(getCurrentItem() - 1, true);
        } else {
            setCurrentItem(getCurrentItem() + 1, true);
        }
    }

    private void startAutoPlay() {
        SlideAdapter slideAdapter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96050e0c", new Object[]{this});
            return;
        }
        Handler handler = H;
        handler.removeCallbacks(this.autoPlayRunnable);
        if (this.autoPlay && this.attached && (slideAdapter = this.adapter) != null && slideAdapter.h(getCurrentItem())) {
            handler.postDelayed(this.autoPlayRunnable, this.interval * 1000);
        }
    }

    private void updatePageSize(int i, List<ywh> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("320e52d4", new Object[]{this, new Integer(i), list});
        } else if (i > 0 && list != null && list.size() > 0) {
            View view = (View) getParent();
            int width = view.getWidth() - (i * 2);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
            layoutParams.width = width;
            layoutParams.leftMargin = (view.getWidth() - width) / 2;
            setLayoutParams(layoutParams);
        }
    }

    public int getRealPosition(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ff70a612", new Object[]{this, new Integer(i)})).intValue();
        }
        SlideAdapter slideAdapter = this.adapter;
        if (slideAdapter == null) {
            return -1;
        }
        return slideAdapter.getRealPosition(i);
    }

    public boolean isTouching() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("81ad9998", new Object[]{this})).booleanValue();
        }
        return this.touching;
    }

    public void mount(MUSDKInstance mUSDKInstance, List<ywh> list, boolean z, boolean z2, boolean z3, int i, int i2, int i3) {
        SlideAdapter slideAdapter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97b2db56", new Object[]{this, mUSDKInstance, list, new Boolean(z), new Boolean(z2), new Boolean(z3), new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        this.touching = false;
        this.autoPlay = z3;
        this.scrollable = z2;
        this.infinite = z;
        if (vvh.n()) {
            slideAdapter = new SlideAdapterRTL(mUSDKInstance);
        } else {
            slideAdapter = new SlideNewAdapter(mUSDKInstance);
        }
        this.adapter = slideAdapter;
        slideAdapter.m(this.hasTransformer);
        if (i3 != 0) {
            setClipChildren(false);
            ((SlideContainer) getParent()).setClipChildren(false);
            if (list.size() >= 5) {
                setOffscreenPageLimit(2);
            } else {
                setOffscreenPageLimit(1);
            }
        }
        setAdapter(this.adapter);
        this.adapter.j(list, z);
        this.adapter.l(this, i);
        this.interval = i2;
        startAutoPlay();
        updatePageSize(i3, list);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        onAttach();
        try {
            Field declaredField = ViewPager.class.getDeclaredField("mFirstLayout");
            declaredField.setAccessible(true);
            declaredField.set(this, Boolean.FALSE);
            if (getAdapter() != null) {
                getAdapter().notifyDataSetChanged();
            }
            setCurrentItem(getCurrentItem());
        } catch (Exception e) {
            dwh.i(e);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        onDetach();
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efe03319", new Object[]{this});
            return;
        }
        super.onFinishTemporaryDetach();
        onAttach();
    }

    public void onPagerDragging() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9aeca59a", new Object[]{this});
        } else {
            H.removeCallbacks(this.autoPlayRunnable);
        }
    }

    public void onScrollSettled() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c25ef354", new Object[]{this});
            return;
        }
        SlideAdapter slideAdapter = this.adapter;
        if (slideAdapter != null) {
            slideAdapter.o(this);
            startAutoPlay();
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
        onDetach();
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        if (!this.scrollable) {
            return false;
        }
        if (motionEvent.getAction() == 2) {
            this.touching = true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void refresh(MUSDKInstance mUSDKInstance, List<ywh> list, int i) {
        SlideAdapter slideAdapter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5e7525e", new Object[]{this, mUSDKInstance, list, new Integer(i)});
        } else if (this.adapter != null) {
            setAdapter(null);
            if (vvh.n()) {
                slideAdapter = new SlideAdapterRTL(mUSDKInstance);
            } else {
                slideAdapter = new SlideNewAdapter(mUSDKInstance);
            }
            this.adapter = slideAdapter;
            slideAdapter.j(list, this.infinite);
            this.adapter.m(this.hasTransformer);
            setAdapter(this.adapter);
            this.adapter.l(this, i);
            updatePageSize(getPageMargin(), list);
        }
    }

    public void resetTouching() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("307b9a39", new Object[]{this});
        } else {
            this.touching = false;
        }
    }

    public void scrollTo(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1f85320", new Object[]{this, new Integer(i), new Boolean(z)});
            return;
        }
        SlideAdapter slideAdapter = this.adapter;
        if (slideAdapter != null) {
            slideAdapter.k(this, i, z);
        }
    }

    public void setAutoPlay(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c396e48", new Object[]{this, new Boolean(z)});
            return;
        }
        this.autoPlay = z;
        startAutoPlay();
    }

    public void setIndex(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46180fcc", new Object[]{this, new Integer(i)});
            return;
        }
        SlideAdapter slideAdapter = this.adapter;
        if (slideAdapter != null) {
            slideAdapter.l(this, i);
        }
    }

    public void setInfinite(List<ywh> list, boolean z) {
        SlideAdapter slideAdapter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91604f86", new Object[]{this, list, new Boolean(z)});
        } else if (this.infinite != z && (slideAdapter = this.adapter) != null) {
            this.infinite = z;
            slideAdapter.j(list, z);
        }
    }

    public void setInterval(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f94af075", new Object[]{this, new Integer(i)});
            return;
        }
        this.interval = i;
        startAutoPlay();
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setPageTransformer(boolean z, ViewPager.PageTransformer pageTransformer) {
        boolean z2 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38af5aac", new Object[]{this, new Boolean(z), pageTransformer});
            return;
        }
        super.setPageTransformer(z, pageTransformer);
        if (pageTransformer == null) {
            z2 = false;
        }
        this.hasTransformer = z2;
        SlideAdapter slideAdapter = this.adapter;
        if (slideAdapter != null) {
            slideAdapter.m(z2);
        }
    }

    public void setScrollable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f9c4d24", new Object[]{this, new Boolean(z)});
        } else {
            this.scrollable = z;
        }
    }

    public void unmount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f4059a7", new Object[]{this});
            return;
        }
        this.adapter = null;
        setCurrentItem(0, false);
        H.removeCallbacks(this.autoPlayRunnable);
        setAdapter(null);
    }

    public void updateState(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3165b14", new Object[]{this, new Integer(i)});
            return;
        }
        SlideAdapter slideAdapter = this.adapter;
        if (slideAdapter != null) {
            slideAdapter.p(i);
        }
        if (i == 0) {
            onScrollSettled();
        } else if (i == 1) {
            onPagerDragging();
        }
    }
}
