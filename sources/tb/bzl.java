package tb;

import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.msoa.MSOAWVService;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.Globals;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class bzl {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ORANGE_GROUP_MSOA_PERMISSION = "msoa_service_map";

    /* renamed from: a  reason: collision with root package name */
    public static final Set<String> f16739a = Collections.synchronizedSet(new HashSet());
    public static final Map<String, Set<String>> b = new ConcurrentHashMap();

    public static boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3e3ee02d", new Object[]{str, str2})).booleanValue();
        }
        if (f16739a.contains(str)) {
            return false;
        }
        Map<String, Set<String>> map = b;
        if (!((ConcurrentHashMap) map).containsKey(str) || !((Set) ((ConcurrentHashMap) map).get(str)).contains(str2)) {
            return true;
        }
        return false;
    }

    public static void b() {
        String str;
        String str2;
        JSONObject parseObject;
        JSONObject parseObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7157237", new Object[0]);
            return;
        }
        f16739a.clear();
        ((ConcurrentHashMap) b).clear();
        JSONObject parseObject3 = JSON.parseObject(PreferenceManager.getDefaultSharedPreferences(Globals.getApplication()).getString(MSOAWVService.SP_NAME, null));
        if (parseObject3 != null) {
            str = parseObject3.getString("global");
            str2 = parseObject3.getString("scene");
        } else {
            str = OrangeConfig.getInstance().getConfig(ORANGE_GROUP_MSOA_PERMISSION, "global", "");
            str2 = OrangeConfig.getInstance().getConfig(ORANGE_GROUP_MSOA_PERMISSION, "scene", "");
        }
        if (!TextUtils.isEmpty(str) && (parseObject2 = JSON.parseObject(str)) != null) {
            for (String str3 : parseObject2.keySet()) {
                Boolean bool = parseObject2.getBoolean(str3);
                if (bool != null && !bool.booleanValue()) {
                    f16739a.add(str3);
                }
            }
        }
        if (!(TextUtils.isEmpty(str2) || (parseObject = JSON.parseObject(str2)) == null)) {
            for (String str4 : parseObject.keySet()) {
                JSONObject jSONObject = parseObject.getJSONObject(str4);
                if (jSONObject != null) {
                    HashSet hashSet = new HashSet();
                    ((ConcurrentHashMap) b).put(str4, hashSet);
                    for (String str5 : jSONObject.keySet()) {
                        Boolean bool2 = jSONObject.getBoolean(str5);
                        if (bool2 != null && !bool2.booleanValue()) {
                            hashSet.add(str5);
                        }
                    }
                }
            }
        }
    }
}
