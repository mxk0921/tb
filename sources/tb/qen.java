package tb;

import android.app.Application;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.chitu.TBSearchChiTuJSBridge;
import com.taobao.search.rainbow.BucketDO;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class qen {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SEARCH_PREFERENCE_KEY = "tbsearch_preference";

    public static SharedPreferences a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences) ipChange.ipc$dispatch("6cb3acc2", new Object[]{str});
        }
        Application i = oen.i();
        if (i != null) {
            return i.getSharedPreferences(str, 0);
        }
        Log.e("RainbowCache", "Application为空，获取SharedPreferences失败");
        return null;
    }

    public static final void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("716668bc", new Object[]{str});
            return;
        }
        SharedPreferences a2 = a("tbsearch_rainbow");
        if (a2 != null) {
            a2.edit().putString("app_v", str).apply();
        }
    }

    public static final void c(String str, BucketDO bucketDO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c0c571c", new Object[]{str, bucketDO});
            return;
        }
        SharedPreferences a2 = a("tbsearch_rainbow");
        if (a2 != null) {
            SharedPreferences.Editor edit = a2.edit();
            edit.putString("tc_" + str, JSON.toJSONString(bucketDO));
            edit.apply();
        }
    }

    public static final void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47380ed3", new Object[]{str});
            return;
        }
        SharedPreferences a2 = a("tbsearch_rainbow");
        if (a2 != null) {
            a2.edit().putString("cfg_v", str).apply();
        }
    }

    public static final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3992b230", new Object[0]);
            return;
        }
        SharedPreferences a2 = a("tbsearch_rainbow");
        if (a2 != null) {
            SharedPreferences.Editor edit = a2.edit();
            String string = a2.getString("app_v", "");
            String string2 = a2.getString("cfg_v", "");
            edit.clear().apply();
            edit.putString("app_v", string).putString("cfg_v", string2).apply();
        }
    }

    public static final String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f4fbc06", new Object[0]);
        }
        SharedPreferences a2 = a("tbsearch_rainbow");
        if (a2 == null) {
            return "";
        }
        return a2.getString("app_v", "");
    }

    public static final BucketDO g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BucketDO) ipChange.ipc$dispatch("dd2b23cc", new Object[]{str});
        }
        SharedPreferences a2 = a("tbsearch_rainbow");
        if (a2 == null) {
            return null;
        }
        String string = a2.getString("tc_" + str, "");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return (BucketDO) JSON.parseObject(string, BucketDO.class);
    }

    public static final Map<String, BucketDO> h() {
        Map<String, ?> all;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("d5cd2d29", new Object[0]);
        }
        HashMap hashMap = new HashMap();
        SharedPreferences a2 = a("tbsearch_rainbow");
        if (!(a2 == null || (all = a2.getAll()) == null || all.isEmpty())) {
            for (Map.Entry<String, ?> entry : all.entrySet()) {
                String key = entry.getKey();
                if (!TextUtils.isEmpty(key) && key.startsWith("tc_")) {
                    String str = (String) entry.getValue();
                    if (!TextUtils.isEmpty(str)) {
                        hashMap.put(key.substring(2), JSON.parseObject(str, BucketDO.class));
                    }
                }
            }
        }
        return hashMap;
    }

    public static final String i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aae3b6df", new Object[0]);
        }
        SharedPreferences a2 = a("tbsearch_rainbow");
        if (a2 == null) {
            return "";
        }
        return a2.getString("cfg_v", "");
    }

    public static JSONObject j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("2ae8835b", new Object[0]);
        }
        SharedPreferences a2 = a("tbsearch_preference");
        if (a2 == null) {
            return null;
        }
        String string = a2.getString(TBSearchChiTuJSBridge.ABTEST, "");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            return new JSONObject(string);
        } catch (JSONException unused) {
            return null;
        }
    }
}
