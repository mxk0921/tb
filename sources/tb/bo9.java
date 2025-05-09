package tb;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.PopupWindow;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.family.globalbubble2.view.FamilyView;
import java.lang.ref.WeakReference;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class bo9 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final dv1 f16504a;
    public final ao9 b;
    public List<Object> d;
    public xqk f;
    public View c = null;
    public boolean e = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements xqk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.xqk
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("24e8fe54", new Object[]{this});
                return;
            }
            bo9.a(bo9.this).x();
            if (bo9.b(bo9.this) != null) {
                bo9.b(bo9.this).a();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                bo9.d(bo9.this).b(bo9.c(bo9.this));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ List f16507a;

        public c(List list) {
            this.f16507a = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                bo9.d(bo9.this).b(this.f16507a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class d implements View.OnTouchListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
            }
            if (bo9.d(bo9.this) == null) {
                return false;
            }
            if (bo9.d(bo9.this).a(view, motionEvent)) {
                return true;
            }
            Activity e = bo9.e(bo9.this);
            if (e != null && !e.isFinishing()) {
                try {
                    return e.dispatchTouchEvent(motionEvent);
                } catch (Throwable unused) {
                }
            }
            return false;
        }
    }

    public bo9(Context context, dv1 dv1Var) {
        this.f16504a = dv1Var;
        if (dv1Var instanceof ch0) {
            this.b = new FamilyView(context);
        }
    }

    public static /* synthetic */ dv1 a(bo9 bo9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dv1) ipChange.ipc$dispatch("47eed924", new Object[]{bo9Var});
        }
        return bo9Var.f16504a;
    }

    public static /* synthetic */ xqk b(bo9 bo9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xqk) ipChange.ipc$dispatch("385cfebd", new Object[]{bo9Var});
        }
        return bo9Var.f;
    }

    public static /* synthetic */ List c(bo9 bo9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("c83aeb0a", new Object[]{bo9Var});
        }
        return bo9Var.d;
    }

    public static /* synthetic */ ao9 d(bo9 bo9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ao9) ipChange.ipc$dispatch("b71541ae", new Object[]{bo9Var});
        }
        return bo9Var.b;
    }

    public static /* synthetic */ Activity e(bo9 bo9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("48bf122d", new Object[]{bo9Var});
        }
        return bo9Var.f();
    }

    public final Activity f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("d8e4874f", new Object[]{this});
        }
        WeakReference<Activity> n = yca.p().n();
        if (n != null) {
            return n.get();
        }
        return null;
    }

    public final void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("169286e2", new Object[]{this});
        } else if (this.f16504a.w() instanceof PopupWindow) {
            ((PopupWindow) this.f16504a.w()).setTouchInterceptor(new d());
        }
    }

    public View h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("a4f283a4", new Object[]{this});
        }
        ao9 ao9Var = this.b;
        if (ao9Var == null) {
            return null;
        }
        if (this.c == null) {
            this.c = ((FamilyView) ao9Var).Q();
        }
        g();
        ((FamilyView) this.b).W(new a());
        if (this.e) {
            this.c.post(new b());
        }
        return this.c;
    }

    public void i(List<Object> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14f01d53", new Object[]{this, list});
        } else if (this.b != null) {
            View view = this.c;
            if (view == null) {
                this.e = true;
                this.d = list;
                return;
            }
            this.e = false;
            this.d = null;
            view.post(new c(list));
        }
    }

    public void j(xqk xqkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d238734b", new Object[]{this, xqkVar});
        } else {
            this.f = xqkVar;
        }
    }
}
