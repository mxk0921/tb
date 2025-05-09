package com.taobao.android.fluid.framework.list.render;

import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.IpChange;
import tb.ir9;
import tb.p91;
import tb.t2o;
import tb.uq9;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final boolean e = p91.k(p91.a());

    /* renamed from: a  reason: collision with root package name */
    public final uq9 f7864a;
    public final a b;
    public final com.taobao.android.fluid.framework.list.render.a c;
    public boolean d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public b f7865a;

        static {
            t2o.a(468714486);
        }

        public static /* synthetic */ void a(a aVar, b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e819a6a6", new Object[]{aVar, bVar});
            } else {
                aVar.c(bVar);
            }
        }

        public static /* synthetic */ void b(a aVar, b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7bfd5ee7", new Object[]{aVar, bVar});
            } else {
                aVar.d(bVar);
            }
        }

        public final void c(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a671e137", new Object[]{this, bVar});
                return;
            }
            b bVar2 = this.f7865a;
            if (bVar != bVar2) {
                if (bVar2 != null && b.a(bVar2)) {
                    b.c(this.f7865a);
                }
                b bVar3 = this.f7865a;
                if (bVar3 != null) {
                    b.d(bVar3);
                }
                if (bVar != null && !b.a(bVar)) {
                    b.b(bVar);
                }
                this.f7865a = bVar;
            } else if (bVar != null && !b.a(bVar)) {
                b.b(bVar);
            }
        }

        public final void d(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("75dfb165", new Object[]{this, bVar});
            } else if (bVar != null) {
                b.c(bVar);
            }
        }
    }

    static {
        t2o.a(468714485);
    }

    public b(com.taobao.android.fluid.framework.list.render.a aVar, uq9 uq9Var, a aVar2) {
        this.c = aVar;
        this.f7864a = uq9Var;
        this.b = aVar2;
    }

    public static /* synthetic */ boolean a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6bd458a7", new Object[]{bVar})).booleanValue();
        }
        return bVar.d;
    }

    public static /* synthetic */ void b(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f828364", new Object[]{bVar});
        } else {
            bVar.e();
        }
    }

    public static /* synthetic */ void c(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d330ae25", new Object[]{bVar});
        } else {
            bVar.f();
        }
    }

    public static /* synthetic */ uq9 d(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (uq9) ipChange.ipc$dispatch("3715ccc1", new Object[]{bVar});
        }
        return bVar.f7864a;
    }

    public static void g(RecyclerView recyclerView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46bf1bdc", new Object[]{recyclerView, new Integer(i)});
        } else if (i != -1) {
            RecyclerView.ViewHolder findViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(i);
            if (findViewHolderForAdapterPosition instanceof RecyclerViewHolder) {
                ((RecyclerViewHolder) findViewHolderForAdapterPosition).f7861a.o();
            }
        }
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1d77dff", new Object[]{this});
            return;
        }
        ir9.b("WillActivePerformer", "willActive");
        a.a(this.b, this);
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8be6dd09", new Object[]{this});
            return;
        }
        ir9.b("WillActivePerformer", "willDisActive");
        a.b(this.b, this);
    }

    public final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a525be", new Object[]{this});
        } else if (!this.c.k()) {
            if (e) {
                ir9.b("WillActivePerformer", "onWillActive must after appear");
            }
        } else if (this.d) {
            ir9.b("WillActivePerformer", "onWillActive mIsWillActive");
        } else {
            ir9.b("WillActivePerformer", "onWillActive");
            uq9 uq9Var = this.f7864a;
            uq9Var.onWillActive(uq9Var);
            this.d = true;
        }
    }

    public final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a3aa8ea", new Object[]{this});
        } else if (this.d) {
            ir9.b("WillActivePerformer", "onWillDisActive");
            uq9 uq9Var = this.f7864a;
            uq9Var.onWillDisActive(uq9Var);
            this.d = false;
        }
    }
}
