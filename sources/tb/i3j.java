package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class i3j {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CONTAINER_TYPE_DX = "dinamicx";
    public static final String CONTAINER_TYPE_WEEX = "weex";

    static {
        t2o.a(745537940);
    }

    public static final String a(h3j h3jVar) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a11e6a8d", new Object[]{h3jVar});
        }
        ckf.h(h3jVar, "$this$getWeexUrl");
        JSONObject g = h3jVar.g();
        if (g == null || (jSONObject = g.getJSONObject("fields")) == null || (jSONObject2 = jSONObject.getJSONObject("basementTip")) == null) {
            return null;
        }
        return jSONObject2.getString("fragmentWeexUrl");
    }
}
