package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class r38 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final r38 INSTANCE = new r38();

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, JSONObject> f27084a = new LinkedHashMap();

    static {
        t2o.a(140509192);
    }

    @JvmStatic
    public static final JSONObject a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b4d58de7", new Object[0]);
        }
        JSONObject b = b("dxAlertTemplate");
        if (b == null) {
            b = new JSONObject();
            b.put("url", (Object) "https://dinamicx.alibabausercontent.com/pub/alert_ability_ui_new/1736219963920/alert_ability_ui_new.zip");
            b.put("version", (Object) "7");
        }
        b.put("name", (Object) "alert_ability_ui_new");
        return b;
    }

    @JvmStatic
    public static final JSONObject c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("93facbbb", new Object[0]);
        }
        JSONObject b = b("nanoAlertTemplate");
        if (b == null) {
            b = new JSONObject();
            b.put("url", (Object) "https://dinamicx.alibabausercontent.com/nano/pub/alert_ability_ui_nano/1745409440/alert_ability_ui_nano.png");
            b.put("version", (Object) 1);
        }
        b.put("name", (Object) "alert_ability_ui_nano");
        return b;
    }

    @JvmStatic
    public static final JSONObject b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b7001d0", new Object[]{str});
        }
        ckf.g(str, "key");
        String f = hbl.f(str, null);
        if (f != null) {
            Map<String, JSONObject> map = f27084a;
            if (map.containsKey(f)) {
                return (JSONObject) ((LinkedHashMap) map).get(f);
            }
        }
        List z0 = f != null ? wsq.z0(f, new String[]{","}, false, 0, 6, null) : null;
        if (z0 == null || z0.size() < 2) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("url", z0.get(0));
        jSONObject.put("version", z0.get(1));
        f27084a.put(f, jSONObject);
        return jSONObject;
    }
}
