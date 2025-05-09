package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public abstract class mtx extends u3y {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(401604615);
    }

    public mtx(int i) {
        super(i);
    }

    public static /* synthetic */ Object ipc$super(mtx mtxVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/aws/b/a/a");
    }

    @Override // tb.u3y
    public boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        if (b() && !j() && !k() && !l()) {
            return true;
        }
        return false;
    }
}
