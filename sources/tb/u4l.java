package tb;

import com.alibaba.android.ultron.trade.event.OpenSimplePopupSubscriber;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class u4l extends OpenSimplePopupSubscriber {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_COMPONENTS_GROUPS = "componentGroups";

    static {
        t2o.a(155189318);
    }

    public static /* synthetic */ Object ipc$super(u4l u4lVar, String str, Object... objArr) {
        if (str.hashCode() == -337515751) {
            return super.s((JSONObject) objArr[0], (String) objArr[1]);
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/trade/event/OpenSimpleGroupPopupSubscriber");
    }

    @Override // com.alibaba.android.ultron.trade.event.OpenSimplePopupSubscriber
    public List<IDMComponent> s(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("ebe1eb19", new Object[]{this, jSONObject, str});
        }
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = jSONObject.getJSONArray(KEY_COMPONENTS_GROUPS);
        if (jSONArray != null && !jSONArray.isEmpty()) {
            for (int i = 0; i < jSONArray.size(); i++) {
                arrayList.addAll(super.s((JSONObject) jSONArray.get(i), str));
            }
        }
        return arrayList;
    }
}
