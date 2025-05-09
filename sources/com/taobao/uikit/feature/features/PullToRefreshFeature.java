package com.taobao.uikit.feature.features;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.AbsListView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Scroller;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.uikit.feature.callback.ScrollCallback;
import com.taobao.uikit.feature.callback.TouchEventCallback;
import com.taobao.uikit.feature.features.internal.pullrefresh.IViewEdgeJudge;
import com.taobao.uikit.feature.features.internal.pullrefresh.RefreshController;
import tb.t2o;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class PullToRefreshFeature extends AbsFeature<ListView> implements TouchEventCallback, IViewEdgeJudge, ScrollCallback {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean isAuto = false;
    private Context mContext;
    private RefreshController mRefreshController;
    private Scroller mScroller;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface OnPullToRefreshListener {
        void onPullDownToRefresh();

        void onPullUpToRefresh();
    }

    static {
        t2o.a(931135551);
        t2o.a(931135572);
    }

    public PullToRefreshFeature(Context context) {
        this.mScroller = new Scroller(context, new DecelerateInterpolator());
        this.mRefreshController = new RefreshController(this, context, this.mScroller);
        this.mContext = context;
    }

    public static /* synthetic */ RefreshController access$000(PullToRefreshFeature pullToRefreshFeature) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RefreshController) ipChange.ipc$dispatch("887dc1ee", new Object[]{pullToRefreshFeature});
        }
        return pullToRefreshFeature.mRefreshController;
    }

    private void addScrollListener(ListView listView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdf6caa", new Object[]{this, listView});
        } else {
            listView.setOnScrollListener(new AbsListView.OnScrollListener() { // from class: com.taobao.uikit.feature.features.PullToRefreshFeature.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.widget.AbsListView.OnScrollListener
                public void onScroll(AbsListView absListView, int i, int i2, int i3) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("2eb0734b", new Object[]{this, absListView, new Integer(i), new Integer(i2), new Integer(i3)});
                    } else if (PullToRefreshFeature.access$000(PullToRefreshFeature.this).isScrollStop() && PullToRefreshFeature.access$000(PullToRefreshFeature.this).getState() == 3 && PullToRefreshFeature.this.hasArrivedBottomEdge()) {
                        PullToRefreshFeature.access$000(PullToRefreshFeature.this).autoLoadingData();
                    }
                }

                @Override // android.widget.AbsListView.OnScrollListener
                public void onScrollStateChanged(AbsListView absListView, int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("532cfb08", new Object[]{this, absListView, new Integer(i)});
                    }
                }
            });
        }
    }

    public static /* synthetic */ Object ipc$super(PullToRefreshFeature pullToRefreshFeature, String str, Object... objArr) {
        if (str.hashCode() == 1336372353) {
            super.setHost((PullToRefreshFeature) ((View) objArr[0]));
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/uikit/feature/features/PullToRefreshFeature");
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
            RefreshController refreshController = this.mRefreshController;
            if (refreshController != null && (scroller = this.mScroller) != null) {
                refreshController.onScrollerStateChanged(scroller.getCurrY(), false);
                return;
            }
            return;
        }
        RefreshController refreshController2 = this.mRefreshController;
        if (refreshController2 != null) {
            refreshController2.onScrollerStateChanged(this.mScroller.getCurrY(), true);
        }
        ((ListView) this.mHost).invalidate();
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
        RefreshController refreshController = this.mRefreshController;
        if (refreshController != null) {
            refreshController.onTouchEvent(motionEvent);
        }
    }

    @Override // com.taobao.uikit.feature.features.AbsFeature
    public void constructor(Context context, AttributeSet attributeSet, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8928939c", new Object[]{this, context, attributeSet, new Integer(i)});
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

    public void enablePullUpToRefresh(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bb53150", new Object[]{this, new Boolean(z)});
        } else {
            enablePullUpToRefresh(z, null);
        }
    }

    public int getPullDirection() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f748d57e", new Object[]{this})).intValue();
        }
        RefreshController refreshController = this.mRefreshController;
        if (refreshController != null) {
            return refreshController.getPullDirection();
        }
        return -1;
    }

    public int getPullDownDistance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("22c6288c", new Object[]{this})).intValue();
        }
        RefreshController refreshController = this.mRefreshController;
        if (refreshController != null) {
            return refreshController.getPullDownDistance();
        }
        return -1;
    }

    @Override // com.taobao.uikit.feature.features.internal.pullrefresh.IViewEdgeJudge
    public boolean hasArrivedBottomEdge() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c6cc9e66", new Object[]{this})).booleanValue();
        }
        if (((ListView) this.mHost).getLastVisiblePosition() != ((ListView) this.mHost).getCount() - 1 || ((ListView) this.mHost).getFirstVisiblePosition() == 0) {
            return false;
        }
        return true;
    }

    @Override // com.taobao.uikit.feature.features.internal.pullrefresh.IViewEdgeJudge
    public boolean hasArrivedTopEdge() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a3cf15ca", new Object[]{this})).booleanValue();
        }
        if (((ListView) this.mHost).getFirstVisiblePosition() == 0) {
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
        RefreshController refreshController = this.mRefreshController;
        if (refreshController != null) {
            refreshController.isHeadViewHeightContainImage(z);
        }
    }

    public boolean isScrollStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c167144", new Object[]{this})).booleanValue();
        }
        RefreshController refreshController = this.mRefreshController;
        if (refreshController == null || !refreshController.isScrollStop()) {
            return false;
        }
        return true;
    }

    @Override // com.taobao.uikit.feature.features.internal.pullrefresh.IViewEdgeJudge
    public void keepBottom() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0ff3697", new Object[]{this});
            return;
        }
        T t = this.mHost;
        ((ListView) t).setSelection(((ListView) t).getCount());
    }

    @Override // com.taobao.uikit.feature.features.internal.pullrefresh.IViewEdgeJudge
    public void keepTop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad48f017", new Object[]{this});
        } else {
            ((ListView) this.mHost).setSelection(0);
        }
    }

    public void onPullRefreshComplete() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1283a857", new Object[]{this});
            return;
        }
        RefreshController refreshController = this.mRefreshController;
        if (refreshController != null) {
            refreshController.onRefreshComplete();
        }
    }

    @Override // com.taobao.uikit.feature.features.internal.pullrefresh.IViewEdgeJudge
    public void removeFooterView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9968de7", new Object[]{this, view});
            return;
        }
        T t = this.mHost;
        if (t != 0) {
            ((ListView) t).removeFooterView(view);
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
            ((ListView) t).removeHeaderView(view);
        }
    }

    public void setDownRefreshBackgroundColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73ff6e5e", new Object[]{this, new Integer(i)});
            return;
        }
        RefreshController refreshController = this.mRefreshController;
        if (refreshController != null) {
            refreshController.setDownRefreshBackgroundColor(i);
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
            return;
        }
        T t = this.mHost;
        if (t != 0) {
            ((ListView) t).addFooterView(view);
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
            ((ListView) t).addHeaderView(view);
        }
    }

    public void setIsDownRefreshing() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8f897bc", new Object[]{this});
            return;
        }
        RefreshController refreshController = this.mRefreshController;
        if (refreshController != null) {
            refreshController.setIsDownRefreshing();
        }
    }

    public void setIsUpRefreshing() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("308b3cf5", new Object[]{this});
            return;
        }
        RefreshController refreshController = this.mRefreshController;
        if (refreshController != null) {
            refreshController.setIsUpRefreshing();
        }
    }

    public void setOnPullToRefreshListener(OnPullToRefreshListener onPullToRefreshListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("118dd624", new Object[]{this, onPullToRefreshListener});
            return;
        }
        RefreshController refreshController = this.mRefreshController;
        if (refreshController != null) {
            refreshController.setOnRefreshListener(onPullToRefreshListener);
        }
    }

    public void setPullDownRefreshTips(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9204f40e", new Object[]{this, strArr});
            return;
        }
        RefreshController refreshController = this.mRefreshController;
        if (refreshController != null) {
            refreshController.setDownRefreshTips(strArr);
        }
    }

    public void setPullUpRefreshTips(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ef31d87", new Object[]{this, strArr});
            return;
        }
        RefreshController refreshController = this.mRefreshController;
        if (refreshController != null) {
            refreshController.setUpRefreshTips(strArr);
        }
    }

    public void setPullUpToRefreshAuto(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("613d8940", new Object[]{this, new Boolean(z)});
            return;
        }
        this.mRefreshController.setPullUpRefreshAuto(z);
        this.isAuto = z;
        if (getHost() != null && z) {
            addScrollListener(getHost());
        }
    }

    public void setRefreshViewColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2bd8ad7", new Object[]{this, new Integer(i)});
            return;
        }
        RefreshController refreshController = this.mRefreshController;
        if (refreshController != null) {
            refreshController.setRefreshViewColor(i);
        }
    }

    public void setUpRefreshBackgroundColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ead3c845", new Object[]{this, new Integer(i)});
            return;
        }
        RefreshController refreshController = this.mRefreshController;
        if (refreshController != null) {
            refreshController.setUpRefreshBackgroundColor(i);
        }
    }

    public void setUpRefreshFinish(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bfa6ca1c", new Object[]{this, new Boolean(z)});
        } else {
            this.mRefreshController.setUpRefreshFinish(z);
        }
    }

    @Override // com.taobao.uikit.feature.features.internal.pullrefresh.IViewEdgeJudge
    public void trigger() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7573e3f", new Object[]{this});
        } else {
            ((ListView) this.mHost).computeScroll();
        }
    }

    public void enablePullUpToRefresh(boolean z, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc84e582", new Object[]{this, new Boolean(z), view});
        } else {
            enablePullUpToRefresh(z, R.string.uik_refresh_arrow, view);
        }
    }

    public void setHost(ListView listView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f215e22", new Object[]{this, listView});
            return;
        }
        super.setHost((PullToRefreshFeature) listView);
        this.mRefreshController.addFooterView();
        this.mRefreshController.addHeaderView();
        if (this.isAuto) {
            addScrollListener(listView);
        }
    }

    public void enablePullUpToRefresh(boolean z, int i, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9f0523f", new Object[]{this, new Boolean(z), new Integer(i), view});
            return;
        }
        RefreshController refreshController = this.mRefreshController;
        if (refreshController != null) {
            if (z) {
                refreshController.enablePullUpRefresh(true, i, view);
            } else {
                refreshController.enablePullUpRefresh(false, 0, null);
            }
        }
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

    @Deprecated
    public void enablePullUpToRefresh(boolean z, int i, int i2, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69f27d22", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), view});
        } else {
            enablePullUpToRefresh(z, view);
        }
    }

    public void enablePullDownToRefresh(boolean z, View view, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ffdcfd9", new Object[]{this, new Boolean(z), view, new Boolean(z2)});
        } else if (z) {
            this.mRefreshController.enablePullDownRefresh(true, R.string.uik_refresh_arrow, view, z2);
        } else {
            this.mRefreshController.enablePullDownRefresh(false, 0, null);
        }
    }

    @Deprecated
    public void enablePullDownToRefresh(boolean z, int i, int i2, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ab773bb", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), view});
        } else {
            enablePullDownToRefresh(z, view);
        }
    }
}
