package com.taobao.trade.uikit.feature.features;

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
import tb.h5u;
import tb.hv;
import tb.kun;
import tb.qxo;
import tb.t2o;
import tb.t9e;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class PullToRefreshFeature extends hv<ListView> implements h5u, t9e, qxo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean isAuto = false;
    private Context mContext;
    private kun mRefreshController;
    private Scroller mScroller;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface a {
    }

    static {
        t2o.a(724566085);
        t2o.a(724566078);
        t2o.a(724566089);
        t2o.a(724566076);
    }

    public PullToRefreshFeature(Context context) {
        this.mScroller = new Scroller(context, new DecelerateInterpolator());
        this.mRefreshController = new kun(this, context, this.mScroller);
        this.mContext = context;
    }

    public static /* synthetic */ kun access$000(PullToRefreshFeature pullToRefreshFeature) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kun) ipChange.ipc$dispatch("18ee25de", new Object[]{pullToRefreshFeature});
        }
        return pullToRefreshFeature.mRefreshController;
    }

    private void addScrollListener(ListView listView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdf6caa", new Object[]{this, listView});
        } else {
            listView.setOnScrollListener(new AbsListView.OnScrollListener() { // from class: com.taobao.trade.uikit.feature.features.PullToRefreshFeature.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.widget.AbsListView.OnScrollListener
                public void onScroll(AbsListView absListView, int i, int i2, int i3) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("2eb0734b", new Object[]{this, absListView, new Integer(i), new Integer(i2), new Integer(i3)});
                    } else if (PullToRefreshFeature.access$000(PullToRefreshFeature.this).t() && PullToRefreshFeature.access$000(PullToRefreshFeature.this).q() == 3 && PullToRefreshFeature.this.hasArrivedBottomEdge()) {
                        PullToRefreshFeature.access$000(PullToRefreshFeature.this).d();
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
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/trade/uikit/feature/features/PullToRefreshFeature");
    }

    @Override // tb.qxo
    public void afterComputeScroll() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("559935ef", new Object[]{this});
        }
    }

    @Override // tb.h5u
    public void afterDispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c82badcd", new Object[]{this, motionEvent});
        }
    }

    public void afterOnScrollChanged(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41622bd3", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        }
    }

    @Override // tb.h5u
    public void afterOnTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35369b32", new Object[]{this, motionEvent});
        }
    }

    @Override // tb.qxo
    public void beforeComputeScroll() {
        Scroller scroller;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6c216ac", new Object[]{this});
            return;
        }
        Scroller scroller2 = this.mScroller;
        if (scroller2 == null || !scroller2.computeScrollOffset()) {
            kun kunVar = this.mRefreshController;
            if (kunVar != null && (scroller = this.mScroller) != null) {
                kunVar.w(scroller.getCurrY(), false);
                return;
            }
            return;
        }
        kun kunVar2 = this.mRefreshController;
        if (kunVar2 != null) {
            kunVar2.w(this.mScroller.getCurrY(), true);
        }
        ((ListView) this.mHost).invalidate();
    }

    @Override // tb.h5u
    public void beforeDispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f585f570", new Object[]{this, motionEvent});
        }
    }

    public void beforeOnScrollChanged(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b65ccad0", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        }
    }

    @Override // tb.h5u
    public void beforeOnTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("673c1915", new Object[]{this, motionEvent});
            return;
        }
        kun kunVar = this.mRefreshController;
        if (kunVar != null) {
            kunVar.x(motionEvent);
        }
    }

    @Override // tb.hv
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
        kun kunVar = this.mRefreshController;
        if (kunVar != null) {
            return kunVar.o();
        }
        return -1;
    }

    public int getPullDownDistance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("22c6288c", new Object[]{this})).intValue();
        }
        kun kunVar = this.mRefreshController;
        if (kunVar != null) {
            return kunVar.p();
        }
        return -1;
    }

    @Override // tb.t9e
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

    @Override // tb.t9e
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
        kun kunVar = this.mRefreshController;
        if (kunVar != null) {
            kunVar.s(z);
        }
    }

    public boolean isScrollStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c167144", new Object[]{this})).booleanValue();
        }
        kun kunVar = this.mRefreshController;
        if (kunVar == null || !kunVar.t()) {
            return false;
        }
        return true;
    }

    @Override // tb.t9e
    public void keepBottom() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0ff3697", new Object[]{this});
            return;
        }
        T t = this.mHost;
        ((ListView) t).setSelection(((ListView) t).getCount());
    }

    @Override // tb.t9e
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
        kun kunVar = this.mRefreshController;
        if (kunVar != null) {
            kunVar.v();
        }
    }

    @Override // tb.t9e
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

    @Override // tb.t9e
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
        kun kunVar = this.mRefreshController;
        if (kunVar != null) {
            kunVar.D(i);
        }
    }

    public void setDownRefreshFinish(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a1833e3", new Object[]{this, new Boolean(z)});
        } else {
            this.mRefreshController.E(z);
        }
    }

    @Override // tb.t9e
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

    @Override // tb.t9e
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
        kun kunVar = this.mRefreshController;
        if (kunVar != null) {
            kunVar.G();
        }
    }

    public void setIsUpRefreshing() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("308b3cf5", new Object[]{this});
            return;
        }
        kun kunVar = this.mRefreshController;
        if (kunVar != null) {
            kunVar.H();
        }
    }

    public void setOnPullToRefreshListener(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c63f25ef", new Object[]{this, aVar});
            return;
        }
        kun kunVar = this.mRefreshController;
        if (kunVar != null) {
            kunVar.J(aVar);
        }
    }

    public void setPullDownRefreshTips(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9204f40e", new Object[]{this, strArr});
            return;
        }
        kun kunVar = this.mRefreshController;
        if (kunVar != null) {
            kunVar.F(strArr);
        }
    }

    public void setPullUpRefreshTips(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ef31d87", new Object[]{this, strArr});
            return;
        }
        kun kunVar = this.mRefreshController;
        if (kunVar != null) {
            kunVar.O(strArr);
        }
    }

    public void setPullUpToRefreshAuto(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("613d8940", new Object[]{this, new Boolean(z)});
            return;
        }
        this.mRefreshController.K(z);
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
        kun kunVar = this.mRefreshController;
        if (kunVar != null) {
            kunVar.L(i);
        }
    }

    public void setUpRefreshBackgroundColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ead3c845", new Object[]{this, new Integer(i)});
            return;
        }
        kun kunVar = this.mRefreshController;
        if (kunVar != null) {
            kunVar.M(i);
        }
    }

    public void setUpRefreshFinish(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bfa6ca1c", new Object[]{this, new Boolean(z)});
        } else {
            this.mRefreshController.N(z);
        }
    }

    @Override // tb.t9e
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
        this.mRefreshController.b();
        this.mRefreshController.c();
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
        kun kunVar = this.mRefreshController;
        if (kunVar != null) {
            if (z) {
                kunVar.k(true, i, view);
            } else {
                kunVar.k(false, 0, null);
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
            this.mRefreshController.i(true, i, view);
        } else {
            this.mRefreshController.i(false, 0, null);
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
            this.mRefreshController.j(true, R.string.uik_refresh_arrow, view, z2);
        } else {
            this.mRefreshController.i(false, 0, null);
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
