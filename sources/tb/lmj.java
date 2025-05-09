package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.a01;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class lmj extends ylj implements a01.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final a01 h;

    public lmj(x0s x0sVar, boolean z) {
        super(x0sVar, false, z);
        this.h = a01.b(x0sVar, this);
    }

    public static /* synthetic */ Object ipc$super(lmj lmjVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 1352135535) {
            lmjVar.f();
            return null;
        } else if (hashCode == 1892036746) {
            super.j();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/tcrash/core/NativeWithAnrUncaughtCrashCatcher");
        }
    }

    @Override // tb.ylj
    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70c6308a", new Object[]{this});
            return;
        }
        super.j();
        this.h.f();
    }

    public void s(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f686597", new Object[]{this, str});
            return;
        }
        g();
        h(str);
    }
}
