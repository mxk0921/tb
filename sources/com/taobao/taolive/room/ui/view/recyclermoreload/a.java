package com.taobao.taolive.room.ui.view.recyclermoreload;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.schedule.ViewProxy;
import com.taobao.taolive.room.ui.view.recyclermoreload.RecyclerArrayAdapter;
import tb.t2o;
import tb.x5t;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* renamed from: com.taobao.taolive.room.ui.view.recyclermoreload.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class C0757a implements RecyclerArrayAdapter.a {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final int Hide = 0;
        public static final int ShowError = 2;
        public static final int ShowMore = 1;
        public static final int ShowNoMore = 3;

        /* renamed from: a  reason: collision with root package name */
        private View f13261a = null;
        private View b = null;
        private View c = null;
        private int d = 0;
        private int e = 0;
        private int f = 0;
        private int g = 0;
        public boolean h = false;
        public boolean i = false;
        public final /* synthetic */ a j;

        /* compiled from: Taobao */
        /* renamed from: com.taobao.taolive.room.ui.view.recyclermoreload.a$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
        public class RunnableC0758a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public RunnableC0758a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                int c = C0757a.c(C0757a.this);
                if (c == 1) {
                    C0757a.this.getClass();
                    throw null;
                } else if (c == 2) {
                    C0757a aVar = C0757a.this;
                    if (aVar.h) {
                        aVar.h = false;
                        return;
                    }
                    throw null;
                } else if (c == 3) {
                    C0757a aVar2 = C0757a.this;
                    if (aVar2.i) {
                        aVar2.i = false;
                        return;
                    }
                    throw null;
                }
            }
        }

        /* compiled from: Taobao */
        /* renamed from: com.taobao.taolive.room.ui.view.recyclermoreload.a$a$b */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
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
                    C0757a.this.getClass();
                    throw null;
                }
            }
        }

        /* compiled from: Taobao */
        /* renamed from: com.taobao.taolive.room.ui.view.recyclermoreload.a$a$c */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
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
                    C0757a.this.getClass();
                    throw null;
                }
            }
        }

        /* compiled from: Taobao */
        /* renamed from: com.taobao.taolive.room.ui.view.recyclermoreload.a$a$d */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
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
                    C0757a.this.getClass();
                    throw null;
                }
            }
        }

        static {
            t2o.a(779093302);
            t2o.a(779093315);
        }

        public C0757a(a aVar) {
        }

        public static /* synthetic */ int c(C0757a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("afa9a727", new Object[]{aVar})).intValue();
            }
            return aVar.g;
        }

        @Override // com.taobao.taolive.room.ui.view.recyclermoreload.RecyclerArrayAdapter.a
        public void a(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f9a8504a", new Object[]{this, view});
                return;
            }
            a.a("onBindView");
            view.post(new RunnableC0758a());
        }

        @Override // com.taobao.taolive.room.ui.view.recyclermoreload.RecyclerArrayAdapter.a
        public View b(ViewGroup viewGroup) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (View) ipChange.ipc$dispatch("14914f88", new Object[]{this, viewGroup});
            }
            a.a("onCreateView");
            return e(viewGroup);
        }

        public void d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9631f0c9", new Object[]{this});
                return;
            }
            a.a("footer hide");
            this.g = 0;
            if (a.b(null).getItemCount() > 0) {
                a.b(null).notifyItemChanged(a.b(null).getItemCount() - 1);
            }
        }

        public View e(ViewGroup viewGroup) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (View) ipChange.ipc$dispatch("71a01675", new Object[]{this, viewGroup});
            }
            int i = this.g;
            View view = null;
            if (i == 1) {
                View view2 = this.f13261a;
                if (view2 != null) {
                    view = view2;
                } else if (this.d != 0) {
                    view = LayoutInflater.from(viewGroup.getContext()).inflate(this.d, viewGroup, false);
                }
                if (view != null) {
                    ViewProxy.setOnClickListener(view, new b());
                }
            } else if (i == 2) {
                View view3 = this.c;
                if (view3 != null) {
                    view = view3;
                } else if (this.f != 0) {
                    view = LayoutInflater.from(viewGroup.getContext()).inflate(this.f, viewGroup, false);
                }
                if (view != null) {
                    ViewProxy.setOnClickListener(view, new c());
                }
            } else if (i == 3) {
                View view4 = this.b;
                if (view4 != null) {
                    view = view4;
                } else if (this.e != 0) {
                    view = LayoutInflater.from(viewGroup.getContext()).inflate(this.e, viewGroup, false);
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

        public void f(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("36812600", new Object[]{this, view});
                return;
            }
            this.c = view;
            this.f = 0;
        }

        public void g(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7e0f4267", new Object[]{this, new Integer(i)});
                return;
            }
            this.c = null;
            this.f = i;
        }

        public void h(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("35becb4f", new Object[]{this, view});
                return;
            }
            this.f13261a = view;
            this.d = 0;
        }

        public int hashCode() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
            }
            return this.g + 13589;
        }

        public void i(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("db9b88f8", new Object[]{this, new Integer(i)});
                return;
            }
            this.f13261a = null;
            this.d = i;
        }

        public void j(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("477565ce", new Object[]{this, view});
                return;
            }
            this.b = view;
            this.e = 0;
        }

        public void k(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("78692059", new Object[]{this, new Integer(i)});
                return;
            }
            this.b = null;
            this.e = i;
        }

        public void l() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ed586412", new Object[]{this});
                return;
            }
            a.a("footer showError");
            this.h = true;
            this.g = 2;
            if (a.b(null).getItemCount() > 0) {
                a.b(null).notifyItemChanged(a.b(null).getItemCount() - 1);
            }
        }

        public void m() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c018ff79", new Object[]{this});
                return;
            }
            a.a("footer showMore");
            this.g = 1;
            if (a.b(null).getItemCount() > 0) {
                a.b(null).notifyItemChanged(a.b(null).getItemCount() - 1);
            }
        }

        public void n() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("96fa0d1a", new Object[]{this});
                return;
            }
            a.a("footer showNoMore");
            this.i = true;
            this.g = 3;
            if (a.b(null).getItemCount() > 0) {
                a.b(null).notifyItemChanged(a.b(null).getItemCount() - 1);
            }
        }
    }

    static {
        t2o.a(779093301);
        t2o.a(779093307);
    }

    public static /* synthetic */ void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38fae181", new Object[]{str});
        } else {
            c(str);
        }
    }

    public static /* synthetic */ RecyclerArrayAdapter b(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerArrayAdapter) ipChange.ipc$dispatch("e3cade9a", new Object[]{aVar});
        }
        throw null;
    }

    public static void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9dd52d5", new Object[]{str});
        } else {
            x5t.b("DefaultEventDelegate", str);
        }
    }
}
