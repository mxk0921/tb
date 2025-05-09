package com.taobao.android.sku.presenter;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SimpleItemAnimator;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.sku.pad.PadSkuFrameLayout;
import com.taobao.android.sku.presenter.AliXSkuPresenterEngine;
import com.taobao.android.sku.utils.SkuLogUtils;
import com.taobao.android.sku.widget.HeightMutableFrameLayout;
import com.taobao.schedule.ViewProxy;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tb.all;
import tb.nfb;
import tb.o2q;
import tb.s2q;
import tb.t2o;
import tb.xv6;
import tb.yv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class a extends yv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f9452a;
    public View b;
    public View c;
    public View d;
    public final s2q e;
    public PadSkuFrameLayout f;
    public HeightMutableFrameLayout g;
    public TextView h;
    public TextView i;
    public View j;
    public j k;
    public View m;
    public View.OnClickListener p;
    public View.OnClickListener q;
    public final List<nfb> l = new ArrayList();
    public int n = R.style.Alix_Sku_PopupDialog;
    public int o = R.style.Alix_Sku_PopupDialog_Animation;

    /* compiled from: Taobao */
    /* renamed from: com.taobao.android.sku.presenter.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class View$OnClickListenerC0486a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public View$OnClickListenerC0486a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else if (a.m(a.this) != null) {
                a.m(a.this).onClick(view);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b(a aVar) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class c implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else if (a.this.e.c()) {
                a.this.e.a();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class d implements View.OnLongClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("7edba102", new Object[]{this, view})).booleanValue();
            }
            a.this.getClass();
            a.this.i.setTextColor(2147418112);
            a.this.i.setText("D_Replay");
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class e implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else if (a.n(a.this) != null) {
                a.n(a.this).onClick(view);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class f implements nfb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        @Override // tb.nfb
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c4ac0136", new Object[]{this});
            } else {
                a.this.q();
            }
        }

        @Override // tb.nfb
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c52bc43b", new Object[]{this});
            } else {
                a.this.p();
            }
        }

        @Override // tb.nfb
        public void d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("14d14ca7", new Object[]{this});
            } else {
                a.this.r();
            }
        }

        @Override // tb.nfb
        public void e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d643270b", new Object[]{this});
            } else {
                a.this.s();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class g implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public g(a aVar) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class h implements View.OnLongClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public h(a aVar) {
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
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class i implements DialogInterface.OnDismissListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public i() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7c9109f4", new Object[]{this, dialogInterface});
                return;
            }
            a aVar = a.this;
            j jVar = aVar.k;
            if (jVar != null) {
                jVar.a(aVar);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface j {
        void a(a aVar);
    }

    static {
        t2o.a(442499230);
    }

    public a(Context context) {
        this.f9452a = context;
        this.e = new s2q(context);
        v();
        xv6.a(context);
        w();
        y();
        u();
        x();
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        if (str.hashCode() == -976285502) {
            super.j((Map) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/sku/presenter/AliXSkuPopupPresenter");
    }

    public static /* synthetic */ View.OnClickListener m(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View.OnClickListener) ipChange.ipc$dispatch("e23ccc5c", new Object[]{aVar});
        }
        return aVar.p;
    }

    public static /* synthetic */ View.OnClickListener n(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View.OnClickListener) ipChange.ipc$dispatch("11f4005d", new Object[]{aVar});
        }
        return aVar.q;
    }

    public void A(a aVar) {
        List<nfb> list;
        List<nfb> list2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5960ecfa", new Object[]{this, aVar});
        } else if (aVar != null && aVar != this && (list = aVar.l) != null && !((ArrayList) list).isEmpty() && (list2 = this.l) != null && ((ArrayList) list2).isEmpty()) {
            ((ArrayList) this.l).addAll(aVar.l);
            ((ArrayList) aVar.l).clear();
        }
    }

    public a B(AliXSkuPresenterEngine.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("ac706c05", new Object[]{this, bVar});
        }
        this.e.f(bVar);
        return this;
    }

    public a C(j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("65f471cd", new Object[]{this, jVar});
        }
        this.k = jVar;
        return this;
    }

    public void D(View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("778d93dc", new Object[]{this, onClickListener});
        } else {
            this.q = onClickListener;
        }
    }

    public a E(View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("e65676c3", new Object[]{this, onClickListener});
        }
        this.p = onClickListener;
        return this;
    }

    public void F(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dee22c48", new Object[]{this, new Integer(i2)});
        } else {
            this.n = i2;
        }
    }

    public final void G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25ccb913", new Object[]{this});
            return;
        }
        View view = this.b;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.b);
            }
        }
    }

    public a H(AliXSkuPresenterEngine.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("98626835", new Object[]{this, cVar});
        }
        this.e.j(cVar);
        return this;
    }

    @Override // tb.mfb
    public LinearLayout a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinearLayout) ipChange.ipc$dispatch("cc881026", new Object[]{this});
        }
        return (LinearLayout) this.b.findViewById(R.id.header);
    }

    @Override // tb.mfb
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6ec27c2", new Object[]{this});
            return;
        }
        Context context = this.f9452a;
        if (context != null) {
            if (context instanceof Activity) {
                Activity activity = (Activity) context;
                if (activity.isFinishing() || activity.isDestroyed()) {
                    return;
                }
            }
            if (!this.e.c()) {
                G();
                this.e.h(this.n);
                this.e.e(this.b);
                this.e.b(-1, -1, 80, 0, 0, this.o);
                try {
                    this.e.i();
                } catch (Throwable th) {
                    SkuLogUtils.a(SkuLogUtils.DEFAULT_BIZ_NAME, SkuLogUtils.UM_SHOW_PRESENTER_E, "showError: " + th.toString());
                }
                this.e.g(new i());
            }
        }
    }

    @Override // tb.mfb
    public LinearLayout c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinearLayout) ipChange.ipc$dispatch("8fb1f434", new Object[]{this});
        }
        return (LinearLayout) this.b.findViewById(R.id.footer);
    }

    @Override // tb.yv
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c142d9", new Object[]{this});
            return;
        }
        View view = this.c;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    @Override // tb.mfb
    public void dismiss() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae28e211", new Object[]{this});
        } else if (this.e.c()) {
            try {
                this.e.a();
            } catch (Throwable unused) {
            }
        }
    }

    @Override // tb.yv
    public LinearLayout e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinearLayout) ipChange.ipc$dispatch("2e988d59", new Object[]{this});
        }
        return (LinearLayout) this.b.findViewById(R.id.h5_content_view);
    }

    @Override // tb.yv
    public LinearLayout f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinearLayout) ipChange.ipc$dispatch("87e9aacf", new Object[]{this});
        }
        return (LinearLayout) this.b.findViewById(R.id.native_content_view);
    }

    @Override // tb.yv
    public LinearLayout g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinearLayout) ipChange.ipc$dispatch("634b76b8", new Object[]{this});
        }
        return (LinearLayout) this.b.findViewById(R.id.sku3_content_view);
    }

    @Override // tb.mfb
    public RecyclerView getBodyView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView) ipChange.ipc$dispatch("7ca0580b", new Object[]{this});
        }
        RecyclerView recyclerView = (RecyclerView) this.b.findViewById(R.id.body);
        t(recyclerView);
        return recyclerView;
    }

    @Override // tb.yv
    public LinearLayout h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinearLayout) ipChange.ipc$dispatch("67d49725", new Object[]{this});
        }
        return (LinearLayout) this.b.findViewById(R.id.weex_content_view);
    }

    @Override // tb.yv
    public boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ebb2a389", new Object[]{this})).booleanValue();
        }
        return this.e.c();
    }

    @Override // tb.yv
    public void j(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5cf10c2", new Object[]{this, map});
            return;
        }
        super.j(map);
        if (map != null && !map.isEmpty() && map.containsKey("engineType")) {
            this.h.setText(map.get("engineType"));
        }
    }

    @Override // tb.yv
    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2666408", new Object[]{this});
            return;
        }
        View view = this.c;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    @Override // tb.yv
    public void l(nfb nfbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8024808", new Object[]{this, nfbVar});
        } else if (nfbVar != null) {
            ((ArrayList) this.l).add(nfbVar);
        }
    }

    public void o(float f2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("194124cc", new Object[]{this, new Float(f2), new Boolean(z)});
            return;
        }
        HeightMutableFrameLayout heightMutableFrameLayout = this.g;
        if (heightMutableFrameLayout != null) {
            heightMutableFrameLayout.shrinkHeight(f2, z);
            return;
        }
        PadSkuFrameLayout padSkuFrameLayout = this.f;
        if (padSkuFrameLayout != null) {
            padSkuFrameLayout.shrinkHeight(f2, z);
        }
    }

    public void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("734897b9", new Object[]{this});
            return;
        }
        Iterator it = ((ArrayList) this.l).iterator();
        while (it.hasNext()) {
            ((nfb) it.next()).c();
        }
    }

    public void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da299d78", new Object[]{this});
            return;
        }
        Iterator it = ((ArrayList) this.l).iterator();
        while (it.hasNext()) {
            ((nfb) it.next()).a();
        }
    }

    public void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2ee2025", new Object[]{this});
            return;
        }
        Iterator it = ((ArrayList) this.l).iterator();
        while (it.hasNext()) {
            ((nfb) it.next()).d();
        }
    }

    public void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d39eebcd", new Object[]{this});
            return;
        }
        Iterator it = ((ArrayList) this.l).iterator();
        while (it.hasNext()) {
            ((nfb) it.next()).e();
        }
    }

    public void t(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56490c60", new Object[]{this, recyclerView});
            return;
        }
        try {
            recyclerView.getItemAnimator().setAddDuration(0L);
            recyclerView.getItemAnimator().setChangeDuration(0L);
            recyclerView.getItemAnimator().setMoveDuration(0L);
            recyclerView.getItemAnimator().setRemoveDuration(0L);
            ((SimpleItemAnimator) recyclerView.getItemAnimator()).setSupportsChangeAnimations(false);
        } catch (Throwable unused) {
        }
    }

    public final void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec87d659", new Object[]{this});
        } else {
            getBodyView().setLayoutManager(new LinearLayoutManager(this.f9452a));
        }
    }

    public void v() {
        int i2;
        HeightMutableFrameLayout heightMutableFrameLayout;
        int i3 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95bdc386", new Object[]{this});
            return;
        }
        all allVar = all.INSTANCE;
        if (allVar.f(this.f9452a)) {
            i2 = R.layout.xsku_layout_pad;
        } else {
            i2 = R.layout.xsku_layout;
        }
        View inflate = LayoutInflater.from(this.f9452a).inflate(i2, (ViewGroup) null);
        this.b = inflate;
        this.c = inflate.findViewById(R.id.alix_loading_container);
        this.d = this.b.findViewById(R.id.fm_sku_content);
        View view = this.c;
        if (o2q.e()) {
            i3 = 8;
        }
        view.setVisibility(i3);
        if (!allVar.f(this.f9452a)) {
            this.m = this.b.findViewById(R.id.view_top_empty_holder);
            HeightMutableFrameLayout heightMutableFrameLayout2 = (HeightMutableFrameLayout) this.b.findViewById(R.id.content_container);
            this.g = heightMutableFrameLayout2;
            heightMutableFrameLayout2.setRelationView(this.m);
            heightMutableFrameLayout = this.g;
        } else {
            PadSkuFrameLayout padSkuFrameLayout = (PadSkuFrameLayout) this.b.findViewById(R.id.content_container);
            this.f = padSkuFrameLayout;
            heightMutableFrameLayout = padSkuFrameLayout;
        }
        ViewProxy.setOnClickListener(this.b, new View$OnClickListenerC0486a());
        ViewProxy.setOnClickListener(heightMutableFrameLayout, new b(this));
        E(new c());
    }

    public final void w() {
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4c45e78", new Object[]{this});
            return;
        }
        View findViewById = this.b.findViewById(R.id.debug_container);
        this.j = findViewById;
        if (!xv6.b()) {
            i2 = 8;
        }
        findViewById.setVisibility(i2);
        this.i = (TextView) this.b.findViewById(R.id.tv_auto_test);
        this.h = (TextView) this.b.findViewById(R.id.tv_js_engine);
        this.i.setOnLongClickListener(new d());
        ((TextView) this.b.findViewById(R.id.tv_downgrade)).setOnClickListener(new e());
    }

    public final void x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8876706b", new Object[]{this});
        } else {
            this.e.d(new f());
        }
    }

    public final void y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e0ce093", new Object[]{this});
            return;
        }
        ViewProxy.setOnClickListener(this.c, new g(this));
        ViewProxy.setOnLongClickListener(this.c, new h(this));
    }

    public void z(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80b58854", new Object[]{this, new Integer(i2)});
        } else {
            this.o = i2;
        }
    }
}
