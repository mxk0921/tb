package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class du2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(479199552);
    }

    public static void a(fsb fsbVar, String str, List<IDMComponent> list) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a30d09db", new Object[]{fsbVar, str, list});
        } else if (eav.b(((u55) fsbVar).u()) && str != null && str.startsWith("cartCalculateGlobal") && list != null) {
            HashMap hashMap = new HashMap();
            for (IDMComponent iDMComponent : list) {
                if (iDMComponent != null) {
                    JSONObject fields = iDMComponent.getFields();
                    if (fields.getBooleanValue("canExpand")) {
                        List<gsb> list2 = iDMComponent.getEventMap().get("popExpandClick");
                        if (list2 != null) {
                            Iterator<gsb> it = list2.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    str2 = null;
                                    break;
                                }
                                gsb next = it.next();
                                if ("popExpandClick".equals(next.getType())) {
                                    str2 = next.getFields().getString("calculatePopGroupName");
                                    break;
                                }
                            }
                            if (str2 != null) {
                                hashMap.put(str2, fields.getBoolean("isExpanded"));
                            }
                        }
                    } else {
                        Boolean bool = (Boolean) hashMap.get(fields.getString("calculatePopGroupName"));
                        if (bool != null) {
                            if (bool.booleanValue()) {
                                cb4.c0(iDMComponent);
                            } else {
                                cb4.K(iDMComponent);
                            }
                        }
                    }
                }
            }
        }
    }
}
