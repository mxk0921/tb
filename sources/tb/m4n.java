package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.turbo.model.PageModel;
import com.taobao.android.turbo.model.TabModel;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class m4n implements pxd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f23771a = true;
    public final qpu b;
    public final c4n c;
    public final fip d;

    static {
        t2o.a(916455699);
        t2o.a(916455447);
    }

    public m4n(qpu qpuVar, c4n c4nVar, fip fipVar) {
        ckf.g(qpuVar, "turboEngineContext");
        ckf.g(c4nVar, "publishButtonComponent");
        ckf.g(fipVar, "shareButtonComponent");
        this.b = qpuVar;
        this.c = c4nVar;
        this.d = fipVar;
    }

    @Override // tb.pxd
    public void B(int i, float f, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbeec9dd", new Object[]{this, new Integer(i), new Float(f), new Integer(i2)});
        }
    }

    public final boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5182c40a", new Object[]{this})).booleanValue();
        }
        return this.c.hide();
    }

    public final boolean b(TabModel tabModel) {
        j12<?> j12Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("659b865d", new Object[]{this, tabModel})).booleanValue();
        }
        if (tabModel == null) {
            return false;
        }
        s4d g = this.b.a().g();
        r12 r12Var = null;
        if (g != null) {
            j12Var = g.getSubPageConfig(tabModel);
        } else {
            j12Var = null;
        }
        if (j12Var instanceof r12) {
            r12Var = j12Var;
        }
        r12 r12Var2 = r12Var;
        if (r12Var2 != null) {
            return r12Var2.isEnableShareButton();
        }
        return false;
    }

    public final void c(PageModel pageModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db85c718", new Object[]{this, pageModel});
            return;
        }
        ckf.g(pageModel, "data");
        d(pageModel);
    }

    public final void d(PageModel pageModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf6a458", new Object[]{this, pageModel});
            return;
        }
        List<TabModel> tabs = pageModel.getTabs();
        if (tabs != null) {
            for (TabModel tabModel : tabs) {
                if (b(tabModel)) {
                    this.f23771a = false;
                    return;
                }
            }
        }
    }

    public final boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9d0793af", new Object[]{this})).booleanValue();
        }
        if (this.f23771a) {
            return this.c.show();
        }
        return this.c.hide();
    }

    @Override // tb.pxd
    public void x(int i, String str, int i2, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d51c6d8", new Object[]{this, new Integer(i), str, new Integer(i2), str2});
        } else if (b(((xwc) this.b.getService(xwc.class)).d0(i2))) {
            this.d.show();
        } else {
            this.d.hide();
        }
    }
}
