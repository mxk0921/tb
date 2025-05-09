package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class c6y extends exx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(401604624);
    }

    public c6y() {
        super(1);
    }

    public static /* synthetic */ Object ipc$super(c6y c6yVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/aws/b/b/f");
    }

    @Override // tb.exx, tb.u3y
    public boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        return sj3.a(d());
    }
}
