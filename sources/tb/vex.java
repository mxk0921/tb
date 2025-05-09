package tb;

import android.app.Activity;
import android.view.KeyEvent;
import android.view.Window;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.monitor.impl.trace.l;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tb.afx;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class vex implements afx.a, afx.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final l f29976a;
    public afx b;
    public final Activity c;
    public final List<afx.a> d = new ArrayList();
    public final List<afx.b> e = new ArrayList();

    public vex(Activity activity) {
        this.f29976a = null;
        this.c = activity;
        zzb<?> a2 = ic.a(ic.WINDOW_EVENT_DISPATCHER);
        if (a2 instanceof l) {
            this.f29976a = (l) a2;
        }
    }

    @Override // tb.afx.a
    public void a(int i, float f, float f2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6018f9d", new Object[]{this, new Integer(i), new Float(f), new Float(f2), new Long(j)});
            return;
        }
        if (!yq7.c(this.f29976a)) {
            this.f29976a.f(this.c, i, f, f2, j);
        }
        Iterator it = ((ArrayList) this.d).iterator();
        while (it.hasNext()) {
            ((afx.a) it.next()).a(i, f, f2, j);
        }
    }

    public void b(afx.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7117e0f", new Object[]{this, aVar});
        } else if (aVar != null) {
            ((ArrayList) this.d).add(aVar);
        }
    }

    public void c(afx.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e74ddaf", new Object[]{this, bVar});
        } else if (bVar != null) {
            ((ArrayList) this.e).add(bVar);
        }
    }

    public vex d() {
        Window.Callback callback;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vex) ipChange.ipc$dispatch("7ce7c70c", new Object[]{this});
        }
        Activity activity = this.c;
        if (activity == null) {
            return this;
        }
        Window window = activity.getWindow();
        if (!(window == null || this.b != null || (callback = window.getCallback()) == null)) {
            this.b = new afx(callback);
            try {
                window.setCallback((Window.Callback) Proxy.newProxyInstance(vex.class.getClassLoader(), new Class[]{Window.Callback.class}, this.b));
                zq6.a("WindowEventCollector", "Window.Callback proxy success.");
            } catch (Exception e) {
                e.printStackTrace();
                zq6.a("WindowEventCollector", "Window.Callback proxy fail.");
            }
        }
        afx afxVar = this.b;
        if (afxVar != null) {
            afxVar.a(this);
            this.b.b(this);
        }
        return this;
    }

    @Override // tb.afx.a
    public void dispatchKeyEvent(KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a534d20", new Object[]{this, keyEvent});
            return;
        }
        if (!yq7.c(this.f29976a)) {
            this.f29976a.e(this.c, keyEvent, out.a());
        }
        Iterator it = ((ArrayList) this.d).iterator();
        while (it.hasNext()) {
            ((afx.a) it.next()).dispatchKeyEvent(keyEvent);
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a31ce28", new Object[]{this});
            return;
        }
        afx afxVar = this.b;
        if (afxVar != null) {
            afxVar.c(this);
        }
        ((ArrayList) this.d).clear();
        ((ArrayList) this.e).clear();
    }

    public void f(afx.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8cd6194c", new Object[]{this, aVar});
        } else if (aVar != null) {
            ((ArrayList) this.d).remove(aVar);
        }
    }

    public void g(afx.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a70c092", new Object[]{this, bVar});
        } else if (bVar != null) {
            ((ArrayList) this.e).remove(bVar);
        }
    }

    @Override // tb.afx.b
    public void onWindowFocusChanged(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097302", new Object[]{this, new Boolean(z)});
            return;
        }
        Iterator it = ((ArrayList) this.e).iterator();
        while (it.hasNext()) {
            ((afx.b) it.next()).onWindowFocusChanged(z);
        }
    }
}
