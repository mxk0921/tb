package tb;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.alibaba.wireless.security.SecExceptionCode;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.schedule.ViewProxy;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class r9r {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static float f27213a = -1.0f;

    static {
        t2o.a(708837569);
    }

    public static View a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("96d86366", new Object[]{context});
        }
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, l(context, 116)));
        View b = b(context, 480, 30, 74, 16);
        b.setBackground(n(-526345, l(context, 8)));
        View b2 = b(context, 260, 26, 74, 62);
        b2.setBackground(n(-526345, l(context, 8)));
        frameLayout.addView(b);
        frameLayout.addView(b2);
        return frameLayout;
    }

    public static View b(Context context, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("fe3ea7f1", new Object[]{context, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        }
        View view = new View(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(l(context, i), l(context, i2));
        layoutParams.setMargins(l(context, i3), l(context, i4), 0, 0);
        view.setLayoutParams(layoutParams);
        return view;
    }

    public static View c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("ec160d2", new Object[]{context});
        }
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, l(context, 80)));
        View b = b(context, 36, 36, 32, 22);
        b.setBackground(n(-526345, l(context, 18)));
        frameLayout.addView(b);
        View b2 = b(context, 36, 36, 682, 22);
        b2.setBackground(n(-526345, l(context, 18)));
        frameLayout.addView(b2);
        View b3 = b(context, 128, 30, 84, 25);
        b3.setBackground(n(-526345, l(context, 8)));
        frameLayout.addView(b3);
        return frameLayout;
    }

    public static View d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("214510e2", new Object[]{context});
        }
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, l(context, 80)));
        View b = b(context, 36, 36, 32, 22);
        b.setBackground(n(-526345, l(context, 18)));
        frameLayout.addView(b);
        View b2 = b(context, 128, 30, 590, 25);
        b2.setBackground(n(-526345, l(context, 8)));
        frameLayout.addView(b2);
        View b3 = b(context, 128, 30, 84, 25);
        b3.setBackground(n(-526345, l(context, 8)));
        frameLayout.addView(b3);
        View view = new View(context);
        view.setLayoutParams(new FrameLayout.LayoutParams(-1, l(context, 1)));
        view.setBackgroundColor(-1644826);
        frameLayout.addView(view);
        return frameLayout;
    }

    public static View e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("3259dd1a", new Object[]{context});
        }
        FrameLayout frameLayout = new FrameLayout(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, l(context, 90));
        layoutParams.addRule(12);
        layoutParams.setMargins(0, 0, 0, l(context, 15));
        frameLayout.setLayoutParams(layoutParams);
        View b = b(context, 686, 80, 32, 5);
        b.setBackground(n(16736768, l(context, 12)));
        frameLayout.addView(b);
        return frameLayout;
    }

    public static View f(Context context, View.OnClickListener onClickListener, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("6990843d", new Object[]{context, onClickListener, new Boolean(z)});
        }
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, l(context, 90)));
        View b = b(context, 50, 50, 680, 18);
        frameLayout.addView(b);
        ViewProxy.setOnClickListener(b, onClickListener);
        if (z) {
            View b2 = b(context, 25, 25, 693, 30);
            b2.setBackgroundResource(R.drawable.icon_purchase_close);
            frameLayout.addView(b2);
        }
        return frameLayout;
    }

    public static View g(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("4297d72f", new Object[]{context});
        }
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, l(context, 204)));
        View b = b(context, 156, 156, 32, 24);
        b.setBackground(n(-526345, l(context, 12)));
        frameLayout.addView(b);
        View b2 = b(context, 360, 30, 212, 24);
        b2.setBackground(n(-526345, l(context, 8)));
        frameLayout.addView(b2);
        View b3 = b(context, 210, 26, 212, 72);
        b3.setBackground(n(-526345, l(context, 8)));
        frameLayout.addView(b3);
        View b4 = b(context, 210, 26, 212, 116);
        b4.setBackground(n(-526345, l(context, 8)));
        frameLayout.addView(b4);
        View b5 = b(context, 96, 30, 622, 24);
        b5.setBackground(n(-526345, l(context, 8)));
        frameLayout.addView(b5);
        View b6 = b(context, 175, 52, 543, 128);
        b6.setBackground(n(-526345, l(context, 8)));
        frameLayout.addView(b6);
        ImageView imageView = new ImageView(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(l(context, 18), l(context, 18));
        layoutParams.setMargins(l(context, 561), l(context, ra.INSTALL_PROVIDER), 0, 0);
        imageView.setLayoutParams(layoutParams);
        imageView.setImageResource(R.drawable.quantity_minus);
        frameLayout.addView(imageView);
        ImageView imageView2 = new ImageView(context);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(l(context, 18), l(context, 18));
        layoutParams2.setMargins(l(context, 685), l(context, ra.INSTALL_PROVIDER), 0, 0);
        imageView2.setLayoutParams(layoutParams2);
        imageView2.setImageResource(R.drawable.quantity_add);
        frameLayout.addView(imageView2);
        View view = new View(context);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(l(context, 2), l(context, 26));
        layoutParams3.setMargins(l(context, 594), l(context, SecExceptionCode.SEC_ERROR_INIT_PLUGIN_MERGED_MIDDLE_TIER_ERROR), 0, 0);
        view.setLayoutParams(layoutParams3);
        view.setBackgroundColor(-2697514);
        frameLayout.addView(view);
        View view2 = new View(context);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(l(context, 2), l(context, 26));
        layoutParams4.setMargins(l(context, 668), l(context, SecExceptionCode.SEC_ERROR_INIT_PLUGIN_MERGED_MIDDLE_TIER_ERROR), 0, 0);
        view2.setLayoutParams(layoutParams4);
        view2.setBackgroundColor(-2697514);
        frameLayout.addView(view2);
        return frameLayout;
    }

    public static View h(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("3707f393", new Object[]{context});
        }
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, l(context, 180)));
        View b = b(context, 156, 156, 32, 12);
        b.setBackground(n(-526345, l(context, 12)));
        frameLayout.addView(b);
        View b2 = b(context, 417, 30, 212, 12);
        b2.setBackground(n(-526345, l(context, 8)));
        frameLayout.addView(b2);
        View b3 = b(context, 210, 26, 212, 60);
        b3.setBackground(n(-526345, l(context, 8)));
        frameLayout.addView(b3);
        View b4 = b(context, 210, 26, 212, SecExceptionCode.SEC_ERROR_INIT_PLUGIN_MERGED_MIDDLE_TIER_ERROR);
        b4.setBackground(n(-526345, l(context, 8)));
        frameLayout.addView(b4);
        View b5 = b(context, 36, 36, 682, 72);
        b5.setBackground(n(-526345, l(context, 18)));
        frameLayout.addView(b5);
        return frameLayout;
    }

    public static View i(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("2138b5a6", new Object[]{context});
        }
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, l(context, 80)));
        View b = b(context, 156, 26, 32, 27);
        b.setBackground(n(-526345, l(context, 8)));
        frameLayout.addView(b);
        View b2 = b(context, 175, 26, 543, 27);
        b2.setBackground(n(-526345, l(context, 8)));
        frameLayout.addView(b2);
        return frameLayout;
    }

    public static View j(Context context, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("195bfea6", new Object[]{context, new Integer(i), new Integer(i2)});
        }
        RelativeLayout relativeLayout = new RelativeLayout(context);
        relativeLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, l(context, i)));
        relativeLayout.setBackground(n(i2, 0));
        relativeLayout.setGravity(17);
        View view = new View(context);
        view.setLayoutParams(new RelativeLayout.LayoutParams(l(context, 634), l(context, 1)));
        view.setBackgroundColor(-1644826);
        relativeLayout.addView(view);
        return relativeLayout;
    }

    public static View k(Context context, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("705902ca", new Object[]{context, new Integer(i), new Integer(i2)});
        }
        View view = new View(context);
        view.setLayoutParams(new LinearLayout.LayoutParams(-1, l(context, i)));
        view.setBackground(n(i2, 0));
        return view;
    }

    public static int l(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("55c29d7e", new Object[]{context, new Integer(i)})).intValue();
        }
        if (f27213a < 0.0f) {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            f27213a = Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels) / 750.0f;
        }
        return (int) (i * f27213a);
    }

    public static Drawable n(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("83d5a99f", new Object[]{new Integer(i), new Integer(i2)});
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(i2);
        gradientDrawable.setColor(i);
        return gradientDrawable;
    }

    public static View o(Context context, View.OnClickListener onClickListener, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("16838c97", new Object[]{context, onClickListener, new Boolean(z)});
        }
        RelativeLayout relativeLayout = new RelativeLayout(context);
        relativeLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        relativeLayout.setBackgroundResource(R.color.white);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        linearLayout.setOrientation(1);
        relativeLayout.addView(linearLayout);
        if (onClickListener != null) {
            linearLayout.addView(f(context, onClickListener, z));
        }
        linearLayout.addView(a(context));
        linearLayout.addView(k(context, 16, -526345));
        linearLayout.addView(g(context));
        linearLayout.addView(i(context));
        linearLayout.addView(i(context));
        linearLayout.addView(k(context, 12, -1));
        linearLayout.addView(k(context, 16, -526345));
        linearLayout.addView(k(context, 12, -1));
        linearLayout.addView(i(context));
        linearLayout.addView(h(context));
        linearLayout.addView(k(context, 12, -1));
        linearLayout.addView(k(context, 16, -526345));
        linearLayout.addView(k(context, 12, -1));
        linearLayout.addView(c(context));
        linearLayout.addView(j(context, 16, -1));
        linearLayout.addView(c(context));
        linearLayout.addView(j(context, 16, -1));
        linearLayout.addView(c(context));
        linearLayout.addView(d(context));
        relativeLayout.addView(e(context));
        return relativeLayout;
    }

    public static boolean m(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c9243d24", new Object[]{activity})).booleanValue();
        }
        return "true".equals(y8r.g("enableNewSkeletonStyle", "false")) || ("carts".equals(lql.d(hh.h(activity))) && "styleV2".equals(ko0.d("style")));
    }
}
