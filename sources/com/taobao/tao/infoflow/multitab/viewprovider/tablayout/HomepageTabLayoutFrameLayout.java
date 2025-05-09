package com.taobao.tao.infoflow.multitab.viewprovider.tablayout;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.home.component.view.HImageView;
import com.taobao.homepage.view.widgets.TailFadeFrameLayout;
import com.taobao.taobao.R;
import tb.phg;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class HomepageTabLayoutFrameLayout extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(729809493);
    }

    public HomepageTabLayoutFrameLayout(Context context) {
        this(context, null);
    }

    private int dpToPx(Context context, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9c0a4b01", new Object[]{this, context, new Float(f)})).intValue();
        }
        return (int) (f * context.getResources().getDisplayMetrics().density);
    }

    private void initView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f359fd6c", new Object[]{this, context});
            return;
        }
        phg.m("HomepageTabLayoutFrameLayout");
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(R.id.tab_layout_container);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, dpToPx(context, 38.0f)));
        HImageView hImageView = new HImageView(context);
        hImageView.setId(R.id.tab_bg_img);
        hImageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        hImageView.setScaleType(ImageView.ScaleType.FIT_XY);
        frameLayout.addView(hImageView);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setId(R.id.multi_container);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        linearLayout.setOrientation(0);
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setId(R.id.multi_sub_container);
        linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(0, -1, 1.0f));
        linearLayout2.setOrientation(0);
        TailFadeFrameLayout tailFadeFrameLayout = new TailFadeFrameLayout(context);
        tailFadeFrameLayout.setId(R.id.fade_container);
        tailFadeFrameLayout.setLayoutParams(new LinearLayout.LayoutParams(0, -1, 1.0f));
        MultiTabLayout multiTabLayout = new MultiTabLayout(context);
        multiTabLayout.setId(R.id.multi_tab);
        multiTabLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        multiTabLayout.setOverScrollMode(2);
        multiTabLayout.setPadding(0, 0, 0, dpToPx(context, 2.0f));
        multiTabLayout.setBackgroundColor(0);
        multiTabLayout.setTabGravity(1);
        multiTabLayout.setSelectedTabIndicatorHeight(0);
        multiTabLayout.setTabMode(0);
        multiTabLayout.setSelectedTabIndicatorHeight(0);
        tailFadeFrameLayout.addView(multiTabLayout);
        linearLayout2.addView(tailFadeFrameLayout);
        HImageView hImageView2 = new HImageView(context);
        hImageView2.setId(R.id.iv_right_top_icon);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(dpToPx(context, 70.0f), dpToPx(context, 29.0f));
        layoutParams.setMarginStart(dpToPx(context, 6.0f));
        layoutParams.setMarginEnd(dpToPx(context, 8.5f));
        layoutParams.bottomMargin = dpToPx(context, 6.0f);
        hImageView2.setLayoutParams(layoutParams);
        hImageView2.setVisibility(8);
        linearLayout2.addView(hImageView2);
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setId(R.id.more_tab_container);
        frameLayout2.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        frameLayout2.setVisibility(8);
        HImageView hImageView3 = new HImageView(context);
        hImageView3.setId(R.id.iv_more_tab);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(dpToPx(context, 18.0f), dpToPx(context, 18.0f));
        layoutParams2.setMarginStart(dpToPx(context, 6.0f));
        layoutParams2.setMarginEnd(dpToPx(context, 9.0f));
        layoutParams2.topMargin = dpToPx(context, 5.5f);
        hImageView3.setLayoutParams(layoutParams2);
        frameLayout2.addView(hImageView3);
        linearLayout2.addView(frameLayout2);
        linearLayout.addView(linearLayout2);
        frameLayout.addView(linearLayout);
        addView(frameLayout);
        phg.l("HomepageTabLayoutFrameLayout");
    }

    public static /* synthetic */ Object ipc$super(HomepageTabLayoutFrameLayout homepageTabLayoutFrameLayout, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/infoflow/multitab/viewprovider/tablayout/HomepageTabLayoutFrameLayout");
    }

    public HomepageTabLayoutFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public HomepageTabLayoutFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        initView(context);
    }

    public HomepageTabLayoutFrameLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        initView(context);
    }
}
