package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.component.c;
import com.taobao.android.remoteso.log.RSoLog;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class i4o {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public volatile c f21094a;
    public final Set<a> b = new CopyOnWriteArraySet();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface a {
        void a(String str, boolean z);
    }

    public c b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("3c3dc131", new Object[]{this});
        }
        return this.f21094a;
    }

    public final void c(c cVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b76db77", new Object[]{this, cVar, new Boolean(z)});
            return;
        }
        Iterator it = ((CopyOnWriteArraySet) this.b).iterator();
        while (it.hasNext()) {
            ((a) it.next()).a(cVar.i(), z);
        }
    }

    public void a(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17ca5064", new Object[]{this, cVar});
            return;
        }
        c cVar2 = this.f21094a;
        if (cVar2 == null) {
            rbn.e("remo,holder-> clear(), current already null", "curr=null, req=" + cVar);
        } else if (cVar2.p() == cVar.p()) {
            this.f21094a = null;
            RSoLog.d("remo,holder-> clear(), success, request=" + cVar);
            c(cVar, false);
        } else {
            RSoLog.d("remo,holder-> clear(), skip this clear, current = " + cVar2 + ", request = " + cVar);
        }
    }

    public boolean d(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cd8f80fd", new Object[]{this, cVar})).booleanValue();
        }
        c cVar2 = this.f21094a;
        if (cVar2 == null) {
            this.f21094a = cVar;
            RSoLog.d("remo,holder-> current == null, set success, req = " + cVar);
            c(cVar, true);
            return true;
        } else if (cVar2.p() == cVar.p()) {
            this.f21094a = cVar;
            RSoLog.d("remo,holder-> current == request, set success, req = " + cVar);
            c(cVar, true);
            return true;
        } else {
            rbn.e("remo,holder-> setCurrent(), failed", "current=" + cVar2 + ", req=" + cVar);
            return false;
        }
    }
}
