package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public abstract class pt<DATA extends Serializable> implements hbb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(79691834);
        t2o.a(79691835);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e3b41b3", new Object[]{this});
        }
    }

    @Override // tb.hbb
    public void b(mi miVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b02141a5", new Object[]{this, miVar});
        }
    }

    public void c(yk<DATA> ykVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a18a85df", new Object[]{this, ykVar});
        }
    }
}
