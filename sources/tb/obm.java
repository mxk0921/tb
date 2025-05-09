package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.pop.protocol.model.pop.IPopData;
import com.taobao.homepage.pop.utils.PopConst;
import com.taobao.infoflow.protocol.subservice.base.IJsBridgeService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class obm implements IJsBridgeService.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final e3b f25283a;

    static {
        t2o.a(491782596);
        t2o.a(488636530);
    }

    public obm(e3b e3bVar) {
        this.f25283a = e3bVar;
    }

    @Override // com.taobao.infoflow.protocol.subservice.base.IJsBridgeService.a
    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("70020a6e", new Object[]{this});
        }
        return "IFPop.popClickEvent";
    }

    @Override // com.taobao.infoflow.protocol.subservice.base.IJsBridgeService.a
    public void b(JSONObject jSONObject, IJsBridgeService.a.AbstractC0565a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22f743e3", new Object[]{this, jSONObject, aVar});
        } else if (jSONObject == null || jSONObject.isEmpty()) {
            aVar.error("bridge params is empty");
        } else {
            c(jSONObject.getInteger("eventType").intValue(), jSONObject, aVar);
        }
    }

    public void c(int i, JSONObject jSONObject, IJsBridgeService.a.AbstractC0565a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98c19510", new Object[]{this, new Integer(i), jSONObject, aVar});
            return;
        }
        String string = jSONObject.getString(PopConst.BRIDGE_KEY_BUSINESS_ID);
        if (TextUtils.isEmpty(string)) {
            aVar.error("businessId is empty");
            return;
        }
        IPopData i2 = this.f25283a.i(string);
        if (i2 == null) {
            aVar.error("pop data is empty");
            return;
        }
        d(i2, jSONObject);
        try {
            vfm.c("PopClickEventJsBridge ", "==== popClick, type=" + i);
            this.f25283a.v(i, string);
        } catch (Throwable th) {
            vfm.d("PopClickEventJsBridge ", th);
        }
    }

    public final void d(IPopData iPopData, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37592f37", new Object[]{this, iPopData, jSONObject});
            return;
        }
        JSONObject clientParams = iPopData.getClientParams();
        if (jSONObject.containsKey("selectedIDList")) {
            clientParams.put(PopConst.POP_KEY_TAG_IDS, jSONObject.get("selectedIDList"));
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject(PopConst.POP_CLIENT_PARAMS_KEY);
        if (jSONObject2 != null && !jSONObject2.isEmpty()) {
            clientParams.putAll(jSONObject2);
        }
    }
}
