package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class g83 extends dj8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final int e;
    public final int f;
    public final String g;
    public final int h;

    static {
        t2o.a(502268333);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g83(String str, long j, int i, int i2, String str2, int i3, JSONObject jSONObject) {
        super(str, 2001, j, jSONObject);
        ckf.g(str, "page");
        ckf.g(str2, "contentId");
        this.e = i;
        this.f = i2;
        this.g = str2;
        this.h = i3;
    }

    public static /* synthetic */ Object ipc$super(g83 g83Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/user/context/event/CardExposureEvent");
    }

    @Override // tb.dj8
    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5342fe35", new Object[]{this});
        }
        return a() + ",du:" + this.e + ",in:" + this.f + ",cid:" + this.g + ",cty:" + this.h;
    }
}
