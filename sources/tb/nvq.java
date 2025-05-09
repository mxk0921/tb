package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.topmultitab.protocol.IHomeSubTabController;
import com.taobao.tao.topmultitab.service.controller.IHomeControllerService;
import com.taobao.tao.topmultitab.service.view.IHomeViewService;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class nvq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(729810339);
    }

    public JSONObject a(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("f5c3360f", new Object[]{this, jSONObject});
        }
        List<String> b = b();
        if (b == null || b.isEmpty() || (jSONObject2 = jSONObject.getJSONObject("subSection")) == null) {
            return jSONObject;
        }
        for (String str : b) {
            d(jSONObject2, str);
        }
        return jSONObject;
    }

    public final List<String> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("c16b320f", new Object[]{this});
        }
        IHomeViewService iHomeViewService = (IHomeViewService) c4b.i().h(IHomeViewService.class);
        if (iHomeViewService != null) {
            return iHomeViewService.getAllTabType();
        }
        return null;
    }

    public final JSONObject c(String str) {
        IHomeSubTabController homeSubTabController;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("bff0cb5b", new Object[]{this, str});
        }
        IHomeControllerService iHomeControllerService = (IHomeControllerService) c4b.i().h(IHomeControllerService.class);
        if (iHomeControllerService == null || (homeSubTabController = iHomeControllerService.getHomeSubTabController(str)) == null) {
            return null;
        }
        return homeSubTabController.getSubTabSearchBarData();
    }

    public final void d(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2458ce47", new Object[]{this, jSONObject, str});
            return;
        }
        String g = rrs.g(str);
        if (!jSONObject.containsKey(g)) {
            c(g);
            return;
        }
        JSONObject c = c(g);
        if (c != null) {
            jSONObject.put(g, (Object) c);
        }
    }
}
