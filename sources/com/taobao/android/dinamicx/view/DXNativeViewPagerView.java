package com.taobao.android.dinamicx.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.viewpager.LazyViewPagerAdapter;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class DXNativeViewPagerView extends ViewPager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final float DEFAULT_OFFSET = 0.1f;
    private LazyViewPagerAdapter mLazyPagerAdapter;
    private boolean scrollable = true;
    private boolean enableScroll_Android = true;
    private int mIndexChangeType = 0;

    static {
        t2o.a(444597190);
    }

    public DXNativeViewPagerView(Context context) {
        super(context);
    }

    public static /* synthetic */ Object ipc$super(DXNativeViewPagerView dXNativeViewPagerView, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1695733278:
                super.setCurrentItem(((Number) objArr[0]).intValue(), ((Boolean) objArr[1]).booleanValue());
                return null;
            case -1447998406:
                return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
            case -614473710:
                return new Boolean(super.canScrollHorizontally(((Number) objArr[0]).intValue()));
            case -407533570:
                return new Boolean(super.onInterceptTouchEvent((MotionEvent) objArr[0]));
            case -188663035:
                super.onPageScrolled(((Number) objArr[0]).intValue(), ((Number) objArr[1]).floatValue(), ((Number) objArr[2]).intValue());
                return null;
            case 222392114:
                super.setCurrentItem(((Number) objArr[0]).intValue());
                return null;
            case 759662883:
                super.setAdapter((PagerAdapter) objArr[0]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/view/DXNativeViewPagerView");
        }
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public boolean canScrollHorizontally(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("db5fe012", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if (!this.scrollable || !super.canScrollHorizontally(i)) {
            return false;
        }
        return true;
    }

    public int getIndexChangeType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5461a8c0", new Object[]{this})).intValue();
        }
        return this.mIndexChangeType;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        if (!this.enableScroll_Android || !super.onInterceptTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void onPageScrolled(int i, float f, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4c13b05", new Object[]{this, new Integer(i), new Float(f), new Integer(i2)});
            return;
        }
        if (this.mLazyPagerAdapter != null) {
            if (getCurrentItem() == i) {
                int i3 = 1 + i;
                if (this.mLazyPagerAdapter.w(i3) && f >= 0.1f) {
                    this.mLazyPagerAdapter.startUpdate((ViewGroup) this);
                    this.mLazyPagerAdapter.z(this, i3);
                    this.mLazyPagerAdapter.finishUpdate((ViewGroup) this);
                }
            } else if (getCurrentItem() > i && this.mLazyPagerAdapter.w(i) && 1.0f - f >= 0.1f) {
                this.mLazyPagerAdapter.startUpdate((ViewGroup) this);
                this.mLazyPagerAdapter.z(this, i);
                this.mLazyPagerAdapter.finishUpdate((ViewGroup) this);
            }
        }
        super.onPageScrolled(i, f, i2);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        if (!this.enableScroll_Android || !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setAdapter(PagerAdapter pagerAdapter) {
        LazyViewPagerAdapter lazyViewPagerAdapter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d478923", new Object[]{this, pagerAdapter});
            return;
        }
        super.setAdapter(pagerAdapter);
        if (pagerAdapter instanceof LazyViewPagerAdapter) {
            lazyViewPagerAdapter = (LazyViewPagerAdapter) pagerAdapter;
        } else {
            lazyViewPagerAdapter = null;
        }
        this.mLazyPagerAdapter = lazyViewPagerAdapter;
    }

    public void setCurrentItem(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9aecea11", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        this.mIndexChangeType = i2;
        super.setCurrentItem(i);
    }

    public void setEnableScroll_Android(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7916dab", new Object[]{this, new Boolean(z)});
        } else {
            this.enableScroll_Android = z;
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

    public void setCurrentItem(int i, boolean z, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2b88561", new Object[]{this, new Integer(i), new Boolean(z), new Integer(i2)});
            return;
        }
        this.mIndexChangeType = i2;
        super.setCurrentItem(i, z);
    }

    public DXNativeViewPagerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setCurrentItem(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d416f32", new Object[]{this, new Integer(i)});
            return;
        }
        this.mIndexChangeType = 0;
        super.setCurrentItem(i);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setCurrentItem(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9aed29e2", new Object[]{this, new Integer(i), new Boolean(z)});
            return;
        }
        this.mIndexChangeType = 0;
        super.setCurrentItem(i, z);
    }
}
