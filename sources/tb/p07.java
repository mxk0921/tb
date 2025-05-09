package tb;

import android.view.View;
import android.view.ViewGroup;
import com.alipay.security.mobile.alipayauthenticatorservice.message.Result;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.main.adapter.RecyclerArrayAdapter;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class p07 implements zj8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final RecyclerArrayAdapter f25781a;
    public final a b;
    public RecyclerArrayAdapter.c c;
    public boolean d = false;
    public boolean e = false;
    public boolean f = false;
    public int g = Result.ALIPAY_VERIFY_UNREG_NODE_FAILED;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements RecyclerArrayAdapter.a {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final int Hide = 0;
        public static final int ShowEmpty = 4;
        public static final int ShowEmptyNoData = 5;
        public static final int ShowError = 2;
        public static final int ShowMore = 1;
        public static final int ShowNoMore = 3;

        /* renamed from: a  reason: collision with root package name */
        public View f25782a = null;
        public View b = null;
        public View c = null;
        public View d = null;
        public View e = null;
        public int f = 0;
        public boolean g = false;
        public boolean h = false;

        /* compiled from: Taobao */
        /* renamed from: tb.p07$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class RunnableC1024a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public RunnableC1024a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                int c = a.c(a.this);
                if (c == 1) {
                    p07.this.n();
                } else if (c == 2) {
                    a aVar = a.this;
                    if (!aVar.g) {
                        p07.this.l();
                    }
                    a.this.g = false;
                } else if (c == 3) {
                    a aVar2 = a.this;
                    if (!aVar2.h) {
                        p07.this.p();
                    }
                    a.this.h = false;
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
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
                    p07.this.m();
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
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
                    p07.this.k();
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
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
                    p07.this.o();
                }
            }
        }

        static {
            t2o.a(310378783);
            t2o.a(310378705);
        }

        public a() {
        }

        public static /* synthetic */ int c(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("25ac14f2", new Object[]{aVar})).intValue();
            }
            return aVar.f;
        }

        @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.main.adapter.RecyclerArrayAdapter.a
        public void a(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f9a8504a", new Object[]{this, view});
                return;
            }
            p07.f("onBindView");
            view.post(new RunnableC1024a());
        }

        @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.main.adapter.RecyclerArrayAdapter.a
        public View b(ViewGroup viewGroup) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (View) ipChange.ipc$dispatch("14914f88", new Object[]{this, viewGroup});
            }
            p07.f("onCreateView");
            return e(viewGroup);
        }

        public void d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9631f0c9", new Object[]{this});
                return;
            }
            p07.f("footer hide");
            this.f = 0;
            if (p07.g(p07.this).getItemCount() > 0) {
                p07.g(p07.this).notifyItemChanged(p07.g(p07.this).getItemCount() - 1);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x002d, code lost:
            r3 = r0;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public android.view.View e(android.view.ViewGroup r6) {
            /*
                r5 = this;
                r0 = 1
                r1 = 2
                com.android.alibaba.ip.runtime.IpChange r2 = tb.p07.a.$ipChange
                boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
                if (r3 == 0) goto L_0x0018
                java.lang.String r3 = "71a01675"
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r4 = 0
                r1[r4] = r5
                r1[r0] = r6
                java.lang.Object r6 = r2.ipc$dispatch(r3, r1)
                android.view.View r6 = (android.view.View) r6
                return r6
            L_0x0018:
                int r2 = r5.f
                r3 = 0
                if (r2 == r0) goto L_0x0054
                if (r2 == r1) goto L_0x0044
                r0 = 3
                if (r2 == r0) goto L_0x0034
                r0 = 4
                if (r2 == r0) goto L_0x002f
                r0 = 5
                if (r2 == r0) goto L_0x0029
                goto L_0x0063
            L_0x0029:
                android.view.View r0 = r5.e
                if (r0 == 0) goto L_0x0063
            L_0x002d:
                r3 = r0
                goto L_0x0063
            L_0x002f:
                android.view.View r0 = r5.d
                if (r0 == 0) goto L_0x0063
                goto L_0x002d
            L_0x0034:
                android.view.View r0 = r5.b
                if (r0 == 0) goto L_0x0039
                r3 = r0
            L_0x0039:
                if (r3 == 0) goto L_0x0063
                tb.p07$a$d r0 = new tb.p07$a$d
                r0.<init>()
                com.taobao.schedule.ViewProxy.setOnClickListener(r3, r0)
                goto L_0x0063
            L_0x0044:
                android.view.View r0 = r5.c
                if (r0 == 0) goto L_0x0049
                r3 = r0
            L_0x0049:
                if (r3 == 0) goto L_0x0063
                tb.p07$a$c r0 = new tb.p07$a$c
                r0.<init>()
                com.taobao.schedule.ViewProxy.setOnClickListener(r3, r0)
                goto L_0x0063
            L_0x0054:
                android.view.View r0 = r5.f25782a
                if (r0 == 0) goto L_0x0059
                r3 = r0
            L_0x0059:
                if (r3 == 0) goto L_0x0063
                tb.p07$a$b r0 = new tb.p07$a$b
                r0.<init>()
                com.taobao.schedule.ViewProxy.setOnClickListener(r3, r0)
            L_0x0063:
                if (r3 != 0) goto L_0x006e
                android.widget.FrameLayout r3 = new android.widget.FrameLayout
                android.content.Context r6 = r6.getContext()
                r3.<init>(r6)
            L_0x006e:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: tb.p07.a.e(android.view.ViewGroup):android.view.View");
        }

        public void f(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("25b1b3d0", new Object[]{this, view});
            } else {
                this.e = view;
            }
        }

        public void g(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("30e28f9b", new Object[]{this, view});
            } else {
                this.d = view;
            }
        }

        public void h(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("36812600", new Object[]{this, view});
            } else {
                this.c = view;
            }
        }

        public int hashCode() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
            }
            return this.f + 13589;
        }

        public void i(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("35becb4f", new Object[]{this, view});
            } else {
                this.f25782a = view;
            }
        }

        public void j(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("477565ce", new Object[]{this, view});
            } else {
                this.b = view;
            }
        }

        public void k() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8510ecd7", new Object[]{this});
                return;
            }
            p07.f("footer showEmpty");
            this.h = true;
            this.f = 4;
            if (p07.g(p07.this).getItemCount() > 0) {
                p07.g(p07.this).notifyItemChanged(p07.g(p07.this).getItemCount() - 1);
            }
        }

        public void l() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d3377882", new Object[]{this});
                return;
            }
            p07.f("footer removeLoadMoreView");
            this.h = true;
            this.f = 5;
            if (p07.g(p07.this).getItemCount() > 0) {
                p07.g(p07.this).notifyItemChanged(p07.g(p07.this).getItemCount() - 1);
            }
        }

        public void m() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ed586412", new Object[]{this});
                return;
            }
            p07.f("footer showError");
            this.g = true;
            this.f = 2;
            if (p07.g(p07.this).getItemCount() > 0) {
                p07.g(p07.this).notifyItemChanged(p07.g(p07.this).getItemCount() - 1);
            }
        }

        public void n() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c018ff79", new Object[]{this});
                return;
            }
            p07.f("footer showMore");
            this.f = 1;
            if (p07.g(p07.this).getItemCount() > 0) {
                p07.g(p07.this).notifyItemChanged(p07.g(p07.this).getItemCount() - 1);
            }
        }

        public void o() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("96fa0d1a", new Object[]{this});
                return;
            }
            p07.f("footer showNoMore");
            this.h = true;
            this.f = 3;
            if (p07.g(p07.this).getItemCount() > 0) {
                p07.g(p07.this).notifyItemChanged(p07.g(p07.this).getItemCount() - 1);
            }
        }
    }

    static {
        t2o.a(310378782);
        t2o.a(310378788);
    }

    public p07(RecyclerArrayAdapter recyclerArrayAdapter) {
        this.f25781a = recyclerArrayAdapter;
        a aVar = new a();
        this.b = aVar;
        recyclerArrayAdapter.P(aVar);
    }

    public static /* synthetic */ void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38fae181", new Object[]{str});
        } else {
            j(str);
        }
    }

    public static /* synthetic */ RecyclerArrayAdapter g(p07 p07Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerArrayAdapter) ipChange.ipc$dispatch("8b6ebb72", new Object[]{p07Var});
        }
        return p07Var.f25781a;
    }

    public static void j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9dd52d5", new Object[]{str});
        } else {
            r0h.a("DefaultEventDelegate", str);
        }
    }

    @Override // tb.zj8
    public void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9adede80", new Object[]{this, view});
            return;
        }
        this.b.g(view);
        j("setEmpty");
    }

    @Override // tb.zj8
    public void b(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22ea6535", new Object[]{this, view});
            return;
        }
        this.b.f(view);
        j("setEmptyNoData");
    }

    @Override // tb.zj8
    public void c(View view, RecyclerArrayAdapter.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb8b7b02", new Object[]{this, view, bVar});
            return;
        }
        this.b.h(view);
        j("setErrorMore");
    }

    public void h(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df499651", new Object[]{this, new Integer(i)});
            return;
        }
        j("addData " + i);
        if (this.e) {
            if (i == 0) {
                int i2 = this.g;
                if (i2 == 291 || i2 == 260) {
                    this.b.o();
                    this.g = 408;
                }
            } else {
                this.b.n();
                this.g = 260;
            }
        } else if (this.f) {
            this.b.o();
            this.g = 408;
        }
        this.d = false;
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
            return;
        }
        j(pg1.ATOM_EXT_clear);
        this.g = Result.ALIPAY_VERIFY_UNREG_NODE_FAILED;
        this.b.d();
        this.d = false;
    }

    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e09ea0", new Object[]{this});
        }
    }

    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a32a731", new Object[]{this});
        }
    }

    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51a88cd5", new Object[]{this});
            return;
        }
        RecyclerArrayAdapter.c cVar = this.c;
        if (cVar != null) {
            ((q1b) cVar).a();
        }
    }

    public void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("928a6114", new Object[]{this});
        }
    }

    public void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34ccc63d", new Object[]{this});
        }
    }

    @Override // tb.zj8
    public void d(View view, RecyclerArrayAdapter.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53e9b745", new Object[]{this, view, cVar});
            return;
        }
        this.b.i(view);
        this.c = cVar;
        this.e = true;
        if (this.f25781a.V() > 0) {
            h(this.f25781a.V());
        }
        j("setMore");
    }

    @Override // tb.zj8
    public void e(View view, RecyclerArrayAdapter.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3f7c865", new Object[]{this, view, dVar});
            return;
        }
        this.b.j(view);
        this.f = true;
        j("setNoMore");
    }

    public void n() {
        RecyclerArrayAdapter.c cVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85499e5c", new Object[]{this});
            return;
        }
        j("onMoreViewShowed");
        if (!this.d && (cVar = this.c) != null) {
            this.d = true;
            ((q1b) cVar).b();
        }
    }

    public void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad622978", new Object[]{this});
            return;
        }
        j("pauseLoadMore");
        this.b.m();
        this.g = IMediaPlayer.MEDIA_INFO_SEAMLESS_SWITCH_SUCC;
        this.d = false;
    }

    public void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8510ecd7", new Object[]{this});
            return;
        }
        j("showEmpty");
        this.b.k();
        this.d = false;
    }

    public void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3377882", new Object[]{this});
            return;
        }
        j("showEmpty");
        this.b.l();
        this.d = false;
    }

    public void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9da15984", new Object[]{this});
            return;
        }
        j("stopLoadMore");
        this.b.o();
        this.g = 408;
        this.d = false;
    }
}
