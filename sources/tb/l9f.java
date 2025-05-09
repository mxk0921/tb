package tb;

import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.list.IFeedsListService;
import com.taobao.android.fluid.framework.shareplayer.ISharePlayerService;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class l9f {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public boolean b;

    /* renamed from: a  reason: collision with root package name */
    public final HashMap<String, m9f> f23194a = new HashMap<>();
    public boolean c = false;
    public boolean d = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final l9f f23195a = new l9f();

        static {
            t2o.a(468714779);
        }

        public static /* synthetic */ l9f a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (l9f) ipChange.ipc$dispatch("ba55770d", new Object[0]);
            }
            return f23195a;
        }
    }

    static {
        t2o.a(468714778);
    }

    public static l9f f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (l9f) ipChange.ipc$dispatch("8e233152", new Object[0]);
        }
        return a.a();
    }

    public final void a(FluidContext fluidContext, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99974a9c", new Object[]{this, fluidContext, str, str2});
        } else if (((IFeedsListService) fluidContext.getService(IFeedsListService.class)).getActiveCard() instanceof prp) {
            prp prpVar = (prp) ((IFeedsListService) fluidContext.getService(IFeedsListService.class)).getActiveCard();
            if (!TextUtils.isEmpty(prpVar.E1()) && prpVar.getDWInstance() != null && prpVar.E1().equals(str2)) {
                m9f m9fVar = new m9f(prpVar.E1(), prpVar.getDWInstance(), prpVar.G1().c());
                m9fVar.e(true);
                u(str, m9fVar);
            }
        }
    }

    public boolean b(String str, String str2) {
        m9f h;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4d873cb1", new Object[]{this, str, str2})).booleanValue();
        }
        if (!o(str) || (h = h(str)) == null || !TextUtils.equals(h.c(), str2)) {
            return false;
        }
        return true;
    }

    public final boolean c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3e65669c", new Object[]{this, str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return !TextUtils.isEmpty(Uri.parse(str).getQueryParameter("id"));
    }

    public void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("769f891e", new Object[]{this, str});
        } else if (k()) {
            boolean o = o(str);
            if (i(str) != null && o) {
                e();
            }
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39db50f4", new Object[]{this});
        } else {
            this.f23194a.clear();
        }
    }

    public boolean g(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("13e093ea", new Object[]{this, fluidContext})).booleanValue();
        }
        if (!k()) {
            return false;
        }
        return ((ISharePlayerService) fluidContext.getService(ISharePlayerService.class)).isEnableInnerSharePlayer();
    }

    public m9f h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (m9f) ipChange.ipc$dispatch("74bed5d9", new Object[]{this, str});
        }
        if (!this.f23194a.isEmpty()) {
            return this.f23194a.get(str);
        }
        return null;
    }

    public atb i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (atb) ipChange.ipc$dispatch("9ddf985e", new Object[]{this, str});
        }
        m9f j = j(str);
        if (j != null) {
            return j.a();
        }
        return null;
    }

    public final m9f j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (m9f) ipChange.ipc$dispatch("5f9b67e6", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return h(str);
    }

    public boolean l(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c7ac6c2c", new Object[]{this, str})).booleanValue();
        }
        if (!c(str)) {
            return false;
        }
        return k();
    }

    public boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5e208703", new Object[]{this})).booleanValue();
        }
        return this.c;
    }

    public boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6f8e7763", new Object[]{this})).booleanValue();
        }
        return this.d;
    }

    public boolean o(String str) {
        m9f j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3596362b", new Object[]{this, str})).booleanValue();
        }
        if (k() && (j = j(str)) != null && j.d()) {
            return true;
        }
        return false;
    }

    public void p(prp prpVar, boolean z, boolean z2, boolean z3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fce8affa", new Object[]{this, prpVar, new Boolean(z), new Boolean(z2), new Boolean(z3)});
        } else if (k() && n() && !((ISharePlayerService) prpVar.U().getService(ISharePlayerService.class)).isHasShowInnerSharePlayerPV() && z && z2) {
            if (z3) {
                prpVar.V0(false);
            }
            this.b = true;
            f().t(false);
        }
    }

    public void q(prp prpVar, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94f708a", new Object[]{this, prpVar, new Boolean(z), new Boolean(z2)});
        } else if (k() && n() && !((ISharePlayerService) prpVar.U().getService(ISharePlayerService.class)).isHasShowInnerSharePlayerPV() && z && z2) {
            prpVar.X0();
            prpVar.O0(true);
            prpVar.P0();
        }
    }

    public String r(FluidContext fluidContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1125641a", new Object[]{this, fluidContext, str});
        }
        if (!k() || TextUtils.isEmpty(str)) {
            return str;
        }
        String queryParameter = Uri.parse(str).getQueryParameter("id");
        String str2 = "snapshot" + queryParameter;
        String str3 = str + "&prePlayerMapKey=" + str2;
        a(fluidContext, str2, queryParameter);
        return str3;
    }

    public void s(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff13997d", new Object[]{this, new Boolean(z)});
        } else {
            this.c = z;
        }
    }

    public void t(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ccbc871d", new Object[]{this, new Boolean(z)});
        } else {
            this.d = z;
        }
    }

    public void u(String str, m9f m9fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a183ece6", new Object[]{this, str, m9fVar});
        } else {
            this.f23194a.put(str, m9fVar);
        }
    }

    public final boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f2312d58", new Object[]{this})).booleanValue();
        }
        boolean orangeBooleanConfig = FluidSDK.getRemoteConfigAdapter().getOrangeBooleanConfig("enableSharePlayerMH", false);
        tfs.d("合集续播开关：orange开关打开：" + orangeBooleanConfig);
        return orangeBooleanConfig;
    }
}
