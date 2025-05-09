package com.taobao.tao.combo.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.ViewPager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.combo.ShopComboController;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class DirectionViewPager extends ViewPager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int SCROLL_DISTANCE_THRESHOLD = 120;
    public static final int SCROLL_TO_LEFT = 0;
    public static final int SCROLL_TO_RIGHT = 1;
    private static String TAG = DirectionViewPager.class.getSimpleName();
    private float mFirstX;
    private float mLastX;
    private a mListener;
    private b mOnDirectionPagerMoved;
    private boolean mIsFirst = true;
    private float mIsFirstDirection = 0.0f;
    private int mViewPagerClassify = 0;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface a {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface b {
    }

    static {
        t2o.a(764412082);
    }

    public DirectionViewPager(Context context) {
        super(context);
    }

    public static /* synthetic */ Object ipc$super(DirectionViewPager directionViewPager, String str, Object... objArr) {
        if (str.hashCode() == -1447998406) {
            return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/combo/ui/DirectionViewPager");
    }

    public int getViewPagerClassify() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("97000a86", new Object[]{this})).intValue();
        }
        return this.mViewPagerClassify;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        a aVar;
        a aVar2;
        b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        float x = motionEvent.getX();
        if (this.mIsFirst) {
            this.mIsFirstDirection = 0.0f;
            this.mIsFirst = false;
            this.mFirstX = x;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.mFirstX = x;
        } else if (actionMasked == 1) {
            this.mIsFirst = true;
            this.mLastX = x;
            float f = this.mFirstX;
            if (f != 0.0f) {
                if (f - x > 120.0f && (aVar2 = this.mListener) != null) {
                    ((ShopComboController.ComboViewPagerChangedObserve) aVar2).d(getCurrentItem(), 0);
                }
                if (this.mLastX - this.mFirstX > 120.0f && (aVar = this.mListener) != null) {
                    ((ShopComboController.ComboViewPagerChangedObserve) aVar).d(getCurrentItem(), 1);
                }
            }
        } else if (actionMasked == 2) {
            float f2 = x - this.mFirstX;
            b bVar2 = this.mOnDirectionPagerMoved;
            if (bVar2 != null) {
                ((ShopComboController.ComboViewPagerChangedObserve) bVar2).f(this.mViewPagerClassify, getCurrentItem(), f2);
            }
            if (Math.abs(f2) < this.mIsFirstDirection && (bVar = this.mOnDirectionPagerMoved) != null) {
                ((ShopComboController.ComboViewPagerChangedObserve) bVar).e(this.mViewPagerClassify, getCurrentItem(), f2);
            }
            this.mIsFirstDirection = Math.abs(f2);
        }
        try {
            return super.onTouchEvent(motionEvent);
        } catch (Exception unused) {
            return true;
        }
    }

    public void setOnDirectionPagerChangeListener(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7266c05f", new Object[]{this, aVar});
        } else {
            this.mListener = aVar;
        }
    }

    public void setOnDirectionPagerMoved(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e81a6e6b", new Object[]{this, bVar});
        } else {
            this.mOnDirectionPagerMoved = bVar;
        }
    }

    public void setViewPagerClassify(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b4556dc", new Object[]{this, new Integer(i)});
        } else {
            this.mViewPagerClassify = i;
        }
    }

    public DirectionViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
