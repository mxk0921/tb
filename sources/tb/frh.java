package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.bean.ResultMainInfoBean;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class frh extends y64 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public boolean A;
    public int B;
    public run C;
    public boolean D;
    public ArrayList<BaseCellBean> G;
    public ResultMainInfoBean q;
    public l4k s;
    public int t;
    public int u;
    public int v;
    public int w;
    public int x;
    public int y;
    public int z;
    public final String r = "refreshGuide";
    public final boolean E = true;
    public final Map<String, String> F = new HashMap();

    static {
        t2o.a(815792867);
    }

    public static /* synthetic */ Object ipc$super(frh frhVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 486165051) {
            return new Integer(super.V());
        }
        if (hashCode == 1361471684) {
            super.R((asi) objArr[0]);
            return null;
        } else if (hashCode == 2022597206) {
            super.D();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/search/refactor/MSCombo");
        }
    }

    public final void A0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9fa7c99", new Object[]{this, new Boolean(z)});
        }
    }

    public final void B0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc75a681", new Object[]{this, new Integer(i)});
        } else {
            this.t = i;
        }
    }

    public final void C0(run runVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51b0b06d", new Object[]{this, runVar});
        } else {
            this.C = runVar;
        }
    }

    @Override // tb.y64, tb.asi
    public void D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
            return;
        }
        super.D();
        this.x = 0;
        this.y = 0;
        this.z = 0;
        this.u = 0;
        this.v = 0;
        this.w = 0;
        this.t = 0;
    }

    public final void D0(ResultMainInfoBean resultMainInfoBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4371b96", new Object[]{this, resultMainInfoBean});
        } else {
            this.q = resultMainInfoBean;
        }
    }

    public final void E0(ArrayList<BaseCellBean> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("174d7f28", new Object[]{this, arrayList});
        } else {
            this.G = arrayList;
        }
    }

    @Override // tb.y64, tb.asi
    public void R(asi asiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("512668c4", new Object[]{this, asiVar});
            return;
        }
        ckf.g(asiVar, "combo");
        super.R(asiVar);
        frh frhVar = (frh) asiVar;
        this.s = frhVar.s;
        if (!this.A) {
            this.q = frhVar.q;
            this.B = 0;
        }
    }

    @Override // tb.y64
    public int V() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1cfa4a3b", new Object[]{this})).intValue();
        }
        if (!this.E || T().totalResult > 0) {
            return super.V();
        }
        return Integer.MAX_VALUE;
    }

    public final boolean Y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("82c0a5f9", new Object[]{this})).booleanValue();
        }
        if (!this.D || !v4p.a(this.r, true)) {
            return false;
        }
        return true;
    }

    public final void Z(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddd96836", new Object[]{this, new Boolean(z)});
            return;
        }
        if (!z) {
            this.D = false;
        }
        if (this.A) {
            this.B++;
        }
    }

    public final void a0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f510bf0", new Object[]{this});
        } else {
            v4p.f(this.r, false);
        }
    }

    public final int b0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("92a992ed", new Object[]{this})).intValue();
        }
        return this.z;
    }

    public final boolean c0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b916c513", new Object[]{this})).booleanValue();
        }
        return this.A;
    }

    public final int d0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c49bdc8e", new Object[]{this})).intValue();
        }
        return this.w;
    }

    public final int e0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8a6cef14", new Object[]{this})).intValue();
        }
        return this.v;
    }

    public final int f0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("93370645", new Object[]{this})).intValue();
        }
        return this.u;
    }

    public final int g0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e84bf973", new Object[]{this})).intValue();
        }
        return this.x;
    }

    public final l4k h0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (l4k) ipChange.ipc$dispatch("74dbbd32", new Object[]{this});
        }
        return this.s;
    }

    public final int i0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d2923b7a", new Object[]{this})).intValue();
        }
        return this.y;
    }

    public final int j0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a264b241", new Object[]{this})).intValue();
        }
        return this.t;
    }

    public final int k0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b4afb0e4", new Object[]{this})).intValue();
        }
        return this.B;
    }

    public final run l0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (run) ipChange.ipc$dispatch("2859af9b", new Object[]{this});
        }
        return this.C;
    }

    public final ResultMainInfoBean m0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ResultMainInfoBean) ipChange.ipc$dispatch("86640672", new Object[]{this});
        }
        return this.q;
    }

    public final ArrayList<BaseCellBean> n0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("1cf8ff28", new Object[]{this});
        }
        return this.G;
    }

    public final Map<String, String> o0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("2a417561", new Object[]{this});
        }
        return this.F;
    }

    public final void p0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef5ff1bb", new Object[]{this});
            return;
        }
        this.x += this.v;
        this.y += this.u;
        this.z += this.w;
        this.u = 0;
        this.v = 0;
        this.w = 0;
    }

    public final void q0(asi asiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f73d302", new Object[]{this, asiVar});
            return;
        }
        ckf.g(asiVar, "combo");
        ((HashMap) this.F).putAll(((frh) asiVar).F);
    }

    public final void r0(int i) {
        nun a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f63172f", new Object[]{this, new Integer(i)});
            return;
        }
        run runVar = this.C;
        if (runVar != null && (a2 = runVar.a()) != null && i >= a2.d()) {
            this.D = true;
        }
    }

    public final void s0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4ccdb55", new Object[]{this, new Integer(i)});
        } else {
            this.z = i;
        }
    }

    public final void t0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c062bb1", new Object[]{this, new Boolean(z)});
        } else {
            this.A = z;
        }
    }

    public final void u0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a10926d4", new Object[]{this, new Integer(i)});
        } else {
            this.w = i;
        }
    }

    public final void v0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be1acb0e", new Object[]{this, new Integer(i)});
        } else {
            this.v = i;
        }
    }

    public final void w0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d768f65", new Object[]{this, new Integer(i)});
        } else {
            this.u = i;
        }
    }

    public final void x0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b85f2b8f", new Object[]{this, new Integer(i)});
        } else {
            this.x = i;
        }
    }

    public final void y0(l4k l4kVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1bede84", new Object[]{this, l4kVar});
        } else {
            this.s = l4kVar;
        }
    }

    public final void z0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b68c41d0", new Object[]{this, new Integer(i)});
        } else {
            this.y = i;
        }
    }
}
