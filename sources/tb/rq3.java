package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.common.utils.UnifyLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class rq3 implements bsb {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String IS_CHECKED = "isChecked";

    static {
        t2o.a(157286544);
        t2o.a(157286545);
    }

    @Override // tb.bsb
    public void a(IDMComponent iDMComponent, IDMComponent iDMComponent2, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9cf1cdf", new Object[]{this, iDMComponent, iDMComponent2, jSONObject});
        } else if (iDMComponent2 != null && iDMComponent != null) {
            try {
                if (iDMComponent2.getFields().containsKey("isChecked") && Boolean.TRUE.toString().equals(iDMComponent2.getFields().getString("isChecked"))) {
                    b(iDMComponent);
                }
            } catch (Throwable th) {
                UnifyLog.e("MutexListenerParser", th.toString());
            }
        }
    }

    public final void b(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5af450d8", new Object[]{this, iDMComponent});
            return;
        }
        JSONObject fields = iDMComponent.getFields();
        if (fields == null) {
            fields = new JSONObject();
        }
        fields.put("isChecked", (Object) Boolean.FALSE.toString());
        iDMComponent.writeBackFields(fields, true);
    }
}
