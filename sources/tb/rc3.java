package tb;

import android.text.TextUtils;
import com.alibaba.android.icart.core.data.model.CartGlobal;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class rc3 extends lmb {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String mFieldsKeyGlobalTransparent = "globalTransparent";

    static {
        t2o.a(479199396);
    }

    public static /* synthetic */ Object ipc$super(rc3 rc3Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/icart/core/event/CartPopTransparentSubscriber");
    }

    public static JSONObject p(JSONObject jSONObject, JSONObject jSONObject2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("93029d90", new Object[]{jSONObject, jSONObject2, str});
        }
        if (jSONObject2 == null) {
            return null;
        }
        Object obj = jSONObject.get(str);
        if (obj instanceof JSONObject) {
            return (JSONObject) zr8.a(jSONObject2, obj);
        }
        return JSON.parseObject(String.valueOf(zr8.a(jSONObject2, jSONObject.getString(str))));
    }

    @Override // tb.l12
    public void j(lcu lcuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fbad8af", new Object[]{this, lcuVar});
            return;
        }
        List<gsb> list = (List) lcuVar.e("events");
        if (list != null) {
            JSONObject jSONObject = null;
            List<IDMComponent> list2 = null;
            for (gsb gsbVar : list) {
                if (TextUtils.equals(gsbVar.getType(), "openPopupWindow")) {
                    list2 = cb4.B(this.k, gsbVar);
                }
            }
            if (list2 != null) {
                JSONObject c = c();
                JSONObject p = p(c, this.e.getData(), "transparent");
                CartGlobal w = this.k.w();
                if (w != null) {
                    jSONObject = p(c, w.getOriginGlobal(), mFieldsKeyGlobalTransparent);
                }
                for (IDMComponent iDMComponent : list2) {
                    JSONObject fields = iDMComponent.getFields();
                    fields.clear();
                    if (p != null) {
                        fields.putAll(p);
                    }
                    if (jSONObject != null) {
                        fields.putAll(jSONObject);
                    }
                }
            }
        }
    }
}
