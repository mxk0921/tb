package tb;

import android.text.TextUtils;
import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.List;
import tb.vm0;

/* compiled from: Taobao */
@AURAExtensionImpl(code = "alibuy.impl.aspect.error.alarm.monitor.handler")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class zl0 extends vt {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public List<String> e;

    static {
        t2o.a(301989984);
    }

    public static /* synthetic */ Object ipc$super(zl0 zl0Var, String str, Object... objArr) {
        if (str.hashCode() == -1162528052) {
            super.onDataChanged((AURAFlowData) objArr[0], (AURAGlobalData) objArr[1], (hbb) objArr[2]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/buy/extension/monitor/AliBuyAlarmMonitorExtension");
    }

    public final kk J0(mi miVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kk) ipChange.ipc$dispatch("2d8e5b7e", new Object[]{this, miVar});
        }
        kk kkVar = (kk) fk.b(miVar.d(), "NextRPCRemoteResponse", kk.class, null);
        if (kkVar == null) {
            return (kk) x().get("aura_data_response", kk.class);
        }
        return kkVar;
    }

    public final String m0() {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fb146aad", new Object[]{this});
        }
        JSONObject jSONObject3 = (JSONObject) x().get("aura_data_protocol_json", JSONObject.class);
        if (jSONObject3 == null || (jSONObject = jSONObject3.getJSONObject("global")) == null || (jSONObject2 = jSONObject.getJSONObject("paymentData")) == null) {
            return null;
        }
        return jSONObject2.getString("payType");
    }

    @Override // tb.zs, tb.lbb
    public void onDataChanged(AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, hbb hbbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bab53acc", new Object[]{this, aURAFlowData, aURAGlobalData, hbbVar});
            return;
        }
        super.onDataChanged(aURAFlowData, aURAGlobalData, hbbVar);
        this.e = qo0.d();
    }

    @Override // tb.vt
    public boolean L(mi miVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fc8be5ba", new Object[]{this, miVar})).booleanValue();
        }
        String d = B().d();
        if ("purchase".equals(d) || "confirmOrder".equals(d)) {
            try {
                return K0(d, miVar);
            } catch (Throwable th) {
                vm0.e("ALARM_MONITOR_ERROR", th.getMessage());
            }
        }
        return false;
    }

    public final boolean K0(String str, mi miVar) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c25932c9", new Object[]{this, str, miVar})).booleanValue();
        }
        if ("AURANextRPCServiceDomain".equals(miVar.c())) {
            kk J0 = J0(miVar);
            if (J0 == null) {
                return false;
            }
            List<String> list = this.e;
            if (list == null || !list.contains(J0.h())) {
                String str3 = (String) B().g("purchaseFrom", String.class);
                HashMap hashMap = new HashMap();
                hashMap.put("openFrom", str3);
                hashMap.put("payType", m0());
                String f = J0.f();
                p5j from = vm0.b.o(J0.a(), false).n(ik.a(J0)).m(J0.g().a()).from(str3);
                if (TextUtils.isEmpty(f)) {
                    f = J0.h();
                }
                vm0.f(from.message(f).j(hashMap).sampling(1.0f));
                return true;
            }
            ck.g().e("AliBuyAlarmMonitorExtension", J0.h() + " 在黑名单");
            return true;
        } else if ("AURAEventServiceDomain".equals(miVar.c())) {
            vm0.d(vm0.a.a("TBBuyEvent_" + miVar.b()).tag(miVar.e()).success(false).sampling(0.1f));
            return true;
        } else if ("AURASubmitServiceDomain".equals(miVar.c())) {
            vm0.d(vm0.a.a("TBBuyEvent_submit").tag(miVar.e()).success(false).sampling(0.1f));
            return true;
        } else {
            String str4 = str + "#" + miVar.b() + "（" + miVar.e() + "）";
            if (miVar.f() == 0) {
                str2 = "abortErrorMonitor";
            } else {
                str2 = "loggerErrorMonitor";
            }
            vm0.d(vm0.a.a(str2).message(miVar.e()).tag(str4).indicator("c1", B().d()).sampling(0.001f));
            return true;
        }
    }
}
