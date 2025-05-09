package tb;

import android.content.Context;
import android.os.Bundle;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.livehome.plugin.atype.flexalocal.business.common.GoodItem;
import com.taobao.android.nav.Nav;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class r90 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(310378898);
    }

    public static String a(GoodItem goodItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("be3de949", new Object[]{goodItem});
        }
        return JSON.toJSONString(goodItem);
    }

    public static void b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fc03247", new Object[]{context});
        } else {
            Nav.from(context).toUri(nvs.m0());
        }
    }

    public static void c(Context context, String str, String str2, String str3, JSONObject jSONObject, boolean z, GoodItem goodItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27af6074", new Object[]{context, str, str2, str3, jSONObject, new Boolean(z), goodItem});
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString(yj4.PARAM_TIME_PLAY_URL, str2);
        if (jSONObject != null) {
            bundle.putString(yj4.PARAM_MEDIA_INFO, jSONObject.toJSONString());
        }
        bundle.putString("coverImage", str3);
        bundle.putBoolean(yj4.PARAM_LANDSCAPE_VIDEO, z);
        bundle.putLong(yj4.PARAM_CLICK_CARD_TIME, System.currentTimeMillis());
        if (goodItem != null) {
            bundle.putString(yj4.PARAM_GOOD_INFO_JSON, a(goodItem));
        }
        Nav.from(context).withExtras(bundle).toUri(str);
    }
}
