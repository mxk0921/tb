package tb;

import android.content.Context;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class d97 implements d2i {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public fuw f17663a;
    public final e2i b;

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
                return;
            }
            if (d97.a(d97.this) != null) {
                d97.a(d97.this).reload();
            }
            d97.this.d(false, null);
        }
    }

    static {
        t2o.a(85983256);
        t2o.a(85983265);
    }

    public d97(e2i e2iVar) {
        this.b = e2iVar;
    }

    public static /* synthetic */ e2i a(d97 d97Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e2i) ipChange.ipc$dispatch("de8d2bfc", new Object[]{d97Var});
        }
        return d97Var.b;
    }

    public void b(Context context, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2496f42", new Object[]{this, context, view});
        } else if (this.f17663a == null && view != null) {
            fuw fuwVar = new fuw(context, view);
            this.f17663a = fuwVar;
            fuwVar.d();
            this.f17663a.f(new a());
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        fuw fuwVar = this.f17663a;
        if (fuwVar != null) {
            fuwVar.b();
        }
    }

    public void d(boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4273af67", new Object[]{this, new Boolean(z), str});
            return;
        }
        fuw fuwVar = this.f17663a;
        if (fuwVar == null) {
            return;
        }
        if (z) {
            fuwVar.g(str);
        } else {
            fuwVar.d();
        }
    }
}
