package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.AliUserTrackerInterface;
import com.taobao.android.sku.utils.SkuLogUtils;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class n4v {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(785383565);
    }

    public static void a(int i, String str, Object obj, Object obj2, Map<String, Object> map) {
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4406ec5e", new Object[]{new Integer(i), str, obj, obj2, map});
        } else if (!TextUtils.isEmpty(str)) {
            String[] strArr = new String[map.size()];
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                strArr[i2] = entry.getKey() + "=" + entry.getValue();
                i2++;
            }
            AliUserTrackerInterface c = hr0.c();
            if (c != null) {
                if (!str.contains(SkuLogUtils.PAGE_NAME)) {
                    str = "Page_New_SKU_".concat(str);
                }
                c.a(SkuLogUtils.PAGE_NAME, i, str, obj, obj2, strArr);
            }
        }
    }

    public static void b(int i, String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1d70896", new Object[]{new Integer(i), str, map});
        } else {
            a(i, str, null, null, map);
        }
    }
}
