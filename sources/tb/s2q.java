package tb;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.sku.presenter.AliXSkuPresenterEngine;
import com.taobao.android.sku.widget.SkuDialogFragment;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class s2q {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final b f27763a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final FragmentActivity f27764a;
        public final SkuDialogFragment b = new SkuDialogFragment();

        static {
            t2o.a(442499378);
            t2o.a(442499379);
        }

        public a(FragmentActivity fragmentActivity) {
            this.f27764a = fragmentActivity;
        }

        @Override // tb.s2q.b
        public void a(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6459ac6f", new Object[]{this, view});
            } else {
                this.b.z2(view);
            }
        }

        @Override // tb.s2q.b
        public void b(nfb nfbVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a8024808", new Object[]{this, nfbVar});
            } else {
                this.b.C2(nfbVar);
            }
        }

        @Override // tb.s2q.b
        public void c(int i, int i2, int i3, int i4, int i5, int i6) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1b405587", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6)});
            } else {
                this.b.s2(i, i2, i3, i4, i5, i6);
            }
        }

        @Override // tb.s2q.b
        public void d(AliXSkuPresenterEngine.b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7c3841ad", new Object[]{this, bVar});
            } else {
                this.b.A2(bVar);
            }
        }

        @Override // tb.s2q.b
        public void dismiss() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ae28e211", new Object[]{this});
            } else {
                this.b.dismissAllowingStateLoss();
            }
        }

        @Override // tb.s2q.b
        public void e(DialogInterface.OnDismissListener onDismissListener) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d29d2d87", new Object[]{this, onDismissListener});
            } else {
                this.b.B2(onDismissListener);
            }
        }

        @Override // tb.s2q.b
        public void f(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dee22c48", new Object[]{this, new Integer(i)});
            } else {
                this.b.setStyle(0, i);
            }
        }

        @Override // tb.s2q.b
        public boolean isShowing() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d3c33646", new Object[]{this})).booleanValue();
            }
            return this.b.v2();
        }

        @Override // tb.s2q.b
        public void show() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ebbb9904", new Object[]{this});
            } else {
                this.b.show(this.f27764a.getSupportFragmentManager(), "fragment_tag");
            }
        }

        @Override // tb.s2q.b
        public void a(AliXSkuPresenterEngine.c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("633d7b7d", new Object[]{this, cVar});
            } else {
                this.b.f(cVar);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface b {
        void a(View view);

        void a(AliXSkuPresenterEngine.c cVar);

        void b(nfb nfbVar);

        void c(int i, int i2, int i3, int i4, int i5, int i6);

        void d(AliXSkuPresenterEngine.b bVar);

        void dismiss();

        void e(DialogInterface.OnDismissListener onDismissListener);

        void f(int i);

        boolean isShowing();

        void show();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class c implements b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final Context f27765a;
        public bt8 b;
        public int c;
        public View d;
        public DialogInterface.OnDismissListener e;
        public AliXSkuPresenterEngine.b f;
        public boolean g;
        public int h;
        public int i;
        public int j;
        public int k;
        public int l;
        public int m;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public class a extends bt8 {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a(Context context, int i) {
                super(context, i);
            }

            public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
                if (str.hashCode() == 143326307) {
                    super.onBackPressed();
                    return null;
                }
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/sku/widget/SkuDialogWrapper$NormalDialog$1");
            }

            @Override // android.app.Dialog
            public void onBackPressed() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("88afc63", new Object[]{this});
                } else if (c.g(c.this) == null || !c.g(c.this).onBackPressed()) {
                    super.onBackPressed();
                }
            }
        }

        static {
            t2o.a(442499380);
            t2o.a(442499379);
        }

        public c(Context context) {
            this.f27765a = context;
        }

        public static /* synthetic */ AliXSkuPresenterEngine.b g(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (AliXSkuPresenterEngine.b) ipChange.ipc$dispatch("c63ad0dd", new Object[]{cVar});
            }
            return cVar.f;
        }

        @Override // tb.s2q.b
        public void a(AliXSkuPresenterEngine.c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("633d7b7d", new Object[]{this, cVar});
            }
        }

        @Override // tb.s2q.b
        public void b(nfb nfbVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a8024808", new Object[]{this, nfbVar});
            }
        }

        @Override // tb.s2q.b
        public void c(int i, int i2, int i3, int i4, int i5, int i6) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1b405587", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6)});
                return;
            }
            this.g = true;
            this.h = i;
            this.i = i2;
            this.j = i3;
            this.k = i4;
            this.l = i5;
            this.m = i6;
        }

        @Override // tb.s2q.b
        public void d(AliXSkuPresenterEngine.b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7c3841ad", new Object[]{this, bVar});
            } else {
                this.f = bVar;
            }
        }

        @Override // tb.s2q.b
        public void dismiss() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ae28e211", new Object[]{this});
                return;
            }
            bt8 bt8Var = this.b;
            if (bt8Var != null) {
                bt8Var.dismiss();
                this.b = null;
            }
        }

        @Override // tb.s2q.b
        public void e(DialogInterface.OnDismissListener onDismissListener) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d29d2d87", new Object[]{this, onDismissListener});
                return;
            }
            this.e = onDismissListener;
            bt8 bt8Var = this.b;
            if (bt8Var != null) {
                bt8Var.setOnDismissListener(onDismissListener);
            }
        }

        @Override // tb.s2q.b
        public void f(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dee22c48", new Object[]{this, new Integer(i)});
            } else {
                this.c = i;
            }
        }

        public final bt8 h() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (bt8) ipChange.ipc$dispatch("e1ef824a", new Object[]{this});
            }
            return new a(this.f27765a, this.c);
        }

        @Override // tb.s2q.b
        public boolean isShowing() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d3c33646", new Object[]{this})).booleanValue();
            }
            bt8 bt8Var = this.b;
            if (bt8Var == null || !bt8Var.isShowing()) {
                return false;
            }
            return true;
        }

        @Override // tb.s2q.b
        public void show() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ebbb9904", new Object[]{this});
                return;
            }
            bt8 h = h();
            this.b = h;
            if (this.g) {
                h.getWindow().setSoftInputMode(51);
                this.b.d(this.d, this.h, this.i, this.j, this.k, this.l, this.m);
            } else {
                h.setContentView(this.d);
                this.b.getWindow().setSoftInputMode(51);
                this.b.show();
            }
            this.b.setOnDismissListener(this.e);
        }

        @Override // tb.s2q.b
        public void a(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6459ac6f", new Object[]{this, view});
            } else {
                this.d = view;
            }
        }
    }

    static {
        t2o.a(442499377);
    }

    public s2q(Context context) {
        boolean c2 = o2q.c("is_enable_fragment_dialog");
        if (!(context instanceof FragmentActivity) || !c2) {
            this.f27763a = new c(context);
        } else if (all.INSTANCE.f(context)) {
            this.f27763a = new zkl(context);
        } else {
            this.f27763a = new a((FragmentActivity) context);
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae28e211", new Object[]{this});
        } else {
            this.f27763a.dismiss();
        }
    }

    public void b(int i, int i2, int i3, int i4, int i5, int i6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b405587", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6)});
        } else {
            this.f27763a.c(i, i2, i3, i4, i5, i6);
        }
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d3c33646", new Object[]{this})).booleanValue();
        }
        return this.f27763a.isShowing();
    }

    public void d(nfb nfbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8024808", new Object[]{this, nfbVar});
        } else {
            this.f27763a.b(nfbVar);
        }
    }

    public void e(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6459ac6f", new Object[]{this, view});
        } else {
            this.f27763a.a(view);
        }
    }

    public void f(AliXSkuPresenterEngine.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c3841ad", new Object[]{this, bVar});
        } else {
            this.f27763a.d(bVar);
        }
    }

    public void g(DialogInterface.OnDismissListener onDismissListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d29d2d87", new Object[]{this, onDismissListener});
        } else {
            this.f27763a.e(onDismissListener);
        }
    }

    public void h(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dee22c48", new Object[]{this, new Integer(i)});
        } else {
            this.f27763a.f(i);
        }
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebbb9904", new Object[]{this});
        } else {
            this.f27763a.show();
        }
    }

    public void j(AliXSkuPresenterEngine.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("633d7b7d", new Object[]{this, cVar});
        } else {
            this.f27763a.a(cVar);
        }
    }
}
