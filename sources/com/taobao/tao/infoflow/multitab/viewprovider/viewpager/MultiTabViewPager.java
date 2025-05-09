package com.taobao.tao.infoflow.multitab.viewprovider.viewpager;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.ViewPager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.a70;
import tb.bqa;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class MultiTabViewPager extends ViewPager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "MultiTabViewPager";
    private a70 mAccidentSlideFeature;
    private boolean mEnableAccidentSlide = false;

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
                MultiTabViewPager.this.onTouchEvent(motionEvent);
            }
        }
    }

    static {
        t2o.a(729809588);
    }

    public MultiTabViewPager(Context context) {
        super(context);
        init();
    }

    private a70.a createITouchEventCallback() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a70.a) ipChange.ipc$dispatch("955fdae1", new Object[]{this});
        }
        return new a();
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
        } else {
            this.mAccidentSlideFeature = new a70(createITouchEventCallback());
        }
    }

    public static /* synthetic */ Object ipc$super(MultiTabViewPager multiTabViewPager, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1447998406) {
            return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
        }
        if (hashCode == -407533570) {
            return new Boolean(super.onInterceptTouchEvent((MotionEvent) objArr[0]));
        }
        if (hashCode == 2075560917) {
            return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
        }
        int hashCode2 = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/tao/infoflow/multitab/viewprovider/viewpager/MultiTabViewPager");
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
        }
        a70 a70Var = this.mAccidentSlideFeature;
        if (a70Var != null && this.mEnableAccidentSlide) {
            a70Var.b(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        try {
            z = super.onInterceptTouchEvent(motionEvent);
        } catch (Exception e) {
            bqa.b(TAG, "onInterceptTouchEvent", e);
        }
        a70 a70Var = this.mAccidentSlideFeature;
        if (a70Var == null || !this.mEnableAccidentSlide) {
            return z;
        }
        return a70Var.l(motionEvent, z);
    }

    public void onPageSelected() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90abdd0", new Object[]{this});
            return;
        }
        a70 a70Var = this.mAccidentSlideFeature;
        if (a70Var != null && this.mEnableAccidentSlide) {
            a70Var.m();
        }
    }

    public void setEnableAccidentSlide(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5da90f0", new Object[]{this, new Boolean(z)});
        } else {
            this.mEnableAccidentSlide = z;
        }
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        try {
            return super.onTouchEvent(motionEvent);
        } catch (Exception e) {
            bqa.b(TAG, "onTouchEvent", e);
            return true;
        }
    }

    public MultiTabViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }
}
