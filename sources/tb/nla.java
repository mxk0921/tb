package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class nla implements wct {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final List<wct> f24807a = new ArrayList();

    public nla a(wct wctVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nla) ipChange.ipc$dispatch("52520378", new Object[]{this, wctVar});
        }
        ((ArrayList) this.f24807a).add(wctVar);
        return this;
    }

    @Override // tb.wct
    public void execute() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e48bb97c", new Object[]{this});
            return;
        }
        Iterator it = ((ArrayList) this.f24807a).iterator();
        while (it.hasNext()) {
            ((wct) it.next()).execute();
        }
    }
}
