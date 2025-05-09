package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.datamodel.imp.DMEvent;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class jsh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(745538168);
    }

    public static gsb a(List<IDMComponent> list, JSONObject jSONObject) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gsb) ipChange.ipc$dispatch("417df838", new Object[]{list, jSONObject});
        }
        if (jSONObject == null || jSONObject.isEmpty()) {
            return null;
        }
        String string = jSONObject.getString("type");
        JSONObject jSONObject2 = jSONObject.getJSONObject("fields");
        if (jSONObject2 == null) {
            str = "";
        } else {
            str = jSONObject2.getString("nextRenderRoot");
        }
        if (TextUtils.isEmpty(str)) {
            list = null;
        }
        return new DMEvent(string, jSONObject2, list);
    }
}
