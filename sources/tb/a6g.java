package tb;

import android.content.Context;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.a;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class a6g {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a6g INSTANCE = new a6g();

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, JSONObject> f15566a = new LinkedHashMap();

    @JvmStatic
    public static final Object a(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("a83a7c92", new Object[]{context, str, str2});
        }
        ckf.g(context, "ctx");
        ckf.g(str, "fileName");
        ckf.g(str2, "key");
        b(context, str);
        Object obj = ((LinkedHashMap) f15566a).get(str);
        ckf.d(obj);
        return h4g.b(str2, obj);
    }

    @JvmStatic
    public static final void c(Context context, String str, String str2, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65eb9f88", new Object[]{context, str, str2, obj});
            return;
        }
        ckf.g(context, "ctx");
        ckf.g(str, "fileName");
        ckf.g(str2, "key");
        b(context, str);
        Object obj2 = ((LinkedHashMap) f15566a).get(str);
        ckf.d(obj2);
        JSONObject jSONObject = (JSONObject) obj2;
        if (h4g.c(str2, jSONObject, obj)) {
            context.getApplicationContext().getSharedPreferences("ability_storage_".concat(str), 0).edit().putString("data", jSONObject.toJSONString()).apply();
        }
    }

    static {
        t2o.a(114294786);
        new eji("mega-local-storage-stat-total", 1);
    }

    @JvmStatic
    public static final void b(Context context, String str) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("624f99b", new Object[]{context, str});
            return;
        }
        Map<String, JSONObject> map = f15566a;
        if (!map.containsKey(str)) {
            try {
                Context applicationContext = context.getApplicationContext();
                String str2 = null;
                String string = applicationContext.getSharedPreferences("ability_storage_" + str, 0).getString("data", null);
                if (string != null) {
                    try {
                        AppMonitor.Alarm.commitSuccess("Megability", "LocalStorageTotalSizeStat", new JSONObject(a.k(jpu.a("fileName", str), jpu.a("totalLen", Integer.valueOf(string.length())))).toJSONString());
                    } catch (ClassNotFoundException | NoClassDefFoundError | NoSuchMethodError | NoSuchMethodException unused) {
                    }
                    xhv xhvVar = xhv.INSTANCE;
                    str2 = string;
                }
                jSONObject = JSON.parseObject(str2);
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                }
            } catch (Exception unused2) {
                jSONObject = new JSONObject();
            }
            map.put(str, jSONObject);
        }
    }
}
