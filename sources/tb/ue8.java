package tb;

import android.app.Activity;
import android.content.Intent;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.layoutmanager.module.WindvaneModule;
import com.taobao.android.lifecycle.PanguApplication;
import com.taobao.tao.flexbox.layoutmanager.component.AnimationViewComponent;
import com.taobao.tao.flexbox.layoutmanager.core.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tb.te8;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ue8 implements te8, PanguApplication.CrossActivityLifecycleCallback {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public List<te8.a> f29321a;
    public boolean b = nwv.P(o.J());

    static {
        t2o.a(502267914);
        t2o.a(503316571);
        t2o.a(670040081);
    }

    public ue8() {
        ((PanguApplication) o.J()).registerCrossActivityLifecycleCallback(this);
    }

    @Override // tb.te8
    public void a(o oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a09d812", new Object[]{this, oVar});
        }
    }

    @Override // tb.te8
    public void b(o oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68705a74", new Object[]{this, oVar});
            return;
        }
        y4w.b(oVar.M());
        AnimationViewComponent.J(oVar.M());
    }

    @Override // tb.te8
    public void c(o oVar, int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("621df1bb", new Object[]{this, oVar, new Integer(i), new Integer(i2), intent});
        } else {
            WindvaneModule.onActivityResult(oVar, i, i2, intent);
        }
    }

    @Override // tb.te8
    public void d(te8.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca7b180a", new Object[]{this, aVar});
            return;
        }
        List<te8.a> list = this.f29321a;
        if (list != null) {
            ((ArrayList) list).remove(aVar);
        }
    }

    @Override // tb.te8
    public boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c28107aa", new Object[]{this})).booleanValue();
        }
        return this.b;
    }

    @Override // tb.te8
    public void f(o oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9718b35d", new Object[]{this, oVar});
        }
    }

    @Override // tb.te8
    public void g(te8.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b88f9931", new Object[]{this, aVar});
            return;
        }
        if (this.f29321a == null) {
            this.f29321a = new ArrayList();
        }
        if (!this.f29321a.contains(aVar)) {
            this.f29321a.add(aVar);
        }
    }

    @Override // com.taobao.android.lifecycle.PanguApplication.CrossActivityLifecycleCallback
    public void onCreated(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f00e362", new Object[]{this, activity});
        }
    }

    @Override // com.taobao.android.lifecycle.PanguApplication.CrossActivityLifecycleCallback
    public void onDestroyed(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc107b13", new Object[]{this, activity});
        }
    }

    @Override // com.taobao.android.lifecycle.PanguApplication.CrossActivityLifecycleCallback
    public void onStarted(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b167bb", new Object[]{this, activity});
            return;
        }
        this.b = true;
        List<te8.a> list = this.f29321a;
        if (list != null) {
            Iterator it = ((ArrayList) list).iterator();
            while (it.hasNext()) {
                ((te8.a) it.next()).B();
            }
        }
    }

    @Override // com.taobao.android.lifecycle.PanguApplication.CrossActivityLifecycleCallback
    public void onStopped(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82d37207", new Object[]{this, activity});
            return;
        }
        this.b = false;
        List<te8.a> list = this.f29321a;
        if (list != null) {
            Iterator it = ((ArrayList) list).iterator();
            while (it.hasNext()) {
                ((te8.a) it.next()).x();
            }
        }
    }
}
