package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import com.ut.mini.UTAnalytics;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class c0v extends lr1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(491782804);
    }

    public c0v(String str, JSONObject jSONObject) {
        super(str, jSONObject);
    }

    public static /* synthetic */ Object ipc$super(c0v c0vVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/taobao/subservice/framework/dataservice/impl/requestparams/bizparms/UTBizParamsCollector");
    }

    @Override // tb.lr1
    public Object e(String str, String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("d46b9933", new Object[]{this, str, strArr});
        }
        return UTAnalytics.getInstance().getDefaultTracker().getGlobalProperty(str);
    }

    @Override // tb.lr1
    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11bc4f70", new Object[]{this});
        } else {
            TLog.loge("UTBizParamsCollector", "UTBizParams bind error");
        }
    }
}
