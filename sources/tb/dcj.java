package tb;

import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alimama.AlimamaAdvertising;
import com.taobao.utils.Global;
import java.net.URLDecoder;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class dcj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static String e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8667a831", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            String queryParameter = Uri.parse(str).getQueryParameter(js0.E_URL);
            if (TextUtils.isEmpty(queryParameter)) {
                return null;
            }
            String queryParameter2 = Uri.parse(URLDecoder.decode(queryParameter, "UTF-8")).getQueryParameter("a48");
            v1.b("MunionTrackUtil", "getAliTrackId: " + queryParameter2);
            return queryParameter2;
        } catch (Exception e) {
            v1.c("MunionTrackUtil", "getAliTrackId error", e);
            return null;
        }
    }

    public static boolean f(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("32ae193f", new Object[]{jSONObject})).booleanValue();
        }
        if (jSONObject == null || jSONObject.isEmpty()) {
            v1.b("MunionTrackUtil", "argsJson is empty");
            return false;
        } else if (c(jSONObject.getString("advImpTracking")) || a(jSONObject.getString("advClickTracking")) || b(jSONObject.getString("advEventTracking"))) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1a613c81", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            v1.b("MunionTrackUtil", "clickJsonStr is empty");
            return false;
        }
        AlimamaAdvertising.instance().buildTanxClickTracking(Global.getApplication(), str).b("tb_splash").a();
        return true;
    }

    public static boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fe8ef013", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            v1.b("MunionTrackUtil", "interactJsonStr is empty");
            return false;
        }
        AlimamaAdvertising.instance().buildTanxEventTracking(Global.getApplication(), str).b("tb_splash").a();
        return true;
    }

    public static boolean c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c4698cc5", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            v1.b("MunionTrackUtil", "impJsonStr is empty");
            return false;
        }
        AlimamaAdvertising.instance().buildTanxImpTracking(Global.getApplication(), str).b("tb_splash").a();
        return true;
    }

    public static boolean d(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6abfc73b", new Object[]{str, jSONObject})).booleanValue();
        }
        if (jSONObject == null || jSONObject.isEmpty()) {
            v1.b("MunionTrackUtil", "commitClickArray argsJson is empty");
            return false;
        }
        String string = jSONObject.getString("clkArr");
        if (TextUtils.isEmpty(string)) {
            v1.b("MunionTrackUtil", "commitClickArray clickArrayJsonStr is empty");
            return false;
        }
        AlimamaAdvertising.instance().buildTanxClickArrayTracking(string).b("tb_splash").c(str).a();
        return true;
    }
}
