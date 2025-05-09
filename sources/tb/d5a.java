package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.gateway.datastructure.GatewayActionInfo;
import com.taobao.tao.log.TLog;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class d5a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(475004935);
    }

    public static List<GatewayActionInfo> a(List<b5a> list, i5a i5aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("664560ad", new Object[]{list, i5aVar});
        }
        ArrayList arrayList = new ArrayList();
        if (list != null && !list.isEmpty()) {
            for (b5a b5aVar : list) {
                List<GatewayActionInfo> a2 = a5a.a(b5aVar, i5aVar);
                if (a2 != null && a2.size() > 0) {
                    arrayList.addAll(a2);
                }
            }
        }
        return arrayList;
    }

    public static void b(List<GatewayActionInfo> list, i5a i5aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c248458", new Object[]{list, i5aVar});
        } else if (list != null && !list.isEmpty()) {
            for (GatewayActionInfo gatewayActionInfo : list) {
                v4a.a(gatewayActionInfo, i5aVar);
            }
        }
    }

    public static JSONObject c(b5a b5aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("3df1d9d3", new Object[]{b5aVar});
        }
        if (b5aVar == null) {
            return null;
        }
        while (b5aVar.d() != null) {
            b5aVar = b5aVar.d();
        }
        return b5aVar.a();
    }

    public static List<GatewayActionInfo> d(List<GatewayActionInfo> list, i5a i5aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("72c2acd9", new Object[]{list, i5aVar});
        }
        if (list == null || list.isEmpty()) {
            return null;
        }
        for (GatewayActionInfo gatewayActionInfo : list) {
            b5a triggerEvent = gatewayActionInfo.getTriggerEvent();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(dm7.EVENT_PARAM_PREFIX, (Object) c(triggerEvent));
            jSONObject.put(dm7.CALLBACK_PARAM_PREFIX, (Object) triggerEvent.a());
            j5a.c(gatewayActionInfo.getActionParam(), jSONObject, i5aVar);
        }
        return list;
    }

    public static void e(List<b5a> list, i5a i5aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c55e29e", new Object[]{list, i5aVar});
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (b5a b5aVar : list) {
                if (b5aVar != null) {
                    arrayList.add(b5aVar.b());
                }
            }
            TLog.logd("gateway2-GatewayEventPipeline.triggerEvents", TextUtils.join(",", arrayList));
        }
        b(d(a(list, i5aVar), i5aVar), i5aVar);
    }
}
