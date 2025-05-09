package tb;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.opencart.check.CheckHoldManager;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.LinkedHashSet;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class pe0 extends l12 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(479199359);
    }

    public static /* synthetic */ Object ipc$super(pe0 pe0Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/icart/core/event/AddCartSelectItemsSubscriber");
    }

    @Override // tb.l12
    public void j(lcu lcuVar) {
        Map map;
        Boolean bool;
        Boolean bool2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fbad8af", new Object[]{this, lcuVar});
            return;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        JSONObject c = c();
        boolean booleanValue = (c == null || (bool2 = c.getBoolean("checkCurrentItem")) == null) ? true : bool2.booleanValue();
        boolean booleanValue2 = (c == null || (bool = c.getBoolean("checkAddBagItem")) == null) ? true : bool.booleanValue();
        if (booleanValue) {
            IDMComponent iDMComponent = this.e;
            ckf.f(iDMComponent, "mComponent");
            String string = iDMComponent.getFields().getString("cartId");
            if (string != null) {
                linkedHashSet.add(string);
            }
        }
        if (!(!booleanValue2 || lcuVar == null || (map = (Map) lcuVar.e("addCartResultMap")) == null)) {
            Object obj = map.get("addCartResult");
            if (!(obj instanceof JSONObject)) {
                obj = null;
            }
            JSONObject jSONObject = (JSONObject) obj;
            String string2 = jSONObject != null ? jSONObject.getString("cartId") : null;
            if (!(string2 == null || string2.length() == 0)) {
                linkedHashSet.add(string2);
            }
        }
        JSONArray<Object> jSONArray = c != null ? c.getJSONArray("cartIds") : null;
        if (jSONArray != null && !jSONArray.isEmpty()) {
            for (Object obj2 : jSONArray) {
                linkedHashSet.add(obj2.toString());
            }
        }
        CheckHoldManager.i().n(0, linkedHashSet, null, true);
    }
}
