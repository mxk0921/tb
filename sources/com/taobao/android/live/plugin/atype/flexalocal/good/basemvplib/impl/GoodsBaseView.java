package com.taobao.android.live.plugin.atype.flexalocal.good.basemvplib.impl;

import android.app.Activity;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.good.insideprefetch.InsidePrefetchHelper;
import tb.bdd;
import tb.r9e;
import tb.t2o;
import tb.xea;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public abstract class GoodsBaseView<T extends bdd> extends GoodsBaseTempView implements r9e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int TRANSLATE_DURATION = 250;
    public InsidePrefetchHelper insidePrefetchHelper;
    public ViewGroup mContentView;
    public T mPresenter;
    public boolean mbPopFromRight;

    static {
        t2o.a(295698851);
        t2o.a(295698847);
    }

    public GoodsBaseView(xea xeaVar, boolean z) {
        super(xeaVar);
        this.mbPopFromRight = z;
        this.insidePrefetchHelper = new InsidePrefetchHelper(xeaVar);
    }

    public static /* synthetic */ Object ipc$super(GoodsBaseView goodsBaseView, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/good/basemvplib/impl/GoodsBaseView");
    }

    public void attachView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ed22211", new Object[]{this});
            return;
        }
        T t = this.mPresenter;
        if (t != null) {
            t.I(this);
        }
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
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        T t = this.mPresenter;
        if (t != null) {
            t.p();
        }
        InsidePrefetchHelper insidePrefetchHelper = this.insidePrefetchHelper;
        if (insidePrefetchHelper != null) {
            insidePrefetchHelper.i();
        }
    }

    public void hide() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9631f0c9", new Object[]{this});
        } else {
            setVisibility(4);
        }
    }

    public abstract T initInjector();

    public void initView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce529ddc", new Object[]{this});
            return;
        }
        ViewGroup viewGroup = (ViewGroup) onCreateContentView();
        this.mContentView = viewGroup;
        if (viewGroup != null) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            if (this.mGoodLiveContext.i() instanceof Activity) {
                ((Activity) this.mGoodLiveContext.i()).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            } else {
                displayMetrics = this.mGoodLiveContext.i().getResources().getDisplayMetrics();
            }
            this.mContentView.setLayoutParams(onCreateLayoutParams(this.mContentView, displayMetrics));
            this.mPresenter = initInjector();
            attachView();
            addView(this.mContentView, new FrameLayout.LayoutParams(-1, -1));
        }
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

    public abstract View onCreateContentView();

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
            layoutParams.gravity = 85;
            layoutParams.width = this.mGoodLiveContext.l.k;
        }
        return layoutParams;
    }

    public void preFetchInsideDetailData(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c28378bf", new Object[]{this, str});
            return;
        }
        InsidePrefetchHelper insidePrefetchHelper = this.insidePrefetchHelper;
        if (insidePrefetchHelper != null) {
            insidePrefetchHelper.h(str);
        }
    }

    public void show() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebbb9904", new Object[]{this});
        } else {
            setVisibility(0);
        }
    }
}
