package tb;

import android.text.TextUtils;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.utils.UltronTradeHybridSwitcherHelper;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.utils.UnifyLog;
import com.taobao.android.weex_framework.a;
import com.taobao.android.weex_framework.common.MUSEventTarget;
import com.taobao.login4android.api.Login;
import java.util.ArrayList;
import java.util.Iterator;
import mtopsdk.mtop.domain.MtopResponse;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class zbv implements s5e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f32679a;
    public final fcv b;
    public final JSONObject c;
    public final ArrayList<s5e> d;

    static {
        t2o.a(157286890);
        t2o.a(157286885);
    }

    public zbv(String str, fcv fcvVar, JSONObject jSONObject) {
        this.f32679a = str;
        this.b = fcvVar;
        this.c = jSONObject;
    }

    @Override // tb.s5e
    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb8b0117", new Object[]{this, str, str2});
            return;
        }
        UnifyLog.e("UltronTradeHybridPreRequestCallback.onFailed", "errorCode:" + str + ",errorMsg:" + str2);
        d(null);
    }

    @Override // tb.s5e
    public void b(boolean z, JSONObject jSONObject, MtopResponse mtopResponse) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0c15975", new Object[]{this, new Boolean(z), jSONObject, mtopResponse});
            return;
        }
        if (TextUtils.isEmpty(this.f32679a)) {
            str = "";
        } else {
            str = this.f32679a;
        }
        if (UltronTradeHybridSwitcherHelper.i(str, "")) {
            qbv.j().p().e(z, jSONObject, mtopResponse, this.b.c.b);
        }
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11d772cf", new Object[]{this});
            return;
        }
        ArrayList<s5e> arrayList = this.d;
        if (arrayList != null) {
            Iterator<s5e> it = arrayList.iterator();
            while (it.hasNext()) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("url", (Object) this.b.b.f26004a);
                it.next().onSuccess(jSONObject);
            }
        }
    }

    @Override // tb.s5e
    public void onSuccess(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("980108a5", new Object[]{this, jSONObject});
            return;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("data");
        if (jSONObject2 == null) {
            UnifyLog.e("UltronTradeHybridPreRequestCallback.onSuccess", "responseData is null");
        } else if (this.c == null) {
            UnifyLog.e("UltronTradeHybridPreRequestCallback.onSuccess", "mParams is null");
        } else {
            d(jSONObject2);
            fcv fcvVar = this.b;
            String str = fcvVar.d;
            if (str != null) {
                if (str.contains("${userId}")) {
                    str = str.replace("${userId}", Login.getUserId());
                }
                if (gcv.INSTANCE.e().contains(this.b.f19194a)) {
                    jSONObject2.put(gcv.PRE_REQUEST_DATA_TIME_TAG, (Object) Long.valueOf(System.currentTimeMillis()));
                }
                bbv g = qbv.j().g();
                String i = lbv.i(str, this.c);
                String jSONString = jSONObject2.toJSONString();
                fcv fcvVar2 = this.b;
                g.e(i, jSONString, fcvVar2.f19194a, Long.valueOf(fcvVar2.c.b));
                c();
                return;
            }
            String i2 = lbv.i(fcvVar.c.f21924a, this.c);
            icv q = qbv.j().q();
            String str2 = this.f32679a;
            fcv fcvVar3 = this.b;
            q.h(str2, fcvVar3, i2, jSONObject2, fcvVar3.c.b);
            c();
        }
    }

    public final void d(JSONObject jSONObject) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfad7564", new Object[]{this, jSONObject});
        } else if (!v9v.i(UltronTradeHybridSwitcherHelper.ORANGE_KEY_HYBRID_CONTAINER, "enableTradeHybridBackgroundTransfer", false)) {
            hav.d("UltronTradeHybridPreRequestCallback.sendBackgroundMessageToWeex2", "orange is off");
        } else {
            String str2 = this.b.g;
            if (TextUtils.isEmpty(str2)) {
                hav.d("UltronTradeHybridPreRequestCallback.sendBackgroundMessageToWeex2", "relatedPreRenderUrl is EMPTY");
                return;
            }
            JSONObject jSONObject2 = new JSONObject();
            if (jSONObject != null) {
                jSONObject2.put("responseData", (Object) jSONObject);
            }
            if (jSONObject != null) {
                str = "success";
            } else {
                str = "fail";
            }
            jSONObject2.put("result", (Object) str);
            JSONObject jSONObject3 = this.c;
            if (jSONObject3 != null) {
                jSONObject2.putAll(jSONObject3);
                if (jSONObject2.containsKey("context")) {
                    jSONObject2.remove("context");
                }
            }
            Object f = qbv.j().f(str2);
            if (f instanceof String) {
                qbv.j().c(f, jSONObject2);
                hav.d("UltronTradeHybridPreRequestCallback.sendBackgroundMessageToWeex2", "backgroundPreRenderInstance is not ready(instance is string)");
            } else if (!(f instanceof a)) {
                hav.d("UltronTradeHybridPreRequestCallback.sendBackgroundMessageToWeex2", "backgroundPreRenderInstance is null");
            } else {
                a aVar = (a) f;
                ybv a2 = ybv.a(aVar);
                if (a2 == null || !a2.c()) {
                    qbv.j().c(aVar, jSONObject2);
                    hav.d("UltronTradeHybridPreRequestCallback.sendBackgroundMessageToWeex2", "backgroundPreRenderInstance is not ready");
                    return;
                }
                aVar.dispatchEvent(MUSEventTarget.MUS_DOCUMENT_TARGET, "preload.background", jSONObject2);
            }
        }
    }

    public zbv(String str, fcv fcvVar, JSONObject jSONObject, ArrayList<s5e> arrayList) {
        this.f32679a = str;
        this.b = fcvVar;
        this.c = jSONObject;
        this.d = arrayList;
    }
}
