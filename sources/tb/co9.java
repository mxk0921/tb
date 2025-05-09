package tb;

import android.graphics.Color;
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
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.ultron.vfw.adapter.RecyclerViewAdapter;
import com.alibaba.android.ultron.vfw.core.ViewEngine;
import com.alibaba.android.ultron.vfw.popupwindow.PopupRecyclerViewLayoutManager;
import com.alibaba.android.ultron.vfw.popupwindow.PopupWindowManager;
import com.alibaba.android.ultron.vfw.viewholder.RecyclerViewHolder;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.datamodel.imp.ParseModule;
import com.taobao.schedule.ViewProxy;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class co9 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final float m = 0.6f;

    /* renamed from: a  reason: collision with root package name */
    public et6 f17195a;
    public final ViewEngine b;
    public FrameLayout c;
    public LinearLayout d;
    public RecyclerView e;
    public LinearLayout f;
    public RecyclerViewAdapter g;
    public View h;
    public AlphaAnimation i;
    public TranslateAnimation j;
    public RelativeLayout k;
    public PopupRecyclerViewLayoutManager l;

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
                return;
            }
            if (co9.a(co9.this) != null) {
                co9.a(co9.this).removeAllViews();
            }
            if (co9.b(co9.this) != null) {
                co9.b(co9.this).onCancel();
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
            co9.c(co9.this).setEnabled(false);
            co9.this.e(false);
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
            co9.this.e(false);
            return false;
        }
    }

    static {
        t2o.a(155189358);
    }

    public co9(ViewEngine viewEngine) {
        this.b = viewEngine;
        g();
        d();
        f();
    }

    public static /* synthetic */ ViewGroup a(co9 co9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("29160bcf", new Object[]{co9Var});
        }
        co9Var.getClass();
        return null;
    }

    public static /* synthetic */ PopupWindowManager.e b(co9 co9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PopupWindowManager.e) ipChange.ipc$dispatch("62cfb875", new Object[]{co9Var});
        }
        co9Var.getClass();
        return null;
    }

    public static /* synthetic */ View c(co9 co9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("1d5e2806", new Object[]{co9Var});
        }
        return co9Var.h;
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f509184", new Object[]{this});
            return;
        }
        ViewProxy.setOnClickListener(this.h, new b());
        this.c.setOnKeyListener(new c());
    }

    public void e(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16f412e3", new Object[]{this, new Boolean(z)});
            return;
        }
        this.h.startAnimation(this.i);
        this.k.startAnimation(this.j);
    }

    public final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de75c2db", new Object[]{this});
            return;
        }
        new AlphaAnimation(0.0f, 1.0f).setDuration(200L);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        this.i = alphaAnimation;
        alphaAnimation.setDuration(200L);
        this.i.setAnimationListener(new a());
        new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.0f, 1, 0.0f).setDuration(200L);
        TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, 1.0f);
        this.j = translateAnimation;
        translateAnimation.setDuration(200L);
    }

    public final void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffd024c5", new Object[]{this});
            return;
        }
        this.c = new FrameLayout(this.b.K());
        View view = new View(this.b.K());
        this.h = view;
        view.setBackgroundColor(Color.parseColor("#7F000000"));
        this.c.addView(this.h);
        RelativeLayout relativeLayout = (RelativeLayout) LayoutInflater.from(this.b.K()).inflate(R.layout.ultron_popop_window, (ViewGroup) this.c, false);
        this.k = relativeLayout;
        relativeLayout.setClickable(true);
        this.d = (LinearLayout) this.k.findViewById(R.id.ultron_popup_header_view);
        this.e = (RecyclerView) this.k.findViewById(R.id.ultron_popup_recycler_view);
        this.f = (LinearLayout) this.k.findViewById(R.id.ultron_popup_footer_view);
        ImageView imageView = (ImageView) this.k.findViewById(R.id.ultron_popup_close_button);
        this.c.addView(this.k, new FrameLayout.LayoutParams(-1, (int) (mgw.d(this.b.K()) * m), 80));
        this.c.setFocusable(true);
        this.c.setFocusableInTouchMode(true);
        this.g = new RecyclerViewAdapter(this.b);
        PopupRecyclerViewLayoutManager popupRecyclerViewLayoutManager = new PopupRecyclerViewLayoutManager(this.b.K());
        this.l = popupRecyclerViewLayoutManager;
        popupRecyclerViewLayoutManager.setOrientation(1);
        this.e.setLayoutManager(this.l);
        this.e.setAdapter(this.g);
    }

    public boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d3c33646", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public final void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6757d664", new Object[]{this});
            return;
        }
        List<IDMComponent> c2 = this.f17195a.c();
        if (c2 == null || c2.size() > 1) {
            this.l.y(true);
        } else {
            this.l.y(false);
        }
        this.g.setData(c2);
        this.g.notifyDataSetChanged();
    }

    public final void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91fe4b1d", new Object[]{this});
            return;
        }
        LinearLayout linearLayout = this.f;
        if (linearLayout != null) {
            if (linearLayout.getChildCount() > 0) {
                this.f.removeAllViews();
            }
            List<IDMComponent> f = this.f17195a.f();
            rew rewVar = (rew) this.b.a0(rew.class);
            if (f != null && f.size() > 0) {
                for (IDMComponent iDMComponent : f) {
                    RecyclerViewHolder c2 = rewVar.c(this.f, rewVar.f(iDMComponent));
                    View view = c2.itemView;
                    if (view != null) {
                        this.f.addView(view);
                    }
                    rewVar.b(c2, iDMComponent);
                }
            }
        }
    }

    public final void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b330af0f", new Object[]{this});
            return;
        }
        LinearLayout linearLayout = this.d;
        if (linearLayout != null) {
            if (linearLayout.getChildCount() > 0) {
                this.d.removeAllViews();
            }
            rew rewVar = (rew) this.b.a0(rew.class);
            List<IDMComponent> h = this.f17195a.h();
            if (h != null && h.size() > 0) {
                for (IDMComponent iDMComponent : h) {
                    RecyclerViewHolder c2 = rewVar.c(this.d, rewVar.f(iDMComponent));
                    View view = c2.itemView;
                    if (view != null) {
                        this.d.addView(view);
                    }
                    rewVar.b(c2, iDMComponent);
                }
            }
        }
    }

    public void l(fsb fsbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4848101e", new Object[]{this, fsbVar});
        } else if (fsbVar != null) {
            List<IDMComponent> a2 = this.f17195a.a();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            for (IDMComponent iDMComponent : a2) {
                IDMComponent componentByName = fsbVar.getComponentByName(iDMComponent.getKey());
                String h = ParseModule.h(componentByName);
                if ("footer".equals(h)) {
                    arrayList.add(componentByName);
                } else if ("header".equals(h)) {
                    arrayList3.add(componentByName);
                } else {
                    arrayList2.add(componentByName);
                }
            }
            et6 et6Var = new et6();
            et6Var.l(arrayList2);
            et6Var.q(arrayList3);
            et6Var.o(arrayList);
            m(et6Var);
            k();
            i();
            j();
            this.g.notifyDataSetChanged();
        }
    }

    public void m(et6 et6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ea82aa", new Object[]{this, et6Var});
        } else {
            this.f17195a = et6Var;
        }
    }
}
