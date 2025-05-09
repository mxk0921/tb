package tb;

import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.feature.DevFeature;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ybf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(912262802);
    }

    public static Uri a(Uri uri) {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("ebbeeee8", new Object[]{uri});
        }
        Boolean bool = Boolean.TRUE;
        Map<String, Boolean> map = DevFeature.mFeature;
        if (bool.equals(map.get(DevFeature.sFuckStdPopActivityGroup))) {
            return uri;
        }
        if ((!TextUtils.equals(nbf.INSIDE_PATH, uri.getPath()) && !"true".equals(uri.getQueryParameter(bia.UNDER_TAKE_INSIDE_DETAIL))) || b(uri)) {
            return uri;
        }
        String queryParameter = uri.getQueryParameter("stdPopId");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(nbf.STDPOP_CONFIG_WINDOW_NOTIFY, (Object) bool);
        if (vbl.O()) {
            jSONObject.put("animation", (Object) m9.f);
        } else {
            if (bool.equals(map.get(DevFeature.sInsideWithStdPopAnim))) {
                str2 = nbf.STDPOP_ANIMATION_BOTTOM;
            } else {
                str2 = nbf.STDPOP_ANIMATION_NON;
            }
            jSONObject.put("animation", (Object) str2);
        }
        Boolean bool2 = Boolean.FALSE;
        jSONObject.put(nbf.STDPOP_ANIM_BACKGROUND, (Object) bool2);
        jSONObject.put(nbf.STDPOP_CONFIG_BACK, (Object) bool2);
        if (c(uri)) {
            str = "transparent";
        } else {
            str = "default";
        }
        Uri.Builder appendQueryParameter = uri.buildUpon().appendQueryParameter(nbf.STDPOP_NAV_MODE, nbf.STDPOP_MODE_VALUE);
        if (queryParameter == null) {
            queryParameter = nbf.STDPOP_POP_ID_DETAIL;
        }
        return appendQueryParameter.appendQueryParameter(nbf.STDPOP_POP_ID, queryParameter).appendQueryParameter(nbf.STDPOP_MODE, "fullscreen").appendQueryParameter(nbf.STDPOP_MASK_TYPE, str).appendQueryParameter(nbf.STDPOP_CONFIG, jSONObject.toString()).build();
    }

    public static boolean c(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eb5ffc58", new Object[]{uri})).booleanValue();
        }
        if (uri == null) {
            return false;
        }
        String queryParameter = uri.getQueryParameter(nbf.INSIDE_CLEAR_BACKGROUND);
        if (TextUtils.isEmpty(queryParameter)) {
            return false;
        }
        return Boolean.parseBoolean(queryParameter);
    }

    public static boolean b(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e2b18bbe", new Object[]{uri})).booleanValue();
        }
        return !TextUtils.isEmpty(uri.getQueryParameter(nbf.STDPOP_NAV_MODE)) && !TextUtils.isEmpty(uri.getQueryParameter(nbf.STDPOP_POP_ID)) && !TextUtils.isEmpty(uri.getQueryParameter(nbf.STDPOP_MODE)) && !TextUtils.isEmpty(uri.getQueryParameter(nbf.STDPOP_CONFIG));
    }
}
