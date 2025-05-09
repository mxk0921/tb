package com.taobao.android.detail.ttdetail.widget.desc;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.ScaleAnimation;
import android.widget.RelativeLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.mr7;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class WavingSymbolView extends RelativeLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private AnimationSet mAnimationSet;
    private View point;
    private View shadow;

    static {
        t2o.a(912262966);
    }

    public WavingSymbolView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context);
    }

    private void init(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
            return;
        }
        LayoutInflater.from(context).inflate(R.layout.tt_detail_view_wavingsymbol, (ViewGroup) this, true);
        this.shadow = findViewById(R.id.v_symbol_shadow);
        this.point = findViewById(R.id.v_symbol_point);
        this.mAnimationSet = new AnimationSet(true);
        float a2 = mr7.a(15.0f);
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.3f, 1.0f, 0.3f, 1.0f, a2, a2);
        scaleAnimation.setRepeatCount(Integer.MAX_VALUE);
        this.mAnimationSet.addAnimation(scaleAnimation);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setRepeatCount(Integer.MAX_VALUE);
        this.mAnimationSet.addAnimation(alphaAnimation);
        this.mAnimationSet.setInterpolator(new DecelerateInterpolator());
        this.mAnimationSet.setDuration(1000L);
    }

    public static /* synthetic */ Object ipc$super(WavingSymbolView wavingSymbolView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 949399698) {
            super.onDetachedFromWindow();
            return null;
        } else if (hashCode == 1626033557) {
            super.onAttachedToWindow();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/detail/ttdetail/widget/desc/WavingSymbolView");
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        this.shadow.clearAnimation();
        this.shadow.startAnimation(this.mAnimationSet);
    }

    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        this.mAnimationSet.reset();
        this.shadow.clearAnimation();
        this.shadow = null;
        this.point = null;
        removeAllViews();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        this.shadow.clearAnimation();
        this.mAnimationSet.reset();
    }

    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
        } else {
            this.shadow.clearAnimation();
        }
    }

    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        this.shadow.clearAnimation();
        this.shadow.startAnimation(this.mAnimationSet);
    }

    public WavingSymbolView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context);
    }

    public WavingSymbolView(Context context) {
        super(context);
        init(context);
    }
}
