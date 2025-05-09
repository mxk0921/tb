package tb;

import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.uikit.extend.feature.view.TUrlImageView;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class cv4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int b;
    public int c;
    public View d;
    public View e;
    public TextView f;
    public TextView g;
    public View h;
    public d1a<xhv> i;

    /* renamed from: a  reason: collision with root package name */
    public final int f17339a = -15658735;
    public final Drawable j = kew.u(-1, null, null, kew.v(44), 0, 0, 0, 0, kew.v(1), kew.c(0, 0.1f), 246, null);

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
            d1a<xhv> e = cv4.this.e();
            if (e != null) {
                e.invoke();
            }
        }
    }

    static {
        t2o.a(766510334);
    }

    public static /* synthetic */ void b(cv4 cv4Var, ViewGroup viewGroup, int i, int i2, int i3, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b0d9599", new Object[]{cv4Var, viewGroup, new Integer(i), new Integer(i2), new Integer(i3), obj});
            return;
        }
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        cv4Var.a(viewGroup, i, i2);
    }

    public final View c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("1620350c", new Object[]{this});
        }
        return this.d;
    }

    public final int d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3c399806", new Object[]{this})).intValue();
        }
        return this.b;
    }

    public final d1a<xhv> e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d1a) ipChange.ipc$dispatch("73185be7", new Object[]{this});
        }
        return this.i;
    }

    public final int f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6ffb341b", new Object[]{this})).intValue();
        }
        return this.c;
    }

    public final void g(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("166d8554", new Object[]{this, view});
        } else {
            this.d = view;
        }
    }

    public final void h(d1a<xhv> d1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb838d71", new Object[]{this, d1aVar});
        } else {
            this.i = d1aVar;
        }
    }

    public final void i(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("328b618", new Object[]{this, new Integer(i)});
            return;
        }
        this.b = i;
        int i2 = this.c;
        if (i > i2) {
            TextView textView = this.f;
            if (textView != null) {
                textView.setText(String.valueOf(i2));
            }
            l();
            return;
        }
        TextView textView2 = this.f;
        if (textView2 != null) {
            textView2.setText(String.valueOf(i));
        }
    }

    public final void j(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6425d4f", new Object[]{this, new Integer(i)});
            return;
        }
        this.c = i;
        TextView textView = this.g;
        if (textView != null) {
            textView.setText(String.valueOf(i));
        }
    }

    public final void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a460799", new Object[]{this});
        } else if (this.c < this.b) {
            l();
        } else {
            View view = this.e;
            if (view != null) {
                kew.g0(view);
            }
            View view2 = this.h;
            if (view2 != null) {
                kew.C(view2);
            }
        }
    }

    public final void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab269ad7", new Object[]{this});
            return;
        }
        View view = this.e;
        if (view != null) {
            kew.C(view);
        }
        View view2 = this.h;
        if (view2 != null) {
            kew.g0(view2);
        }
    }

    public final void a(ViewGroup viewGroup, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a2db646", new Object[]{this, viewGroup, new Integer(i), new Integer(i2)});
            return;
        }
        ckf.g(viewGroup, "container");
        Typeface typeface = Typeface.DEFAULT;
        try {
            typeface = Typeface.createFromAsset(viewGroup.getContext().getAssets(), k7z.ALIBABA_FONT_MIDDLE);
        } catch (Exception e) {
            e.printStackTrace();
        }
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        g(frameLayout);
        kew.C(frameLayout);
        frameLayout.setBackground(this.j);
        kew.e0(frameLayout, true, kew.v(44));
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        LinearLayout.LayoutParams layoutParams2 = null;
        FrameLayout.LayoutParams layoutParams3 = layoutParams instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams : null;
        if (layoutParams3 == null) {
            FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2);
            layoutParams4.gravity = 85;
            layoutParams4.width = kew.v(88);
            layoutParams4.height = kew.v(88);
            layoutParams4.bottomMargin = i;
            layoutParams4.rightMargin = i2;
            xhv xhvVar = xhv.INSTANCE;
            frameLayout.setLayoutParams(layoutParams4);
        } else {
            layoutParams3.gravity = 85;
            layoutParams3.width = kew.v(88);
            layoutParams3.height = kew.v(88);
            layoutParams3.bottomMargin = i;
            layoutParams3.rightMargin = i2;
        }
        TUrlImageView tUrlImageView = new TUrlImageView(frameLayout.getContext());
        ViewGroup.LayoutParams layoutParams5 = tUrlImageView.getLayoutParams();
        if (layoutParams5 instanceof ViewGroup.MarginLayoutParams) {
            tUrlImageView.setLayoutParams(layoutParams5);
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
            xhv xhvVar2 = xhv.INSTANCE;
            tUrlImageView.setLayoutParams(marginLayoutParams);
        }
        this.h = tUrlImageView;
        tUrlImageView.setImageUrl("https://gw.alicdn.com/imgextra/i1/O1CN014xWtcC1tHibJSEmE8_!!6000000005877-2-tps-36-36.png");
        int v = kew.v(26);
        tUrlImageView.setPadding(v, v, v, v);
        ViewGroup.LayoutParams layoutParams6 = tUrlImageView.getLayoutParams();
        FrameLayout.LayoutParams layoutParams7 = layoutParams6 instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams6 : null;
        if (layoutParams7 == null) {
            FrameLayout.LayoutParams layoutParams8 = new FrameLayout.LayoutParams(-2, -2);
            layoutParams8.gravity = 17;
            layoutParams8.width = -1;
            layoutParams8.height = -1;
            xhv xhvVar3 = xhv.INSTANCE;
            tUrlImageView.setLayoutParams(layoutParams8);
        } else {
            layoutParams7.gravity = 17;
            layoutParams7.width = -1;
            layoutParams7.height = -1;
        }
        tUrlImageView.setOnClickListener(new a());
        frameLayout.addView(tUrlImageView);
        xhv xhvVar4 = xhv.INSTANCE;
        LinearLayout linearLayout = new LinearLayout(frameLayout.getContext());
        ViewGroup.LayoutParams layoutParams9 = linearLayout.getLayoutParams();
        if (layoutParams9 instanceof ViewGroup.MarginLayoutParams) {
            linearLayout.setLayoutParams(layoutParams9);
        } else {
            linearLayout.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        }
        this.e = linearLayout;
        kew.C(linearLayout);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        ViewGroup.LayoutParams layoutParams10 = linearLayout.getLayoutParams();
        FrameLayout.LayoutParams layoutParams11 = layoutParams10 instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams10 : null;
        if (layoutParams11 == null) {
            FrameLayout.LayoutParams layoutParams12 = new FrameLayout.LayoutParams(-2, -2);
            layoutParams12.gravity = 17;
            linearLayout.setLayoutParams(layoutParams12);
        } else {
            layoutParams11.gravity = 17;
        }
        TextView textView = new TextView(linearLayout.getContext());
        ViewGroup.LayoutParams layoutParams13 = textView.getLayoutParams();
        if (layoutParams13 instanceof ViewGroup.MarginLayoutParams) {
            textView.setLayoutParams(layoutParams13);
        } else {
            textView.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        }
        this.f = textView;
        textView.setSingleLine();
        textView.setText(String.valueOf(this.b));
        kew.c0(textView, kew.v(24));
        textView.setTextColor(this.f17339a);
        textView.setTypeface(typeface);
        textView.setLetterSpacing(0.06f);
        linearLayout.addView(textView);
        View view = new View(linearLayout.getContext());
        ViewGroup.LayoutParams layoutParams14 = view.getLayoutParams();
        if (layoutParams14 instanceof ViewGroup.MarginLayoutParams) {
            view.setLayoutParams(layoutParams14);
        } else {
            view.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        }
        ViewGroup.LayoutParams layoutParams15 = view.getLayoutParams();
        if (layoutParams15 instanceof LinearLayout.LayoutParams) {
            layoutParams2 = (LinearLayout.LayoutParams) layoutParams15;
        }
        if (layoutParams2 == null) {
            LinearLayout.LayoutParams layoutParams16 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams16.width = kew.v(56);
            layoutParams16.height = kew.v(Double.valueOf(2.4d));
            layoutParams16.topMargin = kew.v(4);
            layoutParams16.bottomMargin = kew.v(6);
            view.setLayoutParams(layoutParams16);
        } else {
            layoutParams2.width = kew.v(56);
            layoutParams2.height = kew.v(Double.valueOf(2.4d));
            layoutParams2.topMargin = kew.v(4);
            layoutParams2.bottomMargin = kew.v(6);
        }
        kew.e0(view, true, kew.v(2));
        view.setBackgroundColor(this.f17339a);
        linearLayout.addView(view);
        TextView textView2 = new TextView(linearLayout.getContext());
        ViewGroup.LayoutParams layoutParams17 = textView2.getLayoutParams();
        if (layoutParams17 instanceof ViewGroup.MarginLayoutParams) {
            textView2.setLayoutParams(layoutParams17);
        } else {
            textView2.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        }
        this.g = textView2;
        textView2.setSingleLine();
        textView2.setText(String.valueOf(this.c));
        kew.c0(textView2, kew.v(24));
        textView2.setTextColor(this.f17339a);
        textView2.setTypeface(typeface);
        textView2.setLetterSpacing(0.06f);
        linearLayout.addView(textView2);
        frameLayout.addView(linearLayout);
        viewGroup.addView(frameLayout);
    }
}
