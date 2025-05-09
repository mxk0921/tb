package com.taobao.android.detail.ttdetail.widget.desc.picgallery;

import android.content.Context;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.ViewPager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class CustomViewPager extends ViewPager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private PointF mLastPt = new PointF();
    private PointF mCurrentPt = new PointF();
    private a mOnPageEdgeScrollLimitListener = null;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface a {
        void onPageFirstScrollLimit();

        void onPageLastScrollLimit();
    }

    static {
        t2o.a(912262985);
    }

    public CustomViewPager(Context context) {
        super(context);
        init();
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
        } else {
            setOverScrollMode(2);
        }
    }

    public static /* synthetic */ Object ipc$super(CustomViewPager customViewPager, String str, Object... objArr) {
        if (str.hashCode() == 2075560917) {
            return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/widget/desc/picgallery/CustomViewPager");
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
        }
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.mLastPt.x = motionEvent.getX();
            this.mLastPt.y = motionEvent.getY();
        } else if (action == 1 || action == 2) {
            this.mCurrentPt.x = motionEvent.getX();
            this.mCurrentPt.y = motionEvent.getY();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public a getOnPageEdgeScrollLimitListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("a88112da", new Object[]{this});
        }
        return this.mOnPageEdgeScrollLimitListener;
    }

    public float[] handleMotionEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (float[]) ipChange.ipc$dispatch("179c8bc9", new Object[]{this, motionEvent});
        }
        int action = motionEvent.getAction() & 255;
        if (2 != action && 1 != action) {
            return null;
        }
        PointF pointF = this.mCurrentPt;
        float f = pointF.x;
        PointF pointF2 = this.mLastPt;
        return new float[]{f - pointF2.x, pointF.y - pointF2.y};
    }

    public void setOnPageEdgeScrollLimitListener(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7dd5d1e6", new Object[]{this, aVar});
        } else {
            this.mOnPageEdgeScrollLimitListener = aVar;
        }
    }

    public CustomViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }
}
