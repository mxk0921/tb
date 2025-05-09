package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class cf1 extends uuv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(614465540);
    }

    public static /* synthetic */ Object ipc$super(cf1 cf1Var, String str, Object... objArr) {
        if (str.hashCode() == 342763541) {
            super.I((b8v) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/event/ext/AsyncUserTrackV2Subscriber");
    }

    @Override // tb.uuv, tb.n6v
    public String B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f4e47c3c", new Object[]{this});
        }
        return "-6897220322575373868";
    }

    @Override // tb.uuv, tb.n6v
    public void I(b8v b8vVar) {
        JSONObject fields;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("146e2815", new Object[]{this, b8vVar});
        } else if (E(b8vVar) == null || b8vVar.d() == null || !J(b8vVar) || ((fields = b8vVar.d().getFields()) != null && fields.containsKey("asyncStatus") && "success".equals(fields.getString("asyncStatus")))) {
            super.I(b8vVar);
        }
    }
}
