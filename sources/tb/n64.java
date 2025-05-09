package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class n64 extends l6v {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MESSAGE = "message";
    public static final String MESSAGE_TYPE = "type";

    static {
        t2o.a(157286515);
    }

    public static /* synthetic */ Object ipc$super(n64 n64Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/event/CommonPostMessageSubscriber");
    }

    @Override // tb.l6v
    public void t(b8v b8vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("827a7510", new Object[]{this, b8vVar});
            return;
        }
        JSONObject fields = j().getFields();
        if (fields != null) {
            b8vVar.n().g().a(fields.getString("target"), fields);
        }
    }
}
