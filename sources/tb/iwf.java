package tb;

import androidx.core.graphics.drawable.IconCompat;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class iwf {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(1032847451);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r11v10 */
        /* JADX WARN: Type inference failed for: r11v2 */
        /* JADX WARN: Type inference failed for: r11v7 */
        @JvmStatic
        public final Object a(JSONObject jSONObject, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("59e2ee11", new Object[]{this, jSONObject, str});
            }
            ckf.h(jSONObject, IconCompat.EXTRA_OBJ);
            ckf.h(str, "keyPath");
            for (String str2 : wsq.z0(str, new String[]{"."}, false, 0, 6, null)) {
                if (!tsq.I(str2, "[", false, 2, null) || !tsq.w(str2, "]", false, 2, null)) {
                    boolean z = jSONObject instanceof JSONObject;
                    JSONObject jSONObject2 = jSONObject;
                    if (!z) {
                        jSONObject2 = null;
                    }
                    JSONObject jSONObject3 = jSONObject2;
                    if (jSONObject3 == null || (jSONObject = jSONObject3.get(str2)) == null) {
                        return null;
                    }
                } else {
                    String substring = str2.substring(1, str2.length() - 1);
                    ckf.f(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    int parseInt = Integer.parseInt(substring);
                    if (!(jSONObject instanceof JSONArray)) {
                        jSONObject = null;
                    }
                    JSONArray jSONArray = (JSONArray) jSONObject;
                    if (jSONArray == null || (jSONObject = jSONArray.get(parseInt)) == null) {
                        return null;
                    }
                }
            }
            return jSONObject;
        }
    }

    static {
        t2o.a(1032847450);
    }

    @JvmStatic
    public static final Object a(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("59e2ee11", new Object[]{jSONObject, str});
        }
        return Companion.a(jSONObject, str);
    }
}
