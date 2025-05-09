package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.taobao.subservice.framework.dataservice.DosaContainerDataService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class q58 implements DosaContainerDataService.d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.taobao.infoflow.taobao.subservice.framework.dataservice.DosaContainerDataService.d
    public boolean a(DosaContainerDataService.e eVar, String str, String[] strArr, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bafcbb72", new Object[]{this, eVar, str, strArr, jSONObject})).booleanValue();
        }
        return false;
    }
}
