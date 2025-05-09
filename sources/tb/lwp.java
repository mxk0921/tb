package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class lwp extends zzi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(628097122);
    }

    public lwp(String str) {
        this.b = str;
    }

    public static /* synthetic */ Object ipc$super(lwp lwpVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/messagekit/base/monitor/monitorthread/tasks/ShutdownMonitorTask");
    }

    @Override // tb.zzi
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e48bb97c", new Object[]{this});
        }
    }

    @Override // tb.zzi
    public int h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d79de6b4", new Object[]{this})).intValue();
        }
        return 0;
    }
}
