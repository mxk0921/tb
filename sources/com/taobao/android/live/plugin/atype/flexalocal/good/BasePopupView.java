package com.taobao.android.live.plugin.atype.flexalocal.good;

import android.app.Activity;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.good.basemvplib.impl.GoodsBaseTempView;
import tb.t2o;
import tb.xea;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public abstract class BasePopupView extends GoodsBaseTempView {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int TRANSLATE_DURATION = 250;
    public ViewGroup mContentView;
    public xea mGoodLiveContext;
    public boolean mIsInit;
    public ViewGroup mViewGroup;
    public boolean mbPopFromRight;

    static {
        t2o.a(295698841);
    }

    public BasePopupView(xea xeaVar, ViewGroup viewGroup) {
        this(xeaVar, viewGroup, false);
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        ViewGroup viewGroup = (ViewGroup) onCreateContentView(this.mViewGroup);
        this.mContentView = viewGroup;
        if (viewGroup != null) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            if (this.mGoodLiveContext.i() instanceof Activity) {
                ((Activity) this.mGoodLiveContext.i()).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            } else {
                displayMetrics = this.mGoodLiveContext.i().getResources().getDisplayMetrics();
            }
            this.mContentView.setLayoutParams(onCreateLayoutParams(this.mContentView, displayMetrics));
        }
    }

    public static /* synthetic */ Object ipc$super(BasePopupView basePopupView, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/good/BasePopupView");
    }

    public Animation createTranslationInAnimation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animation) ipChange.ipc$dispatch("3d687b25", new Object[]{this});
        }
        TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.0f, 1, 0.0f);
        translateAnimation.setDuration(250L);
        return translateAnimation;
    }

    public Animation createTranslationOutAnimation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animation) ipChange.ipc$dispatch("7ca7afc4", new Object[]{this});
        }
        TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, 1.0f);
        translateAnimation.setDuration(250L);
        return translateAnimation;
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.basemvplib.impl.GoodsBaseTempView
    public abstract void destroy();

    public void hide() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9631f0c9", new Object[]{this});
        } else {
            setVisibility(4);
        }
    }

    public boolean isLazyLoad() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6d5a9c4f", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public boolean isShowing() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d3c33646", new Object[]{this})).booleanValue();
        }
        ViewGroup viewGroup = this.mContentView;
        if (viewGroup == null || viewGroup.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    public abstract View onCreateContentView(ViewGroup viewGroup);

    public FrameLayout.LayoutParams onCreateLayoutParams(View view, DisplayMetrics displayMetrics) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout.LayoutParams) ipChange.ipc$dispatch("46bd761c", new Object[]{this, view, displayMetrics});
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new FrameLayout.LayoutParams(-1, -1);
        }
        if (this.mbPopFromRight) {
            layoutParams.gravity = 53;
            int i = displayMetrics.heightPixels;
            layoutParams.width = i;
            layoutParams.height = i;
        } else {
            layoutParams.gravity = 83;
            layoutParams.width = this.mGoodLiveContext.l.k;
        }
        return layoutParams;
    }

    public void show() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebbb9904", new Object[]{this});
            return;
        }
        setVisibility(0);
        if (!this.mIsInit) {
            this.mIsInit = true;
            init();
        }
    }

    public BasePopupView(xea xeaVar, ViewGroup viewGroup, boolean z) {
        super(xeaVar);
        this.mIsInit = false;
        this.mGoodLiveContext = xeaVar;
        this.mbPopFromRight = z;
        this.mViewGroup = viewGroup;
        if (!isLazyLoad()) {
            this.mIsInit = true;
            init();
        }
    }
}
