package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class m64 extends l12 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MESSAGE = "message";

    static {
        t2o.a(155189334);
    }

    public static /* synthetic */ Object ipc$super(m64 m64Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/trade/event/common/CommonPostMessageSubscriber");
    }

    @Override // tb.l12
    public void j(lcu lcuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fbad8af", new Object[]{this, lcuVar});
            return;
        }
        JSONObject fields = g().getFields();
        if (fields != null) {
            this.c.e().t().V().a(fields.getString("target"), fields);
        }
    }
}
