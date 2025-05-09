package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class nzn extends zzi {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final List<svc> c;
    public final int d;

    static {
        t2o.a(628097119);
    }

    public nzn(int i, List<svc> list) {
        this.c = list;
        this.d = i;
    }

    public static /* synthetic */ Object ipc$super(nzn nznVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/messagekit/base/monitor/monitorthread/tasks/RemoveAckTask");
    }

    @Override // tb.zzi
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e48bb97c", new Object[]{this});
            return;
        }
        List<svc> list = this.c;
        if (list != null && list.size() > 0) {
            d(this.d).t(this.c, true);
        }
    }

    @Override // tb.zzi
    public int h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d79de6b4", new Object[]{this})).intValue();
        }
        return 4;
    }
}
