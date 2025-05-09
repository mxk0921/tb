package com.taobao.android.live.plugin.atype.flexalocal.good.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class LimitScrollFrameLayout extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean mEnableScrollLimit = false;

    static {
        t2o.a(295699269);
    }

    public LimitScrollFrameLayout(Context context) {
        super(context);
    }

    public static /* synthetic */ Object ipc$super(LimitScrollFrameLayout limitScrollFrameLayout, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -614473710) {
            return new Boolean(super.canScrollHorizontally(((Number) objArr[0]).intValue()));
        }
        if (hashCode == -407533570) {
            return new Boolean(super.onInterceptTouchEvent((MotionEvent) objArr[0]));
        }
        int hashCode2 = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/live/plugin/atype/flexalocal/good/view/LimitScrollFrameLayout");
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("db5fe012", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if (isEnableScrollLimit() || super.canScrollHorizontally(i)) {
            return true;
        }
        return false;
    }

    public void enableScrollLimit(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b978faa2", new Object[]{this, new Boolean(z)});
        } else {
            this.mEnableScrollLimit = z;
        }
    }

    public boolean isEnableScrollLimit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c2e4876c", new Object[]{this})).booleanValue();
        }
        return this.mEnableScrollLimit;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            getParent().requestDisallowInterceptTouchEvent(true);
        } else if (action == 1 || action == 3) {
            getParent().requestDisallowInterceptTouchEvent(false);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public LimitScrollFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LimitScrollFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
