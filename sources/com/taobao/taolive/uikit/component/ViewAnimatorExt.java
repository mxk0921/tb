package com.taobao.taolive.uikit.component;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class ViewAnimatorExt extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Animation mInAnimation;
    public Animation mOutAnimation;
    public int mWhichChild = 0;
    public boolean mFirstTime = true;
    public boolean mAnimateFirstTime = true;

    static {
        t2o.a(779093582);
    }

    public ViewAnimatorExt(Context context) {
        super(context);
    }

    public static /* synthetic */ Object ipc$super(ViewAnimatorExt viewAnimatorExt, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2124330504:
                super.removeAllViews();
                return null;
            case -376150200:
                super.onInitializeAccessibilityEvent((AccessibilityEvent) objArr[0]);
                return null;
            case 362356466:
                super.onInitializeAccessibilityNodeInfo((AccessibilityNodeInfo) objArr[0]);
                return null;
            case 690217969:
                super.removeViews(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case 1080054453:
                return new Integer(super.getBaseline());
            case 1273305472:
                super.removeViewAt(((Number) objArr[0]).intValue());
                return null;
            case 1992612095:
                super.addView((View) objArr[0], ((Number) objArr[1]).intValue(), (ViewGroup.LayoutParams) objArr[2]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/uikit/component/ViewAnimatorExt");
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76c4d8ff", new Object[]{this, view, new Integer(i), layoutParams});
            return;
        }
        super.addView(view, i, layoutParams);
        if (getChildCount() == 1) {
            view.setVisibility(0);
        } else {
            view.setVisibility(4);
        }
        if (i >= 0 && (i2 = this.mWhichChild) >= i) {
            setDisplayedChild(i2 + 1);
        }
    }

    public boolean getAnimateFirstView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fa469a95", new Object[]{this})).booleanValue();
        }
        return this.mAnimateFirstTime;
    }

    @Override // android.view.View
    public int getBaseline() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("406052b5", new Object[]{this})).intValue();
        }
        if (getCurrentView() != null) {
            return getCurrentView().getBaseline();
        }
        return super.getBaseline();
    }

    public View getCurrentView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("518ce191", new Object[]{this});
        }
        return getChildAt(this.mWhichChild);
    }

    public int getDisplayedChild() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7f55fdab", new Object[]{this})).intValue();
        }
        return this.mWhichChild;
    }

    public Animation getInAnimation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animation) ipChange.ipc$dispatch("ed0f6066", new Object[]{this});
        }
        return this.mInAnimation;
    }

    public Animation getOutAnimation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animation) ipChange.ipc$dispatch("c1dd72a3", new Object[]{this});
        }
        return this.mOutAnimation;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9946748", new Object[]{this, accessibilityEvent});
            return;
        }
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(ViewAnimatorExt.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15991ef2", new Object[]{this, accessibilityNodeInfo});
            return;
        }
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(ViewAnimatorExt.class.getName());
    }

    @Override // android.view.ViewGroup
    public void removeAllViews() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("816149f8", new Object[]{this});
            return;
        }
        super.removeAllViews();
        this.mWhichChild = 0;
        this.mFirstTime = true;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bf31982", new Object[]{this, view});
            return;
        }
        int indexOfChild = indexOfChild(view);
        if (indexOfChild >= 0) {
            removeViewAt(indexOfChild);
        }
    }

    @Override // android.view.ViewGroup
    public void removeViewAt(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4be51980", new Object[]{this, new Integer(i)});
            return;
        }
        super.removeViewAt(i);
        int childCount = getChildCount();
        if (childCount == 0) {
            this.mWhichChild = 0;
            this.mFirstTime = true;
            return;
        }
        int i2 = this.mWhichChild;
        if (i2 >= childCount) {
            setDisplayedChild(childCount - 1);
        } else if (i2 == i) {
            setDisplayedChild(i2);
        }
    }

    @Override // android.view.ViewGroup
    public void removeViewInLayout(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a14af0d3", new Object[]{this, view});
        } else {
            removeView(view);
        }
    }

    @Override // android.view.ViewGroup
    public void removeViews(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2923e3f1", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        super.removeViews(i, i2);
        if (getChildCount() == 0) {
            this.mWhichChild = 0;
            this.mFirstTime = true;
            return;
        }
        int i3 = this.mWhichChild;
        if (i3 >= i && i3 < i + i2) {
            setDisplayedChild(i3);
        }
    }

    @Override // android.view.ViewGroup
    public void removeViewsInLayout(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("446e8b80", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            removeViews(i, i2);
        }
    }

    public void setAnimateFirstView(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ea01cd7", new Object[]{this, new Boolean(z)});
        } else {
            this.mAnimateFirstTime = z;
        }
    }

    public void setDisplayedChild(int i) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9aeebbf", new Object[]{this, new Integer(i)});
            return;
        }
        this.mWhichChild = i;
        if (i >= getChildCount()) {
            this.mWhichChild = 0;
        } else if (i < 0) {
            this.mWhichChild = getChildCount() - 1;
        }
        if (getFocusedChild() == null) {
            z = false;
        }
        showOnly(this.mWhichChild);
        if (z) {
            requestFocus(2);
        }
    }

    public void setInAnimation(Animation animation) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0d6dde4", new Object[]{this, animation});
        } else {
            this.mInAnimation = animation;
        }
    }

    public void setOutAnimation(Animation animation) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e6428df", new Object[]{this, animation});
        } else {
            this.mOutAnimation = animation;
        }
    }

    public void showNext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("220c5017", new Object[]{this});
        } else {
            setDisplayedChild(this.mWhichChild + 1);
        }
    }

    public void showOnly(int i, boolean z) {
        Animation animation;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24e9ac81", new Object[]{this, new Integer(i), new Boolean(z)});
            return;
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (i2 == i) {
                if (z && (animation = this.mInAnimation) != null) {
                    childAt.startAnimation(animation);
                }
                childAt.setVisibility(0);
                this.mFirstTime = false;
            } else {
                if (z && this.mOutAnimation != null && childAt.getVisibility() == 0) {
                    childAt.startAnimation(this.mOutAnimation);
                } else if (childAt.getAnimation() == this.mInAnimation) {
                    childAt.clearAnimation();
                }
                childAt.setVisibility(4);
            }
        }
    }

    public void showPrevious() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6adc879b", new Object[]{this});
        } else {
            setDisplayedChild(this.mWhichChild - 1);
        }
    }

    public void setInAnimation(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d937cb5f", new Object[]{this, context, new Integer(i)});
        } else {
            setInAnimation(AnimationUtils.loadAnimation(context, i));
        }
    }

    public void setOutAnimation(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39f1415a", new Object[]{this, context, new Integer(i)});
        } else {
            setOutAnimation(AnimationUtils.loadAnimation(context, i));
        }
    }

    public ViewAnimatorExt(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void showOnly(int i) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e86a9cb3", new Object[]{this, new Integer(i)});
            return;
        }
        if (this.mFirstTime && !this.mAnimateFirstTime) {
            z = false;
        }
        showOnly(i, z);
    }
}
