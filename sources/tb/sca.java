package tb;

import com.alibaba.android.icart.core.data.model.CartGlobal;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class sca {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(479199580);
    }

    public static boolean A(zxb zxbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ac91e6c9", new Object[]{zxbVar})).booleanValue();
        }
        return e(zxbVar).isMixCart();
    }

    public static boolean B(zxb zxbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ee5b6605", new Object[]{zxbVar})).booleanValue();
        }
        if (zxbVar == null || zxbVar.w() == null || zxbVar.w().getControlParas() == null) {
            return false;
        }
        return zxbVar.w().getControlParas().isNewCart();
    }

    public static boolean C(zxb zxbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("acbd3232", new Object[]{zxbVar})).booleanValue();
        }
        CartGlobal w = zxbVar.w();
        if (w == null || w.getControlParas() == null) {
            return false;
        }
        return w.getControlParas().isPreLoadOpen();
    }

    public static boolean D(zxb zxbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("91b85a8d", new Object[]{zxbVar})).booleanValue();
        }
        return e(zxbVar).isIsPromotionChecked();
    }

    public static boolean E(zxb zxbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d755efbe", new Object[]{zxbVar})).booleanValue();
        }
        if (zxbVar.w() == null || zxbVar.w().getControlParas() == null) {
            return false;
        }
        return zxbVar.w().getControlParas().isRemoteCheck();
    }

    public static boolean a(zxb zxbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7f949212", new Object[]{zxbVar})).booleanValue();
        }
        return e(zxbVar).isEnableDesignScale();
    }

    public static String b(zxb zxbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c5f13432", new Object[]{zxbVar});
        }
        CartGlobal w = zxbVar.w();
        if (w != null) {
            return w.getAddress();
        }
        return null;
    }

    public static JSONObject c(zxb zxbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("1d3c8816", new Object[]{zxbVar});
        }
        return e(zxbVar).getBuyTransferParams();
    }

    public static int d(zxb zxbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d0122118", new Object[]{zxbVar})).intValue();
        }
        CartGlobal w = zxbVar.w();
        if (w == null || w.getFeature() == null) {
            return 0;
        }
        return w.getFeature().getCheckMax();
    }

    public static CartGlobal.ControlParas e(zxb zxbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CartGlobal.ControlParas) ipChange.ipc$dispatch("2858a666", new Object[]{zxbVar});
        }
        if (zxbVar != null) {
            try {
                CartGlobal w = zxbVar.w();
                if (w != null) {
                    CartGlobal.ControlParas controlParas = w.getControlParas();
                    if (controlParas != null) {
                        return controlParas;
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return new CartGlobal.ControlParas();
    }

    public static JSONObject f(zxb zxbVar) {
        JSONObject feedFlowConfig;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("9e82ec0e", new Object[]{zxbVar});
        }
        CartGlobal w = zxbVar.w();
        if (w == null || (feedFlowConfig = w.getControlParas().getFeedFlowConfig()) == null || feedFlowConfig.isEmpty()) {
            return null;
        }
        return feedFlowConfig.getJSONObject(zxbVar.y());
    }

    public static String g(zxb zxbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("432b077", new Object[]{zxbVar});
        }
        return e(zxbVar).getExParamsTransparentState();
    }

    public static JSONObject h(zxb zxbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("37f34b60", new Object[]{zxbVar});
        }
        return e(zxbVar).getFilterCheckOptimize();
    }

    public static int i(zxb zxbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5e3ef3", new Object[]{zxbVar})).intValue();
        }
        return e(zxbVar).getFirstBundleLineHeight();
    }

    public static String j(zxb zxbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d2fea34f", new Object[]{zxbVar});
        }
        return e(zxbVar).getJumpComponentKey();
    }

    public static int k(zxb zxbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d4120a75", new Object[]{zxbVar})).intValue();
        }
        CartGlobal w = zxbVar.w();
        if (w == null || w.getFeature() == null) {
            return Integer.MAX_VALUE;
        }
        return w.getFeature().getMaxCheckCount();
    }

    public static int l(kmb kmbVar, IDMComponent iDMComponent) {
        int i;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dd05e1fa", new Object[]{kmbVar, iDMComponent})).intValue();
        }
        if (kmbVar.d().J() && !kmbVar.W().u()) {
            z = true;
        }
        boolean equals = "dynamicConfig_showAllGroup".equals(kmbVar.d().y());
        boolean Q = cb4.Q(iDMComponent);
        if (z || equals) {
            i = 4;
        } else {
            i = 1;
        }
        if (Q) {
            return i << 1;
        }
        return i;
    }

    public static JSONObject m(zxb zxbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("4440cdbd", new Object[]{zxbVar});
        }
        return e(zxbVar).getPromotionUtInfo();
    }

    public static int n(zxb zxbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ec71544d", new Object[]{zxbVar})).intValue();
        }
        return e(zxbVar).getSupportModalBuyCount();
    }

    public static String p(zxb zxbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("85e38ff3", new Object[]{zxbVar});
        }
        return e(zxbVar).getToastIconURL();
    }

    public static String q(zxb zxbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f68e4abf", new Object[]{zxbVar});
        }
        return e(zxbVar).getToastMessage();
    }

    public static String r(zxb zxbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("24624cb9", new Object[]{zxbVar});
        }
        return e(zxbVar).getTopUrl();
    }

    public static int s(zxb zxbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1e6f6ee3", new Object[]{zxbVar})).intValue();
        }
        CartGlobal w = zxbVar.w();
        if (w == null || w.getAllItemInfo() == null) {
            return 0;
        }
        return w.getAllItemInfo().getValue();
    }

    public static String t(zxb zxbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f7a1c837", new Object[]{zxbVar});
        }
        return e(zxbVar).getWakeUpErrorMsg();
    }

    public static boolean u(zxb zxbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2d36f85e", new Object[]{zxbVar})).booleanValue();
        }
        return e(zxbVar).androidSupportItemSwipe();
    }

    public static boolean v(zxb zxbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("963ed3af", new Object[]{zxbVar})).booleanValue();
        }
        return e(zxbVar).isClearFilterItemAndReQuery();
    }

    public static boolean w(zxb zxbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1441a301", new Object[]{zxbVar})).booleanValue();
        }
        if (zxbVar.w() == null || zxbVar.w().getFeature() == null || !zxbVar.w().getFeature().isClientTotalPrice()) {
            return false;
        }
        return true;
    }

    public static boolean y(zxb zxbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("80ee5b43", new Object[]{zxbVar})).booleanValue();
        }
        return e(zxbVar).isForceNative();
    }

    public static boolean z(zxb zxbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dc8363fa", new Object[]{zxbVar})).booleanValue();
        }
        return e(zxbVar).isForceRemoteCheck();
    }

    public static JSONArray o(IDMComponent iDMComponent, kmb kmbVar) {
        Map<String, List<gsb>> eventMap;
        CartGlobal w;
        JSONArray swipeItems;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("ac37fbd6", new Object[]{iDMComponent, kmbVar});
        }
        JSONArray jSONArray = new JSONArray();
        if (!(kmbVar == null || iDMComponent == null || (eventMap = iDMComponent.getEventMap()) == null || (w = kmbVar.d().w()) == null || w.getControlParas() == null || w.getControlParas().getSwipeItems() == null || (swipeItems = w.getControlParas().getSwipeItems()) == null || swipeItems.isEmpty())) {
            int l = l(kmbVar, iDMComponent);
            for (int i = 0; i < swipeItems.size(); i++) {
                JSONObject jSONObject = swipeItems.getJSONObject(i);
                if (!(jSONObject == null || !eventMap.containsKey(jSONObject.getString("event")) || (jSONObject.getIntValue("v") & l) == 0)) {
                    jSONArray.add(jSONObject);
                }
            }
        }
        return jSONArray;
    }

    public static boolean x(zxb zxbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("63015268", new Object[]{zxbVar})).booleanValue();
        }
        return h(zxbVar) != null && h(zxbVar).getBooleanValue("submitCheckAll");
    }
}
