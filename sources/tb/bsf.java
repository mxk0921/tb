package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class bsf extends yrf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int kError = 0;
    public static final int kPromiseFulfilled = 2;
    public static final int kPromisePending = 1;
    public static final int kPromiseRejected = 3;

    static {
        t2o.a(921698347);
    }

    public bsf(dqf dqfVar, long j) {
        super(dqfVar, j);
    }

    public static /* synthetic */ Object ipc$super(bsf bsfVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/jsi/standard/js/JSPromise");
    }
}
