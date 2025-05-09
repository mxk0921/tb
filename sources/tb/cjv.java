package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class cjv extends n6v {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_ASYNC_STATUS = "asyncStatus";
    public static final String VALUE_STATUS_SUCCESS = "success";

    static {
        t2o.a(614465570);
    }

    public static /* synthetic */ Object ipc$super(cjv cjvVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/event/ext/UpdateAsyncStatus");
    }

    @Override // tb.n6v
    public String B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f4e47c3c", new Object[]{this});
        }
        return "-3462074060888466646";
    }

    @Override // tb.n6v
    public void I(b8v b8vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("146e2815", new Object[]{this, b8vVar});
        } else if (b8vVar.d() == null || b8vVar.d().getFields() == null || !(b8vVar.d().getFields().get("asyncStatus") instanceof String)) {
            b8vVar.d().getFields().put("asyncStatus", "success");
        } else {
            b8vVar.d().getFields().put("asyncStatus", b8vVar.d().getFields().get("asyncStatus"));
        }
    }
}
