package com.ali.user.mobile.ui.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class AUPinnedHeaderListView extends ListView {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int MAX_ALPHA = 255;
    private PinnedHeaderAdapter mAdapter;
    private View mHeaderView;
    private int mHeaderViewHeight;
    private boolean mHeaderViewVisible;
    private int mHeaderViewWidth;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface PinnedHeaderAdapter {
        public static final int PINNED_HEADER_GONE = 0;
        public static final int PINNED_HEADER_PUSHED_UP = 2;
        public static final int PINNED_HEADER_VISIBLE = 1;

        void configurePinnedHeader(View view, int i, int i2);

        int getPinnedHeaderState(int i);
    }

    static {
        t2o.a(70254877);
    }

    public AUPinnedHeaderListView(Context context) {
        super(context);
    }

    public static /* synthetic */ Object ipc$super(AUPinnedHeaderListView aUPinnedHeaderListView, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -429021187:
                super.setAdapter((ListAdapter) objArr[0]);
                return null;
            case -244855388:
                super.onLayout(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue());
                return null;
            case 623593120:
                super.dispatchDraw((Canvas) objArr[0]);
                return null;
            case 650865254:
                super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/ali/user/mobile/ui/widget/AUPinnedHeaderListView");
        }
    }

    public void configureHeaderView(int i) {
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55595c04", new Object[]{this, new Integer(i)});
        } else if (this.mHeaderView != null) {
            int pinnedHeaderState = this.mAdapter.getPinnedHeaderState(i);
            if (pinnedHeaderState != 0) {
                int i3 = 255;
                if (pinnedHeaderState == 1) {
                    this.mAdapter.configurePinnedHeader(this.mHeaderView, i, 255);
                    if (this.mHeaderView.getTop() != 0) {
                        this.mHeaderView.layout(0, 0, this.mHeaderViewWidth, this.mHeaderViewHeight);
                    }
                    this.mHeaderViewVisible = true;
                } else if (pinnedHeaderState == 2) {
                    int bottom = getChildAt(0).getBottom();
                    int height = this.mHeaderView.getHeight();
                    if (bottom < height) {
                        i2 = bottom - height;
                        i3 = ((height + i2) * 255) / height;
                    } else {
                        i2 = 0;
                    }
                    this.mAdapter.configurePinnedHeader(this.mHeaderView, i, i3);
                    if (this.mHeaderView.getTop() != i2) {
                        this.mHeaderView.layout(0, i2, this.mHeaderViewWidth, this.mHeaderViewHeight + i2);
                    }
                    this.mHeaderViewVisible = true;
                }
            } else {
                this.mHeaderViewVisible = false;
            }
        }
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("252b46a0", new Object[]{this, canvas});
            return;
        }
        super.dispatchDraw(canvas);
        if (this.mHeaderViewVisible) {
            drawChild(canvas, this.mHeaderView, getDrawingTime());
        }
    }

    @Override // android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
        View view = this.mHeaderView;
        if (view != null) {
            view.layout(0, 0, this.mHeaderViewWidth, this.mHeaderViewHeight);
            configureHeaderView(getFirstVisiblePosition());
        }
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        super.onMeasure(i, i2);
        View view = this.mHeaderView;
        if (view != null) {
            measureChild(view, i, i2);
            this.mHeaderViewWidth = this.mHeaderView.getMeasuredWidth();
            this.mHeaderViewHeight = this.mHeaderView.getMeasuredHeight();
        }
    }

    public void setPinnedHeaderView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c248a1f", new Object[]{this, view});
            return;
        }
        this.mHeaderView = view;
        if (view != null) {
            setFadingEdgeLength(0);
        }
        requestLayout();
    }

    public AUPinnedHeaderListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.ListView, android.widget.AbsListView
    public void setAdapter(ListAdapter listAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e66da7fd", new Object[]{this, listAdapter});
            return;
        }
        super.setAdapter(listAdapter);
        this.mAdapter = (PinnedHeaderAdapter) listAdapter;
    }

    public AUPinnedHeaderListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
