package tb;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.common.utils.UnifyLog;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class m5n {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(479199452);
    }

    public static JSONObject a(IDMComponent iDMComponent, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("596d2ba0", new Object[]{iDMComponent, new Boolean(z)});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("fields", (Object) iDMComponent.getFields());
        if (z) {
            jSONObject.put("events", (Object) iDMComponent.getEvents());
        }
        return jSONObject;
    }

    public static String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("82ba6d54", new Object[0]);
        }
        return "iCart_" + System.currentTimeMillis();
    }

    public static IDMComponent d(List<IDMComponent> list, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDMComponent) ipChange.ipc$dispatch("d80ad2ea", new Object[]{list, str});
        }
        if (list == null || list.size() == 0) {
            UnifyLog.e("PurchasePreload", "allList is empty !!");
            return null;
        }
        for (IDMComponent iDMComponent : list) {
            if (str.equals(iDMComponent.getKey())) {
                return iDMComponent;
            }
        }
        return null;
    }

    public static IDMComponent e(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDMComponent) ipChange.ipc$dispatch("9bb6c96d", new Object[]{iDMComponent});
        }
        List<IDMComponent> children = g(iDMComponent).getChildren();
        IDMComponent d = d(children, "headerCard_1");
        if (d != null) {
            return d(d.getChildren(), "header_1");
        }
        return d(children, "iCartHeader_1");
    }

    public static IDMComponent g(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDMComponent) ipChange.ipc$dispatch("24a4c377", new Object[]{iDMComponent});
        }
        IDMComponent parent = iDMComponent.getParent();
        if (parent != null) {
            return g(parent);
        }
        return iDMComponent;
    }

    public static String f(IDMComponent iDMComponent, List<IDMComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3da5bbd6", new Object[]{iDMComponent, list});
        }
        if (!h0r.d() || list.size() != 1) {
            return null;
        }
        try {
            JSONObject b = b(iDMComponent, list);
            if (b == null) {
                UnifyLog.e("PurchasePreload", "preloadProtocol is empty !!");
                return null;
            }
            String c = c();
            ucu.a().c(c, b);
            return c;
        } catch (Throwable th) {
            UnifyLog.e("PurchasePreload", "buildPurchasePreloadProtocol exception" + th.toString());
            return null;
        }
    }

    public static JSONObject b(IDMComponent iDMComponent, List<IDMComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("6d5ad4c", new Object[]{iDMComponent, list});
        }
        try {
            JSONObject jSONObject = new JSONObject();
            IDMComponent e = e(iDMComponent);
            if (e == null) {
                UnifyLog.e("PurchasePreload", "headComponent is empty !!");
                return null;
            }
            jSONObject.put("header", (Object) a(e, true));
            JSONArray jSONArray = new JSONArray();
            for (IDMComponent iDMComponent2 : list) {
                jSONArray.add(a(iDMComponent2, false));
            }
            jSONObject.put("item", (Object) jSONArray);
            jSONObject.put("submit", (Object) a(iDMComponent, false));
            return jSONObject;
        } catch (Throwable th) {
            UnifyLog.e("PurchasePreload", "buildPurchasePreloadProtocol exception" + th.toString());
            return null;
        }
    }
}
