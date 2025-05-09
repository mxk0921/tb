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
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.container.IContainerService;
import com.taobao.uikit.extend.feature.view.TUrlImageView;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class j6m {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final FluidContext f21796a;
    public final Context b;
    public final ViewGroup c;
    public FrameLayout d;
    public View e;

    static {
        t2o.a(468714091);
    }

    public j6m(FluidContext fluidContext, ViewGroup viewGroup) {
        this.f21796a = fluidContext;
        this.b = viewGroup.getContext();
        this.c = viewGroup;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("676f5b75", new Object[]{this});
            return;
        }
        FrameLayout frameLayout = this.d;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d3c33646", new Object[]{this})).booleanValue();
        }
        FrameLayout frameLayout = this.d;
        if (frameLayout == null || frameLayout.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    public void c(int i) {
        LinearLayout.LayoutParams layoutParams;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d20155d3", new Object[]{this, new Integer(i)});
            return;
        }
        if (this.d == null) {
            FrameLayout frameLayout = new FrameLayout(this.b);
            this.d = frameLayout;
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            this.c.addView(this.d);
            if (b93.n(this.f21796a)) {
                View view = new View(this.b);
                if (f2k.d(this.f21796a)) {
                    view.setLayoutParams(new FrameLayout.LayoutParams(-1, pr9.q(220), 80));
                } else {
                    view.setLayoutParams(new FrameLayout.LayoutParams(-1, s6o.S(this.b, 220), 80));
                }
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setColors(new int[]{0, Color.argb(76, 14, 17, 25)});
                gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
                view.setBackground(gradientDrawable);
                this.d.addView(view);
            }
            LinearLayout linearLayout = new LinearLayout(this.b);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2, 80);
            if (b93.n(this.f21796a)) {
                if (f2k.d(this.f21796a)) {
                    layoutParams2.bottomMargin = ((IContainerService) this.f21796a.getService(IContainerService.class)).getWeexActionBarHeight() + pr9.q(52);
                } else {
                    layoutParams2.bottomMargin = ((IContainerService) this.f21796a.getService(IContainerService.class)).getWeexActionBarHeight() + s6o.S(this.b, 52);
                }
            } else if (((IContainerService) this.f21796a.getService(IContainerService.class)).isHighActionbar() || pto.g(this.f21796a)) {
                layoutParams2.bottomMargin = jxv.b(this.b, 30.0f);
            } else {
                layoutParams2.bottomMargin = jxv.b(this.b, 6.0f);
            }
            linearLayout.setLayoutParams(layoutParams2);
            linearLayout.setGravity(17);
            this.d.addView(linearLayout);
            this.e = linearLayout;
            TextView textView = new TextView(this.b);
            textView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
            textView.setText("2x 快进中");
            textView.setTextColor(Color.parseColor(why.DEFAULT_MASK_BACKGROUND_COLOR));
            if (f2k.d(this.f21796a)) {
                textView.setTextSize(0, pr9.q(26));
                textView.setShadowLayer(pr9.q(4), 0.0f, pr9.q(2), Color.parseColor("#59000000"));
            } else {
                textView.setTextSize(0, s6o.S(this.b, 26));
                textView.setShadowLayer(s6o.S(this.b, 4), 0.0f, s6o.S(this.b, 2), Color.parseColor("#59000000"));
            }
            linearLayout.addView(textView);
            TUrlImageView tUrlImageView = new TUrlImageView(this.b);
            if (f2k.d(this.f21796a)) {
                layoutParams = new LinearLayout.LayoutParams(pr9.q(22), pr9.q(13));
                layoutParams.leftMargin = pr9.q(10);
            } else {
                layoutParams = new LinearLayout.LayoutParams(s6o.S(this.b, 22), s6o.S(this.b, 13));
                layoutParams.leftMargin = s6o.S(this.b, 10);
            }
            tUrlImageView.setLayoutParams(layoutParams);
            tUrlImageView.setSkipAutoSize(true);
            tUrlImageView.setImageUrl("https://img.alicdn.com/imgextra/i1/O1CN01v0FRTI1CyHudGP16o_!!6000000000149-54-tps-45-27.apng");
            linearLayout.addView(tUrlImageView);
        }
        if (f2k.d(this.f21796a)) {
            ((ViewGroup.MarginLayoutParams) this.e.getLayoutParams()).bottomMargin = i + pr9.q(26);
            this.e.requestLayout();
        }
        this.d.setVisibility(0);
    }
}
