package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class fnl extends dj8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final int e;

    static {
        t2o.a(502268339);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fnl(String str, long j, int i, JSONObject jSONObject) {
        super(str, 1002, j, jSONObject);
        ckf.g(str, "page");
        this.e = i;
    }

    public static /* synthetic */ Object ipc$super(fnl fnlVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/user/context/event/PageLeaveEvent");
    }

    @Override // tb.dj8
    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5342fe35", new Object[]{this});
        }
        return a() + ",du:" + this.e;
    }
}
