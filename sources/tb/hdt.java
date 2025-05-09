package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class hdt {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Context context;
    public int errorCode;
    public String errorMsg;
    public boolean success = true;

    static {
        t2o.a(947912755);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "TaskContext{success=" + this.success + ", errorCode=" + this.errorCode + ", errorMsg='" + this.errorMsg + "', context=" + this.context + '}';
    }
}
