package com.taobao.uikit.feature.features;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListView;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.uikit.feature.callback.CanvasCallback;
import com.taobao.uikit.feature.callback.LayoutCallback;
import com.taobao.uikit.feature.callback.MeasureCallback;
import com.taobao.uikit.feature.view.TListView;
import tb.t2o;
import tb.tkt;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class PageNumberFeature extends AbsFeature<ListView> implements AbsListView.OnScrollListener, MeasureCallback, LayoutCallback, CanvasCallback {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int PAGETIP_MARGIN_BOTTOM = 20;
    private static final int PAGETIP_MARGIN_RIGHT = 25;
    public static final int SHOW_ALWAYS = 100;
    public static final int SHOW_NONE = 102;
    public static final int SHOW_SCROLLING = 101;
    private int mCurrentPage;
    private int mLastVisibleItemIndex;
    private int mPageSize;
    private PageTip mPageTip;
    private int mScrollState = 0;
    private int mShowType = 101;
    private int mTotalCount;

    static {
        t2o.a(931135541);
    }

    public static /* synthetic */ int access$002(PageNumberFeature pageNumberFeature, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5c5b1c13", new Object[]{pageNumberFeature, new Integer(i)})).intValue();
        }
        pageNumberFeature.mCurrentPage = i;
        return i;
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        this.mPageTip = new PageTip(getHost().getContext());
        getHost().setOnScrollListener(this);
    }

    public static /* synthetic */ Object ipc$super(PageNumberFeature pageNumberFeature, String str, Object... objArr) {
        if (str.hashCode() == 1336372353) {
            super.setHost((PageNumberFeature) ((View) objArr[0]));
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/uikit/feature/features/PageNumberFeature");
    }

    private boolean showPageTip() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("edb182da", new Object[]{this})).booleanValue();
        }
        int i = this.mShowType;
        if (i == 101) {
            if (this.mScrollState != 0) {
                return true;
            }
            return false;
        } else if (i == 100) {
            return true;
        } else {
            return false;
        }
    }

    @Override // com.taobao.uikit.feature.callback.CanvasCallback
    public void afterDispatchDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84822824", new Object[]{this, canvas});
        } else if (showPageTip()) {
            ((TListView) getHost()).drawChild(canvas, this.mPageTip, getHost().getDrawingTime(), 0);
        }
    }

    @Override // com.taobao.uikit.feature.callback.CanvasCallback
    public void afterDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f42b97e", new Object[]{this, canvas});
        }
    }

    @Override // com.taobao.uikit.feature.callback.CanvasCallback
    public void afterOnDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99d9525f", new Object[]{this, canvas});
        }
    }

    @Override // com.taobao.uikit.feature.callback.LayoutCallback
    public void afterOnLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c4dfb28", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else {
            this.mPageTip.layout((getHost().getWidth() - this.mPageTip.getMeasuredWidth()) - this.mPageTip.mMarginRight, (getHost().getHeight() - this.mPageTip.getMeasuredHeight()) - this.mPageTip.mMarginBottom, getHost().getWidth() - this.mPageTip.mMarginRight, getHost().getHeight() - this.mPageTip.mMarginBottom);
        }
    }

    @Override // com.taobao.uikit.feature.callback.MeasureCallback
    public void afterOnMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9a728ea", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            ((TListView) getHost()).measureChild(this.mPageTip, i, i2, 0);
        }
    }

    @Override // com.taobao.uikit.feature.callback.CanvasCallback
    public void beforeDispatchDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8b3e1e1", new Object[]{this, canvas});
        }
    }

    @Override // com.taobao.uikit.feature.callback.CanvasCallback
    public void beforeDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6014803b", new Object[]{this, canvas});
        }
    }

    @Override // com.taobao.uikit.feature.callback.CanvasCallback
    public void beforeOnDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd545ddc", new Object[]{this, canvas});
        }
    }

    @Override // com.taobao.uikit.feature.callback.LayoutCallback
    public void beforeOnLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed76dbe5", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        }
    }

    @Override // com.taobao.uikit.feature.callback.MeasureCallback
    public void beforeOnMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("381b14e7", new Object[]{this, new Integer(i), new Integer(i2)});
        }
    }

    @Override // com.taobao.uikit.feature.features.AbsFeature
    public void constructor(Context context, AttributeSet attributeSet, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8928939c", new Object[]{this, context, attributeSet, new Integer(i)});
        }
    }

    public int getCurrentPage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9ddb71ec", new Object[]{this})).intValue();
        }
        return this.mCurrentPage;
    }

    public int getPageSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2822d620", new Object[]{this})).intValue();
        }
        return this.mPageSize;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2eb0734b", new Object[]{this, absListView, new Integer(i), new Integer(i2), new Integer(i3)});
        } else if (this.mLastVisibleItemIndex != getHost().getLastVisiblePosition()) {
            int lastVisiblePosition = getHost().getLastVisiblePosition();
            this.mLastVisibleItemIndex = lastVisiblePosition;
            this.mPageTip.updatePageIndex(lastVisiblePosition - getHost().getHeaderViewsCount(), this.mPageSize, this.mTotalCount, i);
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(AbsListView absListView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("532cfb08", new Object[]{this, absListView, new Integer(i)});
        } else {
            this.mScrollState = i;
        }
    }

    public void setPageSize(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f0ec8ea", new Object[]{this, new Integer(i)});
        } else {
            this.mPageSize = i;
        }
    }

    public void setShowType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("461bd8a3", new Object[]{this, new Integer(i)});
        } else {
            this.mShowType = i;
        }
    }

    public void setTotalCount(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6425d4f", new Object[]{this, new Integer(i)});
        } else {
            this.mTotalCount = i;
        }
    }

    public void setHost(ListView listView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f215e22", new Object[]{this, listView});
            return;
        }
        super.setHost((PageNumberFeature) listView);
        init();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class PageTip extends TextView {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public int mMarginBottom;
        public int mMarginRight;

        static {
            t2o.a(931135542);
        }

        public PageTip(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            init();
        }

        private void init() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fede197", new Object[]{this});
                return;
            }
            int i = (int) (getContext().getResources().getDisplayMetrics().density * 5.0f);
            setPadding(i, 0, i, 0);
            setTextSize(17.0f);
            setBackgroundColor(tkt.DEFAULT_SHADOW_COLOR);
            setGravity(17);
            setText("0/0");
            setTextColor(-1);
            setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            new DisplayMetrics();
            float f = getContext().getResources().getDisplayMetrics().density;
            this.mMarginRight = (int) (25.0f * f);
            this.mMarginBottom = (int) (f * 20.0f);
        }

        public static /* synthetic */ Object ipc$super(PageTip pageTip, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/uikit/feature/features/PageNumberFeature$PageTip");
        }

        public void updatePageIndex(int i, int i2, int i3, int i4) {
            int i5;
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ee618881", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            } else if (i2 != 0) {
                if (i4 == 0) {
                    i5 = 1;
                } else {
                    i5 = (i / i2) + 1;
                }
                int i6 = ((i3 + i2) - 1) / i2;
                if (i5 > i6) {
                    i5 = i6;
                }
                if (i3 > 0) {
                    str = i5 + "/" + i6;
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append(i5);
                    str = sb.toString();
                }
                PageNumberFeature.access$002(PageNumberFeature.this, i5);
                if (!TextUtils.equals(getText(), str)) {
                    setText(str);
                    measure(0, 0);
                    layout(getRight() - getMeasuredWidth(), getBottom() - getMeasuredHeight(), getRight(), getBottom());
                }
            }
        }

        public PageTip(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            init();
        }

        public PageTip(Context context) {
            super(context);
            init();
        }
    }
}
