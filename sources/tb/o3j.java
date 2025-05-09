package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class o3j extends fl6 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final h3j f25124a;
    public final JSONObject b;

    static {
        t2o.a(745537910);
    }

    public o3j(h3j h3jVar, JSONObject jSONObject) {
        ckf.h(h3jVar, "itemData");
        this.f25124a = h3jVar;
        this.b = jSONObject;
    }

    public static /* synthetic */ Object ipc$super(o3j o3jVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mytaobao/pagev2/architecture/dx/MtbDxUserContext");
    }

    public final JSONObject f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("6dc7370e", new Object[]{this});
        }
        return this.b;
    }

    public final h3j g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h3j) ipChange.ipc$dispatch("d8fa7192", new Object[]{this});
        }
        return this.f25124a;
    }
}
