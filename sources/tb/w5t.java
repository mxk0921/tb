package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.uniinfra_kmp.common_utils.serialization.KMPJSONUtils_androidKt;
import com.taobao.uniinfra_kmp.common_utils.serialization.KMPJsonObject;
import com.taobao.uniinfra_kmp.common_utils.serialization.a;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class w5t {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final w5t INSTANCE = new w5t();

    /* renamed from: a  reason: collision with root package name */
    public static final HashMap<String, String> f30475a = new HashMap<>();
    public static final boolean b;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        String str;
        KMPJsonObject kMPJsonObject;
        t2o.a(1003487255);
        boolean z = mhr.e0().getBoolean("enabledLocalSetting", true);
        b = z;
        if (z && (str = mhr.Y().get("kmpLocalSetting")) != null) {
            Object a2 = KMPJSONUtils_androidKt.a(a.Companion, str);
            Map<String, Object> map = null;
            if (a2 instanceof KMPJsonObject) {
                kMPJsonObject = (KMPJsonObject) a2;
            } else {
                kMPJsonObject = null;
            }
            if (kMPJsonObject != null) {
                map = kMPJsonObject.toMap();
            }
            if (map != null) {
                for (Map.Entry<String, Object> entry : map.entrySet()) {
                    String key = entry.getKey();
                    Object value = entry.getValue();
                    if (value instanceof String) {
                        f30475a.put(key, value);
                    }
                }
            }
        }
    }

    public final String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7e264abe", new Object[]{this, str, str2});
        }
        ckf.g(str, "scene");
        ckf.g(str2, "key");
        if (!b) {
            return null;
        }
        return f30475a.get(str + '.' + str2);
    }

    public final void b(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f4036ae", new Object[]{this, str, str2, str3});
            return;
        }
        ckf.g(str, "scene");
        ckf.g(str2, "key");
        if (b) {
            String str4 = str + '.' + str2;
            if (str3 == null) {
                f30475a.remove(str4);
            } else {
                f30475a.put(str4, str3);
            }
            String c = xrf.c(f30475a);
            if (c != null) {
                mhr.Y().set("kmpLocalSetting", c);
            }
        }
    }
}
