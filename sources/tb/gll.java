package tb;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.Fragment;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.monitor.ProcedureGlobal;
import com.taobao.monitor.impl.data.lifecycle.FragmentLifecycle;
import com.taobao.monitor.procedure.IPage;
import com.taobao.monitor.procedure.a;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class gll {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Window b;
    public View c;
    public Fragment d;
    public String e;
    public String f;
    public Activity i;
    public Fragment j;
    public String k;
    public IPage l;
    public String m;

    /* renamed from: a  reason: collision with root package name */
    public boolean f20075a = true;
    public boolean g = true;

    public IPage a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IPage) ipChange.ipc$dispatch("43392aae", new Object[]{this});
        }
        if (!this.f20075a) {
            return new a();
        }
        if (this.c == null && this.b == null) {
            zq6.a("CustomPageBuilder", "create error: page root view is null");
            return new a();
        }
        String c = c();
        if (this.l == null) {
            this.l = ProcedureGlobal.PROCEDURE_MANAGER.f(b(this.c));
        }
        cll cllVar = new cll();
        cllVar.c0(this.c);
        cllVar.e0(this.b);
        cllVar.S(this.k);
        cllVar.f0(this.l);
        cllVar.U(this.m);
        Activity activity = this.i;
        if (activity != null) {
            cllVar.O(activity);
        } else {
            Fragment fragment = this.j;
            if (fragment != null) {
                cllVar.Q(fragment);
            }
        }
        cllVar.R(c);
        znl znlVar = new znl(cllVar);
        cllVar.Y(this.g);
        cllVar.V(new m15(cllVar));
        cllVar.g0(znlVar);
        cllVar.b0(new n15(cllVar));
        Fragment fragment2 = this.d;
        if (fragment2 != null) {
            cllVar.Z(FragmentLifecycle.a(fragment2));
            cllVar.e().a(this.e, this.f, new HashMap());
        }
        return cllVar;
    }

    public final Activity b(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("5d28099e", new Object[]{this, view});
        }
        if (view == null) {
            return null;
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }

    public final String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e471147a", new Object[]{this});
        }
        Activity activity = this.i;
        if (activity != null) {
            return xol.a(activity);
        }
        Fragment fragment = this.j;
        if (fragment != null) {
            return xol.a(fragment);
        }
        return this.e;
    }

    public gll d(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gll) ipChange.ipc$dispatch("5726888d", new Object[]{this, activity});
        }
        this.i = activity;
        return this;
    }

    public gll e(Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gll) ipChange.ipc$dispatch("1c104fa7", new Object[]{this, fragment});
        }
        this.j = fragment;
        return this;
    }

    public gll f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gll) ipChange.ipc$dispatch("1352fc99", new Object[]{this, str});
        }
        this.k = str;
        return this;
    }

    public gll g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gll) ipChange.ipc$dispatch("9ca9ab59", new Object[]{this, str});
        }
        this.m = str;
        return this;
    }

    public gll h(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gll) ipChange.ipc$dispatch("c779415f", new Object[]{this, new Boolean(z)});
        }
        this.g = z;
        return this;
    }

    public gll j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gll) ipChange.ipc$dispatch("a289a666", new Object[]{this, str});
        }
        this.e = str;
        return this;
    }

    public gll k(Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gll) ipChange.ipc$dispatch("df4577fe", new Object[]{this, fragment});
        }
        this.d = fragment;
        return this;
    }

    public gll l(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gll) ipChange.ipc$dispatch("1bf951e0", new Object[]{this, view});
        }
        this.c = view;
        return this;
    }

    public gll m(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gll) ipChange.ipc$dispatch("6a08bfc4", new Object[]{this, str});
        }
        this.f = str;
        return this;
    }

    public gll n(Window window) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gll) ipChange.ipc$dispatch("3ec1b3f4", new Object[]{this, window});
        }
        this.b = window;
        return this;
    }

    public gll o(IPage iPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gll) ipChange.ipc$dispatch("f3c5bf16", new Object[]{this, iPage});
        }
        this.l = iPage;
        return this;
    }

    public gll p(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gll) ipChange.ipc$dispatch("55cf7953", new Object[]{this, new Boolean(z)});
        }
        this.f20075a = z;
        return this;
    }
}
