package tb;

import android.app.Activity;
import android.net.Uri;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.change.app.icon.biz.ChangeAppIconBridge;
import com.taobao.themis.kernel.entity.InstanceStartParams;
import com.taobao.themis.open.ability.calendar.TMSCalendarBridge;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class x2n {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String FEEDBACK_APP_ID = "3000000002007701";
    public static final x2n INSTANCE = new x2n();

    static {
        t2o.a(844103797);
    }

    @JvmStatic
    public static final String b(bbs bbsVar) {
        InstanceStartParams c0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a770bdab", new Object[]{bbsVar});
        }
        if (bbsVar != null && ((x9b) bbsVar.getExtension(x9b.class)) != null) {
            return "afc_link";
        }
        if (bbsVar == null || (c0 = bbsVar.c0()) == null) {
            return null;
        }
        return c0.getSourceChannel();
    }

    @JvmStatic
    public static final boolean a(Activity activity, String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ac60c043", new Object[]{activity, str, str2, str3, str4})).booleanValue();
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "miniAppId", str);
        jSONObject.put((JSONObject) ChangeAppIconBridge.KEY_ICONNAME, str2);
        jSONObject.put((JSONObject) "iconUrl", str3);
        if (str4 == null || str4.length() == 0) {
            jSONObject.put((JSONObject) "targetUrl", str4);
        } else {
            String uri = Uri.parse(str4).buildUpon().appendQueryParameter("sModuleName", TMSCalendarBridge.namespace).appendQueryParameter(bps.CONFIG_LAUNCH, "0").appendQueryParameter("sKeep", "1").build().toString();
            ckf.f(uri, "parse(targetUrl).buildUp…, \"1\").build().toString()");
            jSONObject.put((JSONObject) "targetUrl", uri);
        }
        rcx.a(activity, jSONObject.toJSONString());
        return true;
    }
}
