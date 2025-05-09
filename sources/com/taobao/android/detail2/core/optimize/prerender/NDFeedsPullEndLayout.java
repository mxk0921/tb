package com.taobao.android.detail2.core.optimize.prerender;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.ptr.PullBase;
import com.taobao.ptr.PullLayout;
import com.taobao.taobao.R;
import tb.ec7;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class NDFeedsPullEndLayout extends PullLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(352322205);
    }

    public NDFeedsPullEndLayout(Context context, PullBase.Mode mode, int i) {
        super(context, mode, i, null);
    }

    public static /* synthetic */ Object ipc$super(NDFeedsPullEndLayout nDFeedsPullEndLayout, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail2/core/optimize/prerender/NDFeedsPullEndLayout");
    }

    @Override // com.taobao.ptr.PullLayout
    public void onInit(Context context, PullBase.Mode mode, int i, AttributeSet attributeSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47e6ed4f", new Object[]{this, context, mode, new Integer(i), attributeSet});
            return;
        }
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout.setGravity(17);
        linearLayout.setOrientation(0);
        linearLayout.setPadding(0, ec7.a(context, 10.0f), 0, ec7.a(context, 10.0f));
        linearLayout.setId(R.id.new_detail_feeds_pull_end_ll);
        ImageView imageView = new ImageView(context);
        imageView.setId(R.id.new_detail_feeds_pull_end_icon);
        imageView.setLayoutParams(new LinearLayout.LayoutParams(ec7.a(context, 20.0f), ec7.a(context, 20.0f)));
        imageView.setPadding(ec7.a(context, 10.0f), 0, 0, 0);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setImageResource(R.drawable.detail_feeds_pull_end_icon);
        TextView textView = new TextView(context);
        textView.setId(R.id.new_detail_feeds_pull_end_text);
        textView.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        textView.setPadding(ec7.a(context, 6.0f), 0, ec7.a(context, 10.0f), 0);
        textView.setGravity(17);
        textView.setLineSpacing(0.0f, 1.0f);
        textView.setText("释放加载更多");
        textView.setTextColor(Color.parseColor("#3d4245"));
        textView.setTextSize(1, 12.0f);
        linearLayout.addView(imageView);
        linearLayout.addView(textView);
        addView(linearLayout);
    }
}
