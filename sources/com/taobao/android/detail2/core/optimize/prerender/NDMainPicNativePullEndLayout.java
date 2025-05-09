package com.taobao.android.detail2.core.optimize.prerender;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.ptr.PullBase;
import com.taobao.ptr.PullLayout;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TIconFontTextView;
import tb.ec7;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class NDMainPicNativePullEndLayout extends PullLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(352322206);
    }

    public NDMainPicNativePullEndLayout(Context context, PullBase.Mode mode, int i) {
        super(context, mode, i, null);
    }

    public static /* synthetic */ Object ipc$super(NDMainPicNativePullEndLayout nDMainPicNativePullEndLayout, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail2/core/optimize/prerender/NDMainPicNativePullEndLayout");
    }

    @Override // com.taobao.ptr.PullLayout
    public void onInit(Context context, PullBase.Mode mode, int i, AttributeSet attributeSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47e6ed4f", new Object[]{this, context, mode, new Integer(i), attributeSet});
            return;
        }
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setId(R.id.image_content_feeds_pull_end_ll);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        linearLayout.setGravity(17);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(ec7.a(context, 10.0f), 0, ec7.a(context, 10.0f), 0);
        TIconFontTextView tIconFontTextView = new TIconFontTextView(context);
        tIconFontTextView.setId(R.id.image_content_feeds_pull_end_icon);
        tIconFontTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        tIconFontTextView.setAlpha(0.7f);
        tIconFontTextView.setText("뙺");
        tIconFontTextView.setTextSize(1, 20.0f);
        tIconFontTextView.setTextColor(Color.parseColor("#afffffff"));
        TextView textView = new TextView(context);
        textView.setId(R.id.image_content_feeds_pull_end_text);
        textView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        textView.setGravity(17);
        textView.setLineSpacing(0.0f, 1.0f);
        textView.setTextColor(Color.parseColor("#afffffff"));
        textView.setTextSize(1, 16.0f);
        linearLayout.addView(tIconFontTextView);
        linearLayout.addView(textView);
        addView(linearLayout);
    }
}
