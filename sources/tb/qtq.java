package tb;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.uikit.extend.feature.view.TUrlImageView;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class qtq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(806355815);
    }

    public static void a(Context context, View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cd4b36", new Object[]{context, view, new Integer(i)});
        } else if (context != null && view != null && (view.getBackground() instanceof GradientDrawable)) {
            ((GradientDrawable) view.getBackground().mutate()).setColor(context.getResources().getColor(i));
        }
    }

    public static void b(Context context, View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa07c169", new Object[]{context, view, new Integer(i)});
        } else if (context != null && view != null && (view.getBackground() instanceof GradientDrawable)) {
            ((GradientDrawable) view.getBackground().mutate()).setCornerRadius(context.getResources().getDimensionPixelSize(i));
        }
    }

    public static void c(Context context, TUrlImageView tUrlImageView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84faaa1b", new Object[]{context, tUrlImageView, new Integer(i)});
        } else if (context != null && tUrlImageView != null) {
            d(context, tUrlImageView, context.getResources().getDimensionPixelSize(i));
        }
    }

    public static void d(Context context, TUrlImageView tUrlImageView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70d4683", new Object[]{context, tUrlImageView, new Integer(i)});
        } else if (context != null && tUrlImageView != null) {
            tUrlImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            tUrlImageView.getLayoutParams().height = i;
            tUrlImageView.getLayoutParams().width = i;
        }
    }
}
