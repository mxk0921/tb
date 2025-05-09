package tb;

import android.app.Activity;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class r5l extends m6v {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String FIELD_URL = "url";

    static {
        t2o.a(156237842);
    }

    public static /* synthetic */ Object ipc$super(r5l r5lVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/ext/event/OpenUrlV2Subscriber");
    }

    @Override // tb.m6v
    public void F(b8v b8vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("146e2815", new Object[]{this, b8vVar});
            return;
        }
        JSONObject D = D(b8vVar);
        if (D == null) {
            tj8.a(r5l.class.getSimpleName(), "EVENT_CHAIN_PARAMS_VALID_ERROR", "获取fields失败");
            return;
        }
        z(b8vVar, "openUrl", D(b8vVar));
        if (D.getBooleanValue("dismissCurrentPage") && (b8vVar.e() instanceof Activity)) {
            ((Activity) b8vVar.e()).finish();
        }
    }
}
