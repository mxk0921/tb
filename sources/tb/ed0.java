package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.tanx.exposer.AdMonitorInitResult;
import com.tanx.exposer.achieve.AdMonitorCommitResult;
import com.tanx.exposer.achieve.AdMonitorType;
import java.util.List;
import tb.icy;
import tb.rcy;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class ed0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public ad0 f18488a;
    public hcy b;
    public Context c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public static volatile ed0 f18489a = new ed0();

        static {
            t2o.a(283115529);
        }
    }

    static {
        t2o.a(283115527);
    }

    public static ed0 h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ed0) ipChange.ipc$dispatch("ff3c9d8c", new Object[0]);
        }
        return b.f18489a;
    }

    public AdMonitorCommitResult a(List<String> list, bd0 bd0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AdMonitorCommitResult) ipChange.ipc$dispatch("d05bfc8d", new Object[]{this, list, bd0Var});
        }
        return icy.a.f21249a.a(AdMonitorType.CLICK, list, bd0Var);
    }

    public AdMonitorCommitResult b(List<String> list, bd0 bd0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AdMonitorCommitResult) ipChange.ipc$dispatch("f672a03", new Object[]{this, list, bd0Var});
        }
        return icy.a.f21249a.a(AdMonitorType.EXPOSE, list, bd0Var);
    }

    public AdMonitorCommitResult c(List<String> list, bd0 bd0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AdMonitorCommitResult) ipChange.ipc$dispatch("afde6f11", new Object[]{this, list, bd0Var});
        }
        return icy.a.f21249a.a(AdMonitorType.INTERACT, list, bd0Var);
    }

    public hcy d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hcy) ipChange.ipc$dispatch("f002175d", new Object[]{this});
        }
        return this.b;
    }

    public ad0 e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ad0) ipChange.ipc$dispatch("b0aa1258", new Object[]{this});
        }
        return this.f18488a;
    }

    public Context f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this});
        }
        return this.c;
    }

    public AdMonitorInitResult g(Context context, ad0 ad0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AdMonitorInitResult) ipChange.ipc$dispatch("3617a85a", new Object[]{this, context, ad0Var});
        }
        try {
            if (ad0Var == null) {
                qgh.d("adMonitorInitError", "params is null");
                return AdMonitorInitResult.PARAMS_ERROR;
            }
            this.c = context.getApplicationContext();
            this.f18488a = ad0Var;
            this.b = new hcy();
            kcy.a().b(ad0Var.b());
            rcy.e.tanxc_do.b(context, this);
            return AdMonitorInitResult.SUCCESS;
        } catch (Exception e) {
            e.printStackTrace();
            qgh.d("adMonitorInitError", e.getMessage());
            return AdMonitorInitResult.INTERNAL_ERROR;
        }
    }

    public void i(leb lebVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a1beabe", new Object[]{this, lebVar});
            return;
        }
        hcy hcyVar = this.b;
        if (hcyVar != null) {
            hcyVar.g(lebVar);
        }
    }

    public ed0() {
    }
}
