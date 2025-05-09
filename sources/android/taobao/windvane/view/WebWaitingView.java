package android.taobao.windvane.view;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.alipay.sdk.widget.JumpLoading;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.og8;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class WebWaitingView extends RelativeLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int LOADING_BG_ID = 101;
    private static final int LOADING_PGBAR_ID = 102;

    static {
        t2o.a(989856457);
    }

    public WebWaitingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context);
    }

    private void init(Context context) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
            return;
        }
        float f = context.getResources().getDisplayMetrics().density;
        float f2 = 20.0f * f;
        View view = new View(context);
        view.setId(101);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(f2);
        gradientDrawable.setColor(-12303292);
        gradientDrawable.setAlpha(150);
        view.setBackground(gradientDrawable);
        int i = (int) (f * 120.0f);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i, i);
        layoutParams.addRule(13);
        addView(view, layoutParams);
        ProgressBar progressBar = new ProgressBar(context);
        progressBar.setId(102);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(14);
        layoutParams2.addRule(6, 101);
        layoutParams2.topMargin = ((int) f2) + 10;
        addView(progressBar, layoutParams2);
        TextView textView = new TextView(context);
        if (og8.c()) {
            str = JumpLoading.LOADING;
        } else {
            str = "Loading";
        }
        textView.setText(str);
        textView.setTextColor(-1);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams3.addRule(14);
        layoutParams3.addRule(3, 102);
        addView(textView, layoutParams3);
    }

    public static /* synthetic */ Object ipc$super(WebWaitingView webWaitingView, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in android/taobao/windvane/view/WebWaitingView");
    }

    public WebWaitingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context);
    }

    public WebWaitingView(Context context) {
        super(context);
        init(context);
    }
}
