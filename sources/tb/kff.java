package tb;

import android.content.Intent;
import android.os.Bundle;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class kff {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(352321688);
    }

    public static String a(Intent intent, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2998d7e9", new Object[]{intent, str});
        }
        if (intent == null) {
            return null;
        }
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public static Bundle b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("f971d648", new Object[]{jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
            if (entry != null) {
                bundle.putString(entry.getKey(), String.valueOf(entry.getValue()));
            }
        }
        return bundle;
    }

    public static long c(Intent intent, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f6e947c0", new Object[]{intent, str})).longValue();
        }
        return d(intent, str, 0L);
    }

    public static long d(Intent intent, String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e640286c", new Object[]{intent, str, new Long(j)})).longValue();
        }
        if (intent == null) {
            return j;
        }
        try {
            return intent.getLongExtra(str, j);
        } catch (Exception unused) {
            return j;
        }
    }
}
