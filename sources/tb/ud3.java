package tb;

import android.text.TextUtils;
import com.alibaba.ability.localization.Localization;
import com.alibaba.android.umbrella.trace.UmbrellaTracker;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.taobao.R;
import com.uc.webview.export.extension.UCClient;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ud3 extends lmb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(479199426);
    }

    public static /* synthetic */ Object ipc$super(ud3 ud3Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/icart/core/event/CartSubmitClickSubscriber");
    }

    @Override // tb.l12
    public void j(lcu lcuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fbad8af", new Object[]{this, lcuVar});
            return;
        }
        boolean r = r(lcuVar);
        if (!r || h0r.i()) {
            List<IDMComponent> q = q(r);
            if (q != null && !q.isEmpty()) {
                lcu d = this.j.g().d();
                d.l("cartSubmit");
                d.i(this.e);
                d.q("");
                Object e = lcuVar.e("extraParams");
                if (e instanceof Object[]) {
                    Object[] objArr = (Object[]) e;
                    if (objArr.length > 1) {
                        d.m(UCClient.UI_PARAMS_KEY_GESTURE, objArr[1]);
                    }
                }
                d.k(q);
                d.m("eventFields", c());
                this.j.g().h(d);
            }
            if (!r) {
                HashMap hashMap = new HashMap();
                hashMap.put("selectedItemCount", String.valueOf(cb4.u(this.d)));
                JSONObject m = sca.m(this.k);
                if (m != null && !m.isEmpty()) {
                    for (String str : m.keySet()) {
                        hashMap.put(str, m.get(str) + "");
                    }
                }
                if (this.e.getFields() != null && this.e.getFields().getBooleanValue("isHideCalculateBtn")) {
                    hashMap.put("isLocalCalculate", String.valueOf(true));
                }
                p(hashMap);
                juv.a(this.j, "Page_ShoppingCart_Submit_SettlementClick", hashMap);
            }
        }
    }

    public final void p(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("346adbdf", new Object[]{this, map});
            return;
        }
        List<IDMComponent> v = cb4.v(this.d);
        if (!(v == null || v.isEmpty())) {
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            for (int i = 0; i < v.size(); i++) {
                IDMComponent iDMComponent = v.get(i);
                if (iDMComponent != null) {
                    String id = iDMComponent.getId();
                    if (!TextUtils.isEmpty(id)) {
                        sb.append(id);
                        if (i < v.size() - 1) {
                            sb.append("_");
                        }
                    }
                    String string = iDMComponent.getFields().getJSONObject("sku").getString(q2q.KEY_SKU_ID);
                    if (!TextUtils.isEmpty(string)) {
                        sb2.append(string);
                        if (i < v.size() - 1) {
                            sb2.append("_");
                        }
                    }
                }
            }
            map.put("itemIds", sb.toString());
            map.put("skuIds", sb2.toString());
        }
    }

    public final List<IDMComponent> q(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("d936f42e", new Object[]{this, new Boolean(z)});
        }
        List<IDMComponent> v = cb4.v(this.d);
        int size = v != null ? v.size() : 0;
        if (size > 0) {
            int d = sca.d(this.k);
            if (size > d) {
                if (z) {
                    return null;
                }
                be3.c(this.b, this.b.getString(R.string.ack_charge_max_tips, Integer.valueOf(d)));
                UmbrellaTracker.traceProcessEnd("clickSubmitError", "submit", "1.0");
                juv.d(this.j, "Page_ShoppingCart_Settlement_OverLimit", new String[0]);
                ub3.d("settlementOverMax", "结算数量超限", true, 1.0f);
                return null;
            } else if (!evq.g(this.k, v)) {
                return v;
            } else {
                if (z) {
                    return null;
                }
                tka d2 = evq.d(this.k, v);
                lcu d3 = this.j.g().d();
                d3.l("cartGroupSubmit");
                d3.i(this.e);
                d3.q("");
                d3.k(v);
                d3.m(tka.TAG, d2);
                this.j.g().h(d3);
                return null;
            }
        } else if (z) {
            return null;
        } else {
            be3.c(this.b, Localization.q(R.string.taobao_app_1028_1_21669));
            juv.d(this.j, "Page_ShoppingCart_Settlement_NoCheck", new String[0]);
            return null;
        }
    }

    public final boolean r(lcu lcuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ed8f7d32", new Object[]{this, lcuVar})).booleanValue();
        }
        Object e = lcuVar.e("extraParams");
        if (e instanceof Object[]) {
            Object[] objArr = (Object[]) e;
            if (objArr.length > 1) {
                return "onActionDown".equals(objArr[1]);
            }
        }
        return false;
    }
}
