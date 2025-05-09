package com.taobao.android.dinamicx.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.la6;
import tb.pb6;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class DXNativeProgressIndicator extends LinearLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int backgroundColor;
    private int indicatorColor;
    private int itemMargin;
    private int preItemWidth = -1;
    private int sectionCount;
    private int sectionDuration;

    static {
        t2o.a(444597178);
    }

    public DXNativeProgressIndicator(Context context) {
        super(context);
        init();
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        setOrientation(0);
        setGravity(17);
    }

    private void initIndicatorAttr(int i, DXNativeProgressView dXNativeProgressView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1371cc81", new Object[]{this, new Integer(i), dXNativeProgressView});
            return;
        }
        dXNativeProgressView.setBackgroundColor(this.backgroundColor);
        dXNativeProgressView.setCornerRadius(i / 2);
        dXNativeProgressView.setSectionDuration(this.sectionDuration);
        dXNativeProgressView.setProgressColor(this.indicatorColor);
        dXNativeProgressView.setBackgroundColor(this.backgroundColor);
    }

    public static /* synthetic */ Object ipc$super(DXNativeProgressIndicator dXNativeProgressIndicator, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/view/DXNativeProgressIndicator");
    }

    private void prepareView(int i, LinearLayout.LayoutParams layoutParams, int i2) {
        int i3 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36e1321e", new Object[]{this, new Integer(i), layoutParams, new Integer(i2)});
        } else if (getChildCount() == this.sectionCount && this.preItemWidth == i2) {
            while (i3 < getChildCount()) {
                View childAt = getChildAt(i3);
                if (childAt instanceof DXNativeProgressView) {
                    initIndicatorAttr(i, (DXNativeProgressView) childAt);
                }
                i3++;
            }
        } else {
            this.preItemWidth = i2;
            removeAllViews();
            while (i3 < this.sectionCount) {
                DXNativeProgressView dXNativeProgressView = new DXNativeProgressView(pb6.n(this), getContext());
                initIndicatorAttr(i, dXNativeProgressView);
                addView(dXNativeProgressView, layoutParams);
                i3++;
            }
        }
    }

    public void initIndex(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("604736fa", new Object[]{this, new Integer(i)});
            return;
        }
        la6.b("DXNativeProgressIndicator initIndex");
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (i2 < i) {
                ((DXNativeProgressView) childAt).setProgressWithoutAnim(100.0f);
            } else if (i2 == i) {
                ((DXNativeProgressView) childAt).setProgressWithoutAnim(100.0f);
            } else {
                ((DXNativeProgressView) childAt).setProgressWithoutAnim(0.0f);
            }
        }
    }

    public void prepare() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1afb60e", new Object[]{this});
            return;
        }
        la6.b("DXNativeProgressIndicator prepare");
        int i = (getLayoutParams().width / this.sectionCount) - (this.itemMargin * 2);
        int i2 = getLayoutParams().height;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i, i2);
        layoutParams.gravity = 17;
        int i3 = this.itemMargin;
        layoutParams.leftMargin = i3;
        layoutParams.rightMargin = i3;
        getChildCount();
        prepareView(i2, layoutParams, i);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c047129", new Object[]{this, new Integer(i)});
        } else {
            this.backgroundColor = i;
        }
    }

    public void setIndex(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46180fcc", new Object[]{this, new Integer(i)});
            return;
        }
        la6.b("DXNativeProgressIndicator setIndex");
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (i2 < i) {
                ((DXNativeProgressView) childAt).setProgressWithoutAnim(100.0f);
            } else if (i2 == i) {
                ((DXNativeProgressView) childAt).setProgressWithoutAnim(0.0f);
            } else {
                ((DXNativeProgressView) childAt).setProgressWithoutAnim(0.0f);
            }
        }
    }

    public void setIndexWithAnimation(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de21026e", new Object[]{this, new Integer(i)});
            return;
        }
        la6.b("DXNativeProgressIndicator setIndexWithAnimation");
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt instanceof DXNativeProgressView) {
                if (i2 < i) {
                    ((DXNativeProgressView) childAt).setProgressWithoutAnim(100.0f);
                } else if (i2 == i) {
                    ((DXNativeProgressView) childAt).startProgress(0);
                } else {
                    ((DXNativeProgressView) childAt).setProgressWithoutAnim(0.0f);
                }
            }
        }
    }

    public void setIndicatorColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c30a586", new Object[]{this, new Integer(i)});
        } else {
            this.indicatorColor = i;
        }
    }

    public void setItemMargin(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a7a5499", new Object[]{this, new Integer(i)});
        } else {
            this.itemMargin = i;
        }
    }

    public void setSectionCount(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc51d430", new Object[]{this, new Integer(i)});
        } else {
            this.sectionCount = i;
        }
    }

    public void setSectionDuration(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8dd46e5", new Object[]{this, new Integer(i)});
        } else {
            this.sectionDuration = i;
        }
    }

    public DXNativeProgressIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public DXNativeProgressIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }
}
