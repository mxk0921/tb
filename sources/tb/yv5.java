package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class yv5 extends og5 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final int b;

    static {
        t2o.a(444597962);
    }

    public yv5(int i) {
        this.f25370a = (short) 1;
        this.b = i;
    }

    public static /* synthetic */ Object ipc$super(yv5 yv5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dxv4common/model/command/DXExeExprCommandInfo");
    }

    public int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a6577a21", new Object[]{this})).intValue();
        }
        return this.b;
    }
}
