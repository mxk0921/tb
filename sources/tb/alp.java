package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.base.IJsBridgeService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class alp extends k30 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ajp f15828a;

    static {
        t2o.a(491782668);
    }

    public alp(ajp ajpVar) {
        this.f15828a = ajpVar;
    }

    public static /* synthetic */ Object ipc$super(alp alpVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/taobao/subservice/biz/sharedataservice/impl/jsnativefeature/feature/SharedDataUpdateDataFeature");
    }

    @Override // com.taobao.infoflow.protocol.subservice.base.IJsBridgeService.a
    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("70020a6e", new Object[]{this});
        }
        return "HSharedData.updateData";
    }

    @Override // com.taobao.infoflow.protocol.subservice.base.IJsBridgeService.a
    public void b(JSONObject jSONObject, IJsBridgeService.a.AbstractC0565a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22f743e3", new Object[]{this, jSONObject, aVar});
        } else if (jSONObject == null) {
            aVar.error("jsParams is empty");
            fve.e("SharedDataUpdateDataFeature", "jsParams is empty");
        } else {
            JSONObject jSONObject2 = jSONObject.getJSONObject("data");
            if (jSONObject2 == null || jSONObject2.isEmpty()) {
                aVar.error("data is empty");
                fve.e("SharedDataUpdateDataFeature", "executeFeature data is empty");
            } else if (this.f15828a.l(jSONObject2)) {
                aVar.a(null);
            } else {
                aVar.error(null);
            }
        }
    }
}
