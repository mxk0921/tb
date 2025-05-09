package tb;

import android.app.Activity;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.buy.internal.AliBuyPresenterImpl;
import mtopsdk.mtop.domain.MtopResponse;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public abstract class fv extends us {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String REASON_AURA_ERROR = "auraError";
    public static final String REASON_PROTOCOL_DEGRADE = "protocolDegrade";
    public static final String REASON_SERVICE_ERROR = "serviceError";

    static {
        t2o.a(708837478);
    }

    public static /* synthetic */ Object ipc$super(fv fvVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/purchase/aura/extension/aspect/AbsErrorDowngradeExtension");
    }

    public abstract void J0(boolean z, JSONObject jSONObject, String str, String str2, String str3);

    public final JSONObject K0(mi miVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("36e21334", new Object[]{this, miVar});
        }
        return (JSONObject) fk.b(miVar.d(), "NextRPCRemoteResponseJson", JSONObject.class, null);
    }

    @Override // tb.wab
    public void b(mi miVar) {
        ni a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b02141a5", new Object[]{this, miVar});
            return;
        }
        String b = miVar.b();
        if (!"-3003_PROTOCOL_DEGRADE".equals(b)) {
            if ("AURANextRPCServiceDomain".equals(miVar.c())) {
                kk kkVar = (kk) fk.b(miVar.d(), "NextRPCRemoteResponse", kk.class, null);
                if (kkVar == null) {
                    x().b(new mi(1, us.ERROR_DOMAIN, "emptyRemoteResponse", "RemoteResponse为空"));
                    return;
                }
                String h = kkVar.h();
                MtopResponse e = kkVar.e();
                if (e == null) {
                    x().b(new mi(1, us.ERROR_DOMAIN, "emptyMtopResponse", "MtopResponse为空"));
                    return;
                } else if ("F-10000-00-15-002".equals(h) && (a2 = miVar.a()) != null) {
                    String a3 = a2.a();
                    if ("aura.workflow.adjust".equals(a3) || AliBuyPresenterImpl.DEFAULT_AURA_BUY_MAIN_FLOW.equals(a3) || "aura.workflow.request".equals(a3)) {
                        J0(true, null, "serviceError", h, x8r.a(e));
                        return;
                    }
                } else {
                    return;
                }
            }
            if ("-3000_EMPTY_PROTOCOL_VERSION_BELOW_4".equals(b) || "-3001_BUY2_DOWNGRADE".equals(b)) {
                J0(true, K0(miVar), "protocolDegrade", b, null);
                return;
            }
            String c = miVar.c();
            if (miVar.f() == 0 && !"AURANextRPCServiceDomain".equals(c)) {
                if (!"confirmOrder".equals(L().d()) || !"-1000_EMPTY_RENDER_TREE".equals(b)) {
                    J0(false, null, "auraError", b, null);
                }
            }
        } else if (L().f() instanceof Activity) {
            xt7.b((Activity) L().f(), xt7.b);
        }
    }
}
