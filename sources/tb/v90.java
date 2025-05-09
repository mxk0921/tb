package tb;

import android.content.Context;
import android.os.Bundle;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.taolive.uikit.mtop.GoodItem;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class v90 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(806356538);
    }

    public static String a(GoodItem goodItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f54018cd", new Object[]{goodItem});
        }
        return JSON.toJSONString(goodItem);
    }

    public static void b(Context context, String str, String str2, String str3, JSONObject jSONObject, boolean z, GoodItem goodItem, JSONObject jSONObject2, boolean z2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72b3b83f", new Object[]{context, str, str2, str3, jSONObject, new Boolean(z), goodItem, jSONObject2, new Boolean(z2), new Integer(i)});
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
        if (jSONObject2 != null) {
            bundle.putString(yj4.PARAM_MEDIA_INFO_ADTRANSPARAMS, jSONObject2.toJSONString());
        }
        Nav withExtras = Nav.from(context).withExtras(bundle);
        if (frr.a()) {
            Nav.setTransition(0, 0);
        }
        if (z2) {
            withExtras.disableTransition();
        }
        if (qvs.z()) {
            withExtras.forResult(i).toUriSimple(str);
        } else {
            withExtras.forResult(i).toUri(str);
        }
    }
}
