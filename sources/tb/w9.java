package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class w9 extends bis {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public y9 q;
    public String r;
    public String s;
    public String t;
    public String u;

    static {
        t2o.a(665845868);
    }

    public static /* synthetic */ Object ipc$super(w9 w9Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/share/taopassword/busniess/model/ALRecoginzeResultModel");
    }

    public y9 a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (y9) ipChange.ipc$dispatch("3655507c", new Object[]{this});
        }
        return this.q;
    }

    public void b(y9 y9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a512f4c2", new Object[]{this, y9Var});
        } else {
            this.q = y9Var;
        }
    }
}
