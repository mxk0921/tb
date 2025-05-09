package com.taobao.taolive.uikit.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.uikit.component.ViewFlipperExt;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class TaoliveHomeFlipperView extends ViewFlipperExt {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int interval = 3000;

    static {
        t2o.a(779093711);
    }

    public TaoliveHomeFlipperView(Context context) {
        super(context);
        init();
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        AnimationSet animationSet = new AnimationSet(true);
        TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.0f, 1, 0.0f);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        animationSet.addAnimation(translateAnimation);
        animationSet.addAnimation(alphaAnimation);
        animationSet.setDuration(300L);
        AnimationSet animationSet2 = new AnimationSet(true);
        TranslateAnimation translateAnimation2 = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, -1.0f);
        AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
        animationSet2.addAnimation(translateAnimation2);
        animationSet2.addAnimation(alphaAnimation2);
        animationSet2.setDuration(300L);
        setInAnimation(animationSet);
        setOutAnimation(animationSet2);
        setFlipInterval(this.interval);
        setAutoStart(true);
    }

    public static /* synthetic */ Object ipc$super(TaoliveHomeFlipperView taoliveHomeFlipperView, String str, Object... objArr) {
        if (str.hashCode() == -461309207) {
            super.onWindowVisibilityChanged(((Number) objArr[0]).intValue());
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/uikit/view/TaoliveHomeFlipperView");
    }

    private void setAccessibilityHidden(View view, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d17a21f", new Object[]{this, view, new Boolean(z)});
        } else if (z) {
            view.setImportantForAccessibility(2);
        } else {
            view.setImportantForAccessibility(0);
        }
    }

    public void hide() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9631f0c9", new Object[]{this});
            return;
        }
        stopFlipping();
        setVisibility(8);
    }

    @Override // com.taobao.taolive.uikit.component.ViewFlipperExt, android.view.View
    public void onWindowVisibilityChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e480fae9", new Object[]{this, new Integer(i)});
            return;
        }
        super.onWindowVisibilityChanged(i);
        if (i == 8 || i == 4) {
            stopFlipping();
        } else if (i == 0) {
            startFlipping();
        }
    }

    @Override // com.taobao.taolive.uikit.component.ViewFlipperExt
    public void pageChange(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2cc9f9d", new Object[]{this, new Integer(i)});
        }
    }

    public void setInterval(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f94af075", new Object[]{this, new Integer(i)});
        } else {
            this.interval = i;
        }
    }

    public void show() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebbb9904", new Object[]{this});
        } else if (getChildCount() > 0) {
            startFlipping();
            setVisibility(0);
        } else {
            setVisibility(8);
        }
    }

    public TaoliveHomeFlipperView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }
}
