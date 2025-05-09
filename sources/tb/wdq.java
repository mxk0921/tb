package tb;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class wdq extends kd7<vdq> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final LinearLayout h;
    public final int i;
    public int k;
    public LinearLayout l;
    public final int j = mr7.a(12.0f);
    public final ArrayList<kd7<md7>> m = new ArrayList<>();

    static {
        t2o.a(912262400);
    }

    public wdq(Context context) {
        super(context);
        int a2 = mr7.a(9.0f);
        this.i = a2;
        this.k = 0;
        this.k = (int) Math.ceil((mr7.f(this.f22590a) - a2) / 2);
        LinearLayout linearLayout = new LinearLayout(this.f22590a);
        this.h = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setPadding(0, 0, 0, a2);
    }

    public static /* synthetic */ Object ipc$super(wdq wdqVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/skeleton/desc/natives/holder/SplitableContainerViewHolder");
    }

    /* renamed from: e */
    public boolean m(vdq vdqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fa10ee78", new Object[]{this, vdqVar})).booleanValue();
        }
        return false;
    }

    @Override // tb.kd7
    public void s(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d90b75e", new Object[]{this, new Boolean(z), new Boolean(z2)});
            return;
        }
        Iterator<kd7<md7>> it = this.m.iterator();
        while (it.hasNext()) {
            it.next().s(z, z2);
        }
    }

    @Override // tb.kd7
    public void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        Iterator<kd7<md7>> it = this.m.iterator();
        while (it.hasNext()) {
            it.next().t();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void w(md7 md7Var, boolean z) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6da48f1a", new Object[]{this, md7Var, new Boolean(z)});
            return;
        }
        kd7<? extends md7> a2 = ld7.a(this.f22590a, md7Var);
        if (a2 != null) {
            this.m.add(a2);
            View o = a2.o(md7Var);
            if (o != null) {
                if (o.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                    marginLayoutParams = (ViewGroup.MarginLayoutParams) o.getLayoutParams();
                } else {
                    marginLayoutParams = null;
                }
                if (marginLayoutParams == null) {
                    marginLayoutParams = new LinearLayout.LayoutParams(-2, -2);
                }
                if (this.l == null) {
                    LinearLayout linearLayout = new LinearLayout(this.f22590a);
                    this.l = linearLayout;
                    linearLayout.setOrientation(0);
                }
                marginLayoutParams.width = this.k;
                if (!z) {
                    marginLayoutParams.rightMargin = this.i;
                } else {
                    marginLayoutParams.rightMargin = 0;
                }
                this.l.addView(o, marginLayoutParams);
            }
        }
    }

    /* renamed from: x */
    public void h(vdq vdqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b62884f4", new Object[]{this, vdqVar});
            return;
        }
        int size = vdqVar.b().size();
        for (int i = 0; i < size; i++) {
            kd7<md7> kd7Var = this.m.get(i);
            if (i <= size - 1) {
                kd7Var.v(i());
                kd7Var.g(vdqVar.b().get(i));
            }
        }
    }

    /* renamed from: y */
    public View j(vdq vdqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("1fcec04", new Object[]{this, vdqVar});
        }
        if (!vdqVar.b().isEmpty()) {
            this.k = (int) Math.ceil(((mr7.f(this.f22590a) - (this.j * 2)) - (this.i * (vdqVar.b().size() - 1))) / vdqVar.b().size());
            Iterator<md7> it = vdqVar.b().iterator();
            while (it.hasNext()) {
                md7 next = it.next();
                if (vdqVar.b().indexOf(next) == vdqVar.b().size() - 1) {
                    w(next, true);
                } else {
                    w(next, false);
                }
            }
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            int i = this.j;
            layoutParams.setMargins(i, 0, i, 0);
            this.h.addView(this.l, layoutParams);
        }
        return this.h;
    }
}
