package tb;

import androidx.collection.ArrayMap;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.BehaviR;
import com.taobao.android.ultron.common.model.IDMComponent;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class bp2 implements rtd {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TYPE = "BehaviX";

    static {
        t2o.a(745538118);
        t2o.a(157286534);
    }

    public final void a(JSONObject jSONObject, IDMComponent iDMComponent) {
        ArrayMap<String, Object> extMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94418622", new Object[]{this, jSONObject, iDMComponent});
        } else if (jSONObject != null) {
            String string = jSONObject.getString("eventId");
            String string2 = jSONObject.getString("page");
            String string3 = jSONObject.getString("arg1");
            JSONObject jSONObject2 = jSONObject.getJSONObject("args");
            if ("2101".equals(string)) {
                BehaviR.getInstance().commitNewTap(string2, string3, null, b(jSONObject2));
            } else if ("2201".equals(string)) {
                if (!(iDMComponent == null || (extMap = iDMComponent.getExtMap()) == null)) {
                    Object obj = extMap.get("key_exposure");
                    if (!(obj instanceof Boolean) || !((Boolean) obj).booleanValue()) {
                        extMap.put("key_exposure", Boolean.TRUE);
                    } else {
                        return;
                    }
                }
                BehaviR.getInstance().trackAppear(string2, string3, null, null, b(jSONObject2));
            }
        }
    }

    public final String[] b(JSONObject jSONObject) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("133ef0c0", new Object[]{this, jSONObject});
        }
        if (jSONObject == null || jSONObject.size() == 0) {
            return null;
        }
        String[] strArr = new String[jSONObject.size()];
        for (String str : jSONObject.keySet()) {
            String string = jSONObject.getString(str);
            if (string != null) {
                strArr[i] = str + "=" + string;
                i++;
            }
        }
        return strArr;
    }

    @Override // tb.rtd
    public void c(b8v b8vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8797ded1", new Object[]{this, b8vVar});
        } else if (b8vVar != null && (b8vVar.f() instanceof gsb)) {
            a(((gsb) b8vVar.f()).getFields(), b8vVar.d());
        }
    }
}
