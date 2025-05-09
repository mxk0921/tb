package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class j1u extends n6v {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String FIELD_KEY_MSG = "message";

    static {
        t2o.a(614465559);
    }

    public static /* synthetic */ Object ipc$super(j1u j1uVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/event/ext/ToastV2Subscriber");
    }

    @Override // tb.n6v
    public void I(b8v b8vVar) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("146e2815", new Object[]{this, b8vVar});
        } else if (E(b8vVar) == null || !(E(b8vVar).get("message") instanceof String) || TextUtils.isEmpty(E(b8vVar).getString("message"))) {
            if (E(b8vVar) == null) {
                str = "getEventFields 为空";
            } else if (!(E(b8vVar).get("message") instanceof String)) {
                str = "message 参数有问题";
            } else {
                str = "message 参数为空";
            }
            uj8.a(j1u.class.getSimpleName(), "EVENT_CHAIN_PARAMS_VALID_ERROR", str);
        } else {
            z(b8vVar, "toast", E(b8vVar));
        }
    }
}
