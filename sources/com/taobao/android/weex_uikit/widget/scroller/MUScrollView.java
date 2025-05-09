package com.taobao.android.weex_uikit.widget.scroller;

import android.content.Context;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ScrollView;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityRecordCompat;
import androidx.core.widget.NestedScrollView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.hzo;
import tb.pxh;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class MUScrollView extends NestedScrollView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean scrollable = true;
    private hzo stateObserver;
    private boolean touching;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class AccessibilityDelegate extends AccessibilityDelegateCompat {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(986710224);
        }

        public static /* synthetic */ Object ipc$super(AccessibilityDelegate accessibilityDelegate, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -1476904323) {
                return new Boolean(super.performAccessibilityAction((View) objArr[0], ((Number) objArr[1]).intValue(), (Bundle) objArr[2]));
            }
            if (hashCode == -672710132) {
                super.onInitializeAccessibilityNodeInfo((View) objArr[0], (AccessibilityNodeInfoCompat) objArr[1]);
                return null;
            } else if (hashCode == -485045190) {
                super.onInitializeAccessibilityEvent((View) objArr[0], (AccessibilityEvent) objArr[1]);
                return null;
            } else {
                int hashCode2 = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/weex_uikit/widget/scroller/MUScrollView$AccessibilityDelegate");
            }
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            boolean z = true;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e316cc3a", new Object[]{this, view, accessibilityEvent});
                return;
            }
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            MUScrollView mUScrollView = (MUScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            if (mUScrollView.getScrollRange() <= 0) {
                z = false;
            }
            accessibilityEvent.setScrollable(z);
            accessibilityEvent.setScrollX(mUScrollView.getScrollX());
            accessibilityEvent.setScrollY(mUScrollView.getScrollY());
            AccessibilityRecordCompat.setMaxScrollX(accessibilityEvent, mUScrollView.getScrollX());
            AccessibilityRecordCompat.setMaxScrollY(accessibilityEvent, mUScrollView.getScrollRange());
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            int scrollRange;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d7e7420c", new Object[]{this, view, accessibilityNodeInfoCompat});
                return;
            }
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            MUScrollView mUScrollView = (MUScrollView) view;
            accessibilityNodeInfoCompat.setClassName(ScrollView.class.getName());
            if (mUScrollView.isEnabled() && (scrollRange = mUScrollView.getScrollRange()) > 0) {
                accessibilityNodeInfoCompat.setScrollable(true);
                if (mUScrollView.getScrollY() > 0) {
                    accessibilityNodeInfoCompat.addAction(8192);
                }
                if (mUScrollView.getScrollY() < scrollRange) {
                    accessibilityNodeInfoCompat.addAction(4096);
                }
            }
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            int max;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("a7f83a7d", new Object[]{this, view, new Integer(i), bundle})).booleanValue();
            }
            if (super.performAccessibilityAction(view, i, bundle)) {
                return true;
            }
            MUScrollView mUScrollView = (MUScrollView) view;
            if (!mUScrollView.isEnabled()) {
                return false;
            }
            if (i == 4096) {
                int min = Math.min(mUScrollView.getScrollY() + ((mUScrollView.getHeight() - mUScrollView.getPaddingBottom()) - mUScrollView.getPaddingTop()), mUScrollView.getScrollRange());
                if (min == mUScrollView.getScrollY()) {
                    return false;
                }
                mUScrollView.smoothScrollTo(0, min);
                return true;
            } else if (i != 8192 || (max = Math.max(mUScrollView.getScrollY() - ((mUScrollView.getHeight() - mUScrollView.getPaddingBottom()) - mUScrollView.getPaddingTop()), 0)) == mUScrollView.getScrollY()) {
                return false;
            } else {
                mUScrollView.scrollBy(0, max - mUScrollView.getScrollY());
                return true;
            }
        }
    }

    static {
        t2o.a(986710223);
    }

    public MUScrollView(Context context) {
        super(context);
        ViewCompat.setAccessibilityDelegate(this, new AccessibilityDelegate());
    }

    public static /* synthetic */ Object ipc$super(MUScrollView mUScrollView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1447998406) {
            return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
        }
        if (hashCode == -407533570) {
            return new Boolean(super.onInterceptTouchEvent((MotionEvent) objArr[0]));
        }
        if (hashCode == 1004220751) {
            super.onScrollChanged(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
            return null;
        }
        int hashCode2 = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/weex_uikit/widget/scroller/MUScrollView");
    }

    @Override // androidx.core.widget.NestedScrollView
    public int getScrollRange() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("512138b4", new Object[]{this})).intValue();
        }
        if (getChildCount() > 0) {
            return Math.max(0, getChildAt(0).getHeight() - ((getHeight() - getPaddingBottom()) - getPaddingTop()));
        }
        return 0;
    }

    public boolean isTouching() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("81ad9998", new Object[]{this})).booleanValue();
        }
        return this.touching;
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        if (!this.scrollable || !super.onInterceptTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bdb314f", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onScrollChanged(i, i2, i3, i4);
        hzo hzoVar = this.stateObserver;
        if (hzoVar != null) {
            hzoVar.d(i, i2, i3, i4);
        }
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        if (!this.scrollable) {
            return false;
        }
        if (motionEvent.getAction() == 2) {
            this.touching = true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void resetTouching() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("307b9a39", new Object[]{this});
        } else {
            this.touching = false;
        }
    }

    public void setOnScrollChangedListener(pxh pxhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35694bd5", new Object[]{this, pxhVar});
        } else if (this.stateObserver == null && pxhVar != null) {
            this.stateObserver = new hzo(pxhVar, this);
        }
    }

    public void setScrollable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f9c4d24", new Object[]{this, new Boolean(z)});
        } else {
            this.scrollable = z;
        }
    }
}
