package tb;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;

/* compiled from: Taobao */
@AURAExtensionImpl(code = "alibuy.impl.aspect.error.submit")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class lo0 implements wab {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public lo f23455a;
    public AURAGlobalData b;

    static {
        t2o.a(301990020);
        t2o.a(79691951);
    }

    public final void B(mi miVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82f186d0", new Object[]{this, miVar, new Boolean(z)});
            return;
        }
        gfb gfbVar = (gfb) this.f23455a.g("submit_callback", gfb.class);
        if (gfbVar != null) {
            gfbVar.c(this.f23455a, this.b);
            gfbVar.b(miVar, z);
        }
    }

    public final void L(Context context, kk kkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a206899", new Object[]{this, context, kkVar});
        } else if ((context instanceof Activity) && x(kkVar)) {
            bn0.g(context);
        }
    }

    @Override // tb.wab
    public void b(mi miVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b02141a5", new Object[]{this, miVar});
        } else if (miVar != null) {
            String b = miVar.b();
            Map<String, Object> d = miVar.d();
            if (!TextUtils.isEmpty(b)) {
                if (!"AURANextRPCServiceDomain".equals(miVar.c())) {
                    B(miVar, false);
                } else if (d != null) {
                    Object obj = d.get("NextRPCRemoteResponse");
                    if (obj instanceof kk) {
                        kk kkVar = (kk) obj;
                        if (om0.b(this.f23455a, kkVar)) {
                            aan aanVar = new aan(this.b);
                            aanVar.e();
                            L(this.f23455a.f(), kkVar);
                            aanVar.f(kkVar.e());
                            return;
                        }
                        MtopResponse e = kkVar.e();
                        if (e != null) {
                            String retCode = e.getRetCode();
                            int responseCode = e.getResponseCode();
                            if ("BUYER_ALIPAY_NOT_FOUND".equals(retCode)) {
                                B(miVar, false);
                            } else if ("FAIL_SYS_SESSION_EXPIRED".equals(retCode) || responseCode == 419) {
                                r();
                                B(miVar, true);
                            } else {
                                B(miVar, false);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // tb.ybb
    public void onCreate(lo loVar, yi yiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe8206ca", new Object[]{this, loVar, yiVar});
        } else {
            this.f23455a = loVar;
        }
    }

    @Override // tb.lbb
    public void onDataChanged(AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, hbb hbbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bab53acc", new Object[]{this, aURAFlowData, aURAGlobalData, hbbVar});
        } else {
            this.b = aURAGlobalData;
        }
    }

    @Override // tb.ybb
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        }
    }

    public final void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f622f449", new Object[]{this});
        } else {
            hh.d(this.f23455a.f());
        }
    }

    public final boolean x(kk kkVar) {
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
