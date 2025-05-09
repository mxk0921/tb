package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class zhj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f32773a;
    public boolean b;
    public ayc c;
    public ayc d;
    public View e;
    public View f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements byc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ byc f32774a;

        public a(byc bycVar) {
            this.f32774a = bycVar;
        }

        @Override // tb.byc
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("97f869b2", new Object[]{this});
                return;
            }
            zhj.a(zhj.this, false);
            byc bycVar = this.f32774a;
            if (bycVar != null) {
                bycVar.a();
            }
        }

        @Override // tb.byc
        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4e1f0bb2", new Object[]{this});
                return;
            }
            zhj.a(zhj.this, false);
            byc bycVar = this.f32774a;
            if (bycVar != null) {
                bycVar.b();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class b implements byc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ byc f32775a;

        public b(byc bycVar) {
            this.f32775a = bycVar;
        }

        @Override // tb.byc
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("97f869b2", new Object[]{this});
                return;
            }
            zhj.b(zhj.this, false);
            byc bycVar = this.f32775a;
            if (bycVar != null) {
                bycVar.a();
            }
        }

        @Override // tb.byc
        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4e1f0bb2", new Object[]{this});
                return;
            }
            zhj.b(zhj.this, false);
            byc bycVar = this.f32775a;
            if (bycVar != null) {
                bycVar.b();
            }
        }
    }

    static {
        t2o.a(81789313);
    }

    public static /* synthetic */ boolean a(zhj zhjVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f5b5632", new Object[]{zhjVar, new Boolean(z)})).booleanValue();
        }
        zhjVar.f32773a = z;
        return z;
    }

    public static /* synthetic */ boolean b(zhj zhjVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2e158df3", new Object[]{zhjVar, new Boolean(z)})).booleanValue();
        }
        zhjVar.b = z;
        return z;
    }

    public boolean c(byc bycVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9739e59e", new Object[]{this, bycVar})).booleanValue();
        }
        if (this.b) {
            return false;
        }
        this.b = true;
        this.f32773a = false;
        if (this.e == null) {
            if (bycVar != null) {
                bycVar.a();
            }
            this.b = false;
            return false;
        }
        d(this.f);
        e().b(this.e, new b(bycVar));
        return true;
    }

    public final void d(View view) {
        ayc aycVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f883545f", new Object[]{this, view});
        } else if (view != null && (aycVar = this.d) != null) {
            aycVar.b(view, null);
        }
    }

    public final ayc e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ayc) ipChange.ipc$dispatch("84c54fc1", new Object[]{this});
        }
        ayc aycVar = this.c;
        if (aycVar != null) {
            return aycVar;
        }
        fij fijVar = new fij();
        this.c = fijVar;
        return fijVar;
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d8284e2", new Object[]{this})).booleanValue();
        }
        return this.f32773a;
    }

    public void g(ayc aycVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b82aee47", new Object[]{this, aycVar});
        } else {
            this.c = aycVar;
        }
    }

    public void h(ayc aycVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("694d5cb9", new Object[]{this, aycVar});
        } else {
            this.d = aycVar;
        }
    }

    public boolean i(View view, View view2, byc bycVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d43a1b8b", new Object[]{this, view, view2, bycVar})).booleanValue();
        }
        if (this.f32773a) {
            return false;
        }
        this.f32773a = true;
        this.b = false;
        this.e = view;
        this.f = view2;
        j(view2);
        e().a(view, new a(bycVar));
        return false;
    }

    public final void j(View view) {
        ayc aycVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4483d12", new Object[]{this, view});
        } else if (view != null && (aycVar = this.d) != null) {
            aycVar.a(view, null);
        }
    }
}
