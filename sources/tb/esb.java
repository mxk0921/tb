package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import com.taobao.android.ultron.common.model.IDMComponent;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class esb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(157286731);
    }

    public static String a(IDMComponent iDMComponent, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c12634cc", new Object[]{iDMComponent, str, str2});
        }
        if (iDMComponent == null || str == null) {
            return str2;
        }
        JSONObject fields = iDMComponent.getFields();
        if (fields == null) {
            return str2;
        }
        if (!fields.containsKey(str)) {
            return str2;
        }
        String string = fields.getString(str);
        if (string == null) {
            return str2;
        }
        return string;
    }

    public static JSONObject b(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("1ae98d63", new Object[]{iDMComponent});
        }
        if (iDMComponent == null || iDMComponent.getFields() == null) {
            return null;
        }
        return iDMComponent.getFields().getJSONObject(DataReceiveMonitor.CB_LISTENER);
    }
}
