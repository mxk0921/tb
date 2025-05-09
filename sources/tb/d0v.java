package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import com.ut.mini.UTAnalytics;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class d0v extends mr1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(729808957);
    }

    public d0v(String str, JSONObject jSONObject) {
        super(str, jSONObject);
    }

    public static /* synthetic */ Object ipc$super(d0v d0vVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/homepage/business/bizParams/UTBizParamsCollector");
    }

    @Override // tb.mr1
    public Object e(String str, String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("d46b9933", new Object[]{this, str, strArr});
        }
        return UTAnalytics.getInstance().getDefaultTracker().getGlobalProperty(str);
    }

    @Override // tb.mr1
    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11bc4f70", new Object[]{this});
        } else {
            TLog.loge("UTBizParamsCollector", "UTBizParams bind error");
        }
    }
}
