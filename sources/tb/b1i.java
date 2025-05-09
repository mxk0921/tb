package tb;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.component.module.DataEntry;
import com.taobao.android.detail.ttdetail.container.MainScreenCore;
import com.taobao.android.detail.ttdetail.widget.scrollerlayout.TTDetailScrollerLayout;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class b1i extends hrj {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final MainScreenCore c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f16127a;
        public final /* synthetic */ int b;
        public final /* synthetic */ TTDetailScrollerLayout c;

        public a(String str, int i, TTDetailScrollerLayout tTDetailScrollerLayout) {
            this.f16127a = str;
            this.b = i;
            this.c = tTDetailScrollerLayout;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            int A = b1i.this.A(this.f16127a) - this.b;
            if (A > 0) {
                this.c.scrollSelf(A);
            }
        }
    }

    static {
        t2o.a(912261442);
    }

    public b1i(Context context, ze7 ze7Var, d1i d1iVar, DataEntry... dataEntryArr) {
        super(context, ze7Var, d1iVar, dataEntryArr);
        this.c = new MainScreenCore(context, ze7Var);
    }

    public static /* synthetic */ Object ipc$super(b1i b1iVar, String str, Object... objArr) {
        if (str.hashCode() == -1504501726) {
            super.onDestroy();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/component/module/MainScreenComponent");
    }

    public int A(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("be913385", new Object[]{this, str})).intValue();
        }
        return this.c.u(str);
    }

    public int[] B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("be603220", new Object[]{this});
        }
        MainScreenCore mainScreenCore = this.c;
        if (mainScreenCore != null) {
            return mainScreenCore.v();
        }
        return null;
    }

    public String C(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("856294ce", new Object[]{this, new Integer(i)});
        }
        MainScreenCore mainScreenCore = this.c;
        if (mainScreenCore != null) {
            return mainScreenCore.x(i);
        }
        return null;
    }

    public void D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("155897d9", new Object[]{this});
        } else {
            this.c.F();
        }
    }

    public void E(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1b4f73d", new Object[]{this, str, new Integer(i)});
        } else {
            this.c.G(str, i);
        }
    }

    public void F(MainScreenCore.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d372caea", new Object[]{this, cVar});
        } else {
            this.c.H(cVar);
        }
    }

    @Override // tb.oa4
    public <C extends oa4> C findComponent(String str) {
        yns t;
        z4k<wua> z4kVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (C) ((oa4) ipChange.ipc$dispatch("78948b87", new Object[]{this, str}));
        }
        C c = (C) this.c.p(str);
        if (c == null && TextUtils.equals("bottomBar", str)) {
            c = (C) this.c.r();
        }
        d1i d1iVar = (d1i) this.mDetailContext.e().e(hzh.PARSER_ID);
        if (!(d1iVar == null || (t = d1iVar.t()) == null)) {
            if (c == null && TextUtils.equals("headerPic", str)) {
                z4kVar = t.p();
            } else if (c != null || !TextUtils.equals("navBar", str)) {
                z4kVar = null;
            } else {
                z4kVar = t.r();
            }
            if (z4kVar != null) {
                return (C) z4kVar.f(this.mDetailContext.d());
            }
        }
        return c;
    }

    @Override // tb.oa4
    public <C extends oa4> C findComponentByUltronName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (C) ((oa4) ipChange.ipc$dispatch("97436efd", new Object[]{this, str}));
        }
        return (C) this.c.q(str);
    }

    @Override // tb.hrj, tb.ozc
    public void k(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2314fd0", new Object[]{this, new Integer(i)});
            return;
        }
        RecyclerView y = this.c.y();
        if (y != null && y.getAdapter() != null && y.getAdapter().getItemCount() > 0) {
            if (i == Integer.MAX_VALUE) {
                y.scrollToPosition(y.getAdapter().getItemCount() - 1);
            } else {
                y.scrollToPosition(i);
            }
        }
    }

    @Override // tb.oa4
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        this.c.n();
        super.onDestroy();
    }

    @Override // tb.oa4
    public View onGetComponentView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("f631742", new Object[]{this, view});
        }
        return this.c.z();
    }

    @Override // tb.hrj, tb.ozc
    public View r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("c3161e04", new Object[]{this});
        }
        return this.c.y();
    }

    @Override // tb.hrj
    public TTDetailScrollerLayout.LayoutParams u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TTDetailScrollerLayout.LayoutParams) ipChange.ipc$dispatch("99746aed", new Object[]{this});
        }
        return new TTDetailScrollerLayout.LayoutParams(-1, -1);
    }

    @Override // tb.hrj
    public String v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("978e443e", new Object[]{this});
        }
        return "header";
    }

    @Override // tb.hrj
    public boolean w(TTDetailScrollerLayout tTDetailScrollerLayout, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("da673174", new Object[]{this, tTDetailScrollerLayout, str, new Integer(i)})).booleanValue();
        }
        if (tTDetailScrollerLayout.findLastVisibleView() != getComponentView(null)) {
            tTDetailScrollerLayout.scrollSelf(-tTDetailScrollerLayout.getOwnScrollY());
        }
        E(str, i);
        tTDetailScrollerLayout.post(new a(str, i, tTDetailScrollerLayout));
        return true;
    }

    public oa4 y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (oa4) ipChange.ipc$dispatch("4f508995", new Object[]{this});
        }
        return this.c.o();
    }

    public List<oa4> z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("c9f4973b", new Object[]{this});
        }
        return this.c.t();
    }
}
