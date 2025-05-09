package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.taobao.subservice.framework.dataservice.DosaContainerDataService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class svg implements DosaContainerDataService.d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_API_INFO = "apiInfo";
    public static final String KEY_API_NAME = "apiName";
    public static final String KEY_API_VERSION = "apiVersion";

    /* renamed from: a  reason: collision with root package name */
    public final JSONObject f28301a;

    public svg() {
        JSONObject jSONObject = new JSONObject();
        this.f28301a = jSONObject;
        jSONObject.put("apiName", (Object) "mtop.ovs.guide.page.dosa.taote.get");
        jSONObject.put("apiVersion", (Object) "1.0");
    }

    @Override // com.taobao.infoflow.taobao.subservice.framework.dataservice.DosaContainerDataService.d
    public boolean a(DosaContainerDataService.e eVar, String str, String[] strArr, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bafcbb72", new Object[]{this, eVar, str, strArr, jSONObject})).booleanValue();
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        jSONObject.put("apiInfo", (Object) this.f28301a);
        return eVar.a(str, strArr, jSONObject);
    }
}
