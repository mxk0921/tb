package com.taobao.android.layoutmanager.container.secondpage.biz;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.core.n;
import java.util.HashMap;
import tb.bod;
import tb.ied;
import tb.t2o;
import tb.xbu;
import tb.ye;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class GGSecPageViewPager extends ViewPager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private n currentTrackNode;
    private ye secPageWrapper;
    private boolean touchInGesture = false;
    private MotionEvent mFakeDown = null;
    private boolean mIsUnableToDragBecauseWeex = false;

    static {
        t2o.a(502268065);
    }

    public GGSecPageViewPager(Context context) {
        super(context);
    }

    private boolean handleTouchEnable(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a1fe50ba", new Object[]{this, motionEvent})).booleanValue();
        }
        bod d = this.secPageWrapper.d();
        boolean h = ye.h(d);
        if (d == null || h) {
            return false;
        }
        Pair<Boolean, Pair<Boolean, n>> supportSecondPage = d.supportSecondPage(motionEvent);
        if (supportSecondPage != null) {
            this.touchInGesture = ((Boolean) supportSecondPage.first).booleanValue();
            Object obj = supportSecondPage.second;
            if (obj != null && ((Boolean) ((Pair) obj).first).booleanValue()) {
                this.currentTrackNode = (n) ((Pair) supportSecondPage.second).second;
            }
        }
        return true;
    }

    public static /* synthetic */ Object ipc$super(GGSecPageViewPager gGSecPageViewPager, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1447998406) {
            return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
        }
        if (hashCode == -407533570) {
            return new Boolean(super.onInterceptTouchEvent((MotionEvent) objArr[0]));
        }
        if (hashCode == 222452193) {
            return new Boolean(super.canScroll((View) objArr[0], ((Boolean) objArr[1]).booleanValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue()));
        }
        int hashCode2 = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/layoutmanager/container/secondpage/biz/GGSecPageViewPager");
    }

    private boolean pullIntercept(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6a1b4452", new Object[]{this, view})).booleanValue();
        }
        if ((view instanceof ied) && ((ied) view).canPullIntercept(ied.PULL_HORIZONTAL_DRAG)) {
            return true;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt != null) {
                    if (pullIntercept(childAt)) {
                        return true;
                    }
                    if (childAt instanceof ied) {
                        break;
                    }
                }
            }
        }
        return false;
    }

    private boolean touchEnable(MotionEvent motionEvent) {
        ye yeVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fe221202", new Object[]{this, motionEvent})).booleanValue();
        }
        if (motionEvent.getAction() == 0 && !handleTouchEnable(motionEvent)) {
            this.touchInGesture = true;
        }
        if (getCurrentItem() == 0) {
            return this.touchInGesture;
        }
        if (!this.touchInGesture || (yeVar = this.secPageWrapper) == null || !yeVar.c().h()) {
            return false;
        }
        return true;
    }

    @Override // androidx.viewpager.widget.ViewPager
    public boolean canScroll(View view, boolean z, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d4259e1", new Object[]{this, view, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3)})).booleanValue();
        }
        if (!(view instanceof ied) || !((ied) view).canPullIntercept(ied.PULL_HORIZONTAL_DRAG)) {
            return super.canScroll(view, z, i, i2, i3);
        }
        this.mIsUnableToDragBecauseWeex = true;
        return true;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        if (!touchEnable(motionEvent)) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 || actionMasked == 1 || actionMasked == 3) {
            this.mIsUnableToDragBecauseWeex = false;
        }
        if (motionEvent == this.mFakeDown) {
            return true;
        }
        boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        if (!onInterceptTouchEvent && this.mIsUnableToDragBecauseWeex && !canScroll(this, false, 0, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            obtain.setAction(3);
            dispatchTouchEvent(obtain);
            obtain.recycle();
            MotionEvent obtain2 = MotionEvent.obtain(motionEvent);
            this.mFakeDown = obtain2;
            obtain2.setAction(0);
            dispatchTouchEvent(this.mFakeDown);
            this.mFakeDown.recycle();
            this.mFakeDown = null;
        }
        return onInterceptTouchEvent;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        try {
            if (touchEnable(motionEvent)) {
                if (super.onTouchEvent(motionEvent)) {
                    return true;
                }
            }
            return false;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    public void setSecPageWrapper(ye yeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac53cfb1", new Object[]{this, yeVar});
        } else {
            this.secPageWrapper = yeVar;
        }
    }

    public void triggerTransitionStartEvent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf1d66c", new Object[]{this});
        } else if (this.currentTrackNode != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("url", this.currentTrackNode.H(xbu.KEY_TRACK_TARGET));
            this.currentTrackNode.K().sendMessage(this.currentTrackNode, "pushvctransitionstart", null, hashMap, null);
        }
    }

    public GGSecPageViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
