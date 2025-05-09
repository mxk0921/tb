package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.google.gson.Gson;
import kotlin.jvm.JvmStatic;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class rrf {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final rrf INSTANCE = new rrf();

    static {
        t2o.a(998244384);
    }

    @JvmStatic
    public static final JSONObject a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("8ee07693", new Object[]{obj});
        }
        return new JSONObject(new Gson().toJson(obj));
    }

    @JvmStatic
    public static final String b(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("57f6b409", new Object[]{obj});
        }
        String json = new Gson().toJson(obj);
        ckf.f(json, "Gson().toJson(obj)");
        return json;
    }

    @JvmStatic
    public static final <T> T c(String str, Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("8052d780", new Object[]{str, cls});
        }
        ckf.g(cls, "clazz");
        return (T) new Gson().fromJson(str, (Class<Object>) cls);
    }
}
