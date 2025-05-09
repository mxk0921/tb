package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class td3 extends ku<spq> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public spq b;

    static {
        t2o.a(479199532);
    }

    public static /* synthetic */ Object ipc$super(td3 td3Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/icart/core/performance/preloader/task/impl/CartStreamRequestClientPreloader");
    }

    @Override // tb.ku
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else {
            this.b = null;
        }
    }

    @Override // tb.ku
    public void c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("781f8ee3", new Object[]{this, context});
        } else if (context != null) {
            this.b = new spq(context, vc3.sStreamNextRpcServiceName);
        }
    }

    /* renamed from: f */
    public spq b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (spq) ipChange.ipc$dispatch("4fd04a4c", new Object[]{this, new Boolean(z)});
        }
        spq spqVar = this.b;
        if (z) {
            this.b = null;
        }
        return spqVar;
    }
}
