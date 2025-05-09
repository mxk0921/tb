package tb;

import android.text.TextUtils;
import androidx.appcompat.taobao.util.Globals;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alimama.AlimamaAdvertising;
import com.taobao.popupcenter.strategy.PopStrategy;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class dg0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(573571198);
    }

    public static boolean a(JSONObject jSONObject, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("93cbd3ab", new Object[]{jSONObject, new Boolean(z)})).booleanValue();
        }
        return b(jSONObject, z, null);
    }

    public static Map<String, String> f(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("f94df0c8", new Object[]{new Boolean(z)});
        }
        HashMap hashMap = new HashMap(1);
        hashMap.put("is_cold", Boolean.toString(z));
        return hashMap;
    }

    public static Map<String, String> g(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("87ec3209", new Object[]{new Boolean(z)});
        }
        HashMap hashMap = new HashMap(2);
        hashMap.put("is_cold", Boolean.toString(z));
        hashMap.put("scene", PopStrategy.IDENTIFIER_SPLASH);
        return hashMap;
    }

    public static boolean b(JSONObject jSONObject, boolean z, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("952d6502", new Object[]{jSONObject, new Boolean(z), map})).booleanValue();
        }
        if (jSONObject == null) {
            jgh.a("AdvHelper", "param is null");
            return false;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("args");
        if (jSONObject2 != null && !jSONObject2.isEmpty()) {
            return e(jSONObject2.getString("advImpTracking"), z) || c(jSONObject2.getString("advClickTracking"), z) || d(jSONObject2.getString("advEventTracking"), z, map);
        }
        jgh.a("AdvHelper", "args is empty");
        return false;
    }

    public static boolean c(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("31c705fb", new Object[]{str, new Boolean(z)})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            jgh.a("AdvHelper", "clickJsonStr is empty");
            return false;
        }
        jgh.a("AdvHelper", "commitAdvClick, buildTanxClickTracking, clickJsonStr = " + str);
        AlimamaAdvertising.instance().buildTanxClickTracking(Globals.getApplication(), str).b("tb_splash").c(f(z)).d(g(z)).a();
        return true;
    }

    public static boolean d(String str, boolean z, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8e059844", new Object[]{str, new Boolean(z), map})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            jgh.a("AdvHelper", "interactJsonStr is empty");
            return false;
        }
        jgh.a("AdvHelper", "commitAdvEvent, buildTanxEventTracking, interactJsonStr = " + str);
        AlimamaAdvertising.instance().buildTanxEventTracking(Globals.getApplication(), str).b("tb_splash").d(f(z)).e(g(z)).c(map).a();
        return true;
    }

    public static boolean e(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c8c8be37", new Object[]{str, new Boolean(z)})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            jgh.a("AdvHelper", "impJsonStr is empty");
            return false;
        }
        jgh.a("AdvHelper", "commitAdvImp, buildTanxImpTracking, impJsonStr = " + str);
        AlimamaAdvertising.instance().buildTanxImpTracking(Globals.getApplication(), str).b("tb_splash").c(f(z)).d(g(z)).a();
        return true;
    }
}
