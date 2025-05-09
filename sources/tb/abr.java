package tb;

import android.text.TextUtils;
import com.alibaba.android.umbrella.trace.UmbrellaTracker;
import com.alibaba.android.umf.datamodel.protocol.ultron.base.Component;
import com.alibaba.android.umf.node.service.parse.state.RenderComponent;
import com.alibaba.fastjson.JSONArray;
import com.alipay.android.app.pay.PayTask;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import tb.aj;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class abr implements aj.a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DECRYPT_TYPE_ALIPAY = "alipay";
    public static final String KEY_VALUE = "value";

    static {
        t2o.a(708837507);
        t2o.a(81788997);
    }

    @Override // tb.aj.a
    public void a(String str, JSONArray jSONArray, RenderComponent renderComponent) {
        Component component;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("557d336d", new Object[]{this, str, jSONArray, renderComponent});
        } else if (!TextUtils.isEmpty(str) && jSONArray != null && renderComponent != null && (component = renderComponent.component) != null && component.getFields() != null) {
            Map<String, Object> fields = renderComponent.component.getFields();
            Iterator<Object> it = jSONArray.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (next instanceof String) {
                    Object obj = fields.get(next);
                    if ((obj instanceof String) && str.equals("alipay")) {
                        Map<String, Object> decCashierObfs = PayTask.decCashierObfs((String) obj);
                        if (decCashierObfs == null) {
                            b((String) next, fields);
                        } else {
                            Object obj2 = decCashierObfs.get("value");
                            if (!(obj2 instanceof String)) {
                                b((String) next, fields);
                            } else {
                                fields.put((String) next, (String) obj2);
                            }
                        }
                    }
                }
            }
        }
    }

    public final void b(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17882ea", new Object[]{this, str, map});
            return;
        }
        map.put(str, "");
        c();
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d14a4758", new Object[]{this});
        } else {
            UmbrellaTracker.commitFailureStability("umbrella.ultron.parse", "feature.decrypt.alipay", "1.0", "ultronTrade", "unknown", new HashMap(), "decryptFailed", "alipay sdk decrypt failed");
        }
    }
}
