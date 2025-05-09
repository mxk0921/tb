package tb;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;

/* compiled from: Taobao */
@AURAExtensionImpl(code = "tbwaitpay.impl.aspect.error.submit")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class nzr extends vs {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Context c;
    public lo d;

    static {
        t2o.a(725614629);
    }

    public static /* synthetic */ Object ipc$super(nzr nzrVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/waitpay/extension/modify/TBWaitPayModifyErrorExtension");
    }

    public final void K0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f622f449", new Object[]{this});
            return;
        }
        Context context = this.c;
        if (context instanceof Activity) {
            ((Activity) context).finish();
        }
    }

    public final void M0(mi miVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82f186d0", new Object[]{this, miVar, new Boolean(z)});
            return;
        }
        gfb gfbVar = (gfb) this.d.g("submit_callback", gfb.class);
        if (gfbVar != null) {
            gfbVar.b(miVar, z);
        }
    }

    public final void N0(Context context, kk kkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a206899", new Object[]{this, context, kkVar});
        } else if ((context instanceof Activity) && L0(kkVar)) {
            bn0.g(context);
        }
    }

    @Override // tb.wab
    public void b(mi miVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b02141a5", new Object[]{this, miVar});
            return;
        }
        String b = miVar.b();
        Map<String, Object> d = miVar.d();
        if (!TextUtils.isEmpty(b) && d != null) {
            if ("AURANextRPCServiceDomain".equals(miVar.c())) {
                Object obj = d.get("NextRPCRemoteResponse");
                if (obj instanceof kk) {
                    kk kkVar = (kk) obj;
                    if (vs.B(this.d, kkVar)) {
                        N0(this.c, kkVar);
                        return;
                    }
                    MtopResponse e = kkVar.e();
                    if (e != null) {
                        String retCode = e.getRetCode();
                        int responseCode = e.getResponseCode();
                        if ("FAIL_SYS_SESSION_EXPIRED".equals(retCode) || responseCode == 419) {
                            K0();
                            M0(miVar, true);
                            return;
                        }
                        M0(miVar, false);
                        return;
                    }
                    return;
                }
                return;
            }
            M0(miVar, false);
        }
    }

    @Override // tb.vs, tb.ybb
    public void onCreate(lo loVar, yi yiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe8206ca", new Object[]{this, loVar, yiVar});
            return;
        }
        this.d = loVar;
        this.c = loVar.f();
    }

    @Override // tb.vs, tb.lbb
    public void onDataChanged(AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, hbb hbbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bab53acc", new Object[]{this, aURAFlowData, aURAGlobalData, hbbVar});
        }
    }

    @Override // tb.vs, tb.ybb
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        }
    }

    public final boolean L0(kk kkVar) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b75703f", new Object[]{this, kkVar})).booleanValue();
        }
        JSONObject b = kkVar.b();
        if (bh.b(b)) {
            return false;
        }
        JSONObject jSONObject3 = b.getJSONObject("data");
        if (bh.b(jSONObject3) || (jSONObject = jSONObject3.getJSONObject("global")) == null || (jSONObject2 = jSONObject.getJSONObject("feature")) == null) {
            return false;
        }
        return Boolean.parseBoolean(jSONObject2.getString("tbRefreshCart"));
    }
}
