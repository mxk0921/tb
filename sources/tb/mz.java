package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public abstract class mz extends lz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(83886260);
    }

    public static /* synthetic */ Object ipc$super(mz mzVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/ultron/performence/AbsUltronPerformanceImpl");
    }

    public abstract void p(Context context, bav bavVar);
}
