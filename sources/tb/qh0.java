package tb;

import android.text.TextUtils;
import com.alibaba.ability.localization.Localization;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.biz.afterbuy.IOrderListPrefetchService;
import com.taobao.infoflow.taobao.subservice.framework.dataservice.DosaContainerDataService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class qh0 implements DosaContainerDataService.d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public JSONObject f26745a;
    public b11 b;

    static {
        t2o.a(729809233);
        t2o.a(491782781);
    }

    @Override // com.taobao.infoflow.taobao.subservice.framework.dataservice.DosaContainerDataService.d
    public boolean a(DosaContainerDataService.e eVar, String str, String[] strArr, JSONObject jSONObject) {
        JSONObject jSONObject2;
        b11 b11Var;
        JSONObject jSONObject3;
        b11 b11Var2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bafcbb72", new Object[]{this, eVar, str, strArr, jSONObject})).booleanValue();
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (TextUtils.equals(str, "PageEnter") && TextUtils.equals(jSONObject.getString(IOrderListPrefetchService.NEED_SAVE_BIZ_PARAMS), "true")) {
            JSONObject jSONObject4 = jSONObject.getJSONObject("bizParam");
            String string = jSONObject.getString("containerId");
            if (!(jSONObject4 == null || string == null)) {
                this.f26745a = jSONObject4;
            }
            Object obj = jSONObject.get("apiInfo");
            if ((obj instanceof b11) && Localization.o()) {
                this.b = (b11) obj;
            }
        }
        if (TextUtils.equals(str, "LoadingViewClick") && (jSONObject3 = this.f26745a) != null) {
            jSONObject.put("bizParam", (Object) jSONObject3);
            if (strArr != null && strArr.length >= 1) {
                jSONObject.put("containerId", (Object) strArr[0]);
            }
            if (Localization.o() && (b11Var2 = this.b) != null) {
                jSONObject.put("apiInfo", (Object) b11Var2);
            }
        }
        if (TextUtils.equals(jSONObject.getString("isScrollNextPage"), "true") && (jSONObject2 = this.f26745a) != null) {
            jSONObject.put("bizParam", (Object) jSONObject2);
            if (Localization.o() && (b11Var = this.b) != null) {
                jSONObject.put("apiInfo", (Object) b11Var);
            }
        }
        if (TextUtils.equals(jSONObject.getString(IOrderListPrefetchService.NEED_APPEND_BIZ_PARAMS), "true")) {
            JSONObject jSONObject5 = jSONObject.getJSONObject("bizParam");
            if (jSONObject5 == null) {
                jSONObject5 = new JSONObject();
            }
            JSONObject jSONObject6 = this.f26745a;
            if (jSONObject6 != null) {
                jSONObject5.putAll(jSONObject6);
                jSONObject.put("bizParam", (Object) jSONObject5);
            }
        }
        return eVar.a(str, strArr, jSONObject);
    }
}
