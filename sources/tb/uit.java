package tb;

import android.util.LruCache;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class uit {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final LruCache<JSONObject, f94> f29406a = new LruCache<>(20);

    static {
        t2o.a(486539335);
    }

    public static f94 a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f94) ipChange.ipc$dispatch("e4f0e828", new Object[]{jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        try {
            LruCache<JSONObject, f94> lruCache = f29406a;
            f94 f94Var = lruCache.get(jSONObject);
            if (f94Var != null) {
                return f94Var;
            }
            f94 f94Var2 = new f94(jSONObject);
            lruCache.put(jSONObject, f94Var2);
            return f94Var2;
        } catch (Throwable th) {
            fve.e("TemplateDataUtils", "getCompatibleDinamicTemplate error e: " + th.getMessage());
            return new f94(jSONObject);
        }
    }
}
