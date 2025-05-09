package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.expression.event.tab.DXOnTabClickEvent;
import com.taobao.android.order.core.container.UltronListProxy;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class fqs extends n6v {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String NEXT_TAG_SUCESS = "success";
    public final UltronListProxy j;

    static {
        t2o.a(614465765);
    }

    public fqs(UltronListProxy ultronListProxy) {
        this.j = ultronListProxy;
    }

    public static /* synthetic */ Object ipc$super(fqs fqsVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/order/core/subscriber/TabChangeSubscriber");
    }

    @Override // tb.n6v
    public String B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f4e47c3c", new Object[]{this});
        }
        return "2198668913342927770";
    }

    public final String J() {
        JSONObject data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1261ddfa", new Object[]{this});
        }
        b8v b8vVar = this.f23143a;
        if (b8vVar == null) {
            return null;
        }
        Object i = b8vVar.i(f8v.KEY_DXEVENT);
        if ((i instanceof DXOnTabClickEvent) && (data = ((DXOnTabClickEvent) i).getData()) != null) {
            return data.getString("tabCode");
        }
        return null;
    }

    @Override // tb.n6v
    public void I(b8v b8vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("146e2815", new Object[]{this, b8vVar});
            return;
        }
        String string = E(b8vVar).getString("tabCode");
        if (TextUtils.isEmpty(string)) {
            string = J();
        }
        this.j.t0();
        this.j.s0(string);
        JSONArray jSONArray = b8vVar.d().getFields().getJSONArray("tabs");
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.size(); i++) {
                JSONObject jSONObject = (JSONObject) jSONArray.get(i);
                if (jSONObject.getString("isSelected").equals("true")) {
                    jSONObject.put("isSelected", (Object) "false");
                }
                if (jSONObject.getString("tabCode").equals(string)) {
                    jSONObject.put("isSelected", (Object) "true");
                }
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("tab", (Object) jSONArray);
            D(b8vVar, "success", jSONObject2);
        }
    }
}
