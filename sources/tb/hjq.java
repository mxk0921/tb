package tb;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.android.split.core.listener.StateUpdatedReceiver;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public abstract class hjq<StateT> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final wnc f20686a;
    public final IntentFilter b;
    public final Context c;
    public final List<b02> e = new ArrayList();
    public final Map<String, vfc> f = new HashMap();
    public final Set<jjq<StateT>> d = Collections.newSetFromMap(new ConcurrentHashMap());
    public StateUpdatedReceiver g = null;
    public volatile boolean h = false;

    static {
        t2o.a(677380179);
    }

    public hjq(wnc wncVar, IntentFilter intentFilter, Context context) {
        this.f20686a = wncVar;
        this.b = intentFilter;
        Context applicationContext = context.getApplicationContext();
        this.c = applicationContext != null ? applicationContext : context;
    }

    public final synchronized void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edcf041d", new Object[]{this, new Boolean(z)});
            return;
        }
        this.h = z;
        b();
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b110817", new Object[]{this});
            return;
        }
        if ((this.h || !this.d.isEmpty()) && this.g == null) {
            this.g = new StateUpdatedReceiver(this);
            LocalBroadcastManager.getInstance(this.c).registerReceiver(this.g, this.b);
        }
        if (!this.h && this.d.isEmpty() && this.g != null) {
            LocalBroadcastManager.getInstance(this.c).unregisterReceiver(this.g);
            this.g = null;
        }
    }

    public final void c(bdq bdqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e591884c", new Object[]{this, bdqVar});
            return;
        }
        List<String> f = bdqVar.f();
        Iterator it = ((ArrayList) this.e).iterator();
        int i = bdqVar.i();
        if (i == 5) {
            while (it.hasNext()) {
                b02 b02Var = (b02) it.next();
                if (f.contains(b02Var.d())) {
                    bdf.a(b02Var).a();
                    it.remove();
                }
            }
        } else if (i == 6) {
            while (it.hasNext()) {
                b02 b02Var2 = (b02) it.next();
                if (f.contains(b02Var2.d())) {
                    wnc wncVar = this.f20686a;
                    wncVar.c("StateUpdate getInstantiationCallBack FAILED:" + b02Var2.d(), new Object[0]);
                    if (b02Var2.e() != null) {
                        b02Var2.e().a("install failed", b02Var2.a());
                    }
                    it.remove();
                }
            }
        } else if (i == 7) {
            b02 b02Var3 = (b02) it.next();
            if (f.contains(b02Var3.d())) {
                if (b02Var3.e() != null) {
                    b02Var3.e().a("install canceled", b02Var3.a());
                }
                it.remove();
            }
        }
    }

    public abstract void d(Context context, Intent intent);

    public final synchronized void e(StateT statet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd17bbbe", new Object[]{this, statet});
            return;
        }
        Iterator it = new HashSet(this.d).iterator();
        while (it.hasNext()) {
            ((jjq) it.next()).onStateUpdate(statet);
        }
        if (statet instanceof bdq) {
            if (!Collections.disjoint(((bdq) statet).f(), ((HashMap) this.f).keySet())) {
                if (((bdq) statet).i() != 5 && ((bdq) statet).i() != 6 && ((bdq) statet).i() != 7 && ((bdq) statet).i() != 0 && ((bdq) statet).i() != 12) {
                    Iterator<String> it2 = ((bdq) statet).f().iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        String next = it2.next();
                        if (((HashMap) this.f).containsKey(next)) {
                            q17.f((vfc) ((HashMap) this.f).get(next));
                            break;
                        }
                    }
                } else {
                    q17.e();
                    for (String str : ((bdq) statet).f()) {
                        ((HashMap) this.f).remove(str);
                    }
                }
            }
            c((bdq) statet);
        }
    }

    public final synchronized void f(String str, vfc vfcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e765fbad", new Object[]{this, str, vfcVar});
        } else {
            ((HashMap) this.f).put(str, vfcVar);
        }
    }

    public final synchronized void g(jjq jjqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2ef414e", new Object[]{this, jjqVar});
            return;
        }
        this.d.add(jjqVar);
        b();
    }

    public synchronized void h(b02 b02Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60a889e6", new Object[]{this, b02Var});
        } else {
            ((ArrayList) this.e).add(b02Var);
        }
    }

    public final synchronized void i(jjq jjqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81dcf3a7", new Object[]{this, jjqVar});
            return;
        }
        this.d.remove(jjqVar);
        b();
    }
}
