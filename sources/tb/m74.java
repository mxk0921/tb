package tb;

import android.text.Editable;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.expression.event.DXTextInputEvent;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class m74 extends l6v {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DM_COMPONENT_EXT_KEY_TEXT = "componentTextInputKey";

    static {
        t2o.a(157286521);
    }

    public static /* synthetic */ Object ipc$super(m74 m74Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/event/CommonTextInputChangedSubscriber");
    }

    @Override // tb.l6v
    public void t(b8v b8vVar) {
        gsb j;
        JSONObject fields;
        JSONArray jSONArray;
        Editable text;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("827a7510", new Object[]{this, b8vVar});
        } else if (b8vVar != null && (j = j()) != null && (fields = j.getFields()) != null) {
            String string = fields.getString(DM_COMPONENT_EXT_KEY_TEXT);
            if (!TextUtils.isEmpty(string)) {
                Object i = b8vVar.i(f8v.KEY_DXEVENT);
                String obj = (!(i instanceof DXTextInputEvent) || (text = ((DXTextInputEvent) i).getText()) == null) ? null : text.toString();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(string, (Object) obj);
                r(b8vVar, jSONObject);
                JSONObject jSONObject2 = fields.getJSONObject("next");
                if (jSONObject2 != null && (jSONArray = jSONObject2.getJSONArray("onChange")) != null) {
                    l(jSONArray);
                }
            }
        }
    }
}
