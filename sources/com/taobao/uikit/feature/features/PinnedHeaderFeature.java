package com.taobao.uikit.feature.features;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AbsListView;
import android.widget.ListView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.uikit.feature.callback.CanvasCallback;
import com.taobao.uikit.feature.callback.FocusCallback;
import com.taobao.uikit.feature.callback.InterceptTouchEventCallback;
import com.taobao.uikit.feature.callback.LayoutCallback;
import com.taobao.uikit.feature.callback.MeasureCallback;
import com.taobao.uikit.feature.view.ViewGroupHelper;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class PinnedHeaderFeature extends AbsFeature<ListView> implements MeasureCallback, InterceptTouchEventCallback, LayoutCallback, CanvasCallback, FocusCallback, AbsListView.OnScrollListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int MAX_ALPHA = 255;
    private static final String TAG = "PinnedHeaderFeature";
    private SectionAdapter mAdapter;
    private View mHeaderView;
    private int mHeaderViewHeight;
    private int mHeaderViewWidth;
    private int mHeightMeasureSpec;
    private PinnedHeaderAdapterInternal mInternalAdapter;
    private int mWidthMeasureSpec;
    private boolean mHeaderViewVisible = false;
    private boolean mLastHeaderDown = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface PinnedHeaderAdapterInternal {
        public static final int PINNED_HEADER_GONE = 0;
        public static final int PINNED_HEADER_PUSHED_UP = 2;
        public static final int PINNED_HEADER_VISIBLE = 1;

        void configurePinnedHeader(View view, int i, int i2);

        int getPinnedHeaderState(int i);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface SectionAdapter {
        void bindSection(View view, int i);

        int firstSection();

        int getSection(int i);
    }

    static {
        t2o.a(931135547);
    }

    public static /* synthetic */ SectionAdapter access$000(PinnedHeaderFeature pinnedHeaderFeature) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SectionAdapter) ipChange.ipc$dispatch("5f89f41d", new Object[]{pinnedHeaderFeature});
        }
        return pinnedHeaderFeature.mAdapter;
    }

    private void configureHeaderView(int i) {
        int i2;
        View childAt;
        int i3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55595c04", new Object[]{this, new Integer(i)});
            return;
        }
        if (i - 1 >= 0) {
            i2 = i - getHost().getHeaderViewsCount();
        } else {
            i2 = 0;
        }
        if (this.mHeaderView != null) {
            int pinnedHeaderState = this.mInternalAdapter.getPinnedHeaderState(i2);
            if (pinnedHeaderState != 0) {
                int i4 = 255;
                if (pinnedHeaderState == 1) {
                    this.mInternalAdapter.configurePinnedHeader(this.mHeaderView, i2, 255);
                    measureHeadView();
                    if (this.mHeaderView.getTop() != 0) {
                        this.mHeaderView.layout(0, 0, this.mHeaderViewWidth, this.mHeaderViewHeight);
                    }
                    this.mHeaderViewVisible = true;
                } else if (pinnedHeaderState == 2 && (childAt = getHost().getChildAt(0)) != null) {
                    int bottom = childAt.getBottom();
                    int height = this.mHeaderView.getHeight();
                    if (bottom >= height || height <= 0) {
                        i3 = 0;
                    } else {
                        i3 = bottom - height;
                        i4 = ((height + i3) * 255) / height;
                    }
                    this.mInternalAdapter.configurePinnedHeader(this.mHeaderView, i2, i4);
                    measureHeadView();
                    if (this.mHeaderView.getTop() != i3) {
                        this.mHeaderView.layout(0, i3, this.mHeaderViewWidth, this.mHeaderViewHeight + i3);
                    }
                    this.mHeaderViewVisible = true;
                }
            } else {
                this.mHeaderViewVisible = false;
            }
        }
    }

    public static /* synthetic */ Object ipc$super(PinnedHeaderFeature pinnedHeaderFeature, String str, Object... objArr) {
        if (str.hashCode() == 1336372353) {
            super.setHost((PinnedHeaderFeature) ((View) objArr[0]));
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/uikit/feature/features/PinnedHeaderFeature");
    }

    private void measureHeadView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("718a132a", new Object[]{this});
        } else if (this.mHeaderView != null) {
            if (getHost() instanceof ViewGroupHelper) {
                ((ViewGroupHelper) getHost()).measureChild(this.mHeaderView, this.mWidthMeasureSpec, this.mHeightMeasureSpec, 0);
            }
            this.mHeaderViewWidth = this.mHeaderView.getMeasuredWidth();
            this.mHeaderViewHeight = this.mHeaderView.getMeasuredHeight();
        }
    }

    @Override // com.taobao.uikit.feature.callback.CanvasCallback
    public void afterDispatchDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84822824", new Object[]{this, canvas});
        } else if (this.mHeaderViewVisible && (getHost() instanceof ViewGroupHelper)) {
            ((ViewGroupHelper) getHost()).drawChild(canvas, this.mHeaderView, getHost().getDrawingTime(), 0);
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

    @Override // com.taobao.uikit.feature.callback.FocusCallback
    public void afterOnFocusChanged(boolean z, int i, Rect rect) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9ca48c", new Object[]{this, new Boolean(z), new Integer(i), rect});
        }
    }

    @Override // com.taobao.uikit.feature.callback.LayoutCallback
    public void afterOnLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c4dfb28", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        View view = this.mHeaderView;
        if (view != null) {
            view.layout(0, 0, this.mHeaderViewWidth, this.mHeaderViewHeight);
            configureHeaderView(getHost().getFirstVisiblePosition());
        }
    }

    @Override // com.taobao.uikit.feature.callback.MeasureCallback
    public void afterOnMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9a728ea", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (this.mHeaderView != null) {
            if (getHost() instanceof ViewGroupHelper) {
                ((ViewGroupHelper) getHost()).measureChild(this.mHeaderView, i, i2, 0);
            }
            this.mWidthMeasureSpec = i;
            this.mHeightMeasureSpec = i2;
            this.mHeaderViewWidth = this.mHeaderView.getMeasuredWidth();
            this.mHeaderViewHeight = this.mHeaderView.getMeasuredHeight();
        }
    }

    @Override // com.taobao.uikit.feature.callback.FocusCallback
    public void afterOnWindowFocusChanged(boolean z) {
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47bbdc86", new Object[]{this, new Boolean(z)});
        } else if (!z && (view = this.mHeaderView) != null) {
            view.dispatchWindowFocusChanged(false);
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

    @Override // com.taobao.uikit.feature.callback.FocusCallback
    public void beforeOnFocusChanged(boolean z, int i, Rect rect) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c46e309", new Object[]{this, new Boolean(z), new Integer(i), rect});
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

    @Override // com.taobao.uikit.feature.callback.FocusCallback
    public void beforeOnWindowFocusChanged(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("688ab043", new Object[]{this, new Boolean(z)});
        }
    }

    @Override // com.taobao.uikit.feature.features.AbsFeature
    public void constructor(Context context, AttributeSet attributeSet, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8928939c", new Object[]{this, context, attributeSet, new Integer(i)});
        }
    }

    @Override // com.taobao.uikit.feature.callback.InterceptTouchEventCallback
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        if (this.mHeaderViewVisible) {
            Rect rect = new Rect(0, 0, this.mHeaderViewWidth, this.mHeaderView.getBottom());
            boolean contains = rect.contains((int) motionEvent.getX(), (int) motionEvent.getY());
            if (contains) {
                z = this.mHeaderView.dispatchTouchEvent(motionEvent);
                getHost().invalidate(rect);
            } else if (this.mLastHeaderDown) {
                this.mHeaderView.dispatchWindowFocusChanged(false);
                this.mHeaderView.setPressed(false);
                getHost().invalidate(rect);
                this.mLastHeaderDown = false;
            }
            if (motionEvent.getAction() == 0) {
                this.mLastHeaderDown = contains;
            }
        }
        return z;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2eb0734b", new Object[]{this, absListView, new Integer(i), new Integer(i2), new Integer(i3)});
        } else if (this.mHeaderView != null) {
            configureHeaderView(i);
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(AbsListView absListView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("532cfb08", new Object[]{this, absListView, new Integer(i)});
        }
    }

    public void setPinnedHeaderView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c248a1f", new Object[]{this, view});
            return;
        }
        this.mHeaderView = view;
        if (view != null && getHost() != null) {
            getHost().setFadingEdgeLength(0);
        }
    }

    public void setSectionAdapter(SectionAdapter sectionAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff8f8b8c", new Object[]{this, sectionAdapter});
            return;
        }
        this.mAdapter = sectionAdapter;
        if (sectionAdapter != null) {
            this.mInternalAdapter = new PinnedHeaderAdapterInternal() { // from class: com.taobao.uikit.feature.features.PinnedHeaderFeature.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.uikit.feature.features.PinnedHeaderFeature.PinnedHeaderAdapterInternal
                public void configurePinnedHeader(View view, int i, int i2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("4b734660", new Object[]{this, view, new Integer(i), new Integer(i2)});
                    } else {
                        PinnedHeaderFeature.access$000(PinnedHeaderFeature.this).bindSection(view, PinnedHeaderFeature.access$000(PinnedHeaderFeature.this).getSection(i));
                    }
                }

                @Override // com.taobao.uikit.feature.features.PinnedHeaderFeature.PinnedHeaderAdapterInternal
                public int getPinnedHeaderState(int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Number) ipChange2.ipc$dispatch("c7debeb9", new Object[]{this, new Integer(i)})).intValue();
                    }
                    if (i < 0 || i >= PinnedHeaderFeature.this.getHost().getCount() || PinnedHeaderFeature.access$000(PinnedHeaderFeature.this).firstSection() > i) {
                        return 0;
                    }
                    int i2 = i + 1;
                    if (PinnedHeaderFeature.access$000(PinnedHeaderFeature.this).getSection(i2) != i2 || PinnedHeaderFeature.access$000(PinnedHeaderFeature.this).firstSection() == i2) {
                        return 1;
                    }
                    return 2;
                }
            };
        }
    }

    public void setHost(ListView listView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f215e22", new Object[]{this, listView});
            return;
        }
        super.setHost((PinnedHeaderFeature) listView);
        getHost().setFadingEdgeLength(0);
        getHost().setOnScrollListener(this);
    }
}
