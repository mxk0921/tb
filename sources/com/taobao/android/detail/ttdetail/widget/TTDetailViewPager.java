package com.taobao.android.detail.ttdetail.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;
import tb.tgh;
import tb.tq4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class TTDetailViewPager extends ViewPager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "DetailViewPager";
    private boolean disableHorizontalScroll = false;

    static {
        t2o.a(912262934);
    }

    public TTDetailViewPager(Context context) {
        super(context);
    }

    public static /* synthetic */ Object ipc$super(TTDetailViewPager tTDetailViewPager, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1447998406) {
            return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
        }
        if (hashCode == -407533570) {
            return new Boolean(super.onInterceptTouchEvent((MotionEvent) objArr[0]));
        }
        int hashCode2 = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/detail/ttdetail/widget/TTDetailViewPager");
    }

    private boolean isOnlyOneChildren() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c260f5ba", new Object[]{this})).booleanValue();
        }
        PagerAdapter adapter = getAdapter();
        if (adapter == null || adapter.getCount() <= 1) {
            return true;
        }
        return false;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        try {
            if (!this.disableHorizontalScroll && !isOnlyOneChildren()) {
                if (super.onInterceptTouchEvent(motionEvent)) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            tgh.c(TAG, "onInterceptTouchEvent", e);
            return false;
        }
    }

    public void setDisableHorizontalScroll(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c08c536", new Object[]{this, new Boolean(z)});
        } else {
            this.disableHorizontalScroll = z;
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
        } catch (Throwable th) {
            tgh.c(TAG, "onTouchEvent", th);
            if (tq4.e(tq4.d(this))) {
                return true;
            }
            throw new RuntimeException(th);
        }
    }

    public TTDetailViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
