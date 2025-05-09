package com.taobao.infoflow.core.subservice.base.item.dxservice.impl.dinamic3.view;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.fve;
import tb.t2o;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class HIconScrollerIndicator extends LinearLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "HIconScrollerIndicator";
    private final IndicatorView mFirstIndicatorView;
    private final View mIntervalView;
    private float mRadius = 0.0f;
    private int mScrollBarThumbColor;
    private final IndicatorView mSecondIndicatorView;

    static {
        t2o.a(486539403);
    }

    public HIconScrollerIndicator(Context context) {
        super(context);
        setOrientation(0);
        IndicatorView indicatorView = new IndicatorView(context);
        this.mFirstIndicatorView = indicatorView;
        addView(indicatorView);
        View view = new View(context);
        this.mIntervalView = view;
        addView(view);
        IndicatorView indicatorView2 = new IndicatorView(context);
        this.mSecondIndicatorView = indicatorView2;
        addView(indicatorView2);
    }

    public static /* synthetic */ Object ipc$super(HIconScrollerIndicator hIconScrollerIndicator, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/core/subservice/base/item/dxservice/impl/dinamic3/view/HIconScrollerIndicator");
    }

    private void refreshFirstIndicator(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("caeb4cc1", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        IndicatorView indicatorView = this.mFirstIndicatorView;
        if (indicatorView == null) {
            fve.e(TAG, "mFirstIndicatorView == null");
            return;
        }
        indicatorView.setRadius(this.mRadius);
        this.mFirstIndicatorView.setScrollBarThumbColor(this.mScrollBarThumbColor);
        this.mFirstIndicatorView.refreshScrollIndicator(i, i2, i3, i4);
    }

    private void refreshIndicator(double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8790e3a3", new Object[]{this, new Double(d)});
        } else if (this.mFirstIndicatorView == null || this.mSecondIndicatorView == null) {
            fve.e(TAG, " mFirstIndicatorView:" + this.mFirstIndicatorView + " mSecondIndicatorView:" + this.mSecondIndicatorView);
        } else {
            double max = Math.max(Math.min(d, 1.0d), (double) vu3.b.GEO_NOT_SUPPORT);
            int width = this.mFirstIndicatorView.getWidth();
            refreshFirstIndicator((int) (width * max), width, width, getHeight());
            int width2 = this.mSecondIndicatorView.getWidth();
            refreshSecondIndicator(0, (int) (width2 * max), width2, getHeight());
        }
    }

    private void refreshSecondIndicator(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d21b8167", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        IndicatorView indicatorView = this.mSecondIndicatorView;
        if (indicatorView == null) {
            fve.e(TAG, "mSecondIndicatorView == null");
            return;
        }
        indicatorView.setRadius(this.mRadius);
        this.mSecondIndicatorView.setScrollBarThumbColor(this.mScrollBarThumbColor);
        this.mSecondIndicatorView.refreshScrollIndicator(i, i2, i3, i4);
    }

    public void refreshScrollIndicator(double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92b63390", new Object[]{this, new Double(d)});
            return;
        }
        try {
            refreshIndicator(d);
        } catch (Exception e) {
            fve.e(TAG, "refreshScrollIndicator exception:" + e);
        }
    }

    public void setRadius(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c80fcd05", new Object[]{this, new Float(f)});
        } else {
            this.mRadius = f;
        }
    }

    public void setScrollBarThumbColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97b627eb", new Object[]{this, new Integer(i)});
        } else {
            this.mScrollBarThumbColor = i;
        }
    }

    public void initIndicatorView(int i, int i2) {
        IndicatorView indicatorView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4fe3064b", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (this.mIntervalView == null || (indicatorView = this.mFirstIndicatorView) == null || this.mSecondIndicatorView == null) {
            fve.e(TAG, "mIntervalView:" + this.mIntervalView + " mFirstIndicatorView:" + this.mFirstIndicatorView + " mSecondIndicatorView:" + this.mSecondIndicatorView);
        } else {
            double d = i;
            int i3 = (int) (0.3d * d);
            indicatorView.setLayoutParams(new LinearLayout.LayoutParams(i3, i2));
            this.mIntervalView.setLayoutParams(new LinearLayout.LayoutParams((int) (0.1d * d), i2));
            int i4 = (int) (d * 0.6d);
            this.mSecondIndicatorView.setLayoutParams(new LinearLayout.LayoutParams(i4, i2));
            refreshFirstIndicator(0, i3, i3, getHeight());
            refreshSecondIndicator(0, 0, i4, getHeight());
        }
    }
}
