package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.datamodel.imp.DMEvent;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class vir extends l6v {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(806355643);
    }

    public static /* synthetic */ Object ipc$super(vir virVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/room/ability/subscriber/TBLiveAbilitySubscriber");
    }

    @Override // tb.l6v
    public void t(b8v b8vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("827a7510", new Object[]{this, b8vVar});
            return;
        }
        try {
            Object i = b8vVar.i("extraParams");
            JSONObject fields = ((DMEvent) b8vVar.f()).getFields();
            JSONObject jSONObject = fields.getJSONObject("params");
            String string = fields.getString("abilityName");
            String string2 = fields.getString("abilityApi");
            String string3 = fields.getString("dataIndex");
            jSONObject.put("ultronItemData", b8vVar.d().getData().get("ultronItemData"));
            uir.a(string, string2, x(string3, i, jSONObject), b8vVar.e(), null);
        } catch (Throwable th) {
            v7t.d("TBLiveAbilitySubscriber", th.toString());
        }
        v7t.i("TBLiveAbilitySubscriber", "On Handle Event");
    }

    public final JSONObject x(String str, Object obj, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("7d47b3c0", new Object[]{this, str, obj, jSONObject});
        }
        try {
            return (JSONObject) d9m.n().parseExpressionObj((JSONObject) ((Object[]) obj)[Integer.parseInt(str)], jSONObject, true);
        } catch (Throwable th) {
            v7t.i("TBLiveAbilitySubscriber", th.toString());
            return jSONObject;
        }
    }
}
