package tb;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.s;
import com.taobao.orange.OrangeConfig;
import com.taobao.taobaoavsdk.AVSDKLog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class hsr {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile hsr d;

    /* renamed from: a  reason: collision with root package name */
    public volatile Map<String, List<a>> f20876a = new HashMap();
    public volatile String b = "{\"warmupLiveStream\":[{\"sub_business_type\":\"liveRoom\",\"action_type\":\"updownSwitch\",\"business_type\":\"*\",\"page_name\":\"*\"}]}";
    public final boolean c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final String f20877a;
        public final String b;
        public final String c;
        public final String d;

        static {
            t2o.a(451936313);
        }

        public a(String str, String str2, String str3, String str4) {
            this.f20877a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
        }
    }

    static {
        t2o.a(451936312);
    }

    public hsr() {
        this.c = false;
        this.c = ew0.s(OrangeConfig.getInstance().getConfig("DWInteractive", "enableMethodCallVerify", "true"));
    }

    public static hsr a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hsr) ipChange.ipc$dispatch("f325a848", new Object[0]);
        }
        if (d == null) {
            synchronized (hsr.class) {
                try {
                    if (d == null) {
                        d = new hsr();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return d;
    }

    public final boolean b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c3534c44", new Object[]{this, str, str2})).booleanValue();
        }
        if ("*".equals(str)) {
            return true;
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        return str.toLowerCase().equals(str2.toLowerCase());
    }

    public final boolean c(a aVar, String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3459650c", new Object[]{this, aVar, str, str2, str3, str4})).booleanValue();
        }
        if (b(aVar.f20877a, str) && b(aVar.b, str2) && b(aVar.c, str3) && b(aVar.d, str4)) {
            return true;
        }
        return false;
    }

    public boolean e(String str, s.d dVar) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("28ef8667", new Object[]{this, str, dVar})).booleanValue();
        }
        if (this.c && !((HashMap) this.f20876a).isEmpty()) {
            List<a> list = (List) ((HashMap) this.f20876a).get(str);
            if (list == null || list.isEmpty()) {
                AVSDKLog.e(tfb.MODULE_SDK_PAGE, "[" + dVar.e() + "]TBPlayerMethodPermissionValidator: " + str + " has no rules now. Allow each called.");
            } else {
                HashMap<String, String> hashMap = dVar.v;
                if (hashMap == null || hashMap.get("liveActionType") == null) {
                    str2 = "";
                } else {
                    str2 = dVar.v.get("liveActionType");
                }
                for (a aVar : list) {
                    if (c(aVar, dVar.o, str2, dVar.n, "")) {
                        AVSDKLog.e(tfb.MODULE_SDK_PAGE, "[" + dVar.e() + "]TBPlayerMethodPermissionValidator: " + str + " match rule. Allow called.");
                        return true;
                    }
                }
                AVSDKLog.e(tfb.MODULE_SDK_PAGE, "[" + dVar.e() + "]TBPlayerMethodPermissionValidator: " + str + "has rules but not match anyone. Not Allow called.");
                return false;
            }
        }
        return true;
    }

    public void d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3001ae7", new Object[]{this, context});
        } else if (this.c) {
            String K = ja1.K(context, "DWInteractive", "methodCallVerifyRule", "{\"warmupLiveStream\":[{\"sub_business_type\":\"liveRoom\",\"action_type\":\"updownSwitch\",\"business_type\":\"*\",\"page_name\":\"*\"}]}");
            if (TextUtils.isEmpty(K) || (!TextUtils.isEmpty(K) && !TextUtils.isEmpty(this.b) && this.b.equals(K))) {
                AVSDKLog.e(tfb.MODULE_SDK_PAGE, "TBPlayerMethodPermissionValidator no need to updateRuleFromJsonStr.");
                return;
            }
            AVSDKLog.e(tfb.MODULE_SDK_PAGE, "TBPlayerMethodPermissionValidator get the new JsonStr=" + K);
            HashMap hashMap = new HashMap();
            try {
                JSONObject parseObject = JSON.parseObject(K);
                for (String str : parseObject.keySet()) {
                    JSONArray jSONArray = parseObject.getJSONArray(str);
                    ArrayList arrayList = new ArrayList();
                    for (int i = 0; i < jSONArray.size(); i++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i);
                        arrayList.add(new a(jSONObject.getString(atb.EXP_KEY_SUB_BUSINESS_TYPE), jSONObject.getString("action_type"), jSONObject.getString("business_type"), jSONObject.getString("page_name")));
                    }
                    hashMap.put(str, arrayList);
                }
            } catch (Exception e) {
                AVSDKLog.e(tfb.MODULE_SDK_PAGE, "TBPlayerMethodPermissionValidator parseJson error", e);
            }
            if (!hashMap.isEmpty()) {
                ((HashMap) this.f20876a).clear();
                ((HashMap) this.f20876a).putAll(hashMap);
                this.b = K;
            }
        }
    }
}
