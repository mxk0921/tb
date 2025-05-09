package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.buy.internal.AliBuyPresenterImpl;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public abstract class ev extends vs {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String REASON_AURA_ERROR = "auraError";
    public static final String REASON_PROTOCOL_DEGRADE = "protocolDegrade";
    public static final String REASON_SERVICE_ERROR = "serviceError";

    static {
        t2o.a(725614622);
    }

    public static /* synthetic */ Object ipc$super(ev evVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/waitpay/extension/downgrade/AbsErrorDowngradeExtension");
    }

    public abstract void K0(boolean z, String str);

    @Override // tb.wab
    public void b(mi miVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b02141a5", new Object[]{this, miVar});
            return;
        }
        String b = miVar.b();
        if ("AURANextRPCServiceDomain".equals(miVar.c())) {
            kk kkVar = (kk) fk.b(miVar.d(), "NextRPCRemoteResponse", kk.class, null);
            if (kkVar == null) {
                L().b(new mi(1, vs.ERROR_DOMAIN, "emptyRemoteResponse", "RemoteResponse为空"));
                return;
            }
            kkVar.h();
            if (kkVar.e() == null) {
                L().b(new mi(1, vs.ERROR_DOMAIN, "emptyMtopResponse", "MtopResponse为空"));
                return;
            }
            ni a2 = miVar.a();
            if (a2 != null) {
                String a3 = a2.a();
                if ("aura.workflow.adjust".equals(a3) || AliBuyPresenterImpl.DEFAULT_AURA_BUY_MAIN_FLOW.equals(a3) || "aura.workflow.request".equals(a3)) {
                    K0(true, "serviceError");
                    return;
                }
            } else {
                return;
            }
        }
        if ("-3000_EMPTY_PROTOCOL_VERSION_BELOW_4".equals(b) || "-3001_BUY2_DOWNGRADE".equals(b)) {
            K0(true, "protocolDegrade");
            return;
        }
        String c = miVar.c();
        if (miVar.f() == 0 && !"AURANextRPCServiceDomain".equals(c)) {
            if (!"confirmOrder".equals(m0().d()) || !"-1000_EMPTY_RENDER_TREE".equals(b)) {
                K0(false, "auraError");
            }
        }
    }
}
