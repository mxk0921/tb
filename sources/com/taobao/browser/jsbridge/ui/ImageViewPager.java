package com.taobao.browser.jsbridge.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.ViewPager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ImageViewPager extends ViewPager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public ImageTouchView mCurrentView = null;

    static {
        t2o.a(619708580);
    }

    public ImageViewPager(Context context) {
        super(context);
    }

    public static /* synthetic */ Object ipc$super(ImageViewPager imageViewPager, String str, Object... objArr) {
        if (str.hashCode() == -407533570) {
            return new Boolean(super.onInterceptTouchEvent((MotionEvent) objArr[0]));
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/browser/jsbridge/ui/ImageViewPager");
    }

    public ImageTouchView getCurrentView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageTouchView) ipChange.ipc$dispatch("4a3dc43f", new Object[]{this});
        }
        return this.mCurrentView;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        ImageTouchView imageTouchView = this.mCurrentView;
        if (imageTouchView == null) {
            return false;
        }
        try {
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
        if (imageTouchView.pagerCanScroll()) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (this.mCurrentView.viewCanMove()) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return false;
    }

    public void setCurrentView(ImageTouchView imageTouchView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f261ff1d", new Object[]{this, imageTouchView});
        } else {
            this.mCurrentView = imageTouchView;
        }
    }

    public ImageViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
