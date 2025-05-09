package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class fav {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(83886347);
    }

    public static boolean b(fsb fsbVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4fddefad", new Object[]{fsbVar, new Boolean(z)})).booleanValue();
        }
        if (!(fsbVar instanceof u55)) {
            return false;
        }
        return a(((u55) fsbVar).u(), z);
    }

    public static boolean a(JSONObject jSONObject, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("70b48e03", new Object[]{jSONObject, new Boolean(z)})).booleanValue();
        }
        if (jSONObject == null) {
            return false;
        }
        boolean booleanValue = jSONObject.getBooleanValue("onlyRefreshFooter");
        if (z) {
            jSONObject.remove("onlyRefreshFooter");
        }
        return booleanValue;
    }
}
