package tb;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.widget.TextView;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.taobao.subservice.biz.overlayservice.impl.common.view.RadiusFrameLayout;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class tqa {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f28882a;
    public final n8 b;

    static {
        t2o.a(491782454);
    }

    public tqa(Context context, n8 n8Var) {
        this.f28882a = context;
        this.b = n8Var;
    }

    public final RadiusFrameLayout a(n8 n8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RadiusFrameLayout) ipChange.ipc$dispatch("97f09cac", new Object[]{this, n8Var});
        }
        RadiusFrameLayout radiusFrameLayout = new RadiusFrameLayout(this.f28882a);
        j(radiusFrameLayout, n8Var);
        f(radiusFrameLayout, n8Var);
        i(radiusFrameLayout, n8Var);
        radiusFrameLayout.addView(b(this.b));
        return radiusFrameLayout;
    }

    public final TextView b(n8 n8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("f7e7e9bd", new Object[]{this, n8Var});
        }
        TextView textView = new TextView(this.f28882a);
        textView.setGravity(17);
        textView.setText(n8Var.i("content"));
        textView.setTextSize(d(n8Var.i("textSize"), 14));
        k(textView, n8Var);
        h(textView, n8Var);
        return textView;
    }

    public final int c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6931c9b", new Object[]{this, str})).intValue();
        }
        str.hashCode();
        if (!str.equals("bottom")) {
            return !str.equals("top") ? 17 : 48;
        }
        return 80;
    }

    public final int d(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fb0d6e9f", new Object[]{this, str, new Integer(i)})).intValue();
        }
        try {
            return Integer.parseInt(str);
        } catch (Exception e) {
            fve.d("HomepageToast offset Parameter analysis error", e, new String[0]);
            return i;
        }
    }

    public final int e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("712a8477", new Object[]{this, str})).intValue();
        }
        try {
            return (int) Float.parseFloat(str);
        } catch (Exception e) {
            fve.c("HomepageToastAbility :", "HomepageToast padding Parameter analysis error", e);
            return 10;
        }
    }

    public final void f(RadiusFrameLayout radiusFrameLayout, n8 n8Var) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa3ed636", new Object[]{this, radiusFrameLayout, n8Var});
            return;
        }
        try {
            i = Color.parseColor(n8Var.i("backgroundColor"));
        } catch (Exception e) {
            int parseColor = Color.parseColor("#CC000000");
            fve.d("HomepageToast", e, "backgroundColor parse error");
            i = parseColor;
        }
        radiusFrameLayout.setBackgroundColor(i);
    }

    public final void h(TextView textView, n8 n8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c4be29f", new Object[]{this, textView, n8Var});
            return;
        }
        String i = n8Var.i("isBold");
        if (!TextUtils.isEmpty(i) && "true".equals(i)) {
            textView.setTypeface(Typeface.DEFAULT_BOLD);
        }
    }

    public final void j(RadiusFrameLayout radiusFrameLayout, n8 n8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9dc2b953", new Object[]{this, radiusFrameLayout, n8Var});
            return;
        }
        String i = n8Var.i(hij.KEY_CORNER_RADIUS);
        if (!TextUtils.isEmpty(i)) {
            radiusFrameLayout.setRadius(d(i, 12) * 2);
        }
    }

    public final void k(TextView textView, n8 n8Var) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("917d6cf", new Object[]{this, textView, n8Var});
            return;
        }
        try {
            i = Color.parseColor(n8Var.i("textColor"));
        } catch (Exception e) {
            int parseColor = Color.parseColor("#FFFFFF");
            fve.d("HomepageToast", e, "textColor parse error");
            i = parseColor;
        }
        textView.setTextColor(i);
    }

    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebbb9904", new Object[]{this});
            return;
        }
        Toast toast = new Toast(this.f28882a);
        toast.setView(a(this.b));
        g(this.b, toast);
        toast.setDuration(d(this.b.i("duration"), 1));
        toast.show();
    }

    public final void g(n8 n8Var, Toast toast) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49522838", new Object[]{this, n8Var, toast});
            return;
        }
        String i = n8Var.i("gravity");
        if (!TextUtils.isEmpty(i)) {
            toast.setGravity(c(i), d(n8Var.i("xOffset"), 0), d(n8Var.i("yOffset"), 0));
        }
    }

    public final void i(RadiusFrameLayout radiusFrameLayout, n8 n8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc943292", new Object[]{this, radiusFrameLayout, n8Var});
            return;
        }
        String i = n8Var.i("paddingLeft");
        String i2 = n8Var.i("paddingRight");
        String i3 = n8Var.i("paddingBottom");
        String i4 = n8Var.i("paddingTop");
        if (!TextUtils.isEmpty(i3) && !TextUtils.isEmpty(i) && !TextUtils.isEmpty(i2) && !TextUtils.isEmpty(i4)) {
            radiusFrameLayout.setPadding(e(i) * 2, e(i4) * 2, e(i2) * 2, e(i3) * 2);
        }
    }
}
