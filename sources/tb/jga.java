package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.good.business.LiveItemCategoriesResponseData;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.ItemCategory;
import com.taobao.taolive.sdk.model.common.LiveItem;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class jga {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(295699252);
    }

    public static JSONArray a(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("a706209b", new Object[]{jSONArray});
        }
        if (jSONArray == null || jSONArray.isEmpty()) {
            return new JSONArray();
        }
        return fkx.b(jSONArray.toJSONString());
    }

    public static String b(xea xeaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("15571979", new Object[]{xeaVar});
        }
        if (xeaVar != null) {
            return xeaVar.J;
        }
        zha.k("getCurrentCategoryId");
        return "";
    }

    public static String c(xea xeaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2d477291", new Object[]{xeaVar});
        }
        if (xeaVar != null) {
            return xeaVar.g();
        }
        zha.k("getCurrentCreatorid");
        return "";
    }

    public static String d(xea xeaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ef574667", new Object[]{xeaVar});
        }
        if (xeaVar != null) {
            return xeaVar.H().roomStatus;
        }
        zha.k("getCurrentLiveRoomstatue");
        return "";
    }

    public static String e(xea xeaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("76426cc6", new Object[]{xeaVar});
        }
        if (xeaVar != null) {
            return xeaVar.m.c;
        }
        zha.k("getGLOpenFrom");
        return "";
    }

    public static List<ItemCategory> f(xea xeaVar) {
        LiveItemCategoriesResponseData liveItemCategoriesResponseData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("26e5c437", new Object[]{xeaVar});
        }
        if (xeaVar != null && (liveItemCategoriesResponseData = xeaVar.k) != null) {
            return liveItemCategoriesResponseData.itemCategoryList;
        }
        zha.k("getItemCategoryList");
        return new ArrayList();
    }

    public static JSONObject g(xea xeaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("243703c4", new Object[]{xeaVar});
        }
        if (xeaVar != null) {
            return xeaVar.n.e();
        }
        zha.k("getItemConfigInfo");
        return new JSONObject();
    }

    public static String h(LiveItem liveItem) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6c87c5b0", new Object[]{liveItem});
        }
        if (liveItem == null || (jSONObject = liveItem.itemExtData) == null || (jSONObject2 = jSONObject.getJSONObject("itemListTrackData")) == null || TextUtils.isEmpty(jSONObject2.getString("smallCardItemType"))) {
            return "";
        }
        return jSONObject2.getString("smallCardItemType");
    }

    public static boolean i(xea xeaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f99ed44a", new Object[]{xeaVar})).booleanValue();
        }
        if (xeaVar != null) {
            return xeaVar.H().secSkillNeedLimit;
        }
        zha.k("isSecSkillNeedLimit");
        return false;
    }
}
