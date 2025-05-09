package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.config.BHRTaskConfigBase;
import com.taobao.android.behavir.event.BHREvent;
import com.taobao.orange.OConstant;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class t6n extends rz1 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TYPE = "python";

    static {
        t2o.a(404750410);
    }

    public t6n(BHRTaskConfigBase bHRTaskConfigBase, BHREvent bHREvent) {
        super(bHRTaskConfigBase, bHREvent);
    }

    public static /* synthetic */ Object ipc$super(t6n t6nVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/behavir/task/PythonTask");
    }

    public Map<String, Object> a() {
        String str;
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("fdbd6abf", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        BHREvent bHREvent = this.f29298a;
        if (bHREvent != null) {
            hashMap.put(wdm.CATEGORY_TRIGGER_EVENT, bHREvent.toJsonObject().toJSONString());
        }
        hashMap.put("trigger", "BehaviR");
        BHRTaskConfigBase bHRTaskConfigBase = this.b;
        if (bHRTaskConfigBase != null) {
            str = bHRTaskConfigBase.getConfigName();
        } else {
            str = "";
        }
        hashMap.put(OConstant.DIMEN_CONFIG_NAME, str);
        BHRTaskConfigBase bHRTaskConfigBase2 = this.b;
        if (bHRTaskConfigBase2 != null) {
            obj = bHRTaskConfigBase2.getOriginal().toJSONString();
        } else {
            obj = new JSONObject();
        }
        hashMap.put("config", obj);
        return hashMap;
    }

    @Override // tb.rz1
    public void l(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdd9980", new Object[]{this, jSONObject});
        }
    }

    @Override // tb.rz1
    public void m(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("980108a5", new Object[]{this, jSONObject});
        }
    }
}
