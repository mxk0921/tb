package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.pop.protocol.model.pop.IPopData;
import com.taobao.homepage.pop.utils.PopConst;
import com.taobao.infoflow.protocol.subservice.base.IJsBridgeService;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class kcm implements IJsBridgeService.a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String FEATURE_NAME = "IFPop.fetchPopData";

    /* renamed from: a  reason: collision with root package name */
    public final e3b f22566a;

    static {
        t2o.a(491782597);
        t2o.a(488636530);
    }

    public kcm(e3b e3bVar) {
        this.f22566a = e3bVar;
    }

    @Override // com.taobao.infoflow.protocol.subservice.base.IJsBridgeService.a
    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("70020a6e", new Object[]{this});
        }
        return FEATURE_NAME;
    }

    @Override // com.taobao.infoflow.protocol.subservice.base.IJsBridgeService.a
    public void b(JSONObject jSONObject, IJsBridgeService.a.AbstractC0565a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22f743e3", new Object[]{this, jSONObject, aVar});
        } else if (jSONObject == null || jSONObject.isEmpty()) {
            aVar.error("bridge params is empty");
        } else {
            String string = jSONObject.getString(PopConst.BRIDGE_KEY_BUSINESS_ID);
            if (TextUtils.isEmpty(string)) {
                aVar.error("businessId is empty");
                return;
            }
            IPopData i = this.f22566a.i(string);
            if (i == null) {
                aVar.error("pop data is empty");
                return;
            }
            HashMap hashMap = new HashMap(2);
            hashMap.put("data", JSON.toJSONString(i));
            aVar.a(hashMap);
        }
    }
}
