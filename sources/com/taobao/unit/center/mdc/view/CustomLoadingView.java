package com.taobao.unit.center.mdc.view;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.notification.util.DensityUtil;
import com.taobao.taobao.R;
import com.taobao.uikit.feature.features.internal.pullrefresh.CustomProgressBar;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class CustomLoadingView extends LinearLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private CustomProgressBar progressBar;

    static {
        t2o.a(529531131);
    }

    public CustomLoadingView(Context context) {
        super(context);
        init(context);
    }

    private void init(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
            return;
        }
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        setGravity(17);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        linearLayout.setGravity(17);
        this.progressBar = new CustomProgressBar(context);
        this.progressBar.setLayoutParams(new LinearLayout.LayoutParams(DensityUtil.dip2px(context, 21.0f), DensityUtil.dip2px(context, 21.0f)));
        TextView textView = new TextView(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, DensityUtil.dip2px(context, 21.0f));
        layoutParams.setMargins(DensityUtil.dip2px(context, 9.0f), 0, 0, 0);
        textView.setLayoutParams(layoutParams);
        textView.setGravity(17);
        textView.setTextSize(1, 12.0f);
        textView.setTextColor(Color.parseColor("#999999"));
        textView.setText(context.getString(R.string.mp_loading_2));
        linearLayout.addView(this.progressBar);
        linearLayout.addView(textView);
        addView(linearLayout);
    }

    public static /* synthetic */ Object ipc$super(CustomLoadingView customLoadingView, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/unit/center/mdc/view/CustomLoadingView");
    }

    public CustomProgressBar getProgressBar() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CustomProgressBar) ipChange.ipc$dispatch("b470574b", new Object[]{this});
        }
        return this.progressBar;
    }

    public CustomLoadingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context);
    }

    public CustomLoadingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context);
    }
}
