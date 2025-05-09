package tb;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class s5l extends n6v {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String FIELD_URL = "url";

    static {
        t2o.a(614465549);
    }

    public static /* synthetic */ Object ipc$super(s5l s5lVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/event/ext/OpenUrlV2Subscriber");
    }

    @Override // tb.n6v
    public String B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f4e47c3c", new Object[]{this});
        }
        return "-8769417545223596352";
    }

    @Override // tb.n6v
    public void I(b8v b8vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("146e2815", new Object[]{this, b8vVar});
        } else if (TextUtils.isEmpty(E(b8vVar).getString("url"))) {
            HashMap hashMap = new HashMap();
            hashMap.put("fields", b8vVar.d().getFields().toString());
            hashMap.put("event", E(b8vVar).toString());
            uj8.c("OpenUrlV2Subscriber", "事件 url 为空", "onHandleEventChain", hashMap);
        } else {
            z(b8vVar, "openUrl", E(b8vVar));
            Boolean bool = E(b8vVar).getBoolean("animated");
            if (bool != null && !bool.booleanValue()) {
                Context e = b8vVar.e();
                if (e instanceof Activity) {
                    ((Activity) e).overridePendingTransition(0, 0);
                }
            }
        }
    }
}
