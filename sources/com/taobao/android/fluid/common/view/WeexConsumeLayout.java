package com.taobao.android.fluid.common.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import tb.b93;
import tb.ied;
import tb.ir9;
import tb.sj4;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class WeexConsumeLayout extends FrameLayout implements ied {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "RoundCornerLayout";
    private String mAcceptGestureType;
    public final List<MotionEvent> pendingEvent = new ArrayList();
    private String mWeexConsumeState = sj4.WEEX_STATE_NOT_EXIST;
    private boolean mCanPullInterceptHorizontal = true;
    private boolean mLockList = false;

    static {
        t2o.a(468713780);
        t2o.a(503317462);
    }

    public WeexConsumeLayout(Context context) {
        super(context);
    }

    public static /* synthetic */ Object ipc$super(WeexConsumeLayout weexConsumeLayout, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1447998406) {
            return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
        }
        if (hashCode == -407533570) {
            return new Boolean(super.onInterceptTouchEvent((MotionEvent) objArr[0]));
        }
        int hashCode2 = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/fluid/common/view/WeexConsumeLayout");
    }

    public void addPendingEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25b7d760", new Object[]{this, motionEvent});
            return;
        }
        if (motionEvent.getAction() == 0) {
            clearPendingEvent();
        }
        this.pendingEvent.add(MotionEvent.obtain(motionEvent));
    }

    public boolean beenConsume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1aa5a2bb", new Object[]{this})).booleanValue();
        }
        return sj4.WEEX_STATE_CONSUME.equals(this.mWeexConsumeState);
    }

    public boolean canInterceptVertical() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c35c74f3", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // tb.ied
    public boolean canPullIntercept(String str) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcc734e2", new Object[]{this, str})).booleanValue();
        }
        boolean beenConsume = beenConsume();
        str.hashCode();
        if (!str.equals(ied.PULL_VERTICAL_DRAG)) {
            if (!str.equals(ied.PULL_HORIZONTAL_DRAG)) {
                return beenConsume;
            }
            beenConsume &= this.mCanPullInterceptHorizontal;
        }
        if (!beenConsume || (!TextUtils.equals(ied.PULL_INIT, this.mAcceptGestureType) && !str.equals(this.mAcceptGestureType))) {
            z = false;
        }
        return z;
    }

    public void clearPendingEvent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31204ab7", new Object[]{this});
        } else {
            this.pendingEvent.clear();
        }
    }

    public void doPendingEvent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d13264f5", new Object[]{this});
            return;
        }
        for (MotionEvent motionEvent : this.pendingEvent) {
            onTouchEvent(motionEvent);
        }
        clearPendingEvent();
    }

    public String getWeexConsume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4a201c94", new Object[]{this});
        }
        return this.mWeexConsumeState;
    }

    public boolean isLockList() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("65b876be", new Object[]{this})).booleanValue();
        }
        return this.mLockList;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        if (!canInterceptVertical() && ((action = motionEvent.getAction()) == 1 || action == 3)) {
            clearPendingEvent();
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setAcceptGestureType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9efc5f8a", new Object[]{this, str});
            return;
        }
        ir9.b(TAG, "setAcceptGestureType,acceptGestureType:" + str);
        this.mAcceptGestureType = str;
    }

    public void setCanPullInterceptHorizontal(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b47a62fa", new Object[]{this, new Boolean(z)});
        } else {
            this.mCanPullInterceptHorizontal = z;
        }
    }

    public void setLockList(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("204ddf22", new Object[]{this, new Boolean(z)});
        } else {
            this.mLockList = z;
        }
    }

    public void setWeexConsume(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("119aa4ca", new Object[]{this, str});
            return;
        }
        ir9.b(TAG, "setWeexConsume,beenConsume:" + str);
        this.mWeexConsumeState = str;
        if (b93.l() && getParent() != null) {
            boolean beenConsume = beenConsume();
            ir9.b(TAG, "setWeexConsume,requestDisallowInterceptTouchEvent:" + beenConsume);
            getParent().requestDisallowInterceptTouchEvent(beenConsume);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        if (!canInterceptVertical()) {
            addPendingEvent(motionEvent);
            int action = motionEvent.getAction();
            if ((action == 1 || action == 3) && sj4.WEEX_STATE_NOT_CONSUME.equals(getWeexConsume())) {
                return onTouchEvent(motionEvent);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public WeexConsumeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
