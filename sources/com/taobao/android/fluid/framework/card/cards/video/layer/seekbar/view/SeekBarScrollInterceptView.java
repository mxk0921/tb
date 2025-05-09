package com.taobao.android.fluid.framework.card.cards.video.layer.seekbar.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;
import tb.ir9;
import tb.p91;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class SeekBarScrollInterceptView extends View {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "SeekBarScrollInterceptView";
    private WeakReference<View> mBottomTabBarRef;
    private float mDownX;
    private float mDownY;
    private boolean mIsDownInSeekBar;
    private boolean mIsDownInTabBar;
    private boolean mIsScrolling;
    private ViewGroup mItemView;
    private float mLastX;
    private float mLastY;
    private View mRangeSeekBar;
    private int mTouchSlop;

    static {
        t2o.a(468714033);
    }

    public SeekBarScrollInterceptView(Context context) {
        super(context);
    }

    private boolean dispatchToBottomTabBar(MotionEvent motionEvent) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("531ff2de", new Object[]{this, motionEvent})).booleanValue();
        }
        View sureBottomBar = sureBottomBar();
        if (sureBottomBar == null) {
            return false;
        }
        int[] iArr = new int[2];
        getLocationOnScreen(iArr);
        int[] iArr2 = new int[2];
        sureBottomBar.getLocationOnScreen(iArr2);
        if (motionEvent.getAction() == 0) {
            float x = iArr[0] + motionEvent.getX();
            float y = iArr[1] + motionEvent.getY();
            int i = iArr2[0];
            if (x >= i && x < i + sureBottomBar.getWidth()) {
                int i2 = iArr2[1];
                if (y >= i2 && y < i2 + sureBottomBar.getHeight()) {
                    z = true;
                    this.mIsDownInTabBar = z;
                }
            }
            z = false;
            this.mIsDownInTabBar = z;
        }
        if (this.mIsDownInTabBar) {
            try {
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                obtain.offsetLocation(iArr[0] - iArr2[0], iArr[1] - iArr2[1]);
                boolean dispatchTouchEvent = sureBottomBar.dispatchTouchEvent(obtain);
                obtain.recycle();
                return dispatchTouchEvent;
            } catch (Exception e) {
                ir9.b(TAG, e.toString());
            }
        }
        return false;
    }

    private boolean dispatchToRangeSeekBar(MotionEvent motionEvent) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("865ec053", new Object[]{this, motionEvent})).booleanValue();
        }
        if (!(this.mItemView == null || this.mRangeSeekBar == null)) {
            int[] iArr = new int[2];
            getLocationOnScreen(iArr);
            int[] iArr2 = new int[2];
            this.mItemView.getLocationOnScreen(iArr2);
            if (motionEvent.getAction() == 0) {
                float x = iArr[0] + motionEvent.getX();
                float y = iArr[1] + motionEvent.getY();
                int[] iArr3 = new int[2];
                this.mRangeSeekBar.getLocationOnScreen(iArr3);
                int i = iArr3[0];
                if (x >= i && x < i + this.mRangeSeekBar.getWidth()) {
                    int i2 = iArr3[1];
                    if (y >= i2 && y < i2 + this.mRangeSeekBar.getHeight()) {
                        z = true;
                        this.mIsDownInSeekBar = z;
                    }
                }
                z = false;
                this.mIsDownInSeekBar = z;
            }
            if (this.mIsDownInSeekBar) {
                try {
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    obtain.offsetLocation(iArr[0] - iArr2[0], iArr[1] - iArr2[1]);
                    boolean dispatchTouchEvent = this.mItemView.dispatchTouchEvent(obtain);
                    obtain.recycle();
                    return dispatchTouchEvent;
                } catch (Exception e) {
                    ir9.b(TAG, e.toString());
                }
            }
        }
        return false;
    }

    public static /* synthetic */ Object ipc$super(SeekBarScrollInterceptView seekBarScrollInterceptView, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/framework/card/cards/video/layer/seekbar/view/SeekBarScrollInterceptView");
    }

    private View sureBottomBar() {
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("a92f2a1c", new Object[]{this});
        }
        WeakReference<View> weakReference = this.mBottomTabBarRef;
        if (weakReference != null) {
            view = weakReference.get();
        } else {
            view = null;
        }
        if (view == null && (view = p91.c()) != null) {
            this.mBottomTabBarRef = new WeakReference<>(view);
        }
        return view;
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.mDownX = motionEvent.getX();
            this.mDownY = motionEvent.getY();
            this.mIsScrolling = false;
            z = dispatchToBottomTabBar(motionEvent);
            z2 = dispatchToRangeSeekBar(motionEvent);
        } else if (action != 1) {
            if (action != 2) {
                z2 = false;
            } else {
                if (this.mIsScrolling) {
                    z2 = dispatchToRangeSeekBar(motionEvent);
                } else if (Math.abs(motionEvent.getX() - this.mLastX) <= Math.abs(motionEvent.getY() - this.mLastY) || Math.abs(motionEvent.getX() - this.mDownX) <= this.mTouchSlop) {
                    z2 = false;
                } else {
                    z2 = dispatchToRangeSeekBar(motionEvent);
                    this.mIsScrolling = true;
                }
                if (!z2) {
                    z = dispatchToBottomTabBar(motionEvent);
                }
            }
            z = false;
        } else {
            if (this.mIsScrolling) {
                z2 = dispatchToRangeSeekBar(motionEvent);
            } else {
                z2 = false;
            }
            if (!z2) {
                z = dispatchToBottomTabBar(motionEvent);
            } else {
                z = false;
            }
            this.mIsScrolling = false;
            this.mIsDownInTabBar = false;
            this.mIsDownInSeekBar = false;
        }
        this.mLastX = motionEvent.getX();
        this.mLastY = motionEvent.getY();
        if (z || z2) {
            return true;
        }
        return false;
    }

    public void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        this.mTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        setVisibility(8);
    }

    public void setCurrentRelatedView(ViewGroup viewGroup, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87f00ff3", new Object[]{this, viewGroup, view});
            return;
        }
        this.mItemView = viewGroup;
        this.mRangeSeekBar = view;
    }

    public SeekBarScrollInterceptView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SeekBarScrollInterceptView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
