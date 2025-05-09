package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class ae3 extends ku<bpt> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public bpt b;

    static {
        t2o.a(479199533);
    }

    public static /* synthetic */ Object ipc$super(ae3 ae3Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/icart/core/performance/preloader/task/impl/CartThemeManagerPreloader");
    }

    @Override // tb.ku
    public void c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("781f8ee3", new Object[]{this, context});
        } else if (context != null) {
            this.b = new bpt(context.getApplicationContext());
        }
    }

    /* renamed from: f */
    public bpt b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bpt) ipChange.ipc$dispatch("304ec85f", new Object[]{this, new Boolean(z)});
        }
        bpt bptVar = this.b;
        if (z) {
            this.b = null;
        }
        return bptVar;
    }
}
