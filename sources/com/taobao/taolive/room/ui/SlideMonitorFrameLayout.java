package com.taobao.taolive.room.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.fws;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class SlideMonitorFrameLayout extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final String TAG = SlideMonitorFrameLayout.class.getSimpleName();
    private float mCurPosX;
    private GestureDetector mGestureDetector;
    private float mPosX;
    private a mSlideListener;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface a {
    }

    static {
        t2o.a(779093238);
    }

    public SlideMonitorFrameLayout(Context context) {
        this(context, null);
    }

    public static /* synthetic */ Object ipc$super(SlideMonitorFrameLayout slideMonitorFrameLayout, String str, Object... objArr) {
        if (str.hashCode() == -1447998406) {
            return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/room/ui/SlideMonitorFrameLayout");
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.mPosX = motionEvent.getX();
            this.mCurPosX = motionEvent.getX();
        } else if (action == 1) {
            float f = this.mCurPosX;
            float f2 = this.mPosX;
            if (f - f2 <= 0.0f || Math.abs(f - f2) <= 150.0f) {
                float f3 = this.mCurPosX;
                float f4 = this.mPosX;
                if (f3 - f4 < 0.0f && Math.abs(f3 - f4) > 150.0f && (aVar = this.mSlideListener) != null) {
                    ((fws.a) aVar).a();
                }
            } else {
                a aVar2 = this.mSlideListener;
                if (aVar2 != null) {
                    ((fws.a) aVar2).a();
                }
            }
        } else if (action == 2) {
            this.mCurPosX = motionEvent.getX();
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setSlideListener(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a2aae5", new Object[]{this, aVar});
        } else {
            this.mSlideListener = aVar;
        }
    }

    public SlideMonitorFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.mPosX = motionEvent.getX();
            this.mCurPosX = motionEvent.getX();
        } else if (action == 1) {
            float f = this.mCurPosX - this.mPosX;
            if (f <= 0.0f || Math.abs(f) <= 150.0f) {
                float f2 = this.mCurPosX - this.mPosX;
                if (f2 < 0.0f && Math.abs(f2) > 150.0f) {
                    a aVar = this.mSlideListener;
                    if (aVar != null) {
                        ((fws.a) aVar).b();
                    }
                    Log.e(TAG, "onInterceptTouchEvent: ACTION_UP <0");
                    return true;
                }
            } else {
                a aVar2 = this.mSlideListener;
                if (aVar2 != null) {
                    ((fws.a) aVar2).a();
                }
                Log.e(TAG, "onInterceptTouchEvent: ACTION_UP >0");
                return true;
            }
        } else if (action == 2) {
            this.mCurPosX = motionEvent.getX();
        }
        return super.onTouchEvent(motionEvent);
    }
}
