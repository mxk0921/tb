package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTHitBuilders$UTControlHitBuilder;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class gbu {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ARG_CARD_GOOD_ITEM_ID = "card_good_item_id=";
    public static final String ARG_CARD_SCENE_TYPE = "card_scenetype=";
    public static final String ARG_CARD_SUB_TYPE = "card_subtype=";
    public static final String ARG_CARD_TYPE = "card_type=";
    public static final String ARG_URL = "url=";
    public static final String CLICK_BANNER_PIC = "BannerActivity";
    public static final String LIVE_CARD_CLICK = "AliLiveCardClick";
    public static final String PAGE_ALI_LIVE_UIKIT = "Page_TBLiveUIKit";

    static {
        t2o.a(779093667);
    }

    public static void a(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b70f26b", new Object[]{str, str2, map});
            return;
        }
        UTHitBuilders$UTControlHitBuilder uTHitBuilders$UTControlHitBuilder = new UTHitBuilders$UTControlHitBuilder(str, "Button-" + str2);
        if (!map.containsKey("deviceLevel")) {
            map.put("deviceLevel", "" + fkr.b());
        }
        uTHitBuilders$UTControlHitBuilder.setProperties(map);
        UTAnalytics.getInstance().getDefaultTracker().send(uTHitBuilders$UTControlHitBuilder.build());
    }

    public static void b(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc9fba64", new Object[]{str, str2, map});
        } else {
            UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder(str, 2201, str2, "", "0", map).build());
        }
    }
}
