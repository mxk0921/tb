package tb;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.google.android.material.badge.BadgeDrawable;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import kotlin.Metadata;
import tb.at4;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ltb/lv0;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "turboflow_dressup_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class lv0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f23586a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ d1a f23587a;

        public a(lv0 lv0Var, String str, d1a d1aVar) {
            this.f23587a = d1aVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                this.f23587a.invoke();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ d1a f23588a;

        public b(lv0 lv0Var, String str, d1a d1aVar) {
            this.f23588a = d1aVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                this.f23588a.invoke();
            }
        }
    }

    static {
        t2o.a(918552624);
    }

    public lv0(Context context) {
        ckf.g(context, "context");
        this.f23586a = context;
    }

    public final View b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("f08fe419", new Object[]{this});
        }
        View view = new View(this.f23586a);
        at4.a aVar = at4.Companion;
        Context context = view.getContext();
        ckf.f(context, "context");
        int c = at4.a.c(aVar, context, 50, false, 4, null);
        Context context2 = view.getContext();
        ckf.f(context2, "context");
        view.setLayoutParams(new LinearLayout.LayoutParams(c, at4.a.c(aVar, context2, 2, false, 4, null)));
        view.setBackgroundColor(-1);
        return view;
    }

    public final FrameLayout c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("c3c52d65", new Object[]{this});
        }
        at4.a aVar = at4.Companion;
        int c = at4.a.c(aVar, this.f23586a, 12, false, 4, null);
        int c2 = at4.a.c(aVar, this.f23586a, 22, false, 4, null);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(Color.parseColor("#80000000"));
        gradientDrawable.setShape(1);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setColor(Color.parseColor("#B8A4FF"));
        gradientDrawable2.setShape(1);
        View view = new View(this.f23586a);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(c, c);
        layoutParams.gravity = 17;
        xhv xhvVar = xhv.INSTANCE;
        view.setLayoutParams(layoutParams);
        view.setBackground(gradientDrawable2);
        FrameLayout frameLayout = new FrameLayout(this.f23586a);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(c2, c2));
        frameLayout.setBackground(gradientDrawable);
        frameLayout.addView(view);
        return frameLayout;
    }

    public final FrameLayout e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("a5f2a62a", new Object[]{this});
        }
        FrameLayout frameLayout = new FrameLayout(this.f23586a);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return frameLayout;
    }

    public final FrameLayout f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("f7be293", new Object[]{this, str});
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(Color.parseColor("#80000000"));
        gradientDrawable.setShape(0);
        at4.a aVar = at4.Companion;
        gradientDrawable.setCornerRadius(at4.a.c(aVar, this.f23586a, 12, false, 4, null));
        TextView textView = new TextView(this.f23586a);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -1);
        Context context = textView.getContext();
        ckf.f(context, "context");
        layoutParams.setMarginEnd(at4.a.c(aVar, context, 36, false, 4, null));
        xhv xhvVar = xhv.INSTANCE;
        textView.setLayoutParams(layoutParams);
        textView.setText(str);
        textView.setTextColor(-1);
        Context context2 = textView.getContext();
        ckf.f(context2, "context");
        textView.setTextSize(0, at4.a.c(aVar, context2, 26, false, 4, null));
        textView.setGravity(16);
        textView.setMaxLines(1);
        Context context3 = textView.getContext();
        ckf.f(context3, "context");
        textView.setPadding(at4.a.c(aVar, context3, 18, false, 4, null), 0, 0, 0);
        TUrlImageView tUrlImageView = new TUrlImageView(this.f23586a);
        tUrlImageView.setImageUrl("https://gw.alicdn.com/imgextra/i1/O1CN01mqW8tJ1geXQzC8v5t_!!6000000004167-2-tps-48-48.png");
        Context context4 = tUrlImageView.getContext();
        ckf.f(context4, "context");
        int c = at4.a.c(aVar, context4, 24, false, 4, null);
        Context context5 = tUrlImageView.getContext();
        ckf.f(context5, "context");
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(c, at4.a.c(aVar, context5, 24, false, 4, null));
        layoutParams2.gravity = 8388629;
        Context context6 = tUrlImageView.getContext();
        ckf.f(context6, "context");
        layoutParams2.setMarginEnd(at4.a.c(aVar, context6, 12, false, 4, null));
        tUrlImageView.setLayoutParams(layoutParams2);
        FrameLayout frameLayout = new FrameLayout(this.f23586a);
        Context context7 = frameLayout.getContext();
        ckf.f(context7, "context");
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, at4.a.c(aVar, context7, 58, false, 4, null)));
        frameLayout.setBackground(gradientDrawable);
        frameLayout.addView(textView);
        frameLayout.addView(tUrlImageView);
        return frameLayout;
    }

    public final void g(View view, int i, int i2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b91cab10", new Object[]{this, view, new Integer(i), new Integer(i2), new Boolean(z)});
            return;
        }
        ckf.g(view, "anchor");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            if (z) {
                layoutParams2.gravity = BadgeDrawable.TOP_END;
                layoutParams2.rightMargin = i;
            } else {
                layoutParams2.gravity = BadgeDrawable.TOP_START;
                layoutParams2.leftMargin = i;
            }
            layoutParams2.topMargin = i2;
            view.setLayoutParams(layoutParams2);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
    }

    public final LinearLayout a(String str, d1a<xhv> d1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinearLayout) ipChange.ipc$dispatch("5f3eff07", new Object[]{this, str, d1aVar});
        }
        ckf.g(str, "description");
        ckf.g(d1aVar, "onClick");
        LinearLayout linearLayout = new LinearLayout(this.f23586a);
        linearLayout.setOrientation(0);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        linearLayout.addView(f(str));
        linearLayout.addView(b());
        linearLayout.addView(c());
        linearLayout.setGravity(16);
        linearLayout.setOnClickListener(new a(this, str, d1aVar));
        return linearLayout;
    }

    public final LinearLayout d(String str, d1a<xhv> d1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinearLayout) ipChange.ipc$dispatch("a7842764", new Object[]{this, str, d1aVar});
        }
        ckf.g(str, "description");
        ckf.g(d1aVar, "onClick");
        LinearLayout linearLayout = new LinearLayout(this.f23586a);
        linearLayout.setOrientation(0);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        linearLayout.addView(c());
        linearLayout.addView(b());
        linearLayout.addView(f(str));
        linearLayout.setGravity(16);
        linearLayout.setOnClickListener(new b(this, str, d1aVar));
        return linearLayout;
    }
}
