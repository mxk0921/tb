package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class cb1 extends db1 implements Comparable<cb1> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int c;

    static {
        t2o.a(329252962);
    }

    public cb1(String str, String str2, int i) {
        super(str, str2);
        this.c = i;
    }

    public static /* synthetic */ Object ipc$super(cb1 cb1Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/tschedule/strategy/ArbitrateIntScore");
    }

    /* renamed from: d */
    public int compareTo(cb1 cb1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f9069c53", new Object[]{this, cb1Var})).intValue();
        }
        int i = this.c;
        int i2 = cb1Var.c;
        if (i < i2) {
            return -1;
        }
        if (i == i2) {
            return 0;
        }
        return 1;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "ArbitrateIntScore{score=" + this.c + ", bizName='" + this.f17702a + "', bizCode='" + this.b + "'}";
    }
}
