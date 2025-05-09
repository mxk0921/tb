package tb;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.live.plugin.atype.flexalocal.recommendpop.ItemInfo;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public abstract class jw1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f22251a;
    public final amr b;
    public ViewGroup c;
    public JSONObject d;
    public String e;
    public String f;
    public String g;
    public final String h;
    public FrameLayout i;
    public LottieAnimationView j;
    public dmh<kkh> k;
    public TextView l;
    public TextView m;

    static {
        t2o.a(295699652);
    }

    public jw1(Context context, amr amrVar, String str) {
        this.f22251a = context;
        this.b = amrVar;
        this.h = str;
    }

    public static /* synthetic */ TextView a(jw1 jw1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("5b8c4e96", new Object[]{jw1Var});
        }
        return jw1Var.l;
    }

    public static /* synthetic */ void b(jw1 jw1Var, TextView textView, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89291ce3", new Object[]{jw1Var, textView, new Long(j)});
        } else {
            jw1Var.B(textView, j);
        }
    }

    public static /* synthetic */ TextView c(jw1 jw1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("1da4c398", new Object[]{jw1Var});
        }
        return jw1Var.m;
    }

    public static /* synthetic */ void d(jw1 jw1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2262b4a5", new Object[]{jw1Var});
        } else {
            jw1Var.C();
        }
    }

    public static /* synthetic */ dmh e(jw1 jw1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dmh) ipChange.ipc$dispatch("1539d3a0", new Object[]{jw1Var});
        }
        return jw1Var.k;
    }

    public static /* synthetic */ LottieAnimationView f(jw1 jw1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LottieAnimationView) ipChange.ipc$dispatch("fe7e40c9", new Object[]{jw1Var});
        }
        return jw1Var.j;
    }

    public final void B(TextView textView, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("393bcc83", new Object[]{this, textView, new Long(j)});
        } else if (textView != null) {
            int h = nw0.h();
            int g = g(h, 310);
            int i = h - g;
            textView.setTranslationX(i);
            textView.setTranslationY((int) (Math.tan(3.0d) * i));
            textView.setRotation(-3.0f);
            textView.setVisibility(0);
            textView.animate().translationX(0.0f).translationY(0.0f).setStartDelay(j + 250).setDuration(250L).withEndAction(new fw1(this, g, textView)).start();
        }
    }

    public final void C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c305654a", new Object[]{this});
            return;
        }
        FrameLayout frameLayout = this.i;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
            this.i.removeAllViews();
            this.i = null;
            this.j = null;
        }
    }

    public abstract void D(boolean z);

    public final int g(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7b6ae3d1", new Object[]{this, new Integer(i), new Integer(i2)})).intValue();
        }
        return (i * i2) / 750;
    }

    public abstract void h();

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else {
            C();
        }
    }

    public int k() {
        BaseFrame baseFrame;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b54e729", new Object[]{this})).intValue();
        }
        amr amrVar = this.b;
        if (amrVar == null || (baseFrame = amrVar.l) == null) {
            return iw0.a(this.f22251a, 60.0f);
        }
        View viewByName = baseFrame.getViewByName("tl-bottom-bar-native");
        Rect rect = new Rect();
        if (viewByName != null) {
            viewByName.getGlobalVisibleRect(rect);
        }
        if (rect.height() > 0) {
            return rect.height() + iw0.a(this.f22251a, 12.0f);
        }
        if (d9m.g().getBottomBarBottomDP() > 0) {
            return d9m.g().getBottomBarBottomDP();
        }
        return iw0.a(this.f22251a, 60.0f);
    }

    public String l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5b634f7", new Object[]{this});
        }
        return "item_right_popview_button_click";
    }

    public String m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2ee4e919", new Object[]{this});
        }
        return "item_right_popview_close_click";
    }

    public abstract ItemInfo n(uv5 uv5Var);

    public String o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("38bfb732", new Object[]{this});
        }
        return "item_right_popview_item_click";
    }

    public abstract View p();

    public JSONObject q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("1d1040db", new Object[]{this});
        }
        JSONObject jSONObject = this.d;
        if (jSONObject != null) {
            return jSONObject.getJSONObject("logParams");
        }
        return null;
    }

    public String r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c4f17b1", new Object[]{this});
        }
        return "item_right_popview_expousure";
    }

    public boolean s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ce9b29a2", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public boolean t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4387938c", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public final void u(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77d230", new Object[]{this, str});
            return;
        }
        Context context = this.f22251a;
        if (!(context == null || str == null)) {
            try {
                dmh<kkh> x = ukh.x(context, str);
                this.k = x;
                x.d(new hw1(this));
                x.c(new gw1(this));
            } catch (Throwable unused) {
            }
        }
    }

    public boolean v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9ecd0c8", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public boolean w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bfb73475", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public boolean x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bf90f322", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public abstract void y(String str, Object obj);

    public void z(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b31bc6a8", new Object[]{this, new Integer(i)});
        }
    }

    public final void A(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f74f0e3c", new Object[]{this, jSONObject});
        } else if (this.c != null && jSONObject != null) {
            JSONObject jSONObject3 = jSONObject.getJSONObject("animation");
            if (nh4.j0() && jSONObject3 != null && (jSONObject2 = jSONObject3.getJSONObject("data")) != null && jSONObject2.containsKey("lottieUrl")) {
                FrameLayout frameLayout = new FrameLayout(this.f22251a);
                this.i = frameLayout;
                frameLayout.setBackgroundColor(-1090519040);
                this.c.addView(this.i, new ViewGroup.LayoutParams(-1, -1));
                LottieAnimationView lottieAnimationView = new LottieAnimationView(this.f22251a);
                this.j = lottieAnimationView;
                lottieAnimationView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
                layoutParams.gravity = 17;
                this.i.addView(this.j, layoutParams);
                int h = nw0.h();
                TextView textView = new TextView(this.f22251a);
                this.l = textView;
                textView.setTextSize(28.0f);
                this.l.setTextColor(-1);
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
                layoutParams2.gravity = 19;
                layoutParams2.setMargins(g(h, 350), g(h, 100), 0, 0);
                this.l.setText(jSONObject2.getString("title"));
                this.l.setGravity(17);
                this.l.setTypeface(null, 1);
                this.l.setVisibility(4);
                this.i.addView(this.l, layoutParams2);
                TextView textView2 = new TextView(this.f22251a);
                this.m = textView2;
                textView2.setTextSize(28.0f);
                this.m.setTextColor(-1);
                FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
                layoutParams3.gravity = 19;
                layoutParams3.setMargins(g(h, 310), g(h, 190), 0, 0);
                this.m.setText(jSONObject2.getString("subtitle"));
                this.m.setGravity(17);
                this.m.setTypeface(null, 1);
                this.m.setVisibility(4);
                this.i.addView(this.m, layoutParams3);
                this.j.addAnimatorListener(new dw1(this));
                u(jSONObject2.getString("lottieUrl"));
            }
        }
    }

    public boolean i(ViewGroup viewGroup, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2b0cd5cd", new Object[]{this, viewGroup, jSONObject})).booleanValue();
        }
        this.c = viewGroup;
        this.d = jSONObject;
        this.e = jSONObject.getString("type");
        this.f = this.d.getString("code");
        this.g = this.d.getString("dxTemplateName");
        if (!"200".equals(this.f) && !"444".equals(this.f)) {
            return false;
        }
        h();
        JSONObject jSONObject2 = this.d.getJSONObject("displayStyleExtend");
        if (jSONObject2 != null) {
            A(jSONObject2);
        }
        return true;
    }
}
