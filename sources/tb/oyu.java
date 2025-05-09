package tb;

import android.text.TextUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.shop.activity.ShopRenderActivity;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class oyu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(764412009);
    }

    public static Map<String, String> a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("7b345e6f", new Object[]{str});
        }
        if (str == null) {
            return null;
        }
        return b(str);
    }

    public static Map<String, String> b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("9e6224a5", new Object[]{str});
        }
        return c(str, false);
    }

    public static boolean d(String str) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("35651b03", new Object[]{str})).booleanValue();
        }
        try {
            Map<String, String> a2 = a(str);
            if (a2 == null) {
                return false;
            }
            String str2 = "";
            String str3 = a2.containsKey("weexShopSubTab") ? a2.get("weexShopSubTab") : str2;
            String str4 = a2.containsKey("weexShopTab") ? a2.get("weexShopTab") : str2;
            if (a2.containsKey(ShopRenderActivity.SHOP_NAVI)) {
                str2 = a2.get(ShopRenderActivity.SHOP_NAVI);
            }
            if (!TextUtils.isEmpty(str2) && !mop.KEY_SHOP_INDEX.equals(str2)) {
                z = false;
            }
            if (!TextUtils.isEmpty(str3) || !TextUtils.isEmpty(str4)) {
                if (!mop.KEY_SHOP_INDEX_BAR.equals(str4)) {
                    return false;
                }
                if (!mop.KEY_SHOP_INDEX.equals(str3)) {
                    return false;
                }
            }
            return z;
        } catch (Exception unused) {
            return false;
        }
    }

    public static Map<String, String> c(String str, boolean z) {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("5c997d99", new Object[]{str, new Boolean(z)});
        }
        HashMap hashMap = new HashMap();
        if (TextUtils.isEmpty(str)) {
            return hashMap;
        }
        if (z) {
            try {
                str = URLDecoder.decode(str, "UTF-8");
            } catch (UnsupportedEncodingException unused) {
            }
        }
        try {
            split = str.split("\\?");
        } catch (Exception e) {
            Log.e("URLUtils", "parse URL param error " + e.getMessage());
        }
        if (split.length < 2) {
            return hashMap;
        }
        for (String str2 : split[1].split("&")) {
            String[] split2 = str2.split("=");
            if (split2.length >= 2) {
                hashMap.put(split2[0], split2[1]);
            }
        }
        return hashMap;
    }
}
