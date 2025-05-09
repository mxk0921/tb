package tb;

import android.app.Activity;
import android.view.KeyEvent;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.monitor.impl.trace.ApplicationBackgroundChangedDispatcher;
import com.taobao.monitor.impl.trace.PageLeaveDispatcher;
import com.taobao.monitor.impl.trace.d;
import com.taobao.monitor.impl.trace.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class enl implements d.e, ApplicationBackgroundChangedDispatcher.b, l.c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final List<cll> f18699a = new ArrayList();
    public final PageLeaveDispatcher b;

    public enl() {
        zzb<?> b = yq7.b(ic.APPLICATION_BACKGROUND_CHANGED_DISPATCHER);
        if (b instanceof ApplicationBackgroundChangedDispatcher) {
            ((ApplicationBackgroundChangedDispatcher) b).addListener(this);
        }
        zzb<?> b2 = yq7.b(ic.WINDOW_EVENT_DISPATCHER);
        if (b2 instanceof l) {
            ((l) b2).addListener(this);
        }
        zzb<?> b3 = yq7.b(ic.PAGE_LEAVE_DISPATCHER);
        if (b3 instanceof PageLeaveDispatcher) {
            this.b = (PageLeaveDispatcher) b3;
        }
    }

    @Override // com.taobao.monitor.impl.trace.l.c
    public void A(Activity activity, KeyEvent keyEvent, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b5c8321", new Object[]{this, activity, keyEvent, new Long(j)});
            return;
        }
        Iterator it = ((ArrayList) this.f18699a).iterator();
        while (it.hasNext()) {
            cll cllVar = (cll) it.next();
            if (qgw.c(activity, cllVar.w())) {
                int action = keyEvent.getAction();
                int keyCode = keyEvent.getKeyCode();
                if (action == 0 && keyCode == 4) {
                    a(cllVar, -4, j);
                }
            } else {
                return;
            }
        }
    }

    @Override // com.taobao.monitor.impl.trace.d.e
    public void H(cll cllVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa1aff1f", new Object[]{this, cllVar, new Long(j)});
            return;
        }
        ((ArrayList) this.f18699a).remove(cllVar);
        a(cllVar, -4, j);
    }

    public final void a(cll cllVar, int i, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18f3019a", new Object[]{this, cllVar, new Integer(i), new Long(j)});
        } else if (!yq7.c(this.b)) {
            this.b.e(cllVar, i, j);
        }
    }

    @Override // com.taobao.monitor.impl.trace.l.c
    public void o(Activity activity, int i, float f, float f2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("747a3d9a", new Object[]{this, activity, new Integer(i), new Float(f), new Float(f2), new Long(j)});
        }
    }

    @Override // com.taobao.monitor.impl.trace.d.e
    public void p(cll cllVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fdaffc8", new Object[]{this, cllVar, new Long(j)});
        } else if (!cllVar.L()) {
            a(cllVar, -5, j);
        }
    }

    @Override // com.taobao.monitor.impl.trace.ApplicationBackgroundChangedDispatcher.b
    public void r(int i, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("903f52fd", new Object[]{this, new Integer(i), new Long(j)});
        } else if (i == 1) {
            Iterator it = ((ArrayList) this.f18699a).iterator();
            while (it.hasNext()) {
                a((cll) it.next(), -3, j);
            }
        }
    }

    @Override // com.taobao.monitor.impl.trace.d.e
    public void v(cll cllVar, Map<String, Object> map, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81656cc6", new Object[]{this, cllVar, map, new Long(j)});
        }
    }

    @Override // com.taobao.monitor.impl.trace.d.e
    public void x(cll cllVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f8786d6", new Object[]{this, cllVar, new Long(j)});
        } else if (!((ArrayList) this.f18699a).contains(cllVar)) {
            ((ArrayList) this.f18699a).add(cllVar);
        }
    }
}
