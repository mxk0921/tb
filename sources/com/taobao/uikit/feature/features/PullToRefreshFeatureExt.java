package com.taobao.uikit.feature.features;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Scroller;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.uikit.feature.callback.ScrollCallback;
import com.taobao.uikit.feature.callback.TouchEventCallback;
import com.taobao.uikit.feature.features.internal.pullrefresh.IViewEdgeJudge;
import com.taobao.uikit.feature.features.internal.pullrefresh.RefreshControllerExt;
import tb.t2o;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class PullToRefreshFeatureExt extends AbsFeature<ScrollView> implements TouchEventCallback, IViewEdgeJudge, ScrollCallback {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Context mContext;
    private RefreshControllerExt mRefreshController;
    private Scroller mScroller;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface OnPullToRefreshListenerExt {
        void onPullDownToRefresh();

        void onReadyToJump(boolean z, float f);

        void onRefreshStateChanged(int i, boolean z);
    }

    static {
        t2o.a(931135554);
        t2o.a(931135572);
    }

    public PullToRefreshFeatureExt(Context context) {
        this.mScroller = null;
        this.mScroller = new Scroller(context, new DecelerateInterpolator());
        this.mContext = context;
        this.mRefreshController = new RefreshControllerExt(this.mContext, this.mScroller, this);
    }

    public static /* synthetic */ Object ipc$super(PullToRefreshFeatureExt pullToRefreshFeatureExt, String str, Object... objArr) {
        if (str.hashCode() == 1336372353) {
            super.setHost((PullToRefreshFeatureExt) ((View) objArr[0]));
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/uikit/feature/features/PullToRefreshFeatureExt");
    }

    @Override // com.taobao.uikit.feature.callback.ScrollCallback
    public void afterComputeScroll() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("559935ef", new Object[]{this});
        }
    }

    @Override // com.taobao.uikit.feature.callback.TouchEventCallback
    public void afterDispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c82badcd", new Object[]{this, motionEvent});
        }
    }

    @Override // com.taobao.uikit.feature.callback.ScrollCallback
    public void afterOnScrollChanged(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41622bd3", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        }
    }

    @Override // com.taobao.uikit.feature.callback.TouchEventCallback
    public void afterOnTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35369b32", new Object[]{this, motionEvent});
        }
    }

    @Override // com.taobao.uikit.feature.callback.ScrollCallback
    public void beforeComputeScroll() {
        Scroller scroller;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6c216ac", new Object[]{this});
            return;
        }
        Scroller scroller2 = this.mScroller;
        if (scroller2 == null || !scroller2.computeScrollOffset()) {
            RefreshControllerExt refreshControllerExt = this.mRefreshController;
            if (refreshControllerExt != null && (scroller = this.mScroller) != null) {
                refreshControllerExt.onScrollerStateChanged(scroller.getCurrY(), false);
                return;
            }
            return;
        }
        RefreshControllerExt refreshControllerExt2 = this.mRefreshController;
        if (refreshControllerExt2 != null) {
            refreshControllerExt2.onScrollerStateChanged(this.mScroller.getCurrY(), true);
        }
        ((ScrollView) this.mHost).invalidate();
    }

    @Override // com.taobao.uikit.feature.callback.TouchEventCallback
    public void beforeDispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f585f570", new Object[]{this, motionEvent});
        }
    }

    @Override // com.taobao.uikit.feature.callback.ScrollCallback
    public void beforeOnScrollChanged(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b65ccad0", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        }
    }

    @Override // com.taobao.uikit.feature.callback.TouchEventCallback
    public void beforeOnTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("673c1915", new Object[]{this, motionEvent});
            return;
        }
        RefreshControllerExt refreshControllerExt = this.mRefreshController;
        if (refreshControllerExt != null) {
            refreshControllerExt.onTouchEvent(motionEvent);
        }
    }

    @Override // com.taobao.uikit.feature.features.AbsFeature
    public void constructor(Context context, AttributeSet attributeSet, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8928939c", new Object[]{this, context, attributeSet, new Integer(i)});
        }
    }

    public void enableJump(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a16cb57c", new Object[]{this, new Boolean(z)});
            return;
        }
        RefreshControllerExt refreshControllerExt = this.mRefreshController;
        if (refreshControllerExt != null) {
            refreshControllerExt.enableJump(z);
        }
    }

    public void enablePullDownToRefresh(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27f2d17", new Object[]{this, new Boolean(z)});
            return;
        }
        ImageView imageView = new ImageView(this.mContext);
        imageView.setImageResource(R.drawable.uik_list_logo);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        enablePullDownToRefresh(z, imageView);
    }

    public int getPullDownDistance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("22c6288c", new Object[]{this})).intValue();
        }
        RefreshControllerExt refreshControllerExt = this.mRefreshController;
        if (refreshControllerExt != null) {
            return refreshControllerExt.getPullDownDistance();
        }
        return -1;
    }

    public View getRefreshView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("378be073", new Object[]{this});
        }
        RefreshControllerExt refreshControllerExt = this.mRefreshController;
        if (refreshControllerExt != null) {
            return refreshControllerExt.getRefreshView();
        }
        return null;
    }

    @Override // com.taobao.uikit.feature.features.internal.pullrefresh.IViewEdgeJudge
    public boolean hasArrivedBottomEdge() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c6cc9e66", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.uikit.feature.features.internal.pullrefresh.IViewEdgeJudge
    public boolean hasArrivedTopEdge() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a3cf15ca", new Object[]{this})).booleanValue();
        }
        if (((ScrollView) this.mHost).getScrollY() <= 0) {
            return true;
        }
        return false;
    }

    public void isHeadViewHeightContainImage(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64f5a750", new Object[]{this, new Boolean(z)});
            return;
        }
        RefreshControllerExt refreshControllerExt = this.mRefreshController;
        if (refreshControllerExt != null) {
            refreshControllerExt.isHeadViewHeightContainImage(z);
        }
    }

    @Override // com.taobao.uikit.feature.features.internal.pullrefresh.IViewEdgeJudge
    public void keepBottom() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0ff3697", new Object[]{this});
        }
    }

    @Override // com.taobao.uikit.feature.features.internal.pullrefresh.IViewEdgeJudge
    public void keepTop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad48f017", new Object[]{this});
        } else {
            ((ScrollView) this.mHost).setScrollY(0);
        }
    }

    public void onPullRefreshComplete() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1283a857", new Object[]{this});
            return;
        }
        RefreshControllerExt refreshControllerExt = this.mRefreshController;
        if (refreshControllerExt != null) {
            refreshControllerExt.onRefreshComplete();
        }
    }

    @Override // com.taobao.uikit.feature.features.internal.pullrefresh.IViewEdgeJudge
    public void removeFooterView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9968de7", new Object[]{this, view});
        }
    }

    @Override // com.taobao.uikit.feature.features.internal.pullrefresh.IViewEdgeJudge
    public void removeHeaderView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73ddd9b5", new Object[]{this, view});
            return;
        }
        T t = this.mHost;
        if (t != 0) {
            LinearLayout linearLayout = (LinearLayout) ((ScrollView) t).findViewById(R.id.uik_refresh_layout);
            View findViewById = ((ScrollView) this.mHost).findViewById(R.id.uik_refresh_header);
            if (linearLayout != null) {
                View childAt = linearLayout.getChildAt(1);
                ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
                ((ScrollView) this.mHost).removeView(linearLayout);
                ((ScrollView) this.mHost).addView(childAt, layoutParams);
            } else if (findViewById != null) {
                ((ScrollView) this.mHost).removeView(findViewById);
            }
        }
    }

    public void reset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
            return;
        }
        RefreshControllerExt refreshControllerExt = this.mRefreshController;
        if (refreshControllerExt != null) {
            refreshControllerExt.reset();
        }
    }

    public void setDistanceToJump(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2c740bc", new Object[]{this, new Integer(i)});
            return;
        }
        RefreshControllerExt refreshControllerExt = this.mRefreshController;
        if (refreshControllerExt != null) {
            refreshControllerExt.mDistanceToJump = i;
        }
    }

    public void setDownRefreshFinish(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a1833e3", new Object[]{this, new Boolean(z)});
        } else {
            this.mRefreshController.setDownRefreshFinish(z);
        }
    }

    @Override // com.taobao.uikit.feature.features.internal.pullrefresh.IViewEdgeJudge
    public void setFooterView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44903dc9", new Object[]{this, view});
        }
    }

    @Override // com.taobao.uikit.feature.features.internal.pullrefresh.IViewEdgeJudge
    public void setHeadView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1754f9e4", new Object[]{this, view});
            return;
        }
        T t = this.mHost;
        if (t != 0) {
            ((ScrollView) t).setOverScrollMode(2);
            view.setId(R.id.uik_refresh_header);
            View childAt = ((ScrollView) this.mHost).getChildAt(0);
            if (!(childAt instanceof ViewGroup)) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                ((ScrollView) this.mHost).removeViewAt(0);
                LinearLayout linearLayout = new LinearLayout(((ScrollView) this.mHost).getContext());
                linearLayout.setOrientation(1);
                linearLayout.setId(R.id.uik_refresh_layout);
                linearLayout.addView(view);
                linearLayout.addView(childAt);
                ((ScrollView) this.mHost).addView(linearLayout, layoutParams);
            } else if (childAt instanceof LinearLayout) {
                LinearLayout linearLayout2 = (LinearLayout) childAt;
                if (linearLayout2.getOrientation() == 1) {
                    linearLayout2.addView(view, 0);
                }
            }
        }
    }

    public void setHeadViewBackground(Drawable drawable) {
        View findViewById;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe886ee0", new Object[]{this, drawable});
            return;
        }
        T t = this.mHost;
        if (t != 0 && (findViewById = ((ScrollView) t).findViewById(R.id.uik_refresh_header)) != null) {
            findViewById.setBackgroundDrawable(drawable);
        }
    }

    public void setHeadViewBackgroundColor(int i) {
        View findViewById;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6346cb6e", new Object[]{this, new Integer(i)});
            return;
        }
        T t = this.mHost;
        if (t != 0 && (findViewById = ((ScrollView) t).findViewById(R.id.uik_refresh_header)) != null) {
            findViewById.setBackgroundColor(i);
        }
    }

    public void setOnPullToRefreshListener(OnPullToRefreshListenerExt onPullToRefreshListenerExt) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f69fe5c", new Object[]{this, onPullToRefreshListenerExt});
            return;
        }
        RefreshControllerExt refreshControllerExt = this.mRefreshController;
        if (refreshControllerExt != null) {
            refreshControllerExt.setOnRefreshListener(onPullToRefreshListenerExt);
        }
    }

    public void setPullDownRefreshTips(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9204f40e", new Object[]{this, strArr});
            return;
        }
        RefreshControllerExt refreshControllerExt = this.mRefreshController;
        if (refreshControllerExt != null) {
            refreshControllerExt.setDownRefreshTips(strArr);
        }
    }

    public void setRefreshViewColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2bd8ad7", new Object[]{this, new Integer(i)});
            return;
        }
        RefreshControllerExt refreshControllerExt = this.mRefreshController;
        if (refreshControllerExt != null) {
            refreshControllerExt.setRefreshViewColor(i);
        }
    }

    @Override // com.taobao.uikit.feature.features.internal.pullrefresh.IViewEdgeJudge
    public void trigger() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7573e3f", new Object[]{this});
        } else {
            ((ScrollView) this.mHost).computeScroll();
        }
    }

    public void setHost(ScrollView scrollView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cff071d3", new Object[]{this, scrollView});
            return;
        }
        super.setHost((PullToRefreshFeatureExt) scrollView);
        this.mRefreshController.addHeaderView();
    }

    public void enablePullDownToRefresh(boolean z, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4318ae5b", new Object[]{this, new Boolean(z), view});
        } else {
            enablePullDownToRefresh(z, R.string.uik_refresh_arrow, view);
        }
    }

    public void enablePullDownToRefresh(boolean z, int i, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25d5a486", new Object[]{this, new Boolean(z), new Integer(i), view});
        } else if (z) {
            this.mRefreshController.enablePullDownRefresh(true, i, view);
        } else {
            this.mRefreshController.enablePullDownRefresh(false, 0, null);
        }
    }
}
