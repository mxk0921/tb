package tb;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.business.common.GoodItem;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class eba {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(779092965);
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4037e9fa", new Object[0]);
            return;
        }
        vkr.a("closeRoom");
        sjr.g().c("com.taobao.taolive.room.mediaplatform_close_room", null, vx9.e());
    }

    public static void b(Context context, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23752b1a", new Object[]{context, str, new Boolean(z)});
            return;
        }
        vkr.a("navToURL");
        voj.d(context, str, z);
    }

    public static void c(Context context, String str, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66f39ac4", new Object[]{context, str, str2, str3, str4, str5});
        } else {
            d(context, str, str2, str3, str4, str5, false);
        }
    }

    public static void d(Context context, String str, String str2, String str3, String str4, String str5, boolean z) {
        JSONObject e;
        boolean z2 = true;
        boolean z3 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77807090", new Object[]{context, str, str2, str3, str4, str5, new Boolean(z)});
            return;
        }
        vkr.a("switchRoom");
        String e2 = u90.e(str);
        if (!TextUtils.isEmpty(str2)) {
            e2 = (e2 + "&timePointPlayUrl=" + str2) + "&forceRefresh=true";
            z3 = true;
        }
        if (!z || z3) {
            z2 = z3;
        } else {
            e2 = e2 + "&forceRefresh=true";
        }
        if (TextUtils.isEmpty(str3)) {
            str3 = "switchRoom";
        }
        String str6 = e2 + "&livesource=" + str3;
        if (!TextUtils.isEmpty(str4) && (e = mxf.e(str4)) != null) {
            GoodItem goodItem = new GoodItem();
            goodItem.itemId = e.getString("itemId");
            goodItem.itemImg = e.getString("itemImg");
            goodItem.itemTitle = e.getString("itemTitle");
            goodItem.itemUrl = e.getString("itemUrl");
            goodItem.price = e.getString("price");
            goodItem.itemH5TaokeUrl = e.getString("itemH5TaokeUrl");
            goodItem.extendVal = e.getString("extendVal");
            String jSONString = JSON.toJSONString(goodItem);
            str6 = str6 + "&bubbleGoodInfoJson=" + Uri.encode(jSONString);
            if (!TextUtils.isEmpty(goodItem.itemId)) {
                str6 = str6 + "&sjsdItemId=" + goodItem.itemId + "&productType=timemove";
                if (!z2) {
                    str6 = str6 + "&forceRefresh=true";
                }
            }
        }
        if (!TextUtils.isEmpty(str5)) {
            str6 = str6 + "&timeMovingSpfPlayVideo=" + Uri.encode(str5);
        }
        if (uwa.l()) {
            str6 = str6 + "&spm=a2141.8001249";
        }
        HashMap hashMap = new HashMap();
        hashMap.put("url", str6);
        if (nwa.a(vx9.d()).c() != null) {
            String b = nwa.a(vx9.d()).c().b();
            if (!TextUtils.isEmpty(b)) {
                hashMap.put(yj4.HIGHLIGHT_TRANSPARENT_PARAMS, b);
            }
        }
        sjr.g().c("com.taobao.taolive.room.mediaplatform_switch_room", hashMap, vx9.e());
    }
}
