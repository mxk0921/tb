package tb;

import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.service.event.AURAEventIO;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.adam.common.Util;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.log.TLog;
import java.util.HashMap;

/* compiled from: Taobao */
@AURAExtensionImpl(code = "adam.impl.aspect.error.eventChain")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class mj1 implements wab {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final oj1 f24073a = new oj1();
    public nh3 b;
    public AURAGlobalData c;
    public yi d;
    public AURAFlowData e;
    public hbb f;

    static {
        t2o.a(350224395);
        t2o.a(79691951);
    }

    @Override // tb.ybb
    public void onCreate(lo loVar, yi yiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe8206ca", new Object[]{this, loVar, yiVar});
        } else {
            this.d = yiVar;
        }
    }

    @Override // tb.lbb
    public void onDataChanged(AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, hbb hbbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bab53acc", new Object[]{this, aURAFlowData, aURAGlobalData, hbbVar});
            return;
        }
        this.c = aURAGlobalData;
        this.e = aURAFlowData;
        this.f = hbbVar;
    }

    @Override // tb.ybb
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        }
    }

    @Override // tb.wab
    public void b(mi miVar) {
        AURAEventIO aURAEventIO;
        DXRuntimeContext dXRuntimeContext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b02141a5", new Object[]{this, miVar});
        } else if (!"true".equals(OrangeConfig.getInstance().getConfig("adam_android", "isDegradeAuraExt", "false")) && miVar.d() != null) {
            try {
                aURAEventIO = (AURAEventIO) miVar.d().get("event");
            } catch (ClassCastException unused) {
                aURAEventIO = null;
            }
            if (aURAEventIO != null && (dXRuntimeContext = (DXRuntimeContext) aURAEventIO.getEventModel().g(qi.EXT_KEY_DX_RUNTIME_CONTEXT)) != null) {
                Object q = dXRuntimeContext.q();
                if (q instanceof qh) {
                    qh qhVar = (qh) q;
                    if (qhVar.h() == null) {
                        qhVar.o(new HashMap());
                    }
                    qhVar.h().put("adamAuraErrCb", this.f);
                    qhVar.h().put("adamAuraExtManager", this.d);
                    qhVar.h().put("adamAuraFlowData", this.e);
                    qhVar.h().put("adamAuraGlobalData", this.c);
                    qhVar.h().put("adamAuraEventIo", aURAEventIO);
                }
                HashMap hashMap = new HashMap();
                HashMap<String, String> c = Util.c("aura", aURAEventIO.getEventType(), dXRuntimeContext);
                hashMap.put("utParams", c);
                JSONObject jSONObject = new JSONObject();
                Util.b(aURAEventIO.getEventModel().a(), jSONObject);
                hashMap.put("event_adam_config", jSONObject);
                hashMap.put("auraTemplates", this.c.get("templates", JSONArray.class));
                hashMap.put("global_adam_config", this.c.get("adamConfig", JSONObject.class));
                if (this.b == null) {
                    this.b = new nh3();
                }
                jh3 jh3Var = new jh3();
                jh3Var.d(hashMap);
                jh3Var.c(dXRuntimeContext);
                try {
                    this.b.b(this.f24073a, aURAEventIO.getEventModel().b(), new Object[]{aURAEventIO.getEventType(), aURAEventIO.getEventModel().c()}, jh3Var);
                    Util.m("exposure_transAuraToEvChain", c);
                } catch (Throwable th) {
                    AppMonitor.Counter.commit("ADAM_MONITOR", "HandleEventByAura-ERROR", "msg = " + th.toString(), 1.0d);
                    TLog.logi(null, "LOG_ADAM", "execute evChain from aura error: " + th.getMessage());
                }
            }
        }
    }
}
