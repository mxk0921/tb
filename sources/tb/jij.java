package tb;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentContainer;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentData;
import com.alibaba.android.aura.service.render.widget.roundcornerlayout.UMFRoundCornerLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.schedule.ViewProxy;
import com.taobao.taobao.R;
import tb.cyc;
import tb.eij;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class jij implements gyc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public cyc.b f22009a;
    public cyc.a b;
    public View c;
    public UMFRoundCornerLayout d;
    public FrameLayout e;
    public ImageView f;
    public FrameLayout g;
    public View h;
    public Context i;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                jij.i(jij.this);
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
            } else {
                jij.i(jij.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class c implements eij.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f22012a;

        public c(int i) {
            this.f22012a = i;
        }

        public final void a(float f, float f2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b37d6273", new Object[]{this, new Float(f), new Float(f2)});
                return;
            }
            View d = jij.this.d();
            if (d != null) {
                Drawable background = d.getBackground();
                background.mutate();
                if (f2 == 0.0f) {
                    background.setAlpha(255);
                } else {
                    background.setAlpha(Math.min(255, Math.max(0, (int) ((1.0f - Math.abs(f2 / f)) * 255))));
                }
            }
        }

        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e155e360", new Object[]{this});
            } else if ((jij.j(jij.this) == null || !jij.j(jij.this).onClose()) && jij.k(jij.this) != null) {
                jij.k(jij.this).onDismiss(true);
            }
        }

        public void c(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5397c47", new Object[]{this, new Float(f)});
            } else {
                a(this.f22012a, f);
            }
        }
    }

    static {
        t2o.a(81789316);
        t2o.a(81789332);
    }

    public static /* synthetic */ void i(jij jijVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8450635", new Object[]{jijVar});
        } else {
            jijVar.l();
        }
    }

    public static /* synthetic */ cyc.a j(jij jijVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cyc.a) ipChange.ipc$dispatch("6d942388", new Object[]{jijVar});
        }
        return jijVar.b;
    }

    public static /* synthetic */ cyc.b k(jij jijVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cyc.b) ipChange.ipc$dispatch("16cff402", new Object[]{jijVar});
        }
        return jijVar.f22009a;
    }

    @Override // tb.gyc
    public j4e a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j4e) ipChange.ipc$dispatch("f1b3ffba", new Object[]{this});
        }
        return this.d;
    }

    @Override // tb.gyc
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c451c32", new Object[]{this});
            return;
        }
        o(this.e);
        o(this.h);
    }

    @Override // tb.gyc
    public void c(hij hijVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b7c4307", new Object[]{this, hijVar});
        } else {
            t(hijVar);
        }
    }

    @Override // tb.gyc
    public View d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("5b0fc03e", new Object[]{this});
        }
        return this.c;
    }

    @Override // tb.gyc
    public void e(cyc.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54b19387", new Object[]{this, bVar});
        } else {
            this.f22009a = bVar;
        }
    }

    @Override // tb.gyc
    public void f(View view, hij hijVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41bcf5c5", new Object[]{this, view, hijVar});
            return;
        }
        this.h = view;
        n(view, hijVar);
        if (this.e == null) {
            h(view.getContext());
        }
        m(view, hijVar);
        t(hijVar);
        q();
        s();
    }

    @Override // tb.gyc
    public void g(cyc.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e37b2d", new Object[]{this, aVar});
        } else {
            this.b = aVar;
        }
    }

    @Override // tb.gyc
    public ViewGroup h(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("9199c18e", new Object[]{this, context});
        }
        this.i = context;
        FrameLayout frameLayout = this.e;
        if (frameLayout == null) {
            FrameLayout frameLayout2 = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.umf_float_view_layout, (ViewGroup) null);
            this.e = frameLayout2;
            this.c = frameLayout2.findViewById(R.id.umfFloatViewLayoutBackgroundMask);
            this.d = (UMFRoundCornerLayout) this.e.findViewById(R.id.umfFloatViewLayoutContentWrapper);
            this.f = (ImageView) this.e.findViewById(R.id.umfFloatViewLayoutClose);
            this.g = (FrameLayout) this.e.findViewById(R.id.umfFloatViewLayoutContentPlaceholder);
            this.e.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        } else {
            o(frameLayout);
        }
        return this.e;
    }

    public final void l() {
        cyc.b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58a3e50a", new Object[]{this});
            return;
        }
        cyc.a aVar = this.b;
        if ((aVar == null || !aVar.onClose()) && (bVar = this.f22009a) != null) {
            bVar.onDismiss(false);
        }
    }

    public final void m(View view, hij hijVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8877a308", new Object[]{this, view, hijVar});
            return;
        }
        if (view.getLayoutParams() == null) {
            view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        }
        FrameLayout frameLayout = this.g;
        if (frameLayout != null && -1 == frameLayout.indexOfChild(view)) {
            o(view);
            this.g.addView(view);
        }
    }

    public final void n(View view, hij hijVar) {
        AURARenderComponent aURARenderComponent;
        AURARenderComponentData aURARenderComponentData;
        AURARenderComponentContainer aURARenderComponentContainer;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ea86ad1", new Object[]{this, view, hijVar});
        } else if (view instanceof RecyclerView) {
            RecyclerView.Adapter adapter = ((RecyclerView) view).getAdapter();
            if (adapter instanceof e4e) {
                aURARenderComponent = ((e4e) adapter).a(0);
            } else if (adapter instanceof mcb) {
                aURARenderComponent = ((mcb) adapter).a(0);
            } else {
                aURARenderComponent = null;
            }
            if (!(aURARenderComponent == null || (aURARenderComponentData = aURARenderComponent.data) == null || (aURARenderComponentContainer = aURARenderComponentData.container) == null || !dm.b.equals(aURARenderComponentContainer.containerType))) {
                z = true;
            }
            if (1 == adapter.getItemCount() && z) {
                hijVar.v(0.0f);
            }
        }
    }

    public final void o(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1b0912e", new Object[]{this, view});
        } else if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeViewInLayout(view);
            }
        }
    }

    @Override // tb.gyc
    public boolean onBackPressed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88afc67", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public final void p(View view, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e17f77a", new Object[]{this, view, str, new Integer(i)});
        } else if (view != null) {
            if (!TextUtils.isEmpty(str)) {
                try {
                    i = Color.parseColor(str);
                } catch (IllegalArgumentException e) {
                    b4e a2 = dxu.a();
                    a2.e("NUTFloatViewsAssembler", "updateBackgroundColor#error=" + e.getMessage());
                }
            }
            view.setBackgroundColor(i);
        }
    }

    public final void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3cca302f", new Object[]{this});
        } else {
            ViewProxy.setOnClickListener(this.c, new b());
        }
    }

    public final void r(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd7ee348", new Object[]{this, new Boolean(z), new Boolean(z2)});
        } else if (z) {
            this.f.setVisibility(0);
            if (z2) {
                this.f.setImageResource(R.drawable.aura_float_close);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f.getLayoutParams();
                layoutParams.height = ai.a(28.0f);
                layoutParams.width = ai.a(28.0f);
                layoutParams.setMargins(0, ai.a(10.0f), ai.a(10.0f), 0);
                this.f.setLayoutParams(layoutParams);
                this.f.setPadding(0, 0, 0, 0);
                return;
            }
            this.f.setImageResource(R.drawable.umf_floatview_close);
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f.getLayoutParams();
            layoutParams2.height = ai.a(24.0f);
            layoutParams2.width = ai.a(24.0f);
            layoutParams2.setMargins(0, ai.a(21.0f), ai.a(11.0f), 0);
            this.f.setLayoutParams(layoutParams2);
            this.f.setPadding(ai.a(5.5f), ai.a(5.5f), ai.a(5.5f), ai.a(5.5f));
        } else {
            this.f.setVisibility(8);
        }
    }

    public final void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8eb0f47b", new Object[]{this});
        } else {
            this.f.setOnClickListener(new a());
        }
    }

    public final void t(hij hijVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f44a044d", new Object[]{this, hijVar});
            return;
        }
        Float h = hijVar.h();
        if (h == null) {
            this.d.setRadius(ai.a(27.0f));
        } else {
            this.d.setRadius(h.floatValue());
        }
        v(this.d, hijVar.f());
        u(this.d);
        p(this.d, hijVar.d(), -1);
        r(hijVar.k(), hijVar.l());
    }

    public final void u(UMFRoundCornerLayout uMFRoundCornerLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e262b6fc", new Object[]{this, uMFRoundCornerLayout});
        } else if (!xh.b(this.i) || xh.c(this.i)) {
            uMFRoundCornerLayout.setGestureHandler(null);
        } else {
            eij eijVar = new eij();
            int i = uMFRoundCornerLayout.getLayoutParams().width;
            eijVar.g(i, i);
            eijVar.e(new c(i));
            uMFRoundCornerLayout.setGestureHandler(eijVar);
        }
    }

    public final void v(View view, iij iijVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c59a920a", new Object[]{this, view, iijVar});
        } else if (iijVar != null && view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                b4e a2 = dxu.a();
                a2.e("NUTFloatViewsAssembler", "updateLayoutParamsMargins#layoutParams of view[" + view.getClass().getSimpleName() + "]is not ViewGroup.MarginLayoutParams");
                return;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (iijVar.f() != 0) {
                marginLayoutParams.width = iijVar.f();
            }
            if (marginLayoutParams.topMargin != iijVar.e() || marginLayoutParams.leftMargin != iijVar.c() || marginLayoutParams.bottomMargin != iijVar.b() || marginLayoutParams.rightMargin != iijVar.d()) {
                marginLayoutParams.topMargin = iijVar.e();
                marginLayoutParams.bottomMargin = iijVar.b();
                marginLayoutParams.leftMargin = iijVar.c();
                marginLayoutParams.rightMargin = iijVar.d();
            }
        }
    }
}
