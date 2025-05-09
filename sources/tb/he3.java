package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class he3 extends ku<Boolean> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Boolean b = null;

    static {
        t2o.a(479199534);
    }

    public static /* synthetic */ Object ipc$super(he3 he3Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/icart/core/performance/preloader/task/impl/CartUserTrackerProxyPreloader");
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
            return;
        }
        duv.a().b(new xtv());
        this.b = Boolean.TRUE;
    }

    /* renamed from: f */
    public Boolean b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("421d7eba", new Object[]{this, new Boolean(z)});
        }
        return this.b;
    }
}
