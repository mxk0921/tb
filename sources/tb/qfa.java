package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.model.common.LiveItem;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class qfa {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(806356107);
    }

    public static void a(Map<String, String> map, JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e10a9ec1", new Object[]{map, jSONObject});
        } else if (map != null && jSONObject != null && jSONObject.containsKey("itemExtData") && (jSONObject2 = jSONObject.getJSONObject("itemExtData")) != null && jSONObject2.containsKey("preSaleStatus")) {
            map.put("pre", jSONObject2.getString("preSaleStatus"));
            String str = "1";
            if (!TextUtils.equals(str, jSONObject2.getString("subscribeStatus"))) {
                str = "2";
            }
            map.put("preset", str);
        }
    }

    public static void b(Map<String, String> map, LiveItem liveItem) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b52249ea", new Object[]{map, liveItem});
        } else if (map != null && liveItem != null && (jSONObject = liveItem.itemExtData) != null && jSONObject.containsKey("preSaleStatus")) {
            map.put("pre", liveItem.itemExtData.getString("preSaleStatus"));
            String str = "1";
            if (!TextUtils.equals(str, liveItem.itemExtData.getString("subscribeStatus"))) {
                str = "2";
            }
            map.put("preset", str);
        }
    }

    public static String c(VideoInfo.ExtraGoodsTabItem extraGoodsTabItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f653c11e", new Object[]{extraGoodsTabItem});
        }
        return "" + extraGoodsTabItem.type + "_" + extraGoodsTabItem.title;
    }

    public static String d(LiveItem liveItem) {
        LiveItem.Ext ext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("13ef2d27", new Object[]{liveItem});
        }
        if (liveItem == null || (ext = liveItem.extendVal) == null) {
            return null;
        }
        return ext.scene;
    }

    public static boolean e(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bf05356", new Object[]{str, new Boolean(z)})).booleanValue();
        }
        if (!TextUtils.equals("1", str) || z) {
            return false;
        }
        return true;
    }

    public static boolean f(LiveItem liveItem) {
        LiveItem.Ext ext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bf4b7089", new Object[]{liveItem})).booleanValue();
        }
        if (liveItem == null || (ext = liveItem.extendVal) == null) {
            return false;
        }
        return TextUtils.equals(ext.itemSourceType, "1");
    }
}
