package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class eml extends dj8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(502268338);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eml(String str, long j, JSONObject jSONObject) {
        super(str, 1001, j, jSONObject);
        ckf.g(str, "page");
    }

    public static /* synthetic */ Object ipc$super(eml emlVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/user/context/event/PageEnterEvent");
    }

    @Override // tb.dj8
    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5342fe35", new Object[]{this});
        }
        return a();
    }
}
