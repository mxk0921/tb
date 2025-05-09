package com.taobao.android.order.bundle.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.util.SystemBarDecorator;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TIconFontTextView;
import tb.pb6;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class TBOrderListSearchView extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int mHeight;

    static {
        t2o.a(713031984);
    }

    public TBOrderListSearchView(Context context) {
        super(context);
        initView(context);
    }

    public static /* synthetic */ Object ipc$super(TBOrderListSearchView tBOrderListSearchView, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/order/bundle/widget/TBOrderListSearchView");
    }

    public TBOrderListSearchView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        initView(context);
    }

    private void initView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f359fd6c", new Object[]{this, context});
            return;
        }
        int statusBarHeight = SystemBarDecorator.getStatusBarHeight(context);
        int c = pb6.c(context, 44.0f);
        this.mHeight = statusBarHeight + c;
        setLayoutParams(new FrameLayout.LayoutParams(-1, this.mHeight));
        setBackgroundColor(-1);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, c);
        layoutParams.topMargin = statusBarHeight;
        linearLayout.setLayoutParams(layoutParams);
        ImageView imageView = new ImageView(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(pb6.c(context, 24.0f), pb6.c(context, 24.0f));
        layoutParams2.leftMargin = pb6.c(context, 10.0f);
        layoutParams2.gravity = 16;
        imageView.setLayoutParams(layoutParams2);
        imageView.setImageResource(R.drawable.order_list_back_button);
        linearLayout.addView(imageView);
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setBackgroundColor(-788744);
        linearLayout2.setOrientation(0);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(0, pb6.c(context, 36.0f), 1.0f);
        layoutParams3.leftMargin = pb6.c(context, 9.0f);
        layoutParams3.gravity = 16;
        linearLayout2.setLayoutParams(layoutParams3);
        ImageView imageView2 = new ImageView(context);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(pb6.c(context, 14.0f), pb6.c(context, 14.0f));
        layoutParams4.gravity = 17;
        layoutParams4.leftMargin = pb6.c(context, 8.0f);
        imageView2.setLayoutParams(layoutParams4);
        imageView2.setImageResource(R.drawable.order_list_search_icon);
        linearLayout2.addView(imageView2);
        TextView textView = new TextView(context);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(0, pb6.c(context, 33.0f), 1.0f);
        layoutParams5.leftMargin = pb6.c(context, 5.0f);
        layoutParams5.gravity = 17;
        textView.setLayoutParams(layoutParams5);
        textView.setGravity(8388627);
        textView.setTextSize(0, pb6.c(context, 14.0f));
        textView.setTextColor(-8615780);
        textView.setText("搜索订单");
        linearLayout2.addView(textView);
        linearLayout.addView(linearLayout2);
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setOrientation(1);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(pb6.c(context, 24.0f), -2);
        layoutParams6.leftMargin = pb6.c(context, 11.0f);
        layoutParams6.topMargin = -pb6.c(context, 1.0f);
        layoutParams6.gravity = 8388627;
        linearLayout3.setLayoutParams(layoutParams6);
        ImageView imageView3 = new ImageView(context);
        int c2 = pb6.c(context, 24.0f);
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(c2, c2);
        layoutParams7.gravity = 17;
        imageView3.setLayoutParams(layoutParams7);
        imageView3.setImageResource(R.drawable.order_list_filter_icon);
        linearLayout3.addView(imageView3);
        TextView textView2 = new TextView(context);
        LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams8.gravity = 17;
        textView2.setLayoutParams(layoutParams8);
        textView2.setTextSize(0, pb6.c(context, 10.0f));
        textView2.setTextColor(-15656659);
        textView2.setText("筛选");
        linearLayout3.addView(textView2);
        linearLayout.addView(linearLayout3);
        FrameLayout frameLayout = new FrameLayout(context);
        FrameLayout.LayoutParams layoutParams9 = new FrameLayout.LayoutParams(pb6.c(context, 40.0f), pb6.c(context, 42.0f));
        int c3 = pb6.c(context, 3.0f);
        layoutParams9.leftMargin = c3;
        layoutParams9.rightMargin = c3;
        frameLayout.setLayoutParams(layoutParams9);
        TIconFontTextView tIconFontTextView = new TIconFontTextView(context);
        tIconFontTextView.setText("ꈝ");
        tIconFontTextView.setTextColor(context.getResources().getColor(R.color.uik_action_icon_normal));
        tIconFontTextView.setTextSize(0, context.getResources().getDimension(R.dimen.uik_action_icon_height));
        FrameLayout.LayoutParams layoutParams10 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams10.gravity = 17;
        tIconFontTextView.setLayoutParams(layoutParams10);
        frameLayout.addView(tIconFontTextView);
        linearLayout.addView(frameLayout);
        addView(linearLayout);
    }

    public TBOrderListSearchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        initView(context);
    }
}
