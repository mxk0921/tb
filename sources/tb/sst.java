package tb;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class sst {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CREATE_ORDER = "tao_purchase_create_request_page_data";
    public static final String ENTER_ORDER = "tao_purchase_request_page_data";
    public static final String PAGE_THROTTLING = "Page_ConfirmOrder";
    public static final String SUBMIT_ORDER = "tao_purchase_submit_order";

    static {
        t2o.a(714080283);
    }

    public static Map<String, String> a(Context context, Intent intent) {
        Map<String, String> j;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("6b69cb70", new Object[]{context, intent});
        }
        if (intent == null || (j = lql.j(context, intent)) == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        int f = lql.f(intent);
        String str = "null";
        if (f == 1) {
            String str2 = j.get("buyParam");
            String str3 = j.get("cartIds");
            if (!TextUtils.isEmpty(str2) && !str.equalsIgnoreCase(str2)) {
                String[] split = str2.split(",");
                StringBuilder sb = new StringBuilder("");
                if (split != null && split.length > 0) {
                    int length = split.length;
                    while (i < length) {
                        sb.append(split[i]);
                        if (i != length - 1) {
                            sb.append("$");
                        }
                        i++;
                    }
                }
                hashMap.put("type", "2");
                hashMap.put("settlement", sb.toString());
            } else if (!TextUtils.isEmpty(str3) && !str.equalsIgnoreCase(str3)) {
                String[] split2 = str3.split(",");
                StringBuilder sb2 = new StringBuilder("");
                if (split2 != null && split2.length > 0) {
                    int length2 = split2.length;
                    while (i < length2) {
                        sb2.append(split2[i]);
                        if (i != length2 - 1) {
                            sb2.append("$");
                        }
                        i++;
                    }
                }
                hashMap.put("type", "3");
                hashMap.put("cartId", sb2.toString());
            }
        } else if (f != 2) {
            String dataString = intent.getDataString();
            if (!TextUtils.isEmpty(dataString)) {
                str = dataString;
            }
            hashMap.put("type", "4");
            hashMap.put("url", str);
        } else {
            String str4 = j.get("itemId");
            String str5 = j.get(q2q.KEY_SKU_ID);
            if (TextUtils.isEmpty(str4) || str.equalsIgnoreCase(str4)) {
                str4 = "0";
            }
            if (TextUtils.isEmpty(str5) || str.equalsIgnoreCase(str5)) {
                str5 = "0";
            }
            hashMap.put("type", "1");
            hashMap.put("info", str4 + "|" + str5);
        }
        return hashMap;
    }
}
