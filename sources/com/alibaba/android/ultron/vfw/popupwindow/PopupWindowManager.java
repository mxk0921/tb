package com.alibaba.android.ultron.vfw.popupwindow;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.ability.localization.Localization;
import com.alibaba.android.ultron.vfw.adapter.RecyclerViewAdapter;
import com.alibaba.android.ultron.vfw.core.ViewEngine;
import com.alibaba.android.ultron.vfw.viewholder.RecyclerViewHolder;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.schedule.ViewProxy;
import com.taobao.taobao.R;
import java.util.List;
import tb.et6;
import tb.mgw;
import tb.rew;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class PopupWindowManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final float s = 0.6f;

    /* renamed from: a  reason: collision with root package name */
    public et6 f2342a;
    public PopupWindow b;
    public final ViewEngine c;
    public FrameLayout d;
    public LinearLayout e;
    public RecyclerView f;
    public LinearLayout g;
    public ImageView h;
    public RecyclerViewAdapter i;
    public View j;
    public AlphaAnimation k;
    public AlphaAnimation l;
    public TranslateAnimation m;
    public TranslateAnimation n;
    public RelativeLayout o;
    public e p;
    public PopupRecyclerViewLayoutManager q;
    public boolean r = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements Animation.AnimationListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("724c33d", new Object[]{this, animation});
            } else {
                PopupWindowManager.a(PopupWindowManager.this).dismiss();
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8f2883e7", new Object[]{this, animation});
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f2d146c4", new Object[]{this, animation});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
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
            PopupWindowManager.b(PopupWindowManager.this).setEnabled(false);
            PopupWindowManager.this.g(false);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class c implements View.OnKeyListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("bdbaa648", new Object[]{this, view, new Integer(i), keyEvent})).booleanValue();
            }
            if (i == 4 && PopupWindowManager.a(PopupWindowManager.this).isShowing() && !PopupWindowManager.d(PopupWindowManager.this).hasStarted()) {
                PopupWindowManager.this.g(false);
            }
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class d implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                PopupWindowManager.this.g(false);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface e {
        void onCancel();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class f {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final String KEY_BOTTOM_RADIUS = "popupWindowBottomRadius";
        public static final String KEY_TOP_RADIUS = "popupWindowTopRadius";

        /* renamed from: a  reason: collision with root package name */
        public float f2347a;
        public int b;
        public int c = 0;
        public Drawable d;
        public float e;
        public float f;

        static {
            t2o.a(157286705);
        }

        public static /* synthetic */ int a(f fVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("9032699", new Object[]{fVar})).intValue();
            }
            return fVar.b;
        }

        public static /* synthetic */ int b(f fVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("1be0336c", new Object[]{fVar})).intValue();
            }
            fVar.getClass();
            return 0;
        }

        public static /* synthetic */ float c(f fVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("c35c0d2a", new Object[]{fVar})).floatValue();
            }
            return fVar.f2347a;
        }

        public static /* synthetic */ Drawable d(f fVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Drawable) ipChange.ipc$dispatch("a58c8df", new Object[]{fVar});
            }
            return fVar.d;
        }

        public static /* synthetic */ int e(f fVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("1253c0af", new Object[]{fVar})).intValue();
            }
            return fVar.c;
        }

        public static /* synthetic */ float f(f fVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("b9cf9a6d", new Object[]{fVar})).floatValue();
            }
            return fVar.e;
        }

        public static /* synthetic */ float g(f fVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("614b742e", new Object[]{fVar})).floatValue();
            }
            return fVar.f;
        }

        public void h(Drawable drawable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2ebda370", new Object[]{this, drawable});
            } else {
                this.d = drawable;
            }
        }

        public void i(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c44ad488", new Object[]{this, new Integer(i)});
            } else {
                this.b = i;
            }
        }

        public void j(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("258dffb9", new Object[]{this, new Integer(i)});
            } else {
                this.c = i;
            }
        }

        public void k(float f, float f2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("afe57360", new Object[]{this, new Float(f), new Float(f2)});
                return;
            }
            this.e = f;
            this.f = f2;
        }

        public void l(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2aef0d00", new Object[]{this, new Float(f)});
            } else {
                this.f2347a = f;
            }
        }
    }

    static {
        t2o.a(157286698);
    }

    public PopupWindowManager(ViewEngine viewEngine) {
        this.c = viewEngine;
        i();
        f();
        h();
    }

    public static /* synthetic */ PopupWindow a(PopupWindowManager popupWindowManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PopupWindow) ipChange.ipc$dispatch("31a626b0", new Object[]{popupWindowManager});
        }
        return popupWindowManager.b;
    }

    public static /* synthetic */ View b(PopupWindowManager popupWindowManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcc9c1a5", new Object[]{popupWindowManager});
        }
        return popupWindowManager.j;
    }

    public static /* synthetic */ boolean c(PopupWindowManager popupWindowManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("528b9479", new Object[]{popupWindowManager})).booleanValue();
        }
        return popupWindowManager.r;
    }

    public static /* synthetic */ AlphaAnimation d(PopupWindowManager popupWindowManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AlphaAnimation) ipChange.ipc$dispatch("39b877f8", new Object[]{popupWindowManager});
        }
        return popupWindowManager.l;
    }

    public static /* synthetic */ e e(PopupWindowManager popupWindowManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("964124bf", new Object[]{popupWindowManager});
        }
        return popupWindowManager.p;
    }

    public final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f509184", new Object[]{this});
            return;
        }
        ViewProxy.setOnClickListener(this.j, new b());
        this.d.setOnKeyListener(new c());
    }

    public void g(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16f412e3", new Object[]{this, new Boolean(z)});
            return;
        }
        this.r = z;
        this.j.startAnimation(this.l);
        this.o.startAnimation(this.n);
    }

    public final void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de75c2db", new Object[]{this});
            return;
        }
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        this.k = alphaAnimation;
        alphaAnimation.setDuration(200L);
        AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
        this.l = alphaAnimation2;
        alphaAnimation2.setDuration(200L);
        this.l.setAnimationListener(new a());
        TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.0f, 1, 0.0f);
        this.m = translateAnimation;
        translateAnimation.setDuration(200L);
        TranslateAnimation translateAnimation2 = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, 1.0f);
        this.n = translateAnimation2;
        translateAnimation2.setDuration(200L);
    }

    public final void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffd024c5", new Object[]{this});
            return;
        }
        this.d = new FrameLayout(this.c.K());
        View view = new View(this.c.K());
        this.j = view;
        view.setBackgroundColor(Color.parseColor("#7F000000"));
        this.d.addView(this.j);
        RelativeLayout relativeLayout = (RelativeLayout) LayoutInflater.from(this.c.K()).inflate(R.layout.ultron_popop_window, (ViewGroup) this.d, false);
        this.o = relativeLayout;
        relativeLayout.setClickable(true);
        this.e = (LinearLayout) this.o.findViewById(R.id.ultron_popup_header_view);
        this.f = (RecyclerView) this.o.findViewById(R.id.ultron_popup_recycler_view);
        this.g = (LinearLayout) this.o.findViewById(R.id.ultron_popup_footer_view);
        this.h = (ImageView) this.o.findViewById(R.id.ultron_popup_close_button);
        this.d.addView(this.o, new FrameLayout.LayoutParams(-1, (int) (mgw.d(this.c.K()) * s), 80));
        this.d.setFocusable(true);
        this.d.setFocusableInTouchMode(true);
        this.i = new RecyclerViewAdapter(this.c);
        PopupRecyclerViewLayoutManager popupRecyclerViewLayoutManager = new PopupRecyclerViewLayoutManager(this.c.K());
        this.q = popupRecyclerViewLayoutManager;
        popupRecyclerViewLayoutManager.setOrientation(1);
        this.f.setLayoutManager(this.q);
        this.f.setAdapter(this.i);
    }

    public boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d3c33646", new Object[]{this})).booleanValue();
        }
        PopupWindow popupWindow = this.b;
        if (popupWindow == null || !popupWindow.isShowing()) {
            return false;
        }
        return true;
    }

    public final void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6757d664", new Object[]{this});
            return;
        }
        List<IDMComponent> c2 = this.f2342a.c();
        if (c2 == null || c2.size() > 1) {
            this.q.y(true);
        } else {
            this.q.y(false);
        }
        this.i.setData(c2);
        this.i.notifyDataSetChanged();
    }

    public final void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91fe4b1d", new Object[]{this});
            return;
        }
        LinearLayout linearLayout = this.g;
        if (linearLayout != null) {
            if (linearLayout.getChildCount() > 0) {
                this.g.removeAllViews();
            }
            List<IDMComponent> f2 = this.f2342a.f();
            rew rewVar = (rew) this.c.a0(rew.class);
            if (f2 != null && f2.size() > 0) {
                for (IDMComponent iDMComponent : f2) {
                    RecyclerViewHolder c2 = rewVar.c(this.g, rewVar.f(iDMComponent));
                    View view = c2.itemView;
                    if (view != null) {
                        this.g.addView(view);
                    }
                    rewVar.b(c2, iDMComponent);
                }
            }
        }
    }

    public final void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b330af0f", new Object[]{this});
            return;
        }
        LinearLayout linearLayout = this.e;
        if (linearLayout != null) {
            if (linearLayout.getChildCount() > 0) {
                this.e.removeAllViews();
            }
            rew rewVar = (rew) this.c.a0(rew.class);
            List<IDMComponent> h = this.f2342a.h();
            if (h != null && h.size() > 0) {
                for (IDMComponent iDMComponent : h) {
                    RecyclerViewHolder c2 = rewVar.c(this.e, rewVar.f(iDMComponent));
                    View view = c2.itemView;
                    if (view != null) {
                        this.e.addView(view);
                    }
                    rewVar.b(c2, iDMComponent);
                }
            }
        }
    }

    public void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5d00924", new Object[]{this});
        } else {
            this.i.notifyDataSetChanged();
        }
    }

    public void o(et6 et6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ea82aa", new Object[]{this, et6Var});
        } else {
            this.f2342a = et6Var;
        }
    }

    public void p(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e116a3ba", new Object[]{this, eVar});
        } else {
            this.p = eVar;
        }
    }

    public void q(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4346443", new Object[]{this, fVar});
            return;
        }
        if (this.b == null) {
            PopupWindow popupWindow = new PopupWindow(this.c.K());
            this.b = popupWindow;
            popupWindow.setBackgroundDrawable(new ColorDrawable(0));
            this.b.setWidth(-1);
            this.b.setHeight(-1);
            this.b.setInputMethodMode(1);
            this.b.setSoftInputMode(32);
            this.b.setOutsideTouchable(true);
            this.b.setFocusable(true);
        }
        if (fVar != null) {
            if (f.b(fVar) < 0) {
                this.j.setBackgroundColor(f.b(fVar));
            }
            if (f.c(fVar) > 0.0f && f.c(fVar) != s) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.o.getLayoutParams();
                layoutParams.height = (int) (mgw.d(this.c.K()) * f.c(fVar));
                this.o.setLayoutParams(layoutParams);
            }
            if (f.d(fVar) != null) {
                this.h.setVisibility(0);
                this.h.setContentDescription(Localization.q(R.string.app_close));
                this.h.setImageDrawable(f.d(fVar));
                this.h.setOnClickListener(new d());
            } else {
                this.h.setVisibility(8);
            }
            if (f.e(fVar) < 0) {
                this.o.setBackgroundDrawable(mgw.b(f.e(fVar), f.f(fVar), f.g(fVar)));
            }
        }
        this.j.setEnabled(true);
        this.b.setContentView(this.d);
        this.b.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: com.alibaba.android.ultron.vfw.popupwindow.PopupWindowManager.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("cab76ab2", new Object[]{this});
                } else if (PopupWindowManager.e(PopupWindowManager.this) != null && !PopupWindowManager.c(PopupWindowManager.this)) {
                    PopupWindowManager.e(PopupWindowManager.this).onCancel();
                }
            }
        });
        m();
        k();
        l();
        this.j.startAnimation(this.k);
        this.o.startAnimation(this.m);
        this.b.showAtLocation(this.d, f.a(fVar), 0, 0);
    }
}
