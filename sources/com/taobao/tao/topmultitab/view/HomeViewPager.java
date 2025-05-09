package com.taobao.tao.topmultitab.view;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.view.widgets.ViewPagerFakeDragView;
import com.taobao.tao.topmultitab.service.pulldown.IPullDownService;
import tb.a70;
import tb.bqa;
import tb.t2o;
import tb.uqa;
import tb.wcc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class HomeViewPager extends ViewPager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "HomeViewPager";
    private boolean isEnableScroll = true;
    private a70 mAccidentSlideFeature = new a70(createITouchEventCallback());
    private wcc mHomePageContext;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements a70.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.a70.a
        public void onTouchEvent(MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a9b14c36", new Object[]{this, motionEvent});
            } else {
                HomeViewPager.this.onTouchEvent(motionEvent);
            }
        }
    }

    static {
        t2o.a(729810408);
    }

    public HomeViewPager(Context context, wcc wccVar) {
        super(context);
        this.mHomePageContext = wccVar;
        bqa.d(TAG, "HomeViewPager,mHomePageContext" + this.mHomePageContext);
    }

    private a70.a createITouchEventCallback() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a70.a) ipChange.ipc$dispatch("955fdae1", new Object[]{this});
        }
        return new a();
    }

    public static /* synthetic */ Object ipc$super(HomeViewPager homeViewPager, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1447998406:
                return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
            case -407533570:
                return new Boolean(super.onInterceptTouchEvent((MotionEvent) objArr[0]));
            case 650865254:
                super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case 1626033557:
                super.onAttachedToWindow();
                return null;
            case 2075560917:
                return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/topmultitab/view/HomeViewPager");
        }
    }

    private boolean isEnableScroll() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9fce3405", new Object[]{this})).booleanValue();
        }
        return this.isEnableScroll;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
        }
        ViewPagerFakeDragView.setLastIsTouchFakeDragView(false);
        this.mAccidentSlideFeature.b(motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
        } else {
            super.onAttachedToWindow();
        }
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        try {
            wcc wccVar = this.mHomePageContext;
            IPullDownService iPullDownService = wccVar == null ? null : (IPullDownService) wccVar.a(IPullDownService.class);
            if (iPullDownService != null) {
                i2 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2) - iPullDownService.getRefreshOffset(), View.MeasureSpec.getMode(i2));
            }
        } catch (Exception e) {
            bqa.d(TAG, "onMeasure except: " + e);
        }
        super.onMeasure(i, i2);
    }

    public void onPageSelected() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90abdd0", new Object[]{this});
        } else {
            this.mAccidentSlideFeature.m();
        }
    }

    public void setEnableScroll(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f594a6bb", new Object[]{this, new Boolean(z)});
        } else {
            this.isEnableScroll = z;
        }
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        if (isEnableScroll()) {
            try {
                z = super.onInterceptTouchEvent(motionEvent);
            } catch (Throwable unused) {
            }
        }
        return this.mAccidentSlideFeature.l(motionEvent, z);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        if (isEnableScroll()) {
            try {
                return super.onTouchEvent(motionEvent);
            } catch (Throwable th) {
                uqa.b("AccidentSlide", "onTouchEvent error", th.getMessage());
            }
        }
        return true;
    }
}
