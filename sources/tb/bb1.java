package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class bb1 extends db1 implements Comparable<bb1> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final float c;

    static {
        t2o.a(329252959);
    }

    public bb1(String str, String str2, float f) {
        super(str, str2);
        this.c = f;
    }

    public static /* synthetic */ Object ipc$super(bb1 bb1Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/tschedule/strategy/ArbitrateFloatScore");
    }

    /* renamed from: d */
    public int compareTo(bb1 bb1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e110bf00", new Object[]{this, bb1Var})).intValue();
        }
        return Float.compare(this.c, bb1Var.c);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "ArbitrateFloatScore{score=" + this.c + ", bizName='" + this.f17702a + "', bizCode='" + this.b + "'}";
    }
}
