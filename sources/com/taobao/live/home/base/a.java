package com.taobao.live.home.base;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alipay.security.mobile.alipayauthenticatorservice.message.Result;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.live.home.base.RecyclerArrayAdapter;
import com.taobao.live.home.dinamic.view.LiveRecyclerFragment;
import com.taobao.schedule.ViewProxy;
import tb.pg1;
import tb.r0h;
import tb.t2o;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class a implements b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final RecyclerArrayAdapter f10941a;
    public final C0577a b;
    public RecyclerArrayAdapter.c c;
    public RecyclerArrayAdapter.d d;
    public RecyclerArrayAdapter.b e;
    public boolean f = false;
    public boolean g = false;
    public boolean h = false;
    public int i = Result.ALIPAY_VERIFY_UNREG_NODE_FAILED;

    /* compiled from: Taobao */
    /* renamed from: com.taobao.live.home.base.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class C0577a implements RecyclerArrayAdapter.a {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final int Hide = 0;
        public static final int ShowError = 2;
        public static final int ShowMore = 1;
        public static final int ShowNoMore = 3;

        /* renamed from: a  reason: collision with root package name */
        public int f10942a = 0;
        public int b = 0;
        public int c = 0;
        public int d = 0;
        public boolean e = false;
        public boolean f = false;

        /* compiled from: Taobao */
        /* renamed from: com.taobao.live.home.base.a$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
        public class RunnableC0578a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public RunnableC0578a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                int c = C0577a.c(C0577a.this);
                if (c == 1) {
                    a.this.l();
                } else if (c == 2) {
                    C0577a aVar = C0577a.this;
                    if (!aVar.e) {
                        a.this.j();
                    }
                    C0577a.this.e = false;
                } else if (c == 3) {
                    C0577a aVar2 = C0577a.this;
                    if (!aVar2.f) {
                        a.this.n();
                    }
                    C0577a.this.f = false;
                }
            }
        }

        /* compiled from: Taobao */
        /* renamed from: com.taobao.live.home.base.a$a$b */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
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
                    a.this.k();
                }
            }
        }

        /* compiled from: Taobao */
        /* renamed from: com.taobao.live.home.base.a$a$c */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
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
                    a.this.i();
                }
            }
        }

        /* compiled from: Taobao */
        /* renamed from: com.taobao.live.home.base.a$a$d */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
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
                    a.this.m();
                }
            }
        }

        static {
            t2o.a(806355332);
            t2o.a(806355345);
        }

        public C0577a() {
        }

        public static /* synthetic */ int c(C0577a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("816afe4d", new Object[]{aVar})).intValue();
            }
            return aVar.d;
        }

        @Override // com.taobao.live.home.base.RecyclerArrayAdapter.a
        public void a(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f9a8504a", new Object[]{this, view});
                return;
            }
            a.d("onBindView");
            view.post(new RunnableC0578a());
        }

        @Override // com.taobao.live.home.base.RecyclerArrayAdapter.a
        public View b(ViewGroup viewGroup) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (View) ipChange.ipc$dispatch("14914f88", new Object[]{this, viewGroup});
            }
            a.d("onCreateView");
            return e(viewGroup);
        }

        public void d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9631f0c9", new Object[]{this});
                return;
            }
            a.d("footer hide");
            this.d = 0;
            if (a.e(a.this).getItemCount() > 0) {
                a.e(a.this).notifyItemChanged(a.e(a.this).getItemCount() - 1);
            }
        }

        public View e(ViewGroup viewGroup) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (View) ipChange.ipc$dispatch("71a01675", new Object[]{this, viewGroup});
            }
            int i = this.d;
            View view = null;
            if (i == 1) {
                if (this.f10942a != 0) {
                    view = LayoutInflater.from(viewGroup.getContext()).inflate(this.f10942a, viewGroup, false);
                }
                if (view != null) {
                    ViewProxy.setOnClickListener(view, new b());
                }
            } else if (i == 2) {
                if (this.c != 0) {
                    view = LayoutInflater.from(viewGroup.getContext()).inflate(this.c, viewGroup, false);
                }
                if (view != null) {
                    ViewProxy.setOnClickListener(view, new c());
                }
            } else if (i == 3) {
                if (this.b != 0) {
                    view = LayoutInflater.from(viewGroup.getContext()).inflate(this.b, viewGroup, false);
                }
                if (view != null) {
                    ViewProxy.setOnClickListener(view, new d());
                }
            }
            if (view == null) {
                return new FrameLayout(viewGroup.getContext());
            }
            return view;
        }

        public void f(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7e0f4267", new Object[]{this, new Integer(i)});
            } else {
                this.c = i;
            }
        }

        public void g(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("db9b88f8", new Object[]{this, new Integer(i)});
            } else {
                this.f10942a = i;
            }
        }

        public void h(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("78692059", new Object[]{this, new Integer(i)});
            } else {
                this.b = i;
            }
        }

        public int hashCode() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
            }
            return this.d + 13589;
        }

        public void i() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ed586412", new Object[]{this});
                return;
            }
            a.d("footer showError");
            this.e = true;
            this.d = 2;
            if (a.e(a.this).getItemCount() > 0) {
                a.e(a.this).notifyItemChanged(a.e(a.this).getItemCount() - 1);
            }
        }

        public void j() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c018ff79", new Object[]{this});
                return;
            }
            a.d("footer showMore");
            this.d = 1;
            if (a.e(a.this).getItemCount() > 0) {
                a.e(a.this).notifyItemChanged(a.e(a.this).getItemCount() - 1);
            }
        }

        public void k() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("96fa0d1a", new Object[]{this});
                return;
            }
            a.d("footer showNoMore");
            this.f = true;
            this.d = 3;
            if (a.e(a.this).getItemCount() > 0) {
                a.e(a.this).notifyItemChanged(a.e(a.this).getItemCount() - 1);
            }
        }
    }

    static {
        t2o.a(806355331);
        t2o.a(806355337);
    }

    public a(RecyclerArrayAdapter recyclerArrayAdapter) {
        this.f10941a = recyclerArrayAdapter;
        C0577a aVar = new C0577a();
        this.b = aVar;
        recyclerArrayAdapter.P(aVar);
    }

    public static /* synthetic */ void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38fae181", new Object[]{str});
        } else {
            h(str);
        }
    }

    public static /* synthetic */ RecyclerArrayAdapter e(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerArrayAdapter) ipChange.ipc$dispatch("e6505826", new Object[]{aVar});
        }
        return aVar.f10941a;
    }

    public static void h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9dd52d5", new Object[]{str});
        } else {
            r0h.a("DefaultEventDelegate", str);
        }
    }

    @Override // com.taobao.live.home.base.b
    public void b(int i, RecyclerArrayAdapter.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11e65544", new Object[]{this, new Integer(i), bVar});
            return;
        }
        this.b.f(i);
        this.e = bVar;
        h("setErrorMore");
    }

    public void f(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df499651", new Object[]{this, new Integer(i)});
            return;
        }
        h("addData " + i);
        if (this.g) {
            if (i == 0) {
                int i2 = this.i;
                if (i2 == 291 || i2 == 260) {
                    this.b.k();
                    this.i = 408;
                }
            } else {
                this.b.j();
                this.i = 260;
            }
        } else if (this.h) {
            this.b.k();
            this.i = 408;
        }
        this.f = false;
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
            return;
        }
        h(pg1.ATOM_EXT_clear);
        this.i = Result.ALIPAY_VERIFY_UNREG_NODE_FAILED;
        this.b.d();
        this.f = false;
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e09ea0", new Object[]{this});
            return;
        }
        RecyclerArrayAdapter.b bVar = this.e;
        if (bVar != null) {
            bVar.b();
        }
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a32a731", new Object[]{this});
            return;
        }
        RecyclerArrayAdapter.b bVar = this.e;
        if (bVar != null) {
            bVar.a();
        }
    }

    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51a88cd5", new Object[]{this});
            return;
        }
        RecyclerArrayAdapter.c cVar = this.c;
        if (cVar != null) {
            cVar.a();
        }
    }

    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("928a6114", new Object[]{this});
            return;
        }
        RecyclerArrayAdapter.d dVar = this.d;
        if (dVar != null) {
            ((LiveRecyclerFragment.c) dVar).a();
        }
    }

    public void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34ccc63d", new Object[]{this});
            return;
        }
        RecyclerArrayAdapter.d dVar = this.d;
        if (dVar != null) {
            ((LiveRecyclerFragment.c) dVar).b();
        }
    }

    @Override // com.taobao.live.home.base.b
    public void a(int i, RecyclerArrayAdapter.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3597d1e3", new Object[]{this, new Integer(i), dVar});
            return;
        }
        this.b.h(i);
        this.d = dVar;
        this.h = true;
        h("setNoMore");
    }

    @Override // com.taobao.live.home.base.b
    public void c(int i, RecyclerArrayAdapter.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1097f6c3", new Object[]{this, new Integer(i), cVar});
            return;
        }
        this.b.g(i);
        this.c = cVar;
        this.g = true;
        if (this.f10941a.U() > 0) {
            f(this.f10941a.U());
        }
        h("setMore");
    }

    public void l() {
        RecyclerArrayAdapter.c cVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85499e5c", new Object[]{this});
            return;
        }
        h("onMoreViewShowed");
        if (!this.f && (cVar = this.c) != null) {
            this.f = true;
            cVar.b();
        }
    }

    public void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad622978", new Object[]{this});
            return;
        }
        h("pauseLoadMore");
        this.b.i();
        this.i = IMediaPlayer.MEDIA_INFO_SEAMLESS_SWITCH_SUCC;
        this.f = false;
    }

    public void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9da15984", new Object[]{this});
            return;
        }
        h("stopLoadMore");
        this.b.k();
        this.i = 408;
        this.f = false;
    }
}
