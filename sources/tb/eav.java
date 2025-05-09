package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class eav {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(83886346);
    }

    public static boolean a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a8979dbb", new Object[]{jSONObject})).booleanValue();
        }
        if (jSONObject == null) {
            return false;
        }
        try {
            return jSONObject.getBoolean("enableGlobalMerge").booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a677b92", new Object[]{jSONObject})).booleanValue();
        }
        if (jSONObject == null) {
            return false;
        }
        try {
            Boolean bool = jSONObject.getBoolean("enableDelta");
            if (bool == null) {
                return false;
            }
            return bool.booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }
}
