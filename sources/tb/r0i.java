package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.framework.data.global.a;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class r0i {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final HashMap<String, mqc> f27034a = new HashMap<>();

    static {
        t2o.a(352322156);
    }

    public u0i a(String str, JSONObject jSONObject, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (u0i) ipChange.ipc$dispatch("6ef8bbf4", new Object[]{this, str, jSONObject, aVar});
        }
        mqc mqcVar = this.f27034a.get(str);
        if (mqcVar == null) {
            return null;
        }
        try {
            return mqcVar.a(jSONObject, aVar);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public void b(String str, mqc mqcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c1af63d", new Object[]{this, str, mqcVar});
        } else {
            this.f27034a.put(str, mqcVar);
        }
    }
}
