package com.taobao.android.fluid.framework.card.cards.video.manager.playhint;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.ir9;
import tb.n0n;
import tb.pr9;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ProgressAnimationView extends View {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "ProgressAnimationView";
    private n0n animationer;
    private View mSeekBar;

    static {
        t2o.a(468714088);
    }

    public ProgressAnimationView(Context context) {
        super(context);
        init();
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
        } else {
            setVisibility(4);
        }
    }

    private void initView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55b93576", new Object[]{this, view});
            return;
        }
        try {
            setBackgroundColor(-1);
            int measuredHeight = view.getMeasuredHeight();
            int c = pr9.c(view.getContext(), 1);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, c);
            int i = (measuredHeight - c) / 2;
            layoutParams.topMargin = i;
            layoutParams.bottomMargin = i;
            layoutParams.addRule(15);
            if (view.getParent() instanceof RelativeLayout) {
                ((RelativeLayout) view.getParent()).addView(this, layoutParams);
            }
            ir9.a(TAG, "initView Complete seekBarHeight=" + measuredHeight);
        } catch (Exception e) {
            ir9.a(TAG, "initView Error " + e.getMessage());
        }
    }

    public static /* synthetic */ Object ipc$super(ProgressAnimationView progressAnimationView, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/framework/card/cards/video/manager/playhint/ProgressAnimationView");
    }

    public void hideProgressAnimation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ded80cbc", new Object[]{this});
        } else if (this.mSeekBar != null) {
            setVisibility(4);
            this.mSeekBar.setVisibility(0);
            n0n n0nVar = this.animationer;
            if (n0nVar != null) {
                n0nVar.b(this);
            }
        }
    }

    public boolean isVisible() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b3aa8873", new Object[]{this})).booleanValue();
        }
        if (getParent() == null || getVisibility() != 0) {
            return false;
        }
        return true;
    }

    public void showProgressAnimation(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c500151", new Object[]{this, view});
        } else if (view != null) {
            if (this.mSeekBar == null) {
                initView(view);
                this.mSeekBar = view;
            }
            setVisibility(0);
            view.setVisibility(8);
            if (this.animationer == null) {
                this.animationer = new n0n();
            }
            this.animationer.a(this);
        }
    }

    public ProgressAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public ProgressAnimationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }
}
