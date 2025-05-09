package tb;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class fi4 extends l12 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(155189310);
    }

    public static /* synthetic */ Object ipc$super(fi4 fi4Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/trade/event/ConfirmSimplePopupSubscriber");
    }

    @Override // tb.l12
    public void j(lcu lcuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fbad8af", new Object[]{this, lcuVar});
            return;
        }
        lcu i = this.c.g().i();
        if (i != null && this.e != null) {
            IDMComponent a2 = i.a();
            if (p(a2)) {
                this.c.d().h(a2, i);
            }
            this.c.e().k(true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    public final boolean p(IDMComponent iDMComponent) {
        boolean z;
        boolean z2 = false;
        z2 = 0;
        z2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("867242ea", new Object[]{this, iDMComponent})).booleanValue();
        }
        JSONObject stashData = iDMComponent.getStashData();
        JSONObject data = iDMComponent.getData();
        if (stashData == null || data == null) {
            return false;
        }
        try {
            JSONObject jSONObject = data.getJSONObject("fields");
            JSONObject jSONObject2 = stashData.getJSONObject("fields");
            if (jSONObject.containsKey(u4l.KEY_COMPONENTS_GROUPS)) {
                JSONArray jSONArray = jSONObject.getJSONArray(u4l.KEY_COMPONENTS_GROUPS);
                JSONArray jSONArray2 = jSONObject2.getJSONArray(u4l.KEY_COMPONENTS_GROUPS);
                int min = Math.min(jSONArray.size(), jSONArray2.size());
                z = false;
                while (z2 < min) {
                    try {
                        z = q(((JSONObject) jSONArray.get(z2 == true ? 1 : 0)).getJSONObject(qim.KEY_AS_SELECT), ((JSONObject) jSONArray2.get(z2)).getJSONObject(qim.KEY_AS_SELECT));
                        if (z) {
                            z2++;
                        }
                    } catch (Exception unused) {
                        z2 = z;
                        z = z2 ? 1 : 0;
                        return !z;
                    }
                }
            } else {
                z = q(jSONObject.getJSONObject(qim.KEY_AS_SELECT), jSONObject2.getJSONObject(qim.KEY_AS_SELECT));
            }
            break;
        } catch (Exception unused2) {
        }
        return !z;
    }

    public final boolean q(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("27bd6175", new Object[]{this, jSONObject, jSONObject2})).booleanValue();
        }
        return jSONObject.toJSONString().equals(jSONObject2.toJSONString());
    }
}
