package tb;

import android.text.TextUtils;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.utils.UltronTradeHybridSwitcherHelper;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.a;
import java.util.ArrayList;
import java.util.List;
import mtopsdk.mtop.domain.MtopResponse;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ecv implements t5e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final cbv f18482a;
    public ArrayList<s5e> b;

    static {
        t2o.a(157286850);
        t2o.a(157286824);
        t2o.a(157286825);
    }

    public ecv(cbv cbvVar) {
        this.f18482a = cbvVar;
    }

    @Override // tb.t5e
    public void a(String str, String str2, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb77c2b6", new Object[]{this, str, str2, jSONObject});
        } else {
            c(str, str2, i(jSONObject));
        }
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c7fe5d", new Object[]{this, str});
        } else {
            gcv.a(str);
        }
    }

    public boolean d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4a25e695", new Object[]{this, str, str2})).booleanValue();
        }
        return UltronTradeHybridSwitcherHelper.f(str, str2);
    }

    public void e(boolean z, JSONObject jSONObject, MtopResponse mtopResponse, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4538f2", new Object[]{this, new Boolean(z), jSONObject, mtopResponse, new Long(j)});
        } else {
            gcv.i(z, jSONObject, mtopResponse, Long.valueOf(j));
        }
    }

    public void f(a aVar, pcu pcuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39c9d3c2", new Object[]{this, aVar, pcuVar});
        } else {
            gcv.j(aVar, pcuVar);
        }
    }

    public void g(s5e s5eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26fab851", new Object[]{this, s5eVar});
            return;
        }
        if (this.b == null) {
            this.b = new ArrayList<>();
        }
        this.b.add(s5eVar);
    }

    public JSONObject i(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("367da879", new Object[]{this, jSONObject});
        }
        return lbv.o(jSONObject);
    }

    public final void h(String str, JSONObject jSONObject, String str2) {
        List<fcv> list;
        zbv zbvVar;
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51f767e8", new Object[]{this, str, jSONObject, str2});
            return;
        }
        cbv cbvVar = this.f18482a;
        if (cbvVar == null) {
            hav.d("UltronTradeHybridPreRequestManager.sendPreRequestByScene", "mConfig is null");
            return;
        }
        hcv c = cbvVar.c(str);
        if (c == null || (list = c.c) == null) {
            hav.d("UltronTradeHybridPreRequestManager.sendPreRequestByScene", "sceneModel or sceneModel.preRequestModels is null");
            return;
        }
        for (fcv fcvVar : list) {
            if (fcvVar != null) {
                if (!d(str, fcvVar.f19194a)) {
                    hav.d("UltronTradeHybridPreRequestManager.sendPreRequestByScene", str + " switcher is off");
                } else if (!TextUtils.equals(fcvVar.e, str2)) {
                    hav.d("UltronTradeHybridPreRequestManager.sendPreRequestByScene", "no match stage");
                } else {
                    if (!TextUtils.isEmpty(fcvVar.f) && lbv.m(fcvVar.f)) {
                        Object n = lbv.n(fcvVar.f, jSONObject);
                        if (n instanceof String) {
                            z = Boolean.valueOf((String) n).booleanValue();
                        } else if (n instanceof Boolean) {
                            Boolean bool = (Boolean) n;
                            bool.booleanValue();
                            z = bool.booleanValue();
                        } else {
                            z = false;
                        }
                        if (!z) {
                            hav.d("UltronTradeHybridPreRequestManager.sendPreRequestByScene", "no match enableCondition");
                        }
                    }
                    if (fcvVar.h && jSONObject != null && !TextUtils.isEmpty(jSONObject.getString("preRequestUniqueKey"))) {
                        String string = jSONObject.getString("preRequestUniqueKey");
                        String a2 = qbv.j().g().a(string, fcvVar.f19194a);
                        if (TextUtils.equals(a2, gcv.PRE_REQUEST_FAIL_TAG)) {
                            qbv.j().g().d(string, fcvVar.f19194a);
                        }
                        if (!TextUtils.isEmpty(a2) && !TextUtils.equals(a2, gcv.PRE_REQUEST_FAIL_TAG)) {
                        }
                    }
                    if (this.b != null) {
                        zbvVar = new zbv(str, fcvVar, jSONObject, this.b);
                    } else {
                        zbvVar = new zbv(str, fcvVar, jSONObject);
                    }
                    p9b.m(fcvVar.b, jSONObject, "", fcvVar.i, zbvVar);
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00d6, code lost:
        if (r28.equals(com.alibaba.android.ultron.vfw.weex2.highPerformance.model.UltronTradeHybridStage.ON_IDLE) == false) goto L_0x006b;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(java.lang.String r28, java.lang.String r29, com.alibaba.fastjson.JSONObject r30) {
        /*
            Method dump skipped, instructions count: 502
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.ecv.c(java.lang.String, java.lang.String, com.alibaba.fastjson.JSONObject):void");
    }
}
