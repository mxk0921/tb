package com.taobao.android.dinamicx.widget.recycler.refresh;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class RefreshHeadView extends LinearLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int TYPE_FOOTER = 2;
    public static final int TYPE_FOOTER_HORIZONTAL = 4;
    public static final int TYPE_HEADER = 1;
    public static final int TYPE_HEADER_HORIZONTAL = 3;
    private static Typeface sIconfont;
    private static int sReference = 0;
    private TextView mArrow;
    private CustomProgressBar mProgressbar;
    private TextView mRefreshState;

    static {
        t2o.a(444597581);
    }

    public RefreshHeadView(Context context, int i, View view, boolean z) {
        super(context);
        init(context, i, view, z);
    }

    public static /* synthetic */ Object ipc$super(RefreshHeadView refreshHeadView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 949399698) {
            super.onDetachedFromWindow();
            return null;
        } else if (hashCode == 1626033557) {
            super.onAttachedToWindow();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/dinamicx/widget/recycler/refresh/RefreshHeadView");
        }
    }

    public TextView getArrow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("9a90f7ce", new Object[]{this});
        }
        return this.mArrow;
    }

    public CustomProgressBar getProgressbar() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CustomProgressBar) ipChange.ipc$dispatch("78535a1f", new Object[]{this});
        }
        return this.mProgressbar;
    }

    public TextView getRefreshStateText() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("a5f470b4", new Object[]{this});
        }
        return this.mRefreshState;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        this.mArrow.setTypeface(null);
        int i = sReference - 1;
        sReference = i;
        if (i == 0) {
            sIconfont = null;
        }
        super.onDetachedFromWindow();
    }

    public void setProgressBarColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd7bb5dd", new Object[]{this, new Integer(i)});
            return;
        }
        CustomProgressBar customProgressBar = this.mProgressbar;
        if (customProgressBar != null) {
            customProgressBar.setPaintColor(i);
        }
    }

    public void setProgressBarInitState(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56b8f870", new Object[]{this, new Boolean(z)});
        } else {
            this.mProgressbar.isInitShow(z);
        }
    }

    public void setPullDownDistance(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6120ffe", new Object[]{this, new Integer(i)});
        } else {
            this.mProgressbar.setPullDownDistance(i);
        }
    }

    public void setRefreshViewColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2bd8ad7", new Object[]{this, new Integer(i)});
            return;
        }
        CustomProgressBar customProgressBar = this.mProgressbar;
        if (customProgressBar != null) {
            customProgressBar.setPaintColor(i);
        }
        TextView textView = this.mRefreshState;
        if (textView != null) {
            textView.setTextColor(i);
        }
        TextView textView2 = this.mArrow;
        if (textView2 != null) {
            textView2.setTextColor(i);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        if (sIconfont == null) {
            try {
                sIconfont = Typeface.createFromAsset(getContext().getAssets(), "uik_core_iconfont.ttf");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        this.mArrow.setTypeface(sIconfont);
        sReference++;
    }

    private void init(Context context, int i, View view, boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54e5ba54", new Object[]{this, context, new Integer(i), view, new Boolean(z)});
            return;
        }
        float f = getResources().getDisplayMetrics().density;
        setOrientation(1);
        setGravity(17);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 1;
        if (view != null && z) {
            addView(view, layoutParams);
        }
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setGravity(17);
        linearLayout.setOrientation(0);
        linearLayout.setId(R.id.uik_refresh_header_view);
        linearLayout.setPadding(0, (int) (32.0f * f), 0, (int) (24.0f * f));
        addView(linearLayout, new ViewGroup.LayoutParams(-1, -2));
        FrameLayout frameLayout = new FrameLayout(context);
        linearLayout.addView(frameLayout, new LinearLayout.LayoutParams(-2, -2));
        TextView textView = new TextView(context);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 17;
        frameLayout.addView(textView, layoutParams2);
        this.mArrow = textView;
        textView.setIncludeFontPadding(false);
        this.mArrow.setTextColor(-6710887);
        TextView textView2 = this.mArrow;
        if (i == 0) {
            str = "";
        } else {
            str = getContext().getResources().getString(i);
        }
        textView2.setText(str);
        CustomProgressBar customProgressBar = new CustomProgressBar(context);
        int i2 = (int) (28.0f * f);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(i2, i2);
        layoutParams3.gravity = 16;
        frameLayout.addView(customProgressBar, layoutParams3);
        this.mProgressbar = customProgressBar;
        TextView textView3 = new TextView(context);
        textView3.setText("下拉刷新");
        textView3.setTextSize(12.0f);
        textView3.setTextColor(-6710887);
        textView3.setMaxLines(3);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams4.leftMargin = (int) (f * 10.0f);
        linearLayout.addView(textView3, layoutParams4);
        this.mRefreshState = textView3;
        if (view != null && !z) {
            addView(view, layoutParams);
        }
    }
}
