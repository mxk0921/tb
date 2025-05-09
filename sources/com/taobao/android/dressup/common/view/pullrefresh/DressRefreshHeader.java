package com.taobao.android.dressup.common.view.pullrefresh;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.component.refresh.TBRefreshHeader;
import com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import kotlin.Deprecated;
import kotlin.Metadata;
import tb.ckf;
import tb.gz7;
import tb.hfn;
import tb.t2o;
import tb.uuo;
import tb.xhv;
import tb.xxl;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\nJ\u0017\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0018\u001a\u00020\b2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001d\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010\"\u001a\u00020\b2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0016¢\u0006\u0004\b\"\u0010#J\u0019\u0010&\u001a\u00020\b2\b\b\u0001\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010*\u001a\u00020\b2\u0006\u0010)\u001a\u00020(H\u0007¢\u0006\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00103\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00106\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u00108\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0018\u0010;\u001a\u0004\u0018\u00010:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<¨\u0006="}, d2 = {"Lcom/taobao/android/dressup/common/view/pullrefresh/DressRefreshHeader;", "Lcom/taobao/uikit/extend/component/refresh/TBRefreshHeader;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", xxl.PERCENT, "Ltb/xhv;", "changeHeaderAlpha", "(F)V", "startArrowAnim", "()V", "showArrow", "progress", "setProgress", "Lcom/taobao/uikit/extend/component/refresh/TBRefreshHeader$RefreshState;", "state", "changeToState", "(Lcom/taobao/uikit/extend/component/refresh/TBRefreshHeader$RefreshState;)V", "", "", "jsonAnim", "assetFolder", "setRefreshAnimation", "([Ljava/lang/String;Ljava/lang/String;)V", "Landroid/view/View;", "getRefreshView", "()Landroid/view/View;", "getSecondFloorView", "secondFloorView", "setSecondFloorView", "(Landroid/view/View;)V", "tips", "setRefreshTips", "([Ljava/lang/String;)V", "", "color", "setRefreshTipColor", "(I)V", "", "isShowLoadingTip", "showLoadingTip", "(Z)V", "Landroid/widget/FrameLayout;", "mRefreshHeaderView", "Landroid/widget/FrameLayout;", "Lcom/taobao/android/dressup/common/view/pullrefresh/RefreshHeaderView;", "mRefreshHeadView", "Lcom/taobao/android/dressup/common/view/pullrefresh/RefreshHeaderView;", "Landroid/widget/TextView;", "mRefreshTipView", "Landroid/widget/TextView;", "Lcom/taobao/uikit/extend/feature/view/TUrlImageView;", "mRefreshIconView", "Lcom/taobao/uikit/extend/feature/view/TUrlImageView;", "mSecondFloorView", "Landroid/view/View;", "Landroid/animation/ObjectAnimator;", "mFadeAnimationSet", "Landroid/animation/ObjectAnimator;", "turboflow_dressup_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class DressRefreshHeader extends TBRefreshHeader {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private ObjectAnimator mFadeAnimationSet;
    private final RefreshHeaderView mRefreshHeadView;
    private final FrameLayout mRefreshHeaderView;
    private final TUrlImageView mRefreshIconView;
    private final TextView mRefreshTipView;
    private View mSecondFloorView;

    static {
        t2o.a(918552812);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DressRefreshHeader(Context context) {
        super(context);
        ckf.g(context, "context");
        FrameLayout frameLayout = new FrameLayout(context);
        this.mRefreshHeaderView = frameLayout;
        addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
        this.mSecondFloorView = new FrameLayout(context);
        frameLayout.addView(this.mSecondFloorView, new FrameLayout.LayoutParams(-1, -1));
        setBackgroundResource(R.color.uik_refresh_head_bg);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 81;
        RefreshHeaderView refreshHeaderView = new RefreshHeaderView(context);
        this.mRefreshHeadView = refreshHeaderView;
        frameLayout.addView(refreshHeaderView, layoutParams);
        this.mRefreshTipView = refreshHeaderView.getStatusTextView();
        this.mRefreshIconView = refreshHeaderView.getIconImageView();
        changeToState(TBRefreshHeader.RefreshState.NONE);
    }

    private final void changeHeaderAlpha(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("588897b8", new Object[]{this, new Float(f)});
        } else {
            this.mRefreshHeadView.setAlpha(hfn.o(f, 0.0f, 1.0f));
        }
    }

    public static /* synthetic */ Object ipc$super(DressRefreshHeader dressRefreshHeader, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dressup/common/view/pullrefresh/DressRefreshHeader");
    }

    private final void showArrow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c8d1d93", new Object[]{this});
            return;
        }
        ObjectAnimator objectAnimator = this.mFadeAnimationSet;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // com.taobao.uikit.extend.component.refresh.TBRefreshHeader
    public View getRefreshView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("378be073", new Object[]{this});
        }
        return this.mRefreshHeadView;
    }

    @Override // com.taobao.uikit.extend.component.refresh.TBRefreshHeader
    public View getSecondFloorView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("d44bd650", new Object[]{this});
        }
        return this.mSecondFloorView;
    }

    @Override // com.taobao.uikit.extend.component.refresh.TBRefreshHeader
    public void setProgress(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bf028ca", new Object[]{this, new Float(f)});
        } else if (this.mState == TBRefreshHeader.RefreshState.PULL_TO_REFRESH) {
            changeHeaderAlpha(f);
        }
    }

    @Override // com.taobao.uikit.extend.component.refresh.TBRefreshHeader
    public void setRefreshAnimation(String[] strArr, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a9e81f7", new Object[]{this, strArr, str});
        } else {
            ckf.g(strArr, "jsonAnim");
        }
    }

    @Override // com.taobao.uikit.extend.component.refresh.TBRefreshHeader
    public void setRefreshTipColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e29913b", new Object[]{this, new Integer(i)});
        } else {
            this.mRefreshTipView.setTextColor(i);
        }
    }

    @Override // com.taobao.uikit.extend.component.refresh.TBRefreshHeader
    public void setRefreshTips(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e253df27", new Object[]{this, strArr});
        } else {
            ckf.g(strArr, "tips");
        }
    }

    @Deprecated(message = "请使用changeToState()来管理刷新头部的可见性")
    public final void showLoadingTip(boolean z) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b8b5411", new Object[]{this, new Boolean(z)});
        } else if (this.mState == TBRefreshHeader.RefreshState.REFRESHING) {
            RefreshHeaderView refreshHeaderView = this.mRefreshHeadView;
            if (!z) {
                i = 8;
            }
            refreshHeaderView.setVisibility(i);
        }
    }

    @Override // com.taobao.uikit.extend.component.refresh.TBRefreshHeader
    public void setSecondFloorView(View view) {
        FrameLayout.LayoutParams layoutParams;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf1b4090", new Object[]{this, view});
            return;
        }
        ckf.g(view, "secondFloorView");
        if (view.getLayoutParams() == null) {
            layoutParams = new FrameLayout.LayoutParams(-2, -2);
        } else {
            layoutParams = new FrameLayout.LayoutParams(view.getLayoutParams());
        }
        layoutParams.gravity = 80;
        this.mRefreshHeaderView.removeView(this.mSecondFloorView);
        this.mRefreshHeaderView.addView(view, 0, layoutParams);
        this.mSecondFloorView = view;
    }

    private final void startArrowAnim() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a536afff", new Object[]{this});
            return;
        }
        if (this.mFadeAnimationSet == null) {
            ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this.mRefreshIconView, PropertyValuesHolder.ofFloat("scaleX", 1.0f, 0.0f), PropertyValuesHolder.ofFloat("scaleY", 1.0f, 0.0f), PropertyValuesHolder.ofFloat("alpha", 1.0f, 0.0f));
            ofPropertyValuesHolder.setDuration(200L);
            xhv xhvVar = xhv.INSTANCE;
            this.mFadeAnimationSet = ofPropertyValuesHolder;
        }
        ObjectAnimator objectAnimator = this.mFadeAnimationSet;
        if (objectAnimator != null) {
            objectAnimator.start();
        }
    }

    @Override // com.taobao.uikit.extend.component.refresh.TBRefreshHeader
    public void changeToState(TBRefreshHeader.RefreshState refreshState) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2396ba61", new Object[]{this, refreshState});
            return;
        }
        ckf.g(refreshState, "state");
        TBRefreshHeader.RefreshState refreshState2 = this.mState;
        if (refreshState2 != refreshState) {
            TBSwipeRefreshLayout.OnPullRefreshListener onPullRefreshListener = this.mPullRefreshListener;
            if (onPullRefreshListener != null) {
                onPullRefreshListener.onRefreshStateChanged(refreshState2, refreshState);
            }
            this.mState = refreshState;
            int i = gz7.$EnumSwitchMapping$0[refreshState.ordinal()];
            if (i == 1) {
                this.mRefreshTipView.setText("已刷新");
                this.mRefreshIconView.setImageUrl(uuo.p("dressup_refresh_complete.apng"));
                changeHeaderAlpha(1.0f);
            } else if (i == 2) {
                showArrow();
                this.mRefreshTipView.setVisibility(0);
                this.mRefreshTipView.setText("下拉刷新");
                this.mRefreshIconView.setImageUrl(uuo.p("dressup_pull_refresh.apng"));
                this.mRefreshHeadView.setVisibility(0);
            } else if (i == 3) {
                startArrowAnim();
                this.mRefreshTipView.setText("松开刷新");
                this.mRefreshIconView.setImageUrl(uuo.p("dressup_release_refresh.png"));
                this.mRefreshHeadView.setVisibility(0);
            } else if (i == 4) {
                this.mRefreshTipView.setText("正在刷新...");
                this.mRefreshIconView.setImageUrl(uuo.p("dressup_refreshing.apng"));
                this.mRefreshHeadView.setVisibility(0);
            } else if (i == 5) {
                this.mRefreshHeadView.setVisibility(8);
            }
        }
    }
}
