package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class vgm implements IContainerDataService.e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final e3b f30007a;

    static {
        t2o.a(491782583);
        t2o.a(488636643);
    }

    public vgm(e3b e3bVar) {
        this.f30007a = e3bVar;
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.e
    public Map<String, String> a(w1e w1eVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("54f7099b", new Object[]{this, w1eVar, str});
        }
        JSONObject jSONObject = new JSONObject();
        this.f30007a.j().u(str, jSONObject);
        HashMap hashMap = new HashMap();
        for (String str2 : jSONObject.keySet()) {
            hashMap.put(str2, jSONObject.getString(str2));
        }
        return hashMap;
    }
}
