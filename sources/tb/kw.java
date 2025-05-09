package tb;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.schedule.ViewProxy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tb.cyc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public abstract class kw implements gyc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public cyc.b f22958a;
    public cyc.a b;
    public View c;
    public j4e d;
    public ViewGroup e;
    public List<jw> f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements mbb<jw, Void> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f22959a;
        public final /* synthetic */ hij b;

        public a(kw kwVar, View view, hij hijVar) {
            this.f22959a = view;
            this.b = hijVar;
        }

        /* renamed from: b */
        public Void a(jw jwVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Void) ipChange.ipc$dispatch("2cdae9a7", new Object[]{this, jwVar});
            }
            jwVar.a(this.f22959a, this.b);
            return null;
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
                kw.this.j(false);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class c implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                kw.this.j(false);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ViewGroup f22962a;
        public final /* synthetic */ ViewGroup b;
        public final /* synthetic */ View c;
        public final /* synthetic */ hij d;

        public d(ViewGroup viewGroup, ViewGroup viewGroup2, View view, hij hijVar) {
            this.f22962a = viewGroup;
            this.b = viewGroup2;
            this.c = view;
            this.d = hijVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f22962a.getLayoutParams();
            kw.this.p(this.b, this.c, this.f22962a, marginLayoutParams, this.d);
            this.f22962a.setLayoutParams(marginLayoutParams);
        }
    }

    static {
        t2o.a(81789327);
        t2o.a(81789332);
    }

    public kw() {
        w();
    }

    public final void A(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2eff5b2", new Object[]{this, viewGroup});
        } else {
            ViewProxy.setOnClickListener(viewGroup.findViewById(r()), new b());
        }
    }

    public final void C(View view, hij hijVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f20628b", new Object[]{this, view, hijVar});
        } else {
            i(new a(this, view, hijVar));
        }
    }

    @Override // tb.gyc
    public final j4e a() {
        j4e j4eVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j4e) ipChange.ipc$dispatch("f1b3ffba", new Object[]{this});
        }
        if (this.d == null) {
            ViewGroup viewGroup = this.e;
            if (viewGroup == null) {
                j4eVar = null;
            } else {
                j4eVar = (j4e) viewGroup.findViewById(u());
            }
            this.d = j4eVar;
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
        x(this.e);
        x(this.c);
    }

    @Override // tb.gyc
    public final View d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("5b0fc03e", new Object[]{this});
        }
        ViewGroup viewGroup = this.e;
        if (viewGroup == null) {
            return null;
        }
        return viewGroup.findViewById(q());
    }

    @Override // tb.gyc
    public void e(cyc.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54b19387", new Object[]{this, bVar});
        } else {
            this.f22958a = bVar;
        }
    }

    @Override // tb.gyc
    public void f(View view, hij hijVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41bcf5c5", new Object[]{this, view, hijVar});
            return;
        }
        this.c = view;
        ViewGroup viewGroup = this.e;
        if (viewGroup == null) {
            viewGroup = ((lw) this).h(view.getContext());
        }
        ViewGroup m = m();
        o(m, view);
        C(view, hijVar);
        n(viewGroup, m, view, hijVar);
        B(a(), hijVar.d(), hijVar);
        z(viewGroup);
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

    public final void i(mbb<jw, Void> mbbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3b8b2bd", new Object[]{this, mbbVar});
            return;
        }
        List<jw> list = this.f;
        if (list != null) {
            Iterator it = ((ArrayList) list).iterator();
            while (it.hasNext()) {
                mbbVar.a((jw) it.next());
            }
        }
    }

    public abstract boolean j(boolean z);

    public final void k(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c631fb0e", new Object[]{this, new Boolean(z)});
            return;
        }
        cyc.b bVar = this.f22958a;
        if (bVar != null) {
            bVar.onDismiss(z);
        }
    }

    public final View l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("ce219891", new Object[]{this});
        }
        return this.c;
    }

    public ViewGroup m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("2338d623", new Object[]{this});
        }
        return (ViewGroup) this.e.findViewById(t());
    }

    public final void n(ViewGroup viewGroup, ViewGroup viewGroup2, View view, hij hijVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44573f08", new Object[]{this, viewGroup, viewGroup2, view, hijVar});
        } else {
            viewGroup2.post(new d(viewGroup2, viewGroup, view, hijVar));
        }
    }

    public final void o(ViewGroup viewGroup, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d631050", new Object[]{this, viewGroup, view});
            return;
        }
        if (view.getLayoutParams() == null) {
            view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        }
        if (-1 == viewGroup.indexOfChild(view)) {
            x(view);
            viewGroup.addView(view);
        }
    }

    public abstract void p(ViewGroup viewGroup, View view, View view2, ViewGroup.MarginLayoutParams marginLayoutParams, hij hijVar);

    public abstract int q();

    public abstract int r();

    public List<jw> s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("d1c69065", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new kij());
        return arrayList;
    }

    public abstract int t();

    public abstract int u();

    public void v(jw jwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb3d9870", new Object[]{this, jwVar});
            return;
        }
        if (this.f == null) {
            this.f = new ArrayList();
        }
        if (!this.f.contains(jwVar)) {
            this.f.add(jwVar);
        }
    }

    public final void w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db4dad24", new Object[]{this});
            return;
        }
        List<jw> s = s();
        if (!bh.a(s)) {
            for (jw jwVar : s) {
                v(jwVar);
            }
        }
    }

    public final void x(View view) {
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

    public final void y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8269457", new Object[]{this});
            return;
        }
        View d2 = d();
        if (d2 != null) {
            ViewProxy.setOnClickListener(d2, new c());
        }
    }

    public final void z(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c26e90ca", new Object[]{this, viewGroup});
            return;
        }
        y();
        A(viewGroup);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void B(tb.j4e r5, java.lang.String r6, tb.hij r7) {
        /*
            r4 = this;
            r0 = 0
            com.android.alibaba.ip.runtime.IpChange r1 = tb.kw.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r2 == 0) goto L_0x001b
            java.lang.String r2 = "a0ed0673"
            r3 = 4
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r0] = r4
            r0 = 1
            r3[r0] = r5
            r5 = 2
            r3[r5] = r6
            r5 = 3
            r3[r5] = r7
            r1.ipc$dispatch(r2, r3)
            return
        L_0x001b:
            boolean r1 = r5 instanceof android.view.View
            if (r1 != 0) goto L_0x0020
            return
        L_0x0020:
            boolean r1 = android.text.TextUtils.isEmpty(r6)
            if (r1 != 0) goto L_0x004a
            int r6 = android.graphics.Color.parseColor(r6)     // Catch: IllegalArgumentException -> 0x002b
            goto L_0x004b
        L_0x002b:
            r6 = move-exception
            tb.rbb r1 = tb.ck.g()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "error="
            r2.<init>(r3)
            java.lang.String r6 = r6.getMessage()
            r2.append(r6)
            java.lang.String r6 = r2.toString()
            java.lang.String r2 = "AbsNUTFloatViewsAssembler"
            java.lang.String r3 = "updateBackgroundColor"
            r1.b(r2, r3, r6)
        L_0x004a:
            r6 = -1
        L_0x004b:
            r1 = r5
            android.view.View r1 = (android.view.View) r1
            r1.setBackgroundColor(r6)
            android.view.ViewGroup r1 = r4.m()
            r1.setBackgroundColor(r6)
            java.lang.Float r6 = r7.h()
            if (r6 != 0) goto L_0x0069
            r6 = 1104674816(0x41d80000, float:27.0)
            int r6 = tb.ai.a(r6)
            float r6 = (float) r6
            r5.setRadius(r6)
            goto L_0x0070
        L_0x0069:
            float r6 = r6.floatValue()
            r5.setRadius(r6)
        L_0x0070:
            android.view.ViewGroup r5 = r4.e
            if (r5 == 0) goto L_0x0100
            int r6 = r4.r()
            android.view.View r5 = r5.findViewById(r6)
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            boolean r6 = r7.k()
            if (r6 == 0) goto L_0x00fb
            r5.setVisibility(r0)
            boolean r6 = r7.l()
            if (r6 == 0) goto L_0x00ba
            int r6 = com.taobao.taobao.R.drawable.aura_float_close
            r5.setImageResource(r6)
            android.view.ViewGroup$LayoutParams r6 = r5.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r6 = (android.widget.FrameLayout.LayoutParams) r6
            r7 = 1105199104(0x41e00000, float:28.0)
            int r1 = tb.ai.a(r7)
            r6.height = r1
            int r7 = tb.ai.a(r7)
            r6.width = r7
            r7 = 1092616192(0x41200000, float:10.0)
            int r1 = tb.ai.a(r7)
            int r7 = tb.ai.a(r7)
            r6.setMargins(r0, r1, r7, r0)
            r5.setLayoutParams(r6)
            r5.setPadding(r0, r0, r0, r0)
            goto L_0x0100
        L_0x00ba:
            int r6 = com.taobao.taobao.R.drawable.umf_floatview_close
            r5.setImageResource(r6)
            android.view.ViewGroup$LayoutParams r6 = r5.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r6 = (android.widget.FrameLayout.LayoutParams) r6
            r7 = 1103101952(0x41c00000, float:24.0)
            int r1 = tb.ai.a(r7)
            r6.height = r1
            int r7 = tb.ai.a(r7)
            r6.width = r7
            r7 = 1101529088(0x41a80000, float:21.0)
            int r7 = tb.ai.a(r7)
            r1 = 1093664768(0x41300000, float:11.0)
            int r1 = tb.ai.a(r1)
            r6.setMargins(r0, r7, r1, r0)
            r5.setLayoutParams(r6)
            r6 = 1085276160(0x40b00000, float:5.5)
            int r7 = tb.ai.a(r6)
            int r0 = tb.ai.a(r6)
            int r1 = tb.ai.a(r6)
            int r6 = tb.ai.a(r6)
            r5.setPadding(r7, r0, r1, r6)
            goto L_0x0100
        L_0x00fb:
            r6 = 8
            r5.setVisibility(r6)
        L_0x0100:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.kw.B(tb.j4e, java.lang.String, tb.hij):void");
    }
}
