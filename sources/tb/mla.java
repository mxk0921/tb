package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class mla implements yct {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final List<yct> f24119a = new ArrayList();

    static {
        t2o.a(970981396);
        t2o.a(970981409);
    }

    public mla a(yct yctVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mla) ipChange.ipc$dispatch("10a1c52a", new Object[]{this, yctVar});
        }
        ((ArrayList) this.f24119a).add(yctVar);
        return this;
    }

    @Override // tb.yct
    public void execute() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e48bb97c", new Object[]{this});
            return;
        }
        Iterator it = ((ArrayList) this.f24119a).iterator();
        while (it.hasNext()) {
            ((yct) it.next()).execute();
        }
    }
}
