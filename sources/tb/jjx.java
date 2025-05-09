package tb;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import tb.ptg;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class jjx {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ZZB_BUNDLE_KEY = "ZSUserHelper";
    public static final String ZZB_PARAM_DETAIL_VALUE = "orderId";
    public static final String ZZB_PARAM_LIST_TAB_KEY = "tab";
    public static final String ZZB_PARAM_LIST_TAB_VALUE = "all";
    public static final String ZZB_PARAM_PAGE_KEY = "pageName";
    public static final String ZZB_PARAM_PAGE_VALUE = "n_Page_%s";

    static {
        t2o.a(713031934);
    }

    public static Bundle a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("4837b850", new Object[]{context, str});
        }
        Bundle bundle = new Bundle();
        if (context != null) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("pageName", "n_Page_OrderDetail");
            bundle2.putString("orderId", str);
            bundle.putBundle(ZZB_BUNDLE_KEY, bundle2);
        }
        return bundle;
    }

    public static Bundle b(ptg.c cVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("585b00dd", new Object[]{cVar, str});
        }
        Bundle bundle = new Bundle();
        if (!TextUtils.isEmpty(str)) {
            try {
                Bundle bundle2 = new Bundle();
                JSONObject parseObject = JSON.parseObject(str);
                for (String str2 : parseObject.keySet()) {
                    bundle2.putString(str2, parseObject.getString(str2));
                }
                bundle.putBundle(ZZB_BUNDLE_KEY, bundle2);
            } catch (Throwable th) {
                th.printStackTrace();
            }
            return bundle;
        } else if (cVar == null) {
            return bundle;
        } else {
            Bundle bundle3 = new Bundle();
            bundle3.putString("pageName", "n_Page_OrderList");
            bundle3.putString("tab", cVar.z());
            bundle.putBundle(ZZB_BUNDLE_KEY, bundle3);
            return bundle;
        }
    }
}
