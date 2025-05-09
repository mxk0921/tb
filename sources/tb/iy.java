package tb;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import anet.channel.util.HttpConstant;
import com.alibaba.android.icart.core.QueryParamsManager;
import com.alibaba.android.icart.core.data.config.RequestConfig;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.common.utils.UnifyLog;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public abstract class iy implements jod {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final zxb f21638a;
    public final Context b;
    public final vd3 c;
    public final kmb d;

    static {
        t2o.a(479199325);
        t2o.a(479199326);
    }

    public iy(zxb zxbVar) {
        this.f21638a = zxbVar;
        kmb x = zxbVar.x();
        this.d = x;
        this.b = zxbVar.x().getContext();
        this.c = new vd3(x);
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5bdcb0b", new Object[]{this, str});
        } else if (("cartAdjustOperate".equals(str) || "changeQuantity".equals(str) || "cartShowSku".equals(str)) && this.f21638a.w().getControlParas() != null) {
            this.f21638a.s();
        }
    }

    public JSONObject c(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("950efa5a", new Object[]{this, map});
        }
        String str = map.get("exParams");
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        JSONObject parseObject = JSON.parseObject(str);
        if (parseObject == null) {
            return new JSONObject();
        }
        return parseObject;
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("68212469", new Object[]{this})).booleanValue();
        }
        if (!this.f21638a.J() || !this.f21638a.G()) {
            return false;
        }
        if (cb4.I(this.f21638a.c()) <= 5) {
            return true;
        }
        return sca.C(this.f21638a);
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("827d5d13", new Object[]{this})).booleanValue();
        }
        if (!this.f21638a.G() || !this.f21638a.J() || this.f21638a.B().Y() >= 6 || cb4.I(this.f21638a.c()) > 5) {
            return false;
        }
        return true;
    }

    public void g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3f00756", new Object[]{this, str});
        } else if ("reorderDrag".equals(str) || "cartAdjustOperate".equals(str) || "changeQuantity".equals(str) || "closeBanner".equals(str) || "cartShowSku".equals(str) || "reorderClick".equals(str) || "cartSelect".equals(str)) {
            Bundle bundle = new Bundle();
            bundle.putBoolean(hd3.c, false);
            bundle.putString(hd3.e, hd3.h);
            bundle.putBoolean(hd3.f, "cartSelect".equals(str));
            hd3.b(this.b, bundle);
        }
    }

    public void h(RequestConfig requestConfig) {
        Map<String, List<String>> headerFields;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32ed8486", new Object[]{this, requestConfig});
        } else if (requestConfig.f() != null && (headerFields = requestConfig.f().getHeaderFields()) != null && headerFields.get(HttpConstant.EAGLE_EYE_ID_2) != null && !headerFields.get(HttpConstant.EAGLE_EYE_ID_2).isEmpty()) {
            UnifyLog.d("AbsSendRequest", "requestType=" + requestConfig.i() + ",traceId=" + headerFields.get(HttpConstant.EAGLE_EYE_ID_2).get(0));
        }
    }

    public void j(RequestConfig requestConfig) {
        gsb gsbVar;
        JSONObject fields;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9846ee3", new Object[]{this, requestConfig});
        } else if (vav.a(c9x.CART_BIZ_NAME, "cartChangeIDMEvent", true)) {
            fsb c = this.f21638a.c();
            lcu k = requestConfig.k();
            if (c == null) {
                hav.a("updateTriggerEventConfig", "idmContext is null");
            } else if (k != null && "true".equals(String.valueOf(k.e("_isSupportChangeIDMEvent")))) {
                IDMComponent componentByName = c.getComponentByName(requestConfig.b().getKey());
                if (componentByName == null) {
                    hav.a("updateTriggerEventConfig", "component is null");
                    return;
                }
                requestConfig.s(componentByName);
                if (componentByName.getEventMap() == null) {
                    hav.a("updateTriggerEventConfig", "component.getEventMap is null");
                    return;
                }
                List<gsb> list = componentByName.getEventMap().get(k.g());
                if (list != null) {
                    Iterator<gsb> it = list.iterator();
                    while (it.hasNext()) {
                        gsbVar = it.next();
                        if (TextUtils.equals(k.d(), gsbVar.getType())) {
                            break;
                        }
                    }
                }
                gsbVar = null;
                if (gsbVar != null && gsbVar != k.c()) {
                    if (!(!(k.c() instanceof gsb) || (fields = ((gsb) k.c()).getFields()) == null || fields.getInnerMap() == null)) {
                        gsbVar.getFields().putAll(fields.getInnerMap());
                    }
                    k.k(gsbVar);
                }
            }
        }
    }

    public boolean d(MtopResponse mtopResponse, Map<String, ? extends Object> map) {
        boolean z;
        boolean z2 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2291523c", new Object[]{this, mtopResponse, map})).booleanValue();
        }
        ya3 ya3Var = new ya3();
        if (mtopResponse != null && !mtopResponse.isApiSuccess()) {
            return false;
        }
        u55 u55Var = (u55) this.f21638a.c();
        if ((u55Var != null && u55Var.d() && this.f21638a.B().f() == null) || (map.containsKey("isCachaData") && "true".equals(map.get("isCachaData")))) {
            return false;
        }
        Object obj = map.get("protocolVersion");
        if (obj instanceof String) {
            z = ya3Var.b((String) obj);
            if (z) {
                hav.d(((vc3) this.d).c(), "购物车降级#奥创版本小于3.0");
            }
        } else {
            z = true;
        }
        if (z || u55Var == null || !u55Var.R()) {
            z2 = z;
        } else {
            hav.d(((vc3) this.d).c(), "购物车降级#奥创协议标记让降级");
        }
        if (z2) {
            ya3Var.c(this.d, mtopResponse, ya3.TYPE_PROTOCOL_DOWNGRADE);
        } else {
            ya3Var.d(this.d);
        }
        return z2;
    }

    public void i(JSONObject jSONObject, RequestConfig requestConfig) {
        boolean z;
        Exception e;
        boolean z2 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("678d9f13", new Object[]{this, jSONObject, requestConfig});
            return;
        }
        QueryParamsManager W = this.f21638a.x().W();
        jSONObject.put("globalSell", "1");
        jSONObject.put("mergeCombo", "true");
        jSONObject.put("version", "1.1.1");
        if (kjf.a()) {
            jSONObject.put(v4s.PARAM_IS_INNER, (Object) String.valueOf(kjf.a()));
        }
        if (!TextUtils.isEmpty(ziq.c().b())) {
            jSONObject.put("addressId", (Object) ziq.c().b());
        }
        if (W.g() != null) {
            jSONObject.put("cartSortParams", (Object) W.g());
        }
        String e2 = this.f21638a.x().W().e();
        if (!TextUtils.isEmpty(e2)) {
            jSONObject.put("cartCustomExParam", (Object) e2);
        }
        String e3 = this.f21638a.B().e();
        if (!TextUtils.isEmpty(e3)) {
            jSONObject.put("tabFilterItem", (Object) e3);
        }
        if (!TextUtils.isEmpty(this.f21638a.y())) {
            jSONObject.put("filterItem", (Object) this.f21638a.y());
        }
        if (this.f21638a.B().z()) {
            jSONObject.put("isPromotionChecked", "true");
        }
        String p = this.f21638a.B().p();
        if (!TextUtils.isEmpty(p)) {
            jSONObject.put("transparentState", (Object) p);
        }
        if (!requestConfig.l() && sca.A(this.f21638a)) {
            jSONObject.put("mixCart", "true");
        }
        String l = this.d.W().l();
        if (!TextUtils.isEmpty(l)) {
            jSONObject.put("holdCustomExParams", (Object) l);
        }
        jSONObject.put("instanceId", (Object) this.f21638a.B().q());
        if (requestConfig.m || !ob7.d(requestConfig, this.f21638a.c())) {
            this.f21638a.B().M(false);
        } else {
            jSONObject.put("hasDeleteQueryParam", "true");
            z9v.u(this.b).e("hasDeleteQueryParam", "true");
            this.f21638a.B().M(true);
            hav.g(c9x.CART_BIZ_NAME, requestConfig.i().name(), "#删除上行queryParams");
        }
        long h = requestConfig.h();
        if (h > 0) {
            hav.d(c9x.CART_BIZ_NAME, "复用Mtop本地预加载模式的时间戳");
            jSONObject.put(RequestConfig.sKeyRequestTimestamp, (Object) Long.valueOf(h));
        } else {
            jSONObject.put(RequestConfig.sKeyRequestTimestamp, (Object) Long.valueOf(System.currentTimeMillis()));
        }
        try {
            z = false;
            for (String str : h0r.j()) {
                try {
                    if (!z2) {
                        z2 = rcx.b(str);
                    }
                    if (!z) {
                        z = rcx.c(str);
                    }
                } catch (Exception e4) {
                    e = e4;
                    ub3.g("widgetGetInstalledError", e.getMessage());
                    jSONObject.put(RequestConfig.IS_SUPPORT_WIDGET, (Object) String.valueOf(z2));
                    jSONObject.put(RequestConfig.IS_WIDGET_INSTALLED, (Object) String.valueOf(z));
                }
            }
        } catch (Exception e5) {
            e = e5;
            z = false;
        }
        jSONObject.put(RequestConfig.IS_SUPPORT_WIDGET, (Object) String.valueOf(z2));
        jSONObject.put(RequestConfig.IS_WIDGET_INSTALLED, (Object) String.valueOf(z));
    }
}
