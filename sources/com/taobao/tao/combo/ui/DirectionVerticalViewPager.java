package com.taobao.tao.combo.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class DirectionVerticalViewPager extends VerticalViewPager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int SCROLL_DISTANCE_THRESHOLD = 10;
    public static final int SCROLL_TO_LEFT = 0;
    public static final int SCROLL_TO_RIGHT = 1;
    private a mDirectionListener;
    private float mFirstY;
    private boolean mIsFirst = true;
    private float mLastY;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface a {
        void a(int i, int i2);
    }

    static {
        t2o.a(764412080);
    }

    public DirectionVerticalViewPager(Context context) {
        super(context);
    }

    public static /* synthetic */ Object ipc$super(DirectionVerticalViewPager directionVerticalViewPager, String str, Object... objArr) {
        if (str.hashCode() == -1447998406) {
            return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/combo/ui/DirectionVerticalViewPager");
    }

    public a getDirectionListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("1cf53e36", new Object[]{this});
        }
        return this.mDirectionListener;
    }

    @Override // com.taobao.tao.combo.ui.VerticalViewPager, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        a aVar;
        a aVar2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        float y = motionEvent.getY();
        if (this.mIsFirst) {
            this.mIsFirst = false;
            this.mFirstY = y;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.mFirstY = y;
        } else if (actionMasked == 1) {
            this.mIsFirst = true;
            this.mLastY = y;
            float f = this.mFirstY;
            if (f != 0.0f) {
                if (f - y > 10.0f && (aVar2 = this.mDirectionListener) != null) {
                    aVar2.a(getCurrentItem(), 0);
                }
                if (this.mLastY - this.mFirstY > 10.0f && (aVar = this.mDirectionListener) != null) {
                    aVar.a(getCurrentItem(), 1);
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setDirectionListener(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("349b304a", new Object[]{this, aVar});
        } else {
            this.mDirectionListener = aVar;
        }
    }

    public DirectionVerticalViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
