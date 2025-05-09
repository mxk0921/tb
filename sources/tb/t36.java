package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class t36 extends fl6 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final nwi f28451a;

    static {
        t2o.a(573571179);
    }

    public t36(nwi nwiVar) {
        this.f28451a = nwiVar;
    }

    public static /* synthetic */ Object ipc$super(t36 t36Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mmad/render/dx/DXMMUserContext");
    }

    public nwi f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nwi) ipChange.ipc$dispatch("c27496db", new Object[]{this});
        }
        return this.f28451a;
    }
}
