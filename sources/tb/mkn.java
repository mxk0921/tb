package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class mkn extends av1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(481296668);
    }

    public mkn(String str, String str2) {
        super(str, str2);
    }

    public static /* synthetic */ Object ipc$super(mkn mknVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/capture/dynamic/msg/RealTimeOperateMsg");
    }

    @Override // tb.q22
    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f0ca9f4", new Object[]{this});
        }
        return "cameraShowMetaSight";
    }

    @Override // tb.q22
    public JSONObject b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("6b386517", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("action", (Object) c());
        jSONObject.put("state", (Object) d());
        return jSONObject;
    }
}
