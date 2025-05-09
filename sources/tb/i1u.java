package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class i1u extends m6v {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String FIELD_KEY_MSG = "message";

    static {
        t2o.a(156237847);
    }

    public static /* synthetic */ Object ipc$super(i1u i1uVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/ext/event/ToastV2Subscriber");
    }

    @Override // tb.m6v
    public void F(b8v b8vVar) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("146e2815", new Object[]{this, b8vVar});
        } else if (D(b8vVar) == null || !(D(b8vVar).get("message") instanceof String) || TextUtils.isEmpty(D(b8vVar).getString("message"))) {
            if (D(b8vVar) == null) {
                str = "getEventFields 为空";
            } else if (!(D(b8vVar).get("message") instanceof String)) {
                str = "message 参数有问题";
            } else {
                str = "message 参数为空";
            }
            tj8.a(i1u.class.getSimpleName(), "EVENT_CHAIN_PARAMS_VALID_ERROR", str);
        } else {
            z(b8vVar, "toast", D(b8vVar));
        }
    }
}
