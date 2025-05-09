package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.family.FamilyManager;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class pvf implements jqw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_BUBBLE_SWITCH = "bubbleSwitch";
    public static final String EVENT_RELATION_UNBIND = "relationUnbind";

    @Override // tb.jqw
    public kqw onEvent(int i, iqw iqwVar, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kqw) ipChange.ipc$dispatch("75ee5a2a", new Object[]{this, new Integer(i), iqwVar, objArr});
        }
        if (i != 3005) {
            return null;
        }
        Object obj = objArr[0];
        if (!(obj instanceof String)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject((String) obj);
            String optString = jSONObject.optString("event");
            String optString2 = jSONObject.optString("param");
            if (EVENT_BUBBLE_SWITCH.equals(optString)) {
                new JSONObject(optString2).optBoolean("isShow", true);
                FamilyManager.sendGetFamilyRelationRequest();
            } else if (!EVENT_RELATION_UNBIND.equals(optString)) {
                return null;
            } else {
                FamilyManager.sendGetFamilyRelationRequest();
            }
            return new kqw(true);
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }
}
