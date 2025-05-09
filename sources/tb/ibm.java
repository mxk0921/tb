package tb;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.popupcenter.strategy.PopStrategy;
import com.taobao.popupcenter.strategy.PopStrategyGroup;
import java.util.Iterator;
import java.util.Objects;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ibm implements jad, Handler.Callback {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static boolean i;
    public final mad d;
    public final String e;
    public boolean h;

    /* renamed from: a  reason: collision with root package name */
    public final Queue<xad> f21211a = new ConcurrentLinkedQueue();
    public final Queue<xad> b = new ConcurrentLinkedQueue();
    public Queue<kgm> c = new ConcurrentLinkedQueue();
    public final Handler f = new Handler(Looper.getMainLooper(), this);
    public boolean g = true;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                ibm.c(ibm.this);
            }
        }
    }

    public ibm(String str, mad madVar) {
        this.e = str;
        this.d = madVar;
    }

    public static /* synthetic */ void c(ibm ibmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d8e2a2a", new Object[]{ibmVar});
        } else {
            ibmVar.l();
        }
    }

    public static void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[0]);
        } else {
            wcm.a("com.taobao.tao.homepage.HomepageFragment").start();
        }
    }

    public static void i(xad xadVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42e029f8", new Object[]{xadVar, str});
            return;
        }
        Application a2 = m91.a();
        if (a2 != null) {
            Intent intent = new Intent("popcenter.popShow");
            JSONObject jSONObject = new JSONObject(4);
            jSONObject.put("pageName", (Object) str);
            jSONObject.put("popOperation", (Object) xadVar);
            intent.putExtra("data", jSONObject);
            LocalBroadcastManager.getInstance(a2).sendBroadcast(intent);
        }
    }

    @Override // tb.jad
    public boolean a(xad xadVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a1bb124e", new Object[]{this, xadVar})).booleanValue();
        }
        if (xadVar == null) {
            return false;
        }
        boolean j = j(xadVar);
        StringBuilder sb = new StringBuilder("finishPopOperation: identify:");
        sb.append(xadVar.o());
        sb.append(", page:");
        sb.append(this.e);
        sb.append(", removeResult:");
        sb.append(j);
        sb.append("currentShowing:");
        sb.append(this.c);
        l();
        return true;
    }

    @Override // tb.jad
    public boolean b(xad xadVar) {
        PopStrategyGroup a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e90f7380", new Object[]{this, xadVar})).booleanValue();
        }
        if (xadVar == null) {
            return false;
        }
        xadVar.getClass().toString();
        xadVar.o();
        String str = this.e;
        mad madVar = this.d;
        if (madVar == null || (a2 = madVar.a(str)) == null) {
            try {
                xadVar.show();
            } catch (Throwable th) {
                th.printStackTrace();
            }
            return true;
        } else if ((xadVar instanceof Activity) || (xadVar instanceof Fragment)) {
            throw new RuntimeException("Can not use Activity or Fragment as operation");
        } else if (e(xadVar)) {
            return true;
        } else {
            if (a2.getStrategyByIdentifier(xadVar.o()).showDirect) {
                ((ConcurrentLinkedQueue) this.b).add(xadVar);
                l();
            } else {
                ((ConcurrentLinkedQueue) this.f21211a).add(xadVar);
                this.f.post(new a());
            }
            return true;
        }
    }

    public final boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d83067a8", new Object[]{this})).booleanValue();
        }
        boolean isEmpty = this.c.isEmpty();
        boolean z = true ^ isEmpty;
        if (!isEmpty) {
            ConcurrentLinkedQueue concurrentLinkedQueue = null;
            for (kgm kgmVar : this.c) {
                if (!kgmVar.a()) {
                    if (concurrentLinkedQueue == null) {
                        concurrentLinkedQueue = new ConcurrentLinkedQueue();
                    }
                    concurrentLinkedQueue.add(kgmVar);
                } else {
                    j(kgmVar.f22654a);
                }
            }
            if (concurrentLinkedQueue == null || concurrentLinkedQueue.isEmpty()) {
                this.c.clear();
                return false;
            }
            this.c = concurrentLinkedQueue;
        }
        return z;
    }

    public final boolean e(xad xadVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("da066db8", new Object[]{this, xadVar})).booleanValue();
        }
        if (xadVar == null) {
            return false;
        }
        if (((ConcurrentLinkedQueue) this.b).contains(xadVar) || ((ConcurrentLinkedQueue) this.f21211a).contains(xadVar)) {
            return true;
        }
        return false;
    }

    public final xad f(xad xadVar, xad xadVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xad) ipChange.ipc$dispatch("bf2f022f", new Object[]{this, xadVar, xadVar2});
        }
        if (xadVar == xadVar2) {
            return xadVar;
        }
        if (xadVar == null || xadVar.isShown()) {
            return xadVar2;
        }
        if (xadVar2 == null || xadVar2.isShown()) {
            return xadVar;
        }
        if (this.d.a(this.e).compare(xadVar.o(), xadVar2.o()) >= 0) {
            return xadVar;
        }
        return xadVar2;
    }

    public final xad g(PopStrategyGroup popStrategyGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xad) ipChange.ipc$dispatch("8e9b65a8", new Object[]{this, popStrategyGroup});
        }
        if (!((ConcurrentLinkedQueue) this.b).isEmpty()) {
            return (xad) ((ConcurrentLinkedQueue) this.b).iterator().next();
        }
        if (!this.h) {
            this.h = true;
            if (!popStrategyGroup.isFirstShowFinish) {
                this.f.sendEmptyMessageDelayed(17, popStrategyGroup.showFirstTimeout);
            }
            this.f.sendEmptyMessageDelayed(18, 1000L);
        }
        xad xadVar = null;
        if (((ConcurrentLinkedQueue) this.f21211a).isEmpty()) {
            return null;
        }
        Iterator it = ((ConcurrentLinkedQueue) this.f21211a).iterator();
        while (it.hasNext()) {
            xad xadVar2 = (xad) it.next();
            if (xadVar == null) {
                xadVar = xadVar2;
            } else {
                xadVar = f(xadVar, xadVar2);
            }
        }
        if (!xadVar.isShown()) {
            return xadVar;
        }
        a(xadVar);
        return g(popStrategyGroup);
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("282a8c1d", new Object[]{this, message})).booleanValue();
        }
        int i2 = message.what;
        if (i2 == 17) {
            PopStrategyGroup a2 = this.d.a(this.e);
            if (a2 != null && !a2.isFirstShowFinish) {
                a2.isFirstShowFinish = true;
                if (this.g) {
                    l();
                }
            }
        } else if (i2 == 18) {
            start();
        }
        return false;
    }

    public final boolean j(xad xadVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("23cd5db3", new Object[]{this, xadVar})).booleanValue();
        }
        if (xadVar == null) {
            return false;
        }
        this.c.remove(new kgm(xadVar, 0L));
        if (((ConcurrentLinkedQueue) this.b).remove(xadVar) || ((ConcurrentLinkedQueue) this.f21211a).remove(xadVar)) {
            return true;
        }
        return false;
    }

    public final void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfe0812", new Object[]{this});
        } else if (!this.c.isEmpty()) {
            for (kgm kgmVar : this.c) {
                kgmVar.b = System.currentTimeMillis();
            }
        }
    }

    public final synchronized void l() {
        PopStrategyGroup a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebbb9904", new Object[]{this});
        } else if (i) {
            if (this.g) {
                mad madVar = this.d;
                if (!(madVar == null || (a2 = madVar.a(this.e)) == null)) {
                    if (d()) {
                        Objects.toString(this.c);
                        return;
                    }
                    xad g = g(a2);
                    if (g == null) {
                        Objects.toString(this.c);
                        return;
                    }
                    g.o();
                    Objects.toString(this.c);
                    PopStrategy strategyByIdentifier = a2.getStrategyByIdentifier(g.o());
                    if (!a2.isFirstShowFinish && !strategyByIdentifier.showDirect && !strategyByIdentifier.firstShow) {
                        return;
                    }
                    if (i || strategyByIdentifier.showDirect) {
                        g.o();
                        this.c.add(new kgm(g, System.currentTimeMillis()));
                        g.show();
                        i(g, this.e);
                    }
                }
            }
        }
    }

    @Override // tb.jad
    public void resume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("deb96e34", new Object[]{this});
        } else if (!this.g) {
            this.g = true;
            k();
            mad madVar = this.d;
            if (madVar != null && madVar.a(this.e) != null) {
                l();
            }
        }
    }

    @Override // tb.jad
    public void start() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
        } else if (!i) {
            i = true;
            l();
        }
    }

    @Override // tb.jad
    public void pause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
        } else if (this.g) {
            this.g = false;
            Queue<kgm> queue = this.c;
            if (queue != null && queue.size() > 0) {
                for (kgm kgmVar : this.c) {
                    xad xadVar = kgmVar.f22654a;
                    if (xadVar != null) {
                        a(xadVar);
                    }
                }
                this.c.clear();
            }
            StringBuilder sb = new StringBuilder("pause page:");
            sb.append(this.e);
            sb.append(", isActive:");
            sb.append(this.g);
        }
    }
}
