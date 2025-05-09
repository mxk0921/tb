package tb;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class hp6 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final hp6 INSTANCE = new hp6();

    @JvmStatic
    public static final Bundle a(Bundle bundle, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("c1672df2", new Object[]{bundle, jSONObject});
        }
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (jSONObject != null) {
            Set<String> keySet = jSONObject.keySet();
            ckf.f(keySet, "paramsJson.keys");
            for (String str : keySet) {
                if (!TextUtils.isEmpty(str)) {
                    Object obj = jSONObject.get(str);
                    if (obj instanceof Boolean) {
                        bundle.putBoolean(str, ((Boolean) obj).booleanValue());
                    } else if (obj instanceof Integer) {
                        bundle.putInt(str, ((Number) obj).intValue());
                    } else if (obj instanceof Double) {
                        bundle.putDouble(str, ((Number) obj).doubleValue());
                    } else if (obj instanceof Long) {
                        bundle.putLong(str, ((Number) obj).longValue());
                    } else if (obj instanceof String) {
                        bundle.putString(str, (String) obj);
                    } else if (obj instanceof Serializable) {
                        bundle.putSerializable(str, (Serializable) obj);
                    }
                }
            }
        }
        return bundle;
    }

    @JvmStatic
    public static final String b(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f31b0b24", new Object[]{str, jSONObject});
        }
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        if (jSONObject == null) {
            return str;
        }
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
            if (!TextUtils.isEmpty(entry.getKey()) && entry.getValue() != null) {
                buildUpon.appendQueryParameter(entry.getKey(), entry.getValue().toString());
            }
        }
        return buildUpon.build().toString();
    }
}
