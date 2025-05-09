package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class k54 extends l6v {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(157286509);
    }

    public static /* synthetic */ Object ipc$super(k54 k54Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/event/CommonCheckEmptySubscriber");
    }

    @Override // tb.l6v
    public void t(b8v b8vVar) {
        JSONObject fields;
        JSONObject jSONObject;
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("827a7510", new Object[]{this, b8vVar});
            return;
        }
        gsb j = j();
        if (j != null && (fields = j.getFields()) != null && (jSONObject = fields.getJSONObject("next")) != null) {
            Object obj = fields.get("value");
            if (obj != null && ((!(obj instanceof String) || !TextUtils.isEmpty(obj.toString())) && ((!(obj instanceof Map) || !((Map) obj).isEmpty()) && (!(obj instanceof List) || !((List) obj).isEmpty())))) {
                jSONArray = jSONObject.getJSONArray("notEmpty");
            } else {
                jSONArray = jSONObject.getJSONArray("empty");
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("value", obj);
            q(jSONArray, jSONObject2);
        }
    }
}
