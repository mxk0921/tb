package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.core.utils.lang3.ObjectUtils;
import com.taobao.infoflow.protocol.subservice.base.IJsBridgeService;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class qui extends k30 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ajp f26938a;

    static {
        t2o.a(491782669);
    }

    public qui(ajp ajpVar) {
        this.f26938a = ajpVar;
    }

    public static /* synthetic */ Object ipc$super(qui quiVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/taobao/subservice/biz/sharedataservice/impl/jsnativefeature/feature/miniapp/MiniAppGetConfigFeature");
    }

    @Override // com.taobao.infoflow.protocol.subservice.base.IJsBridgeService.a
    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("70020a6e", new Object[]{this});
        }
        return "miniApp.getConfig";
    }

    @Override // com.taobao.infoflow.protocol.subservice.base.IJsBridgeService.a
    public void b(JSONObject jSONObject, IJsBridgeService.a.AbstractC0565a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22f743e3", new Object[]{this, jSONObject, aVar});
            return;
        }
        JSONObject b = oui.b(this.f26938a.i());
        if (ObjectUtils.c(b)) {
            fve.e("MiniAppGetConfigFeature", "not found appConfig");
            aVar.error("not found appConfig");
            return;
        }
        String jSONString = b.toJSONString();
        HashMap hashMap = new HashMap(2);
        hashMap.put("data", jSONString);
        fve.e("MiniAppGetConfigFeature", "appConfig : " + jSONString);
        aVar.a(hashMap);
    }
}
