package tb;

import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class bnp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final int f16496a;
    public String b;
    public String c;
    public String d;
    public String e;
    public View f;
    public boolean g;

    static {
        t2o.a(766510360);
    }

    public bnp(int i) {
        this.f16496a = i;
        this.b = "";
        this.c = "";
        this.d = "";
        this.e = "掌柜原因需要离开";
    }

    public final void a(ViewGroup viewGroup) {
        FrameLayout.LayoutParams layoutParams;
        int i;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45a79766", new Object[]{this, viewGroup});
            return;
        }
        ckf.g(viewGroup, "container");
        LinearLayout linearLayout = new LinearLayout(viewGroup.getContext());
        ViewGroup.LayoutParams layoutParams2 = linearLayout.getLayoutParams();
        if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
            linearLayout.setLayoutParams(layoutParams2);
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
            xhv xhvVar = xhv.INSTANCE;
            linearLayout.setLayoutParams(marginLayoutParams);
        }
        e(linearLayout);
        ViewGroup.LayoutParams layoutParams3 = linearLayout.getLayoutParams();
        if (layoutParams3 instanceof FrameLayout.LayoutParams) {
            layoutParams = (FrameLayout.LayoutParams) layoutParams3;
        } else {
            layoutParams = null;
        }
        if (layoutParams == null) {
            FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2);
            layoutParams4.width = -1;
            if (this.g) {
                i2 = -2;
            } else {
                i2 = kew.v(106);
            }
            layoutParams4.height = i2;
            layoutParams4.leftMargin = kew.v(24);
            layoutParams4.rightMargin = kew.v(24);
            layoutParams4.bottomMargin = c();
            layoutParams4.gravity = 80;
            xhv xhvVar2 = xhv.INSTANCE;
            linearLayout.setLayoutParams(layoutParams4);
        } else {
            layoutParams.width = -1;
            if (this.g) {
                i = -2;
            } else {
                i = kew.v(106);
            }
            layoutParams.height = i;
            layoutParams.leftMargin = kew.v(24);
            layoutParams.rightMargin = kew.v(24);
            layoutParams.bottomMargin = c();
            layoutParams.gravity = 80;
        }
        kew.e0(linearLayout, true, kew.v(70));
        linearLayout.setBackgroundColor(-135486);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        TextView textView = new TextView(linearLayout.getContext());
        ViewGroup.LayoutParams layoutParams5 = textView.getLayoutParams();
        if (layoutParams5 instanceof ViewGroup.MarginLayoutParams) {
            textView.setLayoutParams(layoutParams5);
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = new ViewGroup.MarginLayoutParams(-2, -2);
            xhv xhvVar3 = xhv.INSTANCE;
            textView.setLayoutParams(marginLayoutParams2);
        }
        ViewGroup.LayoutParams layoutParams6 = textView.getLayoutParams();
        if (layoutParams6 instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams6;
            if (this.g) {
                marginLayoutParams3.topMargin = kew.v(30);
                marginLayoutParams3.bottomMargin = kew.v(30);
            } else {
                marginLayoutParams3.topMargin = kew.v(14);
            }
            textView.setLayoutParams(layoutParams6);
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams4 = new ViewGroup.MarginLayoutParams(-2, -2);
            if (this.g) {
                marginLayoutParams4.topMargin = kew.v(30);
                marginLayoutParams4.bottomMargin = kew.v(30);
            } else {
                marginLayoutParams4.topMargin = kew.v(14);
            }
            xhv xhvVar4 = xhv.INSTANCE;
            textView.setLayoutParams(marginLayoutParams4);
        }
        textView.setText(this.e);
        textView.setSingleLine();
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        kew.c0(textView, kew.v(26));
        textView.setTextColor(-3037881);
        linearLayout.addView(textView);
        xhv xhvVar5 = xhv.INSTANCE;
        if (!this.g) {
            TextView textView2 = new TextView(linearLayout.getContext());
            ViewGroup.LayoutParams layoutParams7 = textView2.getLayoutParams();
            if (layoutParams7 instanceof ViewGroup.MarginLayoutParams) {
                textView2.setLayoutParams(layoutParams7);
            } else {
                textView2.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
            }
            ViewGroup.LayoutParams layoutParams8 = textView2.getLayoutParams();
            if (layoutParams8 instanceof ViewGroup.MarginLayoutParams) {
                ((ViewGroup.MarginLayoutParams) layoutParams8).topMargin = kew.v(6);
                textView2.setLayoutParams(layoutParams8);
            } else {
                ViewGroup.MarginLayoutParams marginLayoutParams5 = new ViewGroup.MarginLayoutParams(-2, -2);
                marginLayoutParams5.topMargin = kew.v(6);
                textView2.setLayoutParams(marginLayoutParams5);
            }
            textView2.setText(this.d);
            textView2.setSingleLine();
            kew.c0(textView2, kew.v(24));
            textView2.setTextColor(-3037881);
            linearLayout.addView(textView2);
        }
        viewGroup.addView(linearLayout);
    }

    public final int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b54e729", new Object[]{this})).intValue();
        }
        return this.f16496a;
    }

    public final View d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("1620350c", new Object[]{this});
        }
        return this.f;
    }

    public final void e(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("166d8554", new Object[]{this, view});
        } else {
            this.f = view;
        }
    }

    public final void b(JSONObject jSONObject, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db173962", new Object[]{this, jSONObject, viewGroup});
            return;
        }
        ckf.g(viewGroup, "container");
        if (jSONObject != null) {
            int intValue = jSONObject.getIntValue("status");
            this.e = brf.d(jSONObject, "tips");
            this.b = brf.d(jSONObject, "startTime");
            this.c = brf.d(jSONObject, "endTime");
            String d = brf.d(jSONObject, "closeTime");
            this.d = d;
            if (d == null || wsq.a0(d)) {
                this.d = "打烊时间：" + this.b + " ~ " + this.c;
            }
            if (wsq.a0(this.b) && wsq.a0(this.c)) {
                this.g = true;
            }
            if (intValue == 1) {
                a(viewGroup);
            }
        }
    }

    public /* synthetic */ bnp(int i, int i2, a07 a07Var) {
        this((i2 & 1) != 0 ? kew.v(170) : i);
    }
}
