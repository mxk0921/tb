package tb;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.GravityCompat;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.infoflow.multitab.viewprovider.tablayout.panel.PanelStyleModel;
import com.taobao.uikit.extend.feature.view.TUrlImageView;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class epl implements o7d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public TextView f18741a;
    public boolean b;
    public final o7d c;
    public FrameLayout d;
    public PanelStyleModel e;
    public final View.OnClickListener f = new b();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements View.OnLongClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(epl eplVar) {
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("7edba102", new Object[]{this, view})).booleanValue();
            }
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            epl.a(epl.this).m();
            if (!TextUtils.equals("editTvTag", String.valueOf(view.getTag()))) {
                d9j.c("PanelBaseViewProvider", "onClose click:");
                epl.c(epl.this);
            } else if (epl.b(epl.this)) {
                epl.a(epl.this).v();
            } else {
                epl.a(epl.this).f();
            }
        }
    }

    static {
        t2o.a(729809559);
        t2o.a(729809552);
    }

    public epl(o7d o7dVar) {
        this.c = o7dVar;
    }

    public static /* synthetic */ o7d a(epl eplVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (o7d) ipChange.ipc$dispatch("27edc0a", new Object[]{eplVar});
        }
        return eplVar.c;
    }

    public static /* synthetic */ boolean b(epl eplVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3f068b36", new Object[]{eplVar})).booleanValue();
        }
        return eplVar.b;
    }

    public static /* synthetic */ void c(epl eplVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ebdbf33", new Object[]{eplVar});
        } else {
            eplVar.j();
        }
    }

    @Override // tb.o7d
    public boolean D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1f9887f3", new Object[]{this})).booleanValue();
        }
        return this.b;
    }

    public ViewGroup d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("bf782530", new Object[]{this, context});
        }
        FrameLayout g = g(context);
        this.d = g;
        return g;
    }

    public View e(Context context, PanelStyleModel panelStyleModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bb42a645", new Object[]{this, context, panelStyleModel});
        }
        this.e = panelStyleModel;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(i(context));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = GravityCompat.END;
        layoutParams.rightMargin = trs.a(context, 30.0f);
        TextView textView = new TextView(context);
        this.f18741a = textView;
        textView.setOnClickListener(this.f);
        this.f18741a.setTag("editTvTag");
        this.f18741a.setLayoutParams(layoutParams);
        k();
        frameLayout.addView(this.f18741a);
        FrameLayout.LayoutParams h = h(context);
        TUrlImageView tUrlImageView = new TUrlImageView(context);
        tUrlImageView.setLayoutParams(h);
        tUrlImageView.setTag("closeIvTag");
        p2b.q(tUrlImageView, this.e.closeButtonImg, "homepage-ads", i2b.IMAGE_STRATEGY_CONFIG);
        tUrlImageView.setImageUrl(this.e.closeButtonImg);
        tUrlImageView.setOnClickListener(this.f);
        frameLayout.addView(tUrlImageView);
        return frameLayout;
    }

    @Override // tb.o7d
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e85541df", new Object[]{this});
            return;
        }
        this.b = true;
        k();
    }

    public final FrameLayout g(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("822591db", new Object[]{this, context});
        }
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        frameLayout.setBackgroundColor(Color.parseColor("#B3000000"));
        frameLayout.setOnClickListener(this.f);
        frameLayout.setLongClickable(false);
        frameLayout.setOnLongClickListener(new a(this));
        return frameLayout;
    }

    public final FrameLayout.LayoutParams h(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout.LayoutParams) ipChange.ipc$dispatch("5fc6d964", new Object[]{this, context});
        }
        int a2 = trs.a(context, 18.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(a2, a2);
        layoutParams.gravity = 8388629;
        layoutParams.rightMargin = trs.a(context, 3.0f);
        return layoutParams;
    }

    public final FrameLayout.LayoutParams i(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout.LayoutParams) ipChange.ipc$dispatch("45a71298", new Object[]{this, context});
        }
        int a2 = trs.a(context, 96.0f);
        int a3 = trs.a(context, 13.0f);
        int a4 = trs.a(context, 6.0f);
        int a5 = trs.a(context, 8.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(a2, -2);
        layoutParams.gravity = GravityCompat.END;
        layoutParams.topMargin = a3;
        layoutParams.rightMargin = a4;
        layoutParams.bottomMargin = a5;
        return layoutParams;
    }

    public final void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("808613a6", new Object[]{this});
            return;
        }
        this.b = false;
        k();
        FrameLayout frameLayout = this.d;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        this.c.onClose();
    }

    public final void k() {
        float f;
        int i;
        int i2;
        String str;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b77c64e0", new Object[]{this});
            return;
        }
        TextView textView = this.f18741a;
        if (textView != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams();
            layoutParams.gravity = GravityCompat.END;
            if (this.f18741a.getText() != null && this.f18741a.getText().length() < 4) {
                z = true;
            }
            Context context = this.f18741a.getContext();
            if (!this.b || !z) {
                f = 30.0f;
            } else {
                f = 44.0f;
            }
            layoutParams.rightMargin = trs.a(context, f);
            this.f18741a.setLayoutParams(layoutParams);
            TextView textView2 = this.f18741a;
            if (this.b) {
                i = Color.parseColor(this.e.completeTextColor);
            } else {
                i = Color.parseColor(this.e.channelManagerTextColor);
            }
            textView2.setTextColor(i);
            TextView textView3 = this.f18741a;
            if (this.b) {
                i2 = this.e.completeTextSize;
            } else {
                i2 = this.e.channelManagerTextSize;
            }
            textView3.setTextSize(i2);
            TextView textView4 = this.f18741a;
            if (this.b) {
                str = this.e.completeText;
            } else {
                str = this.e.channelManagerText;
            }
            textView4.setText(str);
        }
    }

    @Override // tb.o7d
    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4fcc21e", new Object[]{this});
        } else {
            this.c.m();
        }
    }

    @Override // tb.o7d
    public void onClose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e155e360", new Object[]{this});
            return;
        }
        d9j.c("PanelBaseViewProvider", "onClose :");
        j();
    }

    @Override // tb.o7d
    public void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("901b9a6e", new Object[]{this});
            return;
        }
        this.b = false;
        k();
    }
}
