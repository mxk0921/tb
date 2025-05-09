package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class ia7 extends ja7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public long c;

    static {
        t2o.a(352322005);
    }

    public static /* synthetic */ Object ipc$super(ia7 ia7Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail2/core/framework/view/frameanim/DelayRecordTaskRunnable");
    }

    public long d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d22922b4", new Object[]{this})).longValue();
        }
        return this.c;
    }
}
