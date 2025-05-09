package tb;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tbpoplayer.nativerender.dsl.ComponentBaseModel;
import com.taobao.tbpoplayer.nativerender.dsl.style.StyleModel;
import com.taobao.tbpoplayer.nativerender.render.component.PopComponentCornerClipLayout;
import java.util.Map;
import tb.oe8;
import tb.yam;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public abstract class ubm<T extends ComponentBaseModel> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final oe8 f29277a;
    public final T b;
    public final View c;
    public final boolean d;

    static {
        t2o.a(790626473);
        t2o.a(790626432);
    }

    public ubm(oe8 oe8Var, T t, boolean z) {
        try {
            this.f29277a = oe8Var;
            this.b = t;
            this.d = z;
            if (!t.isValid()) {
                oe8Var.s("ComponentConfigInvalid.componentType=" + t.type, "");
            }
            View c = c(oe8Var.j().e());
            StyleModel f = f();
            if (f != null) {
                this.c = g(c, f.borderRadius);
            } else {
                this.c = c;
            }
        } catch (Throwable th) {
            wdm.h("PopComponent.init..error.id=" + t.id, th);
            oe8Var.s("ComponentInitError.componentType=" + t.type, "");
        }
    }

    public abstract View c(Context context);

    public T d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ((ComponentBaseModel) ipChange.ipc$dispatch("9e3372d9", new Object[]{this}));
        }
        return this.b;
    }

    public View e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("2d47995", new Object[]{this});
        }
        return this.c;
    }

    public abstract StyleModel f();

    public final View g(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("507629ed", new Object[]{this, view, new Integer(i)});
        }
        me8 j = this.f29277a.j();
        if (view == null || i <= 0 || j.q() != 1) {
            return view;
        }
        Map<String, String> r = j.r();
        if (r != null && "false".equals(r.get(me8.WIDGET_SWITCH_ENABLE_CORNER_RADIUS))) {
            return view;
        }
        float c = this.f29277a.g().c(j.e(), i);
        PopComponentCornerClipLayout popComponentCornerClipLayout = new PopComponentCornerClipLayout(view.getContext());
        popComponentCornerClipLayout.init((int) c);
        popComponentCornerClipLayout.setLayoutParams(view.getLayoutParams());
        popComponentCornerClipLayout.addView(view, new FrameLayout.LayoutParams(-1, -1));
        return popComponentCornerClipLayout;
    }

    public void h(View view, StyleModel styleModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8f0cf9a", new Object[]{this, view, styleModel});
            return;
        }
        int h = plj.h(this.f29277a, styleModel.width);
        int h2 = plj.h(this.f29277a, styleModel.height);
        if (this.d) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(h, h2);
            int v = v(styleModel.marginLeft);
            if (v > 0) {
                layoutParams.leftMargin = v;
            }
            int v2 = v(styleModel.marginRight);
            if (v2 > 0) {
                layoutParams.rightMargin = v2;
            }
            int v3 = v(styleModel.marginTop);
            if (v3 > 0) {
                layoutParams.topMargin = v3;
            }
            int v4 = v(styleModel.marginBottom);
            if (v4 > 0) {
                layoutParams.bottomMargin = v4;
            }
            view.setLayoutParams(layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(h, h2);
        String str = styleModel.layout;
        if (TextUtils.isEmpty(str) || "leftTop".equals(str)) {
            layoutParams2.gravity = 51;
            if (!TextUtils.isEmpty(styleModel.left)) {
                layoutParams2.leftMargin = w(styleModel.left);
            }
            if (!TextUtils.isEmpty(styleModel.top)) {
                layoutParams2.topMargin = w(styleModel.top);
            }
        } else if ("leftBottom".equals(str)) {
            layoutParams2.gravity = 83;
            if (!TextUtils.isEmpty(styleModel.left)) {
                layoutParams2.leftMargin = w(styleModel.left);
            }
            if (!TextUtils.isEmpty(styleModel.bottom)) {
                layoutParams2.bottomMargin = w(styleModel.bottom);
            }
        } else if ("rightTop".equals(str)) {
            layoutParams2.gravity = 53;
            if (!TextUtils.isEmpty(styleModel.right)) {
                layoutParams2.rightMargin = w(styleModel.right);
            }
            if (!TextUtils.isEmpty(styleModel.top)) {
                layoutParams2.topMargin = w(styleModel.top);
            }
        } else if ("rightBottom".equals(str)) {
            layoutParams2.gravity = 85;
            if (!TextUtils.isEmpty(styleModel.right)) {
                layoutParams2.rightMargin = w(styleModel.right);
            }
            if (!TextUtils.isEmpty(styleModel.bottom)) {
                layoutParams2.bottomMargin = w(styleModel.bottom);
            }
        }
        view.setLayoutParams(layoutParams2);
    }

    public void i(View view, StyleModel styleModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b2f9d9b", new Object[]{this, view, styleModel});
            return;
        }
        try {
            h(view, styleModel);
            Context e = this.f29277a.j().e();
            jl1 g = this.f29277a.g();
            view.setPadding((int) g.c(e, (float) styleModel.paddingLeft), (int) g.c(e, (float) styleModel.paddingTop), (int) g.c(e, (float) styleModel.paddingRight), (int) g.c(e, (float) styleModel.paddingBottom));
            otq.a(this.f29277a, view, this.b, styleModel);
            String h = a1n.h(this.f29277a, this.b.alt, false);
            if (!TextUtils.isEmpty(h)) {
                view.setContentDescription(h);
            }
        } catch (Throwable th) {
            wdm.h("PopComponent.initLayoutParams.error.id=" + this.b.id, th);
            oe8 oe8Var = this.f29277a;
            oe8Var.s("RenderFailed.initStyle.id=" + this.b.id, "");
        }
    }

    public final /* synthetic */ void j(oe8.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79a54721", new Object[]{this, bVar});
        } else if (bVar != null) {
            wdm.d("PopComponent.onPreClose.anim.done." + this.b.id, new Object[0]);
            bVar.a(false);
        }
    }

    public final /* synthetic */ void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df1ead31", new Object[]{this});
            return;
        }
        View view = this.c;
        if (view != null && view.isAttachedToWindow()) {
            this.c.sendAccessibilityEvent(8);
        }
    }

    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3aec0f63", new Object[]{this});
        }
    }

    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70a0dbf0", new Object[]{this});
        }
    }

    public boolean n(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("43d42ba2", new Object[]{this, str, str2})).booleanValue();
        }
        if (TextUtils.isEmpty(str) || !str.equals(this.b.id)) {
            return false;
        }
        return true;
    }

    public void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4eb0d49", new Object[]{this});
        } else {
            u();
        }
    }

    public void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd2cee1e", new Object[]{this});
        } else {
            u();
        }
    }

    public void q(final oe8.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97d9ccc3", new Object[]{this, bVar});
            return;
        }
        yam f = this.f29277a.f();
        oe8 oe8Var = this.f29277a;
        T t = this.b;
        f.e(oe8Var, "close", t.animation, this.c, t, new yam.f() { // from class: tb.tbm
            @Override // tb.yam.f
            public final void onAnimationEnd() {
                ubm.this.j(bVar);
            }
        });
    }

    public void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf9c8d0", new Object[]{this});
        } else {
            u();
        }
    }

    public void s(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69ef08c9", new Object[]{this, str, jSONObject});
        } else {
            this.f29277a.f().h(this.f29277a, jSONObject, this.b, this.c);
        }
    }

    public void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24202be5", new Object[]{this});
        } else {
            u();
        }
    }

    public final void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f514e48", new Object[]{this});
            return;
        }
        yam f = this.f29277a.f();
        oe8 oe8Var = this.f29277a;
        T t = this.b;
        f.e(oe8Var, "expose", t.animation, this.c, t, null);
        String str = this.f29277a.j().f().focusComponent;
        if (!TextUtils.isEmpty(str) && str.equals(this.b.id)) {
            this.f29277a.y(new Runnable() { // from class: tb.sbm
                @Override // java.lang.Runnable
                public final void run() {
                    ubm.this.k();
                }
            }, 500L);
        }
    }

    public int v(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d0051e05", new Object[]{this, str})).intValue();
        }
        try {
            return (int) this.f29277a.g().c(this.f29277a.j().e(), a1n.d(this.f29277a, str).floatValue());
        } catch (Throwable unused) {
            return 0;
        }
    }

    public int w(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b973932a", new Object[]{this, str})).intValue();
        }
        try {
            if ("auto".equals(str)) {
                return 0;
            }
            return (int) this.f29277a.g().c(this.f29277a.j().e(), a1n.d(this.f29277a, str).floatValue());
        } catch (Throwable unused) {
            return 0;
        }
    }
}
