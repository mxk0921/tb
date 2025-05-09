package tb;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class y2o {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Activity f31812a;
    public final d1a<xhv> b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            d1a<xhv> b = y2o.this.b();
            if (b != null) {
                b.invoke();
            }
        }
    }

    static {
        t2o.a(481297219);
    }

    public y2o(Activity activity, d1a<xhv> d1aVar) {
        ckf.g(activity, "activity");
        this.f31812a = activity;
        this.b = d1aVar;
    }

    public final d1a<xhv> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d1a) ipChange.ipc$dispatch("5c1c6fc0", new Object[]{this});
        }
        return this.b;
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2e194f0", new Object[]{this});
            return;
        }
        TextView textView = new TextView(this.f31812a);
        textView.setText("上报\n数据");
        textView.setGravity(17);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(Color.parseColor("#FF8903"));
        textView.setBackground(gradientDrawable);
        textView.setOnClickListener(new a());
        int a2 = p1p.a(50.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(a2, a2);
        layoutParams.gravity = 85;
        layoutParams.setMargins(0, 0, p1p.a(10.0f), p1p.a(500.0f));
        ((ViewGroup) this.f31812a.getWindow().getDecorView()).addView(textView, layoutParams);
    }
}
