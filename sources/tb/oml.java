package tb;

import android.text.TextUtils;
import com.alibaba.android.ultron.vfw.instance.a;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.utils.UltronTradeHybridSwitcherHelper;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.datamodel.imp.DMEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class oml {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_CODE_CANCEL_ORDER = "cancelOrder";
    public static final String EVENT_CODE_CANCEL_ORDER_DOWNGRADE = "cancelOrderDowngrade";

    static {
        t2o.a(614465596);
    }

    public static JSONArray a(DXRootView dXRootView, String str) {
        JSONObject tborderJson;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("6298a861", new Object[]{dXRootView, str});
        }
        if (str == null || dXRootView == null || dXRootView.getExpandWidgetNode() == null || (tborderJson = dXRootView.getExpandWidgetNode().getTborderJson()) == null || tborderJson.getJSONArray(str) == null) {
            return null;
        }
        return axf.a(tborderJson.getJSONArray(str));
    }

    public static List<String> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("65bd5db", new Object[0]);
        }
        return Arrays.asList(v9v.g(UltronTradeHybridSwitcherHelper.ORANGE_KEY_MY_TAOBAO, "eventReportBlackList", "exposure,exposureItem").split(","));
    }

    public static void c(a aVar, String str, IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ec27cd5", new Object[]{aVar, str, iDMComponent});
        } else if (aVar != null && iDMComponent != null) {
            uj8.f("PageEventUtils", "onReceiveEvent", "component", iDMComponent.getType(), iDMComponent.getTag(), "status:", String.valueOf(iDMComponent.getStatus()));
            List<gsb> list = iDMComponent.getEventMap() != null ? iDMComponent.getEventMap().get(str) : null;
            if (!(list == null || list.size() == 0)) {
                ArrayList arrayList = new ArrayList();
                for (gsb gsbVar : list) {
                    arrayList.add(d(gsbVar, aVar));
                }
                list.clear();
                list.addAll(arrayList);
            }
        }
    }

    public static String e(IDMComponent iDMComponent, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8ea4e0d9", new Object[]{iDMComponent, str});
        }
        if (iDMComponent == null || iDMComponent.getFields() == null || iDMComponent.getFields().getJSONObject(EVENT_CODE_CANCEL_ORDER_DOWNGRADE) == null || !TextUtils.equals(iDMComponent.getFields().getJSONObject(EVENT_CODE_CANCEL_ORDER_DOWNGRADE).getString(v4s.PARAM_OP_CODE), str)) {
            return str;
        }
        if ("true".equals(iDMComponent.getFields().getJSONObject(EVENT_CODE_CANCEL_ORDER_DOWNGRADE).get("downgradeOn"))) {
            return EVENT_CODE_CANCEL_ORDER_DOWNGRADE;
        }
        return EVENT_CODE_CANCEL_ORDER;
    }

    public static gsb d(gsb gsbVar, o5e o5eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gsb) ipChange.ipc$dispatch("971128ed", new Object[]{gsbVar, o5eVar});
        }
        if (!(o5eVar.b() == null || o5eVar.b().i() == null || !(o5eVar.b().i().get("events") instanceof JSONObject))) {
            JSONObject jSONObject = o5eVar.b().i().getJSONObject("events");
            if (gsbVar.getType() != null && jSONObject != null && gsbVar.getType().startsWith("@") && (jSONObject.get(gsbVar.getType().substring(1)) instanceof JSONObject) && (jSONObject.getJSONObject(gsbVar.getType().substring(1)).get("type") instanceof String) && (jSONObject.getJSONObject(gsbVar.getType().substring(1)).get("fields") instanceof JSONObject)) {
                JSONObject jSONObject2 = new JSONObject();
                axf.c(jSONObject2, jSONObject.getJSONObject(gsbVar.getType().substring(1)).getJSONObject("fields"));
                axf.c(jSONObject2, gsbVar.getFields());
                return new DMEvent(jSONObject.getJSONObject(gsbVar.getType().substring(1)).getString("type"), jSONObject2, gsbVar.getComponents());
            }
        }
        return gsbVar;
    }
}
